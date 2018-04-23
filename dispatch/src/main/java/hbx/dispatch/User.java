package hbx.dispatch;

public class User {
    private TravelHome travelHome;

    public User(TravelHome travelHome){
        this.travelHome = travelHome;
    }

    public void travel(String name){
        travelHome.dispatch(name);
    }
}
