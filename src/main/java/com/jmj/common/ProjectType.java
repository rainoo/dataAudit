package com.jmj.common;

public enum ProjectType {
	/**
	 * 实物资产
	 * */
	PHYSICAL_ASSETS{
		public String getType(){
			return "C01";
		}
	},
	/**
	 * 产股权
	 * */
	EQUITY_PRODUCTION{
		public String getType(){
			return "C02";
		}
	},
	/**
	 * 增资扩股
	 * */
	INCREASE_INVESTMENT{
		public String getType(){
			return "C03";
		}
	},
	/**
	 * 金融资产
	 * */
	FINANCIAL_ASSETS{
		public String getType(){
			return "FINANCIAL_ASSETS";
		}
	},
	/**
	 * 涉诉资产
	 * */
	LITIGATION_ASSETS{
		public String getType(){
			return "LITIGATION_ASSETS";
		}
	},
	/**
	 * 环境权益
	 * */
	ENVIRONMENTAL{
		public String getType(){
			return "ENVIRONMENTAL";
		}
	},
	/**
	 * 技术产权
	 * */
	TECHNOLOGICAL{
		public String getType(){
			return "TECHNOLOGICAL";
		}
	},
	/**
	 * 融资服务
	 * */
	FINANCING_SERVER{
		public String getType(){
			return "FINANCING_SERVER";
		}
	},
	/**
	 * 文化产权
	 * */
	CULTURAL{
		public String getType(){
			return "CULTURAL";
		}
	},
	/**
	 * 林权
	 * */
	FOREST_OWNERSHIP{
		public String getType(){
			return "FOREST_OWNERSHIP";
		}
	},
	/**
	 * 矿权
	 * */
	MINERAL_RIGHTS{
		public String getType(){
			return "MINERAL_RIGHTS";
		}
	},
	/**
	 * 农村产权
	 * */
	RURAL_PROPERTY{
		public String getType(){
			return "RURAL_PROPERTY";
		}
	};
	
	public abstract String getType();

}
