package Application;

import java.util.Scanner;

import Rotores.RotorMedio;
import Rotores.RotorRapido;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a posição inicial que o rotor rapido se inicia : ");
		int posRotorRapido = Integer.parseInt(sc.nextLine());
		System.out.print("Digite a posição inicial que o rotor medio se inicia : ");
		int posRotorMedio = Integer.parseInt(sc.nextLine());
		System.out.println();
		System.out.println("==== Base RotorRapido: "+posRotorRapido + ", Base RotorMedio: " + posRotorMedio + " ====");
		System.out.println();
		
		RotorRapido rotor1 = new RotorRapido(posRotorRapido);
		RotorMedio rotor2 = new RotorMedio(posRotorMedio);
		
		System.out.print("Digite a frase que deseja encryptografar : ");
		String frase = sc.nextLine(); 
		String fraseEncrypt = "";
		System.out.println();
		int auxRotacaoMedio = 0;
		
		for(int i=0; i<frase.length();i++) {
			System.out.println("Rotor1: "+ rotor1.R1.toString());
			System.out.println("Rotor2: "+ rotor2.R2.toString());
			fraseEncrypt += returnEncript(frase.charAt(i)+"", rotor1, rotor2);
			System.out.println("============  GIRO ROTOR RAPIDO ============ ");
			Integer conta = (rotor1.returnRotacoes()/25);
			if( conta > auxRotacaoMedio && conta >= 1) {
				auxRotacaoMedio++;
				System.out.println("============  GIRO ROTOR MEDIO ============ ");
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("==== Rotações efetuadas no RotorRapido: "+rotor1.returnRotacoes());
		System.out.println("==== Rotações efetuadas no RotorMedio: " + auxRotacaoMedio);
		
		System.out.println();
		System.out.println("Frase encryptgrafada: " + fraseEncrypt);
	}
	
	public static char returnEncript(String letra, RotorRapido r1, RotorMedio r2) {
		return r2.retornaLetra(r1.retornaPosicao(letra));
	}
}
