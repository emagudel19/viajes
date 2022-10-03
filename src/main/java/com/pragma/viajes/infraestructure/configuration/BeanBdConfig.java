package com.pragma.viajes.infraestructure.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;

@Configuration
public class BeanBdConfig {


    @Value("${spring.datasource.driver-class-name}")
    private String driver;

    @Value("${spring.datasource.url}")
    private String url;

    @Value("${spring.datasource.username}")
    private String userName;

    @Value("${spring.datasource.password}")
    private String password;

    @Bean
    public Connection connectionBd() {

        Connection con = null;
        try {
            con = DriverManager.getConnection(url, userName, password);
            if (con != null) {
                System.out.println("Database connection is successful !!!!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        return con;
    }
}
