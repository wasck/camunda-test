package de.wasck.test.camundatest.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSourceConfiguration {
  @Value("${datasource.url}")
  private String dataSourceUrl;
  
  @Value("${datasource.username}")
  private String dataSourceUsername;
  
  @Value("${datasource.password}")
  private String dataSourcePassword;
  
  @Bean
  public DataSource getDataSource() {
    DataSourceBuilder<?> dataSourceBuilder = DataSourceBuilder.create();
    dataSourceBuilder.driverClassName("org.postgresql.Driver");
    dataSourceBuilder.url(this.dataSourceUrl);
    dataSourceBuilder.username(this.dataSourceUsername);
    dataSourceBuilder.password(this.dataSourcePassword);
    
    return dataSourceBuilder.build();
  }
}
