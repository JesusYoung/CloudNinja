package cn.com.yangshj.monitor.service.impl;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import cn.com.yangshj.monitor.mapper.TestMapper;
import cn.com.yangshj.monitor.service.ITestService;
import cn.com.yangshj.monitor.test.TestTableData;
import org.redisson.Redisson;
import org.redisson.api.RLock;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * Create by yangshijie on 2021-12-01
 */
@Service
public class TestServiceImpl implements ITestService {

    @Resource
    private TestMapper testMapper;
    @Resource
    private Redisson redisson;

    @Override
    public List<TestTableData> queryList() {
        return this.testMapper.queryList();
    }

    /**
     * 测试Redisson锁
     *    1、记录中同一个parentId下version为递增值，
     *    2、通过锁控制version的递增；
     *    3、测试并发下，能否获取到锁
     *    4、以及获取不到锁的情况；
     *
     *
     */
    @Override
    public void test() {

        String id = "aaa";

//        new Thread(() -> handleTest(id)).start();
//        new Thread(() -> handleTest(id)).start();
//        new Thread(() -> handleTest(id)).start();
//
//        for (int i = 0; i < 1000; i++) {
//            new Thread(() -> handleTest(id)).start();
//        }


        new Thread(() -> testGetLock(id, -2)).start();
        new Thread(() -> testGetLock(id, 10)).start();
    }


    private void handleTest(String id) {

        RLock rLock = this.redisson.getLock(id);
        try {
            rLock.lock();

            System.out.println("ThreadName: " + Thread.currentThread().getName());

            long version = 0L;
            // 查询parentId为1的最大版本号
            TestTableData preData = this.testMapper.findMaxVersionByParentId(1L);
            if (null != preData) {
                version = preData.getVersion() + 1;
            }

            TestTableData testTableData = new TestTableData();
            testTableData.setId(System.currentTimeMillis());
            testTableData.setName("aaa");
            testTableData.setParentId(1L);
            testTableData.setVersion(version);
            testTableData.setCreateBy(1L);
            testTableData.setCreateTime(new Date());
            this.testMapper.save(testTableData);

            Thread.sleep(500);

            System.out.println("version: " + version);

        } catch (Exception e) {
            System.out.println("e: " + e.getStackTrace().toString());
            System.out.println("e1: " + e.getMessage());
            System.out.println("e2: " + e.toString());
        } finally {
            rLock.unlock();
        }

    }

    private void testGetLock(String key, int num) {
        RLock rLock = this.redisson.getLock(key);
        try {
            rLock.lock(1, TimeUnit.MINUTES);

            if (num < 0) {
                System.out.println("小于0时，是否有锁：" + rLock.isLocked());
                System.out.println("小于0时，是否当前线程锁：" + rLock.isHeldByCurrentThread());
                rLock.unlock();
                System.out.println("小于0时解锁后，是否有锁：" + rLock.isLocked());
                System.out.println("小于0时解锁后，是否当前线程锁：" + rLock.isHeldByCurrentThread());
                throw new RuntimeException("aaaaa");
            }

            Thread.sleep(1000);

        } catch (Exception e) {
            if (rLock.isLocked()) {
                System.out.println("捕获异常时持有锁");
                System.out.println("捕获异常时持是否当前线程锁： " + rLock.isHeldByCurrentThread());
                rLock.unlock();
            } else {
                System.out.println("捕获异常时持有锁");
                System.out.println("捕获异常时持是否当前线程锁： " + rLock.isHeldByCurrentThread());
            }
            System.out.println("e: " + e.getMessage());
            System.out.println("e: " + e.toString());
        } finally {
            if (rLock.isLocked()) {
                System.out.println("finally时有锁");
                System.out.println("finally时持是否当前线程锁： " + rLock.isHeldByCurrentThread());
                rLock.unlock();
            } else {
                System.out.println("finally时有锁");
                System.out.println("finally时是否当前线程锁： " + rLock.isHeldByCurrentThread());
            }
        }
    }

}
