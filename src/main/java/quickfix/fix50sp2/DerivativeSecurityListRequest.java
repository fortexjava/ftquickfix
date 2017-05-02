
package quickfix.fix50sp2;

import quickfix.FieldNotFound;

import quickfix.Group;

public class DerivativeSecurityListRequest extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "z";
	

	public DerivativeSecurityListRequest() {
		super();
		getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
	}
	
	public DerivativeSecurityListRequest(quickfix.field.SecurityReqID securityReqID, quickfix.field.SecurityListRequestType securityListRequestType) {
		this();
		setField(securityReqID);
		setField(securityListRequestType);
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

	public void set(quickfix.field.SecurityListRequestType value) {
		setField(value);
	}

	public quickfix.field.SecurityListRequestType get(quickfix.field.SecurityListRequestType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecurityListRequestType getSecurityListRequestType() throws FieldNotFound {
		return get(new quickfix.field.SecurityListRequestType());
	}

	public boolean isSet(quickfix.field.SecurityListRequestType field) {
		return isSetField(field);
	}

	public boolean isSetSecurityListRequestType() {
		return isSetField(559);
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

	public void set(quickfix.field.SubscriptionRequestType value) {
		setField(value);
	}

	public quickfix.field.SubscriptionRequestType get(quickfix.field.SubscriptionRequestType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SubscriptionRequestType getSubscriptionRequestType() throws FieldNotFound {
		return get(new quickfix.field.SubscriptionRequestType());
	}

	public boolean isSet(quickfix.field.SubscriptionRequestType field) {
		return isSetField(field);
	}

	public boolean isSetSubscriptionRequestType() {
		return isSetField(263);
	}

}
