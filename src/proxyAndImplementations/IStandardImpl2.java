package proxyAndImplementations;

public class IStandardImpl2 implements IStandard {
    /**I have noticed that the access to the "method" below from the "Client" is not controlled
     * so I decide to control it through a 'PROXY' by creating a class called "Proxy" that will implements
     * the same Interface "IStandard" AND have a Composition Relationship with the other
     * implementations like (ex:IStandardImpl1, IStandardImpl2...):*/
    @Override
    public void operation() {
        System.out.println("************");
        System.out.println("Execution of operation() in IStandardImpl2 ........");
        System.out.println("************");
    }
}
