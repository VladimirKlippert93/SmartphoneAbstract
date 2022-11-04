package Main;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*Contact vlad = new Friend("Vlad",3893233);
        Contact ben = new Friend("Ben",1281333);

        System.out.println(vlad);
        System.out.println(ben);*/
        Smartphone handy = new Smartphone("Galaxy","Samsung");
        System.out.println(handy);
        handy.addContact("Vladi");
        handy.addContact("Rudolf");
        handy.addContact("Harry");
        handy.addContact("Rudolf");
        handy.getContactByName("Vladi");
        handy.startRadio();
        System.out.println(handy);
        handy.removeContactByName("Rudolf");
        System.out.println(handy);
    }
}
