//package cn.com.yangshj.workflow.controller;
//
//import lombok.extern.slf4j.Slf4j;
//import org.activiti.engine.delegate.DelegateExecution;
//import org.activiti.engine.delegate.JavaDelegate;
//
///**
// * Create by yangshj on 4/24/22
// */
//@Slf4j
//public class ServiceTask2 implements JavaDelegate {
//
//    @Override
//    public void execute(DelegateExecution execution) {
//
//
//        log.info("ServiceTask2 start.........");
//
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        log.info("param1: {}", execution.getVariable("param1"));
//        log.info("param2: {}", execution.getVariable("param2"));
//
//        log.info("ServiceTask2 end.");
//    }
//}
