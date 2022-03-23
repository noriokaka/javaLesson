import java.util.*;
public class DiceApp{
  public static void main(String[] srgs){
		/*
		 * サイコロを振って偶数か奇数かを判定する
		 * （実行結果）
		 * 4は偶数です。
		 * 1は奇数です、
		 */
  int number = new Random().nextInt(6)+1;
	int guki = number % 2;
		if(guki == 0){
			 System.out.print(number + "は偶数です。");
		}
    else{
			System.out.print(number + "は奇数です。");
		}
	}
}
