package cn.com.yangshj.workflow.controller;

import java.util.List;

import org.activiti.engine.*;
import org.activiti.engine.history.HistoricActivityInstance;
import org.activiti.engine.history.HistoricActivityInstanceQuery;
import org.activiti.engine.repository.ProcessDefinition;
import org.activiti.engine.repository.ProcessDefinitionQuery;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;
import org.springframework.web.bind.annotation.*;

/**
 * Create by yangshijie on 2/16/22
 */
@RestController
@RequestMapping("/api/v1/process")
public class ProcessManageController {

    /**
     * 启动流程
     */
    @PostMapping("/start")
    public void startProcess() {
        // 创建ProcessEngine
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        // 获取RunTimeService
        RuntimeService runtimeService = processEngine.getRuntimeService();
        // 根据流程定义ID启动流程
        ProcessInstance instance = runtimeService.startProcessInstanceByKey("myProcess_2");

        System.out.println("流程定义id=" + instance.getProcessDefinitionId());
        System.out.println("流程实例id=" + instance.getId());
        System.out.println("当前活动Id=" + instance.getActivityId());
    }


    /**
     * 查询任务
     *
     * @param processName 任务key
     * @param name 当前处理人
     */
    @GetMapping("/queryTask")
    public void queryTaskList(@RequestParam("process") String processName, @RequestParam("name") String name) {
        // 创建ProcessEngine
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        // 创建TaskService
        TaskService taskService = processEngine.getTaskService();
        // 根据流程key和任务负责人id查询任务
        // 注意Task引入的是：org.activiti.engine.task.Task
        List<Task> taskList = taskService.createTaskQuery()
                .processDefinitionKey(processName)
                .taskAssignee(name)
                .list();

        for (Task task : taskList) {
            System.out.println("流程实例id = " + task.getProcessInstanceId());
            System.out.println("任务id = " + task.getId());
            System.out.println("任务负责人 = " + task.getAssignee());
            System.out.println("任务名称 = " + task.getName());
        }
    }


    /**
     * 完成任务
     *
     * @param processName 任务key
     * @param name 处理人
     */
    @GetMapping("/complete")
    public void completeTask(@RequestParam("process") String processName, @RequestParam("name") String name) {
        // 创建ProcessEngine
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        // 创建TaskService实例
        TaskService taskService = processEngine.getTaskService();
        // 根据流程key和负责人id查询任务
        Task task = taskService.createTaskQuery()
                .processDefinitionKey(processName)//流程定义的key
                .taskAssignee(name)//要查询的负责人
                .singleResult();

        taskService.complete(task.getId());
    }


    /**
     * 查询所有流程定义
     */
    @GetMapping("/queryAllProcess")
    public void queryAllProcessDefinition(@RequestParam("process") String processName){
        // 创建ProcessEngine
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        // 获取RepositoryService实例
        RepositoryService service = processEngine.getRepositoryService();
        // 得到ProcessDefinitionQuery实例
        ProcessDefinitionQuery query = service.createProcessDefinitionQuery();
        // 查询
        List<ProcessDefinition> list = query
                .processDefinitionKey(processName) // 增加流程定义的key为条件
                .orderByProcessDefinitionVersion() // 版本倒序排
                .desc()
                .list();
        // 输出信息
        for (ProcessDefinition processDefinition : list) {
            System.out.println("流程定义 id = " + processDefinition.getId());
            System.out.println("流程定义 name = " + processDefinition.getName());
            System.out.println("流程定义 key = " + processDefinition.getKey());
            System.out.println("流程定义 Version = " + processDefinition.getVersion());
            System.out.println("流程部署ID = " + processDefinition.getDeploymentId());
        }
    }


    @GetMapping("/delete")
    public void deleteProcess() {
        // 创建ProcessEngine
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        // 通过流程引擎获取repositoryService
        RepositoryService service = processEngine.getRepositoryService();
        // 删除流程定义，如果该流程定义已经有流程实例启动，则删除出错
        // 设置true 级联删除流程定义，即使该流程有流程实例启动也可以删除，设置为false非级别删除方式
        // TODO 第一个参数未明确
        service.deleteDeployment("1", false);
    }

    /**
     * 查询流程历史信息
     */
    @GetMapping("/history")
    public void findHistoryInfo(@RequestParam("id") String definitionId) {
        // 创建ProcessEngine
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        // 获取HistoryService
        HistoryService historyService = processEngine.getHistoryService();
        // 获取actinst表的查询对象
        HistoricActivityInstanceQuery instanceQuery = historyService.createHistoricActivityInstanceQuery();
        // 查询actinst表，条件：根据InstanceId查询
        // instanceQuery.processInstanceId("2501");
        // 查询actinst表，条件：根据DefinitionId查询
        instanceQuery.processDefinitionId(definitionId);
        // 增加排序操作,orderByHistoricActivityInstanceStartTime 根据开始时间排序 asc 升序
        instanceQuery.orderByHistoricActivityInstanceStartTime().asc();
        // 查询所有内容
        List<HistoricActivityInstance> activityInstanceList = instanceQuery.list();
        // 输出数据
        for (HistoricActivityInstance hi : activityInstanceList) {
            System.out.println(hi.getActivityId());
            System.out.println(hi.getActivityName());
            System.out.println(hi.getProcessDefinitionId());
            System.out.println(hi.getProcessInstanceId());
            System.out.println("--------------------------------------");
        }

    }
}
