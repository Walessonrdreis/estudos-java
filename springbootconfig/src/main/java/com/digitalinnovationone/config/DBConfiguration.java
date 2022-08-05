package com.digitalinnovationone.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration // indicando para o string que esse e um arquivo de configuracao
@ConfigurationProperties("spring.datasource") // Mapeia todas as propriedades presentes no link (prefixos)indicado no parametro
//Adicionada anotacoes lombok para nao poluir o codigo com getters e ‘setters’
@Getter //quando o projeto for compilado ele recebe todos os getters e setters
@Setter
public class DBConfiguration {
    //Mapeando propriedades iniciais do arquivo de configuracaoo de desenvolvimento
    private String driverClassName;
    private String url;
    private String username;
    private String password;
    //Desenvolvimento
    @Profile("dev") //pegar todas as propriedades de configuração com a propriedade <--
    @Bean

    public String testDatabaseConnection(){
        System.out.println("DB connection dor DEV - H2");
        System.out.println(driverClassName);
        System.out.println(url);
        return "DB Connection to H2_TEST - Test instance";
    }

    //Producao
    @Profile("prod")
    @Bean

    public String productionDatabaseConnection(){
        System.out.println("DB connection for Production - MySQL");
        System.out.println(driverClassName);
        System.out.println(url);
        return "DB Connection to MYSQL_PROD - Test instance";
    }
}
