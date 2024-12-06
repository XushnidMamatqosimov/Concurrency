package ionioPackage.bufferReaderAndWriterExample;

import java.io.*;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       // bufferReader();
      File file = new File("io/readme.txt");
        try (FileWriter fileWriter = new FileWriter(file,true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
          bufferedWriter.write("hello guys\n");
          bufferedWriter.write("It is time : " + new Date()+" \n");
        } catch (IOException e) {

        }
    }

    private static void bufferReader() {
        File file = new File("io", "readme2.txt");
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
           while (bufferedReader.ready()){
               String readLine = bufferedReader.readLine();
               System.out.println(readLine);
           }
            /*List<String> list = bufferedReader.lines().toList();
            for (int i = 0; i < list.size(); i++) {
                System.out.printf("line number '%d- %s %n'", i + 1, list.get(i));
            }*/
        } catch (IOException e) {

        }
    }
}
