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
		Extractor ext = new Extractor();
        Product product;
        product = ext.parseProductAttributes("54594234","walmart","com");
        Product[] productArray;
        String[] ids = new String[3];
        ids[0] = "14869676";
        ids[1] = "26832646";
        ids[2] = "952592653";
        productArray = ext.parseProductAttributes(ids, "walmart", "com");
        System.out.println("Finished");
	}

}
