package com.bit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.bit.client.RestClient;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(Application.class, args);
	RestClient bean = ctx.getBean(RestClient.class);
	 bean.invokeRestApi();
	}

}
