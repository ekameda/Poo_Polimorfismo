package br.com.Estudo.Java.Poo.Polimorfismo.Sapataria.Classe;

import java.math.BigDecimal;

public abstract class Sapataria {
	
    private int quantidadeFio;
    private int quantidadeTecido;
    private int tempoParaFazer;
    private BigDecimal valorVenda;

    public Sapataria(){}

    public Sapataria(int quantidadeFio, int quantidadeTecido, int tempoParaFazer, BigDecimal valorVenda) {
        this.quantidadeFio = quantidadeFio;
        this.quantidadeTecido = quantidadeTecido;
        this.tempoParaFazer = tempoParaFazer;
        this.valorVenda = valorVenda;
    }

    public abstract void preparar();
    public abstract void execucao();
    public abstract void vender();

	public int getQuantidadeFio() {
		return quantidadeFio;
	}

	public void setQuantidadeFio(int quantidadeFio) {
		this.quantidadeFio = quantidadeFio;
	}

	public int getQuantidadeTecido() {
		return quantidadeTecido;
	}

	public void setQuantidadeTecido(int quantidadeTecido) {
		this.quantidadeTecido = quantidadeTecido;
	}

	public int getTempoParaFazer() {
		return tempoParaFazer;
	}

	public void setTempoParaFazer(int tempoParaFazer) {
		this.tempoParaFazer = tempoParaFazer;
	}

	public BigDecimal getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(BigDecimal valorVenda) {
		this.valorVenda = valorVenda;
	}
    
    
    
}
