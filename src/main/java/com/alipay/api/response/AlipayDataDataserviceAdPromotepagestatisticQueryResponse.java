package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PromotePageStatistic;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.ad.promotepagestatistic.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-10-22 19:17:27
 */
public class AlipayDataDataserviceAdPromotepagestatisticQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2478353426955383776L;

	/** 
	 * 留资统计列表
	 */
	@ApiListField("collectinfo_list")
	@ApiField("promote_page_statistic")
	private List<PromotePageStatistic> collectinfoList;

	public void setCollectinfoList(List<PromotePageStatistic> collectinfoList) {
		this.collectinfoList = collectinfoList;
	}
	public List<PromotePageStatistic> getCollectinfoList( ) {
		return this.collectinfoList;
	}

}
