package Lote_1;
/*
 *  
 */

import javax.swing.JOptionPane;//Importar o JOptionPane

public class lt01_ex03 {

	public static void main(String[] args) {
		
		double base,altura,area; //Definição de variaveis
		base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do triângulo"));//input para o usuario
		altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do triângulo"));//input para o usuario
		
		area =(altura*base)/2;//Calculo da area
		
		JOptionPane.showMessageDialog(null, "A area do triâgulo é de  "+ Double.toString(area));//mostra o resultado

	}

}
