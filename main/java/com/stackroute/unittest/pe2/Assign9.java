/* 9. Write a program to calculate the frequency of the words in a given file,
Example: Create a file named FileDemo.txt with the following content
i am a man ,
i like to sleep ,
i have a home.
Output: i->3 times,
am-1,
like -1,
have -1,
a-2 etc.,
*/


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Assign9 {

    public static void main(String[] args){
        int i=0;
        String name[]=new String[256];
        File f= new File("demo.txt");
        try{
            Scanner input=new Scanner(f);
            while(input.hasNext()) {
                name[i] = input.next();
                while(input.hasNext(name[0])){
                    i++;
                }
                System.out.println(name+"-"+i);
            }
        }catch(FileNotFoundException ex)
        {
            System.out.printf("ERROR: %s\n",ex);
        }
    }
}