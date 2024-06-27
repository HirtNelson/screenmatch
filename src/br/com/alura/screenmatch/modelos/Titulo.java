package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoException;

public class Titulo implements Comparable<Titulo> {

    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    // Construtor padrão
    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    // Construtor que converte de um objeto TituloOmdb
    public Titulo(TituloOmdb meuTituloOmdb) {
        this.nome = meuTituloOmdb.title();
        if (meuTituloOmdb.year().length() > 4){
            throw new ErroDeConversaoDeAnoException("Não foi possível converter o ano. Tem mais de 4 dígitos.");
        }
        this.anoDeLancamento = Integer.parseInt(meuTituloOmdb.year());

        String runtimeStr = meuTituloOmdb.runtime();
        if (runtimeStr != null && runtimeStr.length() >= 2) {
            this.duracaoEmMinutos = Integer.parseInt(runtimeStr.substring(0, 2));
        } else {
            this.duracaoEmMinutos = 0; // ou qualquer valor padrão apropriado
        }
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    // Métodos de negócio
    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia(){
        if (totalDeAvaliacoes == 0) {
            return 0; // ou algum outro valor padrão, ou lançar uma exceção
        }
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    // Métodos de comparação e exibição
    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return "nome= " + nome +
                ", anoDeLancamento= " + anoDeLancamento +
                ", duracaoEmMinutos= " + duracaoEmMinutos;
    }
}