package kr.co.himedia.decisionSwitch;

import java.util.Scanner;

public class SwitchCaseTest2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("월 : ");
		int month = scanner.nextInt();
		int day;
		
		switch(month) {
		    case 2:
		    	day = 28;
				break;
			case 4: case 6: case 9: case 11:
				day = 30;
				break;
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				day = 31;
				break;
			default:
		    	day = 0;
		}

		System.out.println( month + "월은 " + day + "일까지 입니다.");
		
		scanner.close();
	}

}
