public class Comment {
    private int commentId;
    private String userId;
    private String commentText;

    public Comment(int commentId, String userId, String commentText) {
        this.commentId = commentId;
        this.userId = userId;
        this.commentText = commentText;
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "commentId=" + commentId +
                ", userId='" + userId + '\'' +
                ", commentText='" + commentText + '\'' +
                '}';
    }
}
