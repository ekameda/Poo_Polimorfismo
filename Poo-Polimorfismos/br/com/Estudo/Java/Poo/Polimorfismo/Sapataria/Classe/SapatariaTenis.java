package br.com.Estudo.Java.Poo.Polimorfismo.Sapataria.Classe;

import java.math.BigDecimal;

public class SapatariaTenis extends Sapataria {	

    public SapatariaTenis(int quantidadeFio, int quantidadeTecido, int tempoParaFazer, BigDecimal valorVenda) {
        super(quantidadeFio,  quantidadeTecido, tempoParaFazer, valorVenda);
    }
    
    @Override
    public void preparar() {
        System.out.println(String.format("CORTAR %d METROS DE TECIDO", getQuantidadeTecido()));
        System.out.println(String.format("COSTURAR %d METROS DE LINHA", getQuantidadeFio()));
    }

    @Override
    public void execucao() {
        System.out.println(String.format("TEMPO PARA TERMINO %d MINUTOS", getTempoParaFazer()));
    }

    @Override
    public void vender() {
        System.out.println(String.format("PREÇO DE VENDA R$%.2f", getValorVenda()));
    }

}
