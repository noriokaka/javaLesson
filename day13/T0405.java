import java.util.*;
public class T0405{
	public static void main(String[] args){
		int[][] nums = new int[3][3];
		for(int i=0;i<nums.length;i++){
			for(int j=0;j<nums[i].length;j++){
				nums[i][j] = new Random().nextInt(9)+1;
			}
		}
		for(int i=0;i<nums.length;i++){
			System.out.println(Arrays.toString(nums[i]));
		}
	}
}
