import java.util.*;

class Book{
	private String title;
	private String author;
	private int pages;
	private int price;
	static int count; //static 붙으면 모든 클래스가 공유하는 필드가 됨.
	
	int getCount(){
		return count;
	}
	
	Book(){
		this("안녕","한샘",120,11000);
	}
	
	Book(String title, int price){
		count++;
		this.title = title;
		this.price = price;
	}
	
	
	Book(String title, String author, int pages, int price){
		this(title, price);
		this.author = author;
		this.pages = pages;  
	}
	
	public String toString(){
		return String.format("제목 : %s / 저자 : %s / 총 %03d페이지 / 정가 : %d원",title, author, pages, price);
	}
	
	/*
	static void speak(){
		//static 메소드는 모든 객체가 동일한 결과를 내야한다
		//그래서 non-static (인스턴스) 멤버는 사용 불가함
	}
	*/
	
}

class BookTest{
	public static void main(String [] args){
		Book book = new Book();
		Book book1 = new Book("수학의 정석",23000);
		Book book2 = new Book("해커스 토익", "YBM", 580, 18000);
		Book book3 = new Book("Power JAVA", "천인국", 180, 17000);
		
		System.out.println(book.toString());
		System.out.println(book1.toString());
		System.out.println(book2.toString());
		System.out.println(book3.toString());
		
		System.out.println(book3.getCount());
	}
}