import java,util.*;
public class RandomTest{
	public class void main{
		//Randomクラスのインスタンス生成
		Random rnd = new Random();
		//Scannerクラスのインスタンス生成
		Scanner scan = new Scanner(System.in);
		System.out.print("要素数>>");
		int[] data = new int[10];
		for(int i=0;i<data.length;i++){
			data[i] = rnd.nextInt(6);
		}
		System.out.println(Arrays.toString(data));
	}
}
