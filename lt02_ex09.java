package Lote_1;

public class lt02_ex09 {

	public static void main(String[] args) {
		int mat[][] = new int[4][4];
		int cont=0;
		
		String txt="";
		
		for(int i=0; i<4;i++) {
			for(int j=0;j<4;j++) {
				if(i==j) {
					mat[i][j]=(int) Math.pow(4,cont);
					cont++;
				}
			}
		}
		for(int i=0; i<4;i++) {
			for(int j=0;j<4;j++) {
				txt+=Integer.toString(mat[i][j])+", ";
				
			}
			txt+="\n";
		}
		System.out.println(txt);

	}

}
