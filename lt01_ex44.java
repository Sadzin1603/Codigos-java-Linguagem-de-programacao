package Lote_1;
/*
 * Calcule e mostre quantos anos serão necessários para que Ana seja maior que Maria sabendo que Ana tem 1,10 m e cresce 3 cm ao ano 
 * e Maria tem 1,5 m e cresce 2 cm ao ano.
 */
import javax.swing.JOptionPane;
//Tem que usar o big integer pq o int normal, não cabe o tamanho total do valor
import java.math.BigInteger;
public class lt01_ex44 {
    public static void main(String args[]) {
        int count=0;
    	double ana=1.1,maria=1.5;
    	
    	while(ana<=maria) {
    		ana+=.03;
    		maria+=.02;
    		count++;
    	}
    	JOptionPane.showMessageDialog(null, "Daqui "+Integer.toString(count)+" Anos Ana será maior que Maria");
    	
    }
}