
package quickfix.fix50sp2.component;

import quickfix.FieldNotFound;

import quickfix.Group;

public class AllocGrp extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = {  };
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = { 78,  };
	protected int[] getGroupFields() { return componentGroups; }
	

	public AllocGrp() {
		super();
	}
	
	public void set(quickfix.field.NoAllocs value) {
		setField(value);
	}

	public quickfix.field.NoAllocs get(quickfix.field.NoAllocs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoAllocs getNoAllocs() throws FieldNotFound {
		return get(new quickfix.field.NoAllocs());
	}

	public boolean isSet(quickfix.field.NoAllocs field) {
		return isSetField(field);
	}

	public boolean isSetNoAllocs() {
		return isSetField(78);
	}

	public static class NoAllocs extends Group {

		static final long serialVersionUID = 20050617;

		public NoAllocs() {
			super(78, 79,
				new int[] {79, 661, 573, 366, 80, 467, 81, 989, 1002, 993, 1047, 992, 539, 208, 209, 161, 360, 361, 12, 13, 479, 497, 153, 154, 119, 737, 120, 736, 155, 156, 742, 741, 136, 576, 635, 780, 172, 169, 170, 171, 85,  0 });
		}
		
	public void set(quickfix.field.AllocAccount value) {
		setField(value);
	}

	public quickfix.field.AllocAccount get(quickfix.field.AllocAccount value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AllocAccount getAllocAccount() throws FieldNotFound {
		return get(new quickfix.field.AllocAccount());
	}

	public boolean isSet(quickfix.field.AllocAccount field) {
		return isSetField(field);
	}

	public boolean isSetAllocAccount() {
		return isSetField(79);
	}

	public void set(quickfix.field.AllocAcctIDSource value) {
		setField(value);
	}

	public quickfix.field.AllocAcctIDSource get(quickfix.field.AllocAcctIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AllocAcctIDSource getAllocAcctIDSource() throws FieldNotFound {
		return get(new quickfix.field.AllocAcctIDSource());
	}

	public boolean isSet(quickfix.field.AllocAcctIDSource field) {
		return isSetField(field);
	}

	public boolean isSetAllocAcctIDSource() {
		return isSetField(661);
	}

	public void set(quickfix.field.MatchStatus value) {
		setField(value);
	}

	public quickfix.field.MatchStatus get(quickfix.field.MatchStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MatchStatus getMatchStatus() throws FieldNotFound {
		return get(new quickfix.field.MatchStatus());
	}

	public boolean isSet(quickfix.field.MatchStatus field) {
		return isSetField(field);
	}

	public boolean isSetMatchStatus() {
		return isSetField(573);
	}

	public void set(quickfix.field.AllocPrice value) {
		setField(value);
	}

	public quickfix.field.AllocPrice get(quickfix.field.AllocPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AllocPrice getAllocPrice() throws FieldNotFound {
		return get(new quickfix.field.AllocPrice());
	}

	public boolean isSet(quickfix.field.AllocPrice field) {
		return isSetField(field);
	}

	public boolean isSetAllocPrice() {
		return isSetField(366);
	}

	public void set(quickfix.field.AllocQty value) {
		setField(value);
	}

	public quickfix.field.AllocQty get(quickfix.field.AllocQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AllocQty getAllocQty() throws FieldNotFound {
		return get(new quickfix.field.AllocQty());
	}

	public boolean isSet(quickfix.field.AllocQty field) {
		return isSetField(field);
	}

	public boolean isSetAllocQty() {
		return isSetField(80);
	}

	public void set(quickfix.field.IndividualAllocID value) {
		setField(value);
	}

	public quickfix.field.IndividualAllocID get(quickfix.field.IndividualAllocID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.IndividualAllocID getIndividualAllocID() throws FieldNotFound {
		return get(new quickfix.field.IndividualAllocID());
	}

	public boolean isSet(quickfix.field.IndividualAllocID field) {
		return isSetField(field);
	}

	public boolean isSetIndividualAllocID() {
		return isSetField(467);
	}

	public void set(quickfix.field.ProcessCode value) {
		setField(value);
	}

	public quickfix.field.ProcessCode get(quickfix.field.ProcessCode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ProcessCode getProcessCode() throws FieldNotFound {
		return get(new quickfix.field.ProcessCode());
	}

	public boolean isSet(quickfix.field.ProcessCode field) {
		return isSetField(field);
	}

	public boolean isSetProcessCode() {
		return isSetField(81);
	}

	public void set(quickfix.field.SecondaryIndividualAllocID value) {
		setField(value);
	}

	public quickfix.field.SecondaryIndividualAllocID get(quickfix.field.SecondaryIndividualAllocID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecondaryIndividualAllocID getSecondaryIndividualAllocID() throws FieldNotFound {
		return get(new quickfix.field.SecondaryIndividualAllocID());
	}

	public boolean isSet(quickfix.field.SecondaryIndividualAllocID field) {
		return isSetField(field);
	}

	public boolean isSetSecondaryIndividualAllocID() {
		return isSetField(989);
	}

	public void set(quickfix.field.AllocMethod value) {
		setField(value);
	}

	public quickfix.field.AllocMethod get(quickfix.field.AllocMethod value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AllocMethod getAllocMethod() throws FieldNotFound {
		return get(new quickfix.field.AllocMethod());
	}

	public boolean isSet(quickfix.field.AllocMethod field) {
		return isSetField(field);
	}

	public boolean isSetAllocMethod() {
		return isSetField(1002);
	}

	public void set(quickfix.field.AllocCustomerCapacity value) {
		setField(value);
	}

	public quickfix.field.AllocCustomerCapacity get(quickfix.field.AllocCustomerCapacity value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AllocCustomerCapacity getAllocCustomerCapacity() throws FieldNotFound {
		return get(new quickfix.field.AllocCustomerCapacity());
	}

	public boolean isSet(quickfix.field.AllocCustomerCapacity field) {
		return isSetField(field);
	}

	public boolean isSetAllocCustomerCapacity() {
		return isSetField(993);
	}

	public void set(quickfix.field.AllocPositionEffect value) {
		setField(value);
	}

	public quickfix.field.AllocPositionEffect get(quickfix.field.AllocPositionEffect value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AllocPositionEffect getAllocPositionEffect() throws FieldNotFound {
		return get(new quickfix.field.AllocPositionEffect());
	}

	public boolean isSet(quickfix.field.AllocPositionEffect field) {
		return isSetField(field);
	}

	public boolean isSetAllocPositionEffect() {
		return isSetField(1047);
	}

	public void set(quickfix.field.IndividualAllocType value) {
		setField(value);
	}

	public quickfix.field.IndividualAllocType get(quickfix.field.IndividualAllocType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.IndividualAllocType getIndividualAllocType() throws FieldNotFound {
		return get(new quickfix.field.IndividualAllocType());
	}

	public boolean isSet(quickfix.field.IndividualAllocType field) {
		return isSetField(field);
	}

	public boolean isSetIndividualAllocType() {
		return isSetField(992);
	}

	public void set(quickfix.fix50sp2.component.NestedParties component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.NestedParties get(quickfix.fix50sp2.component.NestedParties component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.NestedParties getNestedParties() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.NestedParties());
	}

	public void set(quickfix.field.NoNestedPartyIDs value) {
		setField(value);
	}

	public quickfix.field.NoNestedPartyIDs get(quickfix.field.NoNestedPartyIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoNestedPartyIDs getNoNestedPartyIDs() throws FieldNotFound {
		return get(new quickfix.field.NoNestedPartyIDs());
	}

	public boolean isSet(quickfix.field.NoNestedPartyIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoNestedPartyIDs() {
		return isSetField(539);
	}

	public static class NoNestedPartyIDs extends Group {

		static final long serialVersionUID = 20050617;

		public NoNestedPartyIDs() {
			super(539, 524,
				new int[] {524, 525, 538, 804,  0 });
		}
		
	public void set(quickfix.field.NestedPartyID value) {
		setField(value);
	}

	public quickfix.field.NestedPartyID get(quickfix.field.NestedPartyID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NestedPartyID getNestedPartyID() throws FieldNotFound {
		return get(new quickfix.field.NestedPartyID());
	}

	public boolean isSet(quickfix.field.NestedPartyID field) {
		return isSetField(field);
	}

	public boolean isSetNestedPartyID() {
		return isSetField(524);
	}

	public void set(quickfix.field.NestedPartyIDSource value) {
		setField(value);
	}

	public quickfix.field.NestedPartyIDSource get(quickfix.field.NestedPartyIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NestedPartyIDSource getNestedPartyIDSource() throws FieldNotFound {
		return get(new quickfix.field.NestedPartyIDSource());
	}

	public boolean isSet(quickfix.field.NestedPartyIDSource field) {
		return isSetField(field);
	}

	public boolean isSetNestedPartyIDSource() {
		return isSetField(525);
	}

	public void set(quickfix.field.NestedPartyRole value) {
		setField(value);
	}

	public quickfix.field.NestedPartyRole get(quickfix.field.NestedPartyRole value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NestedPartyRole getNestedPartyRole() throws FieldNotFound {
		return get(new quickfix.field.NestedPartyRole());
	}

	public boolean isSet(quickfix.field.NestedPartyRole field) {
		return isSetField(field);
	}

	public boolean isSetNestedPartyRole() {
		return isSetField(538);
	}

	public void set(quickfix.fix50sp2.component.NstdPtysSubGrp component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.NstdPtysSubGrp get(quickfix.fix50sp2.component.NstdPtysSubGrp component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.NstdPtysSubGrp getNstdPtysSubGrp() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.NstdPtysSubGrp());
	}

	public void set(quickfix.field.NoNestedPartySubIDs value) {
		setField(value);
	}

	public quickfix.field.NoNestedPartySubIDs get(quickfix.field.NoNestedPartySubIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoNestedPartySubIDs getNoNestedPartySubIDs() throws FieldNotFound {
		return get(new quickfix.field.NoNestedPartySubIDs());
	}

	public boolean isSet(quickfix.field.NoNestedPartySubIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoNestedPartySubIDs() {
		return isSetField(804);
	}

	public static class NoNestedPartySubIDs extends Group {

		static final long serialVersionUID = 20050617;

		public NoNestedPartySubIDs() {
			super(804, 545,
				new int[] {545, 805,  0 });
		}
		
	public void set(quickfix.field.NestedPartySubID value) {
		setField(value);
	}

	public quickfix.field.NestedPartySubID get(quickfix.field.NestedPartySubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NestedPartySubID getNestedPartySubID() throws FieldNotFound {
		return get(new quickfix.field.NestedPartySubID());
	}

	public boolean isSet(quickfix.field.NestedPartySubID field) {
		return isSetField(field);
	}

	public boolean isSetNestedPartySubID() {
		return isSetField(545);
	}

	public void set(quickfix.field.NestedPartySubIDType value) {
		setField(value);
	}

	public quickfix.field.NestedPartySubIDType get(quickfix.field.NestedPartySubIDType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NestedPartySubIDType getNestedPartySubIDType() throws FieldNotFound {
		return get(new quickfix.field.NestedPartySubIDType());
	}

	public boolean isSet(quickfix.field.NestedPartySubIDType field) {
		return isSetField(field);
	}

	public boolean isSetNestedPartySubIDType() {
		return isSetField(805);
	}

	}

	}

	public void set(quickfix.field.NotifyBrokerOfCredit value) {
		setField(value);
	}

	public quickfix.field.NotifyBrokerOfCredit get(quickfix.field.NotifyBrokerOfCredit value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NotifyBrokerOfCredit getNotifyBrokerOfCredit() throws FieldNotFound {
		return get(new quickfix.field.NotifyBrokerOfCredit());
	}

	public boolean isSet(quickfix.field.NotifyBrokerOfCredit field) {
		return isSetField(field);
	}

	public boolean isSetNotifyBrokerOfCredit() {
		return isSetField(208);
	}

	public void set(quickfix.field.AllocHandlInst value) {
		setField(value);
	}

	public quickfix.field.AllocHandlInst get(quickfix.field.AllocHandlInst value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AllocHandlInst getAllocHandlInst() throws FieldNotFound {
		return get(new quickfix.field.AllocHandlInst());
	}

	public boolean isSet(quickfix.field.AllocHandlInst field) {
		return isSetField(field);
	}

	public boolean isSetAllocHandlInst() {
		return isSetField(209);
	}

	public void set(quickfix.field.AllocText value) {
		setField(value);
	}

	public quickfix.field.AllocText get(quickfix.field.AllocText value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AllocText getAllocText() throws FieldNotFound {
		return get(new quickfix.field.AllocText());
	}

	public boolean isSet(quickfix.field.AllocText field) {
		return isSetField(field);
	}

	public boolean isSetAllocText() {
		return isSetField(161);
	}

	public void set(quickfix.field.EncodedAllocTextLen value) {
		setField(value);
	}

	public quickfix.field.EncodedAllocTextLen get(quickfix.field.EncodedAllocTextLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EncodedAllocTextLen getEncodedAllocTextLen() throws FieldNotFound {
		return get(new quickfix.field.EncodedAllocTextLen());
	}

	public boolean isSet(quickfix.field.EncodedAllocTextLen field) {
		return isSetField(field);
	}

	public boolean isSetEncodedAllocTextLen() {
		return isSetField(360);
	}

	public void set(quickfix.field.EncodedAllocText value) {
		setField(value);
	}

	public quickfix.field.EncodedAllocText get(quickfix.field.EncodedAllocText value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EncodedAllocText getEncodedAllocText() throws FieldNotFound {
		return get(new quickfix.field.EncodedAllocText());
	}

	public boolean isSet(quickfix.field.EncodedAllocText field) {
		return isSetField(field);
	}

	public boolean isSetEncodedAllocText() {
		return isSetField(361);
	}

	public void set(quickfix.fix50sp2.component.CommissionData component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.CommissionData get(quickfix.fix50sp2.component.CommissionData component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.CommissionData getCommissionData() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.CommissionData());
	}

	public void set(quickfix.field.Commission value) {
		setField(value);
	}

	public quickfix.field.Commission get(quickfix.field.Commission value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Commission getCommission() throws FieldNotFound {
		return get(new quickfix.field.Commission());
	}

	public boolean isSet(quickfix.field.Commission field) {
		return isSetField(field);
	}

	public boolean isSetCommission() {
		return isSetField(12);
	}

	public void set(quickfix.field.CommType value) {
		setField(value);
	}

	public quickfix.field.CommType get(quickfix.field.CommType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CommType getCommType() throws FieldNotFound {
		return get(new quickfix.field.CommType());
	}

	public boolean isSet(quickfix.field.CommType field) {
		return isSetField(field);
	}

	public boolean isSetCommType() {
		return isSetField(13);
	}

	public void set(quickfix.field.CommCurrency value) {
		setField(value);
	}

	public quickfix.field.CommCurrency get(quickfix.field.CommCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CommCurrency getCommCurrency() throws FieldNotFound {
		return get(new quickfix.field.CommCurrency());
	}

	public boolean isSet(quickfix.field.CommCurrency field) {
		return isSetField(field);
	}

	public boolean isSetCommCurrency() {
		return isSetField(479);
	}

	public void set(quickfix.field.FundRenewWaiv value) {
		setField(value);
	}

	public quickfix.field.FundRenewWaiv get(quickfix.field.FundRenewWaiv value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.FundRenewWaiv getFundRenewWaiv() throws FieldNotFound {
		return get(new quickfix.field.FundRenewWaiv());
	}

	public boolean isSet(quickfix.field.FundRenewWaiv field) {
		return isSetField(field);
	}

	public boolean isSetFundRenewWaiv() {
		return isSetField(497);
	}

	public void set(quickfix.field.AllocAvgPx value) {
		setField(value);
	}

	public quickfix.field.AllocAvgPx get(quickfix.field.AllocAvgPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AllocAvgPx getAllocAvgPx() throws FieldNotFound {
		return get(new quickfix.field.AllocAvgPx());
	}

	public boolean isSet(quickfix.field.AllocAvgPx field) {
		return isSetField(field);
	}

	public boolean isSetAllocAvgPx() {
		return isSetField(153);
	}

	public void set(quickfix.field.AllocNetMoney value) {
		setField(value);
	}

	public quickfix.field.AllocNetMoney get(quickfix.field.AllocNetMoney value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AllocNetMoney getAllocNetMoney() throws FieldNotFound {
		return get(new quickfix.field.AllocNetMoney());
	}

	public boolean isSet(quickfix.field.AllocNetMoney field) {
		return isSetField(field);
	}

	public boolean isSetAllocNetMoney() {
		return isSetField(154);
	}

	public void set(quickfix.field.SettlCurrAmt value) {
		setField(value);
	}

	public quickfix.field.SettlCurrAmt get(quickfix.field.SettlCurrAmt value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SettlCurrAmt getSettlCurrAmt() throws FieldNotFound {
		return get(new quickfix.field.SettlCurrAmt());
	}

	public boolean isSet(quickfix.field.SettlCurrAmt field) {
		return isSetField(field);
	}

	public boolean isSetSettlCurrAmt() {
		return isSetField(119);
	}

	public void set(quickfix.field.AllocSettlCurrAmt value) {
		setField(value);
	}

	public quickfix.field.AllocSettlCurrAmt get(quickfix.field.AllocSettlCurrAmt value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AllocSettlCurrAmt getAllocSettlCurrAmt() throws FieldNotFound {
		return get(new quickfix.field.AllocSettlCurrAmt());
	}

	public boolean isSet(quickfix.field.AllocSettlCurrAmt field) {
		return isSetField(field);
	}

	public boolean isSetAllocSettlCurrAmt() {
		return isSetField(737);
	}

	public void set(quickfix.field.SettlCurrency value) {
		setField(value);
	}

	public quickfix.field.SettlCurrency get(quickfix.field.SettlCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SettlCurrency getSettlCurrency() throws FieldNotFound {
		return get(new quickfix.field.SettlCurrency());
	}

	public boolean isSet(quickfix.field.SettlCurrency field) {
		return isSetField(field);
	}

	public boolean isSetSettlCurrency() {
		return isSetField(120);
	}

	public void set(quickfix.field.AllocSettlCurrency value) {
		setField(value);
	}

	public quickfix.field.AllocSettlCurrency get(quickfix.field.AllocSettlCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AllocSettlCurrency getAllocSettlCurrency() throws FieldNotFound {
		return get(new quickfix.field.AllocSettlCurrency());
	}

	public boolean isSet(quickfix.field.AllocSettlCurrency field) {
		return isSetField(field);
	}

	public boolean isSetAllocSettlCurrency() {
		return isSetField(736);
	}

	public void set(quickfix.field.SettlCurrFxRate value) {
		setField(value);
	}

	public quickfix.field.SettlCurrFxRate get(quickfix.field.SettlCurrFxRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SettlCurrFxRate getSettlCurrFxRate() throws FieldNotFound {
		return get(new quickfix.field.SettlCurrFxRate());
	}

	public boolean isSet(quickfix.field.SettlCurrFxRate field) {
		return isSetField(field);
	}

	public boolean isSetSettlCurrFxRate() {
		return isSetField(155);
	}

	public void set(quickfix.field.SettlCurrFxRateCalc value) {
		setField(value);
	}

	public quickfix.field.SettlCurrFxRateCalc get(quickfix.field.SettlCurrFxRateCalc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SettlCurrFxRateCalc getSettlCurrFxRateCalc() throws FieldNotFound {
		return get(new quickfix.field.SettlCurrFxRateCalc());
	}

	public boolean isSet(quickfix.field.SettlCurrFxRateCalc field) {
		return isSetField(field);
	}

	public boolean isSetSettlCurrFxRateCalc() {
		return isSetField(156);
	}

	public void set(quickfix.field.AllocAccruedInterestAmt value) {
		setField(value);
	}

	public quickfix.field.AllocAccruedInterestAmt get(quickfix.field.AllocAccruedInterestAmt value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AllocAccruedInterestAmt getAllocAccruedInterestAmt() throws FieldNotFound {
		return get(new quickfix.field.AllocAccruedInterestAmt());
	}

	public boolean isSet(quickfix.field.AllocAccruedInterestAmt field) {
		return isSetField(field);
	}

	public boolean isSetAllocAccruedInterestAmt() {
		return isSetField(742);
	}

	public void set(quickfix.field.AllocInterestAtMaturity value) {
		setField(value);
	}

	public quickfix.field.AllocInterestAtMaturity get(quickfix.field.AllocInterestAtMaturity value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AllocInterestAtMaturity getAllocInterestAtMaturity() throws FieldNotFound {
		return get(new quickfix.field.AllocInterestAtMaturity());
	}

	public boolean isSet(quickfix.field.AllocInterestAtMaturity field) {
		return isSetField(field);
	}

	public boolean isSetAllocInterestAtMaturity() {
		return isSetField(741);
	}

	public void set(quickfix.fix50sp2.component.MiscFeesGrp component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.MiscFeesGrp get(quickfix.fix50sp2.component.MiscFeesGrp component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.MiscFeesGrp getMiscFeesGrp() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.MiscFeesGrp());
	}

	public void set(quickfix.field.NoMiscFees value) {
		setField(value);
	}

	public quickfix.field.NoMiscFees get(quickfix.field.NoMiscFees value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoMiscFees getNoMiscFees() throws FieldNotFound {
		return get(new quickfix.field.NoMiscFees());
	}

	public boolean isSet(quickfix.field.NoMiscFees field) {
		return isSetField(field);
	}

	public boolean isSetNoMiscFees() {
		return isSetField(136);
	}

	public static class NoMiscFees extends Group {

		static final long serialVersionUID = 20050617;

		public NoMiscFees() {
			super(136, 137,
				new int[] {137, 138, 139, 891,  0 });
		}
		
	public void set(quickfix.field.MiscFeeAmt value) {
		setField(value);
	}

	public quickfix.field.MiscFeeAmt get(quickfix.field.MiscFeeAmt value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MiscFeeAmt getMiscFeeAmt() throws FieldNotFound {
		return get(new quickfix.field.MiscFeeAmt());
	}

	public boolean isSet(quickfix.field.MiscFeeAmt field) {
		return isSetField(field);
	}

	public boolean isSetMiscFeeAmt() {
		return isSetField(137);
	}

	public void set(quickfix.field.MiscFeeCurr value) {
		setField(value);
	}

	public quickfix.field.MiscFeeCurr get(quickfix.field.MiscFeeCurr value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MiscFeeCurr getMiscFeeCurr() throws FieldNotFound {
		return get(new quickfix.field.MiscFeeCurr());
	}

	public boolean isSet(quickfix.field.MiscFeeCurr field) {
		return isSetField(field);
	}

	public boolean isSetMiscFeeCurr() {
		return isSetField(138);
	}

	public void set(quickfix.field.MiscFeeType value) {
		setField(value);
	}

	public quickfix.field.MiscFeeType get(quickfix.field.MiscFeeType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MiscFeeType getMiscFeeType() throws FieldNotFound {
		return get(new quickfix.field.MiscFeeType());
	}

	public boolean isSet(quickfix.field.MiscFeeType field) {
		return isSetField(field);
	}

	public boolean isSetMiscFeeType() {
		return isSetField(139);
	}

	public void set(quickfix.field.MiscFeeBasis value) {
		setField(value);
	}

	public quickfix.field.MiscFeeBasis get(quickfix.field.MiscFeeBasis value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MiscFeeBasis getMiscFeeBasis() throws FieldNotFound {
		return get(new quickfix.field.MiscFeeBasis());
	}

	public boolean isSet(quickfix.field.MiscFeeBasis field) {
		return isSetField(field);
	}

	public boolean isSetMiscFeeBasis() {
		return isSetField(891);
	}

	}

	public void set(quickfix.fix50sp2.component.ClrInstGrp component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.ClrInstGrp get(quickfix.fix50sp2.component.ClrInstGrp component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.ClrInstGrp getClrInstGrp() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.ClrInstGrp());
	}

	public void set(quickfix.field.NoClearingInstructions value) {
		setField(value);
	}

	public quickfix.field.NoClearingInstructions get(quickfix.field.NoClearingInstructions value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoClearingInstructions getNoClearingInstructions() throws FieldNotFound {
		return get(new quickfix.field.NoClearingInstructions());
	}

	public boolean isSet(quickfix.field.NoClearingInstructions field) {
		return isSetField(field);
	}

	public boolean isSetNoClearingInstructions() {
		return isSetField(576);
	}

	public static class NoClearingInstructions extends Group {

		static final long serialVersionUID = 20050617;

		public NoClearingInstructions() {
			super(576, 577,
				new int[] {577,  0 });
		}
		
	public void set(quickfix.field.ClearingInstruction value) {
		setField(value);
	}

	public quickfix.field.ClearingInstruction get(quickfix.field.ClearingInstruction value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ClearingInstruction getClearingInstruction() throws FieldNotFound {
		return get(new quickfix.field.ClearingInstruction());
	}

	public boolean isSet(quickfix.field.ClearingInstruction field) {
		return isSetField(field);
	}

	public boolean isSetClearingInstruction() {
		return isSetField(577);
	}

	}

	public void set(quickfix.field.ClearingFeeIndicator value) {
		setField(value);
	}

	public quickfix.field.ClearingFeeIndicator get(quickfix.field.ClearingFeeIndicator value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ClearingFeeIndicator getClearingFeeIndicator() throws FieldNotFound {
		return get(new quickfix.field.ClearingFeeIndicator());
	}

	public boolean isSet(quickfix.field.ClearingFeeIndicator field) {
		return isSetField(field);
	}

	public boolean isSetClearingFeeIndicator() {
		return isSetField(635);
	}

	public void set(quickfix.field.AllocSettlInstType value) {
		setField(value);
	}

	public quickfix.field.AllocSettlInstType get(quickfix.field.AllocSettlInstType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AllocSettlInstType getAllocSettlInstType() throws FieldNotFound {
		return get(new quickfix.field.AllocSettlInstType());
	}

	public boolean isSet(quickfix.field.AllocSettlInstType field) {
		return isSetField(field);
	}

	public boolean isSetAllocSettlInstType() {
		return isSetField(780);
	}

	public void set(quickfix.fix50sp2.component.SettlInstructionsData component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.SettlInstructionsData get(quickfix.fix50sp2.component.SettlInstructionsData component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.SettlInstructionsData getSettlInstructionsData() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.SettlInstructionsData());
	}

	public void set(quickfix.field.SettlDeliveryType value) {
		setField(value);
	}

	public quickfix.field.SettlDeliveryType get(quickfix.field.SettlDeliveryType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SettlDeliveryType getSettlDeliveryType() throws FieldNotFound {
		return get(new quickfix.field.SettlDeliveryType());
	}

	public boolean isSet(quickfix.field.SettlDeliveryType field) {
		return isSetField(field);
	}

	public boolean isSetSettlDeliveryType() {
		return isSetField(172);
	}

	public void set(quickfix.field.StandInstDbType value) {
		setField(value);
	}

	public quickfix.field.StandInstDbType get(quickfix.field.StandInstDbType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.StandInstDbType getStandInstDbType() throws FieldNotFound {
		return get(new quickfix.field.StandInstDbType());
	}

	public boolean isSet(quickfix.field.StandInstDbType field) {
		return isSetField(field);
	}

	public boolean isSetStandInstDbType() {
		return isSetField(169);
	}

	public void set(quickfix.field.StandInstDbName value) {
		setField(value);
	}

	public quickfix.field.StandInstDbName get(quickfix.field.StandInstDbName value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.StandInstDbName getStandInstDbName() throws FieldNotFound {
		return get(new quickfix.field.StandInstDbName());
	}

	public boolean isSet(quickfix.field.StandInstDbName field) {
		return isSetField(field);
	}

	public boolean isSetStandInstDbName() {
		return isSetField(170);
	}

	public void set(quickfix.field.StandInstDbID value) {
		setField(value);
	}

	public quickfix.field.StandInstDbID get(quickfix.field.StandInstDbID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.StandInstDbID getStandInstDbID() throws FieldNotFound {
		return get(new quickfix.field.StandInstDbID());
	}

	public boolean isSet(quickfix.field.StandInstDbID field) {
		return isSetField(field);
	}

	public boolean isSetStandInstDbID() {
		return isSetField(171);
	}

	public void set(quickfix.fix50sp2.component.DlvyInstGrp component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.DlvyInstGrp get(quickfix.fix50sp2.component.DlvyInstGrp component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.DlvyInstGrp getDlvyInstGrp() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.DlvyInstGrp());
	}

	public void set(quickfix.field.NoDlvyInst value) {
		setField(value);
	}

	public quickfix.field.NoDlvyInst get(quickfix.field.NoDlvyInst value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoDlvyInst getNoDlvyInst() throws FieldNotFound {
		return get(new quickfix.field.NoDlvyInst());
	}

	public boolean isSet(quickfix.field.NoDlvyInst field) {
		return isSetField(field);
	}

	public boolean isSetNoDlvyInst() {
		return isSetField(85);
	}

	public static class NoDlvyInst extends Group {

		static final long serialVersionUID = 20050617;

		public NoDlvyInst() {
			super(85, 165,
				new int[] {165, 787, 781,  0 });
		}
		
	public void set(quickfix.field.SettlInstSource value) {
		setField(value);
	}

	public quickfix.field.SettlInstSource get(quickfix.field.SettlInstSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SettlInstSource getSettlInstSource() throws FieldNotFound {
		return get(new quickfix.field.SettlInstSource());
	}

	public boolean isSet(quickfix.field.SettlInstSource field) {
		return isSetField(field);
	}

	public boolean isSetSettlInstSource() {
		return isSetField(165);
	}

	public void set(quickfix.field.DlvyInstType value) {
		setField(value);
	}

	public quickfix.field.DlvyInstType get(quickfix.field.DlvyInstType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DlvyInstType getDlvyInstType() throws FieldNotFound {
		return get(new quickfix.field.DlvyInstType());
	}

	public boolean isSet(quickfix.field.DlvyInstType field) {
		return isSetField(field);
	}

	public boolean isSetDlvyInstType() {
		return isSetField(787);
	}

	public void set(quickfix.fix50sp2.component.SettlParties component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.SettlParties get(quickfix.fix50sp2.component.SettlParties component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.SettlParties getSettlParties() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.SettlParties());
	}

	public void set(quickfix.field.NoSettlPartyIDs value) {
		setField(value);
	}

	public quickfix.field.NoSettlPartyIDs get(quickfix.field.NoSettlPartyIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoSettlPartyIDs getNoSettlPartyIDs() throws FieldNotFound {
		return get(new quickfix.field.NoSettlPartyIDs());
	}

	public boolean isSet(quickfix.field.NoSettlPartyIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoSettlPartyIDs() {
		return isSetField(781);
	}

	public static class NoSettlPartyIDs extends Group {

		static final long serialVersionUID = 20050617;

		public NoSettlPartyIDs() {
			super(781, 782,
				new int[] {782, 783, 784, 801,  0 });
		}
		
	public void set(quickfix.field.SettlPartyID value) {
		setField(value);
	}

	public quickfix.field.SettlPartyID get(quickfix.field.SettlPartyID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SettlPartyID getSettlPartyID() throws FieldNotFound {
		return get(new quickfix.field.SettlPartyID());
	}

	public boolean isSet(quickfix.field.SettlPartyID field) {
		return isSetField(field);
	}

	public boolean isSetSettlPartyID() {
		return isSetField(782);
	}

	public void set(quickfix.field.SettlPartyIDSource value) {
		setField(value);
	}

	public quickfix.field.SettlPartyIDSource get(quickfix.field.SettlPartyIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SettlPartyIDSource getSettlPartyIDSource() throws FieldNotFound {
		return get(new quickfix.field.SettlPartyIDSource());
	}

	public boolean isSet(quickfix.field.SettlPartyIDSource field) {
		return isSetField(field);
	}

	public boolean isSetSettlPartyIDSource() {
		return isSetField(783);
	}

	public void set(quickfix.field.SettlPartyRole value) {
		setField(value);
	}

	public quickfix.field.SettlPartyRole get(quickfix.field.SettlPartyRole value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SettlPartyRole getSettlPartyRole() throws FieldNotFound {
		return get(new quickfix.field.SettlPartyRole());
	}

	public boolean isSet(quickfix.field.SettlPartyRole field) {
		return isSetField(field);
	}

	public boolean isSetSettlPartyRole() {
		return isSetField(784);
	}

	public void set(quickfix.fix50sp2.component.SettlPtysSubGrp component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.SettlPtysSubGrp get(quickfix.fix50sp2.component.SettlPtysSubGrp component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.SettlPtysSubGrp getSettlPtysSubGrp() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.SettlPtysSubGrp());
	}

	public void set(quickfix.field.NoSettlPartySubIDs value) {
		setField(value);
	}

	public quickfix.field.NoSettlPartySubIDs get(quickfix.field.NoSettlPartySubIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoSettlPartySubIDs getNoSettlPartySubIDs() throws FieldNotFound {
		return get(new quickfix.field.NoSettlPartySubIDs());
	}

	public boolean isSet(quickfix.field.NoSettlPartySubIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoSettlPartySubIDs() {
		return isSetField(801);
	}

	public static class NoSettlPartySubIDs extends Group {

		static final long serialVersionUID = 20050617;

		public NoSettlPartySubIDs() {
			super(801, 785,
				new int[] {785, 786,  0 });
		}
		
	public void set(quickfix.field.SettlPartySubID value) {
		setField(value);
	}

	public quickfix.field.SettlPartySubID get(quickfix.field.SettlPartySubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SettlPartySubID getSettlPartySubID() throws FieldNotFound {
		return get(new quickfix.field.SettlPartySubID());
	}

	public boolean isSet(quickfix.field.SettlPartySubID field) {
		return isSetField(field);
	}

	public boolean isSetSettlPartySubID() {
		return isSetField(785);
	}

	public void set(quickfix.field.SettlPartySubIDType value) {
		setField(value);
	}

	public quickfix.field.SettlPartySubIDType get(quickfix.field.SettlPartySubIDType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SettlPartySubIDType getSettlPartySubIDType() throws FieldNotFound {
		return get(new quickfix.field.SettlPartySubIDType());
	}

	public boolean isSet(quickfix.field.SettlPartySubIDType field) {
		return isSetField(field);
	}

	public boolean isSetSettlPartySubIDType() {
		return isSetField(786);
	}

	}

	}

	}

	}

}
