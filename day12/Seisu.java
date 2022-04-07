import java.util.*;
public class Seisu{
	public static void main(String[] args){
		System.out.print("整数をカンマ区切りで入力>>");
		String str = new Scanner(System.in).nextLine();
		String[] data=str.split(",");
		int sum=0;
		for(int i=0;i<data.length;i++){
			int n = Integer.parseInt(data[i]);
			sum+=n;
		}
		System.out.printf("合計は%dです。%n",sum);
	}
}
