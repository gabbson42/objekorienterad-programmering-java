package sprint4.uppgift_6.Server;

import sprint4.uppgift_6.POJO.Kompis;

import java.util.ArrayList;
import java.util.List;

public class DAO {

    List<Kompis> kompisList = new ArrayList<>();

    public DAO() {

        Kompis k1 = new Kompis("Gabriel", "0737294014", "3e maj", "gabriel@mail.com" );
        Kompis k2 = new Kompis("Angelica", "0733434241", "23e april", "angelica@mail.com" );
        Kompis k3 = new Kompis("Rikard", "0735675634", "20e januari", "rikard@mail.com" );
        Kompis k4 = new Kompis("David", "0734123445", "14e juni", "david@mail.com" );

        kompisList.add(k1);
        kompisList.add(k2);
        kompisList.add(k3);
        kompisList.add(k4);
    }

    public List<Kompis> getKompisList() {
        return kompisList;
    }

    public String getKompis(String namn) {
        for(Kompis k : kompisList) {
            if(k.getNamn().equalsIgnoreCase(namn)) {
                return k.toString();
            }
        }
        return null;
    }
}
