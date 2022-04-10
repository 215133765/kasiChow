package za.ac.cput.Entity;
/**
 * Author: GAYNOR JANTJIES 213069555
 * POJO Supermarket.java
 *  Supermarket Entity file to be implemented
 * Created: 9/04/2022
 * */

public class Restaurant {

    private int restaurantId;
    private String restaurantName;
    private String restaurantLocation;

    private Restaurant(Restaurant.Builder rs){

        this.restaurantId = rs.restaurantId;
        this.restaurantName = rs.restaurantName;
        this.restaurantLocation = rs.restaurantLocation;
    }

    public int getRestaurantId() {
        return restaurantId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public String getRestaurantLocation() {
        return restaurantLocation;
    }

    @Override
    public String toString() {
        return "Builder{" +
                "restaurantId=" + restaurantId +
                ", restaurantName='" + restaurantName + '\'' +
                ", restaurantLocation='" + restaurantLocation + '\'' +
                '}';
    }


    public static class Builder {


        private int restaurantId;
        private String restaurantName;
        private String restaurantLocation;



        public Restaurant.Builder setRestaurantId(int restaurantId) {
            this.restaurantId = restaurantId;
            return this;
        }
        public Restaurant.Builder setRestaurantName(String supermarketName) {
            this.restaurantName = restaurantName;
            return this;
        }
        public Restaurant.Builder setRestaurantLocation(String supermarketLocation) {
            this.restaurantLocation = restaurantLocation;
            return this;
        }


        public Restaurant.Builder copy(Restaurant r){
            this.restaurantId = r.restaurantId;
            this.restaurantName = r.restaurantName;
            this.restaurantLocation = r.restaurantLocation;

            return this;
        }

        public Restaurant build() {
            return new Restaurant(this);
        }


    }
}