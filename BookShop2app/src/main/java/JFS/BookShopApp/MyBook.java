package JFS.BookShopApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan
public class MyBook {
	
	@Autowired
	@Qualifier("myFavBook")
	MyFavBook myfavbook;
    @Autowired
    MyFirstBookImpl myfirstBookImpl;
    @Autowired
    MyFirstBookInterface myFirstBookInterface;
	public MyFavBook getMyfavbook() {
		return myfavbook;
	}

	public void setMyfavbook(MyFavBook myfavbook) {
		this.myfavbook = myfavbook;
	}
	
	public void displayMyBook() {
		System.out.println("My Book name is Java 17");
	    myfavbook.myfavbk();
	    myfavbook.my1stbook();
	    myfirstBookImpl.my1stBook();
	    myFirstBookInterface.my1stBook();
	    
		
	}

//	@Override
//	public void my1stBook() {
//		// TODO Auto-generated method stub
//		System.out.println("Im inside");
//	}
	

}
																																																																									