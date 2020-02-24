import javax.swing.JOptionPane;

public class Impresion {
	private int i;
	private int j;
	private int sum=0;
	private int user;
	private String val;

	//1 imprima los números del 0 al 100
	public void i0a100 (){
		System.out.print("Los numeros del 0 al 100 son: ");
		for(i=0; i<=100; i++) {
			System.out.print(i + " ");
		}
		System.out.println("");
	}
	
	//2 que imprima los números del 100 al 0 
	public void i100a0 () {
		System.out.print("Los numeros del 100 al 0 son: ");
		for(i=100; i>=0; i--) {
			System.out.print(i +" ");
		}
		System.out.println("");
	}
	
	//3 que imprima las sumas de los 100 primeros números enteros
	public void sum100() {
		System.out.print("Las sumas del 0 al 100 son: ");
		System.out.print("0");
		for(i=1; i<=100 ; i++) {
			sum +=i;
			System.out.print("+" +i +"=" +sum +" ");
		}
		System.out.println("");
	}
	
	//4 que imprima los números pares entre el 0 al 100
	public void pares100() {
		System.out.print("Los pares del 0 al 100 son: ");
		for(i=2; i<=100; i=i+2) {
			System.out.print(i +" ");
		}
		System.out.println("");
	}
	
	//5 que imprima los números impares hasta el 100 y que imprima cuantos impares hay
	public void impares100() {
		j=0;
		System.out.print("Los impares del 0 al 100 son: ");
		for(i=1; i<=100; i=i+2) {
			System.out.print(i +" ");
			j++;
		}
		System.out.println("Hay " +j +" numeros impares");
	}
	//6 que imprima los números impares desde el 100 hasta la unidad y que calcule su suma
	public void imparSuma() {
		sum=0;
		System.out.print("Los impares del 100 al 1 son: ");
		for(i=99; i>=1; i=i-2) {
			System.out.print(i +" ");
			sum += i;
		}
		System.out.println("la suma es " +sum);
	}
	
	//7 imprima todos los números naturales que hay desde la unidad hasta un número introducido por teclado
	public void naturalUsuario(int user) {
		System.out.print("Los numeros del 1 al numero ingresado son: ");
		if(user>0) {
			for (i=1; i<=user; i++) {
				System.out.print(i +" ");
			}
			System.out.println("");
		}else {
			System.out.println("El numero " +user +" no es mayor de cero");
		}

		}
	//8 Hacer un algoritmo que imprima y cuente los múltiplos de 3 que hay entre 1 y 100 
	public void multi3() {
		j=0;
		System.out.print("Los numeros multiplos de 3 son: ");
		for(i=1;i<100;i++) {
			if(i%3==0) {
				System.out.print(i +" ");
				j++;
			}
		}
		System.out.println("");
	}
	//10 Hacer un algoritmo que imprima y cuente los múltiplos de 5 que hay entre 1 y 500 
	public void contMulti5() {
		j=0;
		System.out.print("Los multiplos de 5 entre 1 y 100 son: ");
		for(i=1; i<=100; i++) {
			if(i%5 == 0) {
				System.out.print(i +" ");
				j++;
			}
		}
		System.out.println("Hay: " +j +" multiplos");
	}
	//11 Imprimir, contar y sumar los múltiplos de 2 hasta un número que introducimos por teclado
	public void ICSmulti2 (int user) {
		j=0;
		sum=0;
		if(user>0) {
			System.out.print("Los numero pares de cero hasta el numero introducido son: ");
			for(i=1; i<=user; i++) {
				if(i%2 == 0) {
					System.out.print(i +" ");
					j++;
					sum += i;
				}
			}
			System.out.println("Son: " +j +" pares y la suma es " +sum);
		}else {
			System.out.println("El numero " +user +" no es mayor a cero");
		}
	}
	//12 Imprimir, contar y sumar los múltiplos de 10 hasta un número que introducimos por teclado
	public void ICSmulti10 (int user) {
		j=0;
		sum=0;
		if(user>0) {
			System.out.print("Los numero de multiplos de 10 de cero hasta el numero introducido son: ");
			for(i=1; i<=user; i++) {
				if(i%10 == 0) {
					System.out.print(i +" ");
					j++;
					sum += i;
				}
			}
			System.out.println("Son: " +j +" multiplos de 10 y la suma es " +sum);
		}else {
			System.out.println("El numero " +user +" no es mayor a cero");
		}
	}
	//13 Introducir un número por teclado menor que 500. Imprimir, sumar y 
	//contar los números que estan separado entre si 8 posiciones, desde ese numero al 500
	public void ICS500 (int user) {
		j=0;
		sum =0;
		if(user<500&&user>0) {
			for(i=user; i<500; i=i+8) {
				System.out.print(i +" ");
				j++;
				sum += i;
			}
			System.out.println("Son: " +j +" numeros con 8 de separacion hasta el 500"
					+" la suma es: " +sum);
		}else {
			System.out.println("El numero " +user +" es mayor a 500 o menor a cero");
		}
	}
	//15 Introducir un numero por teclado que nos diga si es positivo o negativo
	public void posNeg(float user) {
		if(user<0) {
			System.out.println("El numero: " +user +" es negativo");
		}else if(user>0){
			System.out.println("El numero: " +user +" es positivo");
		}else {
			System.out.println("El numero: " +user +" es cero");
		}
	}
	
	//16 Introducir un número por teclado. Que nos diga si es par o impar.
	public void parImpar(int user) {
		if(user%2 == 0) {
			System.out.println("El numero " +user +" es par");
		}else {
			System.out.println("El numero " +user +" es impar");
		}
	}
	
	//17 Imprimir y contar los múltiplos de 3 desde la unidad hasta un 
	//número que introducimos por teclado  
	public void multiplos3 () {
		j=0;
//		val = JOptionPane.showInputDialog("Ingresa un valor");
//		user = Integer.parseInt(val);
		user = 32;
		for(int i=3; i<=user; i=i+3) {
			System.out.print(i +" ");
			j++;
		}
		System.out.println(" Son " +j +" multiplos de 3");
	}

}
