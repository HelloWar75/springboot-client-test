package br.com.luisjustin.clientsapitest;

import br.com.luisjustin.clientsapitest.model.Client;
import br.com.luisjustin.clientsapitest.repository.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.LongStream;

@SpringBootApplication
public class ClientsApiTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientsApiTestApplication.class, args);
	}

}
