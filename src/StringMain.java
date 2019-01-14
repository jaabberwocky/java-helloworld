public class StringMain {

    public static void main(String[] args){
        String userinput = "entertainment";
        String uppercase = userinput.toUpperCase();
        System.out.println(uppercase);

        // access the first character
        char firstCharacter = userinput.charAt(0);

        System.out.println(firstCharacter);

        // see if string contains something
        System.out.println("Contains \"input\"? " + userinput.contains("input"));
    }
}
