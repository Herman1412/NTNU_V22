package oving4;

import java.util.ArrayList;

public class TwitterAccount {

    private String UserName;
    private int TweetCount;
    private int RetweetCount;
    private ArrayList<TwitterAccount> following = new ArrayList<TwitterAccount>();
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();


    public TwitterAccount(String UserName) {
        this.UserName = UserName;
    }

    public String getUserName() {
        return this.UserName;
    }

    public void follow(TwitterAccount account) {
        if (this == account) {
            throw new IllegalStateException("You can not follow yourself");
        }
        if (!isFollowing(account)) {
            this.following.add(account);
        }
    }

    public void unfollow(TwitterAccount account) {
        if (isFollowing(account)) {
            this.following.remove(account);
        }
        else throw new IllegalArgumentException("You do not follow this person");
    }

    public boolean isFollowing(TwitterAccount account) {
        if (this.following.contains(account)) {
            return true;
        }
        else return false;
    }

    public boolean isFollowedBy(TwitterAccount account) {
        if (account.following.contains(this)) {
            return true;
        }
        else return false;
    }

    public void tweet(String Text) {
        Tweet newTweet = new Tweet(this, Text);
        this.tweets.add(0, newTweet);
        this.TweetCount++;
    }

    public void retweet(Tweet tweet) {
        Tweet newRetweet = new Tweet(this, tweet);
        this.tweets.add(newRetweet);
        newRetweet.getOriginalTweet().getOwner().increaseRetweets();
        this.TweetCount++;
    }

    private void increaseRetweets() {
        this.RetweetCount++;
    }

    public Tweet getTweet(int i) {
        return this.tweets.get(i - 1);
    }

    public int getTweetCount() {
        return this.TweetCount;
    }

    public int getRetweetCount() {
        return this.RetweetCount;
    }
}
