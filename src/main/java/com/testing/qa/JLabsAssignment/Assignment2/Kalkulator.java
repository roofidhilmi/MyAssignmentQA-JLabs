package com.testing.qa.JLabsAssignment.Assignment2;

import java.util.Scanner;

public class Kalkulator {

	Scanner input = new Scanner(System.in);
	float a, b, nilai, operator, hasil;
	String Alphabet;

	public void perhitungan() {

		System.out.println("Program perhitungan kalkulator Hilmi");
		System.out.println("Masukan ankga 1 untuk Penjumlahan");
		System.out.println("Masukan ankga 2 untuk Pengurangan");
		System.out.println("Masukan ankga 3 untuk Perkalian");
		System.out.println("Masukan ankga 4 untuk Pembagian");

		System.out.println("Masukan Operasi yang akan digunakan: ");
		operator = input.nextFloat();

	}

	public void inputData() {

		if (nilai == a) {
			System.out.println("Silahkan Masukan Angka Pertama: ");
			a = input.nextInt();

		}

		else if (nilai == b) {
			System.out.println("Silahkan Masukan Angka Kedua: ");
			b = input.nextInt();
		}

		else {
			System.out.println("salah input data masnya");
		}

//				System.out.println("Mohon maaf anda salah memasukan nilai!");

//				System.out.println("Mohon maaf anda salah memasukan nilai!");
	}

	public void OperasiData() {

		if (operator == 1) {

			hasil = a + b;
			System.out.println("Hasil penjumlahan ini adalah " + hasil);
		}

		else if (operator == 2) {
			hasil = a - b;
			System.out.println("Hasil penjumlahan ini adalah " + hasil);
		}

		else if (operator == 3) {
			hasil = a * b;
			System.out.println("Hasil penjumlahan ini adalah " + hasil);
		}

		else if (operator == 4) {
			hasil = a % b;
			System.out.println("Hasil penjumlahan ini adalah " + hasil);
		}

		else {
			System.out.println(" Maaf pilihan yang anda masukan salah");
		}

//		System.out.println("Masukan Operasi yang akan digunakan: ");
//		number3 = input.nextInt();
//		
//		switch (number3) {
//		case 1 : result = number1 + number2; break;
//		case 2 : result = number1 - number2; break;
//		case 3 : result = number1 / number2; break;
//		case 4 : result = number1 % number2; break;
//		
//		
//		}

//		System.out.println("Hasil: " + result);

	}

}
