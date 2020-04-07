/**
 * @author anlzou
 * @date 2020/3/24 16:18
 * @version xx
 * @description xx
 */

package anlzou.com.test;
import anlzou.com.DBtools;
import anlzou.com.mapper.UsersMapper;
import org.apache.ibatis.session.SqlSession;
import java.sql.SQLException;

public class UsersTestSelect {
    public  static  void main(String[] args) throws SQLException {
        //1.创建sqlsessionFactory
        //SqlSessionFactory sqlSessionFactory = DBtools.getSqlSessionFactory();
        //2.创建SqlSession
        //SqlSession session = sqlSessionFactory.openSession();
        SqlSession session = DBtools.getSqlSession();//可以省略前面两个步骤
        //3.session 中创建相应的接口代理类，即mapper对象
        UsersMapper usersMapper = session.getMapper(UsersMapper.class);
        //通过mapper对象usersDao接口中的方法对数据表users进行读操作
        System.out.println(usersMapper.selectAll());
        System.out.println(usersMapper.selectById(1));
        session.close();
    }
}
