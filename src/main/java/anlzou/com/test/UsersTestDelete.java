/**
 * @author anlzou
 * @date 2020/3/30 22:15
 * @version xx
 * @description xx
 */

package anlzou.com.test;

import anlzou.com.DBtools;
import anlzou.com.mapper.UsersMapper;
import org.apache.ibatis.session.SqlSession;

public class UsersTestDelete {
    public  static  void main(String[] args){
        //获取会话SqlSession对象
        SqlSession session= DBtools.getSqlSession();
        UsersMapper usersMapper=session.getMapper(UsersMapper.class);
        try {
            long i=usersMapper.deleteUsers(2L);
            if(i>0){
                System.out.println("删除数据成功");
            }else{
                System.out.println("删除数据失败");
            }
            session.commit();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
    }
}
