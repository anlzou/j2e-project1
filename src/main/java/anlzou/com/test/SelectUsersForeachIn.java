/**
 * @author anlzou
 * @date 2020/4/7 18:43
 * @version xx
 * @description xx
 */

package anlzou.com.test;

import anlzou.com.DBtools;
import anlzou.com.entity.Users;
import anlzou.com.mapper.UsersMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;

public class SelectUsersForeachIn {
    public  static void main(String[] args){
        SqlSession session= DBtools.getSqlSession();
        UsersMapper usersMapper=session.getMapper(UsersMapper.class);

        List<Long> listLong=new ArrayList<Long>();
        listLong.add(2l);
        listLong.add(3l);
        listLong.add(5l);
        List<Users> list=usersMapper.selectUsersForeachIn(listLong);
        System.out.println("foreach构建查询命令后结果："+list);
        session.close();
    }
}
