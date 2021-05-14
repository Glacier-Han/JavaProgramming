import java.util.*;

class Book{
	private String title;
	private String author;
	private int pages;
	private int price;
	static int count; //static ������ ��� Ŭ������ �����ϴ� �ʵ尡 ��.
	
	int getCount(){
		return count;
	}
	
	Book(){
		this("�ȳ�","�ѻ�",120,11000);
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
		return String.format("���� : %s / ���� : %s / �� %03d������ / ���� : %d��",title, author, pages, price);
	}
	
	/*
	static void speak(){
		//static �޼ҵ�� ��� ��ü�� ������ ����� �����Ѵ�
		//�׷��� non-static (�ν��Ͻ�) ����� ��� �Ұ���
	}
	*/
	
}

class BookTest{
	public static void main(String [] args){
		Book book = new Book();
		Book book1 = new Book("������ ����",23000);
		Book book2 = new Book("��Ŀ�� ����", "YBM", 580, 18000);
		Book book3 = new Book("Power JAVA", "õ�α�", 180, 17000);
		
		System.out.println(book.toString());
		System.out.println(book1.toString());
		System.out.println(book2.toString());
		System.out.println(book3.toString());
		
		System.out.println(book3.getCount());
	}
}