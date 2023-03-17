package calculation;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Calculation {
    Logger log=Logger.getLogger("Calculation");
    Scanner sc=new Scanner(System.in);
    private int gpa=0;
    private String name;
    public Calculation(String name)
    {
        this.name=name;
    }
    public Calculation()
    {

    }
    public void callGpa(String grade)
    {
        String msg="Name added successfully!!!";
            switch (grade) {
                case "A" -> {
                    gpa = 4;
                    log.info(msg);
                }
                case "B" -> {
                    gpa = 3;
                    log.info(msg);
                }
                case "C" -> {
                    gpa = 2;
                    log.info(msg);
                }
                case "D" -> {
                    gpa = 1;
                    log.info(msg);
                }
                default -> {
                    log.info("Enter the valid grade A to D");
                    log.info("RE-Enter your grade:");
                    String reEnterGrade=sc.nextLine();
                    callGpa(reEnterGrade);
                }
            }
       log.log(Level.INFO,()-> name+" has "+gpa+" GPA.");
    }
}
