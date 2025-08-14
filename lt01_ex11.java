package Lote_1;
/*
 * Receba o raio de uma circunferência. Calcule e mostre o comprimento da circunferência.
 */
import javax.swing.JOptionPane;
public class lt01_ex11 {

	public static void main(String[] args) {
		double raio,comp;
		
		raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio do circulo"));
		
		comp = 2 * Math.PI *raio;
		
		JOptionPane.showMessageDialog(null,"O comprimento da circunferência é " + Double.toString(comp));

	}

}
