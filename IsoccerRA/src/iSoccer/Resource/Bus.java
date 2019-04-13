package iSoccer.Resource;

public class Bus extends Resource {
    public Bus() {
        this.status = true;
        this.type = "ONIBUS";
    }

    public Bus(double capacity) {
        super(capacity);
    }

}
