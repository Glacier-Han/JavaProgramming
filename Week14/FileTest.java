import java.io.*;
import java.util.*;

class FileTest{
	public static void main(String [] args){
		File f1 = new File("file_ex_1.txt"); //상대경로 : 파일 경로를 일부만 작성, 현 클래스가 위치하는 곳에서 해당 파일을 찾음
		System.out.println("파일이 있습니까? : " + f1.exists());
		
		System.out.println();
		
		File f2 = new File("C:\\Users\\PC00\\Desktop\\Week14\\ExampleFiles\\file_ex_1.txt");  //절대경로 : 해당파일 경로 전부 작성. \\ 두번 해야지 \하나로 인식
		System.out.println("파일이 있습니까? : " + f2.exists());
		
		System.out.println();

		File f3 = new File("ExampleFiles\\file_ex_1.txt"); //리눅스는 /로 하위클래스를 나타내고 윈도우는 \로 나타냄. (플랫폼에 상관없이 불가)
		System.out.println("파일이 있습니까? : " + f3.exists());
		
		System.out.println();
		
		File dire = new File("ExampleFiles");
		System.out.println("파일의 이름은?: " + dire.getName());
		System.out.println("폴더입니까? : " + dire.isDirectory());
		
		System.out.println();
		
		File f4 = new File("ExampleFiles" + File.separator + "file_ex_1.txt"); //이렇게 File.separator 사용하면 플랫폼에 독립
		System.out.println("파일이 있습니까? : " + f4.exists());
		System.out.println("파일의 이름은?: " + f4.getName());
		System.out.println("파일의 크기는? : " + f4.length() + "B");
		System.out.println("폴더입니까? : " + f4.isDirectory());
		System.out.println("파일 마지막 수정은? : " + new Date(f4.lastModified()));
		
		
		System.out.println();
		

		
	}
}
