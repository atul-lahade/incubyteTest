
class StringCalculator {

	public static int add(final String text) {

		String[] stringArray = text.split(",|n");

		/*
		 * if (stringArray.length > 2) {
		 * 
		 * throw new RuntimeException(
		 * "Upto 2 numbers separated by , are allowed"); } else if
		 * (stringArray.length > 0) {
		 */
		String delimiter = ",|n";
		String noWithoutDelimiter = text;
		
		if(text.startsWith("//")){
			 int delimiterIndex = text.indexOf("//") + 2;
			 delimiter = text.substring(delimiterIndex, delimiterIndex + 1);
			 noWithoutDelimiter = text.substring(text.indexOf("n") + 1);
		}
		return add(noWithoutDelimiter, delimiter);
		/*
		 * } else { return 0; }
		 */
	}

	private static int add(final String text, final String delimiter) {
		// TODO Auto-generated method stub
		int sum = 0;
	    String[] numbersArray = text.split(delimiter);
	    for (String number : numbersArray) {
	        if (!number.trim().isEmpty()) {
	            sum += Integer.parseInt(number.trim());
	        }
	    }
	    return sum;
	}
}
