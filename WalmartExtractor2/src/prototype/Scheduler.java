package prototype;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Scheduler extends TimerTask{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {

	    //the Date and time at which you want to execute
	    DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    Calendar today = Calendar.getInstance();
//	    Date date = new Date(today.set(Calendar.HOUR_OF_DAY, value);, month, date, hrs, min)

	    //Now create the time and schedule it
	    Timer timer = new Timer();

	    //Use this if you want to execute it once
//	    timer.schedule(new Scheduler(), date);

	    //Use this if you want to execute it repeatedly
	    //int period = 10000;//10secs
	    //timer.schedule(new MyTimeTask(), date, period );
	}
}
