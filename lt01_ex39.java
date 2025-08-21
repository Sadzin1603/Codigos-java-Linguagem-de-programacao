package Lote_1;
/*
 * Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde:
 * Casa: 	1	2	3	4	...	64
 * Qdte:	1	2	4	8	...	N
 */
import javax.swing.JOptionPane;
//Tem que usar o big integer pq o int normal, não cabe o tamanho total do valor
import java.math.BigInteger;
public class lt01_ex39 {
    public static void main(String args[]) {
        BigInteger total = BigInteger.ZERO;
        BigInteger dois = BigInteger.valueOf(2);

        for (int i = 0; i < 64; i++) {
            total = total.add(dois.pow(i));
        }

        JOptionPane.showMessageDialog(null, "O número total de grãos no tabuleiro é: " + total.toString());
    }
}