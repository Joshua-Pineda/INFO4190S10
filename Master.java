//by Josh 100381835

public class Master {

	

	
	public int secondBig(int num []) {
		biggestNumber b = new biggestNumber();
		
		int big = num[0];
		int biggest = b.findBiggestNum(num);
		for (int i = 0 ; i < num.length ; i++) {
			if(num[i] > big && num[i] < biggest) {
				big = num[i];
			}
	}
		
		return big;
	}

}

