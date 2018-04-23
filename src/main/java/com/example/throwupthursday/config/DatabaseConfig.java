package com.example.throwupthursday.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfig {
    @Bean
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }

//    Logger log = LoggerFactory.getLogger(getClass());
//
//    @Bean
//    @Profile("postgres")
//    public DataSource postgresDataSource() {
//        String databaseUrl = System.getenv("DATABASE_URL")
//        log.info("Initializing PostgreSQL database: {}", databaseUrl);
//
//        URI dbUri;
//        try {
//            dbUri = new URI(databaseUrl);
//        }
//        catch (URISyntaxException e) {
//            log.error(String.format("Invalid DATABASE_URL: %s", databaseUrl), e);
//            return null;
//        }
//
//        String username = dbUri.getUserInfo().split(":")[0];
//        String password = dbUri.getUserInfo().split(":")[1];
//        String dbUrl = "jdbc:postgresql://" + dbUri.getHost() + ':'
//                + dbUri.getPort() + dbUri.getPath();
//
//        org.apache.tomcat.jdbc.pool.DataSource dataSource
//                = new org.apache.tomcat.jdbc.pool.DataSource();
//        dataSource.setDriverClassName("org.postgresql.Driver");
//        dataSource.setUrl(dbUrl);
//        dataSource.setUsername(username);
//        dataSource.setPassword(password);
//        dataSource.setTestOnBorrow(true);
//        dataSource.setTestWhileIdle(true);
//        dataSource.setTestOnReturn(true);
//        dataSource.setValidationQuery("SELECT 1");
//        return dataSource;
}
