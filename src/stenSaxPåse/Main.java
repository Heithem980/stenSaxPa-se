package stenSaxPåse;

import java.util.Scanner;

public class Main {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Välj motståndare (1)datorn  (2)spelare : ");
		String val = input.nextLine();
		
		if(val.equals("datorn") || val.equals("1")) {
			datorn();
		}
		else {spelare();}
		
		System.out.print("Avslutar...");
	}
	
	
	
	
	
	public static void spelare() {
		
	  String fortsätt;
	 do {
		
        System.out.println("sten sax påse! Välj mellan: sten , sax , påse ");
		
		System.out.print("spelare 1: ");
		String spelare1 = input.nextLine();
		
		System.out.print("spelare 2: ");
		String spelare2 = input.nextLine();
		
		
		
		// Om det är oavgjort.
		if(spelare1.equals(spelare2)) {
			System.out.println("Det är oavgjort!");
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
	
	public static void datorn () {
		
		String fortsätt;
		 do {
			 // slumpa tal mellan 1-3 och tilldela "datornsVal".
			int datornsVal = (int)(Math.random() * 3) + 1; 
			
			
			
	        System.out.println("sten sax påse! Välj nummer: (1)sten , (2)sax , (3)påse . ");
			
			System.out.print("spelare 1: ");
			int spelare1 = input.nextInt();
			
			
			
			
			
			// Om det är oavgjort.
			if(spelare1 == datornsVal) {
				System.out.println("Det är oavgjort!  Datorns val: " + datornsVal);
			}
			
			
			// Om spelarnas val skiljer sig
			else if( datornsVal != spelare1) {
				
				
				// sten krossar sax
				if(spelare1 == 1 && datornsVal == 2) {
					System.out.println("Du vinner! Datorns val: " + datornsVal);
				}
				else if(datornsVal == 1 && spelare1 == 2) {
					System.out.println("Datorn vinner!Datorns val: " + datornsVal);
				}
				
				
				// sax klipper påse
				
				if(spelare1 == 2 && datornsVal == 3) {
					System.out.println("Du vinner! Datorns val: " + datornsVal);
				}
				else if(datornsVal == 2 && spelare1 == 3) {
					System.out.println("Datorn vinner! Datorns val: " + datornsVal);
				}
				
				// påse fångar sten
				
				if(spelare1 == 3 && datornsVal == 1) {
					System.out.println("spelare 1 vinner! Datorns val: " + datornsVal);
				}
				else if(datornsVal == 3 && spelare1 == 1) {
					System.out.println("Datorn vinner! Datorns val: " + datornsVal);
				}
			}
			
			// Detta behövs eftersom Scanner hoppar över (fortsätt = input.nextLine()) annars. Skulle gissa på att det är en bug.
			String fixIssue  = input.nextLine();
			
			
			System.out.print("Vill du spela igen? (JA/NEJ)");
			fortsätt = input.nextLine();
			
			
		  }while(fortsätt.equals("JA"));
			
	}

}
