package Lote_1;

public class lt02_ex11 {

	public static void main(String[] args) {
		int mat[][] = new int[8][8];
		int cont=1;
		for(int x=0;x<4;x++) {
			for(int i=0+x;i<8-x;i++) {
				for(int j=0+x;j<8-x;j++) {
					if(i==0+x || j==0+x || i ==7-x || j==7-x) {
						mat[i][j] = cont;
					}
				}
			}
			cont++;
		}
		
		String txt="";
		for(int i=0; i<8;i++) {
			for(int j=0;j<8;j++) {
				txt+=Integer.toString(mat[i][j])+", ";
				
			}
			txt+="\n";
		}
		System.out.println(txt);

	}

}
