class NewSort {
	
	void bubblesort(int arr[]) {
		int n = arr.length;
		for(int i = 0; i<n-1; i++) {
			for(int j = 0; j < n-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}	
	}
	
	void printArray(int arr[]) {
		int n = arr.length;
		for(int i = 0; i<n;i++) System.out.print(arr[i]+" ");
		System.out.println();		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {100,90,80,70,60,50,40,30,20,10};
		NewSort ob = new NewSort();
		ob.bubblesort(arr);
		System.out.println("Sorted array");
        ob.printArray(arr);
	}

}