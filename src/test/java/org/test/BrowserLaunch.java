package org.test;

import org.buynow.buynows;
import org.link.Realme;
import org.mavenpro.BaseClass;
import org.page.LoginPage;
import org.payment.Payments;

public class BrowserLaunch extends BaseClass{
	public static void main(String[] args) throws InterruptedException  {
		Launch("Chrome");

		lunchUrl("https://www.flipkart.com/");

		LoginPage l = new LoginPage();
		sendkeys(l.getLoginid(), "9750765850");
		sendkeys(l.getLoginpass(), "245601");
		onclick(l.getLoginbtn());
		sendkeys(l.getSrc(), "realme mobile");
		Thread.sleep(3000);
		onclick(l.getClick1());
		Thread.sleep(3000);
		onclick(l.getClick2());
		windowhandling(0);
		Realme r = new Realme();
		onclick(r.getLinkclick());
		windowhandling(1);
		buynows b = new buynows();
		onclick(b.getBuy());
		Payments p = new Payments();
		onclick(p.getOnclick());
		onclick(p.getOnclick1());
		 
		/*
		 * onclick(p.getClick1()); Thread.sleep(5000);
		 * sendkeys(p.getEnterno(),"9750765850"); Thread.sleep(5000);
		 * onclick(p.getClick());
		 */

		/*
		 * lunchUrl("https://www.facebook.com/"); LoginPage l=new LoginPage();
		 * l.getUserid("karthi","45567");
		 */
	}

}
