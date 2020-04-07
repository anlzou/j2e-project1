/**
 * @author anlzou
 * @date 2020/4/7 18:46
 * @version xx
 * @description xx
 */

package anlzou.com.test;

import anlzou.com.DBtools;
import anlzou.com.entity.Users;
import anlzou.com.mapper.UsersMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;

public class InsertUsersList {
    public  static void main(String[] args){
        SqlSession session= DBtools.getSqlSession();
        UsersMapper usersMapper=session.getMapper(UsersMapper.class);

        List<Users> usersList=new ArrayList<Users>();
        Users users=new Users();
        users.setName("foreacha");
        users.setPass("foreacha");
        usersList.add(users);

        users=new Users();
        users.setName("foreachb");
        users.setPass("foreachb");
        usersList.add(users);
        usersMapper.insertUsersList(usersList);
        session.commit();
        System.out.println("foreach构建批量插入命令结果："+usersMapper.selectAll());
        session.close();
    }
}
