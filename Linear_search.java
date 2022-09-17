package lec4array;

public class Linear_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,3,5,7,50,4,0,5};
		int key= 50;
		
		//linearsearch();
		System.out.println( linearsearch(arr, key));
		
		
		
			}
	
	
	public static int linearsearch(int []arr , int key) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]== key) {
				return i;
			}
		}
		return -1;
	}
}
