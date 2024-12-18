package withIO_NIO.codeUz_lessons;

import java.io.File;

public class Codeuz_5 {
    public static void main(String[] args) {
        //todo: Pathname ni korib chiqish; Va bu 1-level Constructor hisoblanadi;
        /*File file = new File("io/childPack/childPack2/childPack3/childpack.txt");
        System.out.println(file.exists());*/

        // todo: bu 2 - level constructor hisoblanadi, chunki ichida 2 ta string qabul qilayabdi (String parent, String child);
       /* File file = new File("a/12", "11.txt");
        System.out.println(file.isFile());
        System.out.println(file.getName());*/

        // todo; 3 - level (File parent, String child);
        File file1 = new File("a");
        for (String string : file1.list()) {
            File subFile = new File(file1, string);
            System.out.println(subFile.getName());
            if (subFile.isDirectory()){
                for (String s : subFile.list()) {
                    System.out.println("  "+s);
                }
            }
           // System.out.println(string);
        }




    }
}
