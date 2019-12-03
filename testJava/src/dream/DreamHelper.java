package dream;

import dream.base.IDream;
import dream.denum.EDuringDay;

import java.util.Calendar;
import java.util.Date;

public class DreamHelper {
    private static DreamHelper mInstance;

    public static DreamHelper Instance() {
        if(mInstance==null){
            mInstance = new DreamHelper();
        }
        return mInstance;
    }

    private DreamHelper(){}

    public IDream getLatestDream(){
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        EDuringDay eDuringDay = getDuringDay(hour);
        IDream  dream = new NoDream();
        switch (eDuringDay){
            case EARLY_MORNING:
                dream = new ChildDream();
                break;
            case MORNING:
                dream = new TeenagerDream();
                break;
            case NOON:
                dream = new AdultDream();
                break;
            case EVENING:
                dream = new SeniorsDream();
            default:
                break;
        }
        return dream;
    }

    private EDuringDay getDuringDay(int hours){
        if(hours<7){
            return EDuringDay.EARLY_MORNING;
        } else if (hours < 11) {
            return EDuringDay.MORNING;
        }else if (hours <= 13) {
            return EDuringDay.NOON;
        }else {
            return EDuringDay.EVENING;
        }
    }
}
