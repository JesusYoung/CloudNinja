package cn.com.yangshj.monitor.mapper;

import java.util.List;

import cn.com.yangshj.monitor.test.TestTableData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Create by yangshijie on 2021-12-01
 */
@Mapper
public interface TestMapper {

    List<TestTableData> queryList();

    TestTableData findById(@Param("id") Long id);

    TestTableData findMaxVersionByParentId(@Param("parentId") Long parentId);

    void save(@Param("testTableData") TestTableData testTableData);
}
