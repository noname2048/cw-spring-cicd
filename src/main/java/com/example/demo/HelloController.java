package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    private final AppProperties appProperties;

    private final VersionProperties versionProperties;

    @Autowired
    public HelloController(AppProperties appProperties,
                           VersionProperties versionProperties) {
        this.appProperties = appProperties;
        this.versionProperties = versionProperties;
    }

    @GetMapping("/")
    @ResponseBody
    public String root() {
        return "<h1>Hello<h1>";
    }

    @GetMapping("/health")
    public String health(Model model) {
        model.addAttribute("env", this.appProperties.getEnv());
        model.addAttribute("springVersion", versionProperties.getSpringVersion());
        model.addAttribute("springBootVersion", versionProperties.getSpringVersion());
        model.addAttribute("gradleVersion", versionProperties.getGradleVersion());
        model.addAttribute("customEnv", appProperties.getHello());
        return "health";
    }
}
