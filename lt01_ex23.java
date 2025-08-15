package Lote_1;
/*
 *	Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não necessariamente em ordem. Mostre os 4 números em ordem crescente.
 */
import javax.swing.JOptionPane;
public class lt01_ex23 {
	public static void main (String args []){
		
		double n1,n2,n3,n4;
		String res;
		
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero"));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro numero maior que o primeiro"));
		n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro numero maior que o segundo"));
		
		n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro numero não necessariamente maior"));
			
		if(n4>n3) {
			JOptionPane.showMessageDialog(null,Double.toString(n1)+", "+Double.toString(n2)+", "+Double.toString(n3)+", "+Double.toString(n4));
		}else if(n4>n2) {
			JOptionPane.showMessageDialog(null,Double.toString(n1)+", "+Double.toString(n2)+", "+Double.toString(n4)+", "+Double.toString(n3));
				
		}else if(n4>n1) {
			JOptionPane.showMessageDialog(null,Double.toString(n1)+", "+Double.toString(n4)+", "+Double.toString(n2)+", "+Double.toString(n3));
		}else {
			JOptionPane.showMessageDialog(null,Double.toString(n4)+", "+Double.toString(n1)+", "+Double.toString(n2)+", "+Double.toString(n3));
		}
		
		
		
		
		
	}
}
