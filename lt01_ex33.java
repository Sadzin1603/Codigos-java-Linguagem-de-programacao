package Lote_1;
/*
 * Receba um número. e mostre a serie 1 +1/2+1/3+...+1/n
 */
import javax.swing.JOptionPane;
public class lt01_ex33 {
	
	public static void main (String args []) {
		double num,res=1;
		
		num = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero"));
		
		for(int x=num;x>0;x--) {
			res+=1/x;
		}
		JOptionPane.showMessageDialog(null,"O fatorial do numero é "+(Integer.toString(res)));
		
		
	}
	
}
