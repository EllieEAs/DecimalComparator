
public class DecimalComparator {

	public static boolean areEqualByThreeDecimalPlcaes(double num1, double num2) {


		// check if two numbers are equal in 3 decimal places
		int valueOne = (int) num1 * 1000;
		int valueTwo = (int) num2 * 1000;

		if (valueOne == valueTwo) {
			System.out.println("Is Equal");
			return true;
			

		} else
			System.out.println("Is Not Equal");
			return false;

	}
}
