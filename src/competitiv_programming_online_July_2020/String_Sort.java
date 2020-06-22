package competitiv_programming_online_July_2020;

import java.util.Scanner;

public class String_Sort {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();  
		String arr[]=new String[num];
		for (int i = 0; i < num ; i++) {
			arr[i] = sc.nextLine(); 
			System.out.println(i);
			System.out.println(arr[i]);
		}
		for (int i = 0; i < num; i++) {
			for (int j = i + 1; j < num; ++j) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
		}
		for (int i = 0; i < num ; i++) {
			System.out.println(arr[i]);
		}

	}

}
