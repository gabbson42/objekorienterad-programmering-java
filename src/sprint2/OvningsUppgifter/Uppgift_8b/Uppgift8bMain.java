package sprint2.OvningsUppgifter.Uppgift_8b;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Uppgift8bMain {

    public Uppgift8bMain() {

        List<Double> temperatureList = new ArrayList<>();

        Path file = Paths.get("src/sprint2/OvningsUppgifter/Uppgift_8a/temp.txt");

        String tempLine;
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                tempLine = sc.nextLine();
                temperatureList.add(Double.parseDouble(tempLine.replaceAll(",", ".")));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        Collections.sort(temperatureList);
        double lowestTemp = temperatureList.getFirst();
        double highestTemp = temperatureList.getLast();

        double tempTemp = 0;
        for (Double d : temperatureList) {
            tempTemp += d;
        }

        double averageTemp = tempTemp / temperatureList.size();

        System.out.println("Månadens lägsta temperatur: " + lowestTemp);
        System.out.println("Månadens högsta temperatur: " + highestTemp);
        System.out.println("Månadens medeltemperatur: " + averageTemp);
    }

    static void main() {
        Uppgift8bMain run = new Uppgift8bMain();
    }
}
