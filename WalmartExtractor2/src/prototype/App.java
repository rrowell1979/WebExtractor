package prototype;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

//Russell Rowell, Robert White, Karan Singh, Kevin Wu
//CSIS 2450
//Web Extractor

public class App 
{
    public static void main( String[] args )
    {
	    DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    Calendar today = Calendar.getInstance();
	    today.add(Calendar.HOUR_OF_DAY, 0);
	    Date scheduledTime = today.getTime();

	    Timer timer = new Timer();

 	  	int period = 180000;//3 minutes
//	    int period = 15000;
	    timer.schedule(new Scheduler(), scheduledTime, period );
    }
}
