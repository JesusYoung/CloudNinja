package cn.com.yangshj.workflow;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.repository.Deployment;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Create by yangshijie on 2/16/22
 */
public class Test {

    /**
     * 部署流程定义
     */
    @org.junit.Test
    public void testDeployment() {
        // 创建ProcessEngine
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        // 得到RepositoryService实例
        RepositoryService repositoryService = processEngine.getRepositoryService();
        // 使用RepositoryService实例进行部署
        Deployment deployment = repositoryService.createDeployment()
                .addClasspathResource("bpmn/first_test.bpmn")
                .addClasspathResource("bpmn/first_test.png")
                .name("员工请假流程")
                .deploy();
        System.out.println("流程部署Id = " + deployment.getId());
        System.out.println("流程部署name = " + deployment.getName());
    }
}
