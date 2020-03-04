package br.com.Estudo.Java.Poo.Polimorfismo.Sapataria.Interface;

import java.math.BigDecimal;

public class SapatariaTenis implements Sapataria {
	
	private final int quantidadeFio;
    private final int quantidadeTecido;
    private final int tempoParaFazer;
    private final BigDecimal valorVenda;

    public SapatariaTenis(int quantidadeFio, int quantidadeTecido, int tempoParaFazer, BigDecimal valorVenda) {
		 this.quantidadeFio = quantidadeFio;
	     this.quantidadeTecido = quantidadeTecido;
	     this.tempoParaFazer = tempoParaFazer;
	     this.valorVenda = valorVenda;
	}
	    
	@Override
	public void preparar() {
		System.out.println(String.format("CORTAR %d METROS DE TECIDO", this.quantidadeTecido));
		System.out.println(String.format("COSTURAR %d METROS DE LINHA", this.quantidadeFio));
	}
	
	@Override
	public void execucao() {
		System.out.println(String.format("TEMPO PARA TERMINO %d MINUTOS", this.tempoParaFazer));
	}
	
	@Override
	public void vender() {
		System.out.println(String.format("PREÇO DE VENDA R$%.2f", this.valorVenda));
	}
}
