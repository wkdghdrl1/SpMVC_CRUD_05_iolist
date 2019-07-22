package com.biz.iolist.mapper;

import org.apache.ibatis.jdbc.SQL;

public class IolistSQL {
	
	public String iolist_insert_sql() {
		SQL sql = new SQL();
		sql.INSERT_INTO("tbl_iolist");
		sql.INTO_COLUMNS("io_seq").INTO_VALUES("#{SEQ_IOLIST.NEXTVAL, jdbctype=INTEGER}");
		sql.INTO_COLUMNS("io_date").INTO_VALUES("#{io_date,jdbctype=VARCHAR}");
		sql.INTO_COLUMNS("io_pcode").INTO_VALUES("#{io_pcode,jdbctype=VARCHAR}");
		sql.INTO_COLUMNS("io_ccode").INTO_VALUES("#{io_ccode,jdbctype=VARCHAR}");
		sql.INTO_COLUMNS("io_inout").INTO_VALUES("#{io_input,jdbctype=VARCHAR}");
		sql.INTO_COLUMNS("io_qty").INTO_VALUES("#{io_qty,jdbctype=INTEGER}");
		sql.INTO_COLUMNS("io_price").INTO_VALUES("#{io_price,jdbctype=INTEGER}");
		sql.INTO_COLUMNS("io_total").INTO_VALUES("#{io_total,jdbctype=INTEGER}");
		
		return sql.toString();
	}
	
	public String iolist_update_sql() {
		// build pattern 방ㅇ식의 코드
		SQL sql = new SQL()
		.UPDATE("tbl_iolist")
		.SET("io_seq = #{io_seq}")
		.SET("io_date = #{io_date}")
		.SET("io_pcode = #{io_pcode}")
		.SET("io_ccode = #{io_ccode}")
		.SET("io_inout = #{io_input}")
		.SET("io_qty = #{io_qty}")
		.SET("io_price = #{io_price}")
		.SET("io_total = #{io_total}");
		
		
		return sql.toString();
	}
	
}
