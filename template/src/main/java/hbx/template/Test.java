package hbx.template;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<Animal>();
        ZooGuild zooGuild = new ZooGuild(new Animal() {
            public void seeMe() {
                System.out.println("我要看大猩猩");
            }
        });
        Person me = new Person(zooGuild);
        me.playZoo();
    }
}
