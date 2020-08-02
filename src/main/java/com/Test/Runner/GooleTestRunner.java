package com.Test.Runner;
import com.qa.GooleThread.GoogleThreadFeatures;

public class GooleTestRunner {

	public static void main(String ar[]) {
		/*      Thread t1 = new GoogleThreadFeatures("chrome thread", "chrome");
	            Thread t2 = new GoogleThreadFeatures("firefox thread", "firefox");
				
				System.out.println("threads started.....");
				
				t1.start();
				t2.start();
	   */

				String chromeCount = (System.getProperty("chrome"));
				int c1=(Integer.parseInt(chromeCount));
				String firefoxCount = (System.getProperty("firefox"));
				int c2=(Integer.parseInt(firefoxCount));
				System.out.println("total chrome : " + c1 + " and " + "total firefox : " + c2);

				for (int i = 0, j = 0; i < c1 || j < c2; i++, j++) {
					System.out.println("threads started.....");

					new GoogleThreadFeatures("chrome thread", "chrome").start();
					new GoogleThreadFeatures("firefox thread", "firefox").start();

					System.out.println("thread got ended....");
				}

			}

}
