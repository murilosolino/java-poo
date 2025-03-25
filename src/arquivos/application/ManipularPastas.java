package arquivos.application;

import java.io.File;
import java.util.Scanner;

public class ManipularPastas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*Uma varivael do tipo File pode ser tanto um arquivo como uma pasta*/
        System.out.println("Enter a folder path: ");
        String strPath = sc.next();
        File path = new File(strPath);

        //cria um vetor de diretorios
        File[] folders = path.listFiles(File::isDirectory); // referencia de metodo da classe
        System.out.println("Folders");
        for (File folder : folders){
            System.out.println(folder);
        }

        File[] files = path.listFiles(File::isFile); // referencia de metodo da classe
        System.out.println("Files");
        for (File f : folders){
            System.out.println(f);
        }

        //cria um subdiretorio no caminho passado pelo usuario
        new File(strPath, "\\subdir").mkdir();


        sc.close();
    }
}
