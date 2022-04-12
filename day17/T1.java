public class T1{
	public static void main(String[] args){
		printMethod("佐々木");
	}
	static void printMethod(String name){
		System.out.printf("%sは走った%n",name);
		System.out.println("お腹の肉が気になり走った");
		System.out.printf("頑張って走った結果、%sはちょっと痩せた%n",name);
		System.out.printf("%sは痩せて嬉しくなって、お菓子を食べた%n",name);
		System.out.println();
		System.out.println("太った");
	}
}

