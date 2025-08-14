package Lote_1;
/*
 *	Receba a hora de início e de final de um jogo (HH,MM), calcular o tempo do jogo em horas e minutos, sabendo que o tempo máximo é menor que 24 horas e pode começar num dia e terminar noutro.
 */
import javax.swing.JOptionPane;
public class lt01_ex25 {
	public static void main (String args []){
		
		double n1;
		
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero"));
		
		if(n1%2==0 && n1%3==0) {
			JOptionPane.showMessageDialog(null, "O numero é divisel por 3 e por 2");
		}else {
			JOptionPane.showMessageDialog(null, "O numero não é divisel por 3 e por 2");
		}
		
		
		
		
		
	}
}
