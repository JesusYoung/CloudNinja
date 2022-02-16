package cn.com.yangshj.workflow.controller;

import javax.annotation.Resource;

import org.activiti.engine.RepositoryService;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.repository.ProcessDefinition;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by yangshijie on 2/16/22
 */
@RestController
@RequestMapping("/api/v1/test111")
public class TestController {

    @Resource
    private RepositoryService repositoryService;

    @PostMapping("/te")
    public String test() {

        System.out.println("///////////////////////////////");

        Deployment deployment = repositoryService.createDeployment()
                .addClasspathResource("bpmn/first_test.bpmn")
                .addClasspathResource("bpmn/first_test.png")
                .name("")
                .deploy();

        ProcessDefinition processDefinition = repositoryService.createProcessDefinitionQuery()
                .deploymentId(deployment.getId()).singleResult();


        return processDefinition.getId();
    }
}
