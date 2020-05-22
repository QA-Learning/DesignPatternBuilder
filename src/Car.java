public class Car {
    private int engineCapacity;
    private String color;
    //Optional Parameters
    private int seats;
    public boolean isGPSEnabled;
    public int getSeats(){
        return this.seats;
    }
    public int getEngineCapacity(){
        return this.engineCapacity;
    }
    public String getColor(){
        return this.color;
    }
    public boolean isGPSEnabled(){
        return this.isGPSEnabled;
    }
    private Car(CarBuilder builder){
        this.seats=builder.seats;
        this.engineCapacity=builder.engineCapacity;
        this.color=builder.color;
        this.isGPSEnabled=builder.isGPSEnabled;
    }
    public static class CarBuilder{
        private int engineCapacity;
        private String color;
        //Optional Parameters
        private int seats;
        private boolean isGPSEnabled;
        public CarBuilder(int engineCapacity,String color){
        this.engineCapacity=engineCapacity;
        this.color= color;
        }public CarBuilder setSeats(int seats){
            this.seats=seats;
            return this;
        }public CarBuilder setGPSEnabled(boolean isGPSEnabled) {
            this.isGPSEnabled = isGPSEnabled;
            return this;
        }

        public Car build(){
            return new Car(this);
        }
    }
}
