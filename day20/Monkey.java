public class Monkey{
	//フィールド変数
	String name;
	int age;
	//コンストラクター（constructor）
	Monkey(String name,int age){
		this.name=name;
		this.age=age;
	}
	//メソッド
	public void aisa(){
		System.out.printf("こんにちは%s(%d才)です。よろしく！%n",this.name,this.age);
	}
	public void take(){
		System.out.printf("%sは上手に竹馬にのった！%n",this.name);
	}
	public void saka(){
		System.out.printf("%sはひょいと逆立ちをした！%n",this.name);
	}
}
