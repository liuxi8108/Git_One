package com.maven.dao;

import com.maven.pojo.Items;
import com.maven.pojo.User;

public interface itemsMapper {

    //根据id进行查询
    public Items findById(Integer id);


    //添加
    public void insert(User user);
    
    //删除
    public void delete(int id);
    
    //修改
    public void update(User user);
}
