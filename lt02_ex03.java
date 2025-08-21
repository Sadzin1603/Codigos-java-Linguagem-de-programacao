package Lote_1;
/*
 * Criar e coletar valores inteiros nos vetores VT1[3] e VT2[3]. 
 * Concatenar esses valores em um 3º vetor (VT3[6]) e mostrar os seus dados. P. ex:
 * VT1|	1|	2|	3|	|VT2|	4|	5|	6|	|VT3|	1|	2|	3|	4|	5|	6
 * 
 */
import javax.swing.JOptionPane;
public class lt02_ex03 {

	public static void main(String[] args) {
		int vetor1[] = new int[3];
		int vetor2[] = new int[3];
		int vetor3[] = new int[6];
		
		String txt="";
		
		for(int x=0;x<3;x++) {
			vetor1[x] = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero para o vetor1"));
		}
		for(int x=0;x<3;x++) {
			vetor2[x] = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero para o vetor2"));
		}
		for(int x=0;x<6;x++) {
			if(x<3) {
				vetor3[x]=vetor1[x];
			}else {
				vetor3[x]=vetor2[x-3];
			}
		}
		txt+="VETOR 1: ";
		for(int x=0;x<vetor1.length;x++) {
			txt+= Integer.toString(vetor1[x])+" ";
		}
		txt+="\n";
		txt+="VETOR 2: ";
		for(int x=0;x<vetor2.length;x++) {
			txt+= Integer.toString(vetor2[x])+" ";
		}
		txt+="\n";
		txt+="VETOR 3: ";
		for(int x=0;x<vetor3.length;x++) {
			txt+= Integer.toString(vetor3[x])+" ";
		}
		
        JOptionPane.showMessageDialog(null, txt);
        
	}

}
