import java.util.Scanner;
public class conversor_dialogo {
public static int alo(double[] arr) {
	int count = 0;
	for (int i = 0; i < arr.length - 2; i++) {
	if (arr[i] < arr[i + 1] && arr[i + 1] < arr[i + 2]) {
	count++;
	}
	}
	return count;
	}
}