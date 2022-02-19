package ex2;

public class elseifEX1 {

	public static void main(String[] args) {
		int age = 19;
		int charge = 1000;
		
		if(age < 10) {
			charge = 1500;
			System.out.println("아동입니다");
		}
		else if(age < 14) {
			charge = 2000;
			System.out.println( " 초등학생 입니다");
		}
		else if (age < 20) {
			charge = 2500;
			System.out.println( "중 고등학생 입니다");
		}
		else if ( age > 20) {
			charge = 3000;
			System.out.println ( "성인 입니다");
		}
	}

}
