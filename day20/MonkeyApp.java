import java.util.*;
public class MonkeyApp{
	public static void main(String[] args){
		Monkey m = new Monkey();
		Scanner scan = new Scanner(System.in);
		System.out.print("おさるの名前を決めてください:>");
		m.name = scan.nextLine();
		System.out.print("おさるの歳を決めてください:>");
		m.age = scan.nextInt();
		int gei;
		do{
			System.out.print("おさるに何をさせますか？1…挨拶、2…竹馬、3…逆立ち、4…終了>");
			gei = scan.nextInt();
			switch(gei){
				case 1:
					m.aisa();
					break;
				case 2:
					m.take();
					break;
				case 3:
					m.saka();
					break;
				case 4:
					break;
			}
		}while(gei != 4);
		System.out.println("アプリケーションを終了します");
	}
}
