package Lote_1;
import javax.swing.JOptionPane;
public class lt02_ex08 {

	public static void main(String[] args) {
		int mat[][] = new int[4][3];
		int vend[] = new int[3];
		int sem[] = new int[4];
		int total=0,soma=0;
		int semana,produto;
		for(semana=0;semana<4;semana++) {
			for(produto=0;produto<3;produto++) {
				mat[semana][produto] = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do	 produto "+Integer.toString(produto+1)+" vendido na semana "+Integer.toString(semana+1)));
				total+=mat[semana][produto];
				soma+=mat[semana][produto];
				vend[produto]+=mat[semana][produto];
				
			}
			sem[semana]=soma;
			soma=0;
		}

        String msgProd = "Quantidade de cada produto vendido no mês:\n";
        for (produto = 0; produto < 3; produto++) {
            msgProd += "Produto " + (produto + 1) + ": " + vend[produto] + "\n";
        }

        String msgSem = "Quantidade de produtos vendidos por semana:\n";
        for (semana = 0; semana < 4; semana++) {
            msgSem += "Semana " + (semana + 1) + ": " + sem[semana] + "\n";
        }

        String msgTotal = "Total de produtos vendidos no mês: " + total;

        JOptionPane.showMessageDialog(null, msgProd + "\n" + msgSem + "\n" + msgTotal);
	}

}
