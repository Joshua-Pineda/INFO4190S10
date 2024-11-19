
public class biggestNumber {

	public int findBiggestNum(int num []) {
		
		int big = num[0];
		for (int i = 0 ; i < num.length ; i++) {
				if(num[i] > big) {
					big = num[i];
				}
		}
			
		return big;
	}
}
