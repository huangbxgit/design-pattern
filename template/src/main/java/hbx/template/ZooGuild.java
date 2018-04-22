package hbx.template;

import java.util.List;

/**
 * 动物园向导类
 * 动物园游玩有以下步骤
 *   1、抵达动物园
 *   2、购买门票
 *   3、参观动物
 *   4、观看完毕
 *   5、出园回家
 */
public class ZooGuild {
    private Animal animal;

    public ZooGuild(Animal animal){
        this.animal = animal;
    }

    public void play(){
        addriveZoo();
        payTicket();
        seeAnimal();
        playEnd();
        outZoo();
    }

    private void outZoo() {
        System.out.println("出园回家");
    }

    private void playEnd() {
        System.out.println("游园结束了");
    }

    private void seeAnimal() {
            animal.seeMe();
    }

    private void payTicket() {
        System.out.println("啊！动物园竟然强制要买票");
    }

    private void addriveZoo() {
        System.out.println("哦也！我抵达动物园了");
    }
}
