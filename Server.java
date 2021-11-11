import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {
        try {
            Registry reg = LocateRegistry.createRegistry(1234);
            reg.rebind("ticket", new Ticket());
            System.out.println("Server has started..\n");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}