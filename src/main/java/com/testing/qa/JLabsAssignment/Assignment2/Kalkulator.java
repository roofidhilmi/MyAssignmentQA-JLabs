package com.testing.qa.JLabsAssignment.Assignment2;

import java.util.Scanner;

public class Kalkulator {

	public static void main(String[] args) {

		int operation = perhitungan();

		double angka1 = angkaPertama();
		double angka2 = angkaKedua();

		double hasil;
		if (operation == 1) {

			hasil = angka1 + angka2;
			System.out.println(
					"Hasil penjumlahan ini adalah " + hasil + " Terimakasih telah menggunakan kalkulator kami");
		}

		else if (operation == 2) {
			hasil = angka1 - angka2;
			System.out.println(
					"Hasil penjumlahan ini adalah " + hasil + " Terimakasih telah menggunakan kalkulator kami");
		}

		else if (operation == 3) {
			hasil = angka1 * angka2;
			System.out.println(
					"Hasil penjumlahan ini adalah " + hasil + " Terimakasih telah menggunakan kalkulator kami");
		}

		else if (operation == 4) {
			hasil = angka1 % angka2;
			System.out.println(
					"Hasil penjumlahan ini adalah " + hasil + " Terimakasih telah menggunakan kalkulator kami");
		}

	}

	public static int perhitungan() {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.println("Program perhitungan kalkulator Sederhana");
			System.out.println("Masukan ankga 1 untuk Penjumlahan");
			System.out.println("Masukan ankga 2 untuk Pengurangan");
			System.out.println("Masukan ankga 3 untuk Perkalian");
			System.out.println("Masukan ankga 4 untuk Pembagian");
			System.out.println("Masukan Operasi yang akan digunakan: ");

			int userInput = scanner.nextInt();

			if (userInput >= 1 && userInput <= 4) {

				return userInput;
			}

			else {
				System.out.println("Harap masukan operator yang sesuai!");
				return perhitungan();
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block

			System.out.println("silahkan masukan angka!");

			return perhitungan();
		}

	}

	public static double angkaPertama() {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		try {
			System.out.print("Silahkan masukan angka pertama: ");
			String userInput = scan.nextLine();

			return Double.parseDouble(userInput);

		} catch (NumberFormatException e) {
			System.out.println("Harap masukan angka!!");

			return angkaPertama();
		}
	}

	public static double angkaKedua() {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		try {
			System.out.print("Silahkan masukan angka kedua: ");
			String userInput = scan.nextLine();

			return Double.parseDouble(userInput);

		} catch (NumberFormatException e) {
			System.out.println("Harap masukan angka!!");

			return angkaKedua();
		}
	}

}
