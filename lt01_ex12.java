package Lote_1;
/*
 *	Receba o ano de nascimento e o ano atual. Calcule e mostre a sua idade e quantos anos terá daqui a 17 anos.
 */
import javax.swing.JOptionPane;
public class lt01_ex12 {
	public static void main (String args []){
		
		int nasc,atual,idade;
		atual = 2025;
		
		nasc = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu ano de nascimento"));
		
		idade = atual-nasc;
		JOptionPane.showMessageDialog(null,"A sua idade é "+Integer.toString(idade)+".\nE daqui 17 anos você terá "+Integer.toString(idade+17));
		
		
		
	}
}
