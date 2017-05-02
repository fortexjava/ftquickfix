
package quickfix.fix50sp2;

import quickfix.FieldNotFound;

import quickfix.Group;

public class DerivativeSecurityList extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "AA";
	

	public DerivativeSecurityList() {
		super();
		getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
	}
	
	public void set(quickfix.fix50sp2.component.ApplicationSequenceControl component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.ApplicationSequenceControl get(quickfix.fix50sp2.component.ApplicationSequenceControl component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.ApplicationSequenceControl getApplicationSequenceControl() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.ApplicationSequenceControl());
	}

	public void set(quickfix.field.ApplID value) {
		setField(value);
	}

	public quickfix.field.ApplID get(quickfix.field.ApplID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ApplID getApplID() throws FieldNotFound {
		return get(new quickfix.field.ApplID());
	}

	public boolean isSet(quickfix.field.ApplID field) {
		return isSetField(field);
	}

	public boolean isSetApplID() {
		return isSetField(1180);
	}

	public void set(quickfix.field.ApplSeqNum value) {
		setField(value);
	}

	public quickfix.field.ApplSeqNum get(quickfix.field.ApplSeqNum value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ApplSeqNum getApplSeqNum() throws FieldNotFound {
		return get(new quickfix.field.ApplSeqNum());
	}

	public boolean isSet(quickfix.field.ApplSeqNum field) {
		return isSetField(field);
	}

	public boolean isSetApplSeqNum() {
		return isSetField(1181);
	}

	public void set(quickfix.field.ApplLastSeqNum value) {
		setField(value);
	}

	public quickfix.field.ApplLastSeqNum get(quickfix.field.ApplLastSeqNum value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ApplLastSeqNum getApplLastSeqNum() throws FieldNotFound {
		return get(new quickfix.field.ApplLastSeqNum());
	}

	public boolean isSet(quickfix.field.ApplLastSeqNum field) {
		return isSetField(field);
	}

	public boolean isSetApplLastSeqNum() {
		return isSetField(1350);
	}

	public void set(quickfix.field.ApplResendFlag value) {
		setField(value);
	}

	public quickfix.field.ApplResendFlag get(quickfix.field.ApplResendFlag value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ApplResendFlag getApplResendFlag() throws FieldNotFound {
		return get(new quickfix.field.ApplResendFlag());
	}

	public boolean isSet(quickfix.field.ApplResendFlag field) {
		return isSetField(field);
	}

	public boolean isSetApplResendFlag() {
		return isSetField(1352);
	}

	public void set(quickfix.field.SecurityReportID value) {
		setField(value);
	}

	public quickfix.field.SecurityReportID get(quickfix.field.SecurityReportID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecurityReportID getSecurityReportID() throws FieldNotFound {
		return get(new quickfix.field.SecurityReportID());
	}

	public boolean isSet(quickfix.field.SecurityReportID field) {
		return isSetField(field);
	}

	public boolean isSetSecurityReportID() {
		return isSetField(964);
	}

	public void set(quickfix.field.SecurityReqID value) {
		setField(value);
	}

	public quickfix.field.SecurityReqID get(quickfix.field.SecurityReqID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecurityReqID getSecurityReqID() throws FieldNotFound {
		return get(new quickfix.field.SecurityReqID());
	}

	public boolean isSet(quickfix.field.SecurityReqID field) {
		return isSetField(field);
	}

	public boolean isSetSecurityReqID() {
		return isSetField(320);
	}

	public void set(quickfix.field.SecurityResponseID value) {
		setField(value);
	}

	public quickfix.field.SecurityResponseID get(quickfix.field.SecurityResponseID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecurityResponseID getSecurityResponseID() throws FieldNotFound {
		return get(new quickfix.field.SecurityResponseID());
	}

	public boolean isSet(quickfix.field.SecurityResponseID field) {
		return isSetField(field);
	}

	public boolean isSetSecurityResponseID() {
		return isSetField(322);
	}

	public void set(quickfix.field.SecurityRequestResult value) {
		setField(value);
	}

	public quickfix.field.SecurityRequestResult get(quickfix.field.SecurityRequestResult value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecurityRequestResult getSecurityRequestResult() throws FieldNotFound {
		return get(new quickfix.field.SecurityRequestResult());
	}

	public boolean isSet(quickfix.field.SecurityRequestResult field) {
		return isSetField(field);
	}

	public boolean isSetSecurityRequestResult() {
		return isSetField(560);
	}

	public void set(quickfix.field.ClearingBusinessDate value) {
		setField(value);
	}

	public quickfix.field.ClearingBusinessDate get(quickfix.field.ClearingBusinessDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ClearingBusinessDate getClearingBusinessDate() throws FieldNotFound {
		return get(new quickfix.field.ClearingBusinessDate());
	}

	public boolean isSet(quickfix.field.ClearingBusinessDate field) {
		return isSetField(field);
	}

	public boolean isSetClearingBusinessDate() {
		return isSetField(715);
	}

	public void set(quickfix.fix50sp2.component.UnderlyingInstrument component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.UnderlyingInstrument get(quickfix.fix50sp2.component.UnderlyingInstrument component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.UnderlyingInstrument getUnderlyingInstrument() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.UnderlyingInstrument());
	}

	public void set(quickfix.field.UnderlyingSymbol value) {
		setField(value);
	}

	public quickfix.field.UnderlyingSymbol get(quickfix.field.UnderlyingSymbol value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingSymbol getUnderlyingSymbol() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingSymbol());
	}

	public boolean isSet(quickfix.field.UnderlyingSymbol field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSymbol() {
		return isSetField(311);
	}

	public void set(quickfix.field.UnderlyingSymbolSfx value) {
		setField(value);
	}

	public quickfix.field.UnderlyingSymbolSfx get(quickfix.field.UnderlyingSymbolSfx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingSymbolSfx getUnderlyingSymbolSfx() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingSymbolSfx());
	}

	public boolean isSet(quickfix.field.UnderlyingSymbolSfx field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSymbolSfx() {
		return isSetField(312);
	}

	public void set(quickfix.field.UnderlyingSecurityID value) {
		setField(value);
	}

	public quickfix.field.UnderlyingSecurityID get(quickfix.field.UnderlyingSecurityID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingSecurityID getUnderlyingSecurityID() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingSecurityID());
	}

	public boolean isSet(quickfix.field.UnderlyingSecurityID field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSecurityID() {
		return isSetField(309);
	}

	public void set(quickfix.field.UnderlyingSecurityIDSource value) {
		setField(value);
	}

	public quickfix.field.UnderlyingSecurityIDSource get(quickfix.field.UnderlyingSecurityIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingSecurityIDSource getUnderlyingSecurityIDSource() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingSecurityIDSource());
	}

	public boolean isSet(quickfix.field.UnderlyingSecurityIDSource field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSecurityIDSource() {
		return isSetField(305);
	}

	public void set(quickfix.fix50sp2.component.UndSecAltIDGrp component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.UndSecAltIDGrp get(quickfix.fix50sp2.component.UndSecAltIDGrp component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.UndSecAltIDGrp getUndSecAltIDGrp() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.UndSecAltIDGrp());
	}

	public void set(quickfix.field.NoUnderlyingSecurityAltID value) {
		setField(value);
	}

	public quickfix.field.NoUnderlyingSecurityAltID get(quickfix.field.NoUnderlyingSecurityAltID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoUnderlyingSecurityAltID getNoUnderlyingSecurityAltID() throws FieldNotFound {
		return get(new quickfix.field.NoUnderlyingSecurityAltID());
	}

	public boolean isSet(quickfix.field.NoUnderlyingSecurityAltID field) {
		return isSetField(field);
	}

	public boolean isSetNoUnderlyingSecurityAltID() {
		return isSetField(457);
	}

	public static class NoUnderlyingSecurityAltID extends Group {

		static final long serialVersionUID = 20050617;

		public NoUnderlyingSecurityAltID() {
			super(457, 458,
				new int[] {458, 459,  0 });
		}
		
	public void set(quickfix.field.UnderlyingSecurityAltID value) {
		setField(value);
	}

	public quickfix.field.UnderlyingSecurityAltID get(quickfix.field.UnderlyingSecurityAltID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingSecurityAltID getUnderlyingSecurityAltID() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingSecurityAltID());
	}

	public boolean isSet(quickfix.field.UnderlyingSecurityAltID field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSecurityAltID() {
		return isSetField(458);
	}

	public void set(quickfix.field.UnderlyingSecurityAltIDSource value) {
		setField(value);
	}

	public quickfix.field.UnderlyingSecurityAltIDSource get(quickfix.field.UnderlyingSecurityAltIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingSecurityAltIDSource getUnderlyingSecurityAltIDSource() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingSecurityAltIDSource());
	}

	public boolean isSet(quickfix.field.UnderlyingSecurityAltIDSource field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSecurityAltIDSource() {
		return isSetField(459);
	}

	}

	public void set(quickfix.field.UnderlyingProduct value) {
		setField(value);
	}

	public quickfix.field.UnderlyingProduct get(quickfix.field.UnderlyingProduct value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingProduct getUnderlyingProduct() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingProduct());
	}

	public boolean isSet(quickfix.field.UnderlyingProduct field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingProduct() {
		return isSetField(462);
	}

	public void set(quickfix.field.UnderlyingCFICode value) {
		setField(value);
	}

	public quickfix.field.UnderlyingCFICode get(quickfix.field.UnderlyingCFICode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingCFICode getUnderlyingCFICode() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingCFICode());
	}

	public boolean isSet(quickfix.field.UnderlyingCFICode field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCFICode() {
		return isSetField(463);
	}

	public void set(quickfix.field.UnderlyingSecurityType value) {
		setField(value);
	}

	public quickfix.field.UnderlyingSecurityType get(quickfix.field.UnderlyingSecurityType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingSecurityType getUnderlyingSecurityType() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingSecurityType());
	}

	public boolean isSet(quickfix.field.UnderlyingSecurityType field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSecurityType() {
		return isSetField(310);
	}

	public void set(quickfix.field.UnderlyingSecuritySubType value) {
		setField(value);
	}

	public quickfix.field.UnderlyingSecuritySubType get(quickfix.field.UnderlyingSecuritySubType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingSecuritySubType getUnderlyingSecuritySubType() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingSecuritySubType());
	}

	public boolean isSet(quickfix.field.UnderlyingSecuritySubType field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSecuritySubType() {
		return isSetField(763);
	}

	public void set(quickfix.field.UnderlyingMaturityMonthYear value) {
		setField(value);
	}

	public quickfix.field.UnderlyingMaturityMonthYear get(quickfix.field.UnderlyingMaturityMonthYear value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingMaturityMonthYear getUnderlyingMaturityMonthYear() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingMaturityMonthYear());
	}

	public boolean isSet(quickfix.field.UnderlyingMaturityMonthYear field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingMaturityMonthYear() {
		return isSetField(313);
	}

	public void set(quickfix.field.UnderlyingMaturityDate value) {
		setField(value);
	}

	public quickfix.field.UnderlyingMaturityDate get(quickfix.field.UnderlyingMaturityDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingMaturityDate getUnderlyingMaturityDate() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingMaturityDate());
	}

	public boolean isSet(quickfix.field.UnderlyingMaturityDate field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingMaturityDate() {
		return isSetField(542);
	}

	public void set(quickfix.field.UnderlyingMaturityTime value) {
		setField(value);
	}

	public quickfix.field.UnderlyingMaturityTime get(quickfix.field.UnderlyingMaturityTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingMaturityTime getUnderlyingMaturityTime() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingMaturityTime());
	}

	public boolean isSet(quickfix.field.UnderlyingMaturityTime field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingMaturityTime() {
		return isSetField(1213);
	}

	public void set(quickfix.field.UnderlyingCouponPaymentDate value) {
		setField(value);
	}

	public quickfix.field.UnderlyingCouponPaymentDate get(quickfix.field.UnderlyingCouponPaymentDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingCouponPaymentDate getUnderlyingCouponPaymentDate() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingCouponPaymentDate());
	}

	public boolean isSet(quickfix.field.UnderlyingCouponPaymentDate field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCouponPaymentDate() {
		return isSetField(241);
	}

	public void set(quickfix.field.UnderlyingRestructuringType value) {
		setField(value);
	}

	public quickfix.field.UnderlyingRestructuringType get(quickfix.field.UnderlyingRestructuringType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingRestructuringType getUnderlyingRestructuringType() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingRestructuringType());
	}

	public boolean isSet(quickfix.field.UnderlyingRestructuringType field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingRestructuringType() {
		return isSetField(1453);
	}

	public void set(quickfix.field.UnderlyingSeniority value) {
		setField(value);
	}

	public quickfix.field.UnderlyingSeniority get(quickfix.field.UnderlyingSeniority value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingSeniority getUnderlyingSeniority() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingSeniority());
	}

	public boolean isSet(quickfix.field.UnderlyingSeniority field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSeniority() {
		return isSetField(1454);
	}

	public void set(quickfix.field.UnderlyingNotionalPercentageOutstanding value) {
		setField(value);
	}

	public quickfix.field.UnderlyingNotionalPercentageOutstanding get(quickfix.field.UnderlyingNotionalPercentageOutstanding value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingNotionalPercentageOutstanding getUnderlyingNotionalPercentageOutstanding() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingNotionalPercentageOutstanding());
	}

	public boolean isSet(quickfix.field.UnderlyingNotionalPercentageOutstanding field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingNotionalPercentageOutstanding() {
		return isSetField(1455);
	}

	public void set(quickfix.field.UnderlyingOriginalNotionalPercentageOutstanding value) {
		setField(value);
	}

	public quickfix.field.UnderlyingOriginalNotionalPercentageOutstanding get(quickfix.field.UnderlyingOriginalNotionalPercentageOutstanding value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingOriginalNotionalPercentageOutstanding getUnderlyingOriginalNotionalPercentageOutstanding() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingOriginalNotionalPercentageOutstanding());
	}

	public boolean isSet(quickfix.field.UnderlyingOriginalNotionalPercentageOutstanding field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingOriginalNotionalPercentageOutstanding() {
		return isSetField(1456);
	}

	public void set(quickfix.field.UnderlyingAttachmentPoint value) {
		setField(value);
	}

	public quickfix.field.UnderlyingAttachmentPoint get(quickfix.field.UnderlyingAttachmentPoint value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingAttachmentPoint getUnderlyingAttachmentPoint() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingAttachmentPoint());
	}

	public boolean isSet(quickfix.field.UnderlyingAttachmentPoint field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingAttachmentPoint() {
		return isSetField(1459);
	}

	public void set(quickfix.field.UnderlyingDetachmentPoint value) {
		setField(value);
	}

	public quickfix.field.UnderlyingDetachmentPoint get(quickfix.field.UnderlyingDetachmentPoint value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingDetachmentPoint getUnderlyingDetachmentPoint() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingDetachmentPoint());
	}

	public boolean isSet(quickfix.field.UnderlyingDetachmentPoint field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingDetachmentPoint() {
		return isSetField(1460);
	}

	public void set(quickfix.field.UnderlyingIssueDate value) {
		setField(value);
	}

	public quickfix.field.UnderlyingIssueDate get(quickfix.field.UnderlyingIssueDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingIssueDate getUnderlyingIssueDate() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingIssueDate());
	}

	public boolean isSet(quickfix.field.UnderlyingIssueDate field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingIssueDate() {
		return isSetField(242);
	}

	public void set(quickfix.field.UnderlyingRepoCollateralSecurityType value) {
		setField(value);
	}

	public quickfix.field.UnderlyingRepoCollateralSecurityType get(quickfix.field.UnderlyingRepoCollateralSecurityType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingRepoCollateralSecurityType getUnderlyingRepoCollateralSecurityType() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingRepoCollateralSecurityType());
	}

	public boolean isSet(quickfix.field.UnderlyingRepoCollateralSecurityType field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingRepoCollateralSecurityType() {
		return isSetField(243);
	}

	public void set(quickfix.field.UnderlyingRepurchaseTerm value) {
		setField(value);
	}

	public quickfix.field.UnderlyingRepurchaseTerm get(quickfix.field.UnderlyingRepurchaseTerm value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingRepurchaseTerm getUnderlyingRepurchaseTerm() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingRepurchaseTerm());
	}

	public boolean isSet(quickfix.field.UnderlyingRepurchaseTerm field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingRepurchaseTerm() {
		return isSetField(244);
	}

	public void set(quickfix.field.UnderlyingRepurchaseRate value) {
		setField(value);
	}

	public quickfix.field.UnderlyingRepurchaseRate get(quickfix.field.UnderlyingRepurchaseRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingRepurchaseRate getUnderlyingRepurchaseRate() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingRepurchaseRate());
	}

	public boolean isSet(quickfix.field.UnderlyingRepurchaseRate field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingRepurchaseRate() {
		return isSetField(245);
	}

	public void set(quickfix.field.UnderlyingFactor value) {
		setField(value);
	}

	public quickfix.field.UnderlyingFactor get(quickfix.field.UnderlyingFactor value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingFactor getUnderlyingFactor() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingFactor());
	}

	public boolean isSet(quickfix.field.UnderlyingFactor field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingFactor() {
		return isSetField(246);
	}

	public void set(quickfix.field.UnderlyingCreditRating value) {
		setField(value);
	}

	public quickfix.field.UnderlyingCreditRating get(quickfix.field.UnderlyingCreditRating value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingCreditRating getUnderlyingCreditRating() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingCreditRating());
	}

	public boolean isSet(quickfix.field.UnderlyingCreditRating field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCreditRating() {
		return isSetField(256);
	}

	public void set(quickfix.field.UnderlyingInstrRegistry value) {
		setField(value);
	}

	public quickfix.field.UnderlyingInstrRegistry get(quickfix.field.UnderlyingInstrRegistry value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingInstrRegistry getUnderlyingInstrRegistry() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingInstrRegistry());
	}

	public boolean isSet(quickfix.field.UnderlyingInstrRegistry field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingInstrRegistry() {
		return isSetField(595);
	}

	public void set(quickfix.field.UnderlyingCountryOfIssue value) {
		setField(value);
	}

	public quickfix.field.UnderlyingCountryOfIssue get(quickfix.field.UnderlyingCountryOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingCountryOfIssue getUnderlyingCountryOfIssue() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingCountryOfIssue());
	}

	public boolean isSet(quickfix.field.UnderlyingCountryOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCountryOfIssue() {
		return isSetField(592);
	}

	public void set(quickfix.field.UnderlyingStateOrProvinceOfIssue value) {
		setField(value);
	}

	public quickfix.field.UnderlyingStateOrProvinceOfIssue get(quickfix.field.UnderlyingStateOrProvinceOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingStateOrProvinceOfIssue getUnderlyingStateOrProvinceOfIssue() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingStateOrProvinceOfIssue());
	}

	public boolean isSet(quickfix.field.UnderlyingStateOrProvinceOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingStateOrProvinceOfIssue() {
		return isSetField(593);
	}

	public void set(quickfix.field.UnderlyingLocaleOfIssue value) {
		setField(value);
	}

	public quickfix.field.UnderlyingLocaleOfIssue get(quickfix.field.UnderlyingLocaleOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingLocaleOfIssue getUnderlyingLocaleOfIssue() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingLocaleOfIssue());
	}

	public boolean isSet(quickfix.field.UnderlyingLocaleOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingLocaleOfIssue() {
		return isSetField(594);
	}

	public void set(quickfix.field.UnderlyingRedemptionDate value) {
		setField(value);
	}

	public quickfix.field.UnderlyingRedemptionDate get(quickfix.field.UnderlyingRedemptionDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingRedemptionDate getUnderlyingRedemptionDate() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingRedemptionDate());
	}

	public boolean isSet(quickfix.field.UnderlyingRedemptionDate field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingRedemptionDate() {
		return isSetField(247);
	}

	public void set(quickfix.field.UnderlyingStrikePrice value) {
		setField(value);
	}

	public quickfix.field.UnderlyingStrikePrice get(quickfix.field.UnderlyingStrikePrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingStrikePrice getUnderlyingStrikePrice() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingStrikePrice());
	}

	public boolean isSet(quickfix.field.UnderlyingStrikePrice field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingStrikePrice() {
		return isSetField(316);
	}

	public void set(quickfix.field.UnderlyingStrikeCurrency value) {
		setField(value);
	}

	public quickfix.field.UnderlyingStrikeCurrency get(quickfix.field.UnderlyingStrikeCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingStrikeCurrency getUnderlyingStrikeCurrency() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingStrikeCurrency());
	}

	public boolean isSet(quickfix.field.UnderlyingStrikeCurrency field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingStrikeCurrency() {
		return isSetField(941);
	}

	public void set(quickfix.field.UnderlyingOptAttribute value) {
		setField(value);
	}

	public quickfix.field.UnderlyingOptAttribute get(quickfix.field.UnderlyingOptAttribute value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingOptAttribute getUnderlyingOptAttribute() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingOptAttribute());
	}

	public boolean isSet(quickfix.field.UnderlyingOptAttribute field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingOptAttribute() {
		return isSetField(317);
	}

	public void set(quickfix.field.UnderlyingContractMultiplier value) {
		setField(value);
	}

	public quickfix.field.UnderlyingContractMultiplier get(quickfix.field.UnderlyingContractMultiplier value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingContractMultiplier getUnderlyingContractMultiplier() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingContractMultiplier());
	}

	public boolean isSet(quickfix.field.UnderlyingContractMultiplier field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingContractMultiplier() {
		return isSetField(436);
	}

	public void set(quickfix.field.UnderlyingContractMultiplierUnit value) {
		setField(value);
	}

	public quickfix.field.UnderlyingContractMultiplierUnit get(quickfix.field.UnderlyingContractMultiplierUnit value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingContractMultiplierUnit getUnderlyingContractMultiplierUnit() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingContractMultiplierUnit());
	}

	public boolean isSet(quickfix.field.UnderlyingContractMultiplierUnit field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingContractMultiplierUnit() {
		return isSetField(1437);
	}

	public void set(quickfix.field.UnderlyingFlowScheduleType value) {
		setField(value);
	}

	public quickfix.field.UnderlyingFlowScheduleType get(quickfix.field.UnderlyingFlowScheduleType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingFlowScheduleType getUnderlyingFlowScheduleType() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingFlowScheduleType());
	}

	public boolean isSet(quickfix.field.UnderlyingFlowScheduleType field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingFlowScheduleType() {
		return isSetField(1441);
	}

	public void set(quickfix.field.UnderlyingUnitOfMeasure value) {
		setField(value);
	}

	public quickfix.field.UnderlyingUnitOfMeasure get(quickfix.field.UnderlyingUnitOfMeasure value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingUnitOfMeasure getUnderlyingUnitOfMeasure() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingUnitOfMeasure());
	}

	public boolean isSet(quickfix.field.UnderlyingUnitOfMeasure field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingUnitOfMeasure() {
		return isSetField(998);
	}

	public void set(quickfix.field.UnderlyingUnitOfMeasureQty value) {
		setField(value);
	}

	public quickfix.field.UnderlyingUnitOfMeasureQty get(quickfix.field.UnderlyingUnitOfMeasureQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingUnitOfMeasureQty getUnderlyingUnitOfMeasureQty() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingUnitOfMeasureQty());
	}

	public boolean isSet(quickfix.field.UnderlyingUnitOfMeasureQty field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingUnitOfMeasureQty() {
		return isSetField(1423);
	}

	public void set(quickfix.field.UnderlyingPriceUnitOfMeasure value) {
		setField(value);
	}

	public quickfix.field.UnderlyingPriceUnitOfMeasure get(quickfix.field.UnderlyingPriceUnitOfMeasure value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingPriceUnitOfMeasure getUnderlyingPriceUnitOfMeasure() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingPriceUnitOfMeasure());
	}

	public boolean isSet(quickfix.field.UnderlyingPriceUnitOfMeasure field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingPriceUnitOfMeasure() {
		return isSetField(1424);
	}

	public void set(quickfix.field.UnderlyingPriceUnitOfMeasureQty value) {
		setField(value);
	}

	public quickfix.field.UnderlyingPriceUnitOfMeasureQty get(quickfix.field.UnderlyingPriceUnitOfMeasureQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingPriceUnitOfMeasureQty getUnderlyingPriceUnitOfMeasureQty() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingPriceUnitOfMeasureQty());
	}

	public boolean isSet(quickfix.field.UnderlyingPriceUnitOfMeasureQty field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingPriceUnitOfMeasureQty() {
		return isSetField(1425);
	}

	public void set(quickfix.field.UnderlyingTimeUnit value) {
		setField(value);
	}

	public quickfix.field.UnderlyingTimeUnit get(quickfix.field.UnderlyingTimeUnit value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingTimeUnit getUnderlyingTimeUnit() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingTimeUnit());
	}

	public boolean isSet(quickfix.field.UnderlyingTimeUnit field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingTimeUnit() {
		return isSetField(1000);
	}

	public void set(quickfix.field.UnderlyingExerciseStyle value) {
		setField(value);
	}

	public quickfix.field.UnderlyingExerciseStyle get(quickfix.field.UnderlyingExerciseStyle value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingExerciseStyle getUnderlyingExerciseStyle() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingExerciseStyle());
	}

	public boolean isSet(quickfix.field.UnderlyingExerciseStyle field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingExerciseStyle() {
		return isSetField(1419);
	}

	public void set(quickfix.field.UnderlyingCouponRate value) {
		setField(value);
	}

	public quickfix.field.UnderlyingCouponRate get(quickfix.field.UnderlyingCouponRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingCouponRate getUnderlyingCouponRate() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingCouponRate());
	}

	public boolean isSet(quickfix.field.UnderlyingCouponRate field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCouponRate() {
		return isSetField(435);
	}

	public void set(quickfix.field.UnderlyingSecurityExchange value) {
		setField(value);
	}

	public quickfix.field.UnderlyingSecurityExchange get(quickfix.field.UnderlyingSecurityExchange value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingSecurityExchange getUnderlyingSecurityExchange() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingSecurityExchange());
	}

	public boolean isSet(quickfix.field.UnderlyingSecurityExchange field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSecurityExchange() {
		return isSetField(308);
	}

	public void set(quickfix.field.UnderlyingIssuer value) {
		setField(value);
	}

	public quickfix.field.UnderlyingIssuer get(quickfix.field.UnderlyingIssuer value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingIssuer getUnderlyingIssuer() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingIssuer());
	}

	public boolean isSet(quickfix.field.UnderlyingIssuer field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingIssuer() {
		return isSetField(306);
	}

	public void set(quickfix.field.EncodedUnderlyingIssuerLen value) {
		setField(value);
	}

	public quickfix.field.EncodedUnderlyingIssuerLen get(quickfix.field.EncodedUnderlyingIssuerLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EncodedUnderlyingIssuerLen getEncodedUnderlyingIssuerLen() throws FieldNotFound {
		return get(new quickfix.field.EncodedUnderlyingIssuerLen());
	}

	public boolean isSet(quickfix.field.EncodedUnderlyingIssuerLen field) {
		return isSetField(field);
	}

	public boolean isSetEncodedUnderlyingIssuerLen() {
		return isSetField(362);
	}

	public void set(quickfix.field.EncodedUnderlyingIssuer value) {
		setField(value);
	}

	public quickfix.field.EncodedUnderlyingIssuer get(quickfix.field.EncodedUnderlyingIssuer value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EncodedUnderlyingIssuer getEncodedUnderlyingIssuer() throws FieldNotFound {
		return get(new quickfix.field.EncodedUnderlyingIssuer());
	}

	public boolean isSet(quickfix.field.EncodedUnderlyingIssuer field) {
		return isSetField(field);
	}

	public boolean isSetEncodedUnderlyingIssuer() {
		return isSetField(363);
	}

	public void set(quickfix.field.UnderlyingSecurityDesc value) {
		setField(value);
	}

	public quickfix.field.UnderlyingSecurityDesc get(quickfix.field.UnderlyingSecurityDesc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingSecurityDesc getUnderlyingSecurityDesc() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingSecurityDesc());
	}

	public boolean isSet(quickfix.field.UnderlyingSecurityDesc field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSecurityDesc() {
		return isSetField(307);
	}

	public void set(quickfix.field.EncodedUnderlyingSecurityDescLen value) {
		setField(value);
	}

	public quickfix.field.EncodedUnderlyingSecurityDescLen get(quickfix.field.EncodedUnderlyingSecurityDescLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EncodedUnderlyingSecurityDescLen getEncodedUnderlyingSecurityDescLen() throws FieldNotFound {
		return get(new quickfix.field.EncodedUnderlyingSecurityDescLen());
	}

	public boolean isSet(quickfix.field.EncodedUnderlyingSecurityDescLen field) {
		return isSetField(field);
	}

	public boolean isSetEncodedUnderlyingSecurityDescLen() {
		return isSetField(364);
	}

	public void set(quickfix.field.EncodedUnderlyingSecurityDesc value) {
		setField(value);
	}

	public quickfix.field.EncodedUnderlyingSecurityDesc get(quickfix.field.EncodedUnderlyingSecurityDesc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EncodedUnderlyingSecurityDesc getEncodedUnderlyingSecurityDesc() throws FieldNotFound {
		return get(new quickfix.field.EncodedUnderlyingSecurityDesc());
	}

	public boolean isSet(quickfix.field.EncodedUnderlyingSecurityDesc field) {
		return isSetField(field);
	}

	public boolean isSetEncodedUnderlyingSecurityDesc() {
		return isSetField(365);
	}

	public void set(quickfix.field.UnderlyingCPProgram value) {
		setField(value);
	}

	public quickfix.field.UnderlyingCPProgram get(quickfix.field.UnderlyingCPProgram value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingCPProgram getUnderlyingCPProgram() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingCPProgram());
	}

	public boolean isSet(quickfix.field.UnderlyingCPProgram field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCPProgram() {
		return isSetField(877);
	}

	public void set(quickfix.field.UnderlyingCPRegType value) {
		setField(value);
	}

	public quickfix.field.UnderlyingCPRegType get(quickfix.field.UnderlyingCPRegType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingCPRegType getUnderlyingCPRegType() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingCPRegType());
	}

	public boolean isSet(quickfix.field.UnderlyingCPRegType field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCPRegType() {
		return isSetField(878);
	}

	public void set(quickfix.field.UnderlyingAllocationPercent value) {
		setField(value);
	}

	public quickfix.field.UnderlyingAllocationPercent get(quickfix.field.UnderlyingAllocationPercent value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingAllocationPercent getUnderlyingAllocationPercent() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingAllocationPercent());
	}

	public boolean isSet(quickfix.field.UnderlyingAllocationPercent field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingAllocationPercent() {
		return isSetField(972);
	}

	public void set(quickfix.field.UnderlyingCurrency value) {
		setField(value);
	}

	public quickfix.field.UnderlyingCurrency get(quickfix.field.UnderlyingCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingCurrency getUnderlyingCurrency() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingCurrency());
	}

	public boolean isSet(quickfix.field.UnderlyingCurrency field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCurrency() {
		return isSetField(318);
	}

	public void set(quickfix.field.UnderlyingQty value) {
		setField(value);
	}

	public quickfix.field.UnderlyingQty get(quickfix.field.UnderlyingQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingQty getUnderlyingQty() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingQty());
	}

	public boolean isSet(quickfix.field.UnderlyingQty field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingQty() {
		return isSetField(879);
	}

	public void set(quickfix.field.UnderlyingSettlementType value) {
		setField(value);
	}

	public quickfix.field.UnderlyingSettlementType get(quickfix.field.UnderlyingSettlementType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingSettlementType getUnderlyingSettlementType() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingSettlementType());
	}

	public boolean isSet(quickfix.field.UnderlyingSettlementType field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSettlementType() {
		return isSetField(975);
	}

	public void set(quickfix.field.UnderlyingCashAmount value) {
		setField(value);
	}

	public quickfix.field.UnderlyingCashAmount get(quickfix.field.UnderlyingCashAmount value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingCashAmount getUnderlyingCashAmount() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingCashAmount());
	}

	public boolean isSet(quickfix.field.UnderlyingCashAmount field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCashAmount() {
		return isSetField(973);
	}

	public void set(quickfix.field.UnderlyingCashType value) {
		setField(value);
	}

	public quickfix.field.UnderlyingCashType get(quickfix.field.UnderlyingCashType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingCashType getUnderlyingCashType() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingCashType());
	}

	public boolean isSet(quickfix.field.UnderlyingCashType field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCashType() {
		return isSetField(974);
	}

	public void set(quickfix.field.UnderlyingPx value) {
		setField(value);
	}

	public quickfix.field.UnderlyingPx get(quickfix.field.UnderlyingPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingPx getUnderlyingPx() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingPx());
	}

	public boolean isSet(quickfix.field.UnderlyingPx field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingPx() {
		return isSetField(810);
	}

	public void set(quickfix.field.UnderlyingDirtyPrice value) {
		setField(value);
	}

	public quickfix.field.UnderlyingDirtyPrice get(quickfix.field.UnderlyingDirtyPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingDirtyPrice getUnderlyingDirtyPrice() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingDirtyPrice());
	}

	public boolean isSet(quickfix.field.UnderlyingDirtyPrice field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingDirtyPrice() {
		return isSetField(882);
	}

	public void set(quickfix.field.UnderlyingEndPrice value) {
		setField(value);
	}

	public quickfix.field.UnderlyingEndPrice get(quickfix.field.UnderlyingEndPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingEndPrice getUnderlyingEndPrice() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingEndPrice());
	}

	public boolean isSet(quickfix.field.UnderlyingEndPrice field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingEndPrice() {
		return isSetField(883);
	}

	public void set(quickfix.field.UnderlyingStartValue value) {
		setField(value);
	}

	public quickfix.field.UnderlyingStartValue get(quickfix.field.UnderlyingStartValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingStartValue getUnderlyingStartValue() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingStartValue());
	}

	public boolean isSet(quickfix.field.UnderlyingStartValue field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingStartValue() {
		return isSetField(884);
	}

	public void set(quickfix.field.UnderlyingCurrentValue value) {
		setField(value);
	}

	public quickfix.field.UnderlyingCurrentValue get(quickfix.field.UnderlyingCurrentValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingCurrentValue getUnderlyingCurrentValue() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingCurrentValue());
	}

	public boolean isSet(quickfix.field.UnderlyingCurrentValue field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCurrentValue() {
		return isSetField(885);
	}

	public void set(quickfix.field.UnderlyingEndValue value) {
		setField(value);
	}

	public quickfix.field.UnderlyingEndValue get(quickfix.field.UnderlyingEndValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingEndValue getUnderlyingEndValue() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingEndValue());
	}

	public boolean isSet(quickfix.field.UnderlyingEndValue field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingEndValue() {
		return isSetField(886);
	}

	public void set(quickfix.fix50sp2.component.UnderlyingStipulations component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.UnderlyingStipulations get(quickfix.fix50sp2.component.UnderlyingStipulations component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.UnderlyingStipulations getUnderlyingStipulations() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.UnderlyingStipulations());
	}

	public void set(quickfix.field.NoUnderlyingStips value) {
		setField(value);
	}

	public quickfix.field.NoUnderlyingStips get(quickfix.field.NoUnderlyingStips value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoUnderlyingStips getNoUnderlyingStips() throws FieldNotFound {
		return get(new quickfix.field.NoUnderlyingStips());
	}

	public boolean isSet(quickfix.field.NoUnderlyingStips field) {
		return isSetField(field);
	}

	public boolean isSetNoUnderlyingStips() {
		return isSetField(887);
	}

	public static class NoUnderlyingStips extends Group {

		static final long serialVersionUID = 20050617;

		public NoUnderlyingStips() {
			super(887, 888,
				new int[] {888, 889,  0 });
		}
		
	public void set(quickfix.field.UnderlyingStipType value) {
		setField(value);
	}

	public quickfix.field.UnderlyingStipType get(quickfix.field.UnderlyingStipType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingStipType getUnderlyingStipType() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingStipType());
	}

	public boolean isSet(quickfix.field.UnderlyingStipType field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingStipType() {
		return isSetField(888);
	}

	public void set(quickfix.field.UnderlyingStipValue value) {
		setField(value);
	}

	public quickfix.field.UnderlyingStipValue get(quickfix.field.UnderlyingStipValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingStipValue getUnderlyingStipValue() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingStipValue());
	}

	public boolean isSet(quickfix.field.UnderlyingStipValue field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingStipValue() {
		return isSetField(889);
	}

	}

	public void set(quickfix.field.UnderlyingAdjustedQuantity value) {
		setField(value);
	}

	public quickfix.field.UnderlyingAdjustedQuantity get(quickfix.field.UnderlyingAdjustedQuantity value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingAdjustedQuantity getUnderlyingAdjustedQuantity() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingAdjustedQuantity());
	}

	public boolean isSet(quickfix.field.UnderlyingAdjustedQuantity field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingAdjustedQuantity() {
		return isSetField(1044);
	}

	public void set(quickfix.field.UnderlyingFXRate value) {
		setField(value);
	}

	public quickfix.field.UnderlyingFXRate get(quickfix.field.UnderlyingFXRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingFXRate getUnderlyingFXRate() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingFXRate());
	}

	public boolean isSet(quickfix.field.UnderlyingFXRate field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingFXRate() {
		return isSetField(1045);
	}

	public void set(quickfix.field.UnderlyingFXRateCalc value) {
		setField(value);
	}

	public quickfix.field.UnderlyingFXRateCalc get(quickfix.field.UnderlyingFXRateCalc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingFXRateCalc getUnderlyingFXRateCalc() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingFXRateCalc());
	}

	public boolean isSet(quickfix.field.UnderlyingFXRateCalc field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingFXRateCalc() {
		return isSetField(1046);
	}

	public void set(quickfix.field.UnderlyingCapValue value) {
		setField(value);
	}

	public quickfix.field.UnderlyingCapValue get(quickfix.field.UnderlyingCapValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingCapValue getUnderlyingCapValue() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingCapValue());
	}

	public boolean isSet(quickfix.field.UnderlyingCapValue field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingCapValue() {
		return isSetField(1038);
	}

	public void set(quickfix.fix50sp2.component.UndlyInstrumentParties component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.UndlyInstrumentParties get(quickfix.fix50sp2.component.UndlyInstrumentParties component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.UndlyInstrumentParties getUndlyInstrumentParties() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.UndlyInstrumentParties());
	}

	public void set(quickfix.field.NoUndlyInstrumentParties value) {
		setField(value);
	}

	public quickfix.field.NoUndlyInstrumentParties get(quickfix.field.NoUndlyInstrumentParties value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoUndlyInstrumentParties getNoUndlyInstrumentParties() throws FieldNotFound {
		return get(new quickfix.field.NoUndlyInstrumentParties());
	}

	public boolean isSet(quickfix.field.NoUndlyInstrumentParties field) {
		return isSetField(field);
	}

	public boolean isSetNoUndlyInstrumentParties() {
		return isSetField(1058);
	}

	public static class NoUndlyInstrumentParties extends Group {

		static final long serialVersionUID = 20050617;

		public NoUndlyInstrumentParties() {
			super(1058, 1059,
				new int[] {1059, 1060, 1061, 1062,  0 });
		}
		
	public void set(quickfix.field.UnderlyingInstrumentPartyID value) {
		setField(value);
	}

	public quickfix.field.UnderlyingInstrumentPartyID get(quickfix.field.UnderlyingInstrumentPartyID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingInstrumentPartyID getUnderlyingInstrumentPartyID() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingInstrumentPartyID());
	}

	public boolean isSet(quickfix.field.UnderlyingInstrumentPartyID field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingInstrumentPartyID() {
		return isSetField(1059);
	}

	public void set(quickfix.field.UnderlyingInstrumentPartyIDSource value) {
		setField(value);
	}

	public quickfix.field.UnderlyingInstrumentPartyIDSource get(quickfix.field.UnderlyingInstrumentPartyIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingInstrumentPartyIDSource getUnderlyingInstrumentPartyIDSource() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingInstrumentPartyIDSource());
	}

	public boolean isSet(quickfix.field.UnderlyingInstrumentPartyIDSource field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingInstrumentPartyIDSource() {
		return isSetField(1060);
	}

	public void set(quickfix.field.UnderlyingInstrumentPartyRole value) {
		setField(value);
	}

	public quickfix.field.UnderlyingInstrumentPartyRole get(quickfix.field.UnderlyingInstrumentPartyRole value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingInstrumentPartyRole getUnderlyingInstrumentPartyRole() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingInstrumentPartyRole());
	}

	public boolean isSet(quickfix.field.UnderlyingInstrumentPartyRole field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingInstrumentPartyRole() {
		return isSetField(1061);
	}

	public void set(quickfix.fix50sp2.component.UndlyInstrumentPtysSubGrp component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.UndlyInstrumentPtysSubGrp get(quickfix.fix50sp2.component.UndlyInstrumentPtysSubGrp component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.UndlyInstrumentPtysSubGrp getUndlyInstrumentPtysSubGrp() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.UndlyInstrumentPtysSubGrp());
	}

	public void set(quickfix.field.NoUndlyInstrumentPartySubIDs value) {
		setField(value);
	}

	public quickfix.field.NoUndlyInstrumentPartySubIDs get(quickfix.field.NoUndlyInstrumentPartySubIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoUndlyInstrumentPartySubIDs getNoUndlyInstrumentPartySubIDs() throws FieldNotFound {
		return get(new quickfix.field.NoUndlyInstrumentPartySubIDs());
	}

	public boolean isSet(quickfix.field.NoUndlyInstrumentPartySubIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoUndlyInstrumentPartySubIDs() {
		return isSetField(1062);
	}

	public static class NoUndlyInstrumentPartySubIDs extends Group {

		static final long serialVersionUID = 20050617;

		public NoUndlyInstrumentPartySubIDs() {
			super(1062, 1063,
				new int[] {1063, 1064,  0 });
		}
		
	public void set(quickfix.field.UnderlyingInstrumentPartySubID value) {
		setField(value);
	}

	public quickfix.field.UnderlyingInstrumentPartySubID get(quickfix.field.UnderlyingInstrumentPartySubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingInstrumentPartySubID getUnderlyingInstrumentPartySubID() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingInstrumentPartySubID());
	}

	public boolean isSet(quickfix.field.UnderlyingInstrumentPartySubID field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingInstrumentPartySubID() {
		return isSetField(1063);
	}

	public void set(quickfix.field.UnderlyingInstrumentPartySubIDType value) {
		setField(value);
	}

	public quickfix.field.UnderlyingInstrumentPartySubIDType get(quickfix.field.UnderlyingInstrumentPartySubIDType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingInstrumentPartySubIDType getUnderlyingInstrumentPartySubIDType() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingInstrumentPartySubIDType());
	}

	public boolean isSet(quickfix.field.UnderlyingInstrumentPartySubIDType field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingInstrumentPartySubIDType() {
		return isSetField(1064);
	}

	}

	}

	public void set(quickfix.field.UnderlyingSettlMethod value) {
		setField(value);
	}

	public quickfix.field.UnderlyingSettlMethod get(quickfix.field.UnderlyingSettlMethod value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingSettlMethod getUnderlyingSettlMethod() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingSettlMethod());
	}

	public boolean isSet(quickfix.field.UnderlyingSettlMethod field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingSettlMethod() {
		return isSetField(1039);
	}

	public void set(quickfix.field.UnderlyingPutOrCall value) {
		setField(value);
	}

	public quickfix.field.UnderlyingPutOrCall get(quickfix.field.UnderlyingPutOrCall value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingPutOrCall getUnderlyingPutOrCall() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingPutOrCall());
	}

	public boolean isSet(quickfix.field.UnderlyingPutOrCall field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingPutOrCall() {
		return isSetField(315);
	}

	public void set(quickfix.fix50sp2.component.DerivativeSecurityDefinition component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.DerivativeSecurityDefinition get(quickfix.fix50sp2.component.DerivativeSecurityDefinition component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.DerivativeSecurityDefinition getDerivativeSecurityDefinition() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.DerivativeSecurityDefinition());
	}

	public void set(quickfix.fix50sp2.component.DerivativeInstrument component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.DerivativeInstrument get(quickfix.fix50sp2.component.DerivativeInstrument component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.DerivativeInstrument getDerivativeInstrument() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.DerivativeInstrument());
	}

	public void set(quickfix.field.DerivativeSymbol value) {
		setField(value);
	}

	public quickfix.field.DerivativeSymbol get(quickfix.field.DerivativeSymbol value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivativeSymbol getDerivativeSymbol() throws FieldNotFound {
		return get(new quickfix.field.DerivativeSymbol());
	}

	public boolean isSet(quickfix.field.DerivativeSymbol field) {
		return isSetField(field);
	}

	public boolean isSetDerivativeSymbol() {
		return isSetField(1214);
	}

	public void set(quickfix.field.DerivativeSymbolSfx value) {
		setField(value);
	}

	public quickfix.field.DerivativeSymbolSfx get(quickfix.field.DerivativeSymbolSfx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivativeSymbolSfx getDerivativeSymbolSfx() throws FieldNotFound {
		return get(new quickfix.field.DerivativeSymbolSfx());
	}

	public boolean isSet(quickfix.field.DerivativeSymbolSfx field) {
		return isSetField(field);
	}

	public boolean isSetDerivativeSymbolSfx() {
		return isSetField(1215);
	}

	public void set(quickfix.field.DerivativeSecurityID value) {
		setField(value);
	}

	public quickfix.field.DerivativeSecurityID get(quickfix.field.DerivativeSecurityID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivativeSecurityID getDerivativeSecurityID() throws FieldNotFound {
		return get(new quickfix.field.DerivativeSecurityID());
	}

	public boolean isSet(quickfix.field.DerivativeSecurityID field) {
		return isSetField(field);
	}

	public boolean isSetDerivativeSecurityID() {
		return isSetField(1216);
	}

	public void set(quickfix.field.DerivativeSecurityIDSource value) {
		setField(value);
	}

	public quickfix.field.DerivativeSecurityIDSource get(quickfix.field.DerivativeSecurityIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivativeSecurityIDSource getDerivativeSecurityIDSource() throws FieldNotFound {
		return get(new quickfix.field.DerivativeSecurityIDSource());
	}

	public boolean isSet(quickfix.field.DerivativeSecurityIDSource field) {
		return isSetField(field);
	}

	public boolean isSetDerivativeSecurityIDSource() {
		return isSetField(1217);
	}

	public void set(quickfix.fix50sp2.component.DerivativeSecurityAltIDGrp component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.DerivativeSecurityAltIDGrp get(quickfix.fix50sp2.component.DerivativeSecurityAltIDGrp component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.DerivativeSecurityAltIDGrp getDerivativeSecurityAltIDGrp() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.DerivativeSecurityAltIDGrp());
	}

	public void set(quickfix.field.NoDerivativeSecurityAltID value) {
		setField(value);
	}

	public quickfix.field.NoDerivativeSecurityAltID get(quickfix.field.NoDerivativeSecurityAltID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoDerivativeSecurityAltID getNoDerivativeSecurityAltID() throws FieldNotFound {
		return get(new quickfix.field.NoDerivativeSecurityAltID());
	}

	public boolean isSet(quickfix.field.NoDerivativeSecurityAltID field) {
		return isSetField(field);
	}

	public boolean isSetNoDerivativeSecurityAltID() {
		return isSetField(1218);
	}

	public static class NoDerivativeSecurityAltID extends Group {

		static final long serialVersionUID = 20050617;

		public NoDerivativeSecurityAltID() {
			super(1218, 1219,
				new int[] {1219, 1220,  0 });
		}
		
	public void set(quickfix.field.DerivativeSecurityAltID value) {
		setField(value);
	}

	public quickfix.field.DerivativeSecurityAltID get(quickfix.field.DerivativeSecurityAltID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivativeSecurityAltID getDerivativeSecurityAltID() throws FieldNotFound {
		return get(new quickfix.field.DerivativeSecurityAltID());
	}

	public boolean isSet(quickfix.field.DerivativeSecurityAltID field) {
		return isSetField(field);
	}

	public boolean isSetDerivativeSecurityAltID() {
		return isSetField(1219);
	}

	public void set(quickfix.field.DerivativeSecurityAltIDSource value) {
		setField(value);
	}

	public quickfix.field.DerivativeSecurityAltIDSource get(quickfix.field.DerivativeSecurityAltIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivativeSecurityAltIDSource getDerivativeSecurityAltIDSource() throws FieldNotFound {
		return get(new quickfix.field.DerivativeSecurityAltIDSource());
	}

	public boolean isSet(quickfix.field.DerivativeSecurityAltIDSource field) {
		return isSetField(field);
	}

	public boolean isSetDerivativeSecurityAltIDSource() {
		return isSetField(1220);
	}

	}

	public void set(quickfix.field.DerivativeProduct value) {
		setField(value);
	}

	public quickfix.field.DerivativeProduct get(quickfix.field.DerivativeProduct value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivativeProduct getDerivativeProduct() throws FieldNotFound {
		return get(new quickfix.field.DerivativeProduct());
	}

	public boolean isSet(quickfix.field.DerivativeProduct field) {
		return isSetField(field);
	}

	public boolean isSetDerivativeProduct() {
		return isSetField(1246);
	}

	public void set(quickfix.field.DerivativeProductComplex value) {
		setField(value);
	}

	public quickfix.field.DerivativeProductComplex get(quickfix.field.DerivativeProductComplex value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivativeProductComplex getDerivativeProductComplex() throws FieldNotFound {
		return get(new quickfix.field.DerivativeProductComplex());
	}

	public boolean isSet(quickfix.field.DerivativeProductComplex field) {
		return isSetField(field);
	}

	public boolean isSetDerivativeProductComplex() {
		return isSetField(1228);
	}

	public void set(quickfix.field.DerivFlexProductEligibilityIndicator value) {
		setField(value);
	}

	public quickfix.field.DerivFlexProductEligibilityIndicator get(quickfix.field.DerivFlexProductEligibilityIndicator value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivFlexProductEligibilityIndicator getDerivFlexProductEligibilityIndicator() throws FieldNotFound {
		return get(new quickfix.field.DerivFlexProductEligibilityIndicator());
	}

	public boolean isSet(quickfix.field.DerivFlexProductEligibilityIndicator field) {
		return isSetField(field);
	}

	public boolean isSetDerivFlexProductEligibilityIndicator() {
		return isSetField(1243);
	}

	public void set(quickfix.field.DerivativeSecurityGroup value) {
		setField(value);
	}

	public quickfix.field.DerivativeSecurityGroup get(quickfix.field.DerivativeSecurityGroup value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivativeSecurityGroup getDerivativeSecurityGroup() throws FieldNotFound {
		return get(new quickfix.field.DerivativeSecurityGroup());
	}

	public boolean isSet(quickfix.field.DerivativeSecurityGroup field) {
		return isSetField(field);
	}

	public boolean isSetDerivativeSecurityGroup() {
		return isSetField(1247);
	}

	public void set(quickfix.field.DerivativeCFICode value) {
		setField(value);
	}

	public quickfix.field.DerivativeCFICode get(quickfix.field.DerivativeCFICode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivativeCFICode getDerivativeCFICode() throws FieldNotFound {
		return get(new quickfix.field.DerivativeCFICode());
	}

	public boolean isSet(quickfix.field.DerivativeCFICode field) {
		return isSetField(field);
	}

	public boolean isSetDerivativeCFICode() {
		return isSetField(1248);
	}

	public void set(quickfix.field.DerivativeSecurityType value) {
		setField(value);
	}

	public quickfix.field.DerivativeSecurityType get(quickfix.field.DerivativeSecurityType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivativeSecurityType getDerivativeSecurityType() throws FieldNotFound {
		return get(new quickfix.field.DerivativeSecurityType());
	}

	public boolean isSet(quickfix.field.DerivativeSecurityType field) {
		return isSetField(field);
	}

	public boolean isSetDerivativeSecurityType() {
		return isSetField(1249);
	}

	public void set(quickfix.field.DerivativeSecuritySubType value) {
		setField(value);
	}

	public quickfix.field.DerivativeSecuritySubType get(quickfix.field.DerivativeSecuritySubType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivativeSecuritySubType getDerivativeSecuritySubType() throws FieldNotFound {
		return get(new quickfix.field.DerivativeSecuritySubType());
	}

	public boolean isSet(quickfix.field.DerivativeSecuritySubType field) {
		return isSetField(field);
	}

	public boolean isSetDerivativeSecuritySubType() {
		return isSetField(1250);
	}

	public void set(quickfix.field.DerivativeMaturityMonthYear value) {
		setField(value);
	}

	public quickfix.field.DerivativeMaturityMonthYear get(quickfix.field.DerivativeMaturityMonthYear value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivativeMaturityMonthYear getDerivativeMaturityMonthYear() throws FieldNotFound {
		return get(new quickfix.field.DerivativeMaturityMonthYear());
	}

	public boolean isSet(quickfix.field.DerivativeMaturityMonthYear field) {
		return isSetField(field);
	}

	public boolean isSetDerivativeMaturityMonthYear() {
		return isSetField(1251);
	}

	public void set(quickfix.field.DerivativeMaturityDate value) {
		setField(value);
	}

	public quickfix.field.DerivativeMaturityDate get(quickfix.field.DerivativeMaturityDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivativeMaturityDate getDerivativeMaturityDate() throws FieldNotFound {
		return get(new quickfix.field.DerivativeMaturityDate());
	}

	public boolean isSet(quickfix.field.DerivativeMaturityDate field) {
		return isSetField(field);
	}

	public boolean isSetDerivativeMaturityDate() {
		return isSetField(1252);
	}

	public void set(quickfix.field.DerivativeMaturityTime value) {
		setField(value);
	}

	public quickfix.field.DerivativeMaturityTime get(quickfix.field.DerivativeMaturityTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivativeMaturityTime getDerivativeMaturityTime() throws FieldNotFound {
		return get(new quickfix.field.DerivativeMaturityTime());
	}

	public boolean isSet(quickfix.field.DerivativeMaturityTime field) {
		return isSetField(field);
	}

	public boolean isSetDerivativeMaturityTime() {
		return isSetField(1253);
	}

	public void set(quickfix.field.DerivativeSettleOnOpenFlag value) {
		setField(value);
	}

	public quickfix.field.DerivativeSettleOnOpenFlag get(quickfix.field.DerivativeSettleOnOpenFlag value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivativeSettleOnOpenFlag getDerivativeSettleOnOpenFlag() throws FieldNotFound {
		return get(new quickfix.field.DerivativeSettleOnOpenFlag());
	}

	public boolean isSet(quickfix.field.DerivativeSettleOnOpenFlag field) {
		return isSetField(field);
	}

	public boolean isSetDerivativeSettleOnOpenFlag() {
		return isSetField(1254);
	}

	public void set(quickfix.field.DerivativeInstrmtAssignmentMethod value) {
		setField(value);
	}

	public quickfix.field.DerivativeInstrmtAssignmentMethod get(quickfix.field.DerivativeInstrmtAssignmentMethod value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivativeInstrmtAssignmentMethod getDerivativeInstrmtAssignmentMethod() throws FieldNotFound {
		return get(new quickfix.field.DerivativeInstrmtAssignmentMethod());
	}

	public boolean isSet(quickfix.field.DerivativeInstrmtAssignmentMethod field) {
		return isSetField(field);
	}

	public boolean isSetDerivativeInstrmtAssignmentMethod() {
		return isSetField(1255);
	}

	public void set(quickfix.field.DerivativeSecurityStatus value) {
		setField(value);
	}

	public quickfix.field.DerivativeSecurityStatus get(quickfix.field.DerivativeSecurityStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivativeSecurityStatus getDerivativeSecurityStatus() throws FieldNotFound {
		return get(new quickfix.field.DerivativeSecurityStatus());
	}

	public boolean isSet(quickfix.field.DerivativeSecurityStatus field) {
		return isSetField(field);
	}

	public boolean isSetDerivativeSecurityStatus() {
		return isSetField(1256);
	}

	public void set(quickfix.field.DerivativeIssueDate value) {
		setField(value);
	}

	public quickfix.field.DerivativeIssueDate get(quickfix.field.DerivativeIssueDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivativeIssueDate getDerivativeIssueDate() throws FieldNotFound {
		return get(new quickfix.field.DerivativeIssueDate());
	}

	public boolean isSet(quickfix.field.DerivativeIssueDate field) {
		return isSetField(field);
	}

	public boolean isSetDerivativeIssueDate() {
		return isSetField(1276);
	}

	public void set(quickfix.field.DerivativeInstrRegistry value) {
		setField(value);
	}

	public quickfix.field.DerivativeInstrRegistry get(quickfix.field.DerivativeInstrRegistry value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivativeInstrRegistry getDerivativeInstrRegistry() throws FieldNotFound {
		return get(new quickfix.field.DerivativeInstrRegistry());
	}

	public boolean isSet(quickfix.field.DerivativeInstrRegistry field) {
		return isSetField(field);
	}

	public boolean isSetDerivativeInstrRegistry() {
		return isSetField(1257);
	}

	public void set(quickfix.field.DerivativeCountryOfIssue value) {
		setField(value);
	}

	public quickfix.field.DerivativeCountryOfIssue get(quickfix.field.DerivativeCountryOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivativeCountryOfIssue getDerivativeCountryOfIssue() throws FieldNotFound {
		return get(new quickfix.field.DerivativeCountryOfIssue());
	}

	public boolean isSet(quickfix.field.DerivativeCountryOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetDerivativeCountryOfIssue() {
		return isSetField(1258);
	}

	public void set(quickfix.field.DerivativeStateOrProvinceOfIssue value) {
		setField(value);
	}

	public quickfix.field.DerivativeStateOrProvinceOfIssue get(quickfix.field.DerivativeStateOrProvinceOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivativeStateOrProvinceOfIssue getDerivativeStateOrProvinceOfIssue() throws FieldNotFound {
		return get(new quickfix.field.DerivativeStateOrProvinceOfIssue());
	}

	public boolean isSet(quickfix.field.DerivativeStateOrProvinceOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetDerivativeStateOrProvinceOfIssue() {
		return isSetField(1259);
	}

	public void set(quickfix.field.DerivativeLocaleOfIssue value) {
		setField(value);
	}

	public quickfix.field.DerivativeLocaleOfIssue get(quickfix.field.DerivativeLocaleOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivativeLocaleOfIssue getDerivativeLocaleOfIssue() throws FieldNotFound {
		return get(new quickfix.field.DerivativeLocaleOfIssue());
	}

	public boolean isSet(quickfix.field.DerivativeLocaleOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetDerivativeLocaleOfIssue() {
		return isSetField(1260);
	}

	public void set(quickfix.field.DerivativeStrikePrice value) {
		setField(value);
	}

	public quickfix.field.DerivativeStrikePrice get(quickfix.field.DerivativeStrikePrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivativeStrikePrice getDerivativeStrikePrice() throws FieldNotFound {
		return get(new quickfix.field.DerivativeStrikePrice());
	}

	public boolean isSet(quickfix.field.DerivativeStrikePrice field) {
		return isSetField(field);
	}

	public boolean isSetDerivativeStrikePrice() {
		return isSetField(1261);
	}

	public void set(quickfix.field.DerivativeStrikeCurrency value) {
		setField(value);
	}

	public quickfix.field.DerivativeStrikeCurrency get(quickfix.field.DerivativeStrikeCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivativeStrikeCurrency getDerivativeStrikeCurrency() throws FieldNotFound {
		return get(new quickfix.field.DerivativeStrikeCurrency());
	}

	public boolean isSet(quickfix.field.DerivativeStrikeCurrency field) {
		return isSetField(field);
	}

	public boolean isSetDerivativeStrikeCurrency() {
		return isSetField(1262);
	}

	public void set(quickfix.field.DerivativeStrikeMultiplier value) {
		setField(value);
	}

	public quickfix.field.DerivativeStrikeMultiplier get(quickfix.field.DerivativeStrikeMultiplier value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivativeStrikeMultiplier getDerivativeStrikeMultiplier() throws FieldNotFound {
		return get(new quickfix.field.DerivativeStrikeMultiplier());
	}

	public boolean isSet(quickfix.field.DerivativeStrikeMultiplier field) {
		return isSetField(field);
	}

	public boolean isSetDerivativeStrikeMultiplier() {
		return isSetField(1263);
	}

	public void set(quickfix.field.DerivativeStrikeValue value) {
		setField(value);
	}

	public quickfix.field.DerivativeStrikeValue get(quickfix.field.DerivativeStrikeValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivativeStrikeValue getDerivativeStrikeValue() throws FieldNotFound {
		return get(new quickfix.field.DerivativeStrikeValue());
	}

	public boolean isSet(quickfix.field.DerivativeStrikeValue field) {
		return isSetField(field);
	}

	public boolean isSetDerivativeStrikeValue() {
		return isSetField(1264);
	}

	public void set(quickfix.field.DerivativeOptAttribute value) {
		setField(value);
	}

	public quickfix.field.DerivativeOptAttribute get(quickfix.field.DerivativeOptAttribute value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivativeOptAttribute getDerivativeOptAttribute() throws FieldNotFound {
		return get(new quickfix.field.DerivativeOptAttribute());
	}

	public boolean isSet(quickfix.field.DerivativeOptAttribute field) {
		return isSetField(field);
	}

	public boolean isSetDerivativeOptAttribute() {
		return isSetField(1265);
	}

	public void set(quickfix.field.DerivativeContractMultiplier value) {
		setField(value);
	}

	public quickfix.field.DerivativeContractMultiplier get(quickfix.field.DerivativeContractMultiplier value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivativeContractMultiplier getDerivativeContractMultiplier() throws FieldNotFound {
		return get(new quickfix.field.DerivativeContractMultiplier());
	}

	public boolean isSet(quickfix.field.DerivativeContractMultiplier field) {
		return isSetField(field);
	}

	public boolean isSetDerivativeContractMultiplier() {
		return isSetField(1266);
	}

	public void set(quickfix.field.DerivativeContractMultiplierUnit value) {
		setField(value);
	}

	public quickfix.field.DerivativeContractMultiplierUnit get(quickfix.field.DerivativeContractMultiplierUnit value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivativeContractMultiplierUnit getDerivativeContractMultiplierUnit() throws FieldNotFound {
		return get(new quickfix.field.DerivativeContractMultiplierUnit());
	}

	public boolean isSet(quickfix.field.DerivativeContractMultiplierUnit field) {
		return isSetField(field);
	}

	public boolean isSetDerivativeContractMultiplierUnit() {
		return isSetField(1438);
	}

	public void set(quickfix.field.DerivativeFlowScheduleType value) {
		setField(value);
	}

	public quickfix.field.DerivativeFlowScheduleType get(quickfix.field.DerivativeFlowScheduleType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivativeFlowScheduleType getDerivativeFlowScheduleType() throws FieldNotFound {
		return get(new quickfix.field.DerivativeFlowScheduleType());
	}

	public boolean isSet(quickfix.field.DerivativeFlowScheduleType field) {
		return isSetField(field);
	}

	public boolean isSetDerivativeFlowScheduleType() {
		return isSetField(1442);
	}

	public void set(quickfix.field.DerivativeMinPriceIncrement value) {
		setField(value);
	}

	public quickfix.field.DerivativeMinPriceIncrement get(quickfix.field.DerivativeMinPriceIncrement value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivativeMinPriceIncrement getDerivativeMinPriceIncrement() throws FieldNotFound {
		return get(new quickfix.field.DerivativeMinPriceIncrement());
	}

	public boolean isSet(quickfix.field.DerivativeMinPriceIncrement field) {
		return isSetField(field);
	}

	public boolean isSetDerivativeMinPriceIncrement() {
		return isSetField(1267);
	}

	public void set(quickfix.field.DerivativeMinPriceIncrementAmount value) {
		setField(value);
	}

	public quickfix.field.DerivativeMinPriceIncrementAmount get(quickfix.field.DerivativeMinPriceIncrementAmount value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivativeMinPriceIncrementAmount getDerivativeMinPriceIncrementAmount() throws FieldNotFound {
		return get(new quickfix.field.DerivativeMinPriceIncrementAmount());
	}

	public boolean isSet(quickfix.field.DerivativeMinPriceIncrementAmount field) {
		return isSetField(field);
	}

	public boolean isSetDerivativeMinPriceIncrementAmount() {
		return isSetField(1268);
	}

	public void set(quickfix.field.DerivativeUnitOfMeasure value) {
		setField(value);
	}

	public quickfix.field.DerivativeUnitOfMeasure get(quickfix.field.DerivativeUnitOfMeasure value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivativeUnitOfMeasure getDerivativeUnitOfMeasure() throws FieldNotFound {
		return get(new quickfix.field.DerivativeUnitOfMeasure());
	}

	public boolean isSet(quickfix.field.DerivativeUnitOfMeasure field) {
		return isSetField(field);
	}

	public boolean isSetDerivativeUnitOfMeasure() {
		return isSetField(1269);
	}

	public void set(quickfix.field.DerivativeUnitOfMeasureQty value) {
		setField(value);
	}

	public quickfix.field.DerivativeUnitOfMeasureQty get(quickfix.field.DerivativeUnitOfMeasureQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivativeUnitOfMeasureQty getDerivativeUnitOfMeasureQty() throws FieldNotFound {
		return get(new quickfix.field.DerivativeUnitOfMeasureQty());
	}

	public boolean isSet(quickfix.field.DerivativeUnitOfMeasureQty field) {
		return isSetField(field);
	}

	public boolean isSetDerivativeUnitOfMeasureQty() {
		return isSetField(1270);
	}

	public void set(quickfix.field.DerivativePriceUnitOfMeasure value) {
		setField(value);
	}

	public quickfix.field.DerivativePriceUnitOfMeasure get(quickfix.field.DerivativePriceUnitOfMeasure value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivativePriceUnitOfMeasure getDerivativePriceUnitOfMeasure() throws FieldNotFound {
		return get(new quickfix.field.DerivativePriceUnitOfMeasure());
	}

	public boolean isSet(quickfix.field.DerivativePriceUnitOfMeasure field) {
		return isSetField(field);
	}

	public boolean isSetDerivativePriceUnitOfMeasure() {
		return isSetField(1315);
	}

	public void set(quickfix.field.DerivativePriceUnitOfMeasureQty value) {
		setField(value);
	}

	public quickfix.field.DerivativePriceUnitOfMeasureQty get(quickfix.field.DerivativePriceUnitOfMeasureQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivativePriceUnitOfMeasureQty getDerivativePriceUnitOfMeasureQty() throws FieldNotFound {
		return get(new quickfix.field.DerivativePriceUnitOfMeasureQty());
	}

	public boolean isSet(quickfix.field.DerivativePriceUnitOfMeasureQty field) {
		return isSetField(field);
	}

	public boolean isSetDerivativePriceUnitOfMeasureQty() {
		return isSetField(1316);
	}

	public void set(quickfix.field.DerivativeSettlMethod value) {
		setField(value);
	}

	public quickfix.field.DerivativeSettlMethod get(quickfix.field.DerivativeSettlMethod value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivativeSettlMethod getDerivativeSettlMethod() throws FieldNotFound {
		return get(new quickfix.field.DerivativeSettlMethod());
	}

	public boolean isSet(quickfix.field.DerivativeSettlMethod field) {
		return isSetField(field);
	}

	public boolean isSetDerivativeSettlMethod() {
		return isSetField(1317);
	}

	public void set(quickfix.field.DerivativePriceQuoteMethod value) {
		setField(value);
	}

	public quickfix.field.DerivativePriceQuoteMethod get(quickfix.field.DerivativePriceQuoteMethod value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivativePriceQuoteMethod getDerivativePriceQuoteMethod() throws FieldNotFound {
		return get(new quickfix.field.DerivativePriceQuoteMethod());
	}

	public boolean isSet(quickfix.field.DerivativePriceQuoteMethod field) {
		return isSetField(field);
	}

	public boolean isSetDerivativePriceQuoteMethod() {
		return isSetField(1318);
	}

	public void set(quickfix.field.DerivativeValuationMethod value) {
		setField(value);
	}

	public quickfix.field.DerivativeValuationMethod get(quickfix.field.DerivativeValuationMethod value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivativeValuationMethod getDerivativeValuationMethod() throws FieldNotFound {
		return get(new quickfix.field.DerivativeValuationMethod());
	}

	public boolean isSet(quickfix.field.DerivativeValuationMethod field) {
		return isSetField(field);
	}

	public boolean isSetDerivativeValuationMethod() {
		return isSetField(1319);
	}

	public void set(quickfix.field.DerivativeListMethod value) {
		setField(value);
	}

	public quickfix.field.DerivativeListMethod get(quickfix.field.DerivativeListMethod value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivativeListMethod getDerivativeListMethod() throws FieldNotFound {
		return get(new quickfix.field.DerivativeListMethod());
	}

	public boolean isSet(quickfix.field.DerivativeListMethod field) {
		return isSetField(field);
	}

	public boolean isSetDerivativeListMethod() {
		return isSetField(1320);
	}

	public void set(quickfix.field.DerivativeCapPrice value) {
		setField(value);
	}

	public quickfix.field.DerivativeCapPrice get(quickfix.field.DerivativeCapPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivativeCapPrice getDerivativeCapPrice() throws FieldNotFound {
		return get(new quickfix.field.DerivativeCapPrice());
	}

	public boolean isSet(quickfix.field.DerivativeCapPrice field) {
		return isSetField(field);
	}

	public boolean isSetDerivativeCapPrice() {
		return isSetField(1321);
	}

	public void set(quickfix.field.DerivativeFloorPrice value) {
		setField(value);
	}

	public quickfix.field.DerivativeFloorPrice get(quickfix.field.DerivativeFloorPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivativeFloorPrice getDerivativeFloorPrice() throws FieldNotFound {
		return get(new quickfix.field.DerivativeFloorPrice());
	}

	public boolean isSet(quickfix.field.DerivativeFloorPrice field) {
		return isSetField(field);
	}

	public boolean isSetDerivativeFloorPrice() {
		return isSetField(1322);
	}

	public void set(quickfix.field.DerivativePutOrCall value) {
		setField(value);
	}

	public quickfix.field.DerivativePutOrCall get(quickfix.field.DerivativePutOrCall value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivativePutOrCall getDerivativePutOrCall() throws FieldNotFound {
		return get(new quickfix.field.DerivativePutOrCall());
	}

	public boolean isSet(quickfix.field.DerivativePutOrCall field) {
		return isSetField(field);
	}

	public boolean isSetDerivativePutOrCall() {
		return isSetField(1323);
	}

	public void set(quickfix.field.DerivativeExerciseStyle value) {
		setField(value);
	}

	public quickfix.field.DerivativeExerciseStyle get(quickfix.field.DerivativeExerciseStyle value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivativeExerciseStyle getDerivativeExerciseStyle() throws FieldNotFound {
		return get(new quickfix.field.DerivativeExerciseStyle());
	}

	public boolean isSet(quickfix.field.DerivativeExerciseStyle field) {
		return isSetField(field);
	}

	public boolean isSetDerivativeExerciseStyle() {
		return isSetField(1299);
	}

	public void set(quickfix.field.DerivativeOptPayAmount value) {
		setField(value);
	}

	public quickfix.field.DerivativeOptPayAmount get(quickfix.field.DerivativeOptPayAmount value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivativeOptPayAmount getDerivativeOptPayAmount() throws FieldNotFound {
		return get(new quickfix.field.DerivativeOptPayAmount());
	}

	public boolean isSet(quickfix.field.DerivativeOptPayAmount field) {
		return isSetField(field);
	}

	public boolean isSetDerivativeOptPayAmount() {
		return isSetField(1225);
	}

	public void set(quickfix.field.DerivativeTimeUnit value) {
		setField(value);
	}

	public quickfix.field.DerivativeTimeUnit get(quickfix.field.DerivativeTimeUnit value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivativeTimeUnit getDerivativeTimeUnit() throws FieldNotFound {
		return get(new quickfix.field.DerivativeTimeUnit());
	}

	public boolean isSet(quickfix.field.DerivativeTimeUnit field) {
		return isSetField(field);
	}

	public boolean isSetDerivativeTimeUnit() {
		return isSetField(1271);
	}

	public void set(quickfix.field.DerivativeSecurityExchange value) {
		setField(value);
	}

	public quickfix.field.DerivativeSecurityExchange get(quickfix.field.DerivativeSecurityExchange value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivativeSecurityExchange getDerivativeSecurityExchange() throws FieldNotFound {
		return get(new quickfix.field.DerivativeSecurityExchange());
	}

	public boolean isSet(quickfix.field.DerivativeSecurityExchange field) {
		return isSetField(field);
	}

	public boolean isSetDerivativeSecurityExchange() {
		return isSetField(1272);
	}

	public void set(quickfix.field.DerivativePositionLimit value) {
		setField(value);
	}

	public quickfix.field.DerivativePositionLimit get(quickfix.field.DerivativePositionLimit value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivativePositionLimit getDerivativePositionLimit() throws FieldNotFound {
		return get(new quickfix.field.DerivativePositionLimit());
	}

	public boolean isSet(quickfix.field.DerivativePositionLimit field) {
		return isSetField(field);
	}

	public boolean isSetDerivativePositionLimit() {
		return isSetField(1273);
	}

	public void set(quickfix.field.DerivativeNTPositionLimit value) {
		setField(value);
	}

	public quickfix.field.DerivativeNTPositionLimit get(quickfix.field.DerivativeNTPositionLimit value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivativeNTPositionLimit getDerivativeNTPositionLimit() throws FieldNotFound {
		return get(new quickfix.field.DerivativeNTPositionLimit());
	}

	public boolean isSet(quickfix.field.DerivativeNTPositionLimit field) {
		return isSetField(field);
	}

	public boolean isSetDerivativeNTPositionLimit() {
		return isSetField(1274);
	}

	public void set(quickfix.field.DerivativeIssuer value) {
		setField(value);
	}

	public quickfix.field.DerivativeIssuer get(quickfix.field.DerivativeIssuer value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivativeIssuer getDerivativeIssuer() throws FieldNotFound {
		return get(new quickfix.field.DerivativeIssuer());
	}

	public boolean isSet(quickfix.field.DerivativeIssuer field) {
		return isSetField(field);
	}

	public boolean isSetDerivativeIssuer() {
		return isSetField(1275);
	}

	public void set(quickfix.field.DerivativeEncodedIssuerLen value) {
		setField(value);
	}

	public quickfix.field.DerivativeEncodedIssuerLen get(quickfix.field.DerivativeEncodedIssuerLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivativeEncodedIssuerLen getDerivativeEncodedIssuerLen() throws FieldNotFound {
		return get(new quickfix.field.DerivativeEncodedIssuerLen());
	}

	public boolean isSet(quickfix.field.DerivativeEncodedIssuerLen field) {
		return isSetField(field);
	}

	public boolean isSetDerivativeEncodedIssuerLen() {
		return isSetField(1277);
	}

	public void set(quickfix.field.DerivativeEncodedIssuer value) {
		setField(value);
	}

	public quickfix.field.DerivativeEncodedIssuer get(quickfix.field.DerivativeEncodedIssuer value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivativeEncodedIssuer getDerivativeEncodedIssuer() throws FieldNotFound {
		return get(new quickfix.field.DerivativeEncodedIssuer());
	}

	public boolean isSet(quickfix.field.DerivativeEncodedIssuer field) {
		return isSetField(field);
	}

	public boolean isSetDerivativeEncodedIssuer() {
		return isSetField(1278);
	}

	public void set(quickfix.field.DerivativeSecurityDesc value) {
		setField(value);
	}

	public quickfix.field.DerivativeSecurityDesc get(quickfix.field.DerivativeSecurityDesc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivativeSecurityDesc getDerivativeSecurityDesc() throws FieldNotFound {
		return get(new quickfix.field.DerivativeSecurityDesc());
	}

	public boolean isSet(quickfix.field.DerivativeSecurityDesc field) {
		return isSetField(field);
	}

	public boolean isSetDerivativeSecurityDesc() {
		return isSetField(1279);
	}

	public void set(quickfix.field.DerivativeEncodedSecurityDescLen value) {
		setField(value);
	}

	public quickfix.field.DerivativeEncodedSecurityDescLen get(quickfix.field.DerivativeEncodedSecurityDescLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivativeEncodedSecurityDescLen getDerivativeEncodedSecurityDescLen() throws FieldNotFound {
		return get(new quickfix.field.DerivativeEncodedSecurityDescLen());
	}

	public boolean isSet(quickfix.field.DerivativeEncodedSecurityDescLen field) {
		return isSetField(field);
	}

	public boolean isSetDerivativeEncodedSecurityDescLen() {
		return isSetField(1280);
	}

	public void set(quickfix.field.DerivativeEncodedSecurityDesc value) {
		setField(value);
	}

	public quickfix.field.DerivativeEncodedSecurityDesc get(quickfix.field.DerivativeEncodedSecurityDesc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivativeEncodedSecurityDesc getDerivativeEncodedSecurityDesc() throws FieldNotFound {
		return get(new quickfix.field.DerivativeEncodedSecurityDesc());
	}

	public boolean isSet(quickfix.field.DerivativeEncodedSecurityDesc field) {
		return isSetField(field);
	}

	public boolean isSetDerivativeEncodedSecurityDesc() {
		return isSetField(1281);
	}

	public void set(quickfix.fix50sp2.component.DerivativeSecurityXML component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.DerivativeSecurityXML get(quickfix.fix50sp2.component.DerivativeSecurityXML component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.DerivativeSecurityXML getDerivativeSecurityXML() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.DerivativeSecurityXML());
	}

	public void set(quickfix.field.DerivativeSecurityXMLLen value) {
		setField(value);
	}

	public quickfix.field.DerivativeSecurityXMLLen get(quickfix.field.DerivativeSecurityXMLLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivativeSecurityXMLLen getDerivativeSecurityXMLLen() throws FieldNotFound {
		return get(new quickfix.field.DerivativeSecurityXMLLen());
	}

	public boolean isSet(quickfix.field.DerivativeSecurityXMLLen field) {
		return isSetField(field);
	}

	public boolean isSetDerivativeSecurityXMLLen() {
		return isSetField(1282);
	}

	public void set(quickfix.field.DerivativeSecurityXMLData value) {
		setField(value);
	}

	public quickfix.field.DerivativeSecurityXMLData get(quickfix.field.DerivativeSecurityXMLData value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivativeSecurityXMLData getDerivativeSecurityXMLData() throws FieldNotFound {
		return get(new quickfix.field.DerivativeSecurityXMLData());
	}

	public boolean isSet(quickfix.field.DerivativeSecurityXMLData field) {
		return isSetField(field);
	}

	public boolean isSetDerivativeSecurityXMLData() {
		return isSetField(1283);
	}

	public void set(quickfix.field.DerivativeSecurityXMLSchema value) {
		setField(value);
	}

	public quickfix.field.DerivativeSecurityXMLSchema get(quickfix.field.DerivativeSecurityXMLSchema value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivativeSecurityXMLSchema getDerivativeSecurityXMLSchema() throws FieldNotFound {
		return get(new quickfix.field.DerivativeSecurityXMLSchema());
	}

	public boolean isSet(quickfix.field.DerivativeSecurityXMLSchema field) {
		return isSetField(field);
	}

	public boolean isSetDerivativeSecurityXMLSchema() {
		return isSetField(1284);
	}

	public void set(quickfix.field.DerivativeContractSettlMonth value) {
		setField(value);
	}

	public quickfix.field.DerivativeContractSettlMonth get(quickfix.field.DerivativeContractSettlMonth value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivativeContractSettlMonth getDerivativeContractSettlMonth() throws FieldNotFound {
		return get(new quickfix.field.DerivativeContractSettlMonth());
	}

	public boolean isSet(quickfix.field.DerivativeContractSettlMonth field) {
		return isSetField(field);
	}

	public boolean isSetDerivativeContractSettlMonth() {
		return isSetField(1285);
	}

	public void set(quickfix.fix50sp2.component.DerivativeEventsGrp component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.DerivativeEventsGrp get(quickfix.fix50sp2.component.DerivativeEventsGrp component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.DerivativeEventsGrp getDerivativeEventsGrp() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.DerivativeEventsGrp());
	}

	public void set(quickfix.field.NoDerivativeEvents value) {
		setField(value);
	}

	public quickfix.field.NoDerivativeEvents get(quickfix.field.NoDerivativeEvents value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoDerivativeEvents getNoDerivativeEvents() throws FieldNotFound {
		return get(new quickfix.field.NoDerivativeEvents());
	}

	public boolean isSet(quickfix.field.NoDerivativeEvents field) {
		return isSetField(field);
	}

	public boolean isSetNoDerivativeEvents() {
		return isSetField(1286);
	}

	public static class NoDerivativeEvents extends Group {

		static final long serialVersionUID = 20050617;

		public NoDerivativeEvents() {
			super(1286, 1287,
				new int[] {1287, 1288, 1289, 1290, 1291,  0 });
		}
		
	public void set(quickfix.field.DerivativeEventType value) {
		setField(value);
	}

	public quickfix.field.DerivativeEventType get(quickfix.field.DerivativeEventType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivativeEventType getDerivativeEventType() throws FieldNotFound {
		return get(new quickfix.field.DerivativeEventType());
	}

	public boolean isSet(quickfix.field.DerivativeEventType field) {
		return isSetField(field);
	}

	public boolean isSetDerivativeEventType() {
		return isSetField(1287);
	}

	public void set(quickfix.field.DerivativeEventDate value) {
		setField(value);
	}

	public quickfix.field.DerivativeEventDate get(quickfix.field.DerivativeEventDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivativeEventDate getDerivativeEventDate() throws FieldNotFound {
		return get(new quickfix.field.DerivativeEventDate());
	}

	public boolean isSet(quickfix.field.DerivativeEventDate field) {
		return isSetField(field);
	}

	public boolean isSetDerivativeEventDate() {
		return isSetField(1288);
	}

	public void set(quickfix.field.DerivativeEventTime value) {
		setField(value);
	}

	public quickfix.field.DerivativeEventTime get(quickfix.field.DerivativeEventTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivativeEventTime getDerivativeEventTime() throws FieldNotFound {
		return get(new quickfix.field.DerivativeEventTime());
	}

	public boolean isSet(quickfix.field.DerivativeEventTime field) {
		return isSetField(field);
	}

	public boolean isSetDerivativeEventTime() {
		return isSetField(1289);
	}

	public void set(quickfix.field.DerivativeEventPx value) {
		setField(value);
	}

	public quickfix.field.DerivativeEventPx get(quickfix.field.DerivativeEventPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivativeEventPx getDerivativeEventPx() throws FieldNotFound {
		return get(new quickfix.field.DerivativeEventPx());
	}

	public boolean isSet(quickfix.field.DerivativeEventPx field) {
		return isSetField(field);
	}

	public boolean isSetDerivativeEventPx() {
		return isSetField(1290);
	}

	public void set(quickfix.field.DerivativeEventText value) {
		setField(value);
	}

	public quickfix.field.DerivativeEventText get(quickfix.field.DerivativeEventText value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivativeEventText getDerivativeEventText() throws FieldNotFound {
		return get(new quickfix.field.DerivativeEventText());
	}

	public boolean isSet(quickfix.field.DerivativeEventText field) {
		return isSetField(field);
	}

	public boolean isSetDerivativeEventText() {
		return isSetField(1291);
	}

	}

	public void set(quickfix.fix50sp2.component.DerivativeInstrumentParties component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.DerivativeInstrumentParties get(quickfix.fix50sp2.component.DerivativeInstrumentParties component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.DerivativeInstrumentParties getDerivativeInstrumentParties() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.DerivativeInstrumentParties());
	}

	public void set(quickfix.field.NoDerivativeInstrumentParties value) {
		setField(value);
	}

	public quickfix.field.NoDerivativeInstrumentParties get(quickfix.field.NoDerivativeInstrumentParties value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoDerivativeInstrumentParties getNoDerivativeInstrumentParties() throws FieldNotFound {
		return get(new quickfix.field.NoDerivativeInstrumentParties());
	}

	public boolean isSet(quickfix.field.NoDerivativeInstrumentParties field) {
		return isSetField(field);
	}

	public boolean isSetNoDerivativeInstrumentParties() {
		return isSetField(1292);
	}

	public static class NoDerivativeInstrumentParties extends Group {

		static final long serialVersionUID = 20050617;

		public NoDerivativeInstrumentParties() {
			super(1292, 1293,
				new int[] {1293, 1294, 1295, 1296,  0 });
		}
		
	public void set(quickfix.field.DerivativeInstrumentPartyID value) {
		setField(value);
	}

	public quickfix.field.DerivativeInstrumentPartyID get(quickfix.field.DerivativeInstrumentPartyID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivativeInstrumentPartyID getDerivativeInstrumentPartyID() throws FieldNotFound {
		return get(new quickfix.field.DerivativeInstrumentPartyID());
	}

	public boolean isSet(quickfix.field.DerivativeInstrumentPartyID field) {
		return isSetField(field);
	}

	public boolean isSetDerivativeInstrumentPartyID() {
		return isSetField(1293);
	}

	public void set(quickfix.field.DerivativeInstrumentPartyIDSource value) {
		setField(value);
	}

	public quickfix.field.DerivativeInstrumentPartyIDSource get(quickfix.field.DerivativeInstrumentPartyIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivativeInstrumentPartyIDSource getDerivativeInstrumentPartyIDSource() throws FieldNotFound {
		return get(new quickfix.field.DerivativeInstrumentPartyIDSource());
	}

	public boolean isSet(quickfix.field.DerivativeInstrumentPartyIDSource field) {
		return isSetField(field);
	}

	public boolean isSetDerivativeInstrumentPartyIDSource() {
		return isSetField(1294);
	}

	public void set(quickfix.field.DerivativeInstrumentPartyRole value) {
		setField(value);
	}

	public quickfix.field.DerivativeInstrumentPartyRole get(quickfix.field.DerivativeInstrumentPartyRole value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivativeInstrumentPartyRole getDerivativeInstrumentPartyRole() throws FieldNotFound {
		return get(new quickfix.field.DerivativeInstrumentPartyRole());
	}

	public boolean isSet(quickfix.field.DerivativeInstrumentPartyRole field) {
		return isSetField(field);
	}

	public boolean isSetDerivativeInstrumentPartyRole() {
		return isSetField(1295);
	}

	public void set(quickfix.fix50sp2.component.DerivativeInstrumentPartySubIDsGrp component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.DerivativeInstrumentPartySubIDsGrp get(quickfix.fix50sp2.component.DerivativeInstrumentPartySubIDsGrp component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.DerivativeInstrumentPartySubIDsGrp getDerivativeInstrumentPartySubIDsGrp() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.DerivativeInstrumentPartySubIDsGrp());
	}

	public void set(quickfix.field.NoDerivativeInstrumentPartySubIDs value) {
		setField(value);
	}

	public quickfix.field.NoDerivativeInstrumentPartySubIDs get(quickfix.field.NoDerivativeInstrumentPartySubIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoDerivativeInstrumentPartySubIDs getNoDerivativeInstrumentPartySubIDs() throws FieldNotFound {
		return get(new quickfix.field.NoDerivativeInstrumentPartySubIDs());
	}

	public boolean isSet(quickfix.field.NoDerivativeInstrumentPartySubIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoDerivativeInstrumentPartySubIDs() {
		return isSetField(1296);
	}

	public static class NoDerivativeInstrumentPartySubIDs extends Group {

		static final long serialVersionUID = 20050617;

		public NoDerivativeInstrumentPartySubIDs() {
			super(1296, 1297,
				new int[] {1297, 1298,  0 });
		}
		
	public void set(quickfix.field.DerivativeInstrumentPartySubID value) {
		setField(value);
	}

	public quickfix.field.DerivativeInstrumentPartySubID get(quickfix.field.DerivativeInstrumentPartySubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivativeInstrumentPartySubID getDerivativeInstrumentPartySubID() throws FieldNotFound {
		return get(new quickfix.field.DerivativeInstrumentPartySubID());
	}

	public boolean isSet(quickfix.field.DerivativeInstrumentPartySubID field) {
		return isSetField(field);
	}

	public boolean isSetDerivativeInstrumentPartySubID() {
		return isSetField(1297);
	}

	public void set(quickfix.field.DerivativeInstrumentPartySubIDType value) {
		setField(value);
	}

	public quickfix.field.DerivativeInstrumentPartySubIDType get(quickfix.field.DerivativeInstrumentPartySubIDType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivativeInstrumentPartySubIDType getDerivativeInstrumentPartySubIDType() throws FieldNotFound {
		return get(new quickfix.field.DerivativeInstrumentPartySubIDType());
	}

	public boolean isSet(quickfix.field.DerivativeInstrumentPartySubIDType field) {
		return isSetField(field);
	}

	public boolean isSetDerivativeInstrumentPartySubIDType() {
		return isSetField(1298);
	}

	}

	}

	public void set(quickfix.fix50sp2.component.DerivativeInstrumentAttribute component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.DerivativeInstrumentAttribute get(quickfix.fix50sp2.component.DerivativeInstrumentAttribute component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.DerivativeInstrumentAttribute getDerivativeInstrumentAttribute() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.DerivativeInstrumentAttribute());
	}

	public void set(quickfix.field.NoDerivativeInstrAttrib value) {
		setField(value);
	}

	public quickfix.field.NoDerivativeInstrAttrib get(quickfix.field.NoDerivativeInstrAttrib value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoDerivativeInstrAttrib getNoDerivativeInstrAttrib() throws FieldNotFound {
		return get(new quickfix.field.NoDerivativeInstrAttrib());
	}

	public boolean isSet(quickfix.field.NoDerivativeInstrAttrib field) {
		return isSetField(field);
	}

	public boolean isSetNoDerivativeInstrAttrib() {
		return isSetField(1311);
	}

	public static class NoDerivativeInstrAttrib extends Group {

		static final long serialVersionUID = 20050617;

		public NoDerivativeInstrAttrib() {
			super(1311, 1313,
				new int[] {1313, 1314,  0 });
		}
		
	public void set(quickfix.field.DerivativeInstrAttribType value) {
		setField(value);
	}

	public quickfix.field.DerivativeInstrAttribType get(quickfix.field.DerivativeInstrAttribType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivativeInstrAttribType getDerivativeInstrAttribType() throws FieldNotFound {
		return get(new quickfix.field.DerivativeInstrAttribType());
	}

	public boolean isSet(quickfix.field.DerivativeInstrAttribType field) {
		return isSetField(field);
	}

	public boolean isSetDerivativeInstrAttribType() {
		return isSetField(1313);
	}

	public void set(quickfix.field.DerivativeInstrAttribValue value) {
		setField(value);
	}

	public quickfix.field.DerivativeInstrAttribValue get(quickfix.field.DerivativeInstrAttribValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DerivativeInstrAttribValue getDerivativeInstrAttribValue() throws FieldNotFound {
		return get(new quickfix.field.DerivativeInstrAttribValue());
	}

	public boolean isSet(quickfix.field.DerivativeInstrAttribValue field) {
		return isSetField(field);
	}

	public boolean isSetDerivativeInstrAttribValue() {
		return isSetField(1314);
	}

	}

	public void set(quickfix.fix50sp2.component.MarketSegmentGrp component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.MarketSegmentGrp get(quickfix.fix50sp2.component.MarketSegmentGrp component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.MarketSegmentGrp getMarketSegmentGrp() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.MarketSegmentGrp());
	}

	public void set(quickfix.field.NoMarketSegments value) {
		setField(value);
	}

	public quickfix.field.NoMarketSegments get(quickfix.field.NoMarketSegments value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoMarketSegments getNoMarketSegments() throws FieldNotFound {
		return get(new quickfix.field.NoMarketSegments());
	}

	public boolean isSet(quickfix.field.NoMarketSegments field) {
		return isSetField(field);
	}

	public boolean isSetNoMarketSegments() {
		return isSetField(1310);
	}

	public static class NoMarketSegments extends Group {

		static final long serialVersionUID = 20050617;

		public NoMarketSegments() {
			super(1310, 1301,
				new int[] {1301, 1300, 1205, 1234, 1306, 1148, 1149, 1150, 827, 562, 1140, 1143, 1144, 1245, 561, 1377, 1378, 423, 1309, 1312, 1201,  0 });
		}
		
	public void set(quickfix.field.MarketID value) {
		setField(value);
	}

	public quickfix.field.MarketID get(quickfix.field.MarketID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MarketID getMarketID() throws FieldNotFound {
		return get(new quickfix.field.MarketID());
	}

	public boolean isSet(quickfix.field.MarketID field) {
		return isSetField(field);
	}

	public boolean isSetMarketID() {
		return isSetField(1301);
	}

	public void set(quickfix.field.MarketSegmentID value) {
		setField(value);
	}

	public quickfix.field.MarketSegmentID get(quickfix.field.MarketSegmentID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MarketSegmentID getMarketSegmentID() throws FieldNotFound {
		return get(new quickfix.field.MarketSegmentID());
	}

	public boolean isSet(quickfix.field.MarketSegmentID field) {
		return isSetField(field);
	}

	public boolean isSetMarketSegmentID() {
		return isSetField(1300);
	}

	public void set(quickfix.fix50sp2.component.SecurityTradingRules component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.SecurityTradingRules get(quickfix.fix50sp2.component.SecurityTradingRules component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.SecurityTradingRules getSecurityTradingRules() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.SecurityTradingRules());
	}

	public void set(quickfix.fix50sp2.component.BaseTradingRules component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.BaseTradingRules get(quickfix.fix50sp2.component.BaseTradingRules component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.BaseTradingRules getBaseTradingRules() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.BaseTradingRules());
	}

	public void set(quickfix.fix50sp2.component.TickRules component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.TickRules get(quickfix.fix50sp2.component.TickRules component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.TickRules getTickRules() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.TickRules());
	}

	public void set(quickfix.field.NoTickRules value) {
		setField(value);
	}

	public quickfix.field.NoTickRules get(quickfix.field.NoTickRules value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoTickRules getNoTickRules() throws FieldNotFound {
		return get(new quickfix.field.NoTickRules());
	}

	public boolean isSet(quickfix.field.NoTickRules field) {
		return isSetField(field);
	}

	public boolean isSetNoTickRules() {
		return isSetField(1205);
	}

	public static class NoTickRules extends Group {

		static final long serialVersionUID = 20050617;

		public NoTickRules() {
			super(1205, 1206,
				new int[] {1206, 1207, 1208, 1209,  0 });
		}
		
	public void set(quickfix.field.StartTickPriceRange value) {
		setField(value);
	}

	public quickfix.field.StartTickPriceRange get(quickfix.field.StartTickPriceRange value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.StartTickPriceRange getStartTickPriceRange() throws FieldNotFound {
		return get(new quickfix.field.StartTickPriceRange());
	}

	public boolean isSet(quickfix.field.StartTickPriceRange field) {
		return isSetField(field);
	}

	public boolean isSetStartTickPriceRange() {
		return isSetField(1206);
	}

	public void set(quickfix.field.EndTickPriceRange value) {
		setField(value);
	}

	public quickfix.field.EndTickPriceRange get(quickfix.field.EndTickPriceRange value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EndTickPriceRange getEndTickPriceRange() throws FieldNotFound {
		return get(new quickfix.field.EndTickPriceRange());
	}

	public boolean isSet(quickfix.field.EndTickPriceRange field) {
		return isSetField(field);
	}

	public boolean isSetEndTickPriceRange() {
		return isSetField(1207);
	}

	public void set(quickfix.field.TickIncrement value) {
		setField(value);
	}

	public quickfix.field.TickIncrement get(quickfix.field.TickIncrement value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TickIncrement getTickIncrement() throws FieldNotFound {
		return get(new quickfix.field.TickIncrement());
	}

	public boolean isSet(quickfix.field.TickIncrement field) {
		return isSetField(field);
	}

	public boolean isSetTickIncrement() {
		return isSetField(1208);
	}

	public void set(quickfix.field.TickRuleType value) {
		setField(value);
	}

	public quickfix.field.TickRuleType get(quickfix.field.TickRuleType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TickRuleType getTickRuleType() throws FieldNotFound {
		return get(new quickfix.field.TickRuleType());
	}

	public boolean isSet(quickfix.field.TickRuleType field) {
		return isSetField(field);
	}

	public boolean isSetTickRuleType() {
		return isSetField(1209);
	}

	}

	public void set(quickfix.fix50sp2.component.LotTypeRules component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.LotTypeRules get(quickfix.fix50sp2.component.LotTypeRules component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.LotTypeRules getLotTypeRules() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.LotTypeRules());
	}

	public void set(quickfix.field.NoLotTypeRules value) {
		setField(value);
	}

	public quickfix.field.NoLotTypeRules get(quickfix.field.NoLotTypeRules value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoLotTypeRules getNoLotTypeRules() throws FieldNotFound {
		return get(new quickfix.field.NoLotTypeRules());
	}

	public boolean isSet(quickfix.field.NoLotTypeRules field) {
		return isSetField(field);
	}

	public boolean isSetNoLotTypeRules() {
		return isSetField(1234);
	}

	public static class NoLotTypeRules extends Group {

		static final long serialVersionUID = 20050617;

		public NoLotTypeRules() {
			super(1234, 1093,
				new int[] {1093, 1231,  0 });
		}
		
	public void set(quickfix.field.LotType value) {
		setField(value);
	}

	public quickfix.field.LotType get(quickfix.field.LotType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LotType getLotType() throws FieldNotFound {
		return get(new quickfix.field.LotType());
	}

	public boolean isSet(quickfix.field.LotType field) {
		return isSetField(field);
	}

	public boolean isSetLotType() {
		return isSetField(1093);
	}

	public void set(quickfix.field.MinLotSize value) {
		setField(value);
	}

	public quickfix.field.MinLotSize get(quickfix.field.MinLotSize value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MinLotSize getMinLotSize() throws FieldNotFound {
		return get(new quickfix.field.MinLotSize());
	}

	public boolean isSet(quickfix.field.MinLotSize field) {
		return isSetField(field);
	}

	public boolean isSetMinLotSize() {
		return isSetField(1231);
	}

	}

	public void set(quickfix.fix50sp2.component.PriceLimits component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.PriceLimits get(quickfix.fix50sp2.component.PriceLimits component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.PriceLimits getPriceLimits() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.PriceLimits());
	}

	public void set(quickfix.field.PriceLimitType value) {
		setField(value);
	}

	public quickfix.field.PriceLimitType get(quickfix.field.PriceLimitType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PriceLimitType getPriceLimitType() throws FieldNotFound {
		return get(new quickfix.field.PriceLimitType());
	}

	public boolean isSet(quickfix.field.PriceLimitType field) {
		return isSetField(field);
	}

	public boolean isSetPriceLimitType() {
		return isSetField(1306);
	}

	public void set(quickfix.field.LowLimitPrice value) {
		setField(value);
	}

	public quickfix.field.LowLimitPrice get(quickfix.field.LowLimitPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LowLimitPrice getLowLimitPrice() throws FieldNotFound {
		return get(new quickfix.field.LowLimitPrice());
	}

	public boolean isSet(quickfix.field.LowLimitPrice field) {
		return isSetField(field);
	}

	public boolean isSetLowLimitPrice() {
		return isSetField(1148);
	}

	public void set(quickfix.field.HighLimitPrice value) {
		setField(value);
	}

	public quickfix.field.HighLimitPrice get(quickfix.field.HighLimitPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.HighLimitPrice getHighLimitPrice() throws FieldNotFound {
		return get(new quickfix.field.HighLimitPrice());
	}

	public boolean isSet(quickfix.field.HighLimitPrice field) {
		return isSetField(field);
	}

	public boolean isSetHighLimitPrice() {
		return isSetField(1149);
	}

	public void set(quickfix.field.TradingReferencePrice value) {
		setField(value);
	}

	public quickfix.field.TradingReferencePrice get(quickfix.field.TradingReferencePrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TradingReferencePrice getTradingReferencePrice() throws FieldNotFound {
		return get(new quickfix.field.TradingReferencePrice());
	}

	public boolean isSet(quickfix.field.TradingReferencePrice field) {
		return isSetField(field);
	}

	public boolean isSetTradingReferencePrice() {
		return isSetField(1150);
	}

	public void set(quickfix.field.ExpirationCycle value) {
		setField(value);
	}

	public quickfix.field.ExpirationCycle get(quickfix.field.ExpirationCycle value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ExpirationCycle getExpirationCycle() throws FieldNotFound {
		return get(new quickfix.field.ExpirationCycle());
	}

	public boolean isSet(quickfix.field.ExpirationCycle field) {
		return isSetField(field);
	}

	public boolean isSetExpirationCycle() {
		return isSetField(827);
	}

	public void set(quickfix.field.MinTradeVol value) {
		setField(value);
	}

	public quickfix.field.MinTradeVol get(quickfix.field.MinTradeVol value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MinTradeVol getMinTradeVol() throws FieldNotFound {
		return get(new quickfix.field.MinTradeVol());
	}

	public boolean isSet(quickfix.field.MinTradeVol field) {
		return isSetField(field);
	}

	public boolean isSetMinTradeVol() {
		return isSetField(562);
	}

	public void set(quickfix.field.MaxTradeVol value) {
		setField(value);
	}

	public quickfix.field.MaxTradeVol get(quickfix.field.MaxTradeVol value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MaxTradeVol getMaxTradeVol() throws FieldNotFound {
		return get(new quickfix.field.MaxTradeVol());
	}

	public boolean isSet(quickfix.field.MaxTradeVol field) {
		return isSetField(field);
	}

	public boolean isSetMaxTradeVol() {
		return isSetField(1140);
	}

	public void set(quickfix.field.MaxPriceVariation value) {
		setField(value);
	}

	public quickfix.field.MaxPriceVariation get(quickfix.field.MaxPriceVariation value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MaxPriceVariation getMaxPriceVariation() throws FieldNotFound {
		return get(new quickfix.field.MaxPriceVariation());
	}

	public boolean isSet(quickfix.field.MaxPriceVariation field) {
		return isSetField(field);
	}

	public boolean isSetMaxPriceVariation() {
		return isSetField(1143);
	}

	public void set(quickfix.field.ImpliedMarketIndicator value) {
		setField(value);
	}

	public quickfix.field.ImpliedMarketIndicator get(quickfix.field.ImpliedMarketIndicator value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ImpliedMarketIndicator getImpliedMarketIndicator() throws FieldNotFound {
		return get(new quickfix.field.ImpliedMarketIndicator());
	}

	public boolean isSet(quickfix.field.ImpliedMarketIndicator field) {
		return isSetField(field);
	}

	public boolean isSetImpliedMarketIndicator() {
		return isSetField(1144);
	}

	public void set(quickfix.field.TradingCurrency value) {
		setField(value);
	}

	public quickfix.field.TradingCurrency get(quickfix.field.TradingCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TradingCurrency getTradingCurrency() throws FieldNotFound {
		return get(new quickfix.field.TradingCurrency());
	}

	public boolean isSet(quickfix.field.TradingCurrency field) {
		return isSetField(field);
	}

	public boolean isSetTradingCurrency() {
		return isSetField(1245);
	}

	public void set(quickfix.field.RoundLot value) {
		setField(value);
	}

	public quickfix.field.RoundLot get(quickfix.field.RoundLot value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RoundLot getRoundLot() throws FieldNotFound {
		return get(new quickfix.field.RoundLot());
	}

	public boolean isSet(quickfix.field.RoundLot field) {
		return isSetField(field);
	}

	public boolean isSetRoundLot() {
		return isSetField(561);
	}

	public void set(quickfix.field.MultilegModel value) {
		setField(value);
	}

	public quickfix.field.MultilegModel get(quickfix.field.MultilegModel value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MultilegModel getMultilegModel() throws FieldNotFound {
		return get(new quickfix.field.MultilegModel());
	}

	public boolean isSet(quickfix.field.MultilegModel field) {
		return isSetField(field);
	}

	public boolean isSetMultilegModel() {
		return isSetField(1377);
	}

	public void set(quickfix.field.MultilegPriceMethod value) {
		setField(value);
	}

	public quickfix.field.MultilegPriceMethod get(quickfix.field.MultilegPriceMethod value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MultilegPriceMethod getMultilegPriceMethod() throws FieldNotFound {
		return get(new quickfix.field.MultilegPriceMethod());
	}

	public boolean isSet(quickfix.field.MultilegPriceMethod field) {
		return isSetField(field);
	}

	public boolean isSetMultilegPriceMethod() {
		return isSetField(1378);
	}

	public void set(quickfix.field.PriceType value) {
		setField(value);
	}

	public quickfix.field.PriceType get(quickfix.field.PriceType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PriceType getPriceType() throws FieldNotFound {
		return get(new quickfix.field.PriceType());
	}

	public boolean isSet(quickfix.field.PriceType field) {
		return isSetField(field);
	}

	public boolean isSetPriceType() {
		return isSetField(423);
	}

	public void set(quickfix.fix50sp2.component.TradingSessionRulesGrp component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.TradingSessionRulesGrp get(quickfix.fix50sp2.component.TradingSessionRulesGrp component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.TradingSessionRulesGrp getTradingSessionRulesGrp() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.TradingSessionRulesGrp());
	}

	public void set(quickfix.field.NoTradingSessionRules value) {
		setField(value);
	}

	public quickfix.field.NoTradingSessionRules get(quickfix.field.NoTradingSessionRules value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoTradingSessionRules getNoTradingSessionRules() throws FieldNotFound {
		return get(new quickfix.field.NoTradingSessionRules());
	}

	public boolean isSet(quickfix.field.NoTradingSessionRules field) {
		return isSetField(field);
	}

	public boolean isSetNoTradingSessionRules() {
		return isSetField(1309);
	}

	public static class NoTradingSessionRules extends Group {

		static final long serialVersionUID = 20050617;

		public NoTradingSessionRules() {
			super(1309, 336,
				new int[] {336, 625, 1237, 1239, 1232, 1235, 1141,  0 });
		}
		
	public void set(quickfix.field.TradingSessionID value) {
		setField(value);
	}

	public quickfix.field.TradingSessionID get(quickfix.field.TradingSessionID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TradingSessionID getTradingSessionID() throws FieldNotFound {
		return get(new quickfix.field.TradingSessionID());
	}

	public boolean isSet(quickfix.field.TradingSessionID field) {
		return isSetField(field);
	}

	public boolean isSetTradingSessionID() {
		return isSetField(336);
	}

	public void set(quickfix.field.TradingSessionSubID value) {
		setField(value);
	}

	public quickfix.field.TradingSessionSubID get(quickfix.field.TradingSessionSubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TradingSessionSubID getTradingSessionSubID() throws FieldNotFound {
		return get(new quickfix.field.TradingSessionSubID());
	}

	public boolean isSet(quickfix.field.TradingSessionSubID field) {
		return isSetField(field);
	}

	public boolean isSetTradingSessionSubID() {
		return isSetField(625);
	}

	public void set(quickfix.fix50sp2.component.TradingSessionRules component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.TradingSessionRules get(quickfix.fix50sp2.component.TradingSessionRules component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.TradingSessionRules getTradingSessionRules() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.TradingSessionRules());
	}

	public void set(quickfix.fix50sp2.component.OrdTypeRules component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.OrdTypeRules get(quickfix.fix50sp2.component.OrdTypeRules component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.OrdTypeRules getOrdTypeRules() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.OrdTypeRules());
	}

	public void set(quickfix.field.NoOrdTypeRules value) {
		setField(value);
	}

	public quickfix.field.NoOrdTypeRules get(quickfix.field.NoOrdTypeRules value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoOrdTypeRules getNoOrdTypeRules() throws FieldNotFound {
		return get(new quickfix.field.NoOrdTypeRules());
	}

	public boolean isSet(quickfix.field.NoOrdTypeRules field) {
		return isSetField(field);
	}

	public boolean isSetNoOrdTypeRules() {
		return isSetField(1237);
	}

	public static class NoOrdTypeRules extends Group {

		static final long serialVersionUID = 20050617;

		public NoOrdTypeRules() {
			super(1237, 40,
				new int[] {40,  0 });
		}
		
	public void set(quickfix.field.OrdType value) {
		setField(value);
	}

	public quickfix.field.OrdType get(quickfix.field.OrdType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OrdType getOrdType() throws FieldNotFound {
		return get(new quickfix.field.OrdType());
	}

	public boolean isSet(quickfix.field.OrdType field) {
		return isSetField(field);
	}

	public boolean isSetOrdType() {
		return isSetField(40);
	}

	}

	public void set(quickfix.fix50sp2.component.TimeInForceRules component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.TimeInForceRules get(quickfix.fix50sp2.component.TimeInForceRules component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.TimeInForceRules getTimeInForceRules() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.TimeInForceRules());
	}

	public void set(quickfix.field.NoTimeInForceRules value) {
		setField(value);
	}

	public quickfix.field.NoTimeInForceRules get(quickfix.field.NoTimeInForceRules value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoTimeInForceRules getNoTimeInForceRules() throws FieldNotFound {
		return get(new quickfix.field.NoTimeInForceRules());
	}

	public boolean isSet(quickfix.field.NoTimeInForceRules field) {
		return isSetField(field);
	}

	public boolean isSetNoTimeInForceRules() {
		return isSetField(1239);
	}

	public static class NoTimeInForceRules extends Group {

		static final long serialVersionUID = 20050617;

		public NoTimeInForceRules() {
			super(1239, 59,
				new int[] {59,  0 });
		}
		
	public void set(quickfix.field.TimeInForce value) {
		setField(value);
	}

	public quickfix.field.TimeInForce get(quickfix.field.TimeInForce value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TimeInForce getTimeInForce() throws FieldNotFound {
		return get(new quickfix.field.TimeInForce());
	}

	public boolean isSet(quickfix.field.TimeInForce field) {
		return isSetField(field);
	}

	public boolean isSetTimeInForce() {
		return isSetField(59);
	}

	}

	public void set(quickfix.fix50sp2.component.ExecInstRules component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.ExecInstRules get(quickfix.fix50sp2.component.ExecInstRules component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.ExecInstRules getExecInstRules() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.ExecInstRules());
	}

	public void set(quickfix.field.NoExecInstRules value) {
		setField(value);
	}

	public quickfix.field.NoExecInstRules get(quickfix.field.NoExecInstRules value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoExecInstRules getNoExecInstRules() throws FieldNotFound {
		return get(new quickfix.field.NoExecInstRules());
	}

	public boolean isSet(quickfix.field.NoExecInstRules field) {
		return isSetField(field);
	}

	public boolean isSetNoExecInstRules() {
		return isSetField(1232);
	}

	public static class NoExecInstRules extends Group {

		static final long serialVersionUID = 20050617;

		public NoExecInstRules() {
			super(1232, 1308,
				new int[] {1308,  0 });
		}
		
	public void set(quickfix.field.ExecInstValue value) {
		setField(value);
	}

	public quickfix.field.ExecInstValue get(quickfix.field.ExecInstValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ExecInstValue getExecInstValue() throws FieldNotFound {
		return get(new quickfix.field.ExecInstValue());
	}

	public boolean isSet(quickfix.field.ExecInstValue field) {
		return isSetField(field);
	}

	public boolean isSetExecInstValue() {
		return isSetField(1308);
	}

	}

	public void set(quickfix.fix50sp2.component.MatchRules component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.MatchRules get(quickfix.fix50sp2.component.MatchRules component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.MatchRules getMatchRules() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.MatchRules());
	}

	public void set(quickfix.field.NoMatchRules value) {
		setField(value);
	}

	public quickfix.field.NoMatchRules get(quickfix.field.NoMatchRules value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoMatchRules getNoMatchRules() throws FieldNotFound {
		return get(new quickfix.field.NoMatchRules());
	}

	public boolean isSet(quickfix.field.NoMatchRules field) {
		return isSetField(field);
	}

	public boolean isSetNoMatchRules() {
		return isSetField(1235);
	}

	public static class NoMatchRules extends Group {

		static final long serialVersionUID = 20050617;

		public NoMatchRules() {
			super(1235, 1142,
				new int[] {1142, 574,  0 });
		}
		
	public void set(quickfix.field.MatchAlgorithm value) {
		setField(value);
	}

	public quickfix.field.MatchAlgorithm get(quickfix.field.MatchAlgorithm value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MatchAlgorithm getMatchAlgorithm() throws FieldNotFound {
		return get(new quickfix.field.MatchAlgorithm());
	}

	public boolean isSet(quickfix.field.MatchAlgorithm field) {
		return isSetField(field);
	}

	public boolean isSetMatchAlgorithm() {
		return isSetField(1142);
	}

	public void set(quickfix.field.MatchType value) {
		setField(value);
	}

	public quickfix.field.MatchType get(quickfix.field.MatchType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MatchType getMatchType() throws FieldNotFound {
		return get(new quickfix.field.MatchType());
	}

	public boolean isSet(quickfix.field.MatchType field) {
		return isSetField(field);
	}

	public boolean isSetMatchType() {
		return isSetField(574);
	}

	}

	public void set(quickfix.fix50sp2.component.MarketDataFeedTypes component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.MarketDataFeedTypes get(quickfix.fix50sp2.component.MarketDataFeedTypes component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.MarketDataFeedTypes getMarketDataFeedTypes() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.MarketDataFeedTypes());
	}

	public void set(quickfix.field.NoMDFeedTypes value) {
		setField(value);
	}

	public quickfix.field.NoMDFeedTypes get(quickfix.field.NoMDFeedTypes value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoMDFeedTypes getNoMDFeedTypes() throws FieldNotFound {
		return get(new quickfix.field.NoMDFeedTypes());
	}

	public boolean isSet(quickfix.field.NoMDFeedTypes field) {
		return isSetField(field);
	}

	public boolean isSetNoMDFeedTypes() {
		return isSetField(1141);
	}

	public static class NoMDFeedTypes extends Group {

		static final long serialVersionUID = 20050617;

		public NoMDFeedTypes() {
			super(1141, 1022,
				new int[] {1022, 264, 1021,  0 });
		}
		
	public void set(quickfix.field.MDFeedType value) {
		setField(value);
	}

	public quickfix.field.MDFeedType get(quickfix.field.MDFeedType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MDFeedType getMDFeedType() throws FieldNotFound {
		return get(new quickfix.field.MDFeedType());
	}

	public boolean isSet(quickfix.field.MDFeedType field) {
		return isSetField(field);
	}

	public boolean isSetMDFeedType() {
		return isSetField(1022);
	}

	public void set(quickfix.field.MarketDepth value) {
		setField(value);
	}

	public quickfix.field.MarketDepth get(quickfix.field.MarketDepth value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MarketDepth getMarketDepth() throws FieldNotFound {
		return get(new quickfix.field.MarketDepth());
	}

	public boolean isSet(quickfix.field.MarketDepth field) {
		return isSetField(field);
	}

	public boolean isSetMarketDepth() {
		return isSetField(264);
	}

	public void set(quickfix.field.MDBookType value) {
		setField(value);
	}

	public quickfix.field.MDBookType get(quickfix.field.MDBookType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MDBookType getMDBookType() throws FieldNotFound {
		return get(new quickfix.field.MDBookType());
	}

	public boolean isSet(quickfix.field.MDBookType field) {
		return isSetField(field);
	}

	public boolean isSetMDBookType() {
		return isSetField(1021);
	}

	}

	}

	public void set(quickfix.fix50sp2.component.NestedInstrumentAttribute component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.NestedInstrumentAttribute get(quickfix.fix50sp2.component.NestedInstrumentAttribute component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.NestedInstrumentAttribute getNestedInstrumentAttribute() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.NestedInstrumentAttribute());
	}

	public void set(quickfix.field.NoNestedInstrAttrib value) {
		setField(value);
	}

	public quickfix.field.NoNestedInstrAttrib get(quickfix.field.NoNestedInstrAttrib value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoNestedInstrAttrib getNoNestedInstrAttrib() throws FieldNotFound {
		return get(new quickfix.field.NoNestedInstrAttrib());
	}

	public boolean isSet(quickfix.field.NoNestedInstrAttrib field) {
		return isSetField(field);
	}

	public boolean isSetNoNestedInstrAttrib() {
		return isSetField(1312);
	}

	public static class NoNestedInstrAttrib extends Group {

		static final long serialVersionUID = 20050617;

		public NoNestedInstrAttrib() {
			super(1312, 1210,
				new int[] {1210, 1211,  0 });
		}
		
	public void set(quickfix.field.NestedInstrAttribType value) {
		setField(value);
	}

	public quickfix.field.NestedInstrAttribType get(quickfix.field.NestedInstrAttribType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NestedInstrAttribType getNestedInstrAttribType() throws FieldNotFound {
		return get(new quickfix.field.NestedInstrAttribType());
	}

	public boolean isSet(quickfix.field.NestedInstrAttribType field) {
		return isSetField(field);
	}

	public boolean isSetNestedInstrAttribType() {
		return isSetField(1210);
	}

	public void set(quickfix.field.NestedInstrAttribValue value) {
		setField(value);
	}

	public quickfix.field.NestedInstrAttribValue get(quickfix.field.NestedInstrAttribValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NestedInstrAttribValue getNestedInstrAttribValue() throws FieldNotFound {
		return get(new quickfix.field.NestedInstrAttribValue());
	}

	public boolean isSet(quickfix.field.NestedInstrAttribValue field) {
		return isSetField(field);
	}

	public boolean isSetNestedInstrAttribValue() {
		return isSetField(1211);
	}

	}

	public void set(quickfix.fix50sp2.component.StrikeRules component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.StrikeRules get(quickfix.fix50sp2.component.StrikeRules component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.StrikeRules getStrikeRules() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.StrikeRules());
	}

	public void set(quickfix.field.NoStrikeRules value) {
		setField(value);
	}

	public quickfix.field.NoStrikeRules get(quickfix.field.NoStrikeRules value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoStrikeRules getNoStrikeRules() throws FieldNotFound {
		return get(new quickfix.field.NoStrikeRules());
	}

	public boolean isSet(quickfix.field.NoStrikeRules field) {
		return isSetField(field);
	}

	public boolean isSetNoStrikeRules() {
		return isSetField(1201);
	}

	public static class NoStrikeRules extends Group {

		static final long serialVersionUID = 20050617;

		public NoStrikeRules() {
			super(1201, 1223,
				new int[] {1223, 1202, 1203, 1204, 1304, 1236,  0 });
		}
		
	public void set(quickfix.field.StrikeRuleID value) {
		setField(value);
	}

	public quickfix.field.StrikeRuleID get(quickfix.field.StrikeRuleID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.StrikeRuleID getStrikeRuleID() throws FieldNotFound {
		return get(new quickfix.field.StrikeRuleID());
	}

	public boolean isSet(quickfix.field.StrikeRuleID field) {
		return isSetField(field);
	}

	public boolean isSetStrikeRuleID() {
		return isSetField(1223);
	}

	public void set(quickfix.field.StartStrikePxRange value) {
		setField(value);
	}

	public quickfix.field.StartStrikePxRange get(quickfix.field.StartStrikePxRange value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.StartStrikePxRange getStartStrikePxRange() throws FieldNotFound {
		return get(new quickfix.field.StartStrikePxRange());
	}

	public boolean isSet(quickfix.field.StartStrikePxRange field) {
		return isSetField(field);
	}

	public boolean isSetStartStrikePxRange() {
		return isSetField(1202);
	}

	public void set(quickfix.field.EndStrikePxRange value) {
		setField(value);
	}

	public quickfix.field.EndStrikePxRange get(quickfix.field.EndStrikePxRange value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EndStrikePxRange getEndStrikePxRange() throws FieldNotFound {
		return get(new quickfix.field.EndStrikePxRange());
	}

	public boolean isSet(quickfix.field.EndStrikePxRange field) {
		return isSetField(field);
	}

	public boolean isSetEndStrikePxRange() {
		return isSetField(1203);
	}

	public void set(quickfix.field.StrikeIncrement value) {
		setField(value);
	}

	public quickfix.field.StrikeIncrement get(quickfix.field.StrikeIncrement value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.StrikeIncrement getStrikeIncrement() throws FieldNotFound {
		return get(new quickfix.field.StrikeIncrement());
	}

	public boolean isSet(quickfix.field.StrikeIncrement field) {
		return isSetField(field);
	}

	public boolean isSetStrikeIncrement() {
		return isSetField(1204);
	}

	public void set(quickfix.field.StrikeExerciseStyle value) {
		setField(value);
	}

	public quickfix.field.StrikeExerciseStyle get(quickfix.field.StrikeExerciseStyle value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.StrikeExerciseStyle getStrikeExerciseStyle() throws FieldNotFound {
		return get(new quickfix.field.StrikeExerciseStyle());
	}

	public boolean isSet(quickfix.field.StrikeExerciseStyle field) {
		return isSetField(field);
	}

	public boolean isSetStrikeExerciseStyle() {
		return isSetField(1304);
	}

	public void set(quickfix.fix50sp2.component.MaturityRules component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.MaturityRules get(quickfix.fix50sp2.component.MaturityRules component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.MaturityRules getMaturityRules() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.MaturityRules());
	}

	public void set(quickfix.field.NoMaturityRules value) {
		setField(value);
	}

	public quickfix.field.NoMaturityRules get(quickfix.field.NoMaturityRules value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoMaturityRules getNoMaturityRules() throws FieldNotFound {
		return get(new quickfix.field.NoMaturityRules());
	}

	public boolean isSet(quickfix.field.NoMaturityRules field) {
		return isSetField(field);
	}

	public boolean isSetNoMaturityRules() {
		return isSetField(1236);
	}

	public static class NoMaturityRules extends Group {

		static final long serialVersionUID = 20050617;

		public NoMaturityRules() {
			super(1236, 1222,
				new int[] {1222, 1303, 1302, 1241, 1226, 1229,  0 });
		}
		
	public void set(quickfix.field.MaturityRuleID value) {
		setField(value);
	}

	public quickfix.field.MaturityRuleID get(quickfix.field.MaturityRuleID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MaturityRuleID getMaturityRuleID() throws FieldNotFound {
		return get(new quickfix.field.MaturityRuleID());
	}

	public boolean isSet(quickfix.field.MaturityRuleID field) {
		return isSetField(field);
	}

	public boolean isSetMaturityRuleID() {
		return isSetField(1222);
	}

	public void set(quickfix.field.MaturityMonthYearFormat value) {
		setField(value);
	}

	public quickfix.field.MaturityMonthYearFormat get(quickfix.field.MaturityMonthYearFormat value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MaturityMonthYearFormat getMaturityMonthYearFormat() throws FieldNotFound {
		return get(new quickfix.field.MaturityMonthYearFormat());
	}

	public boolean isSet(quickfix.field.MaturityMonthYearFormat field) {
		return isSetField(field);
	}

	public boolean isSetMaturityMonthYearFormat() {
		return isSetField(1303);
	}

	public void set(quickfix.field.MaturityMonthYearIncrementUnits value) {
		setField(value);
	}

	public quickfix.field.MaturityMonthYearIncrementUnits get(quickfix.field.MaturityMonthYearIncrementUnits value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MaturityMonthYearIncrementUnits getMaturityMonthYearIncrementUnits() throws FieldNotFound {
		return get(new quickfix.field.MaturityMonthYearIncrementUnits());
	}

	public boolean isSet(quickfix.field.MaturityMonthYearIncrementUnits field) {
		return isSetField(field);
	}

	public boolean isSetMaturityMonthYearIncrementUnits() {
		return isSetField(1302);
	}

	public void set(quickfix.field.StartMaturityMonthYear value) {
		setField(value);
	}

	public quickfix.field.StartMaturityMonthYear get(quickfix.field.StartMaturityMonthYear value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.StartMaturityMonthYear getStartMaturityMonthYear() throws FieldNotFound {
		return get(new quickfix.field.StartMaturityMonthYear());
	}

	public boolean isSet(quickfix.field.StartMaturityMonthYear field) {
		return isSetField(field);
	}

	public boolean isSetStartMaturityMonthYear() {
		return isSetField(1241);
	}

	public void set(quickfix.field.EndMaturityMonthYear value) {
		setField(value);
	}

	public quickfix.field.EndMaturityMonthYear get(quickfix.field.EndMaturityMonthYear value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EndMaturityMonthYear getEndMaturityMonthYear() throws FieldNotFound {
		return get(new quickfix.field.EndMaturityMonthYear());
	}

	public boolean isSet(quickfix.field.EndMaturityMonthYear field) {
		return isSetField(field);
	}

	public boolean isSetEndMaturityMonthYear() {
		return isSetField(1226);
	}

	public void set(quickfix.field.MaturityMonthYearIncrement value) {
		setField(value);
	}

	public quickfix.field.MaturityMonthYearIncrement get(quickfix.field.MaturityMonthYearIncrement value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MaturityMonthYearIncrement getMaturityMonthYearIncrement() throws FieldNotFound {
		return get(new quickfix.field.MaturityMonthYearIncrement());
	}

	public boolean isSet(quickfix.field.MaturityMonthYearIncrement field) {
		return isSetField(field);
	}

	public boolean isSetMaturityMonthYearIncrement() {
		return isSetField(1229);
	}

	}

	}

	}

	public void set(quickfix.field.TransactTime value) {
		setField(value);
	}

	public quickfix.field.TransactTime get(quickfix.field.TransactTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TransactTime getTransactTime() throws FieldNotFound {
		return get(new quickfix.field.TransactTime());
	}

	public boolean isSet(quickfix.field.TransactTime field) {
		return isSetField(field);
	}

	public boolean isSetTransactTime() {
		return isSetField(60);
	}

	public void set(quickfix.field.TotNoRelatedSym value) {
		setField(value);
	}

	public quickfix.field.TotNoRelatedSym get(quickfix.field.TotNoRelatedSym value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TotNoRelatedSym getTotNoRelatedSym() throws FieldNotFound {
		return get(new quickfix.field.TotNoRelatedSym());
	}

	public boolean isSet(quickfix.field.TotNoRelatedSym field) {
		return isSetField(field);
	}

	public boolean isSetTotNoRelatedSym() {
		return isSetField(393);
	}

	public void set(quickfix.field.LastFragment value) {
		setField(value);
	}

	public quickfix.field.LastFragment get(quickfix.field.LastFragment value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LastFragment getLastFragment() throws FieldNotFound {
		return get(new quickfix.field.LastFragment());
	}

	public boolean isSet(quickfix.field.LastFragment field) {
		return isSetField(field);
	}

	public boolean isSetLastFragment() {
		return isSetField(893);
	}

	public void set(quickfix.fix50sp2.component.RelSymDerivSecGrp component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.RelSymDerivSecGrp get(quickfix.fix50sp2.component.RelSymDerivSecGrp component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.RelSymDerivSecGrp getRelSymDerivSecGrp() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.RelSymDerivSecGrp());
	}

	public void set(quickfix.field.NoRelatedSym value) {
		setField(value);
	}

	public quickfix.field.NoRelatedSym get(quickfix.field.NoRelatedSym value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoRelatedSym getNoRelatedSym() throws FieldNotFound {
		return get(new quickfix.field.NoRelatedSym());
	}

	public boolean isSet(quickfix.field.NoRelatedSym field) {
		return isSetField(field);
	}

	public boolean isSetNoRelatedSym() {
		return isSetField(146);
	}

	public static class NoRelatedSym extends Group {

		static final long serialVersionUID = 20050617;

		public NoRelatedSym() {
			super(146, 55,
				new int[] {55, 65, 48, 22, 454, 460, 1227, 1151, 461, 167, 762, 200, 541, 1079, 966, 1049, 965, 224, 1449, 1450, 1451, 1452, 1457, 1458, 225, 239, 226, 227, 228, 255, 543, 470, 471, 472, 240, 202, 947, 967, 968, 1478, 1479, 1480, 1481, 206, 231, 1435, 1439, 969, 1146, 996, 1147, 1191, 1192, 1193, 1194, 1482, 1195, 1196, 1197, 1198, 1199, 1200, 201, 1244, 1242, 997, 223, 207, 970, 971, 106, 348, 349, 107, 350, 351, 1184, 1185, 1186, 691, 667, 875, 876, 864, 873, 874, 1018, 1483, 1305, 1221, 1230, 1240, 15, 292, 668, 869, 870, 555, 1504, 58, 354, 355,  0 });
		}
		
	public void set(quickfix.fix50sp2.component.Instrument component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.Instrument get(quickfix.fix50sp2.component.Instrument component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.Instrument getInstrument() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.Instrument());
	}

	public void set(quickfix.field.Symbol value) {
		setField(value);
	}

	public quickfix.field.Symbol get(quickfix.field.Symbol value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Symbol getSymbol() throws FieldNotFound {
		return get(new quickfix.field.Symbol());
	}

	public boolean isSet(quickfix.field.Symbol field) {
		return isSetField(field);
	}

	public boolean isSetSymbol() {
		return isSetField(55);
	}

	public void set(quickfix.field.SymbolSfx value) {
		setField(value);
	}

	public quickfix.field.SymbolSfx get(quickfix.field.SymbolSfx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SymbolSfx getSymbolSfx() throws FieldNotFound {
		return get(new quickfix.field.SymbolSfx());
	}

	public boolean isSet(quickfix.field.SymbolSfx field) {
		return isSetField(field);
	}

	public boolean isSetSymbolSfx() {
		return isSetField(65);
	}

	public void set(quickfix.field.SecurityID value) {
		setField(value);
	}

	public quickfix.field.SecurityID get(quickfix.field.SecurityID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecurityID getSecurityID() throws FieldNotFound {
		return get(new quickfix.field.SecurityID());
	}

	public boolean isSet(quickfix.field.SecurityID field) {
		return isSetField(field);
	}

	public boolean isSetSecurityID() {
		return isSetField(48);
	}

	public void set(quickfix.field.SecurityIDSource value) {
		setField(value);
	}

	public quickfix.field.SecurityIDSource get(quickfix.field.SecurityIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecurityIDSource getSecurityIDSource() throws FieldNotFound {
		return get(new quickfix.field.SecurityIDSource());
	}

	public boolean isSet(quickfix.field.SecurityIDSource field) {
		return isSetField(field);
	}

	public boolean isSetSecurityIDSource() {
		return isSetField(22);
	}

	public void set(quickfix.fix50sp2.component.SecAltIDGrp component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.SecAltIDGrp get(quickfix.fix50sp2.component.SecAltIDGrp component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.SecAltIDGrp getSecAltIDGrp() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.SecAltIDGrp());
	}

	public void set(quickfix.field.NoSecurityAltID value) {
		setField(value);
	}

	public quickfix.field.NoSecurityAltID get(quickfix.field.NoSecurityAltID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoSecurityAltID getNoSecurityAltID() throws FieldNotFound {
		return get(new quickfix.field.NoSecurityAltID());
	}

	public boolean isSet(quickfix.field.NoSecurityAltID field) {
		return isSetField(field);
	}

	public boolean isSetNoSecurityAltID() {
		return isSetField(454);
	}

	public static class NoSecurityAltID extends Group {

		static final long serialVersionUID = 20050617;

		public NoSecurityAltID() {
			super(454, 455,
				new int[] {455, 456,  0 });
		}
		
	public void set(quickfix.field.SecurityAltID value) {
		setField(value);
	}

	public quickfix.field.SecurityAltID get(quickfix.field.SecurityAltID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecurityAltID getSecurityAltID() throws FieldNotFound {
		return get(new quickfix.field.SecurityAltID());
	}

	public boolean isSet(quickfix.field.SecurityAltID field) {
		return isSetField(field);
	}

	public boolean isSetSecurityAltID() {
		return isSetField(455);
	}

	public void set(quickfix.field.SecurityAltIDSource value) {
		setField(value);
	}

	public quickfix.field.SecurityAltIDSource get(quickfix.field.SecurityAltIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecurityAltIDSource getSecurityAltIDSource() throws FieldNotFound {
		return get(new quickfix.field.SecurityAltIDSource());
	}

	public boolean isSet(quickfix.field.SecurityAltIDSource field) {
		return isSetField(field);
	}

	public boolean isSetSecurityAltIDSource() {
		return isSetField(456);
	}

	}

	public void set(quickfix.field.Product value) {
		setField(value);
	}

	public quickfix.field.Product get(quickfix.field.Product value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Product getProduct() throws FieldNotFound {
		return get(new quickfix.field.Product());
	}

	public boolean isSet(quickfix.field.Product field) {
		return isSetField(field);
	}

	public boolean isSetProduct() {
		return isSetField(460);
	}

	public void set(quickfix.field.ProductComplex value) {
		setField(value);
	}

	public quickfix.field.ProductComplex get(quickfix.field.ProductComplex value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ProductComplex getProductComplex() throws FieldNotFound {
		return get(new quickfix.field.ProductComplex());
	}

	public boolean isSet(quickfix.field.ProductComplex field) {
		return isSetField(field);
	}

	public boolean isSetProductComplex() {
		return isSetField(1227);
	}

	public void set(quickfix.field.SecurityGroup value) {
		setField(value);
	}

	public quickfix.field.SecurityGroup get(quickfix.field.SecurityGroup value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecurityGroup getSecurityGroup() throws FieldNotFound {
		return get(new quickfix.field.SecurityGroup());
	}

	public boolean isSet(quickfix.field.SecurityGroup field) {
		return isSetField(field);
	}

	public boolean isSetSecurityGroup() {
		return isSetField(1151);
	}

	public void set(quickfix.field.CFICode value) {
		setField(value);
	}

	public quickfix.field.CFICode get(quickfix.field.CFICode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CFICode getCFICode() throws FieldNotFound {
		return get(new quickfix.field.CFICode());
	}

	public boolean isSet(quickfix.field.CFICode field) {
		return isSetField(field);
	}

	public boolean isSetCFICode() {
		return isSetField(461);
	}

	public void set(quickfix.field.SecurityType value) {
		setField(value);
	}

	public quickfix.field.SecurityType get(quickfix.field.SecurityType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecurityType getSecurityType() throws FieldNotFound {
		return get(new quickfix.field.SecurityType());
	}

	public boolean isSet(quickfix.field.SecurityType field) {
		return isSetField(field);
	}

	public boolean isSetSecurityType() {
		return isSetField(167);
	}

	public void set(quickfix.field.SecuritySubType value) {
		setField(value);
	}

	public quickfix.field.SecuritySubType get(quickfix.field.SecuritySubType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecuritySubType getSecuritySubType() throws FieldNotFound {
		return get(new quickfix.field.SecuritySubType());
	}

	public boolean isSet(quickfix.field.SecuritySubType field) {
		return isSetField(field);
	}

	public boolean isSetSecuritySubType() {
		return isSetField(762);
	}

	public void set(quickfix.field.MaturityMonthYear value) {
		setField(value);
	}

	public quickfix.field.MaturityMonthYear get(quickfix.field.MaturityMonthYear value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MaturityMonthYear getMaturityMonthYear() throws FieldNotFound {
		return get(new quickfix.field.MaturityMonthYear());
	}

	public boolean isSet(quickfix.field.MaturityMonthYear field) {
		return isSetField(field);
	}

	public boolean isSetMaturityMonthYear() {
		return isSetField(200);
	}

	public void set(quickfix.field.MaturityDate value) {
		setField(value);
	}

	public quickfix.field.MaturityDate get(quickfix.field.MaturityDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MaturityDate getMaturityDate() throws FieldNotFound {
		return get(new quickfix.field.MaturityDate());
	}

	public boolean isSet(quickfix.field.MaturityDate field) {
		return isSetField(field);
	}

	public boolean isSetMaturityDate() {
		return isSetField(541);
	}

	public void set(quickfix.field.MaturityTime value) {
		setField(value);
	}

	public quickfix.field.MaturityTime get(quickfix.field.MaturityTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MaturityTime getMaturityTime() throws FieldNotFound {
		return get(new quickfix.field.MaturityTime());
	}

	public boolean isSet(quickfix.field.MaturityTime field) {
		return isSetField(field);
	}

	public boolean isSetMaturityTime() {
		return isSetField(1079);
	}

	public void set(quickfix.field.SettleOnOpenFlag value) {
		setField(value);
	}

	public quickfix.field.SettleOnOpenFlag get(quickfix.field.SettleOnOpenFlag value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SettleOnOpenFlag getSettleOnOpenFlag() throws FieldNotFound {
		return get(new quickfix.field.SettleOnOpenFlag());
	}

	public boolean isSet(quickfix.field.SettleOnOpenFlag field) {
		return isSetField(field);
	}

	public boolean isSetSettleOnOpenFlag() {
		return isSetField(966);
	}

	public void set(quickfix.field.InstrmtAssignmentMethod value) {
		setField(value);
	}

	public quickfix.field.InstrmtAssignmentMethod get(quickfix.field.InstrmtAssignmentMethod value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.InstrmtAssignmentMethod getInstrmtAssignmentMethod() throws FieldNotFound {
		return get(new quickfix.field.InstrmtAssignmentMethod());
	}

	public boolean isSet(quickfix.field.InstrmtAssignmentMethod field) {
		return isSetField(field);
	}

	public boolean isSetInstrmtAssignmentMethod() {
		return isSetField(1049);
	}

	public void set(quickfix.field.SecurityStatus value) {
		setField(value);
	}

	public quickfix.field.SecurityStatus get(quickfix.field.SecurityStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecurityStatus getSecurityStatus() throws FieldNotFound {
		return get(new quickfix.field.SecurityStatus());
	}

	public boolean isSet(quickfix.field.SecurityStatus field) {
		return isSetField(field);
	}

	public boolean isSetSecurityStatus() {
		return isSetField(965);
	}

	public void set(quickfix.field.CouponPaymentDate value) {
		setField(value);
	}

	public quickfix.field.CouponPaymentDate get(quickfix.field.CouponPaymentDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CouponPaymentDate getCouponPaymentDate() throws FieldNotFound {
		return get(new quickfix.field.CouponPaymentDate());
	}

	public boolean isSet(quickfix.field.CouponPaymentDate field) {
		return isSetField(field);
	}

	public boolean isSetCouponPaymentDate() {
		return isSetField(224);
	}

	public void set(quickfix.field.RestructuringType value) {
		setField(value);
	}

	public quickfix.field.RestructuringType get(quickfix.field.RestructuringType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RestructuringType getRestructuringType() throws FieldNotFound {
		return get(new quickfix.field.RestructuringType());
	}

	public boolean isSet(quickfix.field.RestructuringType field) {
		return isSetField(field);
	}

	public boolean isSetRestructuringType() {
		return isSetField(1449);
	}

	public void set(quickfix.field.Seniority value) {
		setField(value);
	}

	public quickfix.field.Seniority get(quickfix.field.Seniority value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Seniority getSeniority() throws FieldNotFound {
		return get(new quickfix.field.Seniority());
	}

	public boolean isSet(quickfix.field.Seniority field) {
		return isSetField(field);
	}

	public boolean isSetSeniority() {
		return isSetField(1450);
	}

	public void set(quickfix.field.NotionalPercentageOutstanding value) {
		setField(value);
	}

	public quickfix.field.NotionalPercentageOutstanding get(quickfix.field.NotionalPercentageOutstanding value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NotionalPercentageOutstanding getNotionalPercentageOutstanding() throws FieldNotFound {
		return get(new quickfix.field.NotionalPercentageOutstanding());
	}

	public boolean isSet(quickfix.field.NotionalPercentageOutstanding field) {
		return isSetField(field);
	}

	public boolean isSetNotionalPercentageOutstanding() {
		return isSetField(1451);
	}

	public void set(quickfix.field.OriginalNotionalPercentageOutstanding value) {
		setField(value);
	}

	public quickfix.field.OriginalNotionalPercentageOutstanding get(quickfix.field.OriginalNotionalPercentageOutstanding value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OriginalNotionalPercentageOutstanding getOriginalNotionalPercentageOutstanding() throws FieldNotFound {
		return get(new quickfix.field.OriginalNotionalPercentageOutstanding());
	}

	public boolean isSet(quickfix.field.OriginalNotionalPercentageOutstanding field) {
		return isSetField(field);
	}

	public boolean isSetOriginalNotionalPercentageOutstanding() {
		return isSetField(1452);
	}

	public void set(quickfix.field.AttachmentPoint value) {
		setField(value);
	}

	public quickfix.field.AttachmentPoint get(quickfix.field.AttachmentPoint value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AttachmentPoint getAttachmentPoint() throws FieldNotFound {
		return get(new quickfix.field.AttachmentPoint());
	}

	public boolean isSet(quickfix.field.AttachmentPoint field) {
		return isSetField(field);
	}

	public boolean isSetAttachmentPoint() {
		return isSetField(1457);
	}

	public void set(quickfix.field.DetachmentPoint value) {
		setField(value);
	}

	public quickfix.field.DetachmentPoint get(quickfix.field.DetachmentPoint value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DetachmentPoint getDetachmentPoint() throws FieldNotFound {
		return get(new quickfix.field.DetachmentPoint());
	}

	public boolean isSet(quickfix.field.DetachmentPoint field) {
		return isSetField(field);
	}

	public boolean isSetDetachmentPoint() {
		return isSetField(1458);
	}

	public void set(quickfix.field.IssueDate value) {
		setField(value);
	}

	public quickfix.field.IssueDate get(quickfix.field.IssueDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.IssueDate getIssueDate() throws FieldNotFound {
		return get(new quickfix.field.IssueDate());
	}

	public boolean isSet(quickfix.field.IssueDate field) {
		return isSetField(field);
	}

	public boolean isSetIssueDate() {
		return isSetField(225);
	}

	public void set(quickfix.field.RepoCollateralSecurityType value) {
		setField(value);
	}

	public quickfix.field.RepoCollateralSecurityType get(quickfix.field.RepoCollateralSecurityType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RepoCollateralSecurityType getRepoCollateralSecurityType() throws FieldNotFound {
		return get(new quickfix.field.RepoCollateralSecurityType());
	}

	public boolean isSet(quickfix.field.RepoCollateralSecurityType field) {
		return isSetField(field);
	}

	public boolean isSetRepoCollateralSecurityType() {
		return isSetField(239);
	}

	public void set(quickfix.field.RepurchaseTerm value) {
		setField(value);
	}

	public quickfix.field.RepurchaseTerm get(quickfix.field.RepurchaseTerm value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RepurchaseTerm getRepurchaseTerm() throws FieldNotFound {
		return get(new quickfix.field.RepurchaseTerm());
	}

	public boolean isSet(quickfix.field.RepurchaseTerm field) {
		return isSetField(field);
	}

	public boolean isSetRepurchaseTerm() {
		return isSetField(226);
	}

	public void set(quickfix.field.RepurchaseRate value) {
		setField(value);
	}

	public quickfix.field.RepurchaseRate get(quickfix.field.RepurchaseRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RepurchaseRate getRepurchaseRate() throws FieldNotFound {
		return get(new quickfix.field.RepurchaseRate());
	}

	public boolean isSet(quickfix.field.RepurchaseRate field) {
		return isSetField(field);
	}

	public boolean isSetRepurchaseRate() {
		return isSetField(227);
	}

	public void set(quickfix.field.Factor value) {
		setField(value);
	}

	public quickfix.field.Factor get(quickfix.field.Factor value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Factor getFactor() throws FieldNotFound {
		return get(new quickfix.field.Factor());
	}

	public boolean isSet(quickfix.field.Factor field) {
		return isSetField(field);
	}

	public boolean isSetFactor() {
		return isSetField(228);
	}

	public void set(quickfix.field.CreditRating value) {
		setField(value);
	}

	public quickfix.field.CreditRating get(quickfix.field.CreditRating value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CreditRating getCreditRating() throws FieldNotFound {
		return get(new quickfix.field.CreditRating());
	}

	public boolean isSet(quickfix.field.CreditRating field) {
		return isSetField(field);
	}

	public boolean isSetCreditRating() {
		return isSetField(255);
	}

	public void set(quickfix.field.InstrRegistry value) {
		setField(value);
	}

	public quickfix.field.InstrRegistry get(quickfix.field.InstrRegistry value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.InstrRegistry getInstrRegistry() throws FieldNotFound {
		return get(new quickfix.field.InstrRegistry());
	}

	public boolean isSet(quickfix.field.InstrRegistry field) {
		return isSetField(field);
	}

	public boolean isSetInstrRegistry() {
		return isSetField(543);
	}

	public void set(quickfix.field.CountryOfIssue value) {
		setField(value);
	}

	public quickfix.field.CountryOfIssue get(quickfix.field.CountryOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CountryOfIssue getCountryOfIssue() throws FieldNotFound {
		return get(new quickfix.field.CountryOfIssue());
	}

	public boolean isSet(quickfix.field.CountryOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetCountryOfIssue() {
		return isSetField(470);
	}

	public void set(quickfix.field.StateOrProvinceOfIssue value) {
		setField(value);
	}

	public quickfix.field.StateOrProvinceOfIssue get(quickfix.field.StateOrProvinceOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.StateOrProvinceOfIssue getStateOrProvinceOfIssue() throws FieldNotFound {
		return get(new quickfix.field.StateOrProvinceOfIssue());
	}

	public boolean isSet(quickfix.field.StateOrProvinceOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetStateOrProvinceOfIssue() {
		return isSetField(471);
	}

	public void set(quickfix.field.LocaleOfIssue value) {
		setField(value);
	}

	public quickfix.field.LocaleOfIssue get(quickfix.field.LocaleOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LocaleOfIssue getLocaleOfIssue() throws FieldNotFound {
		return get(new quickfix.field.LocaleOfIssue());
	}

	public boolean isSet(quickfix.field.LocaleOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetLocaleOfIssue() {
		return isSetField(472);
	}

	public void set(quickfix.field.RedemptionDate value) {
		setField(value);
	}

	public quickfix.field.RedemptionDate get(quickfix.field.RedemptionDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RedemptionDate getRedemptionDate() throws FieldNotFound {
		return get(new quickfix.field.RedemptionDate());
	}

	public boolean isSet(quickfix.field.RedemptionDate field) {
		return isSetField(field);
	}

	public boolean isSetRedemptionDate() {
		return isSetField(240);
	}

	public void set(quickfix.field.StrikePrice value) {
		setField(value);
	}

	public quickfix.field.StrikePrice get(quickfix.field.StrikePrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.StrikePrice getStrikePrice() throws FieldNotFound {
		return get(new quickfix.field.StrikePrice());
	}

	public boolean isSet(quickfix.field.StrikePrice field) {
		return isSetField(field);
	}

	public boolean isSetStrikePrice() {
		return isSetField(202);
	}

	public void set(quickfix.field.StrikeCurrency value) {
		setField(value);
	}

	public quickfix.field.StrikeCurrency get(quickfix.field.StrikeCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.StrikeCurrency getStrikeCurrency() throws FieldNotFound {
		return get(new quickfix.field.StrikeCurrency());
	}

	public boolean isSet(quickfix.field.StrikeCurrency field) {
		return isSetField(field);
	}

	public boolean isSetStrikeCurrency() {
		return isSetField(947);
	}

	public void set(quickfix.field.StrikeMultiplier value) {
		setField(value);
	}

	public quickfix.field.StrikeMultiplier get(quickfix.field.StrikeMultiplier value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.StrikeMultiplier getStrikeMultiplier() throws FieldNotFound {
		return get(new quickfix.field.StrikeMultiplier());
	}

	public boolean isSet(quickfix.field.StrikeMultiplier field) {
		return isSetField(field);
	}

	public boolean isSetStrikeMultiplier() {
		return isSetField(967);
	}

	public void set(quickfix.field.StrikeValue value) {
		setField(value);
	}

	public quickfix.field.StrikeValue get(quickfix.field.StrikeValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.StrikeValue getStrikeValue() throws FieldNotFound {
		return get(new quickfix.field.StrikeValue());
	}

	public boolean isSet(quickfix.field.StrikeValue field) {
		return isSetField(field);
	}

	public boolean isSetStrikeValue() {
		return isSetField(968);
	}

	public void set(quickfix.field.StrikePriceDeterminationMethod value) {
		setField(value);
	}

	public quickfix.field.StrikePriceDeterminationMethod get(quickfix.field.StrikePriceDeterminationMethod value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.StrikePriceDeterminationMethod getStrikePriceDeterminationMethod() throws FieldNotFound {
		return get(new quickfix.field.StrikePriceDeterminationMethod());
	}

	public boolean isSet(quickfix.field.StrikePriceDeterminationMethod field) {
		return isSetField(field);
	}

	public boolean isSetStrikePriceDeterminationMethod() {
		return isSetField(1478);
	}

	public void set(quickfix.field.StrikePriceBoundaryMethod value) {
		setField(value);
	}

	public quickfix.field.StrikePriceBoundaryMethod get(quickfix.field.StrikePriceBoundaryMethod value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.StrikePriceBoundaryMethod getStrikePriceBoundaryMethod() throws FieldNotFound {
		return get(new quickfix.field.StrikePriceBoundaryMethod());
	}

	public boolean isSet(quickfix.field.StrikePriceBoundaryMethod field) {
		return isSetField(field);
	}

	public boolean isSetStrikePriceBoundaryMethod() {
		return isSetField(1479);
	}

	public void set(quickfix.field.StrikePriceBoundaryPrecision value) {
		setField(value);
	}

	public quickfix.field.StrikePriceBoundaryPrecision get(quickfix.field.StrikePriceBoundaryPrecision value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.StrikePriceBoundaryPrecision getStrikePriceBoundaryPrecision() throws FieldNotFound {
		return get(new quickfix.field.StrikePriceBoundaryPrecision());
	}

	public boolean isSet(quickfix.field.StrikePriceBoundaryPrecision field) {
		return isSetField(field);
	}

	public boolean isSetStrikePriceBoundaryPrecision() {
		return isSetField(1480);
	}

	public void set(quickfix.field.UnderlyingPriceDeterminationMethod value) {
		setField(value);
	}

	public quickfix.field.UnderlyingPriceDeterminationMethod get(quickfix.field.UnderlyingPriceDeterminationMethod value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingPriceDeterminationMethod getUnderlyingPriceDeterminationMethod() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingPriceDeterminationMethod());
	}

	public boolean isSet(quickfix.field.UnderlyingPriceDeterminationMethod field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingPriceDeterminationMethod() {
		return isSetField(1481);
	}

	public void set(quickfix.field.OptAttribute value) {
		setField(value);
	}

	public quickfix.field.OptAttribute get(quickfix.field.OptAttribute value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OptAttribute getOptAttribute() throws FieldNotFound {
		return get(new quickfix.field.OptAttribute());
	}

	public boolean isSet(quickfix.field.OptAttribute field) {
		return isSetField(field);
	}

	public boolean isSetOptAttribute() {
		return isSetField(206);
	}

	public void set(quickfix.field.ContractMultiplier value) {
		setField(value);
	}

	public quickfix.field.ContractMultiplier get(quickfix.field.ContractMultiplier value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ContractMultiplier getContractMultiplier() throws FieldNotFound {
		return get(new quickfix.field.ContractMultiplier());
	}

	public boolean isSet(quickfix.field.ContractMultiplier field) {
		return isSetField(field);
	}

	public boolean isSetContractMultiplier() {
		return isSetField(231);
	}

	public void set(quickfix.field.ContractMultiplierUnit value) {
		setField(value);
	}

	public quickfix.field.ContractMultiplierUnit get(quickfix.field.ContractMultiplierUnit value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ContractMultiplierUnit getContractMultiplierUnit() throws FieldNotFound {
		return get(new quickfix.field.ContractMultiplierUnit());
	}

	public boolean isSet(quickfix.field.ContractMultiplierUnit field) {
		return isSetField(field);
	}

	public boolean isSetContractMultiplierUnit() {
		return isSetField(1435);
	}

	public void set(quickfix.field.FlowScheduleType value) {
		setField(value);
	}

	public quickfix.field.FlowScheduleType get(quickfix.field.FlowScheduleType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.FlowScheduleType getFlowScheduleType() throws FieldNotFound {
		return get(new quickfix.field.FlowScheduleType());
	}

	public boolean isSet(quickfix.field.FlowScheduleType field) {
		return isSetField(field);
	}

	public boolean isSetFlowScheduleType() {
		return isSetField(1439);
	}

	public void set(quickfix.field.MinPriceIncrement value) {
		setField(value);
	}

	public quickfix.field.MinPriceIncrement get(quickfix.field.MinPriceIncrement value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MinPriceIncrement getMinPriceIncrement() throws FieldNotFound {
		return get(new quickfix.field.MinPriceIncrement());
	}

	public boolean isSet(quickfix.field.MinPriceIncrement field) {
		return isSetField(field);
	}

	public boolean isSetMinPriceIncrement() {
		return isSetField(969);
	}

	public void set(quickfix.field.MinPriceIncrementAmount value) {
		setField(value);
	}

	public quickfix.field.MinPriceIncrementAmount get(quickfix.field.MinPriceIncrementAmount value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MinPriceIncrementAmount getMinPriceIncrementAmount() throws FieldNotFound {
		return get(new quickfix.field.MinPriceIncrementAmount());
	}

	public boolean isSet(quickfix.field.MinPriceIncrementAmount field) {
		return isSetField(field);
	}

	public boolean isSetMinPriceIncrementAmount() {
		return isSetField(1146);
	}

	public void set(quickfix.field.UnitOfMeasure value) {
		setField(value);
	}

	public quickfix.field.UnitOfMeasure get(quickfix.field.UnitOfMeasure value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnitOfMeasure getUnitOfMeasure() throws FieldNotFound {
		return get(new quickfix.field.UnitOfMeasure());
	}

	public boolean isSet(quickfix.field.UnitOfMeasure field) {
		return isSetField(field);
	}

	public boolean isSetUnitOfMeasure() {
		return isSetField(996);
	}

	public void set(quickfix.field.UnitOfMeasureQty value) {
		setField(value);
	}

	public quickfix.field.UnitOfMeasureQty get(quickfix.field.UnitOfMeasureQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnitOfMeasureQty getUnitOfMeasureQty() throws FieldNotFound {
		return get(new quickfix.field.UnitOfMeasureQty());
	}

	public boolean isSet(quickfix.field.UnitOfMeasureQty field) {
		return isSetField(field);
	}

	public boolean isSetUnitOfMeasureQty() {
		return isSetField(1147);
	}

	public void set(quickfix.field.PriceUnitOfMeasure value) {
		setField(value);
	}

	public quickfix.field.PriceUnitOfMeasure get(quickfix.field.PriceUnitOfMeasure value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PriceUnitOfMeasure getPriceUnitOfMeasure() throws FieldNotFound {
		return get(new quickfix.field.PriceUnitOfMeasure());
	}

	public boolean isSet(quickfix.field.PriceUnitOfMeasure field) {
		return isSetField(field);
	}

	public boolean isSetPriceUnitOfMeasure() {
		return isSetField(1191);
	}

	public void set(quickfix.field.PriceUnitOfMeasureQty value) {
		setField(value);
	}

	public quickfix.field.PriceUnitOfMeasureQty get(quickfix.field.PriceUnitOfMeasureQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PriceUnitOfMeasureQty getPriceUnitOfMeasureQty() throws FieldNotFound {
		return get(new quickfix.field.PriceUnitOfMeasureQty());
	}

	public boolean isSet(quickfix.field.PriceUnitOfMeasureQty field) {
		return isSetField(field);
	}

	public boolean isSetPriceUnitOfMeasureQty() {
		return isSetField(1192);
	}

	public void set(quickfix.field.SettlMethod value) {
		setField(value);
	}

	public quickfix.field.SettlMethod get(quickfix.field.SettlMethod value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SettlMethod getSettlMethod() throws FieldNotFound {
		return get(new quickfix.field.SettlMethod());
	}

	public boolean isSet(quickfix.field.SettlMethod field) {
		return isSetField(field);
	}

	public boolean isSetSettlMethod() {
		return isSetField(1193);
	}

	public void set(quickfix.field.ExerciseStyle value) {
		setField(value);
	}

	public quickfix.field.ExerciseStyle get(quickfix.field.ExerciseStyle value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ExerciseStyle getExerciseStyle() throws FieldNotFound {
		return get(new quickfix.field.ExerciseStyle());
	}

	public boolean isSet(quickfix.field.ExerciseStyle field) {
		return isSetField(field);
	}

	public boolean isSetExerciseStyle() {
		return isSetField(1194);
	}

	public void set(quickfix.field.OptPayoutType value) {
		setField(value);
	}

	public quickfix.field.OptPayoutType get(quickfix.field.OptPayoutType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OptPayoutType getOptPayoutType() throws FieldNotFound {
		return get(new quickfix.field.OptPayoutType());
	}

	public boolean isSet(quickfix.field.OptPayoutType field) {
		return isSetField(field);
	}

	public boolean isSetOptPayoutType() {
		return isSetField(1482);
	}

	public void set(quickfix.field.OptPayoutAmount value) {
		setField(value);
	}

	public quickfix.field.OptPayoutAmount get(quickfix.field.OptPayoutAmount value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OptPayoutAmount getOptPayoutAmount() throws FieldNotFound {
		return get(new quickfix.field.OptPayoutAmount());
	}

	public boolean isSet(quickfix.field.OptPayoutAmount field) {
		return isSetField(field);
	}

	public boolean isSetOptPayoutAmount() {
		return isSetField(1195);
	}

	public void set(quickfix.field.PriceQuoteMethod value) {
		setField(value);
	}

	public quickfix.field.PriceQuoteMethod get(quickfix.field.PriceQuoteMethod value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PriceQuoteMethod getPriceQuoteMethod() throws FieldNotFound {
		return get(new quickfix.field.PriceQuoteMethod());
	}

	public boolean isSet(quickfix.field.PriceQuoteMethod field) {
		return isSetField(field);
	}

	public boolean isSetPriceQuoteMethod() {
		return isSetField(1196);
	}

	public void set(quickfix.field.ValuationMethod value) {
		setField(value);
	}

	public quickfix.field.ValuationMethod get(quickfix.field.ValuationMethod value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ValuationMethod getValuationMethod() throws FieldNotFound {
		return get(new quickfix.field.ValuationMethod());
	}

	public boolean isSet(quickfix.field.ValuationMethod field) {
		return isSetField(field);
	}

	public boolean isSetValuationMethod() {
		return isSetField(1197);
	}

	public void set(quickfix.field.ListMethod value) {
		setField(value);
	}

	public quickfix.field.ListMethod get(quickfix.field.ListMethod value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ListMethod getListMethod() throws FieldNotFound {
		return get(new quickfix.field.ListMethod());
	}

	public boolean isSet(quickfix.field.ListMethod field) {
		return isSetField(field);
	}

	public boolean isSetListMethod() {
		return isSetField(1198);
	}

	public void set(quickfix.field.CapPrice value) {
		setField(value);
	}

	public quickfix.field.CapPrice get(quickfix.field.CapPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CapPrice getCapPrice() throws FieldNotFound {
		return get(new quickfix.field.CapPrice());
	}

	public boolean isSet(quickfix.field.CapPrice field) {
		return isSetField(field);
	}

	public boolean isSetCapPrice() {
		return isSetField(1199);
	}

	public void set(quickfix.field.FloorPrice value) {
		setField(value);
	}

	public quickfix.field.FloorPrice get(quickfix.field.FloorPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.FloorPrice getFloorPrice() throws FieldNotFound {
		return get(new quickfix.field.FloorPrice());
	}

	public boolean isSet(quickfix.field.FloorPrice field) {
		return isSetField(field);
	}

	public boolean isSetFloorPrice() {
		return isSetField(1200);
	}

	public void set(quickfix.field.PutOrCall value) {
		setField(value);
	}

	public quickfix.field.PutOrCall get(quickfix.field.PutOrCall value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PutOrCall getPutOrCall() throws FieldNotFound {
		return get(new quickfix.field.PutOrCall());
	}

	public boolean isSet(quickfix.field.PutOrCall field) {
		return isSetField(field);
	}

	public boolean isSetPutOrCall() {
		return isSetField(201);
	}

	public void set(quickfix.field.FlexibleIndicator value) {
		setField(value);
	}

	public quickfix.field.FlexibleIndicator get(quickfix.field.FlexibleIndicator value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.FlexibleIndicator getFlexibleIndicator() throws FieldNotFound {
		return get(new quickfix.field.FlexibleIndicator());
	}

	public boolean isSet(quickfix.field.FlexibleIndicator field) {
		return isSetField(field);
	}

	public boolean isSetFlexibleIndicator() {
		return isSetField(1244);
	}

	public void set(quickfix.field.FlexProductEligibilityIndicator value) {
		setField(value);
	}

	public quickfix.field.FlexProductEligibilityIndicator get(quickfix.field.FlexProductEligibilityIndicator value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.FlexProductEligibilityIndicator getFlexProductEligibilityIndicator() throws FieldNotFound {
		return get(new quickfix.field.FlexProductEligibilityIndicator());
	}

	public boolean isSet(quickfix.field.FlexProductEligibilityIndicator field) {
		return isSetField(field);
	}

	public boolean isSetFlexProductEligibilityIndicator() {
		return isSetField(1242);
	}

	public void set(quickfix.field.TimeUnit value) {
		setField(value);
	}

	public quickfix.field.TimeUnit get(quickfix.field.TimeUnit value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TimeUnit getTimeUnit() throws FieldNotFound {
		return get(new quickfix.field.TimeUnit());
	}

	public boolean isSet(quickfix.field.TimeUnit field) {
		return isSetField(field);
	}

	public boolean isSetTimeUnit() {
		return isSetField(997);
	}

	public void set(quickfix.field.CouponRate value) {
		setField(value);
	}

	public quickfix.field.CouponRate get(quickfix.field.CouponRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CouponRate getCouponRate() throws FieldNotFound {
		return get(new quickfix.field.CouponRate());
	}

	public boolean isSet(quickfix.field.CouponRate field) {
		return isSetField(field);
	}

	public boolean isSetCouponRate() {
		return isSetField(223);
	}

	public void set(quickfix.field.SecurityExchange value) {
		setField(value);
	}

	public quickfix.field.SecurityExchange get(quickfix.field.SecurityExchange value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecurityExchange getSecurityExchange() throws FieldNotFound {
		return get(new quickfix.field.SecurityExchange());
	}

	public boolean isSet(quickfix.field.SecurityExchange field) {
		return isSetField(field);
	}

	public boolean isSetSecurityExchange() {
		return isSetField(207);
	}

	public void set(quickfix.field.PositionLimit value) {
		setField(value);
	}

	public quickfix.field.PositionLimit get(quickfix.field.PositionLimit value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PositionLimit getPositionLimit() throws FieldNotFound {
		return get(new quickfix.field.PositionLimit());
	}

	public boolean isSet(quickfix.field.PositionLimit field) {
		return isSetField(field);
	}

	public boolean isSetPositionLimit() {
		return isSetField(970);
	}

	public void set(quickfix.field.NTPositionLimit value) {
		setField(value);
	}

	public quickfix.field.NTPositionLimit get(quickfix.field.NTPositionLimit value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NTPositionLimit getNTPositionLimit() throws FieldNotFound {
		return get(new quickfix.field.NTPositionLimit());
	}

	public boolean isSet(quickfix.field.NTPositionLimit field) {
		return isSetField(field);
	}

	public boolean isSetNTPositionLimit() {
		return isSetField(971);
	}

	public void set(quickfix.field.Issuer value) {
		setField(value);
	}

	public quickfix.field.Issuer get(quickfix.field.Issuer value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Issuer getIssuer() throws FieldNotFound {
		return get(new quickfix.field.Issuer());
	}

	public boolean isSet(quickfix.field.Issuer field) {
		return isSetField(field);
	}

	public boolean isSetIssuer() {
		return isSetField(106);
	}

	public void set(quickfix.field.EncodedIssuerLen value) {
		setField(value);
	}

	public quickfix.field.EncodedIssuerLen get(quickfix.field.EncodedIssuerLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EncodedIssuerLen getEncodedIssuerLen() throws FieldNotFound {
		return get(new quickfix.field.EncodedIssuerLen());
	}

	public boolean isSet(quickfix.field.EncodedIssuerLen field) {
		return isSetField(field);
	}

	public boolean isSetEncodedIssuerLen() {
		return isSetField(348);
	}

	public void set(quickfix.field.EncodedIssuer value) {
		setField(value);
	}

	public quickfix.field.EncodedIssuer get(quickfix.field.EncodedIssuer value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EncodedIssuer getEncodedIssuer() throws FieldNotFound {
		return get(new quickfix.field.EncodedIssuer());
	}

	public boolean isSet(quickfix.field.EncodedIssuer field) {
		return isSetField(field);
	}

	public boolean isSetEncodedIssuer() {
		return isSetField(349);
	}

	public void set(quickfix.field.SecurityDesc value) {
		setField(value);
	}

	public quickfix.field.SecurityDesc get(quickfix.field.SecurityDesc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecurityDesc getSecurityDesc() throws FieldNotFound {
		return get(new quickfix.field.SecurityDesc());
	}

	public boolean isSet(quickfix.field.SecurityDesc field) {
		return isSetField(field);
	}

	public boolean isSetSecurityDesc() {
		return isSetField(107);
	}

	public void set(quickfix.field.EncodedSecurityDescLen value) {
		setField(value);
	}

	public quickfix.field.EncodedSecurityDescLen get(quickfix.field.EncodedSecurityDescLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EncodedSecurityDescLen getEncodedSecurityDescLen() throws FieldNotFound {
		return get(new quickfix.field.EncodedSecurityDescLen());
	}

	public boolean isSet(quickfix.field.EncodedSecurityDescLen field) {
		return isSetField(field);
	}

	public boolean isSetEncodedSecurityDescLen() {
		return isSetField(350);
	}

	public void set(quickfix.field.EncodedSecurityDesc value) {
		setField(value);
	}

	public quickfix.field.EncodedSecurityDesc get(quickfix.field.EncodedSecurityDesc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EncodedSecurityDesc getEncodedSecurityDesc() throws FieldNotFound {
		return get(new quickfix.field.EncodedSecurityDesc());
	}

	public boolean isSet(quickfix.field.EncodedSecurityDesc field) {
		return isSetField(field);
	}

	public boolean isSetEncodedSecurityDesc() {
		return isSetField(351);
	}

	public void set(quickfix.fix50sp2.component.SecurityXML component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.SecurityXML get(quickfix.fix50sp2.component.SecurityXML component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.SecurityXML getSecurityXML() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.SecurityXML());
	}

	public void set(quickfix.field.SecurityXMLLen value) {
		setField(value);
	}

	public quickfix.field.SecurityXMLLen get(quickfix.field.SecurityXMLLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecurityXMLLen getSecurityXMLLen() throws FieldNotFound {
		return get(new quickfix.field.SecurityXMLLen());
	}

	public boolean isSet(quickfix.field.SecurityXMLLen field) {
		return isSetField(field);
	}

	public boolean isSetSecurityXMLLen() {
		return isSetField(1184);
	}

	public void set(quickfix.field.SecurityXMLData value) {
		setField(value);
	}

	public quickfix.field.SecurityXMLData get(quickfix.field.SecurityXMLData value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecurityXMLData getSecurityXMLData() throws FieldNotFound {
		return get(new quickfix.field.SecurityXMLData());
	}

	public boolean isSet(quickfix.field.SecurityXMLData field) {
		return isSetField(field);
	}

	public boolean isSetSecurityXMLData() {
		return isSetField(1185);
	}

	public void set(quickfix.field.SecurityXMLSchema value) {
		setField(value);
	}

	public quickfix.field.SecurityXMLSchema get(quickfix.field.SecurityXMLSchema value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecurityXMLSchema getSecurityXMLSchema() throws FieldNotFound {
		return get(new quickfix.field.SecurityXMLSchema());
	}

	public boolean isSet(quickfix.field.SecurityXMLSchema field) {
		return isSetField(field);
	}

	public boolean isSetSecurityXMLSchema() {
		return isSetField(1186);
	}

	public void set(quickfix.field.Pool value) {
		setField(value);
	}

	public quickfix.field.Pool get(quickfix.field.Pool value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Pool getPool() throws FieldNotFound {
		return get(new quickfix.field.Pool());
	}

	public boolean isSet(quickfix.field.Pool field) {
		return isSetField(field);
	}

	public boolean isSetPool() {
		return isSetField(691);
	}

	public void set(quickfix.field.ContractSettlMonth value) {
		setField(value);
	}

	public quickfix.field.ContractSettlMonth get(quickfix.field.ContractSettlMonth value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ContractSettlMonth getContractSettlMonth() throws FieldNotFound {
		return get(new quickfix.field.ContractSettlMonth());
	}

	public boolean isSet(quickfix.field.ContractSettlMonth field) {
		return isSetField(field);
	}

	public boolean isSetContractSettlMonth() {
		return isSetField(667);
	}

	public void set(quickfix.field.CPProgram value) {
		setField(value);
	}

	public quickfix.field.CPProgram get(quickfix.field.CPProgram value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CPProgram getCPProgram() throws FieldNotFound {
		return get(new quickfix.field.CPProgram());
	}

	public boolean isSet(quickfix.field.CPProgram field) {
		return isSetField(field);
	}

	public boolean isSetCPProgram() {
		return isSetField(875);
	}

	public void set(quickfix.field.CPRegType value) {
		setField(value);
	}

	public quickfix.field.CPRegType get(quickfix.field.CPRegType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CPRegType getCPRegType() throws FieldNotFound {
		return get(new quickfix.field.CPRegType());
	}

	public boolean isSet(quickfix.field.CPRegType field) {
		return isSetField(field);
	}

	public boolean isSetCPRegType() {
		return isSetField(876);
	}

	public void set(quickfix.fix50sp2.component.EvntGrp component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.EvntGrp get(quickfix.fix50sp2.component.EvntGrp component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.EvntGrp getEvntGrp() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.EvntGrp());
	}

	public void set(quickfix.field.NoEvents value) {
		setField(value);
	}

	public quickfix.field.NoEvents get(quickfix.field.NoEvents value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoEvents getNoEvents() throws FieldNotFound {
		return get(new quickfix.field.NoEvents());
	}

	public boolean isSet(quickfix.field.NoEvents field) {
		return isSetField(field);
	}

	public boolean isSetNoEvents() {
		return isSetField(864);
	}

	public static class NoEvents extends Group {

		static final long serialVersionUID = 20050617;

		public NoEvents() {
			super(864, 865,
				new int[] {865, 866, 1145, 867, 868,  0 });
		}
		
	public void set(quickfix.field.EventType value) {
		setField(value);
	}

	public quickfix.field.EventType get(quickfix.field.EventType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EventType getEventType() throws FieldNotFound {
		return get(new quickfix.field.EventType());
	}

	public boolean isSet(quickfix.field.EventType field) {
		return isSetField(field);
	}

	public boolean isSetEventType() {
		return isSetField(865);
	}

	public void set(quickfix.field.EventDate value) {
		setField(value);
	}

	public quickfix.field.EventDate get(quickfix.field.EventDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EventDate getEventDate() throws FieldNotFound {
		return get(new quickfix.field.EventDate());
	}

	public boolean isSet(quickfix.field.EventDate field) {
		return isSetField(field);
	}

	public boolean isSetEventDate() {
		return isSetField(866);
	}

	public void set(quickfix.field.EventTime value) {
		setField(value);
	}

	public quickfix.field.EventTime get(quickfix.field.EventTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EventTime getEventTime() throws FieldNotFound {
		return get(new quickfix.field.EventTime());
	}

	public boolean isSet(quickfix.field.EventTime field) {
		return isSetField(field);
	}

	public boolean isSetEventTime() {
		return isSetField(1145);
	}

	public void set(quickfix.field.EventPx value) {
		setField(value);
	}

	public quickfix.field.EventPx get(quickfix.field.EventPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EventPx getEventPx() throws FieldNotFound {
		return get(new quickfix.field.EventPx());
	}

	public boolean isSet(quickfix.field.EventPx field) {
		return isSetField(field);
	}

	public boolean isSetEventPx() {
		return isSetField(867);
	}

	public void set(quickfix.field.EventText value) {
		setField(value);
	}

	public quickfix.field.EventText get(quickfix.field.EventText value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EventText getEventText() throws FieldNotFound {
		return get(new quickfix.field.EventText());
	}

	public boolean isSet(quickfix.field.EventText field) {
		return isSetField(field);
	}

	public boolean isSetEventText() {
		return isSetField(868);
	}

	}

	public void set(quickfix.field.DatedDate value) {
		setField(value);
	}

	public quickfix.field.DatedDate get(quickfix.field.DatedDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DatedDate getDatedDate() throws FieldNotFound {
		return get(new quickfix.field.DatedDate());
	}

	public boolean isSet(quickfix.field.DatedDate field) {
		return isSetField(field);
	}

	public boolean isSetDatedDate() {
		return isSetField(873);
	}

	public void set(quickfix.field.InterestAccrualDate value) {
		setField(value);
	}

	public quickfix.field.InterestAccrualDate get(quickfix.field.InterestAccrualDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.InterestAccrualDate getInterestAccrualDate() throws FieldNotFound {
		return get(new quickfix.field.InterestAccrualDate());
	}

	public boolean isSet(quickfix.field.InterestAccrualDate field) {
		return isSetField(field);
	}

	public boolean isSetInterestAccrualDate() {
		return isSetField(874);
	}

	public void set(quickfix.fix50sp2.component.InstrumentParties component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.InstrumentParties get(quickfix.fix50sp2.component.InstrumentParties component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.InstrumentParties getInstrumentParties() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.InstrumentParties());
	}

	public void set(quickfix.field.NoInstrumentParties value) {
		setField(value);
	}

	public quickfix.field.NoInstrumentParties get(quickfix.field.NoInstrumentParties value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoInstrumentParties getNoInstrumentParties() throws FieldNotFound {
		return get(new quickfix.field.NoInstrumentParties());
	}

	public boolean isSet(quickfix.field.NoInstrumentParties field) {
		return isSetField(field);
	}

	public boolean isSetNoInstrumentParties() {
		return isSetField(1018);
	}

	public static class NoInstrumentParties extends Group {

		static final long serialVersionUID = 20050617;

		public NoInstrumentParties() {
			super(1018, 1019,
				new int[] {1019, 1050, 1051, 1052,  0 });
		}
		
	public void set(quickfix.field.InstrumentPartyID value) {
		setField(value);
	}

	public quickfix.field.InstrumentPartyID get(quickfix.field.InstrumentPartyID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.InstrumentPartyID getInstrumentPartyID() throws FieldNotFound {
		return get(new quickfix.field.InstrumentPartyID());
	}

	public boolean isSet(quickfix.field.InstrumentPartyID field) {
		return isSetField(field);
	}

	public boolean isSetInstrumentPartyID() {
		return isSetField(1019);
	}

	public void set(quickfix.field.InstrumentPartyIDSource value) {
		setField(value);
	}

	public quickfix.field.InstrumentPartyIDSource get(quickfix.field.InstrumentPartyIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.InstrumentPartyIDSource getInstrumentPartyIDSource() throws FieldNotFound {
		return get(new quickfix.field.InstrumentPartyIDSource());
	}

	public boolean isSet(quickfix.field.InstrumentPartyIDSource field) {
		return isSetField(field);
	}

	public boolean isSetInstrumentPartyIDSource() {
		return isSetField(1050);
	}

	public void set(quickfix.field.InstrumentPartyRole value) {
		setField(value);
	}

	public quickfix.field.InstrumentPartyRole get(quickfix.field.InstrumentPartyRole value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.InstrumentPartyRole getInstrumentPartyRole() throws FieldNotFound {
		return get(new quickfix.field.InstrumentPartyRole());
	}

	public boolean isSet(quickfix.field.InstrumentPartyRole field) {
		return isSetField(field);
	}

	public boolean isSetInstrumentPartyRole() {
		return isSetField(1051);
	}

	public void set(quickfix.fix50sp2.component.InstrumentPtysSubGrp component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.InstrumentPtysSubGrp get(quickfix.fix50sp2.component.InstrumentPtysSubGrp component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.InstrumentPtysSubGrp getInstrumentPtysSubGrp() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.InstrumentPtysSubGrp());
	}

	public void set(quickfix.field.NoInstrumentPartySubIDs value) {
		setField(value);
	}

	public quickfix.field.NoInstrumentPartySubIDs get(quickfix.field.NoInstrumentPartySubIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoInstrumentPartySubIDs getNoInstrumentPartySubIDs() throws FieldNotFound {
		return get(new quickfix.field.NoInstrumentPartySubIDs());
	}

	public boolean isSet(quickfix.field.NoInstrumentPartySubIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoInstrumentPartySubIDs() {
		return isSetField(1052);
	}

	public static class NoInstrumentPartySubIDs extends Group {

		static final long serialVersionUID = 20050617;

		public NoInstrumentPartySubIDs() {
			super(1052, 1053,
				new int[] {1053, 1054,  0 });
		}
		
	public void set(quickfix.field.InstrumentPartySubID value) {
		setField(value);
	}

	public quickfix.field.InstrumentPartySubID get(quickfix.field.InstrumentPartySubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.InstrumentPartySubID getInstrumentPartySubID() throws FieldNotFound {
		return get(new quickfix.field.InstrumentPartySubID());
	}

	public boolean isSet(quickfix.field.InstrumentPartySubID field) {
		return isSetField(field);
	}

	public boolean isSetInstrumentPartySubID() {
		return isSetField(1053);
	}

	public void set(quickfix.field.InstrumentPartySubIDType value) {
		setField(value);
	}

	public quickfix.field.InstrumentPartySubIDType get(quickfix.field.InstrumentPartySubIDType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.InstrumentPartySubIDType getInstrumentPartySubIDType() throws FieldNotFound {
		return get(new quickfix.field.InstrumentPartySubIDType());
	}

	public boolean isSet(quickfix.field.InstrumentPartySubIDType field) {
		return isSetField(field);
	}

	public boolean isSetInstrumentPartySubIDType() {
		return isSetField(1054);
	}

	}

	}

	public void set(quickfix.fix50sp2.component.ComplexEvents component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.ComplexEvents get(quickfix.fix50sp2.component.ComplexEvents component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.ComplexEvents getComplexEvents() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.ComplexEvents());
	}

	public void set(quickfix.field.NoComplexEvents value) {
		setField(value);
	}

	public quickfix.field.NoComplexEvents get(quickfix.field.NoComplexEvents value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoComplexEvents getNoComplexEvents() throws FieldNotFound {
		return get(new quickfix.field.NoComplexEvents());
	}

	public boolean isSet(quickfix.field.NoComplexEvents field) {
		return isSetField(field);
	}

	public boolean isSetNoComplexEvents() {
		return isSetField(1483);
	}

	public static class NoComplexEvents extends Group {

		static final long serialVersionUID = 20050617;

		public NoComplexEvents() {
			super(1483, 1484,
				new int[] {1484, 1485, 1486, 1487, 1488, 1489, 1490, 1491,  0 });
		}
		
	public void set(quickfix.field.ComplexEventType value) {
		setField(value);
	}

	public quickfix.field.ComplexEventType get(quickfix.field.ComplexEventType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ComplexEventType getComplexEventType() throws FieldNotFound {
		return get(new quickfix.field.ComplexEventType());
	}

	public boolean isSet(quickfix.field.ComplexEventType field) {
		return isSetField(field);
	}

	public boolean isSetComplexEventType() {
		return isSetField(1484);
	}

	public void set(quickfix.field.ComplexOptPayoutAmount value) {
		setField(value);
	}

	public quickfix.field.ComplexOptPayoutAmount get(quickfix.field.ComplexOptPayoutAmount value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ComplexOptPayoutAmount getComplexOptPayoutAmount() throws FieldNotFound {
		return get(new quickfix.field.ComplexOptPayoutAmount());
	}

	public boolean isSet(quickfix.field.ComplexOptPayoutAmount field) {
		return isSetField(field);
	}

	public boolean isSetComplexOptPayoutAmount() {
		return isSetField(1485);
	}

	public void set(quickfix.field.ComplexEventPrice value) {
		setField(value);
	}

	public quickfix.field.ComplexEventPrice get(quickfix.field.ComplexEventPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ComplexEventPrice getComplexEventPrice() throws FieldNotFound {
		return get(new quickfix.field.ComplexEventPrice());
	}

	public boolean isSet(quickfix.field.ComplexEventPrice field) {
		return isSetField(field);
	}

	public boolean isSetComplexEventPrice() {
		return isSetField(1486);
	}

	public void set(quickfix.field.ComplexEventPriceBoundaryMethod value) {
		setField(value);
	}

	public quickfix.field.ComplexEventPriceBoundaryMethod get(quickfix.field.ComplexEventPriceBoundaryMethod value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ComplexEventPriceBoundaryMethod getComplexEventPriceBoundaryMethod() throws FieldNotFound {
		return get(new quickfix.field.ComplexEventPriceBoundaryMethod());
	}

	public boolean isSet(quickfix.field.ComplexEventPriceBoundaryMethod field) {
		return isSetField(field);
	}

	public boolean isSetComplexEventPriceBoundaryMethod() {
		return isSetField(1487);
	}

	public void set(quickfix.field.ComplexEventPriceBoundaryPrecision value) {
		setField(value);
	}

	public quickfix.field.ComplexEventPriceBoundaryPrecision get(quickfix.field.ComplexEventPriceBoundaryPrecision value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ComplexEventPriceBoundaryPrecision getComplexEventPriceBoundaryPrecision() throws FieldNotFound {
		return get(new quickfix.field.ComplexEventPriceBoundaryPrecision());
	}

	public boolean isSet(quickfix.field.ComplexEventPriceBoundaryPrecision field) {
		return isSetField(field);
	}

	public boolean isSetComplexEventPriceBoundaryPrecision() {
		return isSetField(1488);
	}

	public void set(quickfix.field.ComplexEventPriceTimeType value) {
		setField(value);
	}

	public quickfix.field.ComplexEventPriceTimeType get(quickfix.field.ComplexEventPriceTimeType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ComplexEventPriceTimeType getComplexEventPriceTimeType() throws FieldNotFound {
		return get(new quickfix.field.ComplexEventPriceTimeType());
	}

	public boolean isSet(quickfix.field.ComplexEventPriceTimeType field) {
		return isSetField(field);
	}

	public boolean isSetComplexEventPriceTimeType() {
		return isSetField(1489);
	}

	public void set(quickfix.field.ComplexEventCondition value) {
		setField(value);
	}

	public quickfix.field.ComplexEventCondition get(quickfix.field.ComplexEventCondition value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ComplexEventCondition getComplexEventCondition() throws FieldNotFound {
		return get(new quickfix.field.ComplexEventCondition());
	}

	public boolean isSet(quickfix.field.ComplexEventCondition field) {
		return isSetField(field);
	}

	public boolean isSetComplexEventCondition() {
		return isSetField(1490);
	}

	public void set(quickfix.fix50sp2.component.ComplexEventDates component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.ComplexEventDates get(quickfix.fix50sp2.component.ComplexEventDates component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.ComplexEventDates getComplexEventDates() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.ComplexEventDates());
	}

	public void set(quickfix.field.NoComplexEventDates value) {
		setField(value);
	}

	public quickfix.field.NoComplexEventDates get(quickfix.field.NoComplexEventDates value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoComplexEventDates getNoComplexEventDates() throws FieldNotFound {
		return get(new quickfix.field.NoComplexEventDates());
	}

	public boolean isSet(quickfix.field.NoComplexEventDates field) {
		return isSetField(field);
	}

	public boolean isSetNoComplexEventDates() {
		return isSetField(1491);
	}

	public static class NoComplexEventDates extends Group {

		static final long serialVersionUID = 20050617;

		public NoComplexEventDates() {
			super(1491, 1492,
				new int[] {1492, 1493, 1494,  0 });
		}
		
	public void set(quickfix.field.ComplexEventStartDate value) {
		setField(value);
	}

	public quickfix.field.ComplexEventStartDate get(quickfix.field.ComplexEventStartDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ComplexEventStartDate getComplexEventStartDate() throws FieldNotFound {
		return get(new quickfix.field.ComplexEventStartDate());
	}

	public boolean isSet(quickfix.field.ComplexEventStartDate field) {
		return isSetField(field);
	}

	public boolean isSetComplexEventStartDate() {
		return isSetField(1492);
	}

	public void set(quickfix.field.ComplexEventEndDate value) {
		setField(value);
	}

	public quickfix.field.ComplexEventEndDate get(quickfix.field.ComplexEventEndDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ComplexEventEndDate getComplexEventEndDate() throws FieldNotFound {
		return get(new quickfix.field.ComplexEventEndDate());
	}

	public boolean isSet(quickfix.field.ComplexEventEndDate field) {
		return isSetField(field);
	}

	public boolean isSetComplexEventEndDate() {
		return isSetField(1493);
	}

	public void set(quickfix.fix50sp2.component.ComplexEventTimes component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.ComplexEventTimes get(quickfix.fix50sp2.component.ComplexEventTimes component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.ComplexEventTimes getComplexEventTimes() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.ComplexEventTimes());
	}

	public void set(quickfix.field.NoComplexEventTimes value) {
		setField(value);
	}

	public quickfix.field.NoComplexEventTimes get(quickfix.field.NoComplexEventTimes value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoComplexEventTimes getNoComplexEventTimes() throws FieldNotFound {
		return get(new quickfix.field.NoComplexEventTimes());
	}

	public boolean isSet(quickfix.field.NoComplexEventTimes field) {
		return isSetField(field);
	}

	public boolean isSetNoComplexEventTimes() {
		return isSetField(1494);
	}

	public static class NoComplexEventTimes extends Group {

		static final long serialVersionUID = 20050617;

		public NoComplexEventTimes() {
			super(1494, 1495,
				new int[] {1495, 1496,  0 });
		}
		
	public void set(quickfix.field.ComplexEventStartTime value) {
		setField(value);
	}

	public quickfix.field.ComplexEventStartTime get(quickfix.field.ComplexEventStartTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ComplexEventStartTime getComplexEventStartTime() throws FieldNotFound {
		return get(new quickfix.field.ComplexEventStartTime());
	}

	public boolean isSet(quickfix.field.ComplexEventStartTime field) {
		return isSetField(field);
	}

	public boolean isSetComplexEventStartTime() {
		return isSetField(1495);
	}

	public void set(quickfix.field.ComplexEventEndTime value) {
		setField(value);
	}

	public quickfix.field.ComplexEventEndTime get(quickfix.field.ComplexEventEndTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ComplexEventEndTime getComplexEventEndTime() throws FieldNotFound {
		return get(new quickfix.field.ComplexEventEndTime());
	}

	public boolean isSet(quickfix.field.ComplexEventEndTime field) {
		return isSetField(field);
	}

	public boolean isSetComplexEventEndTime() {
		return isSetField(1496);
	}

	}

	}

	}

	public void set(quickfix.fix50sp2.component.SecondaryPriceLimits component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.SecondaryPriceLimits get(quickfix.fix50sp2.component.SecondaryPriceLimits component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.SecondaryPriceLimits getSecondaryPriceLimits() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.SecondaryPriceLimits());
	}

	public void set(quickfix.field.SecondaryPriceLimitType value) {
		setField(value);
	}

	public quickfix.field.SecondaryPriceLimitType get(quickfix.field.SecondaryPriceLimitType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecondaryPriceLimitType getSecondaryPriceLimitType() throws FieldNotFound {
		return get(new quickfix.field.SecondaryPriceLimitType());
	}

	public boolean isSet(quickfix.field.SecondaryPriceLimitType field) {
		return isSetField(field);
	}

	public boolean isSetSecondaryPriceLimitType() {
		return isSetField(1305);
	}

	public void set(quickfix.field.SecondaryLowLimitPrice value) {
		setField(value);
	}

	public quickfix.field.SecondaryLowLimitPrice get(quickfix.field.SecondaryLowLimitPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecondaryLowLimitPrice getSecondaryLowLimitPrice() throws FieldNotFound {
		return get(new quickfix.field.SecondaryLowLimitPrice());
	}

	public boolean isSet(quickfix.field.SecondaryLowLimitPrice field) {
		return isSetField(field);
	}

	public boolean isSetSecondaryLowLimitPrice() {
		return isSetField(1221);
	}

	public void set(quickfix.field.SecondaryHighLimitPrice value) {
		setField(value);
	}

	public quickfix.field.SecondaryHighLimitPrice get(quickfix.field.SecondaryHighLimitPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecondaryHighLimitPrice getSecondaryHighLimitPrice() throws FieldNotFound {
		return get(new quickfix.field.SecondaryHighLimitPrice());
	}

	public boolean isSet(quickfix.field.SecondaryHighLimitPrice field) {
		return isSetField(field);
	}

	public boolean isSetSecondaryHighLimitPrice() {
		return isSetField(1230);
	}

	public void set(quickfix.field.SecondaryTradingReferencePrice value) {
		setField(value);
	}

	public quickfix.field.SecondaryTradingReferencePrice get(quickfix.field.SecondaryTradingReferencePrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecondaryTradingReferencePrice getSecondaryTradingReferencePrice() throws FieldNotFound {
		return get(new quickfix.field.SecondaryTradingReferencePrice());
	}

	public boolean isSet(quickfix.field.SecondaryTradingReferencePrice field) {
		return isSetField(field);
	}

	public boolean isSetSecondaryTradingReferencePrice() {
		return isSetField(1240);
	}

	public void set(quickfix.field.Currency value) {
		setField(value);
	}

	public quickfix.field.Currency get(quickfix.field.Currency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Currency getCurrency() throws FieldNotFound {
		return get(new quickfix.field.Currency());
	}

	public boolean isSet(quickfix.field.Currency field) {
		return isSetField(field);
	}

	public boolean isSetCurrency() {
		return isSetField(15);
	}

	public void set(quickfix.field.CorporateAction value) {
		setField(value);
	}

	public quickfix.field.CorporateAction get(quickfix.field.CorporateAction value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CorporateAction getCorporateAction() throws FieldNotFound {
		return get(new quickfix.field.CorporateAction());
	}

	public boolean isSet(quickfix.field.CorporateAction field) {
		return isSetField(field);
	}

	public boolean isSetCorporateAction() {
		return isSetField(292);
	}

	public void set(quickfix.fix50sp2.component.InstrumentExtension component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.InstrumentExtension get(quickfix.fix50sp2.component.InstrumentExtension component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.InstrumentExtension getInstrumentExtension() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.InstrumentExtension());
	}

	public void set(quickfix.field.DeliveryForm value) {
		setField(value);
	}

	public quickfix.field.DeliveryForm get(quickfix.field.DeliveryForm value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DeliveryForm getDeliveryForm() throws FieldNotFound {
		return get(new quickfix.field.DeliveryForm());
	}

	public boolean isSet(quickfix.field.DeliveryForm field) {
		return isSetField(field);
	}

	public boolean isSetDeliveryForm() {
		return isSetField(668);
	}

	public void set(quickfix.field.PctAtRisk value) {
		setField(value);
	}

	public quickfix.field.PctAtRisk get(quickfix.field.PctAtRisk value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PctAtRisk getPctAtRisk() throws FieldNotFound {
		return get(new quickfix.field.PctAtRisk());
	}

	public boolean isSet(quickfix.field.PctAtRisk field) {
		return isSetField(field);
	}

	public boolean isSetPctAtRisk() {
		return isSetField(869);
	}

	public void set(quickfix.fix50sp2.component.AttrbGrp component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.AttrbGrp get(quickfix.fix50sp2.component.AttrbGrp component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.AttrbGrp getAttrbGrp() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.AttrbGrp());
	}

	public void set(quickfix.field.NoInstrAttrib value) {
		setField(value);
	}

	public quickfix.field.NoInstrAttrib get(quickfix.field.NoInstrAttrib value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoInstrAttrib getNoInstrAttrib() throws FieldNotFound {
		return get(new quickfix.field.NoInstrAttrib());
	}

	public boolean isSet(quickfix.field.NoInstrAttrib field) {
		return isSetField(field);
	}

	public boolean isSetNoInstrAttrib() {
		return isSetField(870);
	}

	public static class NoInstrAttrib extends Group {

		static final long serialVersionUID = 20050617;

		public NoInstrAttrib() {
			super(870, 871,
				new int[] {871, 872,  0 });
		}
		
	public void set(quickfix.field.InstrAttribType value) {
		setField(value);
	}

	public quickfix.field.InstrAttribType get(quickfix.field.InstrAttribType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.InstrAttribType getInstrAttribType() throws FieldNotFound {
		return get(new quickfix.field.InstrAttribType());
	}

	public boolean isSet(quickfix.field.InstrAttribType field) {
		return isSetField(field);
	}

	public boolean isSetInstrAttribType() {
		return isSetField(871);
	}

	public void set(quickfix.field.InstrAttribValue value) {
		setField(value);
	}

	public quickfix.field.InstrAttribValue get(quickfix.field.InstrAttribValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.InstrAttribValue getInstrAttribValue() throws FieldNotFound {
		return get(new quickfix.field.InstrAttribValue());
	}

	public boolean isSet(quickfix.field.InstrAttribValue field) {
		return isSetField(field);
	}

	public boolean isSetInstrAttribValue() {
		return isSetField(872);
	}

	}

	public void set(quickfix.fix50sp2.component.InstrmtLegGrp component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.InstrmtLegGrp get(quickfix.fix50sp2.component.InstrmtLegGrp component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.InstrmtLegGrp getInstrmtLegGrp() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.InstrmtLegGrp());
	}

	public void set(quickfix.field.NoLegs value) {
		setField(value);
	}

	public quickfix.field.NoLegs get(quickfix.field.NoLegs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoLegs getNoLegs() throws FieldNotFound {
		return get(new quickfix.field.NoLegs());
	}

	public boolean isSet(quickfix.field.NoLegs field) {
		return isSetField(field);
	}

	public boolean isSetNoLegs() {
		return isSetField(555);
	}

	public static class NoLegs extends Group {

		static final long serialVersionUID = 20050617;

		public NoLegs() {
			super(555, 600,
				new int[] {600, 601, 602, 603, 604, 607, 608, 609, 764, 610, 611, 1212, 248, 249, 250, 251, 252, 253, 257, 599, 596, 597, 598, 254, 612, 942, 613, 614, 1436, 1440, 999, 1224, 1421, 1422, 1001, 1420, 615, 616, 617, 618, 619, 620, 621, 622, 623, 624, 556, 740, 739, 955, 956, 1358, 1017, 566,  0 });
		}
		
	public void set(quickfix.fix50sp2.component.InstrumentLeg component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.InstrumentLeg get(quickfix.fix50sp2.component.InstrumentLeg component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.InstrumentLeg getInstrumentLeg() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.InstrumentLeg());
	}

	public void set(quickfix.field.LegSymbol value) {
		setField(value);
	}

	public quickfix.field.LegSymbol get(quickfix.field.LegSymbol value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegSymbol getLegSymbol() throws FieldNotFound {
		return get(new quickfix.field.LegSymbol());
	}

	public boolean isSet(quickfix.field.LegSymbol field) {
		return isSetField(field);
	}

	public boolean isSetLegSymbol() {
		return isSetField(600);
	}

	public void set(quickfix.field.LegSymbolSfx value) {
		setField(value);
	}

	public quickfix.field.LegSymbolSfx get(quickfix.field.LegSymbolSfx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegSymbolSfx getLegSymbolSfx() throws FieldNotFound {
		return get(new quickfix.field.LegSymbolSfx());
	}

	public boolean isSet(quickfix.field.LegSymbolSfx field) {
		return isSetField(field);
	}

	public boolean isSetLegSymbolSfx() {
		return isSetField(601);
	}

	public void set(quickfix.field.LegSecurityID value) {
		setField(value);
	}

	public quickfix.field.LegSecurityID get(quickfix.field.LegSecurityID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegSecurityID getLegSecurityID() throws FieldNotFound {
		return get(new quickfix.field.LegSecurityID());
	}

	public boolean isSet(quickfix.field.LegSecurityID field) {
		return isSetField(field);
	}

	public boolean isSetLegSecurityID() {
		return isSetField(602);
	}

	public void set(quickfix.field.LegSecurityIDSource value) {
		setField(value);
	}

	public quickfix.field.LegSecurityIDSource get(quickfix.field.LegSecurityIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegSecurityIDSource getLegSecurityIDSource() throws FieldNotFound {
		return get(new quickfix.field.LegSecurityIDSource());
	}

	public boolean isSet(quickfix.field.LegSecurityIDSource field) {
		return isSetField(field);
	}

	public boolean isSetLegSecurityIDSource() {
		return isSetField(603);
	}

	public void set(quickfix.fix50sp2.component.LegSecAltIDGrp component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.LegSecAltIDGrp get(quickfix.fix50sp2.component.LegSecAltIDGrp component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.LegSecAltIDGrp getLegSecAltIDGrp() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.LegSecAltIDGrp());
	}

	public void set(quickfix.field.NoLegSecurityAltID value) {
		setField(value);
	}

	public quickfix.field.NoLegSecurityAltID get(quickfix.field.NoLegSecurityAltID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoLegSecurityAltID getNoLegSecurityAltID() throws FieldNotFound {
		return get(new quickfix.field.NoLegSecurityAltID());
	}

	public boolean isSet(quickfix.field.NoLegSecurityAltID field) {
		return isSetField(field);
	}

	public boolean isSetNoLegSecurityAltID() {
		return isSetField(604);
	}

	public static class NoLegSecurityAltID extends Group {

		static final long serialVersionUID = 20050617;

		public NoLegSecurityAltID() {
			super(604, 605,
				new int[] {605, 606,  0 });
		}
		
	public void set(quickfix.field.LegSecurityAltID value) {
		setField(value);
	}

	public quickfix.field.LegSecurityAltID get(quickfix.field.LegSecurityAltID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegSecurityAltID getLegSecurityAltID() throws FieldNotFound {
		return get(new quickfix.field.LegSecurityAltID());
	}

	public boolean isSet(quickfix.field.LegSecurityAltID field) {
		return isSetField(field);
	}

	public boolean isSetLegSecurityAltID() {
		return isSetField(605);
	}

	public void set(quickfix.field.LegSecurityAltIDSource value) {
		setField(value);
	}

	public quickfix.field.LegSecurityAltIDSource get(quickfix.field.LegSecurityAltIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegSecurityAltIDSource getLegSecurityAltIDSource() throws FieldNotFound {
		return get(new quickfix.field.LegSecurityAltIDSource());
	}

	public boolean isSet(quickfix.field.LegSecurityAltIDSource field) {
		return isSetField(field);
	}

	public boolean isSetLegSecurityAltIDSource() {
		return isSetField(606);
	}

	}

	public void set(quickfix.field.LegProduct value) {
		setField(value);
	}

	public quickfix.field.LegProduct get(quickfix.field.LegProduct value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegProduct getLegProduct() throws FieldNotFound {
		return get(new quickfix.field.LegProduct());
	}

	public boolean isSet(quickfix.field.LegProduct field) {
		return isSetField(field);
	}

	public boolean isSetLegProduct() {
		return isSetField(607);
	}

	public void set(quickfix.field.LegCFICode value) {
		setField(value);
	}

	public quickfix.field.LegCFICode get(quickfix.field.LegCFICode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegCFICode getLegCFICode() throws FieldNotFound {
		return get(new quickfix.field.LegCFICode());
	}

	public boolean isSet(quickfix.field.LegCFICode field) {
		return isSetField(field);
	}

	public boolean isSetLegCFICode() {
		return isSetField(608);
	}

	public void set(quickfix.field.LegSecurityType value) {
		setField(value);
	}

	public quickfix.field.LegSecurityType get(quickfix.field.LegSecurityType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegSecurityType getLegSecurityType() throws FieldNotFound {
		return get(new quickfix.field.LegSecurityType());
	}

	public boolean isSet(quickfix.field.LegSecurityType field) {
		return isSetField(field);
	}

	public boolean isSetLegSecurityType() {
		return isSetField(609);
	}

	public void set(quickfix.field.LegSecuritySubType value) {
		setField(value);
	}

	public quickfix.field.LegSecuritySubType get(quickfix.field.LegSecuritySubType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegSecuritySubType getLegSecuritySubType() throws FieldNotFound {
		return get(new quickfix.field.LegSecuritySubType());
	}

	public boolean isSet(quickfix.field.LegSecuritySubType field) {
		return isSetField(field);
	}

	public boolean isSetLegSecuritySubType() {
		return isSetField(764);
	}

	public void set(quickfix.field.LegMaturityMonthYear value) {
		setField(value);
	}

	public quickfix.field.LegMaturityMonthYear get(quickfix.field.LegMaturityMonthYear value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegMaturityMonthYear getLegMaturityMonthYear() throws FieldNotFound {
		return get(new quickfix.field.LegMaturityMonthYear());
	}

	public boolean isSet(quickfix.field.LegMaturityMonthYear field) {
		return isSetField(field);
	}

	public boolean isSetLegMaturityMonthYear() {
		return isSetField(610);
	}

	public void set(quickfix.field.LegMaturityDate value) {
		setField(value);
	}

	public quickfix.field.LegMaturityDate get(quickfix.field.LegMaturityDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegMaturityDate getLegMaturityDate() throws FieldNotFound {
		return get(new quickfix.field.LegMaturityDate());
	}

	public boolean isSet(quickfix.field.LegMaturityDate field) {
		return isSetField(field);
	}

	public boolean isSetLegMaturityDate() {
		return isSetField(611);
	}

	public void set(quickfix.field.LegMaturityTime value) {
		setField(value);
	}

	public quickfix.field.LegMaturityTime get(quickfix.field.LegMaturityTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegMaturityTime getLegMaturityTime() throws FieldNotFound {
		return get(new quickfix.field.LegMaturityTime());
	}

	public boolean isSet(quickfix.field.LegMaturityTime field) {
		return isSetField(field);
	}

	public boolean isSetLegMaturityTime() {
		return isSetField(1212);
	}

	public void set(quickfix.field.LegCouponPaymentDate value) {
		setField(value);
	}

	public quickfix.field.LegCouponPaymentDate get(quickfix.field.LegCouponPaymentDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegCouponPaymentDate getLegCouponPaymentDate() throws FieldNotFound {
		return get(new quickfix.field.LegCouponPaymentDate());
	}

	public boolean isSet(quickfix.field.LegCouponPaymentDate field) {
		return isSetField(field);
	}

	public boolean isSetLegCouponPaymentDate() {
		return isSetField(248);
	}

	public void set(quickfix.field.LegIssueDate value) {
		setField(value);
	}

	public quickfix.field.LegIssueDate get(quickfix.field.LegIssueDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegIssueDate getLegIssueDate() throws FieldNotFound {
		return get(new quickfix.field.LegIssueDate());
	}

	public boolean isSet(quickfix.field.LegIssueDate field) {
		return isSetField(field);
	}

	public boolean isSetLegIssueDate() {
		return isSetField(249);
	}

	public void set(quickfix.field.LegRepoCollateralSecurityType value) {
		setField(value);
	}

	public quickfix.field.LegRepoCollateralSecurityType get(quickfix.field.LegRepoCollateralSecurityType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegRepoCollateralSecurityType getLegRepoCollateralSecurityType() throws FieldNotFound {
		return get(new quickfix.field.LegRepoCollateralSecurityType());
	}

	public boolean isSet(quickfix.field.LegRepoCollateralSecurityType field) {
		return isSetField(field);
	}

	public boolean isSetLegRepoCollateralSecurityType() {
		return isSetField(250);
	}

	public void set(quickfix.field.LegRepurchaseTerm value) {
		setField(value);
	}

	public quickfix.field.LegRepurchaseTerm get(quickfix.field.LegRepurchaseTerm value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegRepurchaseTerm getLegRepurchaseTerm() throws FieldNotFound {
		return get(new quickfix.field.LegRepurchaseTerm());
	}

	public boolean isSet(quickfix.field.LegRepurchaseTerm field) {
		return isSetField(field);
	}

	public boolean isSetLegRepurchaseTerm() {
		return isSetField(251);
	}

	public void set(quickfix.field.LegRepurchaseRate value) {
		setField(value);
	}

	public quickfix.field.LegRepurchaseRate get(quickfix.field.LegRepurchaseRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegRepurchaseRate getLegRepurchaseRate() throws FieldNotFound {
		return get(new quickfix.field.LegRepurchaseRate());
	}

	public boolean isSet(quickfix.field.LegRepurchaseRate field) {
		return isSetField(field);
	}

	public boolean isSetLegRepurchaseRate() {
		return isSetField(252);
	}

	public void set(quickfix.field.LegFactor value) {
		setField(value);
	}

	public quickfix.field.LegFactor get(quickfix.field.LegFactor value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegFactor getLegFactor() throws FieldNotFound {
		return get(new quickfix.field.LegFactor());
	}

	public boolean isSet(quickfix.field.LegFactor field) {
		return isSetField(field);
	}

	public boolean isSetLegFactor() {
		return isSetField(253);
	}

	public void set(quickfix.field.LegCreditRating value) {
		setField(value);
	}

	public quickfix.field.LegCreditRating get(quickfix.field.LegCreditRating value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegCreditRating getLegCreditRating() throws FieldNotFound {
		return get(new quickfix.field.LegCreditRating());
	}

	public boolean isSet(quickfix.field.LegCreditRating field) {
		return isSetField(field);
	}

	public boolean isSetLegCreditRating() {
		return isSetField(257);
	}

	public void set(quickfix.field.LegInstrRegistry value) {
		setField(value);
	}

	public quickfix.field.LegInstrRegistry get(quickfix.field.LegInstrRegistry value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegInstrRegistry getLegInstrRegistry() throws FieldNotFound {
		return get(new quickfix.field.LegInstrRegistry());
	}

	public boolean isSet(quickfix.field.LegInstrRegistry field) {
		return isSetField(field);
	}

	public boolean isSetLegInstrRegistry() {
		return isSetField(599);
	}

	public void set(quickfix.field.LegCountryOfIssue value) {
		setField(value);
	}

	public quickfix.field.LegCountryOfIssue get(quickfix.field.LegCountryOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegCountryOfIssue getLegCountryOfIssue() throws FieldNotFound {
		return get(new quickfix.field.LegCountryOfIssue());
	}

	public boolean isSet(quickfix.field.LegCountryOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetLegCountryOfIssue() {
		return isSetField(596);
	}

	public void set(quickfix.field.LegStateOrProvinceOfIssue value) {
		setField(value);
	}

	public quickfix.field.LegStateOrProvinceOfIssue get(quickfix.field.LegStateOrProvinceOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegStateOrProvinceOfIssue getLegStateOrProvinceOfIssue() throws FieldNotFound {
		return get(new quickfix.field.LegStateOrProvinceOfIssue());
	}

	public boolean isSet(quickfix.field.LegStateOrProvinceOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetLegStateOrProvinceOfIssue() {
		return isSetField(597);
	}

	public void set(quickfix.field.LegLocaleOfIssue value) {
		setField(value);
	}

	public quickfix.field.LegLocaleOfIssue get(quickfix.field.LegLocaleOfIssue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegLocaleOfIssue getLegLocaleOfIssue() throws FieldNotFound {
		return get(new quickfix.field.LegLocaleOfIssue());
	}

	public boolean isSet(quickfix.field.LegLocaleOfIssue field) {
		return isSetField(field);
	}

	public boolean isSetLegLocaleOfIssue() {
		return isSetField(598);
	}

	public void set(quickfix.field.LegRedemptionDate value) {
		setField(value);
	}

	public quickfix.field.LegRedemptionDate get(quickfix.field.LegRedemptionDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegRedemptionDate getLegRedemptionDate() throws FieldNotFound {
		return get(new quickfix.field.LegRedemptionDate());
	}

	public boolean isSet(quickfix.field.LegRedemptionDate field) {
		return isSetField(field);
	}

	public boolean isSetLegRedemptionDate() {
		return isSetField(254);
	}

	public void set(quickfix.field.LegStrikePrice value) {
		setField(value);
	}

	public quickfix.field.LegStrikePrice get(quickfix.field.LegStrikePrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegStrikePrice getLegStrikePrice() throws FieldNotFound {
		return get(new quickfix.field.LegStrikePrice());
	}

	public boolean isSet(quickfix.field.LegStrikePrice field) {
		return isSetField(field);
	}

	public boolean isSetLegStrikePrice() {
		return isSetField(612);
	}

	public void set(quickfix.field.LegStrikeCurrency value) {
		setField(value);
	}

	public quickfix.field.LegStrikeCurrency get(quickfix.field.LegStrikeCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegStrikeCurrency getLegStrikeCurrency() throws FieldNotFound {
		return get(new quickfix.field.LegStrikeCurrency());
	}

	public boolean isSet(quickfix.field.LegStrikeCurrency field) {
		return isSetField(field);
	}

	public boolean isSetLegStrikeCurrency() {
		return isSetField(942);
	}

	public void set(quickfix.field.LegOptAttribute value) {
		setField(value);
	}

	public quickfix.field.LegOptAttribute get(quickfix.field.LegOptAttribute value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegOptAttribute getLegOptAttribute() throws FieldNotFound {
		return get(new quickfix.field.LegOptAttribute());
	}

	public boolean isSet(quickfix.field.LegOptAttribute field) {
		return isSetField(field);
	}

	public boolean isSetLegOptAttribute() {
		return isSetField(613);
	}

	public void set(quickfix.field.LegContractMultiplier value) {
		setField(value);
	}

	public quickfix.field.LegContractMultiplier get(quickfix.field.LegContractMultiplier value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegContractMultiplier getLegContractMultiplier() throws FieldNotFound {
		return get(new quickfix.field.LegContractMultiplier());
	}

	public boolean isSet(quickfix.field.LegContractMultiplier field) {
		return isSetField(field);
	}

	public boolean isSetLegContractMultiplier() {
		return isSetField(614);
	}

	public void set(quickfix.field.LegContractMultiplierUnit value) {
		setField(value);
	}

	public quickfix.field.LegContractMultiplierUnit get(quickfix.field.LegContractMultiplierUnit value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegContractMultiplierUnit getLegContractMultiplierUnit() throws FieldNotFound {
		return get(new quickfix.field.LegContractMultiplierUnit());
	}

	public boolean isSet(quickfix.field.LegContractMultiplierUnit field) {
		return isSetField(field);
	}

	public boolean isSetLegContractMultiplierUnit() {
		return isSetField(1436);
	}

	public void set(quickfix.field.LegFlowScheduleType value) {
		setField(value);
	}

	public quickfix.field.LegFlowScheduleType get(quickfix.field.LegFlowScheduleType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegFlowScheduleType getLegFlowScheduleType() throws FieldNotFound {
		return get(new quickfix.field.LegFlowScheduleType());
	}

	public boolean isSet(quickfix.field.LegFlowScheduleType field) {
		return isSetField(field);
	}

	public boolean isSetLegFlowScheduleType() {
		return isSetField(1440);
	}

	public void set(quickfix.field.LegUnitOfMeasure value) {
		setField(value);
	}

	public quickfix.field.LegUnitOfMeasure get(quickfix.field.LegUnitOfMeasure value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegUnitOfMeasure getLegUnitOfMeasure() throws FieldNotFound {
		return get(new quickfix.field.LegUnitOfMeasure());
	}

	public boolean isSet(quickfix.field.LegUnitOfMeasure field) {
		return isSetField(field);
	}

	public boolean isSetLegUnitOfMeasure() {
		return isSetField(999);
	}

	public void set(quickfix.field.LegUnitOfMeasureQty value) {
		setField(value);
	}

	public quickfix.field.LegUnitOfMeasureQty get(quickfix.field.LegUnitOfMeasureQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegUnitOfMeasureQty getLegUnitOfMeasureQty() throws FieldNotFound {
		return get(new quickfix.field.LegUnitOfMeasureQty());
	}

	public boolean isSet(quickfix.field.LegUnitOfMeasureQty field) {
		return isSetField(field);
	}

	public boolean isSetLegUnitOfMeasureQty() {
		return isSetField(1224);
	}

	public void set(quickfix.field.LegPriceUnitOfMeasure value) {
		setField(value);
	}

	public quickfix.field.LegPriceUnitOfMeasure get(quickfix.field.LegPriceUnitOfMeasure value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegPriceUnitOfMeasure getLegPriceUnitOfMeasure() throws FieldNotFound {
		return get(new quickfix.field.LegPriceUnitOfMeasure());
	}

	public boolean isSet(quickfix.field.LegPriceUnitOfMeasure field) {
		return isSetField(field);
	}

	public boolean isSetLegPriceUnitOfMeasure() {
		return isSetField(1421);
	}

	public void set(quickfix.field.LegPriceUnitOfMeasureQty value) {
		setField(value);
	}

	public quickfix.field.LegPriceUnitOfMeasureQty get(quickfix.field.LegPriceUnitOfMeasureQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegPriceUnitOfMeasureQty getLegPriceUnitOfMeasureQty() throws FieldNotFound {
		return get(new quickfix.field.LegPriceUnitOfMeasureQty());
	}

	public boolean isSet(quickfix.field.LegPriceUnitOfMeasureQty field) {
		return isSetField(field);
	}

	public boolean isSetLegPriceUnitOfMeasureQty() {
		return isSetField(1422);
	}

	public void set(quickfix.field.LegTimeUnit value) {
		setField(value);
	}

	public quickfix.field.LegTimeUnit get(quickfix.field.LegTimeUnit value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegTimeUnit getLegTimeUnit() throws FieldNotFound {
		return get(new quickfix.field.LegTimeUnit());
	}

	public boolean isSet(quickfix.field.LegTimeUnit field) {
		return isSetField(field);
	}

	public boolean isSetLegTimeUnit() {
		return isSetField(1001);
	}

	public void set(quickfix.field.LegExerciseStyle value) {
		setField(value);
	}

	public quickfix.field.LegExerciseStyle get(quickfix.field.LegExerciseStyle value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegExerciseStyle getLegExerciseStyle() throws FieldNotFound {
		return get(new quickfix.field.LegExerciseStyle());
	}

	public boolean isSet(quickfix.field.LegExerciseStyle field) {
		return isSetField(field);
	}

	public boolean isSetLegExerciseStyle() {
		return isSetField(1420);
	}

	public void set(quickfix.field.LegCouponRate value) {
		setField(value);
	}

	public quickfix.field.LegCouponRate get(quickfix.field.LegCouponRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegCouponRate getLegCouponRate() throws FieldNotFound {
		return get(new quickfix.field.LegCouponRate());
	}

	public boolean isSet(quickfix.field.LegCouponRate field) {
		return isSetField(field);
	}

	public boolean isSetLegCouponRate() {
		return isSetField(615);
	}

	public void set(quickfix.field.LegSecurityExchange value) {
		setField(value);
	}

	public quickfix.field.LegSecurityExchange get(quickfix.field.LegSecurityExchange value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegSecurityExchange getLegSecurityExchange() throws FieldNotFound {
		return get(new quickfix.field.LegSecurityExchange());
	}

	public boolean isSet(quickfix.field.LegSecurityExchange field) {
		return isSetField(field);
	}

	public boolean isSetLegSecurityExchange() {
		return isSetField(616);
	}

	public void set(quickfix.field.LegIssuer value) {
		setField(value);
	}

	public quickfix.field.LegIssuer get(quickfix.field.LegIssuer value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegIssuer getLegIssuer() throws FieldNotFound {
		return get(new quickfix.field.LegIssuer());
	}

	public boolean isSet(quickfix.field.LegIssuer field) {
		return isSetField(field);
	}

	public boolean isSetLegIssuer() {
		return isSetField(617);
	}

	public void set(quickfix.field.EncodedLegIssuerLen value) {
		setField(value);
	}

	public quickfix.field.EncodedLegIssuerLen get(quickfix.field.EncodedLegIssuerLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EncodedLegIssuerLen getEncodedLegIssuerLen() throws FieldNotFound {
		return get(new quickfix.field.EncodedLegIssuerLen());
	}

	public boolean isSet(quickfix.field.EncodedLegIssuerLen field) {
		return isSetField(field);
	}

	public boolean isSetEncodedLegIssuerLen() {
		return isSetField(618);
	}

	public void set(quickfix.field.EncodedLegIssuer value) {
		setField(value);
	}

	public quickfix.field.EncodedLegIssuer get(quickfix.field.EncodedLegIssuer value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EncodedLegIssuer getEncodedLegIssuer() throws FieldNotFound {
		return get(new quickfix.field.EncodedLegIssuer());
	}

	public boolean isSet(quickfix.field.EncodedLegIssuer field) {
		return isSetField(field);
	}

	public boolean isSetEncodedLegIssuer() {
		return isSetField(619);
	}

	public void set(quickfix.field.LegSecurityDesc value) {
		setField(value);
	}

	public quickfix.field.LegSecurityDesc get(quickfix.field.LegSecurityDesc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegSecurityDesc getLegSecurityDesc() throws FieldNotFound {
		return get(new quickfix.field.LegSecurityDesc());
	}

	public boolean isSet(quickfix.field.LegSecurityDesc field) {
		return isSetField(field);
	}

	public boolean isSetLegSecurityDesc() {
		return isSetField(620);
	}

	public void set(quickfix.field.EncodedLegSecurityDescLen value) {
		setField(value);
	}

	public quickfix.field.EncodedLegSecurityDescLen get(quickfix.field.EncodedLegSecurityDescLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EncodedLegSecurityDescLen getEncodedLegSecurityDescLen() throws FieldNotFound {
		return get(new quickfix.field.EncodedLegSecurityDescLen());
	}

	public boolean isSet(quickfix.field.EncodedLegSecurityDescLen field) {
		return isSetField(field);
	}

	public boolean isSetEncodedLegSecurityDescLen() {
		return isSetField(621);
	}

	public void set(quickfix.field.EncodedLegSecurityDesc value) {
		setField(value);
	}

	public quickfix.field.EncodedLegSecurityDesc get(quickfix.field.EncodedLegSecurityDesc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EncodedLegSecurityDesc getEncodedLegSecurityDesc() throws FieldNotFound {
		return get(new quickfix.field.EncodedLegSecurityDesc());
	}

	public boolean isSet(quickfix.field.EncodedLegSecurityDesc field) {
		return isSetField(field);
	}

	public boolean isSetEncodedLegSecurityDesc() {
		return isSetField(622);
	}

	public void set(quickfix.field.LegRatioQty value) {
		setField(value);
	}

	public quickfix.field.LegRatioQty get(quickfix.field.LegRatioQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegRatioQty getLegRatioQty() throws FieldNotFound {
		return get(new quickfix.field.LegRatioQty());
	}

	public boolean isSet(quickfix.field.LegRatioQty field) {
		return isSetField(field);
	}

	public boolean isSetLegRatioQty() {
		return isSetField(623);
	}

	public void set(quickfix.field.LegSide value) {
		setField(value);
	}

	public quickfix.field.LegSide get(quickfix.field.LegSide value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegSide getLegSide() throws FieldNotFound {
		return get(new quickfix.field.LegSide());
	}

	public boolean isSet(quickfix.field.LegSide field) {
		return isSetField(field);
	}

	public boolean isSetLegSide() {
		return isSetField(624);
	}

	public void set(quickfix.field.LegCurrency value) {
		setField(value);
	}

	public quickfix.field.LegCurrency get(quickfix.field.LegCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegCurrency getLegCurrency() throws FieldNotFound {
		return get(new quickfix.field.LegCurrency());
	}

	public boolean isSet(quickfix.field.LegCurrency field) {
		return isSetField(field);
	}

	public boolean isSetLegCurrency() {
		return isSetField(556);
	}

	public void set(quickfix.field.LegPool value) {
		setField(value);
	}

	public quickfix.field.LegPool get(quickfix.field.LegPool value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegPool getLegPool() throws FieldNotFound {
		return get(new quickfix.field.LegPool());
	}

	public boolean isSet(quickfix.field.LegPool field) {
		return isSetField(field);
	}

	public boolean isSetLegPool() {
		return isSetField(740);
	}

	public void set(quickfix.field.LegDatedDate value) {
		setField(value);
	}

	public quickfix.field.LegDatedDate get(quickfix.field.LegDatedDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegDatedDate getLegDatedDate() throws FieldNotFound {
		return get(new quickfix.field.LegDatedDate());
	}

	public boolean isSet(quickfix.field.LegDatedDate field) {
		return isSetField(field);
	}

	public boolean isSetLegDatedDate() {
		return isSetField(739);
	}

	public void set(quickfix.field.LegContractSettlMonth value) {
		setField(value);
	}

	public quickfix.field.LegContractSettlMonth get(quickfix.field.LegContractSettlMonth value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegContractSettlMonth getLegContractSettlMonth() throws FieldNotFound {
		return get(new quickfix.field.LegContractSettlMonth());
	}

	public boolean isSet(quickfix.field.LegContractSettlMonth field) {
		return isSetField(field);
	}

	public boolean isSetLegContractSettlMonth() {
		return isSetField(955);
	}

	public void set(quickfix.field.LegInterestAccrualDate value) {
		setField(value);
	}

	public quickfix.field.LegInterestAccrualDate get(quickfix.field.LegInterestAccrualDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegInterestAccrualDate getLegInterestAccrualDate() throws FieldNotFound {
		return get(new quickfix.field.LegInterestAccrualDate());
	}

	public boolean isSet(quickfix.field.LegInterestAccrualDate field) {
		return isSetField(field);
	}

	public boolean isSetLegInterestAccrualDate() {
		return isSetField(956);
	}

	public void set(quickfix.field.LegPutOrCall value) {
		setField(value);
	}

	public quickfix.field.LegPutOrCall get(quickfix.field.LegPutOrCall value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegPutOrCall getLegPutOrCall() throws FieldNotFound {
		return get(new quickfix.field.LegPutOrCall());
	}

	public boolean isSet(quickfix.field.LegPutOrCall field) {
		return isSetField(field);
	}

	public boolean isSetLegPutOrCall() {
		return isSetField(1358);
	}

	public void set(quickfix.field.LegOptionRatio value) {
		setField(value);
	}

	public quickfix.field.LegOptionRatio get(quickfix.field.LegOptionRatio value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegOptionRatio getLegOptionRatio() throws FieldNotFound {
		return get(new quickfix.field.LegOptionRatio());
	}

	public boolean isSet(quickfix.field.LegOptionRatio field) {
		return isSetField(field);
	}

	public boolean isSetLegOptionRatio() {
		return isSetField(1017);
	}

	public void set(quickfix.field.LegPrice value) {
		setField(value);
	}

	public quickfix.field.LegPrice get(quickfix.field.LegPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegPrice getLegPrice() throws FieldNotFound {
		return get(new quickfix.field.LegPrice());
	}

	public boolean isSet(quickfix.field.LegPrice field) {
		return isSetField(field);
	}

	public boolean isSetLegPrice() {
		return isSetField(566);
	}

	}

	public void set(quickfix.field.RelSymTransactTime value) {
		setField(value);
	}

	public quickfix.field.RelSymTransactTime get(quickfix.field.RelSymTransactTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RelSymTransactTime getRelSymTransactTime() throws FieldNotFound {
		return get(new quickfix.field.RelSymTransactTime());
	}

	public boolean isSet(quickfix.field.RelSymTransactTime field) {
		return isSetField(field);
	}

	public boolean isSetRelSymTransactTime() {
		return isSetField(1504);
	}

	public void set(quickfix.field.Text value) {
		setField(value);
	}

	public quickfix.field.Text get(quickfix.field.Text value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Text getText() throws FieldNotFound {
		return get(new quickfix.field.Text());
	}

	public boolean isSet(quickfix.field.Text field) {
		return isSetField(field);
	}

	public boolean isSetText() {
		return isSetField(58);
	}

	public void set(quickfix.field.EncodedTextLen value) {
		setField(value);
	}

	public quickfix.field.EncodedTextLen get(quickfix.field.EncodedTextLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EncodedTextLen getEncodedTextLen() throws FieldNotFound {
		return get(new quickfix.field.EncodedTextLen());
	}

	public boolean isSet(quickfix.field.EncodedTextLen field) {
		return isSetField(field);
	}

	public boolean isSetEncodedTextLen() {
		return isSetField(354);
	}

	public void set(quickfix.field.EncodedText value) {
		setField(value);
	}

	public quickfix.field.EncodedText get(quickfix.field.EncodedText value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EncodedText getEncodedText() throws FieldNotFound {
		return get(new quickfix.field.EncodedText());
	}

	public boolean isSet(quickfix.field.EncodedText field) {
		return isSetField(field);
	}

	public boolean isSetEncodedText() {
		return isSetField(355);
	}

	}

}
