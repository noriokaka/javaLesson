import java.util.*;
public class Fortune{
	public static void main(String[] srgs){
		String[] fortunes={
			"大吉",
			"中吉",
			"吉",
			"凶",
		};
		int idx=new Random().nextInt(fortunes.length);
		System.out.printf("今日の運勢は%sです%n",fortunes[idx]);
	}
}
