package cn.com.yangshj.monitor.mapper;

import java.util.List;

import cn.com.yangshj.monitor.test.TestTableData;
import org.apache.ibatis.annotations.Mapper;

/**
 * Create by yangshijie on 2021-12-01
 */
@Mapper
public interface TestMapper {

    List<TestTableData> queryList();
}
