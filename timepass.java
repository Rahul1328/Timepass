import java.util.*;

public class HelloWorld {
	public static void flame(char[] a, char[] b,String r, String p) {
		int l = 1, sc = 0, rc = 0, fc = 5;
		String f = "flames";
		char[] flames = f.toCharArray();

		int n = a.length;
		int m = b.length;
		int tc = n + m;

		for (int i = 0; i < n; i++) {
			char c = a[i];
			for (int j = 0; j < m; j++) {
				if (c == b[j]) {
					a[i] = b[j] = '-'; 
					sc += 2;
					break;
				}
			}
		}

		rc = tc - sc;
		int i = 0;

		while (i >= 0) {
			if (l == rc) {
				for (int k = i; k < f.length()-1; k++) {
					flames[k] = flames[k + 1];
				}
				flames[flames.length-1] = '0';
				fc--;
				i--;
				l = 0;
			}
			if (i == fc) {
				i = -1;
			}
			if (fc == 0) {
				break;
			}
			l++;
			i++;
		}

		char ch = flames[0];
		switch (ch) {
		    case 'f':
				System.out.println(r + " is FRIEND to " + p);
				break;
				
			case 'l':
				System.out.println(r + " is in LOVE with " + p);
				break;
			
			case 'a':
				System.out.println(r + " has more AFFECTION on " + p);
				break;
			case 'm':
				System.out.println(r + " is going to MARRY " + p);
				break;
				
			case 'e':
				System.out.println(r + " is ENEMY to " + p);
				break;
			
			default:
				System.out.println(r + " and " + p + " are Brother and sisters ");
				break;
		}
	}

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in).useDelimiter("\n");
	    System.out.print("Enter your Name: ");
	    String a = sc.next();
	    System.out.println();
	    System.out.print("Enter their Name: ");
	    String b = sc.next();
	    System.out.println();
	    String org1 = a;
	    String org2 = b;
	    a = a.replaceAll(" ","");
	    b = b.replaceAll(" ","");
	    a = a.toLowerCase();
	    b = b.toLowerCase();
		char[] charA = a.toCharArray();
		char[] charB = b.toCharArray();

		flame(charA, charB, org1, org2);
	}
}
