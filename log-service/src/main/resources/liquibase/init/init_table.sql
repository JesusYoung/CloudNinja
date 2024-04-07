create table if not exists `system_log`
(
    id             varchar(36)          not null primary key,
    module_name    varchar(128)         null comment '业务模块名称',
    operation      varchar(255)         null comment '执行操作',
    request_id     bigint               null comment '请求ID',
    remote_ip      varchar(36)          null comment '远程IP',
    remote_ua      bigint               null comment '远程UA',
    request_url    bigint               null comment '请求URL',
    request_method bigint               null comment '请求方式',
    create_by      varchar(128)         null comment '操作人ID',
    create_by_name varchar(36)          null comment '操作人账号',
    create_time    varchar(36)          null comment '操作时间',
    request_params varchar(255)         null comment '操作参数',
    return_data    varchar(36)          null comment '操作结果',
    return_result  varchar(36)          null comment '返回状态',

    is_deleted     tinyint(1) default 0 null comment '是否删除 0:未删除  1:已删除'
) comment '系统日志表' collate = utf8_bin;