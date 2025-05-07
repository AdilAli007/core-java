import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        SocialMediaApp socialMediaApp = new SocialMediaApp();
        socialMediaApp.loadUsers();
        socialMediaApp.loadPosts();
        socialMediaApp.displayMainMenu();
    }
}
