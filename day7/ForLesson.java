import java.util.*;
public class ForLesson{
	public static void main(String[] args){
		System.out.print("小さい数>>");
		int num1 = new Scanner(System.in).nextInt();
		System.out.print("大きい数>>");
		int num2 = new Scanner(System.in).nextInt();
		int sum = 0;
		for(int i=num1;i<=num2;i++){
			sum+=i;
		}
		System.out.print(num1+"から"+num2+"までの和は"+sum+"です。");
	}
}
