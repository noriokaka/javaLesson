import java.util.*;
public class SlotMethod{
	public static void main(String[] args){
		Random rnd = new Random();
		int[][] slots = new int[3][3];
		for(int i=0;i<slots.length;i++){
			for(int j=0;j<slots[i].length;j++){
				slots[i][j]=rnd.nextInt(3)+1;
				System.out.print(slots[i][j]);
			}
			System.out.println();
		}
		int sum=0;
		for(int i=0;i<slots.length;i++){
			if(isSame(slots[i])){
				sum++;
			}
		}
		if(sum==0){
			System.out.println("Lose...");
		}else{
			System.out.printf("%d line win!!",sum);
		}
	}
	public static boolean isSame(int[] arr){
		int first=arr[0];
		for(int i=1;i<arr.length;i++){
			if(first != arr[i]){
				return false;
			}
		}
		return true;
	}
}
