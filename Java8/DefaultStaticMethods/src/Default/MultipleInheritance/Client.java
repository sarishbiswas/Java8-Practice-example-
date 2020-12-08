package Default.MultipleInheritance;

public class Client implements Interface1,Interface2,Interface3 {

    public static void main(String[] args) {
        Client client = new Client();
        client.methodA();
        client.methodB();
        client.methodC();
    }
}
