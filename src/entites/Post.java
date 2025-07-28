package entites;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    private String title;
    private String content;
    private Integer likes;
    private Date moment;

    private List<Comment> comments = new ArrayList<>();


    public Post(){

    }
    public Post(String title, String content, Integer likes, Date moment) {
        this.title = title;
        this.content = content;
        this.likes = likes;
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public Integer getLikes() {
        return likes;
    }
    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Date getMoment() {
        return moment;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void addComments(Comment comment) {
        comments.add(comment);
    }

    public void removeComments(Comment comment) {
        comments.remove(comment);
    }

    public String toString(){

        StringBuilder sb = new StringBuilder();
        sb.append("Title: " + title + "\n");
        sb.append("Content: " + content + "\n");
        sb.append("Likes: " + likes + "\n");
        sb.append("Moment: " + moment.toString() + "\n");
        sb.append("Comments: ");
        for(Comment comment : comments){
            sb.append(comment.getText() + "\n");
        }
        return sb.toString();
    }
}
