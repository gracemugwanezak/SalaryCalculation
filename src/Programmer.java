class Programmer extends Employee{

    int workingHour=45;
    int hourlyRate= 2500;


    @Override
    public double calculateSalary() {
        return hourlyRate*workingHour;

    }
    @Override public void displayInfo(){
        System.out.println( "The salary before adding bonus is " + calculateSalary());
    }
}
