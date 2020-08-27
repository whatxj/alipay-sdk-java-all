package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 撤销缴费接口
 *
 * @author auto create
 * @since 1.0, 2020-08-19 20:32:23
 */
public class AlipayOverseasTransferPaymentCancelModel extends AlipayObject {

	private static final long serialVersionUID = 2291352472583753998L;

	/**
	 * Cancelation reason
	 */
	@ApiField("cancel_reason")
	private String cancelReason;

	/**
	 * 扩展字段
	 */
	@ApiField("pass_through_info")
	private String passThroughInfo;

	/**
	 * 发端机构
	 */
	@ApiField("payer_agent_id")
	private String payerAgentId;

	/**
	 * AC请求单号
	 */
	@ApiField("transfer_request_id")
	private String transferRequestId;

	public String getCancelReason() {
		return this.cancelReason;
	}
	public void setCancelReason(String cancelReason) {
		this.cancelReason = cancelReason;
	}

	public String getPassThroughInfo() {
		return this.passThroughInfo;
	}
	public void setPassThroughInfo(String passThroughInfo) {
		this.passThroughInfo = passThroughInfo;
	}

	public String getPayerAgentId() {
		return this.payerAgentId;
	}
	public void setPayerAgentId(String payerAgentId) {
		this.payerAgentId = payerAgentId;
	}

	public String getTransferRequestId() {
		return this.transferRequestId;
	}
	public void setTransferRequestId(String transferRequestId) {
		this.transferRequestId = transferRequestId;
	}

}