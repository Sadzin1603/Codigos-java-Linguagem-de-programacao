package Lote_1;
/*
 *  Receba 2 números inteiros, verifique qual o maior entre eles. Calcule e mostre o resultado da somatória dos números ímpares entre esses valores
 */
import javax.swing.JOptionPane;
public class lt01_ex35 {
	
	public static void main (String args []) {
		int num1,num2,res=0;
    int maior,menor;
    
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
    num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));

    if(num1>num2){
      maior = num1;
      menor = num2;
    }else if(num2>num1){
      maior = num2;
      menor = num1;
    }else{
      JOptioonPane.showMessageDialog(null,"Numeros identicos");
      System.exit(0);
    }
		
		for(int x=num1;x<num2;x++) {
      if(x%2!=0){
        res+=x;
      }
			
		}
		JOptionPane.showMessageDialog(null,"A soma dos numeros impares entre o menor e o maior numero é de  "+(Integer.toString(res)));
		
		
	}
	
}
