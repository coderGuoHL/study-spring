import com.guo.pojo.User;
import com.guo.pojo.UserT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) context.getBean("userNew");
        user.show();
        UserT user2 = (UserT) context.getBean("ut3");
        user2.run();
    }
}

