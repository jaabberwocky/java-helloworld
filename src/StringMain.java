import java.util.Scanner;

public class StringMain {

    public static void main(String[] args){

        // give Scanner the input from System.in
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter word or phrase then press enter:");
        String userinput = sc.nextLine();

        String uppercase = userinput.toUpperCase();
        System.out.println("Uppercased! " + uppercase);

        // access the first character
        char firstCharacter = userinput.charAt(0);
        System.out.println("First character: " + firstCharacter);

        // see if string contains something
        System.out.println("Contains \"input\"? " + userinput.contains("input"));

        // output length of phrase
        System.out.println("Length: " + userinput.length());

        // take int input
        System.out.println("Enter a number:");
        int userNumber = sc.nextInt();
        System.out.println("Entered: " + userNumber);
    }
}
