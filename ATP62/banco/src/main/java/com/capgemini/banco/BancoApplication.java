package com.capgemini.banco;

import com.capgemini.banco.model.Clientes;
import com.capgemini.banco.repository.ClienteRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class BancoApplication implements CommandLineRunner{
	private ClienteRepository repository;

	public BancoApplication(ClienteRepository repository){
		this.repository = repository;
	}

	public static void main(String[] args) {
		SpringApplication.run(BancoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Clientes model = new Clientes();
		model.setNome("Mulan");
		model.setSobrenome("Fa");
		
		repository.save(model);	

		repository.findAll().forEach(c -> System.out.printf("Id: %d - Nome: %s - Sobrenome:%s \n",c.getId(),c.getNome(),c.getSobrenome()));
	}

}
