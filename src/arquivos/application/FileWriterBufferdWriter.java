package arquivos.application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterBufferdWriter {
    public static void main(String[] args) {

        /*FileWriter: classe para escrever aquivos.
        * Cria/recria o arquivo: new FileWriter(path)
        * Acrescenta ao arquivo existente: new FileWriter(path,true)
        *
        * BufferedWriter(mais rapido): Grava texto em um fluxo de saída de caracteres, armazenando
        * caracteres em buffer para permitir a gravação eficiente de caracteres únicos, matrizes e strings.
        **/

        String[]lines = new String[]  {"Good morning", "Good afternoon", "Goog night"};

        String path = "C:\\Users\\muril\\temp\\out.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))) {
            for (String line : lines){
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }




    }
}
