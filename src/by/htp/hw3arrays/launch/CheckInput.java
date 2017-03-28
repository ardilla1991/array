package by.htp.hw3arrays.launch;

class CheckInput {
	
	/*public boolean checkPositiveNumber(int number) {
		boolean res = false;
		res = number > 0 ? true : false;	
		
		return res;
	}*/
	
	public boolean checkNumber(String str) {
		boolean res = false;
		if (str.matches("[-]{0,1}\\d"))
			return true;
		
		return res;
	}
}
