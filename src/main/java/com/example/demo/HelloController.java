package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @Value("${spring.profiles.active}")
    private String activatedProfile;

    private final CustomProperties customProperties;

    private final AppInfo appinfo;

    @Autowired
    public HelloController(CustomProperties customProperties, AppInfo appinfo) {
        this.customProperties = customProperties;
        this.appinfo = appinfo;
    }

    @GetMapping("/")
    @ResponseBody
    public String root() {
        return "<h1>Hello<h1>";
    }

    @GetMapping("/health")
    public String health(Model model) {
        model.addAttribute("activatedProfile", this.activatedProfile);
        model.addAttribute("springVersion", appinfo.getSpringVersion());
        model.addAttribute("gradleVersion", appinfo.getGradleVersion());
        model.addAttribute("customEnv", customProperties.getHello());
        return "health";
    }
}
