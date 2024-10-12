package com.sts.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.sts.binding.Product;

import reactor.core.publisher.Mono;

@Service
public class ProductService {

	
	public Mono<Product> getProductNew() {
		
		String apiUrl="https://api.restful-api.dev/objects/2";
		WebClient webClient = WebClient.create();
		
		return webClient.get()
						.uri(apiUrl)
						.retrieve()
						.bodyToMono(Product.class);
		
		
		
	}
	
	
	public Mono<String> getProduct() {
		String apiUrl="https://api.restful-api.dev/objects/2";
		WebClient webClient = WebClient.create();
		
		 Mono<String> bodyToMono = webClient.get()
									.uri(apiUrl)
									.retrieve()
									.bodyToMono(String.class);
									
		
		 	return bodyToMono;
	}
}
