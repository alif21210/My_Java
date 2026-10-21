public class Person1 {

    private String country;
    private int area;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    void display1()
    {
        System.out.println("Country name: "+country);
        System.out.println("Country area: "+area);
    }
}
