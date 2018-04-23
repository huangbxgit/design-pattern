package hbx.dispatch;

public class Test {
    public static void main(String[] args) {
        TravelHome th = new TravelHome();
        User user = new User(th);
        user.travel("上海");
    }
}
