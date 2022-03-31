package JFS.BookShopApp;

import org.springframework.stereotype.Component;

@Component
public class MyFavBook implements MyFirstBookInterface {
	

	public void myfavbk(){
		System.out.println("Vairamuthu songs");
	}
	public void my1stbook() {
		System.out.println("im from interfaqce:implemented thro MyFav Class");
		
	}
	
//	public void myfavbk() {
//		// TODO Auto-generated method stub
//		System.out.println("Vairamuthu songs");
	
	@Override
	public void my1stBook() {
		// TODO Auto-generated method stub
		System.out.println("Im inside");
	}
//		
//	}

}
