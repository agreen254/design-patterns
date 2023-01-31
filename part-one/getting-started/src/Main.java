public class Main {
    public static void main(String[] args) {
        // here the main class is using the user class meaning that they are coupled
        // e.g. if we change the user class; because the main class uses the user class
        // both classes will need to be recompiled even if the change creates no errors
        // we can make our applications less coupled using interfaces

        var user = new User("Aaron");
        user.sayHello();
    }
}
