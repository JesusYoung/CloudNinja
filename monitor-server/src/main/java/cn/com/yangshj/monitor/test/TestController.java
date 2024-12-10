package cn.com.yangshj.monitor.test;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

import cn.com.yangshj.monitor.service.ITestService;
import cn.com.yangshj.monitor.service.database.IDatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试
 *
 * Create by yangshijie on 2021-12-01
 */
@RestController
@RequestMapping("/api/v1/test")
public class TestController {

    @Autowired
    private ITestService testService;

    @Resource
    private IDatabaseService databaseService;

    @GetMapping("/test")
    public List<TestTableData> test() {
        return this.testService.queryList();
    }

    @GetMapping("/test2")
    public void test2() {
        this.testService.test();
    }


    @GetMapping("/check/db")
    public void testDBConnection() {
        this.databaseService.testDBConnection();
    }

    @GetMapping("/db/tables")
    public Map<String, Object> getTable() {
        return this.databaseService.getBBTables();
    }
}
