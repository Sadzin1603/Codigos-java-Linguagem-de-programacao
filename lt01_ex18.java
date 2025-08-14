package Lote_1;
/*
 *	Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do maior pelo menor valor.
 */
import javax.swing.JOptionPane;
public class lt01_ex18 {
	public static void main (String args []){
		
		int num1,num2,dif;
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));
		
		if(num1>num2) {
			dif=num1-num2;
		}else {
			dif=num2-num1;
		}
		
		JOptionPane.showMessageDialog(null,"A diferença ente o numero 1 e o numero 2 é "+ Integer.toString(dif));
		
		
		
	}
}
