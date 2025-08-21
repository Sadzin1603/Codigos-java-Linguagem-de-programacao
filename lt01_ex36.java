package Lote_1;
/*
 * Receba um número. Calcule e mostre os resultados da tabuada desse número
 */
import javax.swing.JOptionPane;
public class lt01_ex36 {
	
	public static void main (String args []) {
		double num,res=1,fat=1;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		
		for(double x=1;x<=num;x++) {
			fat=1;
			for(double j = x;j>1;j--) {
				fat=fat*j;
			}
			res+=1/fat;
		}
		JOptionPane.showMessageDialog(null,"Numero da sequencia "+ Double.toString(res));
		
		
	}
	
}
