package Lote_1;
/*
 * Receba o salario de um funcionario e mostre o onvo salário com reajuste de 15% 
 */

import javax.swing.JOptionPane;//Importar o JOptionPane

public class lt01_ex02 {	

	public static void main(String[] args) {
		
		double salario; //Definição de variavel
		salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salario"));//input para o usuario
		
		salario *=1.15;//Rejuste de salario
		
		JOptionPane.showMessageDialog(null, "O salario reajustado é de "+ Double.toString(salario));

	}

}
