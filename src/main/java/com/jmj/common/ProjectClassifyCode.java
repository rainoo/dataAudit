package com.jmj.common;
/**
 * 品类枚举
 * @author zliu
 *
 */
public enum ProjectClassifyCode {
	/**
	 *  实物资产
	 */
	entity {
		public String getCode() {
			return "C01";
		}
	},
	/**
	 * 产股权
	 */
	property {
		public String getCode() {
			return "C02";
		}
	},
	/**
	 * 增资扩股
	 */
	capital{
		public String getCode(){
			return "C03";
		}
	};
	
	public abstract String getCode();
}
