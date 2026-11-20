class Car extends Vehicle{
    private String fuleType;

    public String getFuleType() {
        return fuleType;
    }

    public void setFuleType(String fuleType) {
        this.fuleType = fuleType;
    }

    Car(int v, String b, double m)
    {
        super(v,b,m);
    }

    void displayDetails(){
        System.out.println("Car No: "+vehicleNo);
        System.out.println("Car Brand: "+brand);
        System.out.println("Car Mileage: "+mileage);
        System.out.println("Car Fule Type: "+getFuleType());
    }
}