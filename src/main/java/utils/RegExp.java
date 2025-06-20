package utils;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {
    public static void main(String[] args) {
        String text = "I!!n.";
        String regExp = "^I..n\\.$";
        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(text);
        System.out.println(matcher.matches());
        System.out.println("=================");
        System.out.println(isPhoneNumber("+972 51 123 44 55"));
        System.out.println(quantityWords("To  be, or no.  to be! "));
        System.out.println(quantityWords(null));
        System.out.println(quantityWords("   "));
        System.out.println(quantityWords(""));
        System.out.println("=================");
        System.out.println(convert2toDec("00"));
        System.out.println(convert2toDec("01"));
        System.out.println(convert2toDec("10"));
        System.out.println(convert2toDec("11"));
        System.out.println(convert2toDec("110010110"));
        System.out.println(convert16toDec("123A1BD"));
        System.out.println(isNotRepeatedWordInText("To  be, or no. . to be!"));
        System.out.println(reverseWord("Ivan"));
        System.out.println(isPalindrome("Ivan"));
        System.out.println(isPalindrome("aBcCba"));
        System.out.println("==========================");
        System.out.println(isPalindromeSentence("To  be, or no. . to be!"));
        System.out.println(isPalindromeSentence("Cigar? Toss it in a can. It is so tragic."));
        List<Integer> listInt = List.of(1,2,3,4,51,1,3,5);
        System.out.println(removeDuplicates(listInt));
    }

    static boolean isPhoneNumber(String phone){  // +972 55 333 44 55
        String regExp = "^\\+972\\s5[0-9]{1}\\s\\d{3}\\s\\d{2}\\s\\d{2}$";  //[A-Z]+  A AB ABC CCC
        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(phone);
        return matcher.matches();
        //[0-9] = \d     \D
        //[A-Za-z0-9_] = \w      \W = [^A-Za-z0-9_]
    }

    static int quantityWords(String text){//  To  be, or no. . to be!
        if(text == null)
            return -1;
        if(text.isBlank())
            return 0;
        String[] array = text.trim().split("\\W+");
        //String[] array = text.trim().split("\\s+");
        //System.out.println(array);   [.,!]
        System.out.println(Arrays.toString(array));
        return array.length;
    }

    static int convert2toDec(String str){
        int dec = Integer.parseInt(str, 2);
        return dec;
    }

    static int convert16toDec(String str){
        int dec = Integer.parseInt(str, 16);
        return dec;
    }

    static Boolean isNotRepeatedWordInText(String text){
        if(text == null || text.isBlank())
            return null;
        String[] array = text.trim().toLowerCase().split("\\W+");
        System.out.println(Arrays.toString(array));
        Set<String> set = new HashSet<>(Arrays.asList(array));
        System.out.println(set);
        return set.size() == array.length;
    }

    static String reverseWord(String word){
        if(word == null || word.isBlank())
            return null;
        return new StringBuilder(word).reverse().toString();
    }
    static Boolean isPalindrome(String word){
        if(word == null || word.isBlank())
            return null;
        word = word.trim().toLowerCase();
        return word.equals(new StringBuilder(word).reverse().toString());
    }
    static Boolean isPalindromeSentence(String text){
        if(text == null || text.isBlank())
            return null;
        text = text.trim().toLowerCase().replaceAll("\\W+", "");
        System.out.println(text);
        return text.equals(new StringBuilder(text).reverse().toString());
    }

    static <T> List<T> removeDuplicates(List<T> list){
        return new ArrayList<>(new HashSet<>(list));
    }
}
