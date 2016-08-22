import java.util.Scanner;

public class AnagramLovely {

	public static void main(String[] args) {
	    int size;
	    System.out.println("Enter number of test cases");
	    Scanner num = new Scanner(System.in);
	    size = num.nextInt();
        int m = 0;
        while (m < size) {
			String str;
			Scanner scan = new Scanner(System.in);
			str = scan.next();
			if ((str.length() % 2) != 0) {
				System.out.println(-1);
			} else {
				char[] newStr = str.toCharArray();
				int i;
				int j;
				int index = (newStr.length / 2);
				int ctr = 0;
				for (i = 0; i < index; i++) {
					for (j = index; j < newStr.length; j++) {
						if (newStr[i] == newStr[j]){
							//newStr[i] = 0;
							newStr[j] = 0;
						}// } else {
						// 	ctr = ctr + 1;
						// }
					}
				}
				int k;
				int n = 0;
				for (k = index; k < newStr.length; k++){
					if (newStr[k] != 0){
						n = n + 1;
					}
				} 
				System.out.println(n);
			}
		}
		
    }

}