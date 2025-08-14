package Lote_1;
/*
 * Receba o valor de um depósito em poupança. Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a. m.
 */
import javax.swing.JOptionPane;
public class lt01_ex08 {

	public static void main(String[] args) {
		double deposito,juros,montante,meses;
		meses=1;
		juros = 1.3/100;
		
		deposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do deposito"));
		montante = deposito+(deposito*juros*meses);
		
		JOptionPane.showMessageDialog(null,"O total depois de 1 mês será de " + Double.toString(montante));
	}

}
