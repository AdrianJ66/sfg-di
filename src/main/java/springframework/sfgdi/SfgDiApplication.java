package springframework.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import springframework.sfgdi.controllers.MyController;

@SpringBootApplication
public class SfgDiApplication
{

    public static void main(String[] args)
    {

        ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

        MyController c = (MyController) ctx.getBean("myController");
        
        System.out.println(c.sayHello());
    }

}
