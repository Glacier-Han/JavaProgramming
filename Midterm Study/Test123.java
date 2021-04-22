//사용자로부터 실수 하나를 입력 받고, 입력 받은 실수의 ①정수 부분의 절댓값과, 그 절댓값에 ②8을
//곱한 값, 8로 나눈 ③몫과 ④나머지를 출력하시오.
//- 비트 연산자만 사용할 것(*, /, % 사용하지 말 것).
//- 입력 받은 수가 양수인지 음수인지 확인하는 과정에서 부등호 사용하지 말 것.
//- Hint. 캐스팅(Casting, 형 변환)을 적절히 활용할 것.

import java.util.*;
class Tes123{
	public static void main(String[] args){
		System.out.print("실수: ");
		double a;
		int inta;
		int absa;
		Scanner sc = new Scanner(System.in);
		a = sc.nextDouble();

		inta = (int)a;
		absa = (int)a*-1;
		if(inta>>31 == 0){
			System.out.printf("%d, %d, %d, %d\n",inta,inta<<3,inta>>3,inta&3);
		}

		else System.out.printf("%d, %d, %d, %d\n",absa,absa<<3,absa>>3,absa&3);
  }
}
