package iSoccer.Partiner;

public class Address {

    private String neight;
    private String nHouse;

    public Address() {
    }

    public Address(String neight, String nHouse) {
        this.setNeight(neight);
        this.setnHouse(nHouse);
    }

    public String getNeight() {
        return neight;
    }

    public void setNeight(String neight) {
        this.neight = neight;
    }

    public String getnHouse() {
        return nHouse;
    }

    public void setnHouse(String nHouse) {
        this.nHouse = nHouse;
    }
}
