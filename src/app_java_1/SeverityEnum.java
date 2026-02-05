package app_java_1;

public enum SeverityEnum {
    MINOR(1,"In days"),MAJOR(3,"in Week"),CRITICAL(1,"In Month");

    private final int days;
    private final String info;
    SeverityEnum(int days,String info){
       this.days = days;
       this.info = info;
    }

    public int getDays() {
        return days;
    }

    public String getInfo() {
        return info;
    }
}
