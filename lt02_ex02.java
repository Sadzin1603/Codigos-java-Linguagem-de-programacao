package Lote_1;
/*
 * Criar e coletar um vetor [100] inteiro e exibir:
 * a.	O maior e o menor valor;
 * b.	A média dos valores.
 */
import javax.swing.JOptionPane;
public class lt02_ex02 {

	public static void main(String[] args) {
		int vetor[] = new int[100];
		int maior=0,menor=0;
        double med=0;
        for(int x=0;x<100;x++) {
        	vetor[x] = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        	if(x==0) {
        		menor = vetor[x];
        		maior = vetor[x];
        	}else {
        		if(vetor[x] > maior) {
        			maior = vetor[x];
        		}else if(vetor[x]<menor) {
        			menor = vetor[x];
        		}
        	}
        	//parte da media
    		med+=vetor[x];
        	
        }
        med /= 100;
        
        JOptionPane.showMessageDialog(null, "A media dos valores é de " + Double.toString(med)+"\nO maior numero é "+Integer.toString(maior) + "\nO menor numero é "+Integer.toString(menor));
		
		
		

	}

}
