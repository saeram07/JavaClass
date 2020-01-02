public class strings {
    public static void main(String[] args) {
        //this is defining the sentence
        String sentence = "Welcome to selenium java training";

        /*this is spitting the sentence into words and then counting it
        while displaying the message  "there are # words"
         */
// this makes the words in the sentence an array with each word being an index
        String[] words = sentence.split("\\s");
        System.out.println("There are " + words.length + " words");

        //Welcome = [0]
        //to = [1]
        //selenium [2]
        //java [3]
        //training [4]
            //this is printing out index 0 which is welcome
        System.out.println(words[0]);

        {
        for (int i = words.length - 1; i<=0; i++);

       //     System.out.print(words[i]);
        }

        String lowerCase = sentence.toLowerCase();
        System.out.println("Make " + sentence + " into lower case : " + lowerCase);

        System.out.println();

        String upperCase = sentence.toUpperCase();
        System.out.println("Make " + sentence + " into UPPER case : " + upperCase);

        System.out.println();


        boolean isItSelenium = sentence.contains("selenium");
        System.out.println("Is selenium present? " + isItSelenium);

        System.out.println();


// print words in reverse order
        //just like printing numbers (integers) in reverse order
        System.out.println("Words in reverse order: ");
        for (int i = words.length -1; i>=0; i--){
            System.out.print(words[i] + " ");
        }

        System.out.println();


    }


}