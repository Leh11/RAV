package iSoccer.Resource;

public abstract class Resource {
    protected String type;
    private double capacity;
    protected boolean status;


    public Resource(){

    }

    public Resource(double capacity){
        this.setCapacity(capacity);
    }


    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public String getType() {
        return type;
    }

    public boolean isStatus() {
        return status;
    }


}
