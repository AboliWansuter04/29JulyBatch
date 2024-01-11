package dataProvider;

import org.testng.annotations.DataProvider;

public class FBDataProvider

//method-- data provider
//String first name,string last name,string mobile no

{
 @DataProvider(name = "FbRegression")
  public static String[][]fbDataSet() 
 
 {
	 String data[][]= {{"Ani","Tambat","7895754555"},{"Sagar","Wansutre","7878544555"},{"Shweta","Joshi","9856741556"},{"Raju","Pande","7885674155"}};
	  return data;
  }
 
 @DataProvider(name = "FBStanity")
 public static String[][]fbDataSet1()
 {
	 String data[][]= {{"STV","BNM","7895754555"},{"KLM","RTY","7878544555"},{"UIP","HJK","9856741556"},{"ABY","UIO","7885674155"}}; 
	return data;
	 
 }
}
