package Demo1_15_9;

public class Example1 {
	
	// iterative version of summing an array
	public static int arraySum(int[] array) {
		int sum=0;
		for(int i=0;i<array.length;i++) {
			sum+=array[i];
		}
		return sum;
	}
	
	// recursive version of summing an array
	public static int arraySum2(int[] array,int start) {
		if(start>=array.length)
			return 0;
		else
			return array[start] + arraySum2(array, start+1);
	}
	/*
	public static void main(String[] args) {
		
		int[] array = {1,2,3};
		
		//System.out.println(arraySum(array));
		//System.out.println(arraySum2(array, 0));
	}
	*/
	
}
