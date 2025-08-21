package Lote_1;
/*
 * Receba um número. Calcule e mostre os resultados da tabuada desse número
 */
import javax.swing.JOptionPane;
public class lt01_ex34 {
	
	public static void main (String args []) {
		int num;
		String txt="";
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		
		for(int x=1;x<10;x++) {
			txt+=Integer.toString(num*x)+"\n";
		}
		JOptionPane.showMessageDialog(null,txt);
		
		
	}
	
}
