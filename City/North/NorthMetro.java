package City.North;
import Overkill_Engine.*;
import Backend.Stats;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import City.Downtown.*;
import City.South.*;
import City.East.*;
import City.West.*;

public class NorthMetro {
    private static void exec1() throws InterruptedException, IOException { 
        Scene.make("Town Metro","Going places, together.",null,Num.round(Stats.money,2),true,Stats.HP,true,Stats.weapon,true,Stats.wanted,true,TimeModule.printableTime(Stats.time),true);
        Thread.sleep(1000); 
        options();
        Print.textln("See ya");
        Thread.sleep(2000);
        Scene.clear();
    }

    private static void options() throws IOException, InterruptedException {
        Scene.clear();
        Print.header("North Line",">");
        Print.textln("Welcome to North Point Station. Where would you like to travel to?");
        Thread.sleep(1000);
        Scene.choice(new String[]{"Downtown","South: Party Island","East Hills","West Bank","Go Back"});
        Print.textln("Response:");
        int choice=Input.Int();
        if(choice==1){
            Thread.sleep(1500);
            Downtown.main(new String[]{});
        }
        else if(choice==2){
            Thread.sleep(1500);
            SouthZone.main(new String[]{});
        }
        else if(choice==3){
            Thread.sleep(1500);
            EastZone.main(new String[]{});
        }
        else if(choice==4){
            Thread.sleep(1500);
            WestZone.main(new String[]{});
        }  
        else if(choice==5){
            NorthZone.main(new String[]{});
        }
        else{
            Print.textln("It's a small world. There's no where else you can go other than that.");
            options();
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        exec1();
    }
}