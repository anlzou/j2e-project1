/**
 * @author anlzou
 * @date 2020/3/30 21:33
 * @version xx
 * @description xx
 */

package anlzou.com.test;
import org.apache.ibatis.session.SqlSession;
import anlzou.com.DBtools;
import anlzou.com.mapper.UsersMapper;
import anlzou.com.entity.Users;


public class UsersTestInsert {
    public  static  void main(String[] args){
        //获取会话SqlSession对象
        SqlSession session= DBtools.getSqlSession();
        UsersMapper usersMapper=session.getMapper(UsersMapper.class);
        try {
            Users users = new Users();
            users.setName("an");
            users.setPass("an");
            long i = usersMapper.insertUsers(users);
            if(i>0){
                System.out.println("添加数据成功");
            }else{
                System.out.println("添加数据失败");
            }
            session.commit();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
    }
}
