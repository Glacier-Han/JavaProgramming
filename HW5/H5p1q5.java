import java.util.Scanner;

class H5p1q5{
	public static void main(String[] args){

		String input, srh;
		int cnt = 1; //���⸦ ã�� Ƚ�� (����)
		int totalcnt=0; //�˻� �ܾ ã�� Ƚ��

		Scanner sc = new Scanner(System.in);
		System.out.print("����: ");
		input = sc.nextLine();
		System.out.print("�˻��� �ܾ�: ");
		srh = sc.nextLine();

		for(int i=0; i<input.length()-srh.length()+1; i++){
			if(input.charAt(i) == ' ')
				//������ ã�� (���� ���� ����)
				cnt++; //������ ã���� ���°���� ���

			if(input.substring(i, i+srh.length()).equalsIgnoreCase(srh)){
				//substring�� �̿��� ���⸦ ã�� ������ �˻��ܾ��� ���̸�ŭ �ܾ� �ڸ���
				//�ڸ� �ܾ �˻��ܾ�� ������ Ȯ���ϰ� ���°���� ���
				System.out.printf("%d��°, ",cnt);
				totalcnt++;
			}


		}

		System.out.printf("\b\b �������� \"%s\"��(��) �˻��Ǿ�, �� %dȸ �˻��Ǿ����ϴ�.",srh,totalcnt);

		//System.out.print(input.length());
		//System.out.print(srh.length());
	}
}
