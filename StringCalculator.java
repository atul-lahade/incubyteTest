
class StringCalculator {

	public static int add(final String text) {

		int sum = 0;
		String delimiter = ",|n";
		String noWithoutDelimiter = text;
		String[] stringArray = text.split(",|n");

		if(stringArray.length == 0){
			return sum;
		}
		
		/*if (stringArray.length > 2) {
			throw new RuntimeException("Upto 2 numbers separated by , are allowed");
		}*/
		
	
		if (text.startsWith("//")) {
			int delimiterIndex = text.indexOf("//") + 2;
			delimiter = text.substring(delimiterIndex, delimiterIndex + 1);
			noWithoutDelimiter = text.substring(text.indexOf("n") + 1);
			return add(noWithoutDelimiter, delimiter);
		}
				
		if(stringArray.length > 0){
			for (int i = 0; i < stringArray.length; i++) {
				if(!stringArray[i].isEmpty()){
					sum += Integer.parseInt(stringArray[i]);
				}	
			}
			return sum;
		}
		
		return sum;
		/*
		 * } else { return 0; }
		 */
	}

	private static int add(final String text, final String delimiter) {
		// TODO Auto-generated method stub
		int sum = 0;
		String[] stringArray = text.split(delimiter);
		for (int i = 0; i < stringArray.length; i++) {
			if (!stringArray[i].isEmpty()) {
				sum += Integer.parseInt(stringArray[i].trim());
			}
		}
		return sum;
	}
}
