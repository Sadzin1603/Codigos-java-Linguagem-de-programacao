package Lote_1;
import javax.swing.JOptionPane;
public class lt02_ex07 {

	public static void main(String[] args) {
		
		int vet[] = new int[20];
		vet = carrega(vet);
		
		vet = organiza(vet);
		
		for(int x=0;x<20;x++) {
			System.out.println(vet[x]);
		}
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		int inicio,fim,meio;//Crio um inicio meio e fim
		inicio = 0;
		fim = vet.length;
		while(inicio <= fim) {
			meio = inicio + (fim - inicio) / 2;
			if(vet[meio] == num) {
				JOptionPane.showMessageDialog(null, "O numero está no vetor");
				System.exit(1);
			}else if(num > vet[meio]) {
				inicio = meio+1;
			}else if(num < vet[meio]) {
				fim= meio-1;
			}
		}
		JOptionPane.showMessageDialog(null,"O numero não está no vetor");
		
		
	}
	public static int[] carrega(int vetor[]) {
		for(int x=0;x<20;x++) {
			vetor[x]=(int) (Math.random()*100);
		}
		return vetor;
	}
	//	Bubble
	public static int[] organiza(int vetor[]) {
		int aux;
		 for(int x=0;x<20;x++) {
			 for(int j=19;j>x;j--) {
				 if(vetor[j] < vetor[j-1]) {
					 aux = vetor[j-1];
					 vetor[j-1] = vetor[j];
					 vetor[j] = aux;
				 }
			 }
		 }
		 return vetor;
	}
}