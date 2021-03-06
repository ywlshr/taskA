package com.eagle.task.mapper;

import com.eagle.task.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> getAll();

    User getOne(Integer id);

    void insert(User user);

    void update(User user);

    void delete(Integer id);

}