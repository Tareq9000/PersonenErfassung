import java.util.Scanner;

public class Verwaltung {
	
	Scanner scan = new Scanner(System.in);
	
	Person[] Personen = new Person[5];
	
//	Verwaltung verwaltung = new Verwaltung();
	 

	public static void main(String[] args) {
		
//		Person person = new Person();
		Verwaltung verwaltung = new Verwaltung();
		
		verwaltung.menu();
	}
	char nochmal = '0';
	char nächstePerson = '0';
	int i = 0;
	int zaehler = 1;
	public void erfassen()
	{
		do {
				i++;
				System.out.println("-----------------Person erfassen---------------");
				System.out.println("Personenname > ");
				String name = scan.nextLine();
				
				System.out.println("Personenvorname > ");
				String vorname = scan.nextLine();
					
				System.out.println("Personenmail > ");
				String email = scan.nextLine();
					
				System.out.println("Personenalter > ");
				String alter = scan.nextLine();
				
				System.out.println("Nächste Person? (y/n) > ");
				nächstePerson = scan.next().charAt(0);
				
				System.out.println(name);
				System.out.println(vorname);
				System.out.println(email);
				System.out.println(alter);
				
				Person person = new Person(name, vorname, email, alter);
				
				Personen[i] = person;
				
				
		}while(nächstePerson == 'y');
		
	}
	public void add()
	{
		/*for(int i = 0;i < 5; i++)
		{
			
			person.name = " ";
			person.email = "Mail";
			person.vorname = "Tareq";
			person.alter = 5;
			
			Personen[i] = person;
		}*/
		
	}
	public void ausgeben()
	{
		
		System.out.println(Personen[0].name);
		System.out.println(Personen[0].vorname);
		System.out.println(Personen[0].email);
		System.out.println(Personen[0].alter);
		
		System.out.println("Zurück zum Menu? (y/n)");
		nochmal = scan.next().charAt(0);
		if(nochmal == 'y') {
			menu();
		}
		
		
		
	}
	public void bearbeiten() {
		
		
	}
	public void löschen() {
		
		
	}
	public void menu() {
		int menu = 0;
		do {
			System.out.println("/////////////////Personenerfassung/////////////////");
			System.out.println("----------------------------------------------");
			System.out.println("erfassen = 1 \n ausgeben = 2 \n bearbeiten = 3 \n beenden = 4 \n Geben Sie Ihre gewünschte Zahl ein > ");
			menu = scan.nextInt();
			
			if(menu == 1) {
				erfassen();
			}
			else if(menu == 2) {
				ausgeben();
			}
			else if(menu == 3) {
				bearbeiten();
			}

		}while (nächstePerson == 'n');
	}
	
}
