insert into cloud_ninja_oauth.oauth_client_details
    (client_id, resource_ids, client_secret, scope, authorized_grant_types, web_server_redirect_uri, authorities,
     access_token_validity, refresh_token_validity, additional_information, autoapprove)
    values ('cloud_ninja_client', 'default', '$2a$10$Curuj0GAmZFdUvz.t4OYm.bHcymJRNAbhBXJ7e4uis/7Mm/PfpcNu', 'all',
            'password,authorization_code,refresh_token', 'http://example.com', null, 86400, 86400, null, 'default');
