import java.util.*;
public class Ex2_3{
	public static void main(String[] args){
		System.out.println("ようこそ占いの館へ");
		System.out.print("あなたの名前を入力してください");
		String name = new Scanner(System.in).nextLine();
		System.out.print("あなたの年齢を入力してください");
		String ageString = 
			new Scanner(System.in).nextLine();
		int age = Integer.parseInt(ageString);
		int fortune = new Random().nextInt(4);
		fortune++;
		System.out.println("占いの結果が出ました！");
		System.out.println(age + "歳の" + name + "さん、あなたの運気番号は" + fortune + "です");
		System.out.println("１：大吉　２；中吉　３：吉　４：凶");

	}
}
