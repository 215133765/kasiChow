package za.ac.cput.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
/**
 Ratings.java
 Entity: Ratings
 Author: Zimkhitha Nkqenkqa 216280427
 Date: 10 April 2022
 */
@Entity
public class Ratings {
    @Id
    private int rateID;
    private String orderID;
    private int  rateScale;
    private String rateReview;

    protected Ratings() {
    }

    private Ratings(Ratings.Builder bui) {
        this.rateID = bui.rateID;
        this.orderID = bui.orderID;
        this.rateScale = bui.rateScale;
        this.rateReview = bui.rateReview;

    }

    public int getRateID() {
        return rateID;
    }

    public void setRateID(int rateID) {
        this.rateID = rateID;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public int getRateScale() {
        return rateScale;
    }

    public void setRateScale(int rateScale) {
        this.rateScale = rateScale;
    }

    public String getRateReview() {
        return rateReview;
    }

    public void setRateReview(String rateReview) {
        this.rateReview = rateReview;
    }

    @Override
    public String toString() {
        return "Ratings{" +
                "rateID=" + rateID +
                ", orderID='" + orderID + '\'' +
                ", rateScale=" + rateScale +
                ", rateReview='" + rateReview + '\'' +
                '}';
    }

    public static class Builder {
        private int rateID;
        private String orderID;
        private int rateScale;
        private String rateReview;


        public Builder setRateID(int rateID) {
            this.rateID = rateID;
            return this;
        }

        public Builder setOrderID(String orderID) {
            this.orderID = orderID;
            return this;
        }

        public Builder setRateScale(int rateScale) {
            this.rateScale = rateScale;
            return this;
        }

        public Builder setRateReview(String rateReview) {
            this.rateReview = rateReview;
            return this;
        }

        public Builder copy(Ratings ratings) {
            this.rateID = ratings.rateID;
            this.orderID = ratings.orderID;
            this.rateScale = ratings.rateScale;
            this.rateReview = ratings.rateReview;
            return this;
        }

        public Ratings build() {
            return new Ratings(this);
        }
    }
}
