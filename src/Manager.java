class Manager extends Programmer{
    double  bonus;
    private double totalSalary;


    public Manager() {

        bonus = 5000;
    }

        double baseSalary;
        @Override

        public double calculateSalary () {
            try{
            baseSalary = super.calculateSalary();

            totalSalary = baseSalary + bonus;

            return totalSalary;
        }

        catch(Exception e){
            System.out.println("Error occurred while calculating salary");
        }
            return 0;
        }
        @Override

        public void displayInfo () {
            try{
            System.out.println("the total salary after adding salary  is " + calculateSalary());
        }
        catch(Exception e){
            System.out.println("error occurred on the output of salary");
        }
    }








    }



