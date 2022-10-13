package com.secuencialidad;

public class Actividad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1
		
		//a
		int[] arreglo= new int[10];
		for (int i = 0; i <arreglo.length; i++){
			arreglo[i] = 2 * i;}
		for (int i: arreglo){
			System.out.print(i+ " ");
		}
		System.out.println();
		// el output es el valor del arreglo uno por uno
		
		//b
		System.out.println("...................");
		System.out.println();
		// a
				//esta imprimiendo las vocales una por una
		char[] vocal= {'a', 'e', 'i', 'o', 'u'};
		for (int index = 0; index <vocal.length; index++)
			System.out.println(vocal[index]);
		
		//c
		System.out.println("...................");
				double ola[] = {12.2, -7.3, 14.2, 11.3};
				System.out.println("Ola1 es " + ola[1]);
				System.out.println("Ola2 es " + ola[2]);
				//toma el valor del indice 1 y del indice 2
		
		//2
		System.out.println("...................");
		int[] a = new int[10];
		//el índice sería 9
		System.out.println(a.length);

		//3
		System.out.println("...................");
		int[] b = new int[20];
		for (int i = 1; i <= b.length; i++){
			b[i] = 5 * i;
			//i está fuera del rango
			
		//4
			
		}
	}

}
