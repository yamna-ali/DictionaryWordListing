/*You are to a write a program which asks a user to enter 10 words.
Save these words in an array.  Using the bubble sort algorithm (see below),
 sort the words in an ascending order. For the output, print out the words in the original order,
 in the ascending order, and in the descending order.
 Finally, print an array where all letters have been changed to uppercase.
  Don't forget to write a pseudocode or flowchart BEFORE writing your code.
 */

/*pseudocode
ask the user ten times to enter a word, print the list, then prompt them to make a choice of what they want to do with the list.
1. In ascending order using the sort method
2. In descending order using the reverse method
3. In capitalized using the replaceAll method to change to uppercase
4. To print only letters that start with vowel using a for loop to go through the whole list and then checking each string if it starts with the vowel using the startswith method
5. To change all the vowels in a string to letter a by using the replaceall method to change all the vowels to letter a.

 */


import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class Dictionary {
public static void main(String[] args){
     Scanner scanner= new Scanner(System.in);
    String userInput;
    ArrayList<String> dictionary = new ArrayList<>();
    int choice;


    for (int i = 1; i <=10; i++) {
        System.out.println("Enter word #" + i + ":");
         userInput = scanner.nextLine();
        // check if the word is already in the array list
        while (dictionary.contains(userInput)){
            System.out.println("Word already present in dictionary!");
            System.out.println("Enter word #" + i + ":");
            userInput = scanner.nextLine();
        }

        dictionary.add(userInput);

           }
    System.out.println("Dictionary words in original order");
    System.out.println(dictionary + "\n");

    System.out.println("Now Please specify what you want to do:"+ "\nTo print in ascending order press 1 "+ "\nTo print in descending order press 2: "
    + "\nTo print in upper case press 3 "+ "\nTo print out the words that starts with vowel press 4: "+ "\nTo replace all the vowels with a press 5: ");
   choice=scanner.nextInt();
   if( choice ==1){
    Collections.sort(dictionary);
    System.out.println("Words printed out in acsending order");
    System.out.println(dictionary+ "\n");}
   else if(choice==2){
    Collections.reverse(dictionary);
    System.out.println("Words are prined out in desceneding order");
    System.out.println(dictionary+ "\n");}
   else if(choice ==3){
    System.out.println("Words are printed out in capitalized.");
    dictionary.replaceAll(String::toUpperCase);}
   else if(choice==4){
       System.out.println("Words that start with a vowel are printed out.");
       for(int i=0;i< dictionary.size(); i++) {
           if(dictionary.get(i).startsWith("e")||dictionary.get(i).startsWith("a") || dictionary.get(i).startsWith("i") || dictionary.get(i).startsWith("o") || dictionary.get(i).startsWith("u")) {
               System.out.print( dictionary.get(i)+ "  ");

           }
       }
   }
    else if(choice==5) {
        System.out.println("\nWords with changed vowels are printed out: ");
       String array[] = new String[dictionary.size()];
        for(int i =0; i< dictionary.size();i++)
        {

        array[i] = dictionary.get(i).replaceAll("[aeiou]", "a");

        System.out.print(array[i] + " ");
    }}
    else{
        System.out.println("you did not follow the instructons.");}


}}






