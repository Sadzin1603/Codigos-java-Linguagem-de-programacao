package Lote_1;
/*
 * Mostre todas as possibilidades de 2 dados de forma que a soma tenha como resultado 7.
 */
import javax.swing.JOptionPane;
//Tem que usar o big integer pq o int normal, não cabe o tamanho total do valor
import java.math.BigInteger;
public class lt01_ex41 {
    public static void main(String args[]) {
        String txt="";
        for(int x=1;x<=6;x++) {
        	for(int y=1;y<=6;y++) {
        		if(x+y==7) {
        			if(txt!="") {
        				txt+="\n";
        			}
        			txt+="D1 = "+ Integer.toString(x)+" D2 = "+ Integer.toString(y);
        		}
        	}
        }
        JOptionPane.showMessageDialog(null, txt);
        
    }
}