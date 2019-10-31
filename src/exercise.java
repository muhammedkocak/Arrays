public class exercise {
    public static void main(String[] args) {
        String[] words = new String[5];
        words[0] = "Hello";
        words[1] = "Saturnus";
        words[2] = "Rob";

        System.out.println(words[1].toUpperCase());

        for(String i : words){
            System.out.println(i +", ");
        }


    }
}
