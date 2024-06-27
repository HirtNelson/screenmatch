package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    // Construtor que chama o construtor da superclasse
    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    // Getter para o diretor
    public String getDiretor() {
        return diretor;
    }

    // Setter para o diretor
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    // Implementação do método da interface Classificavel
    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2; // ou qualquer outra lógica apropriada
    }

    // Sobrescrita do método toString
    @Override
    public String toString() {
        return "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }
}