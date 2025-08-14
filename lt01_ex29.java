package Lote_1;
/*
 *	Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do investimento. Calcule e mostre o valor 
 *	corrigido em 30 dias sabendo que a poupança = 3% e a renda fixa = 5%. Demais tipos não serão considerados.
 */
import javax.swing.JOptionPane;
public class lt01_ex29 {
	public static void main (String args []){
		
		double valor;
		int tipo;
		
		tipo = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo de investimento."));
		valor = Double.parseDouble(JOptionPane.showInputDialog("Digite a venda media mensal do produto"));
		
		if(tipo==1) {
			valor = valor+(valor*0.03);
			JOptionPane.showMessageDialog(null, "Total depois de 30 dias na poupança: "+Double.toString(valor));
		}else if(tipo==2) {
			valor = valor+(valor*0.05);
			JOptionPane.showMessageDialog(null, "Total depois de 30 dias na renda fixa: "+Double.toString(valor));
		}else {
			JOptionPane.showMessageDialog(null, "Tipo indisponivel");
		}
		
	}
}
