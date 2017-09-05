
public class Calc {

	public static void main(String[] args) {

		Change change = new Change();
		change.calc(10000, 3750);
		
		Change newChange = new NewChange(); // 다형성, 객체지향에서 가장 중요한 것
		

	}

	public void calc(int pay, int buy) {

		int change = pay - buy;

		System.out.printf("거스름돈 = %d \n", change);
		
		int temp = change / 5000; // int타입이므로, 정수만 출력
		System.out.printf("5000원 = %d \n", temp);
		
		change = change % 5000; // 연산된 결과에서 5000을 나눈 나머지가 변수에 대입
		temp = change / 1000; // 위에 연산결과에서 나온 값을 temp에 대입
		System.out.printf("1000원 = %d \n", temp);
		
		change = change % 1000;
		temp = change / 500;
		System.out.printf("500원 = %d \n", temp);
		
		change = change % 500;
		System.out.printf("100원 = %d \n", change / 100);
		
		change = change % 100;
		System.out.printf("50원 = %d \n", change / 50);
		
		change = change % 50;
		System.out.printf("10원 = %d \n", change / 10);

	}

}
