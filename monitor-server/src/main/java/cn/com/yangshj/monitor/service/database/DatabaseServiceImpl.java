package cn.com.yangshj.monitor.service.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.exception.ExceptionUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

/**
 * @author Jorge Young
 * @since 2024/12/10 09:54
 */
@Slf4j
@Service
public class DatabaseServiceImpl implements IDatabaseService {



    @Override
    public void testDBConnection() {

        Connection connection = null;

        try {
            connection = getConnection();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException var9) {
                var9.printStackTrace();
            }
        }

        log.info("连接成功");

    }

    @Override
    public Map<String, Object> getBBTables() {
        return getTables();
    }


    private Connection getConnection() {
        try {
//            Class.forName("com.p6spy.engine.spy.P6SpyDriver");
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(
//                    "jdbc:p6spy:mysql://172.16.191.67:30306/dataroom?allowMultiQueries=true&useUnicode=true&characterEncoding=UTF-8&useSSL=false&serverTimezone=Asia/Shanghai&rewriteBatchedStatements=true&nullCatalogMeansCurrent=true",
                    "jdbc:mysql://localhost:3306/ninja_monitor?useUnicode=true&characterEncoding=utf-8&useSSL=false&useInformationSchema=true&remarks=true&serverTimezone=Asia/Shanghai",
                    "root", "root");
        } catch (SQLSyntaxErrorException e) {
            log.error("数据库不存在");
            log.error(ExceptionUtils.getStackTrace(e));
            return null;
        } catch (Exception e) {
            log.error(ExceptionUtils.getStackTrace(e));
            return null;
        }
    }

    private Map<String, Object> getTables() {
        Connection connection = getConnection();
        if (ObjectUtils.isEmpty(connection)) {
            return null;
        }

        Map<String, Object> resultMap = new HashMap<>();
        List<Map<String, Object>> data = Lists.newArrayList();
        List<Map<String, Object>> structure = Lists.newArrayList();
        resultMap.put("data", data);
        resultMap.put("structure", structure);

        try {
            PreparedStatement ps = connection.prepareStatement("show tables");
            ResultSet clickRs = ps.executeQuery();
            ResultSetMetaData metaData = clickRs.getMetaData();
            int columnCount = metaData.getColumnCount();

            for(int i = 1; i <= columnCount; ++i) {
                Map<String, Object> structureMap = new ConcurrentHashMap();
                structureMap.put("fieldName", metaData.getColumnName(i));
                structureMap.put("fieldType", metaData.getColumnTypeName(i));
                structure.add(structureMap);
            }

            while(clickRs.next()) {
                Map<String, Object> map = new HashMap(columnCount);

                for(int i = 1; i <= columnCount; ++i) {
                    map.put(metaData.getColumnName(i), clickRs.getObject(i));
                }

                data.add(map);
            }

            return resultMap;
        } catch (Exception var19) {
            log.error("数据查询失败:{}", ExceptionUtils.getStackTrace(var19));
//            throw new GlobalException("数据查询失败" + var19.getMessage());
            return null;
        } finally {
            try {
                connection.close();
            } catch (SQLException var18) {
                log.error("数据源连接关闭异常,{}", var18.getMessage());
            }

        }
    }

}
