package sprint4.uppgift_12.Server;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class MultiWriter {

    private List<PrintWriter> writers = new ArrayList<>();

    public void addWriter(PrintWriter p){
        writers.add(p);
    }

    public void removeWriter(PrintWriter p){
        writers.remove(p);
    }

    public void print(String s){
        for(PrintWriter writer : writers){
            writer.println(s);
        }
    }
}
