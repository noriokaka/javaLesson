public class King extends Character{
	King(String name){
		super(name);
	}
	public void King(){
		System.out.println(this.name+"は座った");
	}
	@Override
	public void attack(Matango m){
		System.out.println(this.name+"の攻撃！");
		System.out.println("敵に１ポイントのダメージを与えた");
		m.hp-=1;
	}
}
