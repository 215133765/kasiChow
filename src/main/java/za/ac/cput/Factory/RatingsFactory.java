package za.ac.cput.Factory;

import za.ac.cput.Entity.Ratings;

public class RatingsFactory {
    public static Ratings createRatings(int rateID, String orderID, int rateScale, String rateReview) {

        Ratings ratings = new Ratings.Builder().setRateID(rateID)
                .setOrderID(orderID)
                .setRateScale(rateScale)
                .setRateReview(rateReview)
                .build();
        return ratings;
    }
}
