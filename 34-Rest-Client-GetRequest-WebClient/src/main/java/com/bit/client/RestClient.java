package com.bit.client;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import ch.qos.logback.core.db.dialect.MySQLDialect;
import reactor.core.Disposable;
import reactor.core.publisher.Mono;
@Component
public class RestClient {
	private static final String uri="http://localhost:8683/demo/welcomeAll";

	public void acessRestApiSync() {
		System.out.println("*****Printing Sync API ***********");
		WebClient client=WebClient.create();
		String response = client.get()
								  .uri(uri)
								  .retrieve()
								  .bodyToMono(String.class)
								  .block();
		
		System.out.println(response);
		System.out.println("*****Printed  Sync API ***********");
	}
	
	public void acessRestApiAsync() {
		System.out.println("*****Printing Async API ***********");
		WebClient client=WebClient.create();
					 client.get()
								  .uri(uri)
								  .retrieve()
								  .bodyToMono(String.class)
								  .subscribe(RestClient::handelResponse);
		
		System.out.println("*****Printed  Async API ***********");
	}
	public static void handelResponse(String response) {
		System.out.println(response);
		
	}
}
