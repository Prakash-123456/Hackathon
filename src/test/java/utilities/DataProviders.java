package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import factory.BaseClass;
import pageObjects.GiftCardPage;

public class DataProviders {

		
	
	@DataProvider(name="search_data")
	public String[] searchdata() throws IOException 
	{
		String path=".\\testData\\data.xlsx";//taking xl file from testData
		ExcelUtility xlutil=new ExcelUtility(path);//creating an object for XLUtility
		String value= xlutil.getCellData("Sheet2", 0, 0);
		String data[]=new String[] {value};
	    return data;//returning two dimension array
				
	}
	
	@DataProvider(name="GiftCardData")
	public String [] []getData() throws IOException
	{
		String path=".\\testData\\data.xlsx";//taking xl file from testData
		ExcelUtility xlutil=new ExcelUtility(path);//creating an object for XLUtility
		String[][]data=new String[1][8];
        for(int i=0;i<8;i++) {
        	String celldata=xlutil.getCellData("Sheet2", 5, i);
        	data[0][i]=celldata;
        }
        return data;
	}
	
	@DataProvider(name="crctData")
	public String[][]crctdata() throws IOException 
	{
		String path=".\\testData\\data.xlsx";//taking xl file from testData
		ExcelUtility xlutil=new ExcelUtility(path);//creating an object for XLUtility
		String[][] data= new String[1][1];
		 data[0][0]=xlutil.getCellData("Sheet2", 6, 1);
		 //data[0][1]=xlutil.getCellData("Sheet2", 6, 4);
	    return data;//returning two dimension array
				
	}
	

	@DataProvider(name="crctData_2")
	public String[][]crctdata_2() throws IOException 
	{
		String path=".\\testData\\data.xlsx";//taking xl file from testData
		ExcelUtility xlutil=new ExcelUtility(path);//creating an object for XLUtility
		String[][] data_2= new String[1][1];
		 //data[0][0]=xlutil.getCellData("Sheet2", 6, 1);
		 data_2[0][0]=xlutil.getCellData("Sheet2", 6, 4);
	    return data_2;//returning two dimension array
				
	}
	
	
// Cucumber 
	
	GiftCardPage GC = new GiftCardPage(BaseClass.getDriver()); // Cucumber
	String path=".\\testData\\data.xlsx";//taking xl file from testData
	ExcelUtility xlutil=new ExcelUtility(path);//creating an object for XLUtility
	
	public void senderDetails() throws IOException {
		GC.recipient_name.sendKeys(xlutil.getCellData("Sheet2", 5, 0));
		GC.recipient_email.sendKeys(xlutil.getCellData("Sheet2", 5, 1));
		GC.recipient_mobile.sendKeys(xlutil.getCellData("Sheet2", 5, 2));
	}
	
	public void receiverDetails() throws IOException {
		GC.senderName.sendKeys(xlutil.getCellData("Sheet2", 5, 3));
		GC.senderEmail.sendKeys(xlutil.getCellData("Sheet2", 5, 4));
		GC.senderMobile.sendKeys(xlutil.getCellData("Sheet2", 5, 5));
		GC.senderAddress.sendKeys(xlutil.getCellData("Sheet2", 5, 6));
		GC.pincode.sendKeys(xlutil.getCellData("Sheet2", 5, 7));
	}
}

