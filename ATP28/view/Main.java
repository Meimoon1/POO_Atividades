package view;

import controller.PessoaFisicaController;
import controller.PessoaJuridicaController;
import modells.Endereco;
import modells.PessoaFisica;
import modells.PessoaJuridica;

public class Main {
    public static void main(String[] args) {
        PessoaFisicaController pfController = new PessoaFisicaController();
        PessoaJuridicaController pjController = new PessoaJuridicaController();
        PessoaFisica pf1 = new PessoaFisica();
        

        pf1.id = 1;
        pf1.nome = "Laercio";
        pf1.sobrenome = "Rios";
        pf1.cpf = "90202903902930";

        Endereco e1 = new Endereco();
        e1.rua = "Primavera";
        e1.bairro = "Feira VI";
        e1.numero = "12";
        e1.cep = "998920292002";
        pf1.enderecoPessoal = e1;

        pfController.create(pf1);

        PessoaJuridica pj1 = new PessoaJuridica();
        pj1.nome = "Hanna";
        pj1.sobrenome = "Montenegro";
        pj1.cnpj = "00920290290";

        Endereco e2 = new Endereco();
        e2.rua = "Rua Terra Média";
        e2.bairro = "Gondor";
        e2.numero = "19029";
        e2.cep = "902902920";
        pj1.enderecoEstabelecimento = e2;
        pjController.create(pj1);

        
        
        for (PessoaFisica pf : pfController.read()) {
            System.out.println(pf);
        }
        
    }
}
