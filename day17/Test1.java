import java.util.*;
public class Test1{
	static void printSquare(char c,int width){
		for(int i=0;i<width;i++){
			for(int j=0;j<width;j++){
				System.out.print(c);
			}
			System.out.println();
		}
	}
	public static void main(String[] args){
		System.out.print("一文字入れてください>");
		String temp = new Scanner(System.in).nextLine();
		char mark = temp.charAt(0);
		System.out.print("幅を入れてください>");
		int num = new Scanner(System.in).nextInt();
		printSquare(mark,num);
	}
}
