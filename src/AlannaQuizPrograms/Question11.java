package AlannaQuizPrograms;
/*
 * Alanna Botscharow
 * 12/18
 */
public class Question11 {

	public static void main(String[] args) {
		//Print numbers 1 - 50 
		
		int number = (int)(Math.random() * 50);
		
		//If number / 5 = 0, Print "HiFive."
		if (number / 5 == 0) {
			System.out.println("HiFive");
		}
		//If number / 2 = 0, Print "HiTwo."
		else if (number / 2 == 0) {
			System.out.println("HiTwo");
		}
		//If number / 3 = 0, Print "HiTwo." or number / 7 = 0 print "HighThreeOrSeven"
		else if (number / 3 ==0 ||
				number / 7 == 0 ) {
			System.out.println("HiThreeOrSeven");
		}
		//else, print number.
		else {
			System.out.println(number);
		}
	}

}
