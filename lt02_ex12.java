package Lote_1;
import javax.swing.JOptionPane;
public class llt02_ex12 {

	public static void main (String args[]) {
		
		int mat[][] = new int[8][8];
		int soma=0;
		  for (int i = 0; i < 7; i++) {
	            for(int j=0;j<7;j++) {
	            	mat[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo da peça."));
	            }
	        }
		// ou equivalente: ((x % 7) + 7) % 7
		//Explicando para eu mesmo vc pega o numero e pega o resto se x < 7 então x % 7 = x;
		for(int x=0;x<8;x++) {
			for(int y=0;y<8;y++) {
				soma += mat[x][y] % 7;
			}
		}
		System.out.print(soma);
		
	}
	
}
