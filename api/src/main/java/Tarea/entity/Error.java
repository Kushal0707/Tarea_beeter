package Tarea.entity;

/**
 * Created by esr on 26/10/15.
 */
public class Error {
    private int status;
    private String reason;

    public Error() {

    }
    public Error(int status, String reason) {
        this.status = status;
        this.reason = reason;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

}
