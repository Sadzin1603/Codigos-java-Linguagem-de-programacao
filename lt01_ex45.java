package Lote_1;
/*
 * 45.	Calcule e mostre a série 1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225 
 */
import javax.swing.JOptionPane;
//Tem que usar o big integer pq o int normal, não cabe o tamanho total do valor
import java.math.BigInteger;
public class lt01_ex45 {
    public static void main(String args[]) {
        double res=1;
        
        for(double x=2;x<=15;x++) {
        	if(x%2==0) {
        		res-=x/(x*x);
        	}else {
        		res+=x/(x*x);
        	}
        }
        JOptionPane.showMessageDialog(null, "Resultado = "+Double.toString(res));
    	
    }
}