package teste;
import javax.swing.JOptionPane;
public class lt02_ex05 {

	public static void main(String[] args) {
		
		int vet[] = new int[20];
		carrega(vet);
		int sum=0;
		for(int x=0;x<10;x++) {
			sum += vet[x] - vet[19-x];
		}
		System.out.println(sum);
		
	}
	public static int[] carrega(int vet[]) {
		for(int x=0;x<20;x++) {
			vet[x]=Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		}
		return vet;
	}
}
