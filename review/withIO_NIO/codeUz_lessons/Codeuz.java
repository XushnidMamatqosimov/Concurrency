package withIO_NIO.codeUz_lessons;

import java.io.File;

public class Codeuz {
    public static void main(String[] args) {
        File file = new File("a");
        //System.out.println(file.exists());
        if (!file.exists()){
            boolean mkdir = file.mkdir();
            System.out.println(mkdir);
        }

       // System.out.println(file.isDirectory());
        // System.out.println(file.isFile());

        // todo: file.delete() methodi bilan biz yaratgan filemizni ochirib tashlashimiz mumkin;
        //System.out.println(file.delete());

        /*String [] array = file.list();
        for (String string : array) {
            File subFile = new File("a/"+string);
            //System.out.println(string);
            if (subFile.isFile()){
                System.out.println("bu file :"+string);
            }else {
                System.out.println("bu folder :"+string);
            }
        }*/



        File [] subFileList = file.listFiles();
        for (File subFile : subFileList) {
            if (subFile.isFile()){
                System.out.println("bu file"+subFile);
            } else {
                System.out.println("bu folder"+ subFile);
                System.out.println(subFile.isHidden()
                );
            }

        }


    }
}
