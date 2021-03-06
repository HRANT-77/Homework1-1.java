package com.company.ex2;

public class Product {
    private int upvotes;
    private int downvotes;

    private void setUpvotes(int upvotes) {
        if(upvotes > 0)
            this.upvotes = upvotes;
    }

    private void setDownvotes(int downvotes) {
        if(downvotes > 0)
            this.downvotes = downvotes;
    }

    public int getVoteCount(int upvotes, int downvotes){
        setDownvotes(downvotes);
        setUpvotes(upvotes);
        return upvotes - downvotes;
    }
}
