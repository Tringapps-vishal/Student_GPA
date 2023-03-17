package gpamain;
import java.util.*;
import java.util.logging.Logger;

import calculation.*;
import gpaupdate.Update;

public class Main {


    public static String name;

    public static void main(String[] arg)
    {
        Logger log= Logger.getLogger("Main");
        Scanner sc=new Scanner(System.in);
        log.info("-------NEW STUDENT DETAILS-----");
        log.info("Enter your name:");
        name=sc.nextLine();
        log.info("Enter your grade:");
        String grade=sc.nextLine();
        Calculation ca=new Calculation(name);
        Update up=new Update();
        ca.callGpa(grade);
        up.updateGpa();
    }
}
