package gpaupdate;

import calculation.Calculation;
import java.util.Scanner;
import java.util.logging.Logger;

public class Update {
    Logger log=Logger.getLogger("Update");
    Calculation ca=new Calculation(null);
    public void updateGpa()
    {
        int choice;
        Scanner sc=new Scanner(System.in);
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
