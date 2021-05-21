import com.guo.config.GuoConfig;
import com.guo.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;

public class MyTest {


    @Test
    public void test() {
        // 如果完全使用了配置类方式去做，我们就只能通过AnnotationConfig上下文来获取容器
        ApplicationContext context = new AnnotationConfigApplicationContext(GuoConfig.class);
        User user1 = (User) context.getBean("getUser");
        User user2 = (User) context.getBean("getUser");
        System.out.println(user1.getName());
        System.out.println(user1 == user2);
        // 使用configuration 配置的bean默认情况下也是单列模式
        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());
    }
}
