import com.guo.mapper.UserMapper;
import com.guo.mapper.UserServiceImpl;
import com.guo.mapper.UserServiceImpl2;
import com.guo.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyTest {

    @Test
    public void selectAll() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);


        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> allUsers = mapper.getAllUsers();
        for(User user : allUsers) {
            System.out.println(user);
        }

        sqlSession.close();
    }

    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServiceImpl userMapper = context.getBean("userMapper", UserServiceImpl.class);

        for (User user : userMapper.getAllUsers()) {
            System.out.println(user);
        }
    }

    @Test
    public void test3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServiceImpl2 userMapper2 = context.getBean("userMapper2", UserServiceImpl2.class);


        for (User user : userMapper2.getAllUsers()) {
            System.out.println(user);
        }
    }
}
