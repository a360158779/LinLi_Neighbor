package com.cn.neighbors.login.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * TtWaybill entity. @author MyEclipse Persistence Tools
 */

public class TtWaybill implements java.io.Serializable {

	// Fields

	private String waybillId;
	private String waybillNo;
	private String sourceZoneCode;
	private String destZoneCode;
	private Boolean oneselfPickupFlg;
	private String consignorCompName;
	private String consignorAddr;
	private String consignorPhone;
	private String consignorContName;
	private String consignorMobile;
	private String addresseeCompName;
	private String addresseeAddr;
	private String addresseePhone;
	private String addresseeContName;
	private String addresseeMobile;
	private Double meterageWeightQty;
	private Double realWeightQty;
	private Double quantity;
	private Boolean freeParcelFlg;
	private Boolean innerParcelFlg;
	private Boolean frangibleParcelFlg;
	private Boolean trustParcelFlg;
	private Date preCustomsDt;
	private String consigneeEmpCode;
	private Date consignedTm;
	private String deliverEmpCode;
	private String subscriberName;
	private Date signinTm;
	private String waybillRemk;
	private String customsBatchs;
	private Boolean auditedFlg;
	private String inputerEmpCode;
	private Date inputTm;
	private String auditerEmpCode;
	private Date auditedTm;
	private String suppTypeCode;
	private String customsTypeCode;
	private String boxTypeCode;
	private Short versionNo;
	private String cargoTypeCode;
	private String limitTypeCode;
	private String distanceTypeCode;
	private String transportTypeCode;
	private String expressTypeCode;
	private Short lockVersionNo;
	private String inputedZoneCode;
	private String inputTypeCode;
	private Boolean needSignedBackFlg;
	private String signedBackWaybillNo;
	private String addresseeAddrNative;
	private String unifiedCode;
	private String modifiedEmpCode;
	private Date modifiedTm;
	private Boolean hasServiceProdFlg;
	private String ackbillTypeCode;
	private Double consValue;
	private Short otherNodeFlg;
	private String tbOrderNo;
	private String tbOrderType;
	private String freeTicketNo;
	private Boolean twinvoiceTypeCode;
	private Boolean selfSendFlg;
	private Double selfSendDiscount;
	private String hvalueBoxType;
	private Date syncTm;
	private Boolean importOrExport;
	private Boolean gatheringTypeCode;

	// Constructors

	/** default constructor */
	public TtWaybill() {
	}

	/** minimal constructor */
	public TtWaybill(Date inputTm) {
		this.inputTm = inputTm;
	}

	/** full constructor */
	public TtWaybill(String waybillNo, String sourceZoneCode,
			String destZoneCode, Boolean oneselfPickupFlg,
			String consignorCompName, String consignorAddr,
			String consignorPhone, String consignorContName,
			String consignorMobile, String addresseeCompName,
			String addresseeAddr, String addresseePhone,
			String addresseeContName, String addresseeMobile,
			Double meterageWeightQty, Double realWeightQty, Double quantity,
			Boolean freeParcelFlg, Boolean innerParcelFlg,
			Boolean frangibleParcelFlg, Boolean trustParcelFlg,
			Date preCustomsDt, String consigneeEmpCode, Date consignedTm,
			String deliverEmpCode, String subscriberName, Date signinTm,
			String waybillRemk, String customsBatchs, Boolean auditedFlg,
			String inputerEmpCode, Date inputTm, String auditerEmpCode,
			Date auditedTm, String suppTypeCode, String customsTypeCode,
			String boxTypeCode, Short versionNo, String cargoTypeCode,
			String limitTypeCode, String distanceTypeCode,
			String transportTypeCode, String expressTypeCode,
			Short lockVersionNo, String inputedZoneCode, String inputTypeCode,
			Boolean needSignedBackFlg, String signedBackWaybillNo,
			String addresseeAddrNative, String unifiedCode,
			String modifiedEmpCode, Date modifiedTm, Boolean hasServiceProdFlg,
			String ackbillTypeCode, Double consValue, Short otherNodeFlg,
			String tbOrderNo, String tbOrderType, String freeTicketNo,
			Boolean twinvoiceTypeCode, Boolean selfSendFlg,
			Double selfSendDiscount, String hvalueBoxType, Date syncTm,
			Boolean importOrExport, Boolean gatheringTypeCode) {
		this.waybillNo = waybillNo;
		this.sourceZoneCode = sourceZoneCode;
		this.destZoneCode = destZoneCode;
		this.oneselfPickupFlg = oneselfPickupFlg;
		this.consignorCompName = consignorCompName;
		this.consignorAddr = consignorAddr;
		this.consignorPhone = consignorPhone;
		this.consignorContName = consignorContName;
		this.consignorMobile = consignorMobile;
		this.addresseeCompName = addresseeCompName;
		this.addresseeAddr = addresseeAddr;
		this.addresseePhone = addresseePhone;
		this.addresseeContName = addresseeContName;
		this.addresseeMobile = addresseeMobile;
		this.meterageWeightQty = meterageWeightQty;
		this.realWeightQty = realWeightQty;
		this.quantity = quantity;
		this.freeParcelFlg = freeParcelFlg;
		this.innerParcelFlg = innerParcelFlg;
		this.frangibleParcelFlg = frangibleParcelFlg;
		this.trustParcelFlg = trustParcelFlg;
		this.preCustomsDt = preCustomsDt;
		this.consigneeEmpCode = consigneeEmpCode;
		this.consignedTm = consignedTm;
		this.deliverEmpCode = deliverEmpCode;
		this.subscriberName = subscriberName;
		this.signinTm = signinTm;
		this.waybillRemk = waybillRemk;
		this.customsBatchs = customsBatchs;
		this.auditedFlg = auditedFlg;
		this.inputerEmpCode = inputerEmpCode;
		this.inputTm = inputTm;
		this.auditerEmpCode = auditerEmpCode;
		this.auditedTm = auditedTm;
		this.suppTypeCode = suppTypeCode;
		this.customsTypeCode = customsTypeCode;
		this.boxTypeCode = boxTypeCode;
		this.versionNo = versionNo;
		this.cargoTypeCode = cargoTypeCode;
		this.limitTypeCode = limitTypeCode;
		this.distanceTypeCode = distanceTypeCode;
		this.transportTypeCode = transportTypeCode;
		this.expressTypeCode = expressTypeCode;
		this.lockVersionNo = lockVersionNo;
		this.inputedZoneCode = inputedZoneCode;
		this.inputTypeCode = inputTypeCode;
		this.needSignedBackFlg = needSignedBackFlg;
		this.signedBackWaybillNo = signedBackWaybillNo;
		this.addresseeAddrNative = addresseeAddrNative;
		this.unifiedCode = unifiedCode;
		this.modifiedEmpCode = modifiedEmpCode;
		this.modifiedTm = modifiedTm;
		this.hasServiceProdFlg = hasServiceProdFlg;
		this.ackbillTypeCode = ackbillTypeCode;
		this.consValue = consValue;
		this.otherNodeFlg = otherNodeFlg;
		this.tbOrderNo = tbOrderNo;
		this.tbOrderType = tbOrderType;
		this.freeTicketNo = freeTicketNo;
		this.twinvoiceTypeCode = twinvoiceTypeCode;
		this.selfSendFlg = selfSendFlg;
		this.selfSendDiscount = selfSendDiscount;
		this.hvalueBoxType = hvalueBoxType;
		this.syncTm = syncTm;
		this.importOrExport = importOrExport;
		this.gatheringTypeCode = gatheringTypeCode;
	}

	// Property accessors

	public String getWaybillId() {
		return this.waybillId;
	}

	public void setWaybillId(String waybillId) {
		this.waybillId = waybillId;
	}

	public String getWaybillNo() {
		return this.waybillNo;
	}

	public void setWaybillNo(String waybillNo) {
		this.waybillNo = waybillNo;
	}

	public String getSourceZoneCode() {
		return this.sourceZoneCode;
	}

	public void setSourceZoneCode(String sourceZoneCode) {
		this.sourceZoneCode = sourceZoneCode;
	}

	public String getDestZoneCode() {
		return this.destZoneCode;
	}

	public void setDestZoneCode(String destZoneCode) {
		this.destZoneCode = destZoneCode;
	}

	public Boolean getOneselfPickupFlg() {
		return this.oneselfPickupFlg;
	}

	public void setOneselfPickupFlg(Boolean oneselfPickupFlg) {
		this.oneselfPickupFlg = oneselfPickupFlg;
	}

	public String getConsignorCompName() {
		return this.consignorCompName;
	}

	public void setConsignorCompName(String consignorCompName) {
		this.consignorCompName = consignorCompName;
	}

	public String getConsignorAddr() {
		return this.consignorAddr;
	}

	public void setConsignorAddr(String consignorAddr) {
		this.consignorAddr = consignorAddr;
	}

	public String getConsignorPhone() {
		return this.consignorPhone;
	}

	public void setConsignorPhone(String consignorPhone) {
		this.consignorPhone = consignorPhone;
	}

	public String getConsignorContName() {
		return this.consignorContName;
	}

	public void setConsignorContName(String consignorContName) {
		this.consignorContName = consignorContName;
	}

	public String getConsignorMobile() {
		return this.consignorMobile;
	}

	public void setConsignorMobile(String consignorMobile) {
		this.consignorMobile = consignorMobile;
	}

	public String getAddresseeCompName() {
		return this.addresseeCompName;
	}

	public void setAddresseeCompName(String addresseeCompName) {
		this.addresseeCompName = addresseeCompName;
	}

	public String getAddresseeAddr() {
		return this.addresseeAddr;
	}

	public void setAddresseeAddr(String addresseeAddr) {
		this.addresseeAddr = addresseeAddr;
	}

	public String getAddresseePhone() {
		return this.addresseePhone;
	}

	public void setAddresseePhone(String addresseePhone) {
		this.addresseePhone = addresseePhone;
	}

	public String getAddresseeContName() {
		return this.addresseeContName;
	}

	public void setAddresseeContName(String addresseeContName) {
		this.addresseeContName = addresseeContName;
	}

	public String getAddresseeMobile() {
		return this.addresseeMobile;
	}

	public void setAddresseeMobile(String addresseeMobile) {
		this.addresseeMobile = addresseeMobile;
	}

	public Double getMeterageWeightQty() {
		return this.meterageWeightQty;
	}

	public void setMeterageWeightQty(Double meterageWeightQty) {
		this.meterageWeightQty = meterageWeightQty;
	}

	public Double getRealWeightQty() {
		return this.realWeightQty;
	}

	public void setRealWeightQty(Double realWeightQty) {
		this.realWeightQty = realWeightQty;
	}

	public Double getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public Boolean getFreeParcelFlg() {
		return this.freeParcelFlg;
	}

	public void setFreeParcelFlg(Boolean freeParcelFlg) {
		this.freeParcelFlg = freeParcelFlg;
	}

	public Boolean getInnerParcelFlg() {
		return this.innerParcelFlg;
	}

	public void setInnerParcelFlg(Boolean innerParcelFlg) {
		this.innerParcelFlg = innerParcelFlg;
	}

	public Boolean getFrangibleParcelFlg() {
		return this.frangibleParcelFlg;
	}

	public void setFrangibleParcelFlg(Boolean frangibleParcelFlg) {
		this.frangibleParcelFlg = frangibleParcelFlg;
	}

	public Boolean getTrustParcelFlg() {
		return this.trustParcelFlg;
	}

	public void setTrustParcelFlg(Boolean trustParcelFlg) {
		this.trustParcelFlg = trustParcelFlg;
	}

	public Date getPreCustomsDt() {
		return this.preCustomsDt;
	}

	public void setPreCustomsDt(Date preCustomsDt) {
		this.preCustomsDt = preCustomsDt;
	}

	public String getConsigneeEmpCode() {
		return this.consigneeEmpCode;
	}

	public void setConsigneeEmpCode(String consigneeEmpCode) {
		this.consigneeEmpCode = consigneeEmpCode;
	}

	public Date getConsignedTm() {
		return this.consignedTm;
	}

	public void setConsignedTm(Date consignedTm) {
		this.consignedTm = consignedTm;
	}

	public String getDeliverEmpCode() {
		return this.deliverEmpCode;
	}

	public void setDeliverEmpCode(String deliverEmpCode) {
		this.deliverEmpCode = deliverEmpCode;
	}

	public String getSubscriberName() {
		return this.subscriberName;
	}

	public void setSubscriberName(String subscriberName) {
		this.subscriberName = subscriberName;
	}

	public Date getSigninTm() {
		return this.signinTm;
	}

	public void setSigninTm(Date signinTm) {
		this.signinTm = signinTm;
	}

	public String getWaybillRemk() {
		return this.waybillRemk;
	}

	public void setWaybillRemk(String waybillRemk) {
		this.waybillRemk = waybillRemk;
	}

	public String getCustomsBatchs() {
		return this.customsBatchs;
	}

	public void setCustomsBatchs(String customsBatchs) {
		this.customsBatchs = customsBatchs;
	}

	public Boolean getAuditedFlg() {
		return this.auditedFlg;
	}

	public void setAuditedFlg(Boolean auditedFlg) {
		this.auditedFlg = auditedFlg;
	}

	public String getInputerEmpCode() {
		return this.inputerEmpCode;
	}

	public void setInputerEmpCode(String inputerEmpCode) {
		this.inputerEmpCode = inputerEmpCode;
	}

	public Date getInputTm() {
		return this.inputTm;
	}

	public void setInputTm(Date inputTm) {
		this.inputTm = inputTm;
	}

	public String getAuditerEmpCode() {
		return this.auditerEmpCode;
	}

	public void setAuditerEmpCode(String auditerEmpCode) {
		this.auditerEmpCode = auditerEmpCode;
	}

	public Date getAuditedTm() {
		return this.auditedTm;
	}

	public void setAuditedTm(Date auditedTm) {
		this.auditedTm = auditedTm;
	}

	public String getSuppTypeCode() {
		return this.suppTypeCode;
	}

	public void setSuppTypeCode(String suppTypeCode) {
		this.suppTypeCode = suppTypeCode;
	}

	public String getCustomsTypeCode() {
		return this.customsTypeCode;
	}

	public void setCustomsTypeCode(String customsTypeCode) {
		this.customsTypeCode = customsTypeCode;
	}

	public String getBoxTypeCode() {
		return this.boxTypeCode;
	}

	public void setBoxTypeCode(String boxTypeCode) {
		this.boxTypeCode = boxTypeCode;
	}

	public Short getVersionNo() {
		return this.versionNo;
	}

	public void setVersionNo(Short versionNo) {
		this.versionNo = versionNo;
	}

	public String getCargoTypeCode() {
		return this.cargoTypeCode;
	}

	public void setCargoTypeCode(String cargoTypeCode) {
		this.cargoTypeCode = cargoTypeCode;
	}

	public String getLimitTypeCode() {
		return this.limitTypeCode;
	}

	public void setLimitTypeCode(String limitTypeCode) {
		this.limitTypeCode = limitTypeCode;
	}

	public String getDistanceTypeCode() {
		return this.distanceTypeCode;
	}

	public void setDistanceTypeCode(String distanceTypeCode) {
		this.distanceTypeCode = distanceTypeCode;
	}

	public String getTransportTypeCode() {
		return this.transportTypeCode;
	}

	public void setTransportTypeCode(String transportTypeCode) {
		this.transportTypeCode = transportTypeCode;
	}

	public String getExpressTypeCode() {
		return this.expressTypeCode;
	}

	public void setExpressTypeCode(String expressTypeCode) {
		this.expressTypeCode = expressTypeCode;
	}

	public Short getLockVersionNo() {
		return this.lockVersionNo;
	}

	public void setLockVersionNo(Short lockVersionNo) {
		this.lockVersionNo = lockVersionNo;
	}

	public String getInputedZoneCode() {
		return this.inputedZoneCode;
	}

	public void setInputedZoneCode(String inputedZoneCode) {
		this.inputedZoneCode = inputedZoneCode;
	}

	public String getInputTypeCode() {
		return this.inputTypeCode;
	}

	public void setInputTypeCode(String inputTypeCode) {
		this.inputTypeCode = inputTypeCode;
	}

	public Boolean getNeedSignedBackFlg() {
		return this.needSignedBackFlg;
	}

	public void setNeedSignedBackFlg(Boolean needSignedBackFlg) {
		this.needSignedBackFlg = needSignedBackFlg;
	}

	public String getSignedBackWaybillNo() {
		return this.signedBackWaybillNo;
	}

	public void setSignedBackWaybillNo(String signedBackWaybillNo) {
		this.signedBackWaybillNo = signedBackWaybillNo;
	}

	public String getAddresseeAddrNative() {
		return this.addresseeAddrNative;
	}

	public void setAddresseeAddrNative(String addresseeAddrNative) {
		this.addresseeAddrNative = addresseeAddrNative;
	}

	public String getUnifiedCode() {
		return this.unifiedCode;
	}

	public void setUnifiedCode(String unifiedCode) {
		this.unifiedCode = unifiedCode;
	}

	public String getModifiedEmpCode() {
		return this.modifiedEmpCode;
	}

	public void setModifiedEmpCode(String modifiedEmpCode) {
		this.modifiedEmpCode = modifiedEmpCode;
	}

	public Date getModifiedTm() {
		return this.modifiedTm;
	}

	public void setModifiedTm(Date modifiedTm) {
		this.modifiedTm = modifiedTm;
	}

	public Boolean getHasServiceProdFlg() {
		return this.hasServiceProdFlg;
	}

	public void setHasServiceProdFlg(Boolean hasServiceProdFlg) {
		this.hasServiceProdFlg = hasServiceProdFlg;
	}

	public String getAckbillTypeCode() {
		return this.ackbillTypeCode;
	}

	public void setAckbillTypeCode(String ackbillTypeCode) {
		this.ackbillTypeCode = ackbillTypeCode;
	}

	public Double getConsValue() {
		return this.consValue;
	}

	public void setConsValue(Double consValue) {
		this.consValue = consValue;
	}

	public Short getOtherNodeFlg() {
		return this.otherNodeFlg;
	}

	public void setOtherNodeFlg(Short otherNodeFlg) {
		this.otherNodeFlg = otherNodeFlg;
	}

	public String getTbOrderNo() {
		return this.tbOrderNo;
	}

	public void setTbOrderNo(String tbOrderNo) {
		this.tbOrderNo = tbOrderNo;
	}

	public String getTbOrderType() {
		return this.tbOrderType;
	}

	public void setTbOrderType(String tbOrderType) {
		this.tbOrderType = tbOrderType;
	}

	public String getFreeTicketNo() {
		return this.freeTicketNo;
	}

	public void setFreeTicketNo(String freeTicketNo) {
		this.freeTicketNo = freeTicketNo;
	}

	public Boolean getTwinvoiceTypeCode() {
		return this.twinvoiceTypeCode;
	}

	public void setTwinvoiceTypeCode(Boolean twinvoiceTypeCode) {
		this.twinvoiceTypeCode = twinvoiceTypeCode;
	}

	public Boolean getSelfSendFlg() {
		return this.selfSendFlg;
	}

	public void setSelfSendFlg(Boolean selfSendFlg) {
		this.selfSendFlg = selfSendFlg;
	}

	public Double getSelfSendDiscount() {
		return this.selfSendDiscount;
	}

	public void setSelfSendDiscount(Double selfSendDiscount) {
		this.selfSendDiscount = selfSendDiscount;
	}

	public String getHvalueBoxType() {
		return this.hvalueBoxType;
	}

	public void setHvalueBoxType(String hvalueBoxType) {
		this.hvalueBoxType = hvalueBoxType;
	}

	public Date getSyncTm() {
		return this.syncTm;
	}

	public void setSyncTm(Date syncTm) {
		this.syncTm = syncTm;
	}

	public Boolean getImportOrExport() {
		return this.importOrExport;
	}

	public void setImportOrExport(Boolean importOrExport) {
		this.importOrExport = importOrExport;
	}

	public Boolean getGatheringTypeCode() {
		return this.gatheringTypeCode;
	}

	public void setGatheringTypeCode(Boolean gatheringTypeCode) {
		this.gatheringTypeCode = gatheringTypeCode;
	}

}