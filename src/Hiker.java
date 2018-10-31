
public class Hiker {

	public static String answer(String number) {
		if (number == "") {
			return "0";
		} else if (number.contains(",") || number.contains("\n")) {
			String[] arrOfStr = number.split(",|\n");
			int sum = 0;
			for (int i = 0; i < arrOfStr.length; i++) {
				sum += Integer.parseInt(arrOfStr[i]);
			}
			return sum + "";
		} else {
			return number;
		}
	}
}
