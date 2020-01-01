
public class StringExamples {
    public static void main(String[] args) {
        String firstName = "Pj ";
        String lastName = "Das";
        // String Method
        // Length
        System.out.println("Length: " + firstName.length());
        // CharAt
        char ch = firstName.charAt(2);
        System.out.println("ChartAt 1 : " + ch);
        // Concat without using method
        System.out.println("Concat without mehtod :" + firstName + lastName);
        // Concat using concat() method
        String fullName = firstName.concat(lastName);
        System.out.println("Concat using concat() method :" + fullName);
        // Contain() is case sensitive | returns true or false
        // Is "Pj" is within "Pj Das"
        boolean isItPj = fullName.contains("Pj");
        System.out.println("Is this Pj ? " + isItPj);
        // equals is case sensitive | returns true or false
        boolean isFirstNamePj = firstName.equals("Pj ");
        System.out.println("Is first name Pj ? " + isFirstNamePj);
        // Check if numbers are equal
        int two = 2;
        System.out.println("Is 2 and '2' equal : " + (two == 2));
        // Check if strings are equal
        String twoString = "PJ";
        System.out.println("Is 2 and '2' equal : " + twoString.equals(2));
        // ignore case vs regular
        System.out.println("With ignore case : " + firstName.equalsIgnoreCase("PJ "));
        System.out.println("Withut ignore case : " + firstName.equals("PJ "));
        // Replace
        String sentence = "software testing is a very painful course";
        System.out.println("Before replacement : " + sentence);
        String replaceString = sentence.replace('a', 'e'); // softwere testing is e very peinful course
        System.out.println("After replacement : " + replaceString);
        // Split
        String splitSentence = "java string split method";
        // splits the string based on whitespace //using java foreach loop to print
        String[] words = splitSentence.split("va");
        // elements of string array for(String w:words){
        System.out.println("After split ");
        // foreach vs for loop
        for (String w : words) {
            System.out.println(w);
        }
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
        // Sub string
        // j a v a t p o i n t
        // 0 1 2 3 4 5 6 7 8 9
        String stringForSubString = "javatpoint";
        System.out.println("Subtring : " + stringForSubString.substring(0, stringForSubString.length()));
        // Case handling
      /*  String caseSentence = "Welcome to TRAINING";
        String lowerCase = caseSentence.toLowerCase();
        System.out.println("Make " + caseSentence + " into lower case : " + lowerCase);
        String upperCase = caseSentence.toUpperCase();
        System.out.println("Make " + caseSentence + " into UPPER case : " + upperCase);

       */
        // Value of
        int value = 30;
        String s1 = String.valueOf(value);
        System.out.println("Value of : " + s1 + 10);// concatenating string with 10
        // HW - Why is string immutable in Java with examples

/*

    String a = "Welcome to selenium java training";
    String lowerCase = a.toLowerCase();

    public String getLowerCase() {
        return lowerCase;
    } System.out.println("Make "+ a+" into lower case : "+);
}


     /*   System.out.println("Make " + caseSentence + " into lower case : " + lowerCase);

                String upperCase = caseSentence.toUpperCase();
                System.out.println("Make " + caseSentence + " into UPPER case : " + upperCase);



      */


    }
}