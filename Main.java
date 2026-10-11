import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an adjective: ");
        String adjective1 = scan.nextLine();

        System.out.print("Enter a place: ");
        String place1 = scan.nextLine();

        System.out.print("Enter a verb: ");
        String verb1 = scan.nextLine();

        System.out.print("Enter another adjective: ");
        String adjective2 = scan.nextLine();

        System.out.print("Enter a past-tense verb: ");
        String verb2 = scan.nextLine();

        System.out.print("Enter another past-tense verb: ");
        String verb3 = scan.nextLine();

        System.out.print("Enter another place: ");
        String place2 = scan.nextLine();

        System.out.print("Enter an adjective: ");
        String adjective3 = scan.nextLine();

        System.out.print("Enter an adjective: ");
        String adjective4 = scan.nextLine();

        String sentence1 = "Yesterday, I went to the " + place1
                + " with my " + adjective1 + " friend for a " + verb1 + ".";

        String sentence2 = "My friend was very " + adjective2
                + " and " + verb2 + " 5 more laps than me.";

        String sentence3 = "After the " + place1
                + ", my friend and I went to a " + place2 + " for lunch.";

        String sentence4 = "The food was very " + adjective3
                + ", so we decided to " + verb3 + " dessert.";

        String sentence5 = "Just as we expected, the dessert was "
                + adjective4 + ".";

        System.out.println(sentence1);
        System.out.println(sentence2);
        System.out.println(sentence3);
        System.out.println(sentence4);
        System.out.println(sentence5);

        scan.close();
    }
}