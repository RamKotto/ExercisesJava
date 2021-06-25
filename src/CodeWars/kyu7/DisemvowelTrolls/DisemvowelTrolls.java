package CodeWars.kyu7.DisemvowelTrolls;

/*
Trolls are attacking your comment section!
A common way to deal with this situation is to remove all of the vowels from the trolls' comments, neutralizing the threat.
Your task is to write a function that takes a string and return a new string with all vowels removed.
For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".
Note: for this kata y isn't considered a vowel.
*/


public class DisemvowelTrolls {
    public static void main(String[] args) {
        String badComment = "Apple is green!";
        System.out.println(disemvowel(badComment));   //ppl s grn!
    }

    public static String disemvowel(String comment) {
        String vowels = "[AEIOUaeiou]";    // regex
        comment = comment.replaceAll(vowels, "");
        return comment;
    }
}


/*
Latest solution:
public static String disemvowel(String comment) {
  return comment.replaceAll("[aeiouAEIOU]", "");
}
 */
