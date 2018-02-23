package prob01;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Gugudan {
	
	static int resultNumber = 0;
	
	public static void main( String[] args ) {
		int l = randomize( 1, 9 );
		int r = randomize( 1, 9 );
		
		resultNumber = l * r;

		int[] answerNumbers = randomizeAnswers();
		int loc = randomize( 0, 8 );
		/**
		 * 이 부분 수정
		 * 답이 이미 answer 배열 내에 존재한다면
		 * 답을 저장하지 않음
		 */
		if( ! arrayContains(answerNumbers, resultNumber))
			answerNumbers[ loc ] = resultNumber;
		/*------------------*/
		System.out.println( l + " x " + r + " = ?" );
		
		int length = answerNumbers.length;
		for( int i = 0; i < length; i++ ) {
			if( i % 3 == 0 ) {
				System.out.print( "\n" );
			} else {
				System.out.print( "\t" );
			}
			
			System.out.print( answerNumbers[ i ] );
		}

		System.out.print( "\n\n" );
		System.out.print( "answer:" );

		Scanner s = new Scanner( System.in );
		/**
		 * 구현부
		 */
		int userInput = 0;
		try {
			userInput = s.nextInt();
		}catch(InputMismatchException imex) {
			System.out.println("잘못된 입력입니다.");
			s.close();
			return;
		}
		
		if(userInput == resultNumber) {
			System.out.println("정답");
		}else {
			System.out.println("오답");
		}
		s.close();
	}

	private static int randomize( int lNum, int rNum ) {	// 한 자리수 난수 하나 생성
        int random = (int) ( Math.random() * rNum ) + lNum;
        return random;
	}
	
	private static int[] randomizeAnswers() {

		final int COUNT_ANSWER_NUMBER = 9;
		final int MAX_ANSWER_NUMBER = 81;
		
		int[] boardNumbers = new int[ COUNT_ANSWER_NUMBER ];
		int occupied = 0;
		
		while( occupied < COUNT_ANSWER_NUMBER ) {
			
	        int random = ( int )( Math.random() * MAX_ANSWER_NUMBER ) + 1;
	        
	        boolean evaluted = false;
	        for( int i = 0; i < occupied; i++ ) {
	        	if( boardNumbers[i] == random) {	//중복 검사 코드
	        		evaluted = true;
	        		break;
	        	}
	        }
	        
	        if( !evaluted ) {
	        	boardNumbers[ occupied++ ] = random;
	        }
		}
		
        return boardNumbers;
	}	
	
	/**
	 * 배열 중복 검사 메소드
	 * @return 존재 시 true, 아닐 시 false
	 */
	private static boolean arrayContains(int[] arr, int target) {
		int len = arr.length;
		for(int i = 0 ; i < len; i++) {
			if(arr[i] == target)
				return true;
		}
		
		return false;
	}
}
