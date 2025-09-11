package teste;
import javax.swing.JOptionPane;
public class ATV {
	public static void main(String args[]) {
		int opc=0;
		int vet[] = new int[4];
		while (opc!=9){
			opc= Integer.parseInt(JOptionPane.showInputDialog(" 1 - Carrega Vetor \n 2 - Classifica Vetor \n 3 - Mostra Vetor \n 9 - Fim"));
			switch(opc) {
				case 1:
					carrega_vet(vet);
					break;
				case 2:
					//vet = bubble(vet);
					vet = bubble_class(vet);
					break;
				case 3:
					mostra_vet(vet);
					break;
				case 9:
					JOptionPane.showMessageDialog(null,"FIM");
					System.exit(1);
					break;
			}
		}
		
		
	}
	public static int[] carrega_vet(int vetor[]) {
		for(int x=0;x<4;x++) {
			vetor[x] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para o vetor"));
		}
		return vetor;
	}
	public static void mostra_vet(int vetor[]) {
		String res = "";
		for(int x=0;x<vetor.length;x++) {
			res += Integer.toString(vetor[x])+" ";
		}
		JOptionPane.showMessageDialog(null, res);
	}
	public static int[] bubble(int vetor[]) {
		int aux;
		for(int x=0;x<4;x++) {
			for(int j=1;j<4-x;j++) {
				if(vetor[j] <vetor[j-1]) {
					aux = vetor[j-1];
					vetor[j-1] = vetor[j];
					vetor[j] = aux;
				}
			}
		}
		return(vetor);
	}
	public static int[] bubble_class(int vetor[]) {
		int aux;
		for(int x=0;x<4;x++) {
			for(int j=3;j>x;j--) {
				if(vetor[j]<vetor[j-1]) {
					aux = vetor[j-1];
					vetor[j-1] = vetor[j];
					vetor[j] = aux;
				}
			}
		}
		
		return vetor;
	}
	
}
