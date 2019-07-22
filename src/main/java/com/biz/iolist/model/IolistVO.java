package com.biz.iolist.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

// @Data
public class IolistVO {
	
	private long io_seq; //	NUMBER
	private String io_date;	//VARCHAR2(10)
	private String io_product;	//NVARCHAR2(50)
	private String io_comp;	//NVARCHAR2(50)
	private String io_comp_ceo;	//NVARCHAR2(50)
	private String io_inout;	//NVARCHAR2(10)
	private int io_qty;	//NUMBER
	private int io_price;	//NUMBER
	private int io_total;	//NUMBER

	
}
