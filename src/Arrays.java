public class Arrays {


    public static void main(String[] args) {

        /*
        int[] d = new int[5];
        d[0] = 1;
        d[1] = 2;
        d[2] = 3;
        d[3] = 4;
        d[4] = 5;
        */



       /*
       int [] a = { 1, 2, 3, 4, 5};

        for (int i=0; i < a.length; i++ ) {

            System.out.println(a[i]);
        }*/




     /*
      String [] folksInClass = { "Saera", "Naimul", "Jishan", "Sabrina", "Musaib", "Jovaria" };

       for (int f = 0; f < folksInClass.length; f++){
           System.out.println(folksInClass[f]);
       }
      */



    /*
        String[] words = {"I", "love", "JAVA"};

        String sentence = "";

        for (int s = 0; s < words.length; s++) {

            sentence = sentence.concat(words[s] + " ");
        }
            System.out.println(sentence);

    */



    /*
            int[][] myNumbers = { {1, 2, 3}, {4, 5, 6,} };
            int x = myNumbers[1][1];
            System.out.println(x);

            //Printing 5 from 2nd array
        // first [] is array number,  second [] for element
        // ==> so 2nd array = 1 (2-1), element 2 (2-1)
*/


        int[][] coordinates = {
                {1, 0},
                {1, 1},
                {1, 2},
                {1, 3},
                {1, 4}
        };
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("[" + coordinates[i][j] + "]");
            }
            System.out.println();
        }

        //code is only giving me the first 2 coordinates
    }
}



