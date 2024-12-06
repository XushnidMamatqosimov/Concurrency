package ionioPackage.serializationAndDeserialization;

import java.io.Serializable;

public class SingletonTwo  implements Serializable {
    private volatile static SingletonTwo singletonTwo = null;

    private SingletonTwo() {
    }

    public static SingletonTwo getSingletonTwo() {
        if (singletonTwo == null) {
            singletonTwo = new SingletonTwo();
        }
        return singletonTwo;
    }

    public Object readResolve(){
        return singletonTwo;
    }

    public static void main(String[] args) {
        SingletonTwo singletonTwo1 = SingletonTwo.getSingletonTwo();
        SingletonTwo singletonTwo2 = SingletonTwo.getSingletonTwo();
        System.out.println(System.identityHashCode(singletonTwo1));
        System.out.println(System.identityHashCode(singletonTwo2));
    }
}

