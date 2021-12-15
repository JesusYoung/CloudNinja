package cn.com.yangshj.monitor.service.impl;

import javax.annotation.Resource;
import java.util.List;

import cn.com.yangshj.monitor.mapper.TestMapper;
import cn.com.yangshj.monitor.service.ITestService;
import cn.com.yangshj.monitor.test.TestTableData;
import org.springframework.stereotype.Service;

/**
 * Create by yangshijie on 2021-12-01
 */
@Service
public class TestServiceImpl implements ITestService {

    @Resource
    private TestMapper testMapper;

    @Override
    public List<TestTableData> queryList() {
        return this.testMapper.queryList();
    }
}
