package com.aborgatin.hh.vacancy.loader.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = "classpath:application-custom.properties", encoding = "UTF-8")
public class AppProperties {
}
