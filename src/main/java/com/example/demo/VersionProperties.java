package com.example.demo;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:version.yml")
@Getter
public class VersionProperties {

    @Value("${version.gradle-version}")
    private String gradleVersion;

    @Value("${version.springVersion}")
    private String springVersion;
}
