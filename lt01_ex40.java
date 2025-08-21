package Lote_1;
/*
 * Receba 2 números inteiros. Verifique e mostre todos os números primos existentes entre eles.
 */
import javax.swing.JOptionPane;
//Tem que usar o big integer pq o int normal, não cabe o tamanho total do valor
import java.math.BigInteger;
public class lt01_ex40 {
    public static void main(String args[]) {
        int num1,num2;
        int menor=0,maior=0;
        int divide=0;
        String txt="";
        
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        
        if(num1<num2) {
        	menor=num1;
        	maior=num2;
        }else if(num1<num2) {
        	menor=num2;
        	maior=num1;
        }else {
        	JOptionPane.showMessageDialog(null,"Numeros iguais");
        }
        
        for(int x=menor;x<=maior;x++) {
        	for(int y=x;y>1;y--) {
        		if(x%y==0 && x!=y) {
        			divide=1;
        			break;
        		}
        		
        	}
        	if(divide==0) {
    			txt+=Integer.toString(x)+" ";
    		}
    		divide=0;
        }
        JOptionPane.showMessageDialog(null, txt);
        
    }
}