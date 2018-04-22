package hbx.strategy;

public class PayStatus {
    private String code;
    private String msg;
    private Object data;

    public PayStatus(String code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    @Override
    public String toString() {
        return "PayStatus{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
