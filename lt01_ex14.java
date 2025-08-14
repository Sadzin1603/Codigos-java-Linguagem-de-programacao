package Lote_1;
/*
 *	Receba 2 ângulos de um triângulo. Calcule e mostre o valor do 3º ângulo.
 */
import javax.swing.JOptionPane;
public class lt01_ex14 {
	public static void main (String args []){
		
		double ang1,ang2,ang3;
		
		ang1= Double.parseDouble(JOptionPane.showInputDialog("Digite o 1º angulo do triângulo"));
		ang2= Double.parseDouble(JOptionPane.showInputDialog("Digite o 2º angulo do triângulo"));
		
		ang3=180-(ang2+ang1);
		
		JOptionPane.showMessageDialog(null,"O 3º angulo do triangulo é de " + Double.toString(ang3));
		
		
		
	}
}
