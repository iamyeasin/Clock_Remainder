package first;

import java.time.LocalTime;
import java.util.*;
import java.util.Timer.*;

public class TimerDemo
{
	public void scheduleAtFixedRate(TimerTask task,long delay,long period)
	{
		
	}
	   public static void main(String[] args) {
	   // creating timer task, timer
	   TimerTask tasknew = new TimerScheduleFixedRateDelay();
	   Timer timer = new Timer();
	      
	   // scheduling the task at fixed rate delay
	   timer.scheduleAtFixedRate(tasknew,500,1000);      
	   }
	   // this method performs the task
	   public void run() {
	   System.out.println("working at fixed rate delay");      
	   }    
	}