public class TweetCounter {

    public static void main(String[] args){
        int tweetMaxLenght = 280;

        String tweet = "Liz Lemon, ninjas are kind of cool... I just dont know any personally. Get on that.";
        if (tweet.length() <= tweetMaxLenght){
            System.out.println("The tweet is compliance");
        } else {
            System.out.println("The tweet is " + (tweetMaxLenght - tweet.length()) + "too long");
        }
    }
}
