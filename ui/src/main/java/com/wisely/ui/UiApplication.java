package com.wisely.ui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;

@SpringBootApplication
//@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients //1
@EnableCircuitBreaker //2
@EnableZuulProxy //3
public class UiApplication {
	public static void main(String[] args) {
        SpringApplication.run(UiApplication.class, args);
    }
	
	@Bean
	public ServletRegistrationBean<HystrixMetricsStreamServlet> setServlet() {
		HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
		ServletRegistrationBean<HystrixMetricsStreamServlet> registrationBean = new ServletRegistrationBean<HystrixMetricsStreamServlet>(streamServlet);
		registrationBean.setLoadOnStartup(1);
		//registrationBean.addUrlMappings("/actuator/hystrix.stream");
		registrationBean.addUrlMappings("/hystrix.stream");
		registrationBean.setName("HystrixMetricsStreamServlet");
		return registrationBean;
	}
}
