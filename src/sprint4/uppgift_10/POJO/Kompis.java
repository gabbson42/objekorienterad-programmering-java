package sprint4.uppgift_10.POJO;

import java.io.Serializable;

public class Kompis implements Serializable {

    private String namn;
    private String mobilnummer;
    private String födelsedag;
    private String email;

    public Kompis() {}

    public Kompis(String namn, String mobilnummer, String födelsedag, String email) {
        this.namn = namn;
        this.mobilnummer = mobilnummer;
        this.födelsedag = födelsedag;
        this.email = email;
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public String getMobilnummer() {
        return mobilnummer;
    }

    public void setMobilnummer(String mobilnummer) {
        this.mobilnummer = mobilnummer;
    }

    public String getFödelsedag() {
        return födelsedag;
    }

    public void setFödelsedag(String födelsedag) {
        this.födelsedag = födelsedag;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return namn + ", " + mobilnummer + ", " + födelsedag + ", " + email;
    }
}
