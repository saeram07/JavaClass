import java.util.Scanner;

public class HomeworkJan4 {

    public static void main (String[] args) {

//1.Write a Java program to get the character at the given index within the String.
        String s = "Welcome to selenium java training";
        Scanner a = new Scanner(System.in);
        System.out.print("Enter character index");
        System.out.println("Character is " + s.charAt(a.nextInt()));

        System.out.println();
        //2. Write a Java program to concatenate two strings.

        String x = "I love ";
        String y = "chocolate cake";
        String z = x.concat(y);
        System.out.println(z);

        System.out.println();

//3. Write a Java program to test if a given string contains the specified sequence of char values.
        System.out.println("Is java in this sentence: '" + s + "' : " + s.contains("java"));

        System.out.println();

        //4.Write a Java program to compare a given strings.

        String str1 = new String("I love flowers.");
        String str2 = new String("I love roses.");
        if (str1.equals(str2))
            System.out.println("Equal");
        else
            System.out.println("Not Equal");

        System.out.println();

        //5.Write a Java program to compare a given string to another string, ignoring case considerations.
        String e = "team work makes the dream work";
        String f = "WORKING together";
        String g = "TeAm WoRk MakES tHe DreAM WorK";

        // Test any of the above Strings equal to one another
        boolean equals1 = e.equalsIgnoreCase(f);
        boolean equals2 = e.equalsIgnoreCase(g);

        // Display the results of the equality checks.
        System.out.println("\"" + e + "\" equals \"" +
                f + "\"? " + equals1);
        System.out.println("\"" + e + "\" equals \"" +
                g + "\"? " + equals2);

        System.out.println();

        //6. Write a java program to get the length of a given string.

        // Get the length of str.
        int length = s.length();
        System.out.println("The string length of '" + s + "' 6" +
                "is: " + length);

        System.out.println();

        //7.Java program to remove vowels from a string.

        String n = s.replaceAll("[aeiouAEIOU]", "");

        System.out.println("After removing vowels: " + n);

        System.out.println();

//8.Print every other word is different cases

        String[] words = s.split("\\s");

        for (int i = 0; i < words.length; i++) {

            // If to validate that the index is divisible by 2
            if (i % 2 == 0) {
                System.out.print(words[i].toUpperCase() + " ");
                //else is odd
            } else {
                System.out.print(words[i].toLowerCase() + " ");
            }
        }
    }
        }

/* 9. Why is a string immutable?
A string is immutable simply because it is a declared value that is stored.
 */




