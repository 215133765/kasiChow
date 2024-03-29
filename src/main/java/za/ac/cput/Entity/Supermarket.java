package za.ac.cput.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/*
 * Author: GAYNOR JANTJIES 213069555
 * POJO Supermarket.java
 *  Supermarket Entity file to be implemented
 * Created: 9/04/2022
 *  * Modified : 07/08/2022
 *  * add the entity to database
 *  * establish a connection to db
 * */
@Entity
public class Supermarket {
@Id
    private String marketId;
    private String marketName;
    private String marketLocation;

     public Supermarket(){}

    private Supermarket(Supermarket.Builder sm){

        this.marketId = sm.marketId;
        this.marketName = sm.marketName;
        this.marketLocation = sm.marketLocation;
    }

    public String getMarketId() {
        return marketId;
    }

    public void setMarketId(String marketId) {
        this.marketId = marketId;
    }

    public String getMarketName() {
        return marketName;
    }

    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }

    public String getMarketLocation() {
        return marketLocation;
    }

    public void setMarketLocation(String marketLocation) {
        this.marketLocation = marketLocation;
    }

    public String toString() {
        return "Builder{" +
                "marketId=" + marketId +
                ", marketName='" + marketName + '\'' +
                ", marketLocation='" + marketLocation + '\'' +
                '}';
    }


    public static class Builder {


        private String marketId;
        private String marketName;
        private String marketLocation;



        public Builder setMarketId(String marketId) {
            this.marketId = marketId;
            return this;
        }
        public Builder setMarketName(String marketName) {
            this.marketName = marketName;
            return this;
        }
        public Builder setMarketLocation(String marketLocation) {
            this.marketLocation = marketLocation;
            return this;
        }


        public Builder copy(Supermarket smk){
            this.marketId = smk.marketId;
            this.marketName = smk.marketName;
            this.marketLocation = smk.marketLocation;

            return this;
        }

        public Supermarket build() {
            return new Supermarket(this);
        }


    }}
