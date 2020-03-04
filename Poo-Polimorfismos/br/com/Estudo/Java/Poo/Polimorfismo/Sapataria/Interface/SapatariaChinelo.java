package br.com.Estudo.Java.Poo.Polimorfismo.Sapataria.Interface;

import java.math.BigDecimal;

public class SapatariaChinelo implements Sapataria {

    @Override
    public void preparar() {
        System.out.println(String.format("CORTAR %d METROS DE BORACHA", 60));
        System.out.println(String.format("ENCAIXAR %d LOCAIS FIXACAO", 3));
    }
   
    @Override
    public void execucao() {
        System.out.println(String.format("EXECUTAR A FIXACAO"));
    }

    @Override
    public void vender() {
        System.out.println(String.format("PREÇO DE VENDA R$%.2f", BigDecimal.valueOf(38L)));
    }


}


