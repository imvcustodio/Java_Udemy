package applocation;

import entites.Post;
import entites.Comment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class PostProgram {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println("--------- Post System --------");
        System.out.println("Do you want add a post (S/N)");

        if (scanner.nextLine().equals("S")) {
            System.out.println("What is the title of the post?: ");
            String title = scanner.next();
            System.out.println("What is the content of the post?: ");
            String content = scanner.next();
            System.out.println("how many likes do you want add: ");
            int likes = scanner.nextInt();
            System.out.println("When was the moment: ");
            scanner.nextLine();
            String moment = scanner.nextLine();

            Date mommentDate = formatter.parse(moment);
            List <Post> posts = new ArrayList<Post>();

            posts.add(new Post(title, content, likes, mommentDate));

            boolean aprovation = true;

            while(aprovation){

                System.out.println("Do you want add a comments for this post? (S/N)");
                String resp =  scanner.next();
                if (resp.equals("S")) {
                    System.out.println("What is the comment for this post?: ");
                    Comment comment = new Comment(String.valueOf(scanner.next()));
                    posts.getFirst().addComments(comment);
                }else{
                    aprovation = false;
                }

            }

            for(Post post : posts){
                System.out.println(post);
            }
        }


        scanner.close();
    }

}
