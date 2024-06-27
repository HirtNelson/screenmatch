package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class Principal {
    public static void main(String[] args) {
        // Criação de instâncias de filmes e séries
        Filme meuFilme = new Filme("O Poderoso Chefão", 1970);
        meuFilme.avalia(9);

        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);

        Filme filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avalia(10);

        Serie lost = new Serie("Lost", 2000);

        // Atribuição de um filme à variável f1
        Filme f1 = filmeDoPaulo;

        // Impressão dos detalhes dos filmes e séries
        System.out.println("Detalhes do Filme: " + meuFilme);
        System.out.println("Detalhes do Filme: " + outroFilme);
        System.out.println("Detalhes do Filme: " + filmeDoPaulo);
        System.out.println("Detalhes da Série: " + lost);

        // Exemplo de uso de polimorfismo
        System.out.println("\nUsando polimorfismo:");
        System.out.println("Detalhes do Título: " + f1);

        // Exemplo de interface Classificavel
        System.out.println("\nClassificação do Filme " + filmeDoPaulo.getNome() + ": " + filmeDoPaulo.getClassificacao());
    }
}