
import javax.swing.JOptionPane;

public class Ejercicios {

	public static void main(String[] args) {
		Impresion imp = new Impresion();
		Math math = new Math();
		// Scanner scan = new Scanner();
		String val;
		int user;
		int user2;
		float flotante;

		
		imp.i0a100();
		
		imp.i100a0();
		
		imp.sum100();
		
		imp.pares100();
		
		imp.impares100();
		
		imp.imparSuma();
		
	//	scan.nextInt();
	//	val =JOptionPane.showInputDialog("Ingresa un valor para imprimir del 1 a ese valor");
	//	user = Integer.parseInt(val);
		user = 33;
		imp.naturalUsuario(user);
		
		imp.multi3();
		
		System.out.println("La suma de los impares del 1 al 100 es: " +math.sumaImpar100());
		
		imp.contMulti5();
		
	//	val = JOptionPane.showInputDialog("Ingresa un valor para obtener todos los pares ");
	//	user = Integer.parseInt(val);
		imp.ICSmulti2(user);
		
	//	val = JOptionPane.showInputDialog("Ingresa un valor para obtener todos los multiplos de 10 antes de ese numero ");
	//	user = Integer.parseInt(val);
		imp.ICSmulti10(user);
		
	//	val = JOptionPane.showInputDialog("Ingresa un valor para obtener todos los numeros de 8 en 8 desde ese numero hasta 500");
	//	user2 = Integer.parseInt(val);
		user2 = 430;
		imp.ICS500(user2);
		
		System.out.println("La suma de los cuadrados del 0 al 100 es: " +math.sumaCuadrados());
		
	//	val = JOptionPane.showInputDialog("Ingresa un numero, arrojare la suma de los cuadrados a cada 4 numeros desde el ingresado hasta 100");
	//	user = Integer.parseInt(val);
		math.sumaCuadCada4(user);
		
	//	val=JOptionPane.showInputDialog("ingresa un valor y te dire si es negativo o positivo");
	//	flotante = Float.parseFloat(val);
		flotante = -2;
		imp.posNeg(flotante);
		
		imp.parImpar(user);
		
		imp.multiplos3();
		

	}

}
