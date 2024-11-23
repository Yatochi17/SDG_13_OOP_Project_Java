package adminanduser;

import static adminanduser.ClimateQuiz.questions;
import static adminanduser.articles.articles;
import static adminanduser.calculator.calculator;
import static adminanduser.informationstatistics.info_stats;
import static adminanduser.menu.menu;
import java.util.Scanner;

public class Adminanduser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        event c=new event();
        c.initialize_ArrList();
        int choice;
    do{
        System.out.print("\n\n===============================================================================\n");
        System.out.print("=                                                                             =\n");
        System.out.print("=---------------------------------!! LOG IN !!--------------------------------=\n");
        System.out.print("=                                                                             =\n");
        System.out.print("===============================================================================\n");
        System.out.print("=\t1. Admin Page                                                         =\n");
        System.out.print("=\t2. User Page                                                          =\n");
        System.out.println("=\t0. Quit program                                                       =\n");
        System.out.print("=\tEnter Option 0-2 : ");
        choice = input.nextInt();
        
        
        if(choice == 1) {
            String user = "admin";
            String password = "admin";
            
            System.out.print("===============================================================================\n");
            System.out.print("=                                                                             =\n");
            System.out.print("=------------------------------!! ADMIN LOGIN !!------------------------------=\n");
            System.out.print("=                                                                             =\n");
            System.out.print("===============================================================================\n");
            System.out.print("=\tUsername - ");
            Scanner input2 = new Scanner(System.in);
            String user2 = input2.nextLine();
            
            System.out.print("=\tPassword - ");
            Scanner input3 = new Scanner(System.in);
            String password2 = input3.nextLine();
                
            while(password.equals(password2) && user.equals(user2)) {
                System.out.println("=                                                                             =");
                System.out.println("===============================================================================");
                System.out.println("=                                                                             =");
                System.out.println("=      1. Add Event To Page                                                   =");
                System.out.println("=      2. Delete Event To Page                                                =");
                System.out.println("=      3. View Event Page                                                     =");
                System.out.println("=      4. Search An Event                                                     =");
                System.out.println("=      5. Exit                                                                =");
                System.out.print("=         Select an option 1-5 : ");
                Scanner event = new Scanner(System.in);
                int events = event.nextInt();
                
                if (events == 1) {
                    c.addEvent();
                }
                else if (events == 2) {
                    c.delEvent();
                }
                else if (events == 3) {
                    c.printEvent();
                }
                else if (events == 4) {
                    c.searchArr();
                }
                else if (events == 5) {
                    return;
                }
                else {
                    System.out.println("=         Wrong option - try again                                            =");
                }
               
            }}
    
        
        else if(choice == 2) {
            
            while(choice == 2){
                menu();
                Scanner input4 = new Scanner(System.in);
                int pick = input4.nextInt();
            
                if(pick == 1) {
                    articles();
                }
                
                else if(pick == 2) {
                    questions();
                }  
                
                else if(pick == 3) {
                    calculator();
                }
                
                else if(pick == 4) {
                    info_stats();
                }
                
                else if(pick == 5) {
                    System.out.print("===============================================================================\n");
                    System.out.print("=                                                                             =\n");
                    System.out.print("=----------------------------!! CLIMATE EVENTS !!-----------------------------=\n");
                    System.out.print("=                                                                             =\n");
                    System.out.print("===============================================================================\n");
                    System.out.println("=                                                                             =");
                    System.out.println("=      1. View Events                                                         =");
                    System.out.println("=      2. Search for a Specific Events                                         =");
                    System.out.print("=      Pick An Option 1-2 : ");
                    Scanner event_pick = new Scanner(System.in);
                    int option = event_pick.nextInt();
                    
                    if (option == 1) {
                        c.printEvent();
                    }
                    else if (option == 2) {
                        c.searchArr();
                    }
                    else {
                        
                    }
                }
                
                else if(pick == 6) {
                    break;
                }
                else{
                
                }
                
             }
        }
        
        
        else if(choice<0 || choice >2){
            System.out.println("Please pick one of the choices - ");
        }
    }while(choice!=0);
}
}

