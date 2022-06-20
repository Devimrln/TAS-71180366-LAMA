import java.io.*;

public class Main {
    public static void main(String[] args) {

        final String fileSoal= "soal.txt";

        try{
            var objekFile = new FileInputStream(fileSoal);

            int Data;

            while((Data = objekFile.read()) != -1){
                System.out.print((char)Data);
            }
        }
        catch (Exception ex){
            System.out.println("file error!");
        }


    }
}
