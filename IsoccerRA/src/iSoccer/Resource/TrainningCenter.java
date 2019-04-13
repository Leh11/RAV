package iSoccer.Resource;

public class TrainningCenter extends Resource {
    private int qBathroom;
    private int qRoom;

    public TrainningCenter() {
        this.type  = "CENTRO TREINAMENTO";
        this.status = true;
    }

    public TrainningCenter(double capacity) {
        super(capacity);
        this.setqBathroom(qBathroom);
        this.setqRoom(qRoom);
    }

    public void setqBathroom(int qBathroom) {
        this.qBathroom = qBathroom;
    }

    public void setqRoom(int qRoom) {
        this.qRoom = qRoom;
    }

    public int getqBathroom() {
        return qBathroom;
    }

    public int getqRoom() {
        return qRoom;
    }
}
