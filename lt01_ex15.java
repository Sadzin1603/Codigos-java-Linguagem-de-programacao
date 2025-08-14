package Lote_1;
/*
 *	Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre a hipotenusa.
 */
import javax.swing.JOptionPane;
public class lt01_ex15 {
	public static void main (String args []){
		
		double cat1,cat2,hip;
		
		cat1= Double.parseDouble(JOptionPane.showInputDialog("Digite o 1º cateto do triângulo"));
		cat2= Double.parseDouble(JOptionPane.showInputDialog("Digite o 2º cateto do triângulo"));
		
		hip=Math.sqrt((cat1*cat1)+(cat2*cat2));
		
		JOptionPane.showMessageDialog(null,"A hipotenusa do triangulo é de " + Double.toString(hip));
		
		
		
	}
}
