package com.chinahitech.shop.mapper;

import com.chinahitech.shop.bean.Randar;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface RandarMapper {

    @Select("select * from mytest")
    public List<Randar> find();

    @Insert("insert into mytest values(#{id},#{name})")
    public int insert(Randar randar);
}
