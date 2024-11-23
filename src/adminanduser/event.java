package adminanduser;
import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class event {
    ArrayList<String[]> Events = new ArrayList<String[]>();
    int SECONDS_IN_A_DAY = 24 * 60 * 60;
    //Real life Events
    String[] e1={"2022 United Nations Climate Change Conference","06/11/2022"};   
    String[] e2={"2023 United Nations Climate Change Conference","06/11/2023"};
    String[] e3={"United Nations 2023 Water Conference","22/03/2023"};
    String[] e4={"Convention on Biological Diversity","07/12/2022"};
    String[] e5={"Africa Climate Week 2022","20/07/2022"};
    String[] e6={"World Environment Day","2/07/2023"};
    String[] e7={"Stockholm+50","23/05/2022"};
    
    //adds real life events into Events arraylist, include this so the arraylist isnt empty
    public void initialize_ArrList(){      
        //Events.add(e1);
        Events.add(e2);
        Events.add(e3);
        Events.add(e4);
        Events.add(e5);
        Events.add(e6);
        Events.add(e7);
        
    }
    
    public void addEvent(){
        int repeat=0;
        while (repeat==0){
            Scanner sc=new Scanner(System.in);
            System.out.println("===============================================================================");
            System.out.print("=                                                                             =\n");
            System.out.print("=      Enter event name : ");
            String nameInput=sc.nextLine();
            System.out.print("=      Enter event date(dd/mm/yyyy) : ");
            String dateInput=sc.nextLine();

            String[] newEvent={nameInput,dateInput};
            Events.add(newEvent);
            System.out.print("=                                                                             =\n");
            System.out.print("=     0 : add another event                                                   =\n");
            System.out.print("=     1 : return                                                              =\n");
            System.out.print("=         option : ");

            repeat=Integer.parseInt(sc.nextLine());
        }
    }
    
    public void printEvent(){
        event c=new event();
        System.out.print("===============================================================================\n");
        System.out.print("=                                                                             =\n"); 
        System.out.print("=   Here is a list of events and their dates                                  \n");
        
        for (int i=0;i<Events.size();i++){
            System.out.print("=                                                                             \n");
            System.out.println("=      "+(i+1)+". "+Events.get(i)[0]);
            System.out.println("=         "+Events.get(i)[1]);

        //code from countdown(), everything below this is related to the formula
        String date=Events.get(i)[1];

	//splitting the day,month and year into items of an array.
	String[] dateArr=date.split("/",3);

	Calendar EventDate= Calendar.getInstance();
	EventDate.setTime(new Date(0));
	
	EventDate.set(Calendar.DATE, Integer.parseInt(dateArr[0]) );
	EventDate.set(Calendar.MONTH, Integer.parseInt(dateArr[1]) );
	EventDate.set(Calendar.YEAR, Integer.parseInt(dateArr[2]) );

	Calendar today = Calendar.getInstance();
        long diff =  EventDate.getTimeInMillis() - today.getTimeInMillis();
        long diffSec = diff / 1000;

	long days=diffSec / SECONDS_IN_A_DAY;
	long secondsDay = diffSec % SECONDS_IN_A_DAY;
        long minutes = (secondsDay / 60) % 60;
        long hours = (secondsDay / 3600); // % 24 not needed
        
        //converting negative values into positive for when event has already occurred
        long NegDays=-1*(diffSec / SECONDS_IN_A_DAY);
        long NegMinutes = -1*(secondsDay / 60) % 60;
        long NegHours = -1*(secondsDay / 3600); // % 24 not needed
        
        //prints the countdown
        if(diff>=0){
            System.out.print("=         Event will occur in: "+days+" days, "+hours+" hours and "+minutes+" minutes!\n");
        }else{
            System.out.print("=         Event occurred: "+NegDays+" days, "+NegHours+" hours and "+NegMinutes+" minutes ago!\n");
        }
    }
    } 
    public void delEvent(){
        Scanner sc=new Scanner(System.in);
        System.out.print("=                                                                             =\n");
        System.out.print("=      Enter index of code you want to delete : ");
        int input=Integer.parseInt(sc.nextLine());
        String deleted_event=Events.get(input-1)[0];
        Events.remove(input-1);
        System.out.print("=                                                                             =\n"); 
        System.out.println("= The event: \""+deleted_event+"\" has been deleted");
    }
    
    public void searchArr(){
        Scanner sc=new Scanner(System.in);
        System.out.print("=                                                                             =\n");
        System.out.print("=      Search for an event by name or year : ");
        String search=sc.nextLine();
        System.out.print("===============================================================================\n");
        System.out.print("=                                                                             =\n");
        System.out.print("=---------------------------------!! RESULT !!--------------------------------=\n");
        System.out.print("=                                                                             =\n");
        System.out.print("===============================================================================\n");
        int count=0;
        for (int i=0;i<Events.size();i++){
            int date_len= Events.get(i)[1].length();
            if (Events.get(i)[0].equals(search) || 
                Events.get(i)[1].substring(date_len-4).equals(search)
                ){
                
                count+=1;
                System.out.print("=                                                                             \n");
                System.out.println("=      "+Events.get(i)[0]);
                System.out.println("=      "+Events.get(i)[1]);
                
                
            }
        }
            System.out.print("=                                                                             =\n");
            System.out.println("=                            "+count+" results found");
        }
    
    
    

}