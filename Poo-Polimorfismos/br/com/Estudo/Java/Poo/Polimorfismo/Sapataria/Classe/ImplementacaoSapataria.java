package br.com.Estudo.Java.Poo.Polimorfismo.Sapataria.Classe;

import java.math.BigDecimal;

public class ImplementacaoSapataria {

	public static void main(String[] args) {
		
		Sapataria produtoSapataria = new SapatariaTenis(300,100,30,BigDecimal.valueOf(350L));
		System.out.println("\nTenis");
		produtoSapataria.preparar();
		produtoSapataria.execucao();
		produtoSapataria.vender();
		
		produtoSapataria = new SapatariaSapato(500,200,120,BigDecimal.valueOf(350L));
		System.out.println("\nSapato");
		produtoSapataria.preparar();
		produtoSapataria.execucao();
		produtoSapataria.vender();
				
		produtoSapataria = new SapatariaChinelo();
        System.out.println("\nChinelo");
        produtoSapataria.preparar();
        produtoSapataria.execucao();
        produtoSapataria.vender();
	}
}
