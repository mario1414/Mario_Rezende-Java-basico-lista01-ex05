package br.fai.ex05;

public class Main {

	public static void main(String[] args) {

		for (int i = 0; i <= 5; i++) {

			switch (i) {
			case 1:
				System.out.println("primeira condição");
				break;

			case 4:
				System.out.println("segunda condição");
				break;

			default:
				System.out.println("Não encontrou nenhuma opção");
				break;
			}
		}
	}
}
