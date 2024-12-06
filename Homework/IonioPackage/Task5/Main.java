package IonioPackage.Task5;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        bufferWriterMethod();
        //bufferReadMethod();

    }

    private static void bufferReadMethod() {
        File file = new File("fileNioDirect/buffer.txt");
        try(FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader)){
            while (bufferedReader.ready()){
                String s = bufferedReader.readLine();
                System.out.println(s);
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void bufferWriterMethod() {
        File file = new File("fileNioDirect/buffer.txt");
        try (FileWriter fileWriter = new FileWriter(file,true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)){
            bufferedWriter.write("Salom Men Xushnidman\n");
            bufferedWriter.write("Men Chonnamda oqiman\n");

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
