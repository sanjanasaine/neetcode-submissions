class Twitter 
{
    HashMap<Integer, List<Tweet>> tweets;
    HashMap<Integer , Set<Integer>> following;
    int time;

    class Tweet
    {
        int tweetId;
        int time;

        Tweet(int tweetId , int time)
        {
            this.tweetId = tweetId;
            this.time = time;
        }
    }
    public Twitter() 
    {
        tweets = new HashMap<>();
        following = new HashMap<>();

        time = 0;
    }
    
    public void postTweet(int userId, int tweetId) 
    {
       if(!tweets.containsKey(userId))
       {
          tweets.put(userId , new ArrayList<>());
       }

       tweets.get(userId).add(new Tweet(tweetId, time));

       time++;

    }
    
    public List<Integer> getNewsFeed(int userId) 
    {
        //tweets by user itself
        List<Integer> result = new ArrayList<>();
        PriorityQueue<Tweet> pq = new PriorityQueue<>((a,b) -> b.time - a.time); 

        if(tweets.containsKey(userId))
        {
           List<Tweet> list = tweets.get(userId);
           for(int i = 0; i < list.size(); i++)
           {
             Tweet tweet = list.get(i);
             pq.add(tweet);
           }
        } 

        //tweets by following
        if(following.containsKey(userId))
        {
            Set<Integer> set = following.get(userId);
            Integer[] user = set.toArray(new Integer[0]);

            for(int i = 0; i < user.length; i++)
            {
                int followeeId = user[i];

                if(tweets.containsKey(followeeId))
                {
                    List<Tweet> list = tweets.get(followeeId);

                    for(int j = 0; j < list.size(); j++)
                    {
                        Tweet tweet = list.get(j);
                        pq.add(tweet);
                    }
                }
            }
        } 


        while(!pq.isEmpty() && result.size() < 10)
        {
            Tweet tweet = pq.poll();

            result.add(tweet.tweetId);
        } 

        return result;
    }
    
    public void follow(int followerId, int followeeId) 
    {
       if(!following.containsKey(followerId))
          following.put(followerId, new HashSet<>());

       following.get(followerId).add(followeeId);       
    }
    
    public void unfollow(int followerId, int followeeId) 
    {
       if(following.containsKey(followerId))
           following.get(followerId).remove(followeeId);    
    }
}
