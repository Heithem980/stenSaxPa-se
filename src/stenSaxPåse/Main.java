package stenSaxPåse;

import java.util.Scanner;

public class Main {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		spel();
	}
	
	
	
	public static void spel() {
		
	  String fortsätt;
	 do {
		
        System.out.println("sten sax påse! ");
		
		System.out.print("spelare 1: ");
		String spelare1 = input.nextLine();
		
		System.out.print("spelare 2: ");
		String spelare2 = input.nextLine();
		
		
		
		// Om det är oavgjort.
		if(spelare1.equals(spelare2)) {
			System.out.print("Det är oavgjort!");
		}
		
		
		// Om spelarnas val skiljer sig
		else if(spelare1 != spelare2) {
			
			
			// sten krossar sax
			if(spelare1.equals("sten") && spelare2.equals("sax")) {
				System.out.println("spelare 1 vinner!");
			}
			else if(spelare2.equals("sten") && spelare1.equals("sax")) {
				System.out.println("Spelare 2 vinner!");
			}
			
			
			// sax klipper påse
			
			if(spelare1.equals("sax") && spelare2.equals("påse")) {
				System.out.println("spelare 1 vinner!");
			}
			else if(spelare2.equals("sax") && spelare1.equals("påse")) {
				System.out.println("Spelare 2 vinner!");
			}
			
			// påse fångar sten
			
			if(spelare1.equals("påse") && spelare2.equals("sten")) {
				System.out.println("spelare 1 vinner!");
			}
			else if(spelare2.equals("påse") && spelare1.equals("sten")) {
				System.out.println("Spelare 2 vinner!");
			}
		}
		
		
		System.out.println("Vill du spela igen? (JA/NEJ)");
		fortsätt = input.nextLine();
		
		
	  }while(fortsätt.equals("JA"));
		
	}

}
