package ex3;

import javax.swing.JOptionPane;

public class Ex3 {
	
	public static void main(String args[]) {
		int a;
		a = Integer.parseInt((JOptionPane.showInputDialog("Digite um numero")));
		System.out.println(Ex3(a));
	}
	
	public static float Ex3(int n) {
		// condi��o de parada: se o valor for menor que 2 n�o ser� mais poss�vel realizar a fra��o, que se inicia em 1/2
		// ent�o � retornado 1 para que seja somado aos demais valores
		if (n < 2)
				return 1;
		else {
			float a = n;
			// retorna a divis�o feita pelo n atual e a soma com as demais chamadas, a fun��o chama a si mesma enviando n-1 assim a divis�o �
			// feita com os divisores em sequ�ncia
			return 1/a + (Ex3 (n-1));
		}
	}

}
