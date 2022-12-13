import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("C:/Users/grisa/IdeaProjects/silvia_s15/text.txt");
        File file1=new File("C:/Users/grisa/IdeaProjects/silvia_s15/text1.txt");
        String s1=read(file1);
        String s2=read(file);
        int k=0;
        int length=Math.min(s1.length(),s2.length());

        for (int i = 0; i < length; i++) {
            if (s1.charAt(i)!=s2.charAt(i)){
                k+=1;
                System.out.print(s1.charAt(i));
                System.out.println(s2.charAt(i));
            }
        }
        System.out.println(k);
        System.out.println(length-k);
    }
    public static String read(File file){
        Scanner in;
        try {
            in = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        String c = "";
        while(in.hasNext()){
            try{
                c += in.next();}catch(NoSuchElementException e){}
        }
        return c;
    }
}