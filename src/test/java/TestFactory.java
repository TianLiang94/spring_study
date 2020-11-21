import com.spring01.factorybean.MyClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFactory {

    @Test
    public void testMyClass(){
        //1.读取配置文件中所需创建的bean 对象 并获取工厂对象
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-context.xml");
        //2.通过id获取bean对象
        MyClass mc = (MyClass)ctx.getBean("mc");
        mc.show();
    }
}
