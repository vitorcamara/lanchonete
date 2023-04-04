package com.vitorcamara.projetos;

import java.util.Scanner;

public class Lanchonete {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double total = 0;
		int codigoProduto = 0;
		int qtdProduto = 0;
		String resp = "n";
		double cachorroQ = 1.20;
		double bauruSimples = 1.30;
		double bauruOvo = 1.50;
		double hamb = 1.20;
		double cheese = 1.30;
		double refri = 1.00;
		String output = ""; //String que recolherá os nomes de todos os produtos

		System.out.println("===========LANCHONETE===========");
		System.out.println("(CÓDIGO) Produtos.........preços\n");
		System.out.println("(100) Cachorro-quente....R$ 1,20");
		System.out.println("(101) Bauru Simples......R$ 1,30");
		System.out.println("(102) Bauru com Ovo......R$ 1,50");
		System.out.println("(103) Hambúrguer.........R$ 1,20");
		System.out.println("(104) Cheeseburguer......R$ 1,30");
		System.out.println("(105) Refrigerante.......R$ 1,00\n");

		do {
			System.out.println("Entre com o código do produto:");
			codigoProduto = scan.nextInt();

			System.out.println("Qual a quantidade desse produto?");
			qtdProduto = scan.nextInt();

			if (codigoProduto == 100) {
				total += cachorroQ * qtdProduto; //total a ser pago vai recebendo o produto multiplicado pela quantidade do produto 
				output += "Cachorro-quente - " + qtdProduto + "(uni)\n"; //output recebe nome do produto e também a quantidade
				System.out.println(qtdProduto + " - cachorro-quente = R$" + (cachorroQ * qtdProduto) + "\n");
			}

			if (codigoProduto == 101) {
				total += bauruSimples * qtdProduto;
				output += "Bauru Simples - " + qtdProduto + "(uni)\n";
				System.out.println(qtdProduto + " - bauru simples = R$" + (bauruSimples * qtdProduto) + "\n");
			}

			if (codigoProduto == 102) {
				total += bauruOvo * qtdProduto;
				output += "Bauru com ovo - " + qtdProduto + "(uni)\n";
				System.out.println(qtdProduto + " - bauru com ovo = R$" + (bauruOvo * qtdProduto) + "\n");
			}

			if (codigoProduto == 103) {
				total += hamb * qtdProduto;
				output += "Hamburguer - " + qtdProduto + "(uni)\n";
				System.out.println(qtdProduto + " - hamburguer = R$" + (hamb * qtdProduto) + "\n");
			}

			if (codigoProduto == 104) {
				total += cheese * qtdProduto;
				output += "Cheeseburguer - " + qtdProduto + "(uni)\n";
				System.out.println(qtdProduto + " - cheeseburguer = R$" + (cheese * qtdProduto) + "\n");
			}

			if (codigoProduto == 105) {
				total += refri * qtdProduto;
				output += "Refrigerante - " + qtdProduto + "(uni)\n";
				System.out.println(qtdProduto + " - refrigerante = R$" + (refri * qtdProduto) + "\n");
			}

			System.out.println("Quer lançar novo produto? [S/N]");
			resp = scan.next();

		} while (resp.equalsIgnoreCase("s"));

		System.out.println("Produtos: \n" + output); //imprime todos os produtos e suas quantidades selecionadas
		System.out.println("Valor total a ser pago = R$" + total);

	}

}
