package adminanduser;

import java.util.Scanner;

public class calculator {
    static void calculator() {
       Scanner input = new Scanner(System.in);
     System.out.print("===============================================================================\n");
     System.out.print("=                                                                             =\n");
     System.out.print("=-------------------!! CARBON EMISSION OF CARS CALCULATOR !!------------------=\n");
     System.out.print("=                                                                             =\n");
     System.out.print("===============================================================================\n");
     System.out.print("=                                                                             =\n");
     System.out.print("=   please insert your distance travelled (km) - ");
     double distance = input.nextDouble();
     System.out.print("=                                                                             =\n");
     
        if (distance <= 0) {
            System.out.println("=   distance invalid. try again.                                            =\n");
        }
        
     System.out.print("=   next, please state the type of fuel that you are using -                  =\n");
     System.out.print("=        1 - Petrol                                                           =\n");
     System.out.print("=        2 - Diesel                                                           =\n");
     System.out.print("=        Enter Option 1-2 : ");

        
        int fuel = input.nextInt();
        
        if (fuel == 1) {
            fuel = 2392;
        }
        else if (fuel == 2) {
            fuel = 2640;
        }
        else{
            System.out.println("=   I am sorry, please insert a fuel in the list and try again.              =");
            return;
        }
        System.out.print("=                                                                             =\n");
        System.out.println("=   Almost There...                                                           =");
        System.out.println("=   please insert the fuel efficiency of your car in (l/100km) format         =");
        System.out.println("=      SUV - 7.7                                                              =");
        System.out.println("=      Sedan - 7.4                                                            =");
        System.out.println("=      Van - 10.1                                                             =");
        System.out.println("=      Pickup Truck - 12.1                                                    =");
        System.out.print("=      Insert a number : ");
        
        double economy = input.nextDouble();
        
        if (economy <= 0) {
            System.out.println("invalid fuel economy. please try again.");
        }
        else {
            double new_distance = distance/100;
            double total_used = new_distance*economy;
            double emission = total_used*fuel;
            double in_tonnes = emission/1000000;
            System.out.print("=                                                                             =\n");
            System.out.print("=   in just a distance of "+ distance +" km,                                      \n");
            System.out.print("=   you have produced "+ in_tonnes +" tonnes of CO2 in the air                    \n");
            System.out.print("=                                                                             =\n");
        }
        
        
    }
    
}
