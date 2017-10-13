package com.chandlertu.cucumber.checkout;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.zh_cn.����;
import cucumber.api.java.zh_cn.��;
import cucumber.api.java.zh_cn.��ô;

public class CheckoutSteps {
	int bananaPrice;
	Checkout checkout = new Checkout();

	@����("^\"([^\"]*)\"�ļ۸���(\\d+)Ԫһ��$")
	public void �ļ۸���_Ԫһ��(String name, int price) throws Exception {
		bananaPrice = price;
	}

	@��("^����(\\d+)��\"([^\"]*)\"$")
	public void ����_��(int count, String arg2) throws Exception {
		checkout.add(count, bananaPrice);
	}

	@��ô("^�ܼ���(\\d+)Ԫ$")
	public void �ܼ���_Ԫ(int total) throws Exception {
		assertEquals(total, checkout.total());
	}

	@��("^������(\\d+)��\"([^\"]*)\"$")
	public void ������_��(int count, String arg2) throws Exception {
		checkout.add(count, bananaPrice);
	}

}