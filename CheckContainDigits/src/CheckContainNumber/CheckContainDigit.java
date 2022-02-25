package CheckContainNumber;

public class CheckContainDigit {

		 public static boolean isNumeric(String str) {
				try {
					Integer.parseInt(str);
					return true;
				} catch (Exception e) {
					return false;
			}
		}

		public static void main(String[] args) {
			
				System.out.println(isNumeric("0"));
				System.out.println(isNumeric(" "));
				System.out.println(isNumeric("29"));
				System.out.println(isNumeric("HAHA"));
				System.out.println(isNumeric("999"));
				System.out.println(isNumeric("true or false"));
				System.out.println(isNumeric("696"));
				System.out.println(isNumeric(" ~+=$@#!%^&*- "));
				System.out.println(isNumeric("101"));
				System.out.println(isNumeric(" Java "));
			}
}