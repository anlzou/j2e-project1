/**
 * @author anlzou
 * @date 2020/3/30 22:33
 * @version xx
 * @description xx
 */

package anlzou.com.test;
import anlzou.com.DBtools;
import anlzou.com.entity.Users;
import anlzou.com.mapper.UsersMapper;
import org.apache.ibatis.session.SqlSession;
import java.util.List;

public class UsersTestSelectByParam {
    public  static  void main(String[] args){
        //获取会话SqlSession对象
        SqlSession session= DBtools.getSqlSession();
        UsersMapper usersMapper=session.getMapper(UsersMapper.class);
        try {
            List<Users> list=usersMapper.selectByParam("an");
            if(list !=null && list.size()>0){
                for (Users user:list) {
                    System.out.println("id="+user.getId()+",name="+user.getName()+",pass="+user.getPass());
                }
            }else {
                System.out.println("没有找到用户");
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
    }
}
