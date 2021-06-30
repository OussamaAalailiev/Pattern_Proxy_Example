import proxyAndImplementations.IStandard;

public class Client {
    private IStandard iStandard;
/**This class compute a operation() based on an other operation() implementation of the Interface above*/
    public void operation(){
        iStandard.operation();
    }

    public void setiStandard(IStandard iStandard) {
        this.iStandard = iStandard;
    }
}
