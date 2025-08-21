package Lote_1;
/*
 * Criar e coletar um vetor [50] inteiro. Calcular e exibir:
 * a.	A média dos valores entre 10 e 200;
 * b.	A soma dos números ímpares.
 */
import javax.swing.JOptionPane;
//Tem que usar o big integer pq o int normal, não cabe o tamanho total do valor
import java.math.BigInteger;
public class lt02_ex01 {
    public static void main(String args[]) {
        int vetor[]= new int[50]; 
        int impar=0;
        double med=0,qtd=0;
        for(int x=0;x<50;x++) {
        	vetor[x] = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        	if(vetor[x]%2!=0) {
        		impar+=vetor[x];
        	}
        	if(vetor[x]>=10 && vetor[x]<=200) {
        		qtd++;
        		med+=vetor[x];
        	}
        }
        med /= qtd;
        
        JOptionPane.showMessageDialog(null, "A media dos valores entre 10 e 200 é de " + Double.toString(med)+"\nA soma dos numeros impares é de "+Integer.toString(impar));
    	
    }
}