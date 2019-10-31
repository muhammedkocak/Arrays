public class _1_Arrays_Gebruiken {

    public static void main(String[] args) {
        int number[] = new int[20];

        for (int i = 0; i < number.length; i++) {
            number[i] = i * 7;
        }

        for (int n : number) {
            System.out.println(n);
        }
        for (int i = number.length - 1; i >= 0; i--) {
            System.out.println(number[i] + " ");
        }

            // for (int i = 0; i < number.length; i++) {
            // System.out.print(number[i] + " ");
            // }
            // System.out.println(Arrays.toString(number)); //Results in [7, 14, 21, 28, 35, 42, 49, 56, 63, 70, 77, 84, 91, 98, 105, 112, 119, 126, 133, 140]

        //BOOLEAN ARRAY DECLARATION
        boolean trueFalse[];
        //MEMORY ALLOCATION FOR BOOLEAN ARRAY
        trueFalse = new boolean[4];
        //ASSIGNING ELEMENTS TO BOOLEAN ARRAY
        trueFalse[0] = true;
        trueFalse[1] = false;
        trueFalse[2] = false;
        trueFalse[3] = false;
        //BOOLEAN ARRAY OUTPUT
        for (int i = 0; i < trueFalse.length; i++) {
            trueFalse[i] = trueFalse[i];
        }
        for (boolean n : trueFalse) {
            System.out.println(n);
        }
        //Declare Array van int
        int[] priemgetallen = new int[70];

        int[] neeee = new int[70];
        //for(int number : priemgetallen){

        // for loop and if condition to vind the priemgetallen
        for (int i =0 ; i<priemgetallen.length; i++){
            if(i%2 !=0){
                neeee[i] = i;
                System.out.println( neeee[i]);

            }


        }






    }
}