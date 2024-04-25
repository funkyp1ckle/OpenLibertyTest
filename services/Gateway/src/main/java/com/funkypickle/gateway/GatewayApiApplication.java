package com.funkypickle.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

import org.springframework.cloud.gateway.route.RouteLocator;

@SpringBootApplication
public class GatewayApiApplication {

	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
		return builder.routes()
				.route("device", r -> r.path("/device/**")
						.filters(f -> f.stripPrefix(1))
						.uri("lb://DEVICE-DATA-SERVICE"))
				.build();
	}

	public static void main(String[] args) {
		SpringApplication.run(GatewayApiApplication.class, args);
	}

}
