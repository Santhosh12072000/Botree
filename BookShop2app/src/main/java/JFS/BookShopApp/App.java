package JFS.BookShopApp;

import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        @SuppressWarnings("resource")
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        MyBook myBook=context.getBean(MyBook.class);
        myBook.displayMyBook();
//        MyNewClass mynewclass=context.getBean(MyNewClass.class);
//        mynewclass.show();
//        MyFavBook myfavbook=context.getBean(MyFavBook.class);
//        myfavbook.myfavbk();
        ThrillerBook thrillerbook=context.getBean(ThrillerBook.class);
        thrillerbook.artistcount();
        
    }
}
