public class Vehicle {
    public static void main(String args[]){
        Car bmw = new Car
                .CarBuilder(2000,"White")
                .setSeats(4).setGPSEnabled(true)
                .build();
        System.out.println(bmw.getSeats()+" "+bmw.getColor()+" "+bmw.getEngineCapacity()+" "+bmw.isGPSEnabled());
    }
    }
