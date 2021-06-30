import proxyAndImplementations.IStandardImpl1;
import proxyAndImplementations.IStandardImpl2;
import proxyAndImplementations.Proxy;

public class App {
    public static void main(String[] args) {
        Client client1 = new Client();
        /**Instead of accessing directly the object implementation, we
         * will access it THROUGH a Proxy object implementation
         * So the Client will be tied to the Proxy instead of the Interface implementations: */
        client1.setiStandard(new Proxy());
        client1.operation();
    }
}
