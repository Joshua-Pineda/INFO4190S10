
public class Master {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] test = {4,3,5,6};
		sort(test);
		System.out.println(test);

	}

	
	public static void sort(int [] arrayOfInt) {
		//iterate through array
		for (int i = 0; i < arrayOfInt.length; i++) {
			//this where we store the current element to temporarily take it out the array
			int currentInt = arrayOfInt[i];
			int k;
			for (k = i-1; k >= 0 && arrayOfInt[k] > currentInt; k--) {
				arrayOfInt[k+1] = arrayOfInt[k];
			}
			//insert the one thats taken out into k+1
			arrayOfInt[k+1] = currentInt;
		}
		
	}

}


