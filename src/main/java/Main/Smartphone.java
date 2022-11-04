package Main;

import java.util.ArrayList;
import java.util.List;

public class Smartphone implements Radio, GPS {
    private String model;
    private String brand;
    //private String[] contacts;
    private List<String> contacts = new ArrayList();

    public Smartphone() {
    }

    public Smartphone(String model, String brand) {
        this.model = model;
        this.brand = brand;
        // this.contacts = contacts;
    }

    public void addContact(String contact) {
        this.contacts.add(contact);
    }

    public String getContact(int index) {
        return this.contacts.get(index);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    /*public String[] getContacts() {
        return contacts;
    }*/

    /*public void setContacts(String[] contacts) {
        this.contacts = contacts;
    }*/

    @Override
    public boolean startRadio() {
        System.out.println("Radio started");
        return true;
    }

    @Override
    public boolean stopRadio() {
        System.out.println("Radio stopped");
        return false;
    }

    @Override
    public String getPosition() {
        return "Köln";
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", contacts=" + contacts +
                '}';
    }

    public String getContactByName(String name) {
        int index;
        for (String s : this.contacts) {
            if (s.contains(name)) {
                index = contacts.indexOf(name);
                System.out.println(contacts.get(index));
            }
        }
        return "Kein Kontakt " + name;
    }

    public void removeContactByName(String name) {
        int index;
        for (String s : this.contacts) {
            if (s.contains(name)) {
                index = contacts.indexOf(name);
                contacts.remove(index);
                break;
            }
        }
    }
}
