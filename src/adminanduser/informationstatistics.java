
package adminanduser;

import java.util.Scanner;


public class informationstatistics {
    static void info_stats() {
        Scanner input = new Scanner(System.in);
        double GHG ;
        float percent;
        int AQI_1,AQI_2,AQI_3;
        String state_1,state_2,state_3,country_name;
        String AQI_color,concern,desc;
        boolean again= true;
        
        System.out.print("===============================================================================\n");
        System.out.print("=                                                                             =\n");
        System.out.print("=------------!! Welcome to Greenhouse Gas Emissions & AQI Searcher!!----------=\n");
        System.out.print("=                                                                             =\n");
        System.out.print("===============================================================================\n");
        System.out.print("=   We will provide you informations about your country's                     =\n");
        System.out.print("=   green house has emissions and air quality index                           =\n");
        System.out.print("=   here are the list of countries      -                                     =\n");
        System.out.print("=     1. United States of America                                             =\n");
        System.out.print("=     2. United Kingdom                                                       =\n");
        System.out.print("=     3. Germany                                                              =\n");
        System.out.print("=     4. Italy                                                                =\n");
        System.out.print("=     5. Spain                                                                =\n");
        System.out.print("=     6. France                                                               =\n");
        System.out.print("=     7. Argentina                                                            =\n");
        System.out.print("=     8. Brazil                                                               =\n");
        System.out.print("=     9. Colombia                                                             =\n");
        System.out.print("=     10. South Africa                                                        =\n");
        System.out.print("=     11. China                                                               =\n");
        System.out.print("=     12. India                                                               =\n");
        System.out.print("=     13. Thailand                                                            =\n");
        System.out.print("=     14. Malaysia                                                            =\n");
        System.out.print("=     15. Singapore                                                           =\n");
        System.out.print("=     16. Indonesia                                                           =\n");
        System.out.print("=     17. New Zealand                                                         =\n");
        System.out.print("=     18. Australia                                                           =\n");
        System.out.print("=     19. Saudi Arabia                                                        =\n");
        System.out.print("=     20. Iran                                                                =\n");

       while (again){
           again= false;
        System.out.print("=     Please pick a country 1-20 : ");
        int country = input.nextInt();
        
        
        switch (country){
            case 1:
                country_name= "United States of America";
                GHG= 62972.62;
                percent= (float) 12.7;
                AQI_1= 40;
                AQI_2= 25;
                AQI_3= 63;
                state_1= "New York";
                state_2= "Washington DC";
                state_3= "San Francisco";
                System.out.print("=                                                                             \n");
                System.out.print("=   Country : "+ country_name +"                                              \n");
                System.out.print("=   GHG Emissions : "+ GHG +" million tonnes of GHG                           \n");
                System.out.print("=   As percent of global :"+ percent +"%                                      \n");
                System.out.print("=                                                                             \n");
                System.out.print("=   AQI Index for the cities of " + country_name +" :                         \n");
                System.out.print("=      "+ state_1 + "            " + AQI_1 + "                                \n");
                System.out.print("=      "+ state_2 + "            " + AQI_2 + "                                \n");
                System.out.print("=      "+ state_3 + "            " + AQI_3 + "                                \n");
                break;
            case 2:
                country_name= "United Kingdom";
                GHG= 463.74;
                percent= (float) 0.9;
                AQI_1= 38;
                AQI_2= 20;
                AQI_3= 30;
                state_1= "London";
                state_2= "Manchester";
                state_3= "Liverpool";
                
                System.out.print("=                                                                             \n");
                System.out.print("=   Country : "+ country_name +"                                              \n");
                System.out.print("=   GHG Emissions : "+ GHG +" million tonnes of GHG                           \n");
                System.out.print("=   As percent of global :"+ percent +"%                                      \n");
                System.out.print("=                                                                             \n");
                System.out.print("=   AQI Index for the cities of " + country_name +" :                         \n");
                System.out.print("=      "+ state_1 + "            " + AQI_1 + "                                \n");
                System.out.print("=      "+ state_2 + "            " + AQI_2 + "                                \n");
                System.out.print("=      "+ state_3 + "            " + AQI_3 + "                                \n");
                break;
                case 3:
                country_name= "Germany";
                GHG= 873.60;
                percent= (float) 1.8;
                AQI_1= 21;
                AQI_2= 31;
                AQI_3= 21;
                state_1= "Berlin";
                state_2= "Munich";
                state_3= "Frankfurt";
                
                System.out.print("=                                                                             \n");
                System.out.print("=   Country : "+ country_name +"                                              \n");
                System.out.print("=   GHG Emissions : "+ GHG +" million tonnes of GHG                           \n");
                System.out.print("=   As percent of global :"+ percent +"%                                      \n");
                System.out.print("=                                                                             \n");
                System.out.print("=   AQI Index for the cities of " + country_name +" :                         \n");
                System.out.print("=      "+ state_1 + "            " + AQI_1 + "                                \n");
                System.out.print("=      "+ state_2 + "            " + AQI_2 + "                                \n");
                System.out.print("=      "+ state_3 + "            " + AQI_3 + "                                \n");
                break;
             case 4:
                country_name= "Italy";
                GHG= 417.56;
                percent= (float) 0.8;
                AQI_1= 50;
                AQI_2= 134;
                AQI_3= 74;
                state_1= "Rome";
                state_2= "Milan";
                state_3= "Turin";
                
                System.out.print("=                                                                             \n");
                System.out.print("=   Country : "+ country_name +"                                              \n");
                System.out.print("=   GHG Emissions : "+ GHG +" million tonnes of GHG                           \n");
                System.out.print("=   As percent of global :"+ percent +"%                                      \n");
                System.out.print("=                                                                             \n");
                System.out.print("=   AQI Index for the cities of " + country_name +" :                         \n");
                System.out.print("=      "+ state_1 + "            " + AQI_1 + "                                \n");
                System.out.print("=      "+ state_2 + "            " + AQI_2 + "                                \n");
                System.out.print("=      "+ state_3 + "            " + AQI_3 + "                                \n");
                break;
                case 5:
                country_name= "Spain";
                GHG= 349.77;
                percent= (float) 0.7;
                AQI_1= 59;
                AQI_2= 78;
                AQI_3= 56;
                state_1= "Madrid";
                state_2= "Barcelona";
                state_3= "Malaga";
                
                System.out.print("=                                                                             \n");
                System.out.print("=   Country : "+ country_name +"                                              \n");
                System.out.print("=   GHG Emissions : "+ GHG +" million tonnes of GHG                           \n");
                System.out.print("=   As percent of global :"+ percent +"%                                      \n");
                System.out.print("=                                                                             \n");
                System.out.print("=   AQI Index for the cities of " + country_name +" :                         \n");
                System.out.print("=      "+ state_1 + "            " + AQI_1 + "                                \n");
                System.out.print("=      "+ state_2 + "            " + AQI_2 + "                                \n");
                System.out.print("=      "+ state_3 + "            " + AQI_3 + "                                \n");
                break;
                case 6:
                country_name= "France";
                GHG= 450.39;
                percent= (float) 0.9;
                AQI_1= 26;
                AQI_2= 77;
                AQI_3= 59;
                state_1= "Paris";
                state_2= "Marseille";
                state_3= "Lyon";
                
                System.out.print("=                                                                             \n");
                System.out.print("=   Country : "+ country_name +"                                              \n");
                System.out.print("=   GHG Emissions : "+ GHG +" million tonnes of GHG                           \n");
                System.out.print("=   As percent of global :"+ percent +"%                                      \n");
                System.out.print("=                                                                             \n");
                System.out.print("=   AQI Index for the cities of " + country_name +" :                         \n");
                System.out.print("=      "+ state_1 + "            " + AQI_1 + "                                \n");
                System.out.print("=      "+ state_2 + "            " + AQI_2 + "                                \n");
                System.out.print("=      "+ state_3 + "            " + AQI_3 + "                                \n");
                break;
                case 7:
                country_name= "Argentina";
                GHG= 397.31;
                percent= (float) 0.8;
                AQI_1= 34;
                AQI_2= 15;
                AQI_3= 44;
                state_1= "Buenos Aires";
                state_2= "Rosario";
                state_3= "Bahia Blanca";
                
                System.out.print("=                                                                             \n");
                System.out.print("=   Country : "+ country_name +"                                              \n");
                System.out.print("=   GHG Emissions : "+ GHG +" million tonnes of GHG                           \n");
                System.out.print("=   As percent of global :"+ percent +"%                                      \n");
                System.out.print("=                                                                             \n");
                System.out.print("=   AQI Index for the cities of " + country_name +" :                         \n");
                System.out.print("=      "+ state_1 + "            " + AQI_1 + "                                \n");
                System.out.print("=      "+ state_2 + "            " + AQI_2 + "                                \n");
                System.out.print("=      "+ state_3 + "            " + AQI_3 + "                                \n");
                break;
                case 8:
                country_name= "Brazil";
                GHG= 1259.51;
                percent= (float) 2.5;
                AQI_1= 38;
                AQI_2= 46;
                AQI_3= 32;
                state_1= "Rio de Janeiro";
                state_2= "Sao Paulo";
                state_3= "Brasilia";
                
                System.out.print("=                                                                             \n");
                System.out.print("=   Country : "+ country_name +"                                              \n");
                System.out.print("=   GHG Emissions : "+ GHG +" million tonnes of GHG                           \n");
                System.out.print("=   As percent of global :"+ percent +"%                                      \n");
                System.out.print("=                                                                             \n");
                System.out.print("=   AQI Index for the cities of " + country_name +" :                         \n");
                System.out.print("=      "+ state_1 + "            " + AQI_1 + "                                \n");
                System.out.print("=      "+ state_2 + "            " + AQI_2 + "                                \n");
                System.out.print("=      "+ state_3 + "            " + AQI_3 + "                                \n");
                break;
                case 9:
                country_name= "Colombia";
                GHG= 194.24;
                percent= (float) 0.4;
                AQI_1= 50;
                AQI_2= 74;
                AQI_3= 31;
                state_1= "Bogota";
                state_2= "Medellin";
                state_3= "Cali";
                
                System.out.print("=                                                                             \n");
                System.out.print("=   Country : "+ country_name +"                                              \n");
                System.out.print("=   GHG Emissions : "+ GHG +" million tonnes of GHG                           \n");
                System.out.print("=   As percent of global :"+ percent +"%                                      \n");
                System.out.print("=                                                                             \n");
                System.out.print("=   AQI Index for the cities of " + country_name +" :                         \n");
                System.out.print("=      "+ state_1 + "            " + AQI_1 + "                                \n");
                System.out.print("=      "+ state_2 + "            " + AQI_2 + "                                \n");
                System.out.print("=      "+ state_3 + "            " + AQI_3 + "                                \n");
                break;
                case 10:
                country_name= "South Africa";
                GHG= 573.96;
                percent= (float) 1.2;
                AQI_1= 56;
                AQI_2= 62;
                AQI_3= 121;
                state_1= "Cape Town";
                state_2= "Durban";
                state_3= "Johannesburg";
                
                System.out.print("=                                                                             \n");
                System.out.print("=   Country : "+ country_name +"                                              \n");
                System.out.print("=   GHG Emissions : "+ GHG +" million tonnes of GHG                           \n");
                System.out.print("=   As percent of global :"+ percent +"%                                      \n");
                System.out.print("=                                                                             \n");
                System.out.print("=   AQI Index for the cities of " + country_name +" :                         \n");
                System.out.print("=      "+ state_1 + "            " + AQI_1 + "                                \n");
                System.out.print("=      "+ state_2 + "            " + AQI_2 + "                                \n");
                System.out.print("=      "+ state_3 + "            " + AQI_3 + "                                \n");
                break;
                case 11:
                country_name= "China";
                GHG= 13739.79;
                percent= (float) 27.8;
                AQI_1= 42;
                AQI_2= 144;
                AQI_3= 76;
                state_1= "Shanghai";
                state_2= "Beijing";
                state_3= "Guangzhou";
                
                System.out.print("=                                                                             \n");
                System.out.print("=   Country : "+ country_name +"                                              \n");
                System.out.print("=   GHG Emissions : "+ GHG +" million tonnes of GHG                           \n");
                System.out.print("=   As percent of global :"+ percent +"%                                      \n");
                System.out.print("=                                                                             \n");
                System.out.print("=   AQI Index for the cities of " + country_name +" :                         \n");
                System.out.print("=      "+ state_1 + "            " + AQI_1 + "                                \n");
                System.out.print("=      "+ state_2 + "            " + AQI_2 + "                                \n");
                System.out.print("=      "+ state_3 + "            " + AQI_3 + "                                \n");
                break;
                case 12:
                country_name= "India";
                GHG= 3619.80;
                percent= (float) 7.3;
                AQI_1= 109;
                AQI_2= 95;
                AQI_3= 153;
                state_1= "New Delhi";
                state_2= "Mumbai";
                state_3= "Kolkata";
                
                System.out.print("=                                                                             \n");
                System.out.print("=   Country : "+ country_name +"                                              \n");
                System.out.print("=   GHG Emissions : "+ GHG +" million tonnes of GHG                           \n");
                System.out.print("=   As percent of global :"+ percent +"%                                      \n");
                System.out.print("=                                                                             \n");
                System.out.print("=   AQI Index for the cities of " + country_name +" :                         \n");
                System.out.print("=      "+ state_1 + "            " + AQI_1 + "                                \n");
                System.out.print("=      "+ state_2 + "            " + AQI_2 + "                                \n");
                System.out.print("=      "+ state_3 + "            " + AQI_3 + "                                \n");
                break;
                case 13:
                country_name= "Thailand";
                GHG= 434.31;
                percent= (float) 0.9;
                AQI_1= 119;
                AQI_2= 63;
                AQI_3= 34;
                state_1= "Bangkok";
                state_2= "Chiang Mai";
                state_3= "Phuket";
                
                System.out.print("=                                                                             \n");
                System.out.print("=   Country : "+ country_name +"                                              \n");
                System.out.print("=   GHG Emissions : "+ GHG +" million tonnes of GHG                           \n");
                System.out.print("=   As percent of global :"+ percent +"%                                      \n");
                System.out.print("=                                                                             \n");
                System.out.print("=   AQI Index for the cities of " + country_name +" :                         \n");
                System.out.print("=      "+ state_1 + "            " + AQI_1 + "                                \n");
                System.out.print("=      "+ state_2 + "            " + AQI_2 + "                                \n");
                System.out.print("=      "+ state_3 + "            " + AQI_3 + "                                \n");
                break;
                case 14:
                country_name= "Malaysia";
                GHG= 324.31;
                percent= (float) 0.7;
                AQI_1= 74;
                AQI_2= 18;
                AQI_3= 44;
                state_1= "Kuala Lumpur";
                state_2= "Kota Kinabalu";
                state_3= "George Town";
                
                System.out.print("=                                                                             \n");
                System.out.print("=   Country : "+ country_name +"                                              \n");
                System.out.print("=   GHG Emissions : "+ GHG +" million tonnes of GHG                           \n");
                System.out.print("=   As percent of global :"+ percent +"%                                      \n");
                System.out.print("=                                                                             \n");
                System.out.print("=   AQI Index for the cities of " + country_name +" :                         \n");
                System.out.print("=      "+ state_1 + "            " + AQI_1 + "                                \n");
                System.out.print("=      "+ state_2 + "            " + AQI_2 + "                                \n");
                System.out.print("=      "+ state_3 + "            " + AQI_3 + "                                \n");
                break;
                case 15:
                country_name= "Singapore";
                GHG= 70.52;
                percent= (float) 0.1;
                AQI_1= 70;
                AQI_2= 59;
                AQI_3= 30;
                state_1= "Central Singapore";
                state_2= "East Singapore";
                state_3= "West Singapore";
                
                System.out.print("=                                                                             \n");
                System.out.print("=   Country : "+ country_name +"                                              \n");
                System.out.print("=   GHG Emissions : "+ GHG +" million tonnes of GHG                           \n");
                System.out.print("=   As percent of global :"+ percent +"%                                      \n");
                System.out.print("=                                                                             \n");
                System.out.print("=   AQI Index for the cities of " + country_name +" :                         \n");
                System.out.print("=      "+ state_1 + "            " + AQI_1 + "                                \n");
                System.out.print("=      "+ state_2 + "            " + AQI_2 + "                                \n");
                System.out.print("=      "+ state_3 + "            " + AQI_3 + "                                \n");
                break;
                case 16:
                country_name= "Indonesia";
                GHG= 1074.19;
                percent= (float) 2.2;
                AQI_1= 152;
                AQI_2= 72;
                AQI_3= 74;
                state_1= "Jakarta";
                state_2= "Medan";
                state_3= "Batam";
                
                System.out.print("=                                                                             \n");
                System.out.print("=   Country : "+ country_name +"                                              \n");
                System.out.print("=   GHG Emissions : "+ GHG +" million tonnes of GHG                           \n");
                System.out.print("=   As percent of global :"+ percent +"%                                      \n");
                System.out.print("=                                                                             \n");
                System.out.print("=   AQI Index for the cities of " + country_name +" :                         \n");
                System.out.print("=      "+ state_1 + "            " + AQI_1 + "                                \n");
                System.out.print("=      "+ state_2 + "            " + AQI_2 + "                                \n");
                System.out.print("=      "+ state_3 + "            " + AQI_3 + "                                \n");
                break;
                case 17:
                country_name= "New Zealand";
                GHG= 84.92;
                percent= (float) 0.2;
                AQI_1= 21;
                AQI_2= 32;
                AQI_3= 23;
                state_1= "Auckland";
                state_2= "Christchurch";
                state_3= "Wellington";
                
                System.out.print("=                                                                             \n");
                System.out.print("=   Country : "+ country_name +"                                              \n");
                System.out.print("=   GHG Emissions : "+ GHG +" million tonnes of GHG                           \n");
                System.out.print("=   As percent of global :"+ percent +"%                                      \n");
                System.out.print("=                                                                             \n");
                System.out.print("=   AQI Index for the cities of " + country_name +" :                         \n");
                System.out.print("=      "+ state_1 + "            " + AQI_1 + "                                \n");
                System.out.print("=      "+ state_2 + "            " + AQI_2 + "                                \n");
                System.out.print("=      "+ state_3 + "            " + AQI_3 + "                                \n");
                break;
                case 18:
                country_name= "Australia";
                GHG= 581.97;
                percent= (float) 1.2;
                AQI_1= 24;
                AQI_2= 50;
                AQI_3= 5;
                state_1= "Sydney";
                state_2= "Melbourne";
                state_3= "Perth";
                
                System.out.print("=                                                                             \n");
                System.out.print("=   Country : "+ country_name +"                                              \n");
                System.out.print("=   GHG Emissions : "+ GHG +" million tonnes of GHG                           \n");
                System.out.print("=   As percent of global :"+ percent +"%                                      \n");
                System.out.print("=                                                                             \n");
                System.out.print("=   AQI Index for the cities of " + country_name +" :                         \n");
                System.out.print("=      "+ state_1 + "            " + AQI_1 + "                                \n");
                System.out.print("=      "+ state_2 + "            " + AQI_2 + "                                \n");
                System.out.print("=      "+ state_3 + "            " + AQI_3 + "                                \n");
                break;
                case 19:
                country_name= "Saudi Arabia";
                GHG= 750.60;
                percent= (float) 1.5;
                AQI_1= 52;
                AQI_2= 82;
                AQI_3= 37;
                state_1= "Riyadh";
                state_2= "Jeddah";
                state_3= "Mecca";
                
                System.out.print("=                                                                             \n");
                System.out.print("=   Country : "+ country_name +"                                              \n");
                System.out.print("=   GHG Emissions : "+ GHG +" million tonnes of GHG                           \n");
                System.out.print("=   As percent of global :"+ percent +"%                                      \n");
                System.out.print("=                                                                             \n");
                System.out.print("=   AQI Index for the cities of " + country_name +" :                         \n");
                System.out.print("=      "+ state_1 + "            " + AQI_1 + "                                \n");
                System.out.print("=      "+ state_2 + "            " + AQI_2 + "                                \n");
                System.out.print("=      "+ state_3 + "            " + AQI_3 + "                                \n");
                break;
                case 20:
                country_name= "Iran";
                GHG= 926.37;
                percent= (float) 1.9;
                AQI_1= 150;
                AQI_2= 85;
                AQI_3= 67;
                state_1= "Tehran";
                state_2= "Kermanshah";
                state_3= "Zahedan";
                
                System.out.print("=                                                                             \n");
                System.out.print("=   Country : "+ country_name +"                                              \n");
                System.out.print("=   GHG Emissions : "+ GHG +" million tonnes of GHG                           \n");
                System.out.print("=   As percent of global :"+ percent +"%                                      \n");
                System.out.print("=                                                                             \n");
                System.out.print("=   AQI Index for the cities of " + country_name +" :                         \n");
                System.out.print("=      "+ state_1 + "            " + AQI_1 + "                                \n");
                System.out.print("=      "+ state_2 + "            " + AQI_2 + "                                \n");
                System.out.print("=      "+ state_3 + "            " + AQI_3 + "                                \n");
                break;
            default:
                System.out.print("=    Error!!! Please put value 1 to 20 ONLY.                                  =\n");
              again=true;
             }           
       } 
        System.out.print("===============================================================================\n");
        System.out.print("=                                                                             =\n");

        System.out.print("=   Do you want to check the AQI level of your city ? Type YES or NO : ");
        String check = input.next();
        check = check.toUpperCase();
        
        if(check.equals("YES")){
            System.out.print("=   Please enter the value of your city's AQI Index : ");
            int value = input.nextInt();
            
            if(value>=0 && value<=50){
                AQI_color ="Green";
                concern ="Good";
                desc ="Air quality is satisfactory, and air pollution poses \n=      little or no risk.";
                
                System.out.println("=      AQI colour : " + AQI_color + "");
                System.out.println("=      Level of Concern : " + concern + "");
                System.out.println("=      Description : " + desc + "");
            }
             if(value>=51 && value<=100){
                AQI_color ="Yellow";
                concern ="Moderate";
                desc ="Air quality is acceptable. However, there may be a \n=      risk for some people, particularly those who are \n=    unusually sensitive to air pollution.";
                
                System.out.println("=      AQI colour : " + AQI_color + "");
                System.out.println("=      Level of Concern : " + concern + "");
                System.out.println("=      Description : " + desc + "");
            }
              if(value>=101 && value<=150){
                AQI_color ="Orange";
                concern ="Unhealthy for Sensitive Groups";
                desc ="Members of sensitive groups may experience \n=      health effects. The general public is less likely \n=      to be affected.";
                
                System.out.println("=      AQI colour : " + AQI_color + "");
                System.out.println("=      Level of Concern : " + concern + "");
                System.out.println("=      Description : " + desc + "");
            }
               if(value>=151 && value<=200){
                AQI_color ="Red";
                concern ="Unhealthy";
                desc ="Some members of the general public may \n=      experience health effects; members of sensitive groups may \n=      experience more serious health effects.";
                
                System.out.println("=      AQI colour : " + AQI_color + "");
                System.out.println("=      Level of Concern : " + concern + "");
                System.out.println("=      Description : " + desc + "");
            }
                if(value>=201 && value<=300){
                AQI_color ="Purple";
                concern ="Very Unhealthy";
                desc ="Health alert: The risk of health effects\n=      is increased for everyone.";
                
                System.out.println("=      AQI colour : " + AQI_color + "");
                System.out.println("=      Level of Concern : " + concern + "");
                System.out.println("=      Description : " + desc + "");
            }
                 if(value>=301){
                AQI_color ="Maroon";
                concern ="Hazardous";
                desc ="Health warning of emergency conditions: everyone \n=      is more likely to be affected.";
                
                System.out.println("=      AQI colour : " + AQI_color + "");
                System.out.println("=      Level of Concern : " + concern + "");
                System.out.println("=      Description : " + desc + "");
            }
        }
        if(check.equals("NO")){
            return;
        }
        System.out.print("===============================================================================\n");
        System.out.print("=                                                                             =\n");
        System.out.print("=   Do you want to know what are the causes and effects of climate changes?   =\n");
        System.out.print("=   YES or NO : ");

        String cause = input.next();
        cause = cause.toUpperCase();
        
        if(cause.equals("YES")){
        System.out.println("=                                                                             =\n");
        System.out.print("=   CAUSES OF CLIMATE CHANGE :                                                =\n");
        System.out.print("=   1. Generating Power                                                       =\n");
        System.out.print("=   Generating electricity and heat by burning fossil fuels causes a          =\n");
        System.out.print("=   large chunk of global emissions. Most electricity is still generated by   =\n");
        System.out.print("=   burning coal, oil, or gas, which produces carbon dioxide and nitrous      =\n");
        System.out.print("=   oxide – powerful greenhouse gases that blanket the Earth and trap the     =\n");
        System.out.print("=   sun’s heat. Globally, a bit more than a quarter of electricity comes      =\n");
        System.out.print("=   from wind, solar and other renewable sources which, as opposed to         =\n");
        System.out.print("=   fossil fuels, emit little to no greenhouse gasses or pollutants into      =\n");
        System.out.print("=   the air.                                                                  =\n");
        System.out.print("=                                                                             =\n");
        System.out.print("=   2. Manufacturing goods                                                    =\n");
        System.out.print("=   Manufacturing and industry produce emissions, mostly from burning fossil  =\n");
        System.out.print("=   to produce energy for making things like cement, iron, steel, electronics,=\n");
        System.out.print("=   plastics, clothes, and other goods. Mining and other industrial           =\n");
        System.out.print("=   Machines used in the manufacturing process often run on coal, oil,        =\n");
        System.out.print("=   or gas; and some materials, like plastics, are made from chemicals        =\n");
        System.out.print("=   sourced from fossil fuels. The manufacturing industry is one of the       =\n");
        System.out.print("=   largest contributors to greenhouse gas emissions worldwide.               =\n");
        System.out.print("=                                                                             =\n");
        System.out.print("=   3. Cutting Down Forests                                                   =\n");
        System.out.print("=   Cutting down forests to create farms or pastures, or for other reasons    =\n");
        System.out.print("=   causes emissions. this is due to the carbon that they have been storing  =\n");
        System.out.print("=   have been released into the air. Each year, approximately 12 million      =\n");
        System.out.print("=   hectares of forests are destroyed. since the main purpose of a tree is to  =\n"); 
        System.out.print("=   absorb carbon dioxide and release clean air. cutting down forests will    =\n");
        System.out.print("=   limit nature's ability to keep emissions our of the atmosphere. Therefore,=\n");
        System.out.print("=   it goes without saying that, deforestations is responsible for roughly a  =\n");
        System.out.print("=   quarter of global greenhouse gas emissions.                               =\n");
        System.out.print("=                                                                             =\n");
        System.out.print("=   EFFECTS OF CLIMATE CHANGE :                                               =\n");
        System.out.print("=   1. Global Temperature Increases                                           =\n");
        System.out.print("=   As gas concentrations rise, so does the global surface temperature.       =\n");
        System.out.print("=   The last decade, 2011-2020, is the warmest on record.                     =\n");
        System.out.print("=   Since the 1980s, each decade has been warmer than the days and heat waves.=\n");
        System.out.print("=   Higher temperature increase heat-related illnesses and make working       =\n"); 
        System.out.print("=   outdoors more difficult. Wildfires could start easily and spread rapidly. =\n");
        System.out.print("=                                                                             =\n");
        System.out.print("=   2. Severe Storms                                                          =\n");
        System.out.print("=   Destructive storms have become more intense and more frequent             =\n");
        System.out.print("=   in many regions. As temperatures rise, more moisture evaporates,          =\n");
        System.out.print("=   which exacerbates extreme rainfall and flooding, causing more             =\n");
        System.out.print("=   destructive storms. The frequency and extent of tropical storms           =\n"); 
        System.out.print("=   is also affected by the warming ocean. Cyclones, hurricanes, and          =\n");
        System.out.print("=   typhoons feed on warm waters at the ocean surface. Such storms often      =\n"); 
        System.out.print("=   destroy homes and communities, causing deaths and huge economic losses    =\n");
        System.out.print("=                                                                             =\n");
        System.out.print("=   2. Warming, Rising Ocean                                                  =\n");
        System.out.print("=   The ocean soaks up most of the heat from global warming. the rate at      =\n");
        System.out.print("=   which the ocean is warming strongly increase over the past two decades,   =\n");
        System.out.print("=   across all depths of the ocean. As the ocean warms, its volume increases  =\n");
        System.out.print("=   since water expands as it gets warmer. Melting ice sheets also causes sea =\n"); 
        System.out.print("=   levels to rise, threatening coastal and island communities. in addition,  =\n");
        System.out.print("=   the ocean absorbs carbon dioxide, keeping it from the atmosphere. in      =\n"); 
        System.out.print("=   return, increases the acidity of the ocean which endangers marine life.   =\n");
        }
        if(cause.equals("NO")){
        System.out.print("=                                                                             =\n");
        System.out.print("=    Well okay then,thank you for staying with us                             =\n");
        System.out.print("=                                                                             =\n");

        }
    } 
    }
    


