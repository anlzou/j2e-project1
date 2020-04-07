/**
 * @author anlzou
 * @date 2020/4/7 18:37
 * @version xx
 * @description xx
 */

package anlzou.com.test;

import anlzou.com.DBtools;
import anlzou.com.entity.Users;
import anlzou.com.mapper.UsersMapper;
import org.apache.ibatis.session.SqlSession;

public class SelectUsersTrim {
    public  static void main(String[] args){
        SqlSession session= DBtools.getSqlSession();
        UsersMapper usersMapper=session.getMapper(UsersMapper.class);

        Users users=new Users();
        users.setId(3);
        users.setName("dddd");
        System.out.println("按trim替换where构建查询命令后结果："+usersMapper.selectUsersTrim(users));
        session.close();
    }
}
