package com.vladmeh.testTask.config;

import org.jtwig.environment.EnvironmentConfigurationBuilder;
import org.jtwig.render.RenderExtension;
import org.jtwig.spring.JtwigViewResolver;
import org.jtwig.spring.boot.config.JtwigViewResolverConfigurer;
import org.jtwig.web.servlet.JtwigRenderer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
public class JtwigConfig implements JtwigViewResolverConfigurer {
    @Bean
    public ViewResolver viewResolver() {
        return new JtwigViewResolver();
    }

    @Override
    public void configure(JtwigViewResolver viewResolver) {
        viewResolver.setRenderer(new JtwigRenderer(EnvironmentConfigurationBuilder.configuration()
                .extensions().add(new RenderExtension()).and()
                .build()));
        viewResolver.setSuffix(".twig.html");
    }
}