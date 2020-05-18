package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.data.campaign.send response.
 * 
 * @author auto create
 * @since 1.0, 2020-04-23 13:06:14
 */
public class AlipayCommerceDataCampaignSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 2627742426266384128L;

	/** 
	 * 用户订阅消息状态，其中true：已订阅；false：未订阅；unknown：未知状态
	 */
	@ApiField("sub_status")
	private String subStatus;

	public void setSubStatus(String subStatus) {
		this.subStatus = subStatus;
	}
	public String getSubStatus( ) {
		return this.subStatus;
	}

}