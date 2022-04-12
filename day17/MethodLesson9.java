import java.util.*;
public class MethodLesson9{
	static double calcBMI(double weightKg,double heightCm){
		double bmi = weightKg/(heightCm/100)/(heightCm/100);
		return bmi;
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("体重を入力してください(kg)>");
		double weightKg = scan.nextDouble();
		System.out.print("身長を入力してください(cm)>");
		double heightCm = scan.nextDouble();
		System.out.printf("体重：%.1f,身長：%.1fのBMIは%.1fです%n",weightKg,heightCm,calcBMI(weightKg,heightCm));
	}
}
