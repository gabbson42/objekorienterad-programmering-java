package sprint2.OvningsUppgifter.Uppgift_8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Uppgift8Main {

    public Uppgift8Main(){

        List<Double> temperatureList = new ArrayList<>();

        try(BufferedReader buf = new BufferedReader
                (new FileReader("src/sprint2/OvningsUppgifter/Uppgift_8/temp.txt"))){

            String tempLine;
            while((tempLine = buf.readLine()) != null){
                temperatureList.add(Double.parseDouble(tempLine.replaceAll(",", ".")));
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }

        Collections.sort(temperatureList);

        double lowestTemp = temperatureList.getFirst();
        double highestTemp = temperatureList.getLast();
        double tempTemp = 0;

        for(Double d : temperatureList){
            tempTemp += d;
        }

        double averageTemp = tempTemp/temperatureList.size();

        System.out.println("Månadens lägsta temperatur: " + lowestTemp);
        System.out.println("Månadens högsta temperatur: " + highestTemp);
        System.out.println("Månadens medeltemperatur: " + averageTemp);

    }

    static void main() {
        Uppgift8Main run = new Uppgift8Main();
    }
}
