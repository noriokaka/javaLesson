import java.util.*;
public class OfficeApp{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("あなたの部下に3人配属されました");
		String[] names=new String[3];
		OfficeWorker[] OWs=new OfficeWorker[3];
		/*for(int i;i<names.length;i++){
			System.out.printf("%d人目の名前を入力してください>",i+1);
			names[i]=sc.nextInt();
			OWs[i]=OfficeWorker[names[i]];
			Ows[i].introduce();
			}*/
		System.out.print("1人目の名前を入力してください>");
		names[0]=sc.nextLine();
		OWs[0]=new EliteOfficeWorker(names[0]);
		OWs[0].introduce();
		System.out.print("2人目の名前を入力してください>");
		names[1]=sc.nextLine();
		OWs[1]=new OrdinaryOfficeWorker(names[1]);
		OWs[1].introduce();
		System.out.print("3人目の名前を入力してください>");
		names[2]=sc.nextLine();
		OWs[2]=new LazyOfficeWorker(names[2]);
		OWs[2].introduce();

		while(true){
			System.out.println("誰の働きぶりを見にいきますか?");
			for(int i=0;i<names.length;i++){
				System.out.printf("%d・・・%s%n",i,names[i]);
			}
			System.out.println("3・・・終了");
			System.out.println("番号を入力してください>");
			int select=sc.nextInt();
			if(select==3) {
				System.out.println("アプリケーションを終了します。");
				break;
			}
			OWs[select].work();
		}
	}
}
abstract class OfficeWorker{
	String name;
	OfficeWorker(String name){
		this.name=name;
	}
	public void introduce(){
		System.out.printf("はじめまして。私は%sです。%n",this.name);
	}
	public abstract void work();
}
class OrdinaryOfficeWorker extends OfficeWorker{
	OrdinaryOfficeWorker(String name){
		super(name);
	}
	@Override
	public void work(){
		System.out.printf("%sは９時から５時まで働いている。遅刻や欠勤はない。%n",name);
	}
}
class EliteOfficeWorker extends OfficeWorker{
	EliteOfficeWorker(String name){
		super(name);
	}
	@Override
	public void work(){
		System.out.printf("%sは仕事がはやい！しかも正確だ。%n",name);
	}
}
class LazyOfficeWorker extends OfficeWorker{
	LazyOfficeWorker(String name){
		super(name);
	}
	@Override
	public void work(){
		System.out.printf("%sはPCの画面を即座に切り替えた。何をしていたのだろう。%n",name);
	}
}
