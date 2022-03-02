package oving4;

public class Tweet {
    
    private TwitterAccount User;
    private String Text;
    private Tweet reTweet = null;
    private int reTweets;
    

    public Tweet(TwitterAccount User, String Text) {
        this.User = User;
        this.Text = Text;
    }

    public Tweet(TwitterAccount User, Tweet reTweet) {
        if (reTweet.getOwner() == User) {
            throw new IllegalArgumentException("You can not reetweet your own tweet");
        }
        this.User = User;
        this.reTweet = reTweet;
        this.Text = reTweet.getText();
        if (reTweet.getOriginalTweet() != null) {
            this.reTweet = reTweet.getOriginalTweet(); 
        }
        reTweet.increaseRetweet();
    }

    private void increaseRetweet() {
        this.reTweets++;
    }

    public String getText() {
        return this.Text;
    }

    public TwitterAccount getOwner() {
        return this.User;
    }

    public Tweet getOriginalTweet() {
        return this.reTweet;
    }

    public int getRetweetCount(){
        return this.reTweets;
    }
    

}
