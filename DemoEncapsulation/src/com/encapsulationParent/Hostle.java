package com.encapsulationParent;

public class Hostle {
         private String name;
         private String city;
         private String address;
         private double postalCode;
         private double rent;

         public void setName(String name){
             this.name = name;
         }
         public String getName(){
             return name;
         }
         public void setCity(String city){
             this.city = city;
         }
         public String getCity(){
             return city;
         }
        public void setAddress(String address){
             this.address = address;
        }
        public String getAddress(){
             return address;
        }
        public void setPostalCode(double postalCode){
             this.postalCode = postalCode;
        }
        public double getPostalCode(){
             return postalCode;
        }
        public void setRent(double rent){
             this.rent = rent;
        }
        public double getRent(){
             return rent;
        }
}
