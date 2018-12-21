import java.io.*;
import java.util.Scanner;

//Write a program to read the content of a text file, convert the content in upper case and print the same in console
// along with the length of the file.
public class Assign4 {

    public static void main(String[] args){
        int length=0;
        File f= new File("demo.txt");
       //writes to the file
      /*  try{
            PrintWriter output=new PrintWriter(f);
            output.println("Jayashree Santhoshi");
            output.println(22);
            output.close();
    }catch(IOException ex){
            System.out.printf(" ERROR: %s\n",ex);
        }*/
        //reads from the file
        try{
            Scanner input=new Scanner(f);
            while(input.hasNext()) {
                String name = input.next();
                length+=name.length();
                System.out.print(name.toUpperCase()+" ");
            }
            System.out.println("\n"+length);
        }catch(FileNotFoundException ex)
        {
            System.out.printf("ERROR: %s\n",ex);
        }
    }

}