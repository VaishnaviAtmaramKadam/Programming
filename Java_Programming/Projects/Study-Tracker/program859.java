import java.util.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

class StudyLog
{
    private LocalDate Date;
    private String Subject;
    private double Duration;
    private String Description;

    public StudyLog(LocalDate a, String b, double c, String d)
    {
        this.Date = a;
        this.Subject = b;
        this.Duration = c;
        this.Description = d;
    }

    @Override
    public String toString()
    {
        return Date + " | " + Subject + " | " + Duration + " | " + Description;
    }

    public LocalDate getDate()
    {
        return this.Date;
    }

    public String getSubject()
    {
        return this.Subject;
    }

    public double getDuration()
    {
        return this.Duration;
    }

    public String getDescription()
    {
        return this.Description;
    }
}

class StudyTracker
{
    public ArrayList<StudyLog> Database;

    public StudyTracker()
    {
        Database=new ArrayList<StudyLog>();
    }

    public void InsertLog()
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("---------------------------------------------------------------");
        System.out.println("-------------Enter the details of your study:------------------");
        System.out.println("---------------------------------------------------------------");

        LocalDate lobj=LocalDate.now();

        System.out.println("we are entering the date as:"+lobj);
        System.out.println("Enter the name of subject like c/c++/java etc");

        String sub=sobj.nextInt();

        System.out.println("enter the time period of your study:");
        double dur=sobj.nextDouble();

        //issue resolved
        sobj.nextLine();
        System.out.println("please provide the description of your study:");
        String desc=sobj.nextInt();

        StudyLog studyobj=new StudyLog(lobj,sub,dur,desc);

        Dtabase.add(studyobj);

        System.out.println("Study log gets inserted succesfully");
        System.out.println("---------------------------------------------------------------");

    }

    public void DisplayLog()
    {

    }

    public void ExportToCSV()
    {

    }

    public void SummaryByDate();
    {

    }

    public void SummaryBySubject();
    {

    }
}

class program859
{
    public static void main(String A[])
    {
        int iChoice=0;
        StudyTracker stobj=new StudyTracker();

        Scanner sobj=new Scanner(System.in);

        System.out.println("---------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------");

        do
        {
            System.out.println("---------------------------------------------------------------");
            System.out.println("-----------------please select appropriate option:-------------");
            System.out.println("---------------------------------------------------------------");


            System.out.println("Please select appropriate option:");
            System.out.println("1:Insert new study log");
            System.out.println("2:view all study log");
            System.out.println("3:export study log to CSV ");
            System.out.println("4:sUMMARY OF study log BY date");
            System.out.println("1:sUMMARY OF study log BY subject");
            System.out.println("Exit the application");


            System.out.println("---------------------------------------------------------------");

            iChoice=sobj.nextInt();

            switch(iChoice)
            {
                //insert new log
                case 1:
                    stobj.InsertLog();
                    break;

                //view all study log
                case 2:
                    stobj.DisplayLog();
                    break;

                case 3:
                    stobj.ExportToCSV();
                    break;
                    
                case 4:
                    stobj.SummaryByDate();
                    break;

                case 5:
                    stobj.SummaryBySubject();
                    break;

                case 6:
                    break;

                default:
                    System.out.println();
                    break;
                }

        }while(iChoice!=____);

        
        System.out.println("---------------------------------------------------------------");
        System.out.println("--------Thank you for using study tracker--------------------------");
        System.out.println("---------------------------------------------------------------");
        
    }
}