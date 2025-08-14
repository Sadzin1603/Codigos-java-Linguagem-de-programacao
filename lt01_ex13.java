package Lote_1;
/*
 *	Receba a quantidade de alimento em quilos. Calcule e mostre quantos dias durará esse alimento sabendo que a pessoa consome 50g ao dia
 */
import javax.swing.JOptionPane;
public class lt01_ex13 {
	public static void main (String args []){
		
		double qtd,consumo,dias;
		
		qtd = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de alimento(em kilos)."));
		
		qtd *= 1000;
		
		consumo= 50;
		dias = qtd/consumo;
		dias=Math.floor(dias);
		
		JOptionPane.showMessageDialog(null, "Você conseguirá se alimentar (comendo "+Double.toString(consumo)+"g por dia) por "+ Double.toString(dias)+" dias.");
		
		
		
	}
}
