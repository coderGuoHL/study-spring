import com.guo.pojo.Student;
import com.guo.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student);
    }

    @Test
    public void testP() {
        ApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user.toString());
    }

    @Test
    public void testC() {
        ApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");
        User user2 = context.getBean("user2", User.class);
        User user1 = context.getBean("user2", User.class);
        System.out.println(user2.toString());

        System.out.println(user1 == user2);
        User userA = context.getBean("user", User.class);
        User userB = context.getBean("user", User.class);
        System.out.println(userA == userB);

    }
}
