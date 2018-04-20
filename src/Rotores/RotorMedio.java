package Rotores;

import java.util.ArrayList;

public class RotorMedio {
	public static ArrayList<Integer> R2 = new ArrayList<Integer>();
	static String alpha ="abcdefghijklmnopqrstuvwxyz";
	Integer aleatorioRt2[] = { 7, 14, 16, 21, 4, 24, 25, 20, 5, 15, 9, 17, 6, 13, 3, 18, 12, 10, 19, 0, 22, 2, 11, 23, 1, 8 };
	
	static Integer rotacoes = 0;
	
	public RotorMedio(Integer baseNumber) {
		for (int i = baseNumber; i < aleatorioRt2.length; i++) {
			R2.add(aleatorioRt2[i]);
		}
		
		for (int i = 0; i < baseNumber; i++) {
			R2.add(aleatorioRt2[i]);
		}
	}
	
	public static void rotacionaRotor() {
		rotacoes++;
		if(rotacoes == 25) {
			int temp = R2.get(0);
			R2.remove(0);
			R2.add(temp);
			rotacoes= 0;
		}
	}
	
	public char retornaLetra(Integer posicao1) {
		Integer pos = 0;
		if(posicao1 == -10) {
			this.rotacionaRotor();
			return " ".charAt(0);
		}else {
			for(int i= 0; i< R2.size()-1; i++) {
				if(R2.get(i) == posicao1) {
					pos = i;
				}
			}
			this.rotacionaRotor();
			return alpha.charAt(pos);
		}
	}
	
	public Integer returnRotacoes() {
		return rotacoes;
	}
}
