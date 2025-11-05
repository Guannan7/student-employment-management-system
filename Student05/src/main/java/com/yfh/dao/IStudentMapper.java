package com.yfh.dao;

import com.yfh.pojo.IStudent;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface IStudentMapper {
    @Select("select * from s_student where id=#{id}")
    IStudent a(int id);

    @Update("update s_student set name=#{name},age=#{age} where id=#{id}")
    int updateStudent(IStudent iStudent);

    @Select("select  * from s_student where cid=#{id}")
    @Results({@Result(id=true,column = "id",property = "id"),
                @Result(column = "classname",property = "classname")
    })
    List<IStudent> selectStudentByCid(int cid);
}
