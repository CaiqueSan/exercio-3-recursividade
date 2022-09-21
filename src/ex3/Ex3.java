package ex3;

import javax.swing.JOptionPane;

public class Ex3 {
	
	public static void main(String args[]) {
		int a;
		a = Integer.parseInt((JOptionPane.showInputDialog("Digite um numero")));
		System.out.println(Ex3(a));
	}
	
	public static float Ex3(int n) {
		// condição de parada: se o valor for menor que 2 não será mais possível realizar a fração, que se inicia em 1/2
		// então é retornado 1 para que seja somado aos demais valores
		if (n < 2)
				return 1;
		else {
			float a = n;
			// retorna a divisão feita pelo n atual e a soma com as demais chamadas, a função chama a si mesma enviando n-1 assim a divisão é
			// feita com os divisores em sequência
			return 1/a + (Ex3 (n-1));
		}
	}

}
