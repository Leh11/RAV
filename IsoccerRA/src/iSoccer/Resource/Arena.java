package iSoccer.Resource;

public class Arena extends Resource {
    private int qBathroom;
    private int qSnackBar;

    public Arena() {
        this.status = true;
        this.type = "ARENA";
    }

    public Arena(double capacity) {
        super(capacity);
        this.setqBathroom(qBathroom);
    }

    public void setqBathroom(int qBathroom) {
        this.qBathroom = qBathroom;
    }

    public void setSnackBar(int qSnackBar) {
        this.qSnackBar = qSnackBar;
    }

    public int getqBathroom() {
        return qBathroom;
    }

    public int getqSnackBar() {
        return qSnackBar;
    }
}
