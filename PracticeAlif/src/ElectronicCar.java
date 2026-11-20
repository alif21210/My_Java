class ElectronicCar extends Car{
    private String batteryCapacity;

    public String getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(String batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    ElectronicCar(int v, String b, double m){
        super(v,b,m);
    }

    void displayDetails(){
        System.out.println("Car No: "+vehicleNo);
        System.out.println("Car Brand: "+brand);
        System.out.println("Car Mileage: "+mileage);
        System.out.println("Car Battery Capacity: "+getBatteryCapacity());
    }
}