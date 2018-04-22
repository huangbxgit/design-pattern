package hbx.template;

public class Person {
   private ZooGuild zooGuild;
   public Person(ZooGuild zooGuild){
       this.zooGuild = zooGuild;
   }

   public void playZoo(){
       zooGuild.play();
   }
}
