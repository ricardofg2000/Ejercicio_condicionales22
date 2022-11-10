package unico;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {
/* 
Realiza un programa que calcule el precio de un desayuno. 
El programa preguntará primero qué ha tomado el usuario de comer: 
palmera, donut o pitufo. La palmera vale 1.40 € y el donut 1 €. 
En caso de tomar pitufo, el programa debe preguntar además si era con aceite o con tortilla; 
el primero vale 1’20 € y el segundo 1’60 €. Por último se pregunta por la bebida: zumo o café a 1’50 y 1’20 
respectivamente.

Ejemplo 1:

¿Qué ha tomado de comer? (palmera, donut o pitufo): palmera
¿Qué ha tomado de beber? (zumo o café): café
Palmera: 1,40 €
Café: 1,20 €
Total desayuno: 2,60 €
Ejemplo 2:

¿Qué ha tomado de comer? (palmera, donut o pitufo): pitufo
¿Con qué se ha tomado el pitufo? (aceite o tortilla): tortilla
¿Qué ha tomado de beber? (zumo o café): zumo
Pitufo con tortilla: 1,60 €
Zumo: 1,50 €
Total desayuno: 3,10 €	 
*/

		Scanner leer = new Scanner(System.in);
		
		final double PPITUFO_ACEITE = 1.20;
		final double PPITUFO_TORTILLA = 1.60;
		final double PPALMERA = 1.40;
		final double PDONUT = 1.00;
		final double PCAFE = 1.20;
		final double PZUMO = 1.50;
		final DecimalFormat formato2Dec = new DecimalFormat("0.00");
		
		String comida;
		String complemento;
		String bebida;
		String mensajeBebida = null;
		String mensajeComida = null;
		double pcomida = 0.0;
		double pbebida = 0.0;
		double total;
		
		System.out.print("¿Qué ha tomado de comer? (palmera, donut o pitufo): ");
		comida = leer.nextLine();
		switch(comida) {
		case "palmera":pcomida = PPALMERA;mensajeComida = "Palmera: " + pcomida + " €";break;
		case "donut":pcomida = PDONUT;mensajeComida = "Donut: " + pcomida + " €";break;
		case "pitufo":
			System.out.print("¿Con qué se ha tomado el pitufo? (aceite o tortilla): ");
			complemento = leer.nextLine();
			switch (complemento) {
			case "aceite":pcomida = PPITUFO_ACEITE;mensajeComida = "Pitufo con aceite: " + pcomida + " €";break;
			case "tortilla":pcomida = PPITUFO_TORTILLA;mensajeComida = "Pitufo con tortilla: " + pcomida + " €";break;
			}
		break;
		}
		System.out.print("¿Qué ha tomado de beber? (zumo o café): ");	
		bebida = leer.nextLine();
		switch(bebida) {
		case "zumo":pbebida = PZUMO;mensajeBebida = "Zumo: " + pbebida + " €";break;
		case "café":pbebida = PCAFE;mensajeBebida = "Café: " + pbebida + " €";break;
		}
		total = pcomida + pbebida;
		
		System.out.println(mensajeComida);
		System.out.println(mensajeBebida);
		System.out.println("Total desayuno: " + formato2Dec.format(total) + " €");
		
	}

}

