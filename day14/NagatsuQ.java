import java.util.*;
public class NagatsuQ{
	public static void main(String[] args){
		char[] pats = {'A','B','C','D','E'};
		Random rnd = new Random();
		System.out.print("行数>>");
		int row = new Scanner(System.in).nextInt();
		for(int i=1;i<=row;i++){
			System.out.printf("%d:",i);
			int coli = rnd.nextInt(10)+1;
			for(int j=1;j<=coli;j++){
				int idx = rnd.nextInt(5);
				System.out.print(pats[idx]);
			}
			System.out.println();
		}
	}
}
