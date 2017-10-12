package com.jmj.common;

public enum AuditType {
	/**
	 * 未审核*/
	NOT_AUDIT{
		public String getType(){
			return "1";
		}
	},
	/**
	 * 未通过*/
	NOT_THROUGH{
		public String getType(){
			return "2";
		}
	},
	/**
	 * 审核通过*/
	APPROVAL{
		public String getType(){
			return "3";
		}
	};
	public abstract String getType();
}
