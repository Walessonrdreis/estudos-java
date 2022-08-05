package com.digitalinnovationone;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @Value("${app.message}") //injetando todos os valores, cujo o início seja app.message
    private String appMessage;

    @GetMapping("/") //fazer a exibição direta no navegador a partir do contexto de barra do navegador
    //Toda vez que abrir o navegador ele vai exibir a mensagem de ambiente de produção ou desenvolvimento
    public String getAppMessage(){
        return appMessage;
    }

}
