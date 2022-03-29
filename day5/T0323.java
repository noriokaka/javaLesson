import java.util.*;
public class T0323{
	public static void main(String[] args){
		System.out.print("表裏を入力（表；0，裏：1）>>");
		int you = new Scanner(System.in).nextInt();
		int pc = new Random().nextInt(2);
		String youc;
		String pcc;
		if(you == 0){
			youc = "表";
		}
		else{
			youc = "裏";
		}
		if(pc == 0){
			pcc = "表";
		}
		else{
			pcc = "裏";
		}	
		if(you == pc){
			System.out.println("あなたは" + youc + "、PCは" + pcc );
			System.out.println("あなたの勝ちです。");
		}
		else{
			System.out.println("あなたは" + youc + "、PCは" + pcc );
			System.out.println("あなたの負けです。");
		}
	}
}
