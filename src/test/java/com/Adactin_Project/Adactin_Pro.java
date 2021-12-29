package com.Adactin_Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import com.main.BaseClass;
import com.main.Home_Pojo;

public class Adactin_Pro extends BaseClass {
	public static void main(String[] args) throws Throwable {
		
	getBrowser("chrome");
implicitwait(30);
	url("https://adactinhotelapp.com/index.php");
Home_Pojo om = new Home_Pojo(driver);
inputvalues(om.getUsername(), "velanvic");
inputvalues(om.getPassword(), "Velan@1995");
clickOptions(om.getLogin_button());
dropselect(om.getLocation(), "byvisibletext", "New York");
dropselect(om.getHotel(), "byvalue", "Hotel Hervey");
dropselect(om.getRoom_type(), "byvisibletext", "Deluxe");
dropselect(om.getRoom_nos(), "byvalue", "5");
delete(om.getDatecheckin());
inputvalues(om.getDatecheckin(), "25/12/2021");
delete(om.getDatecheckout());
inputvalues(om.getDatecheckout(), "30/12/2021");
dropselect(om.getAdultroom(), "byvalue", "2");
dropselect(om.getChildroom(), "by value", "1");
clickOptions(om.getSubmit());
clickOptions(om.getRadiobutton());
clickOptions(om.getContinue_Button());
inputvalues(om.getFirst_name(), "Velan");
inputvalues(om.getLast_name(), "DG");
inputvalues(om.getAddress(), "Veerapandian nagar ");
inputvalues(om.getCc_num(), "5489456978962456");
dropselect(om.getCc_type(), "byvalue", "VISA");
dropselect(om.getCc_exp_month(), "byvisibletext", "December");
dropselect(om.getCc_exp_year(), "byvalue", "2022");
inputvalues(om.getCc_cvv(), "548");
clickOptions(om.getBook_now());
clickOptions(om.getMy_itinerary());
clickOptions(om.getLogout());










































	}
	}