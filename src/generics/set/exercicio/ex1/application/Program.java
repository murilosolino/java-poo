package generics.set.exercicio.ex1.application;

import generics.set.exercicio.ex1.entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        String path = "src\\generics\\set\\exercicio\\ex1\\assets\\in.txt";
        Set<LogEntry> logEntrySet = new HashSet<>();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();
            while (line != null){
                String[] fields = line.split(" ");
                Instant instant = Instant.parse(fields[1]);
                logEntrySet.add(new LogEntry(fields[0],instant));
                line = br.readLine();
            }

            System.out.println("Total Users: " + logEntrySet.size());

        }catch (IOException e ){
            System.out.println("Error: " + e.getMessage());
        }

    }
}
