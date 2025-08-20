package Lote_1;
/*
 * Receba um número inteiro. Calcule e mostre o seu fatorial.
 */
import javax.swing.JOptionPane;
public class lt01_ex32 {
	
	public static void main (String args []) {
		int num,res=1;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		
		for(int x=num;x>0;x--) {
			res = res*x;
		}
		JOptionPane.showMessageDialog(null,"O fatorial do numero é "+(Integer.toString(res)));
		
		
	}
	
}
