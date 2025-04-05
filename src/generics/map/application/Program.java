package generics.map.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {

        String path = "src\\generics\\map\\assets\\in.txt";
        Map<String, Integer> votes = new LinkedHashMap<>();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            while (line != null){
                String[] fields = line.split(",");
                String name = fields[0];
                int vote = Integer.parseInt(fields[1]);

                if (votes.containsKey(name)){
                    int sumVotes = votes.get(name);
                    votes.put(name, vote + sumVotes);
                } else {
                    votes.put(name, vote);
                }
                line = br.readLine();
            }

            for (String key : votes.keySet()){
                System.out.println(key +": " + votes.get(key));
            }

        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}