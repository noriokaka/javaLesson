public class Main{
	public static void main(String[] args){
		//Character c=new Character();
		Dancer d=new Dancer("ゼシカ");
		King k=new King("TEN");
		Matango m=new Matango();
		m.hp=10;
		d.attack(m);
	}
}
