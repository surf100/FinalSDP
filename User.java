public class User implements Observer {
    private String email;

    public User(String email) {
        this.email = email;
    }

    @Override
    public void update(String message) {
        System.out.println("Notification to " + email + ": " + message);
    }
}