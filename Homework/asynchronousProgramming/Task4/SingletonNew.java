package asynchronousProgramming.Task4;

public class SingletonNew {
    private static SingletonNew instance;
    private int son;

    public SingletonNew() {
        this.son = 0;
    }


    public static SingletonNew getInstance() {
        if (instance == null) {
            synchronized (SingletonNew.class) {
                if (instance == null) {
                    instance = new SingletonNew();
                }
            }
        }
        return instance;
    }

    public void adder(int value) {
        son = son + value;
    }
     public int getSon(){
        return this.son;
     }
}
