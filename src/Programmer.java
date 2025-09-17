class Programmer extends Employee{

    int workingHour=45;
    int hourlyRate= 2500;


    @Override
    public double calculateSalary() {
        int baseSalary=hourlyRate*workingHour;
        return 0;
    }
    @Override public void displayInfo(){
        System.out.println( calculateSalary());
    }
}