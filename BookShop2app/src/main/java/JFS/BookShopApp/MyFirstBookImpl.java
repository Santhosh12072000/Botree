package JFS.BookShopApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MyFirstBookImpl implements MyFirstBookInterface {

	@Override
	
	public void my1stBook() {
		// TODO Auto-generated method stub
		System.out.println("im from MyFirstBookInterface");
		
	}

}
