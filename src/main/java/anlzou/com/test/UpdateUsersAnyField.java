/**
 * @author anlzou
 * @date 2020/4/7 17:59
 * @version xx
 * @description xx
 */

package anlzou.com.test;

import anlzou.com.DBtools;
import anlzou.com.entity.Users;
import anlzou.com.mapper.UsersMapper;
import org.apache.ibatis.session.SqlSession;

public class UpdateUsersAnyField {
    public  static void main(String[] args){
        SqlSession session= DBtools.getSqlSession();
        UsersMapper ud=session.getMapper(UsersMapper.class);

        Users users=new Users();
        users.setId(2);
        users.setPass("cc1");
        System.out.println("更新前的值："+ud.selectById(2l));
        //只对users数据表中的pass字段进行更新操作
        long i=ud.updateUsersAnyField(users);
        session.commit();
        System.out.println("更新后的值："+ud.selectById(2l));
        session.close();
    }
}
