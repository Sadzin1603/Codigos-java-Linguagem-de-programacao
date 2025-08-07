package Lote_1;
/*
Coletar o valor do lado de um quadrado, calcular sua area e mostrar o resultado.
*/
import javax.swing.JOptionPane;
public class lt01_ex01 {

	public static void main(String[] args) {
		
		int lado,area;
		
		lado = Integer.parseInt(JOptionPane.showInputDialog("Digite o lado do quadrado"));
		
		area=lado*lado;
		
		JOptionPane.showMessageDialog(null, Integer.toString(area));
		
		

	}

}
