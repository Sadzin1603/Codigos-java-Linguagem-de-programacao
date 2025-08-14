package Lote_1;
/*
 *	Receba o número de voltas, a extensão do circuito (em metros) e o tempo de duração (minutos). Calcule e mostre a velocidade média em km/h
 */
import javax.swing.JOptionPane;
public class lt01_ex27 {
	public static void main (String args []){
		
		double num,tam,tempo,media;
		
		num = Double.parseDouble(JOptionPane.showInputDialog("Digite o numero de voltas"));
		tam = Double.parseDouble(JOptionPane.showInputDialog("Digite o tamanho da volta"));
		tempo = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo da volta"));
		
		media = (num*tam)/tempo;
		media = media *60/1000;
		
		JOptionPane.showMessageDialog(null, "velocidade média em km/h é "+Double.toString(media));
		
		
		
		
		
	}
}
