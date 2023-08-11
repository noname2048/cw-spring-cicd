package com.example.demo;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:version-info.yml")
@Getter
public class AppInfo {

    @Value("${app.gradle-version}")
    private String gradleVersion;

    @Value("${app.springVersion}")
    private String springVersion;
}
