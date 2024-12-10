package cn.com.yangshj.monitor.service.database;

import java.util.Map;

/**
 * @author Jorge Young
 * @since 2024/12/10 09:53
 */
public interface IDatabaseService {

    void testDBConnection();

    Map<String, Object> getBBTables();
}
