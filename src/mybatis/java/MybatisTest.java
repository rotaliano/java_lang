package mybatis.java;


import mybatis.java.mapper.CustomersMapper;
import mybatis.java.model.Customers;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class MybatisTest {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = Resources.getResourceAsStream("mybatis/resources/mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();

        CustomersMapper mapper = session.getMapper(CustomersMapper.class);
        Customers result = mapper.selectCustomers(1);
        System.out.println(result);

        session.close();
    }
}
