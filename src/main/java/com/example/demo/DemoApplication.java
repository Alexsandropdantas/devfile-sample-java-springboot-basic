package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class DemoApplication implements ErrorController{

    @RequestMapping("/")
    String home() {
        return "<h1>Teste RH Single Sign On! </h1><br /><p>Click <a href=\"/private\">aqui</a> logar com SSO.</p>  ";
    }
    
    @RequestMapping("/private")
	public String secure() {
		return "<h1>Logado no SSO com sucesso!</h1>";
	}
	
    @Override
    public String getErrorPath() {
        return "Página de erro do Controlador";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
