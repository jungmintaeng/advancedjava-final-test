package prob02;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		System.out.print( "두 정수와 연산자를 입력하시오 >> " );
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		String operation = scanner.next();
		
		/* operation에 따라 4칙 연산 객체를 생성하고 caculate 메서드를 호출합니다. */
		Arithmetic instance = null;
		switch(operation.charAt(0)) {
		case '+':
			instance = new Add();
			break;
		case '-':
			instance = new Sub();
			break;
		case '*':
			instance = new Mul();
			break;
		case '/':
			instance = new Div();
			break;
		}
		
		if(instance == null) {
			scanner.close();
			return;
		}
		
		System.out.println(instance.calculate(a, b));
		
		scanner.close();
	}
}
