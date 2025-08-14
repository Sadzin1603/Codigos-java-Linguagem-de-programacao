package Lote_1;
/*
 *	Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.
 */
import javax.swing.JOptionPane;
public class lt01_ex22 {
	public static void main (String args []){
		
		double n1,n2;
		String res;
		
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero"));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro numero"));
		
		
		if(n1>n2) {
			res = Double.toString(n2);	
			res += " e "+Double.toString(n1);	
		}else {
			res = Double.toString(n1);
			res += " e "+Double.toString(n2);	
		}
		
		JOptionPane.showMessageDialog(null,res);
		
		
		
	}
}
