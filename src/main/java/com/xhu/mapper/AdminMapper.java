package com.xhu.mapper;

import com.xhu.domain.entity.Admin;
import org.apache.ibatis.annotations.Mapper;



@Mapper
public interface AdminMapper {

    Admin selectByAccountAndPassword(Admin admin);

}
