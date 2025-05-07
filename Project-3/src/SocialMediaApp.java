import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class SocialMediaApp {
    List<User> users = new ArrayList<>();
    User loggedInUser = null;

    public void displayMainMenu() throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("||||||||||||||||||||||||||||||||||||||| WELCOME TO SOCIAL MEDIA APP ||||||||||||||||||||||||||||||||||||||||||||");

        System.out.println("==================================");
        System.out.println("1 : CREATE ACCOUNT");
        System.out.println("2 : LOGIN");
        System.out.println("==================================");
        System.out.print("ENTER YOUR CHOICE OF NUMBER : ");

        while (true) {

            int num = scanner.nextInt();
            if (num == 1) {
                this.createAccount();
                this.displayMainMenu();
            } else if (num == 2) {
                this.login();
                this.displayMainMenu();
            } else {
                System.out.println("INVALID CHOICE");
            }
        }
    }

    public void createAccount() throws IOException {
        System.out.println("==================================");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter User ID: ");
        String userId = scanner.nextLine();
        System.out.print("Enter Username: ");
        String username = scanner.nextLine();
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();
        System.out.print("Enter Contact: ");
        String contact = scanner.nextLine();
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        User user = new User(userId, username, email, contact, password);
        users.add(user);
        this.saveUsers();

        System.out.println("Account created successfully.");
        System.out.println("==================================");
    }

    public void login() throws IOException {
        System.out.println("Enter Login Details :");
        System.out.println("==================================");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String username = scanner.nextLine();
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        loggedInUser = confirmUser(username, password);
        if (loggedInUser != null) {
            System.out.println("Login successful.");
            this.displayUserMenu();
        } else {
            System.out.println("Bad credentials.");
        }
    }

    public User confirmUser(String username, String password) {
/*        for (User user : users) {
            if (user.getUsername().equals(username) && user.password(password)) {
                return user;
            }
        }
        return null;*/

        return users.stream()
                .filter(u -> u.getUsername().equals(username) && u.getPassword().equals(password))
                .findFirst()
                .orElse(null);

    }

    public void displayUserMenu() throws IOException {
        System.out.println("==================================");
        Scanner scanner = new Scanner(System.in);

        System.out.println("1- Update Account");
        System.out.println("2- Add New Post");
        System.out.println("3- Update Post");
        System.out.println("4- Delete Post");
        System.out.println("5- Comment on Post");
        System.out.println("6- Like a Post");
        System.out.println("7- Delete Comment from Post");
        System.out.println("8- Show All Feed");
        System.out.println("9- Logout");
        System.out.println("==================================");

        System.out.print("ENTER YOUR CHOICE OF NUMBER : ");

        int choice = scanner.nextInt();

        if (choice == 1) {
            this.updateAccount();
        } else if (choice == 2) {
            this.addNewPost();
        } else if (choice == 3) {
            this.updatePost();
        } else if (choice == 4) {
            this.deletePost();
        } else if (choice == 5) {
            this.commentOnPost();
        } else if (choice == 6) {
            this.likePost();
        } else if (choice == 7) {
            this.deleteComment();
        } else if (choice == 8) {
            this.showAllFeed();
        } else if (choice == 9) {
            this.logout();
        }
    }

    public void updateAccount() throws IOException {
        System.out.println("==================================");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter new Username: ");
        String username = scanner.nextLine();
        System.out.print("Enter new Email: ");
        String email = scanner.nextLine();
        System.out.print("Enter new Contact: ");
        String contact = scanner.nextLine();
        System.out.print("Enter new Password: ");
        String password = scanner.nextLine();

        loggedInUser.setUsername(username);
        loggedInUser.setEmail(email);
        loggedInUser.setContact(contact);
        loggedInUser.setPassword(password);
        System.out.println("Account updated successfully.");
        this.displayUserMenu();
    }

    public void addNewPost() throws IOException {
        System.out.println("==================================");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Post ID: ");
        int postId = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter Post Text: ");
        String postText = scanner.nextLine();

        Post post = new Post(postId, postText);
        loggedInUser.getPosts().add(post);
        this.savePosts();

        System.out.println("Post added successfully.");
        this.displayUserMenu();
    }

    public void updatePost() throws IOException {
        System.out.println("==================================");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Post ID to Update: ");
        int postId = scanner.nextInt();
        System.out.print("Enter New Post Text: ");
        String newText = scanner.next();

        Post post = findPostById(postId);
        if (post != null) {
            post.setPostText(newText);
            System.out.println("Post updated successfully.");
        } else {
            System.out.println("Post not found.");
        }

        this.displayUserMenu();
    }

    public void deletePost() throws IOException {
        System.out.println("==================================");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Post ID to Delete: ");
        int postId = scanner.nextInt();

        Post post = findPostById(postId);
        if (post != null) {
            loggedInUser.getPosts().remove(post);
            System.out.println("Post deleted successfully.");
        } else {
            System.out.println("Post not found.");
        }

        this.displayUserMenu();
    }

    public Post findPostById(int postId) {
/*        for (Post post : loggedInUser.getPosts()) {
            if (post.getPostId() == postId) {
                return post;
            }
        }
        return null;*/

        return loggedInUser.getPosts().stream()
                .filter(post -> post.getPostId() == postId)
                .findFirst()
                .orElse(null);
    }

    public void commentOnPost() throws IOException {
        System.out.println("==================================");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Post ID to Comment on: ");
        int postId = scanner.nextInt();
        System.out.print("Enter Comment ID: ");
        int commentId = scanner.nextInt();
        System.out.print("Enter your Comment: ");
        String commentText = scanner.next();

        Post post = findPostById(postId);
        if (post != null) {
            Comment comment = new Comment(commentId, loggedInUser.getUserId(), commentText);
            post.addComment(comment);
            System.out.println("Comment added successfully.");
        } else {
            System.out.println("Post not found.");
        }

        this.displayUserMenu();
    }

    public void likePost() throws IOException {
        System.out.println("==================================");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Post ID to Like: ");
        int postId = scanner.nextInt();
        System.out.print("Do you like the post? (yes/no): ");
        String like = scanner.next();

        if (like.equalsIgnoreCase("yes")) {
            Post post = findPostById(postId);
            if (post != null) {
                post.addLike(loggedInUser.getUserId());
                System.out.println("Post liked successfully.");
            } else {
                System.out.println("Post not found.");
            }
        }

        this.displayUserMenu();
    }

    public void deleteComment() throws IOException {
        System.out.println("==================================");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Post ID: ");
        int postId = scanner.nextInt();
        System.out.print("Enter Comment ID to Delete: ");
        int commentId = scanner.nextInt();

        Post post = findPostById(postId);
        if (post != null) {
            List<Comment> comments = post.getComments();

            for (int i = 0; i < comments.size(); i++) {

                if (comments.get(i).getCommentId() == commentId) {
                    comments.remove(i);
                    System.out.println("Comment deleted successfully.");
                    return;
                }
            }
        } else {
            System.out.println("Post not found");
        }
        this.displayUserMenu();

    }

    public void showAllFeed() throws IOException {

/*        for (Post post : loggedInUser.getPosts()) {
            System.out.println(post);
            for (Comment comment : post.getComments()) {
                System.out.println("\t" + comment);
            }
        }
        this.displayUserMenu();*/

        loggedInUser.getPosts().forEach(post -> {System.out.println(post);
            post.getComments().forEach(comment -> System.out.println("\t" + comment));
        });
    }

    public void logout() {
        loggedInUser = null;
        System.out.println("Logged out successfully.");
    }

    public void saveUsers() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("users.txt", true)); // append = true

        for (User user : users) {
            writer.write(user.getUserId() + "," + user.getUsername() + "," + user.getEmail() + "," +
                    user.getContact() + "," + user.getPassword());
            writer.newLine();
        }

        writer.close();
    }

    public void loadUsers() throws IOException {
        File file = new File("users.txt");
        if (!file.exists()) return;

        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] array = line.split(",");
            if (array.length == 5) {
                User user = new User(array[0], array[1], array[2], array[3], array[4]);
                users.add(user);
            }
        }
        reader.close();
    }

    public void savePosts() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("posts.txt"));

        for (User user : users) {
            for (Post post : user.getPosts()) {
                writer.write(user.getUserId() + "," + post.getPostId() + "," + post.getPostText());
                writer.newLine();
            }
        }

        writer.close();
    }

    public void loadPosts() throws IOException {
        File file = new File("posts.txt");
        if (!file.exists()) return;

        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] array = line.split(",", 3);
            if (array.length == 3) {
                String userId = array[0];
                int postId = Integer.parseInt(array[1]);
                String postText = array[2];

                Post post = new Post(postId, postText);

                for (User user : users) {
                    if (user.getUserId().equals(userId)) {
                        user.getPosts().add(post);
                        break;
                    }
                }
            }
        }
        reader.close();
    }
}



