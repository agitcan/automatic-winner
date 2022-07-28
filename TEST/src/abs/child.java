package abs;

public class child extends parent{

    @Override
    void overrideMe() {
        System.out.println("overrided");
    }

    public static void main(String[] args) {
        child c = new child();
        c.overrideMe();
    }
}
