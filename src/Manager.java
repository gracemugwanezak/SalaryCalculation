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

       return totalSalary;
    }
    @Override
    public void displayInfo() {
           System.out.println( "the total salary after adding salary  is " + calculateSalary());
        }



    }



