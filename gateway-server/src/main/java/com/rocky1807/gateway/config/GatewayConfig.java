package com.rocky1807.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * wenhui.xiang
 * 2023/09/12 6:13 下午
 */


@Configuration
public class GatewayConfig {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routers = routeLocatorBuilder.routes();

        routers.route("consumer",
                r -> r.path("/c")
                        .uri("lb://consumer-service")).build();
        return routers.build();
    }
}
