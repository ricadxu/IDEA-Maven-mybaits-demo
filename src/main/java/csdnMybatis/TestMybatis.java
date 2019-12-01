package csdnMybatis;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class TestMybatis {
    public static void main(String[] args) throws IOException {
        String resource = "Mybatis-config.xml";//配置文件 mybatis-config.xml 赋值给变量
        InputStream inputStream = Resources.getResourceAsStream(resource);//读取配置文件 mybatis-config.xml
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);// 通过 SqlSessionFactory 创建 SqlSession
        SqlSession session = sqlSessionFactory.openSession(); // 打开 SqlSession 会话

        Twebsites c=  session.selectOne("getWebsiteById",1);//选择查询id 1
        System.out.println(c.getName());

        session.commit(); // 提交事务
        session.close(); // 关闭事务
    }
}