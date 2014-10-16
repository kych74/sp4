package org.thinker.txex.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

public interface TxExMapper {

	@Insert("insert into tbl_tx1 (num, codevalue) values (seq_tx.nextval, #{codeValue})")
	public void insertMain(String codeValue)throws Exception;
	
	@Insert("insert into tbl_tx22 (num, strValue) values (seq_tx.nextval, #{strValue})")
	public void insertSub(String strValue)throws Exception;
	
	@Update("update tbl_tx2 set strvalue = strvalue||#{appendValue} where num = #{num} ")
	public void update1(@Param("num") Integer num,  @Param("appendValue")String appendValue)throws Exception;
	
	
}
