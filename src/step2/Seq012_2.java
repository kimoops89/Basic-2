package step2;
import java.util.Scanner;
/**
 * [수열012] 홀수짝수의 합계(메소드 분할)
 */
public class Seq012_2 {
	public static int input(Scanner sc){
		int result = 0;
		/*System.out.println("첫번째 숫자를 입력하세요.");
		int num1 = sc.nextInt();*/
		System.out.println("두번째 숫자를 입력하세요.");
		int num2 = sc.nextInt();
		/*if (num1 > num2) {
			start = num2;
			end = num1;
		} else {
			start = num1;
			end = num2;
		}*/
		result = num2;
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		while (true) {
			System.out.println("0.종료 1.홀수합 2. 짝수합 > ");
			switch (sc.nextInt()) {
			case 0:
				System.out.println("종료합니다.");
				return;
			case 1:
				System.out.println("홀수합 시작합니다.");
				int num1 = 1, num2=0, count=0, totalCount=0, sum=0;
				num2 = input(sc);
				String result = "", opcode ="+";
				for (int i = num1; i <= num2; i++) {
					if (i % 2 == 1) {
						count++;
					}
				}
				totalCount = count;
				count = 0;
				for (int i = num1; i <= num2; i++) {
					if (i % 2 == 1) {
						count++;
						if (count == totalCount) {
							opcode = "=";
						}
						result += i + opcode;
						sum += i;
					}
				}
				System.out.println(result + sum);
				break;
			case 2:
				num1 = 1; num2=0; count=0; totalCount=0; sum=0;	result = ""; opcode ="+";
				num2 = input(sc);
				for (int i = 1; i <= num2; i++) {
					if (i % 2 == 0) {
						count++;
					}
				}
				totalCount=count;
				count = 0;
				for (int i = num1; i <= num2; i++) {
					if (i % 2 == 0) {
						count++;
						if (count==totalCount) {
							opcode = "=";
						}
						result += i + opcode;
						sum += i;
					}
				}
				System.out.println(result + sum);
				break;
			default:
				System.out.println("잘못입력하셨습니다.");
				break;
			}
		}
	}
}