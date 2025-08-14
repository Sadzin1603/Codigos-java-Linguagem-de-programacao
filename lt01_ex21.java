package Lote_1;
/*
 *	21.	Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética. Mostre a mensagem de acordo com a média:
 * a.	Se a média for >= 6,0 exibir “APROVADO”;
 * b.	Se a média for >= 3,0 E < 6,0 exibir “EXAME”;
 * c.	Se a média for < 3,0 exibir “RETIDO”.
 */
import javax.swing.JOptionPane;
public class lt01_ex21 {
	public static void main (String args []){
		
		double n1,n2,media;
		String res;
		
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente A"));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente B"));
		
		media=(n1+n2)/2;
		
		if(media >=6) {
			res = "APROVADO";
		}else if(media>=3) {
			res = "EXAME";
		}else {
			res = "RETIDO";
		}
		
		JOptionPane.showMessageDialog(null,res);
		
		
		
	}
}
