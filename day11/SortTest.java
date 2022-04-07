import java.util.*;
public class SortTest{
	public static void main(String[] args){
		System.out.print("人数>>");
		int n = new Scanner(System.in).nextInt();
		int[] points=new int[n];
		for(int i=0;i<n;i++){
			points[i]=new Random().nextInt(101);
		}
		System.out.println(Arrays.toString(points));
		for(int i=0;i<points.length-1;i++){
			for(int j=i+1;j<points.length;j++){
				if(points[i]<points[j]){
					int temp=points[i];
					points[i]=points[j];
					points[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(points));
	}
}
