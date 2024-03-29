/**
 * Mziyanda Mwanda
 * 2133765
 * ADP 3
 *Assignment 1
 * Due date
 * 10 Aprile 2022
 * Entity:
 * Staff
 * **/
package za.ac.cput.Entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class staff {
    //Declaration of the attributes
    @Id
    private String adminName;
    private String deliveryDriver;
    private String assistant ;

    public staff(){}
    //Builder Constructor
    private staff(Builder builder){
        this.adminName = builder.adminName;
        this.deliveryDriver = builder.deliveryDriver;
        this.assistant= builder.assistant;
    }

    //Getters and Setters


    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getDeliveryDriver() {
        return deliveryDriver;
    }

    public void setDeliveryDriver(String deliveryDriver) {
        this.deliveryDriver = deliveryDriver;
    }

    public String getAssistant() {
        return assistant;
    }

    public void setAssistant(String assistant) {
        this.assistant = assistant;
    }

    //Builder starts
    public static class Builder{

        private String adminName;
        private String deliveryDriver;
        private String assistant ;



        public Builder setAdminName(String adminName) {
            this.adminName = adminName;
            return this;
        }

        public Builder setDeliveryDriver(String deliveryDriver) {
            this.deliveryDriver = deliveryDriver;
            return this;
        }

        public Builder setAssistant(String assistant) {
            this.assistant = assistant;
            return this;
        }

        public Builder copy( staff staff){
            this.adminName = staff.adminName;
            this.deliveryDriver = staff.deliveryDriver;
            this.assistant = staff.assistant;
            return this;
        }
        public staff build(){
            return  new staff(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        staff staff = (staff) o;
        return adminName.equals(staff.adminName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adminName);
    }
}
