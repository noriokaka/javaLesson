public class MonsterApp{
	public static void main(String[] args){
		Goblin g = new Goblin(50,20);
		Werewolf ww = new Werewolf(120,30);
		DeathBat db = new DeathBat(30,20);
		g.attack();
		g.run();
		ww.attack();
		ww.run();
		db.attack();
		db.run();
	}
}
abstract class Monster{
	int hp;
	int mp;
	Monster(int hp,int mp){
		this.hp=hp;
		this.mp=mp;
	}
	abstract void attack();
	abstract void run(); 
}
abstract class WalkingMonster extends Monster{
	WalkingMonster(int hp,int mp){
		super(hp,mp);
	}
	@Override
	void run(){
		System.out.println("トコトコ走って逃げる");
	}
}
abstract class FlyingMonster extends Monster{
	FlyingMonster(int hp,int mp){
		super(hp,mp);
	}
	@Override
	void run(){
		System.out.println("バサバサ飛んで逃げる");
	}
}
class Goblin extends WalkingMonster{
	Goblin(int hp,int mp){
		super(hp,mp);
	}
	@Override
	void attack(){
		System.out.println("ナイフで切りつける");
	}
}
class Werewolf extends WalkingMonster{
	Werewolf(int hp,int mp){
		super(hp,mp);
	}
	@Override
	void attack(){
		System.out.println("噛みつく");
	}
}
class DeathBat extends FlyingMonster{
	DeathBat(int hp,int mp){
		super(hp,mp);
	}
	@Override
	void attack(){
		System.out.println("突っつく");
	}
}
