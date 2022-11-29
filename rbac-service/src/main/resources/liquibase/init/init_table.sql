create table if not exists `user_info`
(
    id           varchar(36)          not null primary key,
    name         varchar(128)         not null comment '用户名',
    phone_number varchar(36)          null comment '电话号码',
    email        varchar(128)         null comment '电子邮件',
    create_by    varchar(36)          null comment '创建人',
    create_time  bigint               null comment '创建时间',
    update_by    varchar(36)          null comment '更新人',
    update_time  bigint               null comment '更新时间',
    is_deleted   tinyint(1) default 0 null comment '是否删除 0-未删除 1-已删除'
) comment '用户信息表' collate = utf8_bin;

create table if not exists `organization`
(
    id           varchar(36)          not null primary key,
    name         varchar(128)         not null comment '组织名称',
    create_by    varchar(36)          null comment '创建人',
    create_time  bigint               null comment '创建时间',
    update_by    varchar(36)          null comment '更新人',
    update_time  bigint               null comment '更新时间',
    is_deleted   tinyint(1) default 0 null comment '是否删除 0-未删除 1-已删除'
) comment '组织结构表' collate = utf8_bin;