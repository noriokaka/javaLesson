import java.util.*;
public class T3{
	public static void main(String[] args){
		int turnNum = new Random().nextInt(5)+1;
		int attack = new Random().nextInt(50)+1;
		System.out.println("モンスターを見つけた!!");
		System.out.printf("奇襲に成功!%dターンの間、攻撃出来る%n",turnNum);
		if(battle(turnNum,attack)){
			System.out.println("---------------------------");
			System.out.println("モンスターを倒した!!");
		}else{
			System.out.println("---------------------------");
			System.out.println("モンスターを倒しきれなかった・・・");
		}
	}
	static boolean battle(int turnNum,int attack){
		for(int i=0;i<turnNum;i++)
	}
}
