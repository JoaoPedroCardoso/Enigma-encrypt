package Rotores;

import java.util.ArrayList;

public class RotorRapido {
	public static ArrayList<Integer> R1 = new ArrayList<Integer>();
	static String alpha ="abcdefghijklmnopqrstuvwxyz";
	Integer aleatorioRt1[] = { 8, 25, 17, 23, 7, 22, 1, 16, 6, 9, 21, 0, 15, 5, 10, 18, 2, 24, 4, 11, 3, 14, 19, 12, 20, 13 };
	
	static Integer rotacoes = 0;
	
	public RotorRapido(Integer baseNumber) {
		
		for (int i = baseNumber; i < aleatorioRt1.length; i++) {
			R1.add(aleatorioRt1[i]);
		}
		
		for (int i = 0; i < baseNumber; i++) {
			R1.add(aleatorioRt1[i]);
		}
	}
	
	public static void rotacionaRotor() {
		int temp = R1.get(0);
		R1.remove(0);
		R1.add(temp);
		
		char temp2 = alpha.charAt(0);
		alpha = alpha +""+temp2;
		alpha = alpha.substring(1, 27);	
		rotacoes++;
	}
	
	public Integer retornaPosicao(String letra) {
		Integer pos = 0;
		if(alpha.contains(letra.toLowerCase())) {
			Integer x = alpha.indexOf(letra);
			for(int i= 0; i< R1.size()-1; i++) {
				if(R1.get(i) == x) {
					pos = i;
				}
			}
		}
		else {
			pos = -1;
		}
		this.rotacionaRotor();
		return pos;
	}
	
	public Integer returnRotacoes() {
		return rotacoes;
	}
	
}
