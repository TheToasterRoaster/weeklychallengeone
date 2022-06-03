package weeklychallengeone;

import java.util.Arrays;

public class ReorderDigits {

	public void reorderDigits(int[] digits, String order) {
		if (order.equals("asc")) {
			for (int i = 0; i < digits.length; i++) {
				char[] ch = Integer.toString(digits[i]).toCharArray();
				Arrays.sort(ch); 
				String duh = new String(ch);
				digits[i] = Integer.parseInt(duh);
			}
		} else if ( order.equals("desc")) {
			for (int i = 0; i < digits.length; i++) {
				char[] ch = Integer.toString(digits[i]).toCharArray();
				quickSort(ch, 0, ch.length - 1);
				String duh = new String(ch);
				digits[i] = Integer.parseInt(duh);
			}
		}
		for (int num: digits) {
		System.out.print(num + " ");
		}
		System.out.println();
	}
	
	public void quickSort(char arr[], int begin, int end) {
	    if (begin < end) {
	        int partitionIndex = partition(arr, begin, end);

	        quickSort(arr, begin, partitionIndex-1);
	        quickSort(arr, partitionIndex+1, end);
	    }
	}
	
	public int partition(char arr[], int begin, int end) {
	    char pivot = arr[end];
	    int i = (begin-1);

	    for (int j = begin; j < end; j++) {
	        if (Character.compare(arr[j], pivot) >= 0) {
	            i++;

	            char swapTemp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = swapTemp;
	        }
	    }

	    char swapTemp = arr[i+1];
	    arr[i+1] = arr[end];
	    arr[end] = swapTemp;

	    return i+1;
	}
}
