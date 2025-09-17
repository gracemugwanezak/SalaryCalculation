class Manager extends Programmer{
    double  bonus;
    private double totalSalary;

    public Manager() {

        bonus= 5000;
    }
    double baseSalary;
    @Override
    public double calculateSalary() {
        baseSalary= super.calculateSalary();

        totalSalary= baseSalary+ bonus;

        return 0;
    }
    @Override
    public void displayInfo() {
        super.displayInfo(); {
            System.out.println(totalSalary);
        }
        ;


    };



}