import java.util.Scanner;

public class _2_ArraysVanObjecten {
    public static void main(String[] args) {
        var keyboard = new Scanner(System.in); //Scanning from the keyboard/input

        String[] array = new String[3];


        System.out.println("Please enter a name"); //Prints out between de "  "

        for (int i = 0; i < array.length; i++) {
            array[i] = keyboard.nextLine();
        }


        System.out.println(array[3]);


        System.out.println("Please enter 20 names with space between"); //Prints out between de "  "

        String input = keyboard.nextLine();
        array = input.split(" ");


        //Just to test
        for (String str : array) {
            System.out.println(str);
        }
    }
}



