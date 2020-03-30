/**
 * @author anlzou
 * @date 2020/3/30 22:07
 * @version xx
 * @description xx
 */

package anlzou.com.test;

import anlzou.com.DBtools;
import anlzou.com.entity.Users;
import anlzou.com.mapper.UsersMapper;
import org.apache.ibatis.session.SqlSession;

public class UsersTestUpdate {
    public  static  void main(String[] args){
        //获取会话SqlSession对象
        SqlSession session= DBtools.getSqlSession();
        UsersMapper usersMapper=session.getMapper(UsersMapper.class);
        try {
            Users users=new Users();
            users.setId(9);
            users.setName("an");
            users.setPass("an");
            long i=usersMapper.updateUsers(users);
            if(i>0){
                System.out.println("更新数据成功");
            }else{
                System.out.println("更新数据失败");
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
    }
}
