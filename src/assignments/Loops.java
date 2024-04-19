package assignments;

public class Loops {

	public static void main(String[] args) {
//		1. WAP to print following output:
//			I am Batman﻿
//			I am Batman﻿
//			I am Batman﻿
//			I am Batman
//			I am Batman

		for (byte i = 1; i < 5; i++) {
			System.out.println("I am Batman");
		}

		System.out.println("---------------------");

//		 2. WAP to print following output:
//			 I am Batman 1
//			 I am Batman 2
//			 I am Batman 3
//			 I am Batman 4
//			 I am Batman 5
//			 I am Batman 6
//			 I am Batman 7
//			 I am Batman 8
//			 I am Batman 9

		for (byte i = 1; i <= 9; i++) {
			System.out.println("I am Batman " + i);
		}

//		 3. WAP to print 10 to 1 using for, while and do-while loop
		System.out.println("-------------10 to 1 using while loop--------");

		int a = 10;

		while (a >= 1) {
			System.out.println(a);
			a--;
		}

		System.out.println("-------------10 to 1 using the do while loop--------");
		int b = 10;
		do {
			System.out.println(b);
			b--;
		} while (b >= 1);

		System.out.println("---------------------");
//		 4. Write a program in Java to print "Hello World" ten times using while loop

		int c = 1;

		while (c <= 10) {
			System.out.println("Hello World");
			c++;
		}

//		 5. Write a program in Java to print all the multiplication of 5 from 1 to 100 using while /for/do-while loop

		System.out.println("-------------multiplication of 5 from 1 to 100 using for loop--------");

		for (byte d = 1; d <= 100; d++) {
			System.out.println(d + "*5=" + d*5);
		}

		System.out.println("-------------multiplication of 5 from 1 to 100 using while loop--------");

		byte e = 1;

		while (e <= 100) {
			System.out.println(e + "*5=" + e*5);
			e++;
		}
		
		System.out.println("-------------multiplication of 5 from 1 to 100 using do-while loop--------");
		
		byte g=1;
		
		do {
			System.out.println(g + "*5=" + g*5);
			g++;
		}while (g<=100);
		
		System.out.println("------------- odd and even numbers between 1 to 100--------");
		
//		6. Print all odd and even numbers between 1 to 100
		
		for (byte h=1; h<=100; h++) {
			if (h%2==0) {
				System.out.println(h + " is an even number");
			}
			else {
				System.out.println(h + " is an odd number");
			}
				
		}
		
////		7. What will be the output of this program:A. Infinite loop
//
//			int i = 1;
//			while(i<=1){
//			System.out.println("Hi Java");
//			}
		
//		8. Print A-Z , a-z, 0-9 with  the respective ASCII numbers the console one using while and for loop.
		
		System.out.println("-------------Letters and numbers with ASCII using the while loop--------");
		
		char simple = 'a', capital = 'A', number = '0';
				
		while (simple <= 'z' | number <= '9' ) {
			System.out.println(simple + "-"+ (byte)simple);
			simple++;
			
			System.out.println(capital + "-"+ (byte)capital);
			capital++;
			
			System.out.println(number + "-"+ (byte)number);
			number++;			
		}
		
		System.out.println("-------------Letters and numbers with ASCII using the for loop--------");
		
		for (char simpleLetter = 'a'; simpleLetter <= 'z'; simpleLetter++ ) {
			System.out.println(simpleLetter + "-"+ (byte)simpleLetter);			
		}
		
		
		System.out.println("---------------------");
//		9. Print the following series: 
//		1.0 2.0 3.0  ...... 10.0 
//		0 9 18 27 36 …99
		
		double d = 1.0;
		
		 while (d <= 10.0) {
			 System.out.println(d);
			 d++;
		 }
		 
		System.out.println("---------------------");
		
		
		int i=0,j=3;
		
		while (i<=99) {
			System.out.println(i);
			j=j+3;//6 9
			i=(j*3);//18 27
		}
		
		System.out.println("---------------------");
		
//		10. Print only vowels (aeiou) using for and while loop. Start the loop from ‘a‘ to ‘z‘.
		
		char letter = 'a';
				
		while (letter<='z' ) {
			if (letter == 'a' | letter == 'e' | letter == 'i'| letter == 'o'| letter == 'u') {
				System.out.println(letter + " is a vowel");
			}
			letter++;
		}
		
		System.out.println("---------------------");
//		11. Print 1 to 10 and break the loop once you find the multiplication of 7 with a message "bye, see you tomorrow".
		
		int m=1;
		
		while (m<=10 ) {
			System.out.println(m);
			if (m%7==0) {
				System.out.println("bye, see you tomorrow");
				break;
			}
			m++;
		}

	}

}
