package Lote_1;
/*
 * Criar e coletar em um vetor [30] real e calcular e exibir:
 * a.	A média do grupo;
 * b.	A quantidade de notas acima do grupo;
 * c.	As posições dos valores abaixo da média do grupo.
 */
import javax.swing.JOptionPane;
public class lt02_ex04 {

	public static void main(String[] args) {
		double vetor[] = new double[30];
		double media=0;
		int maior=0;
		String pos="";
		
		for(int x=0;x<vetor.length;x++) {
			vetor[x] = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero"));
			media+=vetor[x];
		}
		media/=vetor.length;
		for(int x=0;x<vetor.length;x++) {
			if(vetor[x] > media) {
				maior++;
			}else if(vetor[x] < media) {
				pos += Integer.toString(x) + " ";
			}
			
		}
		
		JOptionPane.showMessageDialog(null,"A media é de: "+Double.toString(media));
		JOptionPane.showMessageDialog(null,"A quantidade de numeros maiores que a média é de: "+Integer.toString(maior));
		JOptionPane.showMessageDialog(null,"Posições dos numeros abaixo da media: "+pos);
		
	}

}
