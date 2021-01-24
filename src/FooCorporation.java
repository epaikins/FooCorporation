public class FooCorporation {
    public static void main(String[] args) {
        salary(7.50,35);
        salary(8.0,40);
        salary(10,73);
    }

    public static void salary(double basePay, int hours){
        if(hours<= 60 && basePay >= 8){
            double baseSalary;
            if (hours > 40){
                baseSalary = basePay * 40;
                int extraHours = hours % 40;
                double overtimePay = basePay*1.5;
                double overtimeSalary = overtimePay*extraHours;
                System.out.println("Total Pay: "+ (overtimeSalary + baseSalary));
            }
            else {
                baseSalary = basePay * hours;
                System.out.println("Total Pay: "+baseSalary);
            }
        }
        else {
            System.out.println("error");
        }
    }
}
