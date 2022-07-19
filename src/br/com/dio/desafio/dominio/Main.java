package br.com.dio.desafio.dominio;

import br.com.dio.desafio.dominio.model.Bootcamp;
import br.com.dio.desafio.dominio.model.Curso;
import br.com.dio.desafio.dominio.model.Developer;
import br.com.dio.desafio.dominio.model.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Curso Java");
        cursoJava.setDescricao("Curso Java Top");
        Curso cursoJS = new Curso();
        cursoJS.setTitulo("Curso JavaScript");
        cursoJS.setDescricao("Curso JavaScript Top");
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Orientação a Objetos em Java");
        mentoria.setDescricao("Aprenda a base deste Paradigma");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Aprendendo Tudo");
        bootcamp.addConteudos(cursoJava,cursoJS,mentoria);

        Developer devJax = new Developer("Jax");
        devJax.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Jax: "+devJax.getConteudosInscritos());
        devJax.progredir();
        System.out.println("Conteudos Inscritos Jax: "+devJax.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Jax: "+devJax.getConteudosConcluido());
        System.out.println("XP: " +  devJax.calcularTotalXP());

        Developer devReyna = new Developer("Reyna");
        devReyna.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Reyna: "+devReyna.getConteudosInscritos());
        devReyna.progredir();
        System.out.println("Conteudos Inscritos Reyna: "+devReyna.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Reyna: "+devReyna.getConteudosConcluido());
        System.out.println("XP: " +  devReyna.calcularTotalXP());

    }
}
