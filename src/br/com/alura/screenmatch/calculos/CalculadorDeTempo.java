package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    // Método para obter o tempo total calculado
    public int getTempoTotal() {
        return this.tempoTotal;
    }

    // Método genérico para incluir qualquer Titulo (Filme ou Serie)
    public void inclui(Titulo titulo) {
        System.out.println("Adicionando duração em minutos de " + titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}