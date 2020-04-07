/**
 * @author anlzou
 * @date 2020/4/7 17:46
 * @version xx
 * @description xx
 */

package anlzou.com.test;

import anlzou.com.DBtools;
import anlzou.com.entity.Users;
import anlzou.com.mapper.UsersMapper;
import org.apache.ibatis.session.SqlSession;

public class SelectIdNamePass {
    public  static void main(String[] args){
        SqlSession session= DBtools.getSqlSession();
        UsersMapper ud=session.getMapper(UsersMapper.class);

        Users users=new Users();
        //按id、name和pass同时匹配的条件进行查询
        users.setId(1);
        users.setName("aa");
        users.setPass("aa");
        System.out.println(ud.selectIdNamePass(users));

        users=new Users();
        //按name匹配进行查询

        users.setName("cc");
        System.out.println(ud.selectIdNamePass(users));

        users=new Users();
        //按name和pass匹配进行查询
        users.setName("dd");
        users.setPass("dd");
        System.out.println(ud.selectIdNamePass(users));

        session.close();
    }
}
