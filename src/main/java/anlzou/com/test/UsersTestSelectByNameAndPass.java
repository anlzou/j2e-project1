/**
 * @author anlzou
 * @date 2020/3/30 22:28
 * @version xx
 * @description xx
 */

package anlzou.com.test;
import org.apache.ibatis.session.SqlSession;
import anlzou.com.DBtools;
import anlzou.com.mapper.UsersMapper;
import anlzou.com.entity.Users;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UsersTestSelectByNameAndPass {
    public  static  void main(String[] args){
        //获取会话SqlSession对象
        SqlSession session= DBtools.getSqlSession();
        UsersMapper usersMapper=session.getMapper(UsersMapper.class);
        try {
            Map<String,Object> map=new HashMap<String, Object>();
            map.put("name","aa");
            map.put("pass","aa");
            List<Users> list=usersMapper.selectByNameAndPass(map);
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
