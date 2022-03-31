package JFS.BookShopApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ThrillerBook {
	@Autowired
	Horrorclass horrorclass;
	@Value("#{19+1}")
	public int y;
	@Value("#{'Hii  '+'Sandy'}")
	public String a;
	public Integer artistcount() {
	  Integer artist=100;
	  artist+=horrorclass.getMb();
	  System.out.println(artist);
	  System.out.println(y);
	  System.out.println(a);
	  return artist;
	  
	}	
	
	

}
