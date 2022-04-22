import java.util.*;
public class BookApp{
	public class void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("本のページ数を入力して下さい >");
		int page=sc.nextInt();
		System.out.print("本の価格を入力して下さい >");
		int price=sc.nextInt();
		while(true){
			System.out.print("1. 本の情報表示 / 2. ノートの情報表示 / 3. ノートに追加書込 / 4.   終了>");
			String select=sc.nextLine();
			switch(select){
case 1;
				}
			}
		}
	}
}

public class Book{
	int page;
	int price;
	public Book(int page,int price){
		this.page=page;
		this.price=price;
	}
	public void show(){
		System.out.printf("ページ数：%d%n",page)
			System.out.printf("価格：%d%n",price)
	}
}

public class NoteBook extends Book{
	String add;
	String note;
	public NoteBook(int pageN,int priceN){
		this.page=pageN;
		this.price=priceN;
	}
	public NoteBook(String add){
		this.add=add;
	}
	public void showN(){
		System.out.printf("内容：%s%n",note)
	}
	public String write(){
		note+=this add;
	}
}
