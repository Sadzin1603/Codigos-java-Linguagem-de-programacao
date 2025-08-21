package Lote_1;
/*
 * Receba 100 números inteiros reais. Verifique e mostre o maior e o menor valor. Obs.: somente valores positivos.
 */
import javax.swing.JOptionPane;
public class lt01_ex38 {
	public static void main (String args []) {
		int num,maior=0,menor=0;
		
		for(int x=0;x<5;x++) {
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
			if(x==0) {
				maior=num;
				menor=num;
			}else {
				if(num>maior) {
					maior=num;
				}
				if(num<menor) {
					menor=num;
				}
			}
		}
		
		JOptionPane.showMessageDialog(null,"O maior numero é "+Integer.toString(maior)+"\nE o menor é "+Integer.toString(menor));
		
	}
	
	
}
