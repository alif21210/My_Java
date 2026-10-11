public class Encapsulation2 {
   private String country = "Bangladesh";
   private double population = 12313.33;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    void display()
    {
        System.out.println("Country: "+country);
        System.out.println("Population: "+population);
    }
}
