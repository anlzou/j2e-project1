/**
 * @author anlzou
 * @date 2020/4/7 18:41
 * @version xx
 * @description xx
 */

package anlzou.com.test;

import anlzou.com.DBtools;
import anlzou.com.entity.Users;
import anlzou.com.mapper.UsersMapper;
import org.apache.ibatis.session.SqlSession;

public class UpdateUsersTrim {
    public  static void main(String[] args){
        SqlSession session= DBtools.getSqlSession();
        UsersMapper usersMapper=session.getMapper(UsersMapper.class);

        Users users=new Users();
        users.setId(3);
        users.setName("dd3");
        System.out.println("按trim替换set构建更新命令前结果："+usersMapper.selectById(3L));
        usersMapper.updateUsersTrim(users);
        session.commit();
        System.out.println("按trim替换set构建更新命令后结果："+usersMapper.selectById(3L));
        session.close();
    }
}
