/**
 * @author anlzou
 * @date 2020/4/7 18:07
 * @version xx
 * @description xx
 */

package anlzou.com.test;

import anlzou.com.DBtools;
import anlzou.com.entity.Users;
import anlzou.com.mapper.UsersMapper;
import org.apache.ibatis.session.SqlSession;

public class InsertUsersAnyField {
    public  static void main(String[] args){
        SqlSession session= DBtools.getSqlSession();
        UsersMapper usersMapper=session.getMapper(UsersMapper.class);

        Users users=new Users();
        users.setName("test");
        //只向users数据添加一条记录，助理只对name字段进行赋值
        long i=usersMapper.insertUsersAnyField(users);
        session.commit();
        users=new Users();
        users.setName("test");
        System.out.println("新添加记录的值："+usersMapper.selectIdNamePass(users));
        session.close();
    }
}
