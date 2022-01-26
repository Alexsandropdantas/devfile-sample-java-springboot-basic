package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class DemoApplication {

    @RequestMapping("/")
    String home() {
        return "Boa tarde GSDS! <br /><p>Click <a href="/private">aqui</a> para ir para página segura</p>  ";
    }
    
    @RequestMapping("/private")
	public String secure() {
		return "Esta he uma página apos validacao SSO.";
	}

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
