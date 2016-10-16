package com.aim.duty.duty_market_entity;

import com.aim.duty.duty_base.entity.base.GameEntity;
import com.google.protobuf.ByteString;

public class Commodity extends GameEntity {
	/**单价*/
	private int singlePrice;
	private byte salePropType;
	private int saleNum;
	private String saleName;
//	private AbstractProp saleProp;
	private ByteString salePropData;

	@Override
	public boolean isChange() {
		return true;
	}

	public int getSinglePrice() {
		return singlePrice;
	}

	public void setSinglePrice(int singlePrice) {
		this.singlePrice = singlePrice;
	}

	public byte getSalePropType() {
		return salePropType;
	}

	public void setSalePropType(byte salePropType) {
		this.salePropType = salePropType;
	}

	public ByteString getSalePropData() {
//		this.salePropData = saleProp.serialize();
		return salePropData;
	}

	public void setSalePropData(ByteString salePropData) {
		this.salePropData = salePropData;
	}

//	public AbstractProp getSaleProp() {
//		return saleProp;
//	}
//
//	public void setSaleProp(AbstractProp saleProp) {
//		this.saleProp = saleProp;
//	}

	public int getSaleNum() {
		return saleNum;
	}

	public void setSaleNum(int saleNum) {
		this.saleNum = saleNum;
	}

	public String getSaleName() {
		return saleName;
	}

	public void setSaleName(String saleName) {
		this.saleName = saleName;
	}

}
