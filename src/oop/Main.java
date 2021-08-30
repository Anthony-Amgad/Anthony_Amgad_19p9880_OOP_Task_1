package oop;

public class Main {
    public static void main(String[] args){
        Tesla tesla = new Tesla("X",250,100,1,7);
        System.out.println(tesla.getFuelType());
        System.out.println("Car model : " + tesla.getModel() + "\nNumber of seats : " + tesla.getSeatsNo());
    }
}
