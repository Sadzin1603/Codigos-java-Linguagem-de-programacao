package Lote_1;
/*
 * Receba 2 números reais. Calcule e mostre a diferença desses valores
 */
import javax.swing.JOptionPane;
public class lt01_ex10 {

	public static void main(String[] args) {
		int num1,num2,dif;
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));
		
		dif = num1-num2;
		dif = Math.abs(dif);
		
		JOptionPane.showMessageDialog(null,"A diferença ente o numero 1 e o numero 2 é "+ Integer.toString(dif));

	}

}
