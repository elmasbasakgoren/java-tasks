package cz.acamar.tasks;

public class Task1 {

    /**
     * Task 1. Length of the last word.
     * <p>
     * Given a string s consisting of some words separated by some number of spaces,
     * return the length of the last word in the string.
     * <p>
     * A word is a maximal substring consisting of non-space characters only.
     * <p>
     * Example input: "Hello World"
     * Expected output: 5
     *
     * @param str - a string s consisting of some words separated by some number of spaces.
     * @return - the length of the last word in the string.
     */

    /**
    basak.goren
     */
    public int lengthOfLastWord(String str) {
       String lastWord = str.substring(str.lastIndexOf(" ") + 1);
       if(lastWord.equals("")){
          lastWord = str.trim().substring(str.trim().lastIndexOf(" ") + 1);
       }
        int length = lastWord.length();
        return length;
    }
}
