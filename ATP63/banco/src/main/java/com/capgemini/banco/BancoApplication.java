package com.capgemini.banco;

import com.capgemini.banco.model.Agencia;
import com.capgemini.banco.model.Clientes;
import com.capgemini.banco.repository.AgenciaRepository;
import com.capgemini.banco.repository.ClienteRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class BancoApplication implements CommandLineRunner{
	private ClienteRepository repository;
	private AgenciaRepository aRepository;

	public BancoApplication(ClienteRepository repository, AgenciaRepository aRepository){
		this.repository = repository;
		this.aRepository = aRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(BancoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//Clientes model = new Clientes();
		//model.setNome("Mulan");
		//model.setSobrenome("Fa");
		
		//repository.save(model);	

		//repository.findAll().forEach(c -> System.out.printf("Id: %d - Nome: %s - Sobrenome:%s \n",c.getId(),c.getNome(),c.getSobrenome()));

		Agencia aModel = new Agencia();
		aModel.setNome("SM Agências");
		aModel.setLocalizacao("Salvador");
		aRepository.save(aModel);

		aRepository.findAll().forEach(a -> System.out.printf("Id: %d - Nome: %s - Localização: %s \n",a.getId(),a.getNome(),a.getLocalizacao()));
	}

}
