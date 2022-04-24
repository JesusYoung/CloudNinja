

create table if not exists system_operation_access_record
(
    id       varchar(36)  primary key,
    function_module  varchar(255)  null  comment '功能模块名称',
    remote_ip   varchar(32)  null  comment '远程IP',
    request_url varchar(255) null  comment '请求URL',
    requst_method varchar(8)  null  comment '请求方式',
    class_method  varchar(255)   null  comment '请求类名',
    class_method_params json  null  comment '请求参数',
    result varchar(8) null comment '访问结果',
    return_message json null comment '返回结果',
    request_time bigint  null comment '请求时间',
    create_time bigint null comment '创建时间',
    description varchar(255) null comment '描述'
)
    comment '系统操作访问记录表' collate = utf8_bin;


create table if not exists process_log_record
(
    id              varchar(36)    primary  key,
    process_id      varchar(36)    not null comment '流程ID',
    process_name    varchar(255)   null comment '流程名称',
    process_type    varchar(16)    not null comment '流程类型',
    process_version varchar(16)    not null comment '流程版本',
    operator_id     varchar(36)    null comment '操作人ID',
    operator_name   varchar(255)   null comment '操作人姓名',
    remote_ip       varchar(32)    null comment '远程IP',
    operate_type    varchar(32)    not null comment '操作类型',
    operate_time    bigint         not null comment '操作时间',
    operate_result  varchar(16)    null comment '操作结果',
    create_time     bigint         not null comment '创建时间',
    description     varchar(255)   null comment '描述'
)
    comment '流程日志记录表' collate = utf8_bin;


create table if not exists task_log_record
(
    id     varchar(36)   primary key,
    task_id    varchar(36)   not null comment '任务ID',
    task_name  varchar(255)  null comment '任务名称',
    process_instance_id    varchar(36)     null comment '流程实例ID',
    process_instance_name  varchar(255)    null comment '流程实例名称',
    taks_type  varchar(16)  null comment '任务类型',
    task_items varchar(255) null comment '条目',
    operator_id  varchar(36)  null comment '操作人ID',
    operator_name varchar(255) null comment '操作人姓名',
    exec_status varchar(16)  null comment '执行状态',
    exec_result varchar(16)  null comment '执行结果',
    start_time  bigint   null comment '开始时间',
    end_time bigint  null comment '结束时间',
    create_time  bigint  null comment '创建时间',
    description  varchar(255)  null comment '描述'
)
    comment '任务日志记录表' collate = utf8_bin;


create table if not exists third_party_log
(
    id       varchar(36)      primary key,
    task_id  varchar(36)     null comment '任务ID',
    task_name varchar(255)   null comment '任务名称',
    task_item_id  varchar(255)  null comment '任务条目ID',
    process_instance_id  varchar(36)   null comment '流程实例ID',
    process_instance_name varchar(255)  null comment '流程实例名称',
    path  varchar(255)   null comment '日志路径',
    start_time  bigint   null comment '开始时间',
    end_time  bigint  null comment '结束时间',
    create_time   bigint  null  comment '创建时间'
)
    comment '第三方日志记录表' collate = utf8_bin;












# 接口设计

# 系统操作/访问日志接口
    - 分页查询系统操作/访问日志     /api/v1/system_log      GET
    - 查询系统操作/访问日志详情     /api/v1/system_log/id   GET
    - 新增系统操作/访问日志        /api/v1/system_log       POST
    - 删除系统操作/访问日志(开发阶段使用)   /api/v1/system_log/id    DELETE


# 流程日志接口
    - 分页查询流程日志接口    /api/v1/process     GET
    - 查询流程日志详情        /api/v1/process/id  GET
    - 新增流程日志           /api/v1/process     POST
    - 删除流程日志(开发阶段使用)  /api/v1/process/id   DELETE


# 任务日志接口
    - 分页查询任务日志          /api/v1/task     GET
    - 查询任务日志详情          /api/v1/task/id   GET
    - 新增任务日志             /api/v1/task      POST
    - 删除任务日志(开发阶段使用)  /api/v1/task/id  DELETE


# 第三方日志接口
    - 分页查询第三方日志        /api/v1/third_log    GET
    - 查询第三方日志内容详情    /api/v1/third_log/id  GET
    - 新增第三方日志           /api/v1/third_log     POST
    - 删除第三方日志(开发阶段使用)   /api/v1/third_log/id   DELETE
    - 前端WebSocket连接接口
    - 请求当前会话日志接口