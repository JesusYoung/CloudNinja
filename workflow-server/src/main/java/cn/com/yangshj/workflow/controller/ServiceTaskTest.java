package cn.com.yangshj.workflow.controller;

import lombok.extern.slf4j.Slf4j;
import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;

/**
 * Create by yangshj on 4/23/22
 */
@Slf4j
public class ServiceTaskTest implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) {


        log.info("ServiceTask1 start.........");


        execution.setVariable("param1", "aaaa");
        execution.setVariable("param2", 2);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        log.info("ServiceTask1 end.");
    }
}
