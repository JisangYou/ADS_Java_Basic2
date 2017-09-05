
public class Change {// 실행시킬 수 있는 최소단위, 판단근거는 이름에서 찾을 수 있다.

	int changeArray[] = { 5000, 1000, 500, 100, 50, 10 };

	public void calc(int pay, int buy) { // naming 고려하기.
		// 반복---------------------------------------
		// 잔돈계산
		// 잔돈을 현재 거스름돈으로 나눈후 나머지
		// ------------------------------------------
		int change = pay - buy;
		print("총거스름돈 ", change);

		for (int money : changeArray) {

			print(money + "", change / money); // 형변환 money + ""
			// 퍼포먼스상으로는 좋지 않지만, 다른 사람들을 위해서 알기 쉽게!
			change = change % money;

		}
	}

	public void print(String flag, int count) {
		System.out.printf("%s원 = %d \n", flag, count);
	}

}
