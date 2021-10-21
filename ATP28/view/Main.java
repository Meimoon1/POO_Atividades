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
        pj1.id = 2;
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

        PessoaJuridica pj2 = new PessoaJuridica();
        pj2.id = 3;
        pj2.nome = "Hanna";
        pj2.sobrenome = "Montenegro";
        pj2.cnpj = "00920290290";

        Endereco e3 = new Endereco();
        e3.rua = "Rua Terra Média";
        e3.bairro = "Gondor";
        e3.numero = "19029";
        e3.cep = "902902920";
        pj2.enderecoEstabelecimento = e3;
        pjController.create(pj2);

        //buscando se já existe o pj2
        System.out.println(pjController.existe(pj2));
        
        //modificando pj2
        pjController.update(pj2);
        pj2.nome = "Joanna";
        pj2.id = 9;
   
        //excluindo pj1
        pjController.delete(pj1);
         
        for (PessoaJuridica pj : pjController.read()) {
            System.out.println(pj);         
        }
        
        
    }
}
