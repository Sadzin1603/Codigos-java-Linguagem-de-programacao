package Lote_1;
/*
 * Celsius to Farenhait 
 */

import javax.swing.JOptionPane;
public class lt01_ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//(9*Celsius+160)/5
		double C,F;
		C = Double.parseDouble(JOptionPane.showInputDialog("Digite o a temperatura em graus Celsius"));
		
		F = (9*C+160)/5;
		
		JOptionPane.showMessageDialog(null, "A temperatura em farenhait é de "+ Double.toString(F) +"º");
		
		
	}

}
