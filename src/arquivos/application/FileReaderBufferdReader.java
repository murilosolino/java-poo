package arquivos.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderBufferdReader {

    /*Bloco try-with-resources: bloco try que declara um ou mais recursos, e garante que esses recursos
    * serao fechados ao final do bloco
    *
    *  try (BufferedReader br = new BufferedReader(new FileReader(path))){}catch(){}
    * */

    /*FileReader: Classe de conveniência para leitura de arquivos de caracteres
    * BufferReader: Lê texto de um fluxo de entrada de caracteres, armazenando caracteres em buffer para
    * proporcionar uma leitura eficiente de caracteres, matrizes e linhas.*/

    public static void main(String[] args) {
        String path = "C:\\Users\\muril\\temp\\in.txt";
        try (BufferedReader bf = new BufferedReader(new FileReader(path))){
            String line = bf.readLine();
            while (line != null){
                System.out.println(line);
                line = bf.readLine();
            }
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());;
        }
    }


}
