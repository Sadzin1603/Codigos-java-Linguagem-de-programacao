package Lote_1;
/*
 * Receba os 2 números inteiros. Calcule e mostre a soma dos quadrados.
 */
import javax.swing.JOptionPane;
public class lt01_ex09 {

	public static void main(String[] args) {
		int num1,num2,sum;
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));
		
		sum = (num1*num1)+(num2*num2);
		JOptionPane.showMessageDialog(null, "A soma do quadrado dos numeros é "+Integer.toString(sum));

	}

}
