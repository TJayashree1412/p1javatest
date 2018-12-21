package com.stackroute.unittest.pe1;
public class VowelConsonant {
    public String[] vowelconsonant(String s) {
        char c[] = s.toCharArray();
        String output[]=new String[s.length()];
        String error[]={"error!"};
        for (int i = 0; i < s.length(); i++) {
            if(((c[i]>=65) && (c[i]<=90)) || ((c[i]>=97) && (c[i]<=122))){
                if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u'|| c[i] == 'A' || c[i] == 'E' || c[i] == 'I' || c[i] == 'O' || c[i] == 'U') {
                    output[i] = "Vowel";
                } else {
                    output[i] = "Consonant";
                }
            }else{
                return error;
            }
        }
        return output;
    }
//    public static void main(String args[]){
//        VowelConsonant v=new VowelConsonant();
//        String result[]=v.vowelconsonant("ap$i");
//        for(int j=0;j<result.length;j++){
//            System.out.println(result[j]);
//        }
//    }
}