package seminars.New;

public class newApp {
    public static void main(String[] args) {
        new Client().startWriting();
    }
}

class Client {
    void startWriting() {
        new Innerapp(new Printer()).write();
    }
}

class Innerapp {
    IInterface v;
    public Innerapp(IInterface v) {
        this.v = v;
    }
        
    void write() {
        v.print();
    }
}

interface IInterface {
    void print();
}

class Printer implements IInterface {
    @Override
    public void print() {
        System.out.println("Hello");
    }
}

