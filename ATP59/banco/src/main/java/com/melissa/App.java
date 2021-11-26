package com.melissa;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.melissa.models.Categoria;

public class App {
   public static void main(String[] args) {
       System.out.println("Categorias");
       Categoria c1 = new Categoria();
       c1.setNome("testeeeeeeeeee jpa");
       c1.setDescricao("blablalaaaaaaaaaa");

       EntityManagerFactory factory = Persistence.createEntityManagerFactory("banco");
       EntityManager em = factory.createEntityManager();

       List<Categoria> lista = em.createQuery("SELECT c FROM Categoria c ORDER BY id", Categoria.class).getResultList(); 
       em.getTransaction().begin(); 
       em.persist(c1);
       em.getTransaction().commit();

       for (Categoria categoria : lista) {
           System.out.printf("Id: %d- Nome: %s - Descricao: $s",categoria.getId(),categoria.getNome(),categoria.getDescricao());
       }
       
       
   } 
}
