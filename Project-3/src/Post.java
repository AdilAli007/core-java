import java.util.ArrayList;
import java.util.List;

public class Post {
    private int postId;
    private String postText;
    private List<Comment> comments;
    private List<String> likes;

    public Post(int postId, String postText) {
        this.postId = postId;
        this.postText = postText;
        this.comments = new ArrayList<>();
        this.likes = new ArrayList<>();
    }

    public String getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public List<String> getLikes() {
        return likes;
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    public void addLike(String userId) {
        if (!likes.contains(userId)) {
            likes.add(userId);
        }
    }

    @Override
    public String toString() {
        return "Post{" +
                "postId=" + postId +
                ", postText='" + postText + '\'' +
                ", likes=" + likes.size() +
                ", comments=" + comments.size() +
                '}';
    }
}

