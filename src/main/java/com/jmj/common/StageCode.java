package com.jmj.common;


/**
 * @author zliu
 * 上报阶段枚举
 * 	A01  预挂牌  
	A02  挂牌   
	A03  延牌
	A04  摘牌
	A05  撤牌
	A06  交易成交
	A07  交割
	A08  交易中止
	A09  交易恢复
	A10 交易终结
 */
public enum StageCode {
	
	/**
	 * 预挂牌
	 */
	A01 {
		public String getCode() {
			return "A01";
		}
	},
	/**
	 * 挂牌
	 */
	A02 {
		public String getCode() {
			return "A02";
		}
	},
	
	/**
	 * 延牌
	 */
	A03 {
		public String getCode() {
			return "A03";
		}
	},
	/**
	 * 摘牌
	 */
	A04{
		public String getCode() {
			return "A04";
		}
	},
	/**
	 * 撤牌
	 */
	A05 {
		public String getCode() {
			return "A05";
		}
	},
	/**
	 * 交易成交
	 */
	A06 {
		public String getCode() {
			return "A06";
		}
	},
	/**
	 * 交割
	 */
	A07 {
		public String getCode() {
			return "A07";
		}
	},
	/**
	 * 交易中止
	 */
	A08 {
		public String getCode() {
			return "A08";
		}
	},
	/**
	 * 交易恢复
	 */
	A09 {
		public String getCode() {
			return "A09";
		}
	},
	/**
	 * 交易终结
	 */
	A10{
		public String getCode() {
			return "A10";
		}
	},
	/**
	 * 预挂牌摘牌
	 */
	A11{
		public String getCode() {
			return "A11";
		}
	},
	/**
	 * 数据更新
	 */
	A99 {
		public String getCode() {
			return "A99";
		}
	};
	
	public abstract String getCode();
	
	public static boolean  contain(String key){
		for (StageCode stage : StageCode.values()) {
			if(stage.getCode().equals(key)){
				return true;
			}
		}
		return false;
	}
	
}
