
package adminanduser;
import java.util.Scanner; 
import java.util.ArrayList;

public class ClimateQuiz {
    
    //Welcome
    String wel="""
               ===============================================================================
               =                                                                             =
               =--------------------------!! TEST YOUR KNOWLEDGE !!--------------------------=
               =                                                                             =
               ===============================================================================
               """;
    

    //questions and their explanations
    String Q1="""
             =                                                                             =
             =   1. Which of the following is the biggest contributor to climate change?   =
             =                                                                             =
             =         a. Burning of fossil fuels for generating power                     =
             =         b. Industrial work and manufacturing                                =
             =         c. deforestation in major cities                                    =
             =         d. Methane and carbon dioxide released during food production       =
             =                                                                             =
             =      Enter Your Answer :  """;
    
    String ex1="""
             =   All of the 4 causes listed contribute to climate change but the           =
             =   biggest contributor by far is the burning of fossil fuels for             =
             =   generating power!                                                         =""";
    
    String Q2="""
            ===============================================================================
            =                                                                             =
            =   2. What country produces the most co2 emissions in the world ?            =
            =                                                                             =
            =         a. Malaysia                                                         =
            =         b. China                                                            =
            =         c. USA                                                              =
            =         d. India                                                            =
            =                                                                             =
            =      Enter Your Answer :  """;

    String ex2="""
            =   As it currently stands, China produces the most                 =
            =   greenhouse gases at 30% of global emissions coming from them.            =""";
            
    
    String Q3="""
            ===============================================================================
            =                                                                             =
            =   3. Which of the following is not an effect of climate change?             =
            =                                                                             =
            =         a. The extinction of polar bears                                    =
            =         b. More severe storms                                               =
            =         c. Rising ocean levels                                              =
            =         d. Bleaching of coral reefs                                         =
            =                                                                             =
            =      Enter Your Answer :  """;

    
    String ex3="""
            =   Climate changes has been causing glaciers to melt thereby                 =
            =   endangering polar bears.But thankfully they have not gone extinct.        =""";
            
    String Q4="""
            ===============================================================================
            =                                                                             =
            =   4. How much warmer is the earth today compared to during the              =
            =      pre industrial era(1800s)?                                             =
            =                                                                             =
            =         a. about 0.5 degrees Celsius warmer                                 =
            =         b. about 1 degrees Celsius warmer                                   =
            =         c. about 1.5 degrees Celsius warmer                                 =
            =         d. about 2 degrees Celsius warmer                                   =
            =                                                                             =
            =      Enter Your Answer :  """;           

    
    String ex4="""
            =   On average the earth is about 1.1 degrees Celsius warmer. During          =
            =   the Paris Agreement it was agreed that we collectively need to            =
            =   prevent the earth from increasing in temperature by 2 degrees             =
            =   celsius as it will lead to devastating effects.                           =""";
    
    String Q5="""
            ===============================================================================
            =                                                                             =
            =   5. The Paris Agreement signed by over 192 countries was seen as           =
            =      a landmark victory for combating climate change. In what               =
            =      year was this agreement signed?                                        =
            =                                                                             =
            =         a. 2010                                                             =
            =         b. 2013                                                             =
            =         c. 2015                                                             =
            =         d. 2018                                                             =
            =                                                                             =
            =      Enter Your Answer :  """; 
    
     String ex5="""
            =   This agreement was signed in December 2015. The Agreement                 =
            =   is a legally binding international treaty that entered into               =
            =   force on 4 November 2016.                                                 =
            =                                                                             =""";
    //answers
    static String ansSheet[]= {"a","b","a","b","c"};   
    
    static ArrayList<String> ans=new ArrayList<String>();
    
    public static void quiz(){
        //ArrayList<String> ans=new ArrayList<String>();
        Scanner sc=new Scanner(System.in);
        ClimateQuiz cq= new ClimateQuiz();
        
        System.out.print(cq.wel);
        //q1
        System.out.print(cq.Q1);
        ans.add(sc.next());
        //q2
        System.out.print(cq.Q2);
        ans.add(sc.next());
        //q3
        System.out.print(cq.Q3);
        ans.add(sc.next());
        //q4
        System.out.print(cq.Q4);
        ans.add(sc.next());
        //q5
        System.out.print(cq.Q5);
        ans.add(sc.next());
        
    }
    
    public static void explainAns(int n){
        ClimateQuiz cq= new ClimateQuiz();
        switch(n){
            case 1:
                System.out.println(cq.ex1);
                break;
            case 2:
                System.out.println(cq.ex2);
                break;
            case 3:
                System.out.println(cq.ex3);
                break;
            case 4:
                System.out.println(cq.ex4);
                break;
            case 5:
                System.out.println(cq.ex5);
                break;
        }
    }
    
    public static void checkAns(){
        final String greenAnsi="\u001B[32m";
        final String redAnsi="\u001B[31m";
        final String resetAnsi="\u001B[0m";
        
        System.out.print("""
        ===============================================================================
        =                                                                             =
        =--------------------------------!! ANSWERS !!--------------------------------=
        =                                                                             =
        ===============================================================================           
        """);
        
        for (int i=0;i<5;i++){
            System.out.println("=                                                                             =");
            System.out.println("=   QUESTION "+(i+1)+"                                                                =");
            if (ans.get(i).equals(ansSheet[i])){
                System.out.println("=   "+greenAnsi+"Your answer is correct!"+resetAnsi+"                                                   =");
                explainAns(i+1);
            }else{
                System.out.println("=   "+redAnsi+"Your answer is Incorrect"
                        +resetAnsi+"|Your answer: "+ans.get(i)+"                                   =");
                explainAns(i+1);
                }
                
        }
    }
    
    static void questions() {
        // TODO code application logic here
        
        quiz();
        System.out.println(ans);
        checkAns();
    }
    
}
