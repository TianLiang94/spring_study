import com.spring01.entity.User;
import com.spring01.factorybean.MyClass;
import com.spring01.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.UUID;

public class TestFactory {



    @Test
    public void testMyClass(){
        //1.读取配置文件中所需创建的bean 对象 并获取工厂对象
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-context.xml");
        //2.通过id获取bean对象
        MyClass mc = (MyClass)ctx.getBean("mc");
        mc.show();
    }

    @Test
    public void testqueryUser(){
        //1.读取配置文件中所需创建的bean 对象 并获取工厂对象
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-context.xml");
        UserServiceImpl userService = (UserServiceImpl) ctx.getBean("userService");
        User user = userService.queryUser();
        String str = user.toString();
        System.out.println(str);
    }

    @Test
    public void testSpringDI(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        User user1 = (User)context.getBean("乐之");
        User user2 = (User)context.getBean("乐之");
        User user3 = (User)context.getBean("乐之");

        System.out.println(user1 == user2);
        System.out.println(user2 == user3);
        //System.out.println(str);
    }
}
