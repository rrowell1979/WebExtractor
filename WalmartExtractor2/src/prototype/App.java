package prototype;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import com.mysql.*;

//Russell Rowell, Robert White, Karan Singh, Kevin Wu
//CSIS 2450
//Web Extractor

public class App 
{
    public static void main( String[] args )
    {
    	
    	//**********Scheduler************************************
//	    DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//	    Calendar today = Calendar.getInstance();
//	    Date scheduledTime = today.getTime();
//
//	    Timer timer = new Timer();
//
// 	  	int period = 180000;//3 minutes
//	    timer.schedule(new Scheduler(), scheduledTime, period );
	    //************Scheduler*********************************
    	
    	Database db = new Database();
    	Product product;
    	Extractor ext = new Extractor();
        product = ext.parseProductAttributes("54594234","walmart","com");
        
        Product[] productArray;
        String[] ids = new String[3];
        ids[0] = "14869676";
        ids[1] = "26832646";
        ids[2] = "952592653";
        productArray = ext.parseProductAttributes(ids, "walmart", "com");
        
    	try {
			db.insertData(product);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	try {
			db.insertData(productArray);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	System.out.println("Test");
    }
}
