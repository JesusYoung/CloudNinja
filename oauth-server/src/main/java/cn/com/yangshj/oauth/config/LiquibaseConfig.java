package cn.com.yangshj.oauth.config;


import javax.sql.DataSource;

import liquibase.integration.spring.SpringLiquibase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Liquibase数据库管理
 *
 * @author yangshj
 * @since 2023/3/21 16:17
 */
@Configuration
public class LiquibaseConfig {

    @Bean
    public SpringLiquibase liquibase(DataSource dataSource) {
        SpringLiquibase liquibase = new SpringLiquibase();
        liquibase.setDataSource(dataSource);
        liquibase.setChangeLog("classpath:liquibase/master.xml");
        liquibase.setShouldRun(true);
        return liquibase;
    }
}
