package com.training.profile;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


@Profile("Production")
@Configuration
public class ProdDatabaseConfig implements DataBaseConfig{
    @Bean
	@Override
	public DataSource createDataSource() {
		 System.out.println("creating production datasource instance.");
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		
		
		
		
		return dataSource;
	}

	
}
