public abstract class Employee {
    private String name, address;
    private  double basicSalary;



    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public double getBasicSalary(){
        return  basicSalary;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public void setName(String name) {
        this.name = name;
    }


    public  abstract double getMonthlySalary();
}
