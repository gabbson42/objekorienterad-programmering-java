package sprint2.OvningsUppgifter.Uppgift_9a;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Uppgift9aMain {

    public Uppgift9aMain() {

        Path inFile = Paths.get("src/sprint2/OvningsUppgifter/Uppgift_9a/PersonUppgifter.txt");
        Path outFile = Paths.get("src/sprint2/OvningsUppgifter/Uppgift_9a/PersonerÖver2meter.txt");

        String line1;
        try (BufferedReader br = Files.newBufferedReader(inFile);
             BufferedWriter bw = Files.newBufferedWriter(outFile)) {

            while ((line1 = br.readLine()) != null) {
                String line2 = br.readLine().trim();

                int heightStart = line2.lastIndexOf(',')+1;
                int height = Integer.parseInt(line2.substring(heightStart).trim());
                if (height >= 200) {
                    bw.write(line1);
                    bw.newLine();
                    bw.write(line2);
                    bw.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void main() {
        Uppgift9aMain run = new Uppgift9aMain();
    }
}
