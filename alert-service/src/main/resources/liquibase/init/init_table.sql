create table if not exists `alert_record`
(
    id                 varchar(255)    not null primary key comment '主键',
    name               varchar(255)  null comment '告警名称',
    platform_id        varchar(255)  null comment '业务平台ID',
    resource_id        varchar(255)  null comment '资源实例ID',
    level              varchar(255)  null comment '告警级别',
    fingerprint        varchar(255)  null comment '告警指纹，AlertManager唯一标识',
    start_time         datetime      null comment '首次发生时间',
    end_time           datetime      null comment '最后发生时间',
    recovery_time      datetime      null comment '告警恢复时间',
    alert_count        int           null comment '告警次数',
    status             varchar(255)  null comment '状态',
    order_status       varchar(255)  null comment '派单状态'
    order_id           varchar(255)  null comment '工单ID'
    notification_user  varchar(255)  null comment '通知人',
    description        varchar(255)  null comment '详情',
    create_by          int           null comment '创建人',
    create_time        datetime      null comment '创建时间',
    update_by          int           null comment '更新人',
    update_time        datetime      null comment '更新时间',
    is_deleted         tinyint(1)    default 0 not null
)
    comment '告警记录表'
    collate = utf8_bin;