package Application;

import Rotores.RotorMedio;
import Rotores.RotorRapido;

public class Main {
	
	static RotorRapido rotor1 = new RotorRapido(0);
	static RotorMedio rotor2 = new RotorMedio(0);
	
	public static void main(String[] args) {
		String hello = "oi"; 
		
		for(int i=0; i<hello.length();i++) {
			System.out.println("Rotor1: "+ rotor1.R1.toString());
			System.out.println("Rotor2: "+ rotor2.R2.toString());
			System.out.println(returnEncript(hello.charAt(i)+"", rotor1, rotor2));
		}
		
	}
	
	public static char returnEncript(String letra, RotorRapido r1, RotorMedio r2) {
		return r2.retornaLetra(r1.retornaPosicao(letra));
	}
}
