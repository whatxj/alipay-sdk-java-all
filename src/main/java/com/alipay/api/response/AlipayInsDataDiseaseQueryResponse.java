package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DiseaseDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.data.disease.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-10-11 14:40:42
 */
public class AlipayInsDataDiseaseQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7485923986723434931L;

	/** 
	 * 匹配的疾病
	 */
	@ApiListField("disease_list")
	@ApiField("disease_d_t_o")
	private List<DiseaseDTO> diseaseList;

	public void setDiseaseList(List<DiseaseDTO> diseaseList) {
		this.diseaseList = diseaseList;
	}
	public List<DiseaseDTO> getDiseaseList( ) {
		return this.diseaseList;
	}

}
