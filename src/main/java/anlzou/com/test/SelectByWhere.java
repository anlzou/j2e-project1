/**
 * @author anlzou
 * @date 2020/4/7 18:24
 * @version xx
 * @description xx
 */

package anlzou.com.test;

import anlzou.com.DBtools;
import anlzou.com.entity.Users;
import anlzou.com.mapper.UsersMapper;
import org.apache.ibatis.session.SqlSession;

public class SelectByWhere {
    public  static void main(String[] args){
        SqlSession session= DBtools.getSqlSession();
        UsersMapper usersMapper=session.getMapper(UsersMapper.class);

        Users users=new Users();
        //只有name不为空的构建代码是select id,name,pass from users where and name=#{name},这时mybatis为帮我们把and去掉。
        users.setName("lili");
        System.out.println("按name查询结果："+usersMapper.selectByWhere(users));

        users=new Users();
        //id,name,pass都是空，则构建出来的命令为：select id,name,pass from users ,程序也不会出错
        System.out.println("按name查询结果："+usersMapper.selectByWhere(users));
        session.close();
    }
}
