import java.util.*;
public class NagatsuMain{
	public static void main(String[] args){
		int count=0;
		long orig = 1L;
		while(true){
			count++;
			orig = orig*2;
			System.out.println(count + "回折り曲げた（"+orig+"mm)");
			if(orig >= 384400000000L){
				break;
			}
		}
		System.out.println(count + "回折り曲げたら月に到達します。");
	}
}

