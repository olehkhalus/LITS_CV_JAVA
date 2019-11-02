package strings;


import java.util.Arrays;

public class StringTasks {


    public char MaxOccurChar(String str){
         final int ASCII_SIZE = 256;
       int[] count = new int[ASCII_SIZE];

       for (int i=0; i<str.length();i++){
           count[str.charAt(i)]++;
       }
       int max = -1;
       char result = ' ';

       for (int i=0; i<str.length(); i++){
           if (max < count[str.charAt(i)]) {
               max = count[str.charAt(i)];
               result = str.charAt(i);
           }
       }
       return result;
    }

    public String reverseString(String str){
        String strReverse = " ";
        String[] str1 = str.split(" ");
        System.out.println(Arrays.toString(str1));
        for (int i = str1.length-1; i>=0; i--){
            strReverse += str1[i] + " ";
        }
        return strReverse;
    }

    public String removeString(String str){
        String str2 = "";
        for (int i=0; i<str.length(); i++){
            if(str.substring(i,i+1).equals("b")){
                continue;
            }
            else if (str.substring(i,i+1).equals("a") && str.substring(i+1,i+2).equals("c")){
                i=i+1;
                continue;
            }
            str2 = str2 + str.substring(i,i+1);
        }
       return str2;
    }

    public boolean sameChar(String str){
        for(int i = 1; i < str.length() - 1; i++) {
            if(str.charAt(i) == '#' && str.charAt(i - 1) != str.charAt(i + 1))
                return false;
        }
        return true;
    }

    public boolean redBlue(String str){
        int countRed = 0;
        int countBlue = 0;
        for (int i=0; i<str.length()-2; i++){
            if(str.substring(i,i+3).equals("red")){
                countRed++;
            }
        }
        for (int i=0; i<str.length()-3; i++){
            if(str.substring(i,i+4).equals("blue")){
                countBlue++;
            }
        }
        if(countRed==countBlue){
            return true;
        }
        return false;
    }

    public String repeatChar(String str){
        String str3 = "";
        for(int i=0; i<str.length(); i++){
            str3 += str.substring(i,i+1) + str.substring(i,i+1);
        }
        return str3;
    }
}
