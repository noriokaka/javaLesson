public class Dancer extends Character{
	Dancer(String name){
		super(name);
	}
	public void dance(){
		System.out.println(this.name+"は情熱的に踊った");
	}
	@Override
	public void attack(Matango m){
		System.out.println(this.name+"の攻撃！");
		System.out.println("敵に５ポイントのダメージを与えた");
		m.hp-=5;
	}
}
