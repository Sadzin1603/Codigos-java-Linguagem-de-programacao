package Lote_1;
/*
 *	Receba 2 valores reais. Calcule e mostre o maior deles.
 */
import javax.swing.JOptionPane;
public class lt01_ex19 {
	public static void main (String args []){
		
		double num1,num2,dif;
		
		num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero"));
		num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero"));
		
		if(num1>num2) {
			dif=num1;
		}else {	
			dif=num2;
		}
		
		JOptionPane.showMessageDialog(null,"O maior numero é "+ Double.toString(dif));
		
		
		
	}
}
