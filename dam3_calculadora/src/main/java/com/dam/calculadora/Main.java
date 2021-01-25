package com.dam.calculadora;

import java.util.Scanner;

import com.dam.aritmetica.OperacionesBasicas;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		while (true) {
			System.out.println("CALCULADORA");
			System.out.println("1.- SUMA.");
			System.out.println("2.- RESTA.");
			System.out.println("3.- MULTIPLICACION");
			System.out.println("4.- DIVISION");
			System.out.println("0.- SALIR");
			System.out.println("INTRODUZCA OPCION");

			int opcion = teclado.nextInt();

			System.out.println("Introduzca valor a:");
			int a = teclado.nextInt();
			System.out.println("Introduzca valor b:");
			int b = teclado.nextInt();

			switch (opcion) 
			{
				case 1:
					System.out.println("SUMA:");
					System.out.println(OperacionesBasicas.suma(a, b));
					break;
				case 2:
					System.out.println("RESTA:");
					System.out.println(OperacionesBasicas.resta(a, b));
					break;
				case 3:
					System.out.println("MULTIPLICACION:");
					System.out.println(OperacionesBasicas.multiplicacion(a, b));
					break;
				case 4:
					System.out.println("DIVISION:");
					System.out.println(OperacionesBasicas.division(a, b));
					break;
				case 7:
					System.out.println("AREA TRIANGULO:");
					System.out.println(OperacionesBasicas.areaTriangulo(a, b));
					break;
				case 0:
					return;
			}

		}

	}

}