package springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController
{
    public String sayHello()
    {
        System.out.println("hey there!");
        return "peace out...";
    }
}
