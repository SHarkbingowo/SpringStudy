package com.spring.study.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.spring.study")
@PropertySource("jdbc.properties")
@Import({MybatiesConfig.class, JdbcConfig.class})
public class SpringConfig {
}
