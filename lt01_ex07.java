package Lote_1;
/*
 * Calcular volume do paralelepipedo
 */
import javax.swing.JOptionPane;
public class lt01_ex07 {

	public static void main(String[] args) {
		double comp,larg,alt,vol;
		
		comp = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do comprimento do paralelepipedo"));
		larg = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da largura do paralelepipedo"));
		alt = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura do paralelepipedo"));
		
		vol = comp*alt*larg;
		
		JOptionPane.showMessageDialog(null, "O volume do paralelepipedo é de "+Double.toString(vol));
		
	}

}
