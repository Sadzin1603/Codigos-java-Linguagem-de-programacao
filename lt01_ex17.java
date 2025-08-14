package Lote_1;
/*
 *	Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l. Receber o tempo de percurso e a velocidade média.
 */
import javax.swing.JOptionPane;
public class lt01_ex17 {
	public static void main (String args []){
		
		double horas,velo,gasto;
		
		horas= Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de horas viajadas"));
		velo= Double.parseDouble(JOptionPane.showInputDialog("Digite a velocidade media do veiculo"));
		
		gasto = (horas*velo)/12;
		
		JOptionPane.showMessageDialog(null,"A quantidade de litros sera de " + Double.toString(gasto));
		
		
		
	}
}
