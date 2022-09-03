import java.util.Arrays;

public class NewsFeed {

    // Instance fields
    String[] topics={"Opinion", "Tech", "Science", "Health"};
    int[] views = {0, 0, 0, 0};
    String[] favoriteArticles;

    // Constructor
    public NewsFeed(){
        favoriteArticles = new String[10];
    }

    //setFavoriteArticle
    public void setFavoriteArticle(int favoriteIndex, String newArticle){
        favoriteArticles[favoriteIndex] = newArticle;
    }


    //getTopic()
    public String[] getTopics(){
        return topics;
    }

    //getTopTopic()
    public String getTopTopic(){
        return topics[0];
    }

    //getNumTopics
    public int getNumTopics(){
        return topics.length;
    }

    //viewTopic
    public void viewTopic(int topicIndex){
        views[topicIndex] += 1;
    }

    //Main
    public static void main(String[] args){

        NewsFeed sampleFeed = new NewsFeed();
        String[] topics = sampleFeed.getTopics();
        // String topicsToString = Arrays.toString(topics);
        // System.out.println(topicsToString); // we did not get topics, we need to_String()

        System.out.println("The number of topics is "+ sampleFeed.getNumTopics());

        System.out.println("The top topic is "+ sampleFeed.getTopTopic());
        sampleFeed.viewTopic(1);
        sampleFeed.viewTopic(1);
        sampleFeed.viewTopic(3);
        sampleFeed.viewTopic(2);
        sampleFeed.viewTopic(2);
        sampleFeed.viewTopic(1);
        //System.out.println(Arrays.toString(sampleFeed.views));
        System.out.println("The " + sampleFeed.topics[1] + " topic has been viewed " + sampleFeed.views[1] + " times!");

        sampleFeed.setFavoriteArticle(2, "Humans: Exterminate Or Not?");
        sampleFeed.setFavoriteArticle(3, "Organic Eye Implants");
        sampleFeed.setFavoriteArticle(0, "Oil News");
        //System.out.println(Arrays.toString(sampleFeed.favoriteArticles));
    }
}
