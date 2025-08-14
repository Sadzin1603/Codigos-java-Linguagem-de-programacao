package Lote_1;
/*
 *	Receba a quantidade de horas trabalhadas, o valor por hora, o percentual de desconto e o número de dependentes. Calcule o salário que serão as horas trabalhadas x o valor por hora. Calcule o salário líquido (= Salário Bruto – desconto). A cada dependente será acrescido R$ 100 no Salário Líquido. Exiba o salário a receber
 */
import javax.swing.JOptionPane;
public class lt01_ex16 {
	public static void main (String args []){
		
		double horas,valor,desconto,dependentes,salario;
		
		horas= Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas"));
		valor= Double.parseDouble(JOptionPane.showInputDialog("Digite o valor por hora"));
		desconto = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de desconto")); 
		dependentes = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de dependentes"));
		
		desconto/=100;
		
		salario = horas*valor;
		
		salario-=salario*desconto;
		salario += 100*dependentes;
		
		JOptionPane.showMessageDialog(null,"O salario final será de " + Double.toString(salario));
		
		
		
	}
}

