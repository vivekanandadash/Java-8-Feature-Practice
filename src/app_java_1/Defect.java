package app_java_1;

public class Defect {
    public static int getDefectFixingTime(SeverityEnum s){
      return switch (s){
          case MINOR->1;
          case MAJOR->3;
          case CRITICAL->5;

      };
    }
}
