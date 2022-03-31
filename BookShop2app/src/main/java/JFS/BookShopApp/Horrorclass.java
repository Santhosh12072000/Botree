package JFS.BookShopApp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Horrorclass {
	
	

	

	public int getMb() {
		return mb;
	}

	public void setMb(int mb) {
		this.mb = mb;
	}

	@Value("#{20+1}")
	public int mb;
	
	@Value("hi")
	public String str;
	
	

}
