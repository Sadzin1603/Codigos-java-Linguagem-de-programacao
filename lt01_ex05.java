package Lote_1;

/*
 * Fazer calculo de 2º Grau
 */

import javax.swing.JOptionPane;

public class lt01_ex05 {
	public static void main(String[] args) {
		
		double a,b,c,delta,raiz1,raiz2;
		
		a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de A"));
		b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de B"));
		c = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de C"));
		
		delta = ((b*b) - 4 * a * c);
		
		if(delta<0) {
			JOptionPane.showMessageDialog(null,"Não existem raizes pois o delta é negativo");
			System.exit(1);
		}
		raiz1=(((-b)+Math.sqrt(delta))/(2*a));
		raiz2=(((-b)-Math.sqrt(delta))/(2*a));
		
		JOptionPane.showMessageDialog(null,"Raiz 1 é de " + Double.toString(raiz1)+
											"\nRaiz 2 é de "+ Double.toString(raiz2));
		
		
		
		
		
	}
}
