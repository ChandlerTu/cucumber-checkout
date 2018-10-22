package com.chandlertu.cucumber.checkout;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.zh_cn.假设;
import cucumber.api.java.zh_cn.当;
import cucumber.api.java.zh_cn.那么;

public class CheckoutSteps {
	int bananaPrice;
	Checkout checkout = new Checkout();

	@假设("^\"([^\"]*)\"的价格是(\\d+)元一斤$")
	public void 的价格是_元一斤(String name, int price) throws Exception {
		bananaPrice = price;
	}

	@当("^我买(\\d+)斤\"([^\"]*)\"$")
	public void 我买_斤(int count, String arg2) throws Exception {
		checkout.add(count, bananaPrice);
	}

	@那么("^总价是(\\d+)元$")
	public void 总价是_元(int total) throws Exception {
		assertEquals(total, checkout.total());
	}

	@当("^又买了(\\d+)斤\"([^\"]*)\"$")
	public void 又买了_斤(int count, String arg2) throws Exception {
		checkout.add(count, bananaPrice);
	}

}