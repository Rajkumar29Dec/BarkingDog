package altimetrik.raj;

public class Main {

    public static void main(String[] args) {
        boolean result=ShouldWakeUp(true,-1);
        System.out.println(result);
    }
    public static boolean ShouldWakeUp(boolean iscurrentlyBarking,int hourOfDay){
        if (hourOfDay<0 || hourOfDay>23){
            return false;
        }
        else if ((hourOfDay<8 || hourOfDay>22)&& (iscurrentlyBarking==true)){
            return true;
        }
        else {
            return false;
        }
    }
}
