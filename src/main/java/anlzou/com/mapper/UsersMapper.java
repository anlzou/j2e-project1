/**
 * @author anlzou
 * @date 2020/3/30 20:03
 * @version xx
 * @description xx
 */

package anlzou.com.mapper;
import anlzou.com.entity.Users;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UsersMapper {
    Users selectById(long id);
    List<Users> selectAll();
    long insertUsers(Users users);
    long updateUsers(Users users);
    long deleteUsers(long id);
    List<Users> selectByNameAndPass(Map map);
    List<Users> selectByParam(@Param("name")String name);
    List<Users> selectIdNamePass(Users users);
    long updateUsersAnyField(Users users);
    long insertUsersAnyField(Users users);
    List<Users> selectUsersByChoose(Users users);
    List<Users> selectByWhere(Users users);
    long updateUsersSet(Users users);
    List<Users> selectUsersTrim(Users users);
    long updateUsersTrim(Users users);
    List<Users> selectUsersForeachIn(List<Long> list);
    long insertUsersList(List<Users> list);
}
