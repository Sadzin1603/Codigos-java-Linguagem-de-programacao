package Lote_1;

/*
 *  troca de variaveis
 */
import javax.swing.JOptionPane;
public class lt01_ex06 {

	public static void main(String[] args) {
		int a,b,c;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Digite o Valor de A"));
		
		b = Integer.parseInt(JOptionPane.showInputDialog("Digite o Valor de B"));
		
		c=a;
		a=b;
		b=c;
		
		JOptionPane.showMessageDialog(null, "O valor de A é " + Integer.toString(a));
		JOptionPane.showMessageDialog(null, "O valor de B é " + Integer.toString(b));
		

	}

}
