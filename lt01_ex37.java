package Lote_1;
/*
 * Receba um número inteiro. Calcule e mostre a série de Fibonacci até o seu N’nésimo termo
 */
import javax.swing.JOptionPane;
public class lt01_ex37 {
	public static int fibo(int n) {
		if(n==0) {
			return 0;
		}else if(n==1) {
			return 1;
		}
		return fibo(n-1)+fibo(n-2);
	}
	public static void main (String args []) {
		int num,res;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		for(int x =1;x<=num;x++) {
			res = fibo(x);
			JOptionPane.showMessageDialog(null,"Numero da sequencia = "+Integer.toString(res));
		}
		
		
	}
	
	
}
