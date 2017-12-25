package com.yan.demo.dao;

import com.yan.demo.bean.Personclass;
import com.yan.demo.bean.PersonclassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PersonclassMapper {
    long countByExample(PersonclassExample example);

    int deleteByExample(PersonclassExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Personclass record);

    int insertSelective(Personclass record);

    List<Personclass> selectByExample(PersonclassExample example);

    Personclass selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Personclass record, @Param("example") PersonclassExample example);

    int updateByExample(@Param("record") Personclass record, @Param("example") PersonclassExample example);

    int updateByPrimaryKeySelective(Personclass record);

    int updateByPrimaryKey(Personclass record);
    
    List<Personclass> selectAll();
}