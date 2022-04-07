import java.util.*;
public class Test1{
	public static void main(String[] args){
		int[] arr = new int[10];
		for(int i=0;i<arr.length;i++){
			arr[i] = new Random().nextInt(6)+1;
		}
		System.out.println(Arrays.toString(arr));
	}
}
