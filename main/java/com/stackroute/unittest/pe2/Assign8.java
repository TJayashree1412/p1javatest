/*8. Write a program to find all files of a folder and select only given extension fileName
and read content of this file using byte array
 */
import java.io.File;
import java.io.FilenameFilter;

public class Assign8 {

    public static void main(String[] args) throws NullPointerException{
        File file = new File("C:/MyFolder/");
        File[] files = file.listFiles(new FilenameFilter() {

            @Override
            public boolean accept(File dir, String name) {
                if(name.toLowerCase().endsWith(".csv")){
                    return true;
                } else {
                    return false;
                }
            }
        });
        for(File f:files){
            System.out.println(f.getName());
        }
    }
}
