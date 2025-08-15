package Lote_1;
import java.awt.JobAttributes;

/*
 * Receba a hora de início e de final de um jogo (HH,MM), calcular o tempo do jogo em horas e minutos, sabendo que o tempo
 * máximo é menor que 24 horas e pode começar num dia e terminar noutro.
 */
import javax.swing.JOptionPane;
public class lt01_ex25 {

	public static void main(String[] args) {
		
		int hora_ini,min_ini,hora_fim,min_fim,horas,mins;
		
		hora_ini = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora de inicio"));
		min_ini = Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto de inicio"));
		hora_fim = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora de fim"));
		min_fim = Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto de fim"));
		
		// Fazer com forma de horas para minutos
		int mins_ini = hora_ini*60+min_ini;
		int mins_fim = hora_fim*60+min_fim;
		
		int duracao;
		if(mins_ini<mins_fim) {
			duracao = mins_fim-mins_ini;
		}else {//começou de noite e passou para outro dia
			duracao = (24*60 - mins_ini)+mins_fim; //calculo maluco q eu precisaria de papel para fazer na hora
		}
		horas=duracao / 60;
		mins=duracao % 60;
		
		JOptionPane.showMessageDialog(null, "Tempo de jogatina de "+Integer.toString(horas)+" horas e de "+ Integer.toString(mins)+" minutos");

	}

}
