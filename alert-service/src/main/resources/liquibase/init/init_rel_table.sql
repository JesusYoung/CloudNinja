
create table if not exists `template_metrics_rel`
(
    id            varchar(255)    not null primary key comment '主键',
    template_id   varchar(255)  null comment '告警规则模板ID',
    metrics_id    varchar(255)  null comment '告警指标规则ID'
)
    comment '规则模板-指标规则关联关系表'
    collate = utf8_bin;