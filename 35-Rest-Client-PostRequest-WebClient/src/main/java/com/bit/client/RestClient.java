package com.bit.client;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import com.bit.Response.TicketUtils;
import com.bit.request.passengerUtils;

@Component
public class RestClient {
	private static final String url="http://localhost:8087/ticket";
	public void invokeRestApi() {
		passengerUtils p=new passengerUtils();
		p.setFirstName("Bhupati");
		p.setLastName("pradhan");
		p.setAge(25);
		p.setFrom("bbsr");
		p.setTo("hyd");
		 
		WebClient client=WebClient.create();
		String res = client.post()
						   .uri(url)
						   .body(BodyInserters.fromValue(p))
				           .header("Content-Type","application/json")
                         
				           .accept(MediaType.APPLICATION_XML)
						   .retrieve()
						   .bodyToMono(String.class)
						   .block();
		System.out.println(res);
						    
	}
}
