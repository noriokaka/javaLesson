import java.util.*;
public class Swap{
	public static void main(String[] args){
		int[] balls={1,2,3,4,5,6};
		for(int i=0;i<balls.length-1;i++){
			int index=new Random().nextInt(balls.length-i)+i;
			int temps=balls[index];
			balls[index]=balls[i];
			balls[i]=temps;
		}
		System.out.println(Arrays.toString(balls));
	}
}
