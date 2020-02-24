
public class Math {
	private int i;
	private int j;
	private int sum;
	
	//9 Hacer un algoritmo que calculas la suma de los números impares comprendidos entre el 0 y 100 
	public int sumaImpar100() {
		sum=0;
		for(i=0; i<=100; i++) {
			if(i%2==0) {
				sum += i;
			}
		}
		//System.out.println("La suma de los impares del 1 al 100 es: " +sum);
		return sum;
	}
	//14 Calcular la suma de los cuadrados de los números pares entre el 0 y el 100
	public int sumaCuadrados() {
		sum=0;
		for(i=0; i<=100; i=i+2) {
			sum += i*i;
		}
		return sum;
	}
	//Introducir un numero por teclado menor que 100.imprimir la suma de los cuadrados de los números que están separados entre si 4 posiciones
	public void sumaCuadCada4(int user) {
		sum=0;
		if(user<100) {
			for(i=user;i<=100;i=i+4) {
				sum += i*i;
			}
			System.out.println("La suma de cuadradados de los numeros cada 4 desde el numero ingresado a 100 es: " +sum);
		}else {
			System.out.println("El numero ingresado es mayor a 100");
		}
	}
}
