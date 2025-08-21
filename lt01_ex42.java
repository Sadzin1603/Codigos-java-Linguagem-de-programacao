package Lote_1;
/*
 * Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99
 */
import javax.swing.JOptionPane;
//Tem que usar o big integer pq o int normal, não cabe o tamanho total do valor
import java.math.BigInteger;
public class lt01_ex42 {
    public static void main(String args[]) {
        double res=1,n2=3;
    	
    	for(double x = 2;x<=50;x++) {
    		res+=x/n2;
    		n2+=2;
    	}
        System.out.println(res);
    }
}