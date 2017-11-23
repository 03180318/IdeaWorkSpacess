package com.jk.dao;
import com.jk.model.Itree;
import com.jk.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
/**
 * Created by 罗小贩 on 2017/11/15.
 */
@Mapper
public interface UserMapper {
    @Select("select * from user")
    public List<User> userList();

    @Select("select * from t_ztree")
    public List<Itree> showPage();
}
