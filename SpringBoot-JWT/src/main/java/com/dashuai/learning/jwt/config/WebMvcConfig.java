package com.dashuai.learning.jwt.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    private final CustomHandlerExceptionResolver customHandlerExceptionResolver;

    public WebMvcConfig(CustomHandlerExceptionResolver customHandlerExceptionResolver) {
        this.customHandlerExceptionResolver = customHandlerExceptionResolver;
    }

    @Override
    public void configureHandlerExceptionResolvers(List<HandlerExceptionResolver> resolvers) {
        resolvers.add(customHandlerExceptionResolver);
    }
}
