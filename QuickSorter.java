
public class QuickSorter {

	public static void quickSort(int[] arr, int lo, int hi) {
		int pivot;
		if (lo<hi) {
			pivot = partition(arr, lo, hi);
			quickSort(arr, lo, pivot - 1);
			quickSort(arr, pivot + 1, hi);
			}
		}
	
	public static int partition(int[] arr, int lo, int hi) {
		int pivot;
		pivot = arr[0];
		int i = lo+1;
		int j = hi;
		int temp;
		while (i<=j) {
			if (arr[i]<pivot) {
				i++;
			} else {
				if (arr[j] > pivot) {
			j--;
				} 
				if (arr[j] <= pivot) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		temp = pivot;
		pivot = arr[j];
		arr[j] = temp;
		
		
		return j;
			}
	
}
