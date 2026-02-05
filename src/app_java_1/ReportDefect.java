package app_java_1;

public class ReportDefect {
    public static void main(String[] args) {
//        int days = Defect.getDefectFixingTime(SeverityEnum.CRITICAL);
//        int days1 = Defect.getDefectFixingTime(SeverityEnum.MAJOR);
//        int days2 = Defect.getDefectFixingTime(SeverityEnum.MINOR);
//        System.out.println(days);
//        System.out.println(days1);
//        System.out.println(days2);
        SeverityEnum days = SeverityEnum.MAJOR;
        int days1 = days.getDays();
        String infos = days.getInfo();
        System.out.println("The Time Required to Complete THe defect is : "+days1+"-> "+infos);
    }
}
