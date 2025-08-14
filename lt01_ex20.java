package Lote_1;
/*
 *	Receba 3 coeficientes A, B e C de uma equação do 2º grau da fórmula AX²+BX+C=0. Verifique e mostre a existência de raízes reais e se caso exista, calcule e mostre.
 */
import javax.swing.JOptionPane;
public class lt01_ex20 {
	public static void main (String args []){
		
		double a,b,c,delta;
		String res;
		
		a = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente A"));
		b = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente B"));
		c = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente C"));
		
		delta = Math.sqrt(b*b + 4*a*c);
		
		if(delta >0) {
			res = "duas";
		}else if(delta <0) {
			res = "nenhuma";
		}else {
			res = "uma";
		}
		
		JOptionPane.showMessageDialog(null,"O numero de raizes é "+ res);
		
		
		
	}
}
