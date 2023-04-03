create table if not exists `oauth_approvals`
(
    userId         varchar(256) null,
    clientId       varchar(256) null,
    scope          varchar(256) null,
    status         varchar(10)  null,
    expiresAt      timestamp    null,
    lastModifiedAt timestamp    null
) comment '授权批准状态表' collate = utf8_bin;

create table if not exists `oauth_client_details`
(
    client_id               varchar(255)  not null
        primary key,
    resource_ids            varchar(255)  null,
    client_secret           varchar(255)  null,
    scope                   varchar(255)  null,
    authorized_grant_types  varchar(255)  null,
    web_server_redirect_uri varchar(255)  null,
    authorities             varchar(255)  null,
    access_token_validity   int(11)       null,
    refresh_token_validity  int(11)       null,
    additional_information  varchar(4096) null,
    autoapprove             varchar(255)  null
) comment 'OAuth客户端表' collate = utf8_bin;

create table if not exists `oauth_code`
(
    code           varchar(256) null,
    authentication blob         null
) comment '授权码表' collate = utf8_bin;