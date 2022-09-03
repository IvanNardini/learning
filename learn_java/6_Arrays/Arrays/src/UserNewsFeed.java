import java.util.Arrays;

public class UserNewsFeed {

    // Instance fields
    String[] topics;

    // Constructor
    public UserNewsFeed(String[] InitialTopics){
        topics = InitialTopics;
    }

    public static void main(String[] args){
        UserNewsFeed feed; //initialize an empty variable

        if (args[0].equals("Human")){
            String[] humanTopics = {"Politics", "Science", "Sports", "Love"};
            feed = new UserNewsFeed(humanTopics);
        } else if (args[0].equals("Robot")){
            String[] robotTopics  = {"Oil", "Parts", "Algorithms", "Love"};
            feed = new UserNewsFeed(robotTopics);
        } else {
            String[] genericTopics = {"Opinion", "Tech", "Science", "Health"};
            feed = new UserNewsFeed(genericTopics);
        }

        System.out.println("The topics in this feed are:");
        System.out.println(Arrays.toString(feed.topics));

    }
}
