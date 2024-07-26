package TestNG_Annotations1.TestNG_Annotations1;


import org.testng.annotations.*;

public class All_Annotations {

	@BeforeSuite
	
	void qwe() {
	
		System.out.println("This is from Before Suite");
	}
	
	@AfterSuite
	
	void rty() {
		
		System.out.println("This is from After Suite");
		
	}
	
	@BeforeTest
	 void uio() {
		
		System.out.println("This is from Before test");
		
	}
	
	@AfterTest
	 void pas() {
		
		System.out.println("This is from After test");
		
	}
	
	@BeforeClass
	 void dfg() {
		System.out.println("This is from Before Class");
		
	}
	
     @AfterClass
      void hjk() {
    	 
    	 System.out.println("This is from After Class");
     }
     
     @BeforeMethod
      void lzx() {
    	 
    	 System.out.println("This is from Before Method");
     }
     
     @AfterMethod
     
     void cvb() {
    	 System.out.println("This is from After method");
     }
     
     @Test
      void n() {
    	 System.out.println("This is from n test");
     }
     
     
     
     
     
     
     
    	 
	
		
	}
     
     
     
     
     
     
     
	
	
	
	
	
	
	

	
	
