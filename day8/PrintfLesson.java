import java.util.*;
public class PrintfLesson{
	public static void main(String[] args){
		System.out.println(Math.PI);
		System.out.printf("%.2f%n",Math.PI);
		System.out.println("Hello");
		
		int num = 86181185;
		System.out.printf("%,d",num);

		String name = "山田";
		int age = 23;
		System.out.printf("こんにちは%s(%d歳)さん！%n",name,age);		
		System.out.printf("%,6d%n",34);
		System.out.printf("%,6d%n",2353);
		System.out.printf("%,6d%n",545);
		System.out.printf("%,6d%n",56456);
	}
}
