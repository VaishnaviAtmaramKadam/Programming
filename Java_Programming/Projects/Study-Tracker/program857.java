
import java.util.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

class StudyLog {

    private LocalDate Date;
    private String Subject;
    private double Duration;
    private String Description;

    public StudyLog(LocalDate a, String b, double c, String d) {
        this.Date = a;
        this.Subject = b;
        this.Duration = c;
        this.Description = d;
    }

    @Override
    public String toString() {
        return Date + " | " + Subject + " | " + Duration + " | " + Description;
    }

    public LocalDate getDate() {
        return this.Date;
    }

    public String getSubject() {
        return this.Subject;
    }

    public double getDuration() {
        return this.Duration;
    }

    public String getDescription() {
        return this.Description;
    }
}

class StudyTracker {

    public ArrayList<StudyLog> Database;

    public StudyTracker() {
        Database = new ArrayList<StudyLog>(;

    
    )
    }

    public void InsertLog() {

    }

    public void DisplayLog() {

    }

    public void ExportToCSV() {

    }

    public void SummaryByDate();

    {

    }

    public void SummaryBySubject();

    {

    }
}

class program857 {

    public static void main(String A[]) {
        int iChoice = 0;
        StudyTracker stobj = new StudyTracker();

        Scanner sobj = new Scanner(System.in);

        System.out.println("---------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------");

        do {
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

            iChoice = sobj.nextInt();

            switch (iChoice) {
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
                    System.out.println()
                    break;
            }

        } while (iChoice != ____);

        System.out.println("---------------------------------------------------------------");
        System.out.println("--------Thank you for using study tracker--------------------------");
        System.out.println("---------------------------------------------------------------");

    }
}
