package Lote_1;
/*
 *	28.	Receba o preço atual e a média mensal de um produto. Calcule e mostre o novo preço sabendo que:
 *	Venda Mensal	Preço Atual	Preço Novo
 *	< 500	< 30	+ 10%
 *	>= 500 e < 1000	>= 30 e < 80	+15%
 *	>= 1000	>= 80	- 5%
 *	Obs.: para outras condições, preço novo será igual ao preço atual.
 */
import javax.swing.JOptionPane;
public class lt01_ex28 {
	public static void main (String args []){
		
		double preco,media;
		
		preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto"));
		media = Double.parseDouble(JOptionPane.showInputDialog("Digite a venda media mensal do produto"));
		
		if(media<500 && preco <30) {
			preco *=1.1;
		}else if(media >=500 && media <1000 && preco >=30 && preco<80) {
			preco *=1.15;
		}else if(media >=1000 && preco>=80) {
			preco *=1.05;
		}
		
		JOptionPane.showMessageDialog(null, "Novo preço do produto é " + Double.toString(preco));
		
		
		
		
		
	}
}
