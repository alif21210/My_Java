public abstract class Absract {
    int a;
    int b;

    public Absract(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void display(){
        System.out.println("Hello from class abstract");
    }

    abstract void sum();
}




