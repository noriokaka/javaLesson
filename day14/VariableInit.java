import java.util*;
public class variavleInit{
	public static void main(String[] args){
		/* ng
		 * int n;
		 * System.out.println(n);
		 */
		/*
		int n;
		int x=5;
		if(x>5){
			n=10;
		System.out.println(n);
		}
		*/
		/*
		 * OK
		int n;
		if(5>0){
			n=10;
		}
		System.out.println(n);
		*/
		/*
		 * OK
		int n;
		int x=5;
		if(x>0){
			n=10;
		}else{
			n-20;
		}
		System.out.println(n);
		*/
		/*
		 * NG
		int n;
		int x=5;
		if(x>0){
			n=10;
		}else if(x<=){
			n-20;
		}
		System.out.println(n);
		*/
		/*
		 * OK
		int n;
		int x=5;
		if(x>0){
			n=10
		}else if(x<0){
			n=20;
		}else{
			n=30;
		}
		System.out.println(n);
		*/
		/*
		 * OK
		int n = new Random().nextInt(3);
		String fortune;
		switch(n){
     case 0:
			 fortune="大吉";
     case 1:
			 fortune="中吉";
     default:
			 fortune="凶";
		}
		System.out.println(n);
		*/
		/*
		 * OK
		int n;
		do{
			n=10;
		}while(false)
		System.out.println(n);
		*/
		/*
		 * OK
		int n;
		for(;;){
			n=3;
			break;
		}
		System.out.println(n);
		*/
		/*
		 * NG
		int n;
		for(int i=0;i<10;i++){
			n=3;
		}
		System.out.println(n);
		*/
	}
}
