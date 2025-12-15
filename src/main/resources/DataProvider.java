
public class DataProvider {
   @DataProvider(name="rani")
   public String [][] getdata(){
	   String path="C:\\Users\\K Gouthami\\eclipse-workspace\\durgasirclasses\\durgasirclasses\\selemiumproject\\Cucumber\\src\\test\\resources.Book3.xlsx";
	   Excelutility excel=new Excelutility(path);
	   int totatlrows=excel.getrowcount("Sheet0");
	   int totalcell=excel.getcol("Sheet0", 1);
	   String logindata[][]=new String[totalrows-1][totalcell];
   	for(int i=2;i<=totalrows;i++) {
		System.out.println("username:"+logindata[i-2][0]+"password:"+logindata[i-2][1]);
		   for(int j=0;j<totalcells;j++) {
			   logindata[i-2][j]=xlutil.getcelldata("Sheet1",i,j);
			   			   
		   }
	}
	return logindata;
	
}

	   
	   
	   
   }
		   


}
