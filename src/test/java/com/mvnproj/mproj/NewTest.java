package com.mvnproj.mproj;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void firstTest() {
	  
      Calendar cal = Calendar.getInstance();
      SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
      System.out.println( "Execution time is:" + sdf.format(cal.getTime()) );
	  	//System.out.println("Current time is:" + ) ;
  }
}
