package com.hi;

import org.apache.ibatis.annotations.*;

import java.util.ArrayList;
@Mapper
public interface MemberDao {
    //由名字搜索会员
    @Select("select * from membermain where membername = #{name}")
    public ArrayList<Member> findUserByName(@Param("name")String name);
    //搜索全部会员
    @Select("select * from membermain")
    public ArrayList<Member> findUserAll();
    //由id搜索会员
    @Select({"select * from membermain where id = #{id}"})
    public Member findUserById(Long id);
    //由会员账号搜索会员
    @Select({"select * from membermain where memberno = #{name}"})
    public Member findUserByMemberNo(String memberno);
    //新建会员
    @Insert("insert into membermain(membername,memberbrithday,memmberno,password,phonenumber,createdate,enddate,qqno,email) values("
    +"#{member.membername},#{member.memberbrithday},#{member.memmberno},#{member.password},#{member.phonenumber},#{member.createdate},#{member.enddate},#{member.qqno},#{member.email})")
        @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=int.class)
    public Long save(@Param("member")Member member);

   // @UpdateProvider(type = MemberUpdate.class, method = "update")
    //@SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="member.id", before=false, resultType=int.class)
    //public Long update(@Param("member")Member member);
}
