import java.util.*;
public class ArrLesson3{
	public static void main(String[] args){
		int[] dataA={3,5,10};
		//int[] dataB=new int[]{4,6,10};
		int[] dataB;
		dataB=new int[]{4,6,10};
		//普通のFor文
		for(int i=0;i<dataA.length;i++){
			System.out.println(dataA[i]);
		}
		//拡張For文
		for(int n:dataB){
			System.out.println(n);
		}
		System.out.println(Arrays.toString(dataA));
	}
}
