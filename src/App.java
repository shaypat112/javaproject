import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception 
    {
       
Scanner scanner = new Scanner(System.in);


String adjective1;
String noun1;
String adjective2;
String verb1;
String adjective3;

System.out.println("Enter Adjective 1 ");
adjective1 = scanner.nextLine();
System.out.println(" Enter noun1 ");
noun1 = scanner.nextLine();
System.out.println(" Enter adjective 2: ");
adjective2 = scanner.nextLine();
System.out.println(" Enter verb1 + " );
verb1 = scanner.nextLine();
System.out.println("Enter adjective3 now: ");
adjective3 = scanner.nextLine();





System.out.println("Today I went to a " + adjective1 + "zoo.");
System.out.println(" In an exhibit, I saw a " + noun1);
System.out.println(noun1 + " was " + adjective2 + "and " + verb1 + ".");
System.out.println(" i was. " + adjective3);


scanner.close();

     


       


    }
}
