/**
 * @author anlzou
 * @date 2020/4/7 18:14
 * @version xx
 * @description xx
 */

package anlzou.com.test;

import anlzou.com.DBtools;
import anlzou.com.entity.Users;
import anlzou.com.mapper.UsersMapper;
import org.apache.ibatis.session.SqlSession;

public class SelectUsersByChoose {
    public  static void main(String[] args){
        SqlSession session= DBtools.getSqlSession();
        UsersMapper usersMapper=session.getMapper(UsersMapper.class);

        Users users=new Users();
        users.setName("test");
        System.out.println("按name查询结果："+usersMapper.selectUsersByChoose(users));
        session.close();
    }
}
