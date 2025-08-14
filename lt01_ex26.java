package Lote_1;
/*
 *	Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo do menor.
 */
import javax.swing.JOptionPane;
public class lt01_ex26 {
	public static void main (String args []){
		
		double n1,n2;
		
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero"));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero"));
		
		if(n1<n2) {
			if(n2%n1==0) {
				JOptionPane.showMessageDialog(null, "O maior numero é múltiplo pelo menor");
			}else {
				JOptionPane.showMessageDialog(null, "O maior numero não é múltiplo pelo menor");
			}
		}else {
			if(n1%n2==0) {
				JOptionPane.showMessageDialog(null, "O maior numero é múltiplo pelo menor");
			}else {
				JOptionPane.showMessageDialog(null, "O maior numero não é múltiplo pelo menor");
			}
		}
		
		
		
		
		
	}
}
