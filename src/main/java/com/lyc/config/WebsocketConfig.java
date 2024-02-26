package com.itheima.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * @version v1.0
 * @ClassName: WebsocketConfig
 * @Description: Spring提供的配置类，用于去扫描添加有@ServerEndpoint注解的Bean，加上注解Tomcat才可识别
 * @Author: lyc
 */
@Configuration
public class WebsocketConfig {

    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        //将方法的返回值交给Spring管理，把其存储在Spring的IOC容器里
        return new ServerEndpointExporter();
    }
}
