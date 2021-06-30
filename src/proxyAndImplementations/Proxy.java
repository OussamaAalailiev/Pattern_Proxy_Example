package proxyAndImplementations;

import java.util.Random;

public class Proxy implements IStandard {
//    private IStandardImpl1 impl1 = new IStandardImpl1();
    /**I have noticed that the access to the "method" below from the "Client" is not controlled
     * so I decide to control it through a 'PROXY' by creating a class called "Proxy" that will implements
     * the same Interface "IStandard" AND have a Composition Relationship with the other
     * implementations like (ex:IStandardImpl1, IStandardImpl2...)
     * AND saving some memory:*/
    private IStandardImpl2 impl2;
    @Override
    /**I am controlling the access to the methods of other implementations*/
    public void operation() {
        System.out.println("Verification of Access Conditions due to security purposes....");
        boolean b = new Random().nextBoolean();
        if(b){
            System.out.println("Before calling the method");
            impl2 =  new IStandardImpl2();
            impl2.operation();
            System.out.println("After calling the method");
        }else {
            throw new RuntimeException("Access Forbidden!");
        }
    }
}
