package rozgrzewka0220;

public class Example {

    private boolean flag = true;

    public static void main(String[] args) {
        //zmienna lokalna metody
        boolean flag = false;
        System.out.println(flag);
        new Example().printFlag();
    }

    public void printFlag() {
        boolean flag = false;
        System.out.println("Flag " + flag);
        System.out.println("Flag this " + this.flag);
    }

}
