package strings;

public class StringTasks {


    public char MaxOccurChar(String st1){
         final int ASCII_SIZE = 256;
       int[] count = new int[ASCII_SIZE];

       for (int i=0; i<st1.length();i++){
           count[st1.charAt(i)]++;
       }
       int max = -1;
       char result = ' ';

       for (int i=0; i<st1.length(); i++){
           if (max < count[st1.charAt(i)]) {
               max = count[st1.charAt(i)];
               result = st1.charAt(i);
           }
       }
       return result;
    }

    public String reverseString(String st2){
        String str2 = "";
        for (int i=0; i<st2.length(); i++){
            str2 += st2.substring(st2.length()-(i+1),st2.length()-i);
        }
        return str2;
    }

    public String removeString(String st3){
        String str3 = " ";


        return str3;
    }
    public boolean sameChar(String st4){
        for(int i = 1; i < st4.length() - 1; i++) {
            if(st4.charAt(i) == '#' && st4.charAt(i - 1) != st4.charAt(i + 1))
                return false;
        }
        return true;
    }

    public boolean redBlue(String st5){
        int countRed = 0;
        int countBlue = 0;
        for (int i=0; i<st5.length()-2; i++){
            if(st5.substring(i,i+3).equals("red")){
                countRed++;
            }
        }
        for (int i=0; i<st5.length()-3; i++){
            if(st5.substring(i,i+4).equals("blue")){
                countBlue++;
            }
        }
        if(countRed==countBlue){
            return true;
        }
        return false;
    }

    public String repeatChar(String st6){
        String str4 = "";
        for(int i=0; i<st6.length(); i++){
            str4 += st6.substring(i,i+1) + st6.substring(i,i+1);
        }
        return str4;
    }
}
