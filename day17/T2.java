import java.util.*;
public class T2{
	public static void main(String[] args){
		int[] shuffles = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(Arrays.toString(shuffles));
		System.out.println();

		System.out.println("レッツ！シャッフル！");
		//メソッドを利用する場所
		shuffleMethod(shuffles);
		System.out.println(Arrays.toString(shuffles));
		System.out.printf("頭の数字：%d",shuffles[0]);
		System.out.println();

		System.out.println("再度！シャッフル！");
		//メソッドを利用する場所
		shuffleMethod(shuffles);
		System.out.println(Arrays.toString(shuffles));
		System.out.printf("頭の数字：%d",shuffles[0]);
	}
	public static int shuffleMethod(int[] shuffles){
		Random rand = new Random();
		for(int i=0;i<shuffles.length-1;i++){
			int idx = rand.nextInt(shuffles.length-i)+i;
			int tmp = shuffles[idx];
			shuffles[idx] = shuffles[i];
			shuffles[i] = tmp;
		}
		return shuffles[0];
	}
}
