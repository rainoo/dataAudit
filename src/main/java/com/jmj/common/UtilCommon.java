package com.jmj.common;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 校验类
 * @author jthao
 */
public class UtilCommon {
	
	/**
	 * 判断字符串是否为空（T不为空-F为空）
	 * @param str
	 * @return
	 */
	public static boolean strNotNull(String str) {
		return str != null && str != "null" && !str.isEmpty();
	}
	
	/**
	 * 判断对象是否为空（T不为空-F为空）
	 * @param str
	 * @return
	 */
	public static boolean objectNotNull(Object obj) {
		return obj != null && !"null".equals(obj) && !"".equals(obj);
	}
	
	/**
	 * 判断集合是否为空（T不为空-F为空）
	 * @param str
	 * @return
	 */
	public static boolean listNotNull(List<?> list) {
		return null != list && list.size() > 0;
	}
	
	/**
	 * 判断Double类型是否为空
	 * @param double
	 * @return
	 */
	public static boolean doubleNotNull(Double d) {
		return null != d ;
	}
	
	/**
	 * 判断BigDecimal类型是否为空
	 * @param b
	 * @return
	 */
	public static boolean bigDecimalNotNull(BigDecimal b) {
		return null != b ;
	}
	
	/**
	 * 判断BigDecimal类型是否为空
	 * @param b
	 * @return
	 */
	public static boolean integerNotNull(Integer i) {
		return null != i ;
	}
	
	/**
	 * 日期格式化
	 * @param b
	 * @return
	 */
	public static String dateFormater(Date d,String type) {
		SimpleDateFormat dateFormater = null;
		if(d == null){
			return "";
		}else{
			if("1".equals(type)){
				dateFormater = new SimpleDateFormat("yyyy-MM-dd");
			}else if("2".equals(type)){
				dateFormater = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			}else if("3".equals(type)){
				dateFormater = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss S");
			}else{
				dateFormater = new SimpleDateFormat("yyyy-MM-dd");
			}
		}
		return dateFormater.format(d);
	}
	
}
