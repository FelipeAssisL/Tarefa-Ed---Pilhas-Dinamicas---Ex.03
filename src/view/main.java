package view;

import java.util.Scanner;

import controller.ConvertController;

public class main {

	public static void main(String[] args) {
		ConvertController CC = new ConvertController();
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um valor: ");
		int num = sc.nextInt();
		while(num > 1000 ) {
			System.out.print("Digite um entre 0 e 1000: ");
			num = sc.nextInt();
		}
		sc.close();
		StringBuilder bin = CC.DecToBin(num);
		System.out.println(bin.toString());
	}

}
