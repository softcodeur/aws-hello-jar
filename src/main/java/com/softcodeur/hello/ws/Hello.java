package com.softcodeur.hello.ws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api/hello/")
public class Hello {
	@GetMapping("/name/{name}")
	public String getHello(@PathVariable("name") String name){
		return "Hello  "+ name;
	}

}
