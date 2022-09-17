package lec4array;

public class Insertion_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,4,5,6,3,9,7,0};
		sort(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}
	public static void sort(int [] arr) {
		for(int i=1;i<arr.length;i++) {
			int item = arr[i];
			int j =i-1;
			while(j>=0 && arr[j]>item) {
				arr[j+1]= arr[j];
				j--;
			}
			j++;
			arr[j]= item;
		}
		
		
	}

}
