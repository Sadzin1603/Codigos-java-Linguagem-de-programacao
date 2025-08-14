package Lote_1;
/*
 *	Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3
 */
import javax.swing.JOptionPane;
public class lt01_ex24 {
	public static void main (String args []){
		
		double n1;
		
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero"));
		
		if(n1%2==0 && n1%3==0) {
			JOptionPane.showMessageDialog(null, "O numero é divisel por 3 e por 2");
		}else {
			JOptionPane.showMessageDialog(null, "O numero não é divisel por 3 e por 2");
		}
		
		
		
		
		
	}
}
