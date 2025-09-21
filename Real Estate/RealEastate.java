package Real_Estate;
import java.util.Scanner;
public class RealEastate {
		private static void printMenu() {
			System.out.println("\n=====Real Estate Inheritence =====");
			System.out.println("1. Single {Residency Property extends Property");
			System.out.println("2. Multilevel {plot extends land extends property");
			System.out.println("3. Hierarchical {Commercial and Industrial Extends Property");
			System.out.println("4. Multiple {Insured Commercial extends Residential property");
			System.out.println("5. Hybrid {Luxury residential  extends Residential property and Luxury Amenities");
			System.out.println("6. Exit");
			
			System.out.println("Choose an option: ");
		}
		
		private static void Single() {
			ResidentialProperty rp = new ResidentialProperty("RP01", 1200, "Sankhali", 9000000,3, 2);
			System.out.println(rp.describe());
			System.out.println("Value: "+rp.computerBasePrice());
		}
		
		private static void Multilevel() {
			Plot p = new Plot("P01", 1800, "Vasco", 720000,"Residential", true);
			System.out.println(p.describe());
			System.out.println("Value: "+p.computerBasePrice());
		}
		
		private static void Hierarchical() {
			CommercialProperty cp = new CommercialProperty("CP01", 1000, "Panjim", 2000000, "Office");
			System.out.println(cp.describe());
			System.out.println("Value: "+cp.computerBasePrice());
			
			IndustrialProperty ip = new IndustrialProperty("IP01", 5000, "Corlim", 3500000, true);
			System.out.println(ip.describe());
			System.out.println("Value: "+ip.computerBasePrice());
		}
		
		private static void Multiple() {
			InsuredCommercial ic = new InsuredCommercial("IC01", 1500, "Madgaon", 2500000,"Retail", 2000000, "A");
			System.out.println(ic.describe());
			System.out.println("Value: "+ic.computerBasePrice());
		}
		
		private static void Hybrid() {
			LuxuryResidency lr = new LuxuryResidency("LR01", "Canacona", 2200, 4, 4, false, false);
			System.out.println(lr.describe());
			System.out.println("Value: "+lr.computerBasePrice());
			
			LuxuryResidency lr2 = new LuxuryResidency("LR02", "Canacona", 2000, 3, 3, true, true);
					System.out.println(lr2.describe());
					System.out.println("Value: "+lr2.computerBasePrice());
		}
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			boolean running = true;
			while(running) {
				printMenu();
				String input = sc.nextLine().trim();
				int choice;
				try {
					choice = Integer.parseInt(input);
				}catch (NumberFormatException n) {
					System.out.println("Invalid input. Enter a number 1-6");
					continue;
				}
				
				switch (choice) {
				case 1 : System.out.println("\nResidential Properties");
				Single();
				break;

				case 2 : System.out.println("\nPlots ");
				Multilevel();
				break;

				case 3 : System.out.println("\nCommercial and Industrial Properties");
				Hierarchical();
				break;

				case 4 : System.out.println("\nInsured commercial Properties");
				Multiple();
				break;

				case 5 : System.out.println("\nLuxury reesidencies");
				Hybrid();
				break;

				case 6 : {
					running = false;
					System.out.println("Exiting!!!");
				}
				break;

				default : System.out.println("Invalid choice please usinga any between 1-6");
			}
			
		}
			sc.close();
}
}
