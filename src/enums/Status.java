package enums;

public enum Status {
    AWAKE("awake"),
    SLEEP("sleep");
    private String status;
    Status(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return this.status;
    }

}
