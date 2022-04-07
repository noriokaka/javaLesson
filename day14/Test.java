import java.util.*;
public class Test{
	public static void main(String[] args){
		Random rnd = new Random();
		int[][] sales = new int[12][31];
		for(int i=0;i<sales.length;i++){
			System.out.printf("%2d|",i+1);
			int dayi;
			if(i+1==1 || i+1==3 || i+1==5 || i+1==7 || i+1==8 || i+1==10 || i+1==12){
				dayi=31;
			}else if(i+1==2){
				dayi=28;
			}else{
				dayi=30;
			}
			int sum=0;
			for(int j=0;j<dayi;j++){
				sales[i][j]=rnd.nextInt(41)+10;
				sum+=sales[i][j];
				System.out.print(" "+sales[i][j]);
			}
			for(int j=dayi;j<31;j++){
				System.out.print("  *");
			}
			System.out.printf("|%4d%n",sum);
		}
	}
}
