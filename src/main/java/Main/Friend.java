package Main;

public class Friend extends Contact{

    private int number;

    public Friend(String name, int number) {
        super(name);
        this.number=number;
    }

    public Friend() {
    }

    @Override
    public String toString() {
        return "Friend{" +
                "name= " + getName()+
                " number= " + number +
                '}';
    }
}
