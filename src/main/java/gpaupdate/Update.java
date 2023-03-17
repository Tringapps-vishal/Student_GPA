package gpaupdate;

import calculation.Calculation;
import java.util.Scanner;
import gpamain.*;
import java.util.logging.Logger;
public class Update {
    Logger log=Logger.getLogger("Update");
    Scanner sc=new Scanner(System.in);
    Calculation ca=new Calculation(Main.name);
    public void updateGpa()
    {
        int choice;
        log.info("Do you need to update your grade  1.YES  2.NO");
        choice=sc.nextInt();
        if(choice==1)
        {
            log.info("Enter your new grade: ");
            String newGrade=sc.next();
            ca.callGpa(newGrade);
        }
        else
        {
            System.exit(0);
        }
    }

}
