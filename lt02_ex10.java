package Lote_1;

public class lt02_ex10 {
	
	public static void main(String args[]) {
		double mat[][] = new double[8][8];
		int cont = 0;
		double soma = 0;
		
		for(int i=0; i<8; i++) {
			for(int j=0; j<8; j++) {
				mat[i][j] = pow(2, cont); // usando Math.pow direto
				System.out.println(mat[i][j]);
				soma += mat[i][j];
				cont++;
			}
		}
		
		System.out.println("Soma dos valores: " + soma);
	}
	public static double pow(double num,int qtd) {
		double res=num;
		if(qtd==0) {
			return 1;
		}else {
			if(qtd>1) {
				res *= pow(num,qtd-1);
				return res;
			}else {
				return num;
			}
		} 
		 
	} 
	
}
