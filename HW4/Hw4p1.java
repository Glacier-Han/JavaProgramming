import java.util.Scanner;

class Hw4p1{
	public static void main(String[] args){
		double x1, x2, y1, y2, width, height;
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.print("�� 1�� x��ǥ : ");
			x1 = sc.nextDouble();
			System.out.print("�� 1�� y��ǥ : ");
			y1 = sc.nextDouble();
			System.out.print("�� 2�� x��ǥ : ");
			x2 = sc.nextDouble();
			System.out.print("�� 2�� y��ǥ : ");
			y2 = sc.nextDouble();
			
			width = x2-x1;
			height = y2-y1;
			
			if(width != 0 && height != 0) break;
			
			System.out.printf("�� (%.2f, %.2f)�� �� (%.2f, %.2f)�� ���簢���� �̷��� �ʽ��ϴ�.\n�ٽ� �Է��� �ּ���.\n",x1,y1,x2,y2);
		}
		
		if(width<0){//���� ���̰� ����
			width *= -1; //����� ��ȯ
		}
		if(height<0){
			height *= -1; 
		}
		
		System.out.println("=========��� ���==========");
		System.out.printf(" - �ѷ��� ����: %.2f\n",2*(width+height));
		System.out.printf(" - ����: %.2f\n",width*height);
		System.out.printf(" - �밢���� ����: %.2f\n",Math.sqrt(Math.pow(width,2)+Math.pow(height,2)));
	}
}
