package com.showtimer.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class OrdersNoUtil {
	public static OrdersNoUtil getMath = new OrdersNoUtil();

	public static OrdersNoUtil getInstace() {
		return getMath;
	}

	public String getMasNumber() {
		SimpleDateFormat dFormat = new SimpleDateFormat("yyyyMMdd");
		String number = dFormat.format(new Date());
		return number
				+ Integer
						.toString((int) (Math.random() * (9999 - 1000 + 1)) + 1000);
	}

	/**
	 * 门店的订单号 门店订单展现形式：MD（门店首字母）+20170810（日期）+XXXX（随机生成四位数字）。
	 * 
	 * @return
	 */
	public String getMDNumberNo() {
		return "MD" + getMasNumber();
	}

	/**
	 * 总代大订单号 总代大订单展现形式：ZD（门店首字母）+20170810（日期）+XXXX（随机生成四位数字）。
	 * 
	 * @return
	 */
	public String getZDNumberNo() {
		return "ZD" + getMasNumber();
	}

	/**
	 * 散客订单展现形式：SK（门店首字母）+20170810（日期）+XXXX（随机生成四位数字）。
	 * 
	 * @return
	 */
	public String getSKNumberNo() {
		return "SK" + getMasNumber();
	}

}
