
package quickfix.fix50sp1.component;

import quickfix.FieldNotFound;

import quickfix.Group;

public class TrdInstrmtLegGrp extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = {  };
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = { 555,  };
	protected int[] getGroupFields() { return componentGroups; }
	

	public TrdInstrmtLegGrp() {
		super();
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
				new int[] {600, 601, 602, 603, 604, 607, 608, 609, 764, 610, 611, 1212, 248, 249, 250, 251, 252, 253, 257, 599, 596, 597, 598, 254, 612, 942, 613, 614, 999, 1224, 1421, 1422, 1001, 1420, 615, 616, 617, 618, 619, 620, 621, 622, 623, 624, 556, 740, 739, 955, 956, 1358, 1017, 566, 687, 690, 990, 1152, 683, 564, 565, 539, 654, 587, 588, 637, 675, 1073, 1074, 1075, 1379, 1381, 1383, 1384, 1418, 1342,  0 });
		}
		
	public void set(quickfix.fix50sp1.component.InstrumentLeg component) {
		setComponent(component);
	}

	public quickfix.fix50sp1.component.InstrumentLeg get(quickfix.fix50sp1.component.InstrumentLeg component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp1.component.InstrumentLeg getInstrumentLeg() throws FieldNotFound {
		return get(new quickfix.fix50sp1.component.InstrumentLeg());
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

	public void set(quickfix.fix50sp1.component.LegSecAltIDGrp component) {
		setComponent(component);
	}

	public quickfix.fix50sp1.component.LegSecAltIDGrp get(quickfix.fix50sp1.component.LegSecAltIDGrp component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp1.component.LegSecAltIDGrp getLegSecAltIDGrp() throws FieldNotFound {
		return get(new quickfix.fix50sp1.component.LegSecAltIDGrp());
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

	public void set(quickfix.field.LegQty value) {
		setField(value);
	}

	public quickfix.field.LegQty get(quickfix.field.LegQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegQty getLegQty() throws FieldNotFound {
		return get(new quickfix.field.LegQty());
	}

	public boolean isSet(quickfix.field.LegQty field) {
		return isSetField(field);
	}

	public boolean isSetLegQty() {
		return isSetField(687);
	}

	public void set(quickfix.field.LegSwapType value) {
		setField(value);
	}

	public quickfix.field.LegSwapType get(quickfix.field.LegSwapType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegSwapType getLegSwapType() throws FieldNotFound {
		return get(new quickfix.field.LegSwapType());
	}

	public boolean isSet(quickfix.field.LegSwapType field) {
		return isSetField(field);
	}

	public boolean isSetLegSwapType() {
		return isSetField(690);
	}

	public void set(quickfix.field.LegReportID value) {
		setField(value);
	}

	public quickfix.field.LegReportID get(quickfix.field.LegReportID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegReportID getLegReportID() throws FieldNotFound {
		return get(new quickfix.field.LegReportID());
	}

	public boolean isSet(quickfix.field.LegReportID field) {
		return isSetField(field);
	}

	public boolean isSetLegReportID() {
		return isSetField(990);
	}

	public void set(quickfix.field.LegNumber value) {
		setField(value);
	}

	public quickfix.field.LegNumber get(quickfix.field.LegNumber value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegNumber getLegNumber() throws FieldNotFound {
		return get(new quickfix.field.LegNumber());
	}

	public boolean isSet(quickfix.field.LegNumber field) {
		return isSetField(field);
	}

	public boolean isSetLegNumber() {
		return isSetField(1152);
	}

	public void set(quickfix.fix50sp1.component.LegStipulations component) {
		setComponent(component);
	}

	public quickfix.fix50sp1.component.LegStipulations get(quickfix.fix50sp1.component.LegStipulations component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp1.component.LegStipulations getLegStipulations() throws FieldNotFound {
		return get(new quickfix.fix50sp1.component.LegStipulations());
	}

	public void set(quickfix.field.NoLegStipulations value) {
		setField(value);
	}

	public quickfix.field.NoLegStipulations get(quickfix.field.NoLegStipulations value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoLegStipulations getNoLegStipulations() throws FieldNotFound {
		return get(new quickfix.field.NoLegStipulations());
	}

	public boolean isSet(quickfix.field.NoLegStipulations field) {
		return isSetField(field);
	}

	public boolean isSetNoLegStipulations() {
		return isSetField(683);
	}

	public static class NoLegStipulations extends Group {

		static final long serialVersionUID = 20050617;

		public NoLegStipulations() {
			super(683, 688,
				new int[] {688, 689,  0 });
		}
		
	public void set(quickfix.field.LegStipulationType value) {
		setField(value);
	}

	public quickfix.field.LegStipulationType get(quickfix.field.LegStipulationType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegStipulationType getLegStipulationType() throws FieldNotFound {
		return get(new quickfix.field.LegStipulationType());
	}

	public boolean isSet(quickfix.field.LegStipulationType field) {
		return isSetField(field);
	}

	public boolean isSetLegStipulationType() {
		return isSetField(688);
	}

	public void set(quickfix.field.LegStipulationValue value) {
		setField(value);
	}

	public quickfix.field.LegStipulationValue get(quickfix.field.LegStipulationValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegStipulationValue getLegStipulationValue() throws FieldNotFound {
		return get(new quickfix.field.LegStipulationValue());
	}

	public boolean isSet(quickfix.field.LegStipulationValue field) {
		return isSetField(field);
	}

	public boolean isSetLegStipulationValue() {
		return isSetField(689);
	}

	}

	public void set(quickfix.field.LegPositionEffect value) {
		setField(value);
	}

	public quickfix.field.LegPositionEffect get(quickfix.field.LegPositionEffect value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegPositionEffect getLegPositionEffect() throws FieldNotFound {
		return get(new quickfix.field.LegPositionEffect());
	}

	public boolean isSet(quickfix.field.LegPositionEffect field) {
		return isSetField(field);
	}

	public boolean isSetLegPositionEffect() {
		return isSetField(564);
	}

	public void set(quickfix.field.LegCoveredOrUncovered value) {
		setField(value);
	}

	public quickfix.field.LegCoveredOrUncovered get(quickfix.field.LegCoveredOrUncovered value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegCoveredOrUncovered getLegCoveredOrUncovered() throws FieldNotFound {
		return get(new quickfix.field.LegCoveredOrUncovered());
	}

	public boolean isSet(quickfix.field.LegCoveredOrUncovered field) {
		return isSetField(field);
	}

	public boolean isSetLegCoveredOrUncovered() {
		return isSetField(565);
	}

	public void set(quickfix.fix50sp1.component.NestedParties component) {
		setComponent(component);
	}

	public quickfix.fix50sp1.component.NestedParties get(quickfix.fix50sp1.component.NestedParties component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp1.component.NestedParties getNestedParties() throws FieldNotFound {
		return get(new quickfix.fix50sp1.component.NestedParties());
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

	public void set(quickfix.fix50sp1.component.NstdPtysSubGrp component) {
		setComponent(component);
	}

	public quickfix.fix50sp1.component.NstdPtysSubGrp get(quickfix.fix50sp1.component.NstdPtysSubGrp component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp1.component.NstdPtysSubGrp getNstdPtysSubGrp() throws FieldNotFound {
		return get(new quickfix.fix50sp1.component.NstdPtysSubGrp());
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

	public void set(quickfix.field.LegRefID value) {
		setField(value);
	}

	public quickfix.field.LegRefID get(quickfix.field.LegRefID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegRefID getLegRefID() throws FieldNotFound {
		return get(new quickfix.field.LegRefID());
	}

	public boolean isSet(quickfix.field.LegRefID field) {
		return isSetField(field);
	}

	public boolean isSetLegRefID() {
		return isSetField(654);
	}

	public void set(quickfix.field.LegSettlType value) {
		setField(value);
	}

	public quickfix.field.LegSettlType get(quickfix.field.LegSettlType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegSettlType getLegSettlType() throws FieldNotFound {
		return get(new quickfix.field.LegSettlType());
	}

	public boolean isSet(quickfix.field.LegSettlType field) {
		return isSetField(field);
	}

	public boolean isSetLegSettlType() {
		return isSetField(587);
	}

	public void set(quickfix.field.LegSettlDate value) {
		setField(value);
	}

	public quickfix.field.LegSettlDate get(quickfix.field.LegSettlDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegSettlDate getLegSettlDate() throws FieldNotFound {
		return get(new quickfix.field.LegSettlDate());
	}

	public boolean isSet(quickfix.field.LegSettlDate field) {
		return isSetField(field);
	}

	public boolean isSetLegSettlDate() {
		return isSetField(588);
	}

	public void set(quickfix.field.LegLastPx value) {
		setField(value);
	}

	public quickfix.field.LegLastPx get(quickfix.field.LegLastPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegLastPx getLegLastPx() throws FieldNotFound {
		return get(new quickfix.field.LegLastPx());
	}

	public boolean isSet(quickfix.field.LegLastPx field) {
		return isSetField(field);
	}

	public boolean isSetLegLastPx() {
		return isSetField(637);
	}

	public void set(quickfix.field.LegSettlCurrency value) {
		setField(value);
	}

	public quickfix.field.LegSettlCurrency get(quickfix.field.LegSettlCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegSettlCurrency getLegSettlCurrency() throws FieldNotFound {
		return get(new quickfix.field.LegSettlCurrency());
	}

	public boolean isSet(quickfix.field.LegSettlCurrency field) {
		return isSetField(field);
	}

	public boolean isSetLegSettlCurrency() {
		return isSetField(675);
	}

	public void set(quickfix.field.LegLastForwardPoints value) {
		setField(value);
	}

	public quickfix.field.LegLastForwardPoints get(quickfix.field.LegLastForwardPoints value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegLastForwardPoints getLegLastForwardPoints() throws FieldNotFound {
		return get(new quickfix.field.LegLastForwardPoints());
	}

	public boolean isSet(quickfix.field.LegLastForwardPoints field) {
		return isSetField(field);
	}

	public boolean isSetLegLastForwardPoints() {
		return isSetField(1073);
	}

	public void set(quickfix.field.LegCalculatedCcyLastQty value) {
		setField(value);
	}

	public quickfix.field.LegCalculatedCcyLastQty get(quickfix.field.LegCalculatedCcyLastQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegCalculatedCcyLastQty getLegCalculatedCcyLastQty() throws FieldNotFound {
		return get(new quickfix.field.LegCalculatedCcyLastQty());
	}

	public boolean isSet(quickfix.field.LegCalculatedCcyLastQty field) {
		return isSetField(field);
	}

	public boolean isSetLegCalculatedCcyLastQty() {
		return isSetField(1074);
	}

	public void set(quickfix.field.LegGrossTradeAmt value) {
		setField(value);
	}

	public quickfix.field.LegGrossTradeAmt get(quickfix.field.LegGrossTradeAmt value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegGrossTradeAmt getLegGrossTradeAmt() throws FieldNotFound {
		return get(new quickfix.field.LegGrossTradeAmt());
	}

	public boolean isSet(quickfix.field.LegGrossTradeAmt field) {
		return isSetField(field);
	}

	public boolean isSetLegGrossTradeAmt() {
		return isSetField(1075);
	}

	public void set(quickfix.field.LegVolatility value) {
		setField(value);
	}

	public quickfix.field.LegVolatility get(quickfix.field.LegVolatility value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegVolatility getLegVolatility() throws FieldNotFound {
		return get(new quickfix.field.LegVolatility());
	}

	public boolean isSet(quickfix.field.LegVolatility field) {
		return isSetField(field);
	}

	public boolean isSetLegVolatility() {
		return isSetField(1379);
	}

	public void set(quickfix.field.LegDividendYield value) {
		setField(value);
	}

	public quickfix.field.LegDividendYield get(quickfix.field.LegDividendYield value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegDividendYield getLegDividendYield() throws FieldNotFound {
		return get(new quickfix.field.LegDividendYield());
	}

	public boolean isSet(quickfix.field.LegDividendYield field) {
		return isSetField(field);
	}

	public boolean isSetLegDividendYield() {
		return isSetField(1381);
	}

	public void set(quickfix.field.LegCurrencyRatio value) {
		setField(value);
	}

	public quickfix.field.LegCurrencyRatio get(quickfix.field.LegCurrencyRatio value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegCurrencyRatio getLegCurrencyRatio() throws FieldNotFound {
		return get(new quickfix.field.LegCurrencyRatio());
	}

	public boolean isSet(quickfix.field.LegCurrencyRatio field) {
		return isSetField(field);
	}

	public boolean isSetLegCurrencyRatio() {
		return isSetField(1383);
	}

	public void set(quickfix.field.LegExecInst value) {
		setField(value);
	}

	public quickfix.field.LegExecInst get(quickfix.field.LegExecInst value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegExecInst getLegExecInst() throws FieldNotFound {
		return get(new quickfix.field.LegExecInst());
	}

	public boolean isSet(quickfix.field.LegExecInst field) {
		return isSetField(field);
	}

	public boolean isSetLegExecInst() {
		return isSetField(1384);
	}

	public void set(quickfix.field.LegLastQty value) {
		setField(value);
	}

	public quickfix.field.LegLastQty get(quickfix.field.LegLastQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegLastQty getLegLastQty() throws FieldNotFound {
		return get(new quickfix.field.LegLastQty());
	}

	public boolean isSet(quickfix.field.LegLastQty field) {
		return isSetField(field);
	}

	public boolean isSetLegLastQty() {
		return isSetField(1418);
	}

	public void set(quickfix.fix50sp1.component.TradeCapLegUnderlyingsGrp component) {
		setComponent(component);
	}

	public quickfix.fix50sp1.component.TradeCapLegUnderlyingsGrp get(quickfix.fix50sp1.component.TradeCapLegUnderlyingsGrp component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp1.component.TradeCapLegUnderlyingsGrp getTradeCapLegUnderlyingsGrp() throws FieldNotFound {
		return get(new quickfix.fix50sp1.component.TradeCapLegUnderlyingsGrp());
	}

	public void set(quickfix.field.NoOfLegUnderlyings value) {
		setField(value);
	}

	public quickfix.field.NoOfLegUnderlyings get(quickfix.field.NoOfLegUnderlyings value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoOfLegUnderlyings getNoOfLegUnderlyings() throws FieldNotFound {
		return get(new quickfix.field.NoOfLegUnderlyings());
	}

	public boolean isSet(quickfix.field.NoOfLegUnderlyings field) {
		return isSetField(field);
	}

	public boolean isSetNoOfLegUnderlyings() {
		return isSetField(1342);
	}

	public static class NoOfLegUnderlyings extends Group {

		static final long serialVersionUID = 20050617;

		public NoOfLegUnderlyings() {
			super(1342, 1330,
				new int[] {1330, 1331, 1332, 1333, 1334, 1344, 1337, 1338, 1339, 1345, 1405, 1340, 1391, 1343, 1341, 1392,  0 });
		}
		
	public void set(quickfix.fix50sp1.component.UnderlyingLegInstrument component) {
		setComponent(component);
	}

	public quickfix.fix50sp1.component.UnderlyingLegInstrument get(quickfix.fix50sp1.component.UnderlyingLegInstrument component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp1.component.UnderlyingLegInstrument getUnderlyingLegInstrument() throws FieldNotFound {
		return get(new quickfix.fix50sp1.component.UnderlyingLegInstrument());
	}

	public void set(quickfix.field.UnderlyingLegSymbol value) {
		setField(value);
	}

	public quickfix.field.UnderlyingLegSymbol get(quickfix.field.UnderlyingLegSymbol value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingLegSymbol getUnderlyingLegSymbol() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingLegSymbol());
	}

	public boolean isSet(quickfix.field.UnderlyingLegSymbol field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingLegSymbol() {
		return isSetField(1330);
	}

	public void set(quickfix.field.UnderlyingLegSymbolSfx value) {
		setField(value);
	}

	public quickfix.field.UnderlyingLegSymbolSfx get(quickfix.field.UnderlyingLegSymbolSfx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingLegSymbolSfx getUnderlyingLegSymbolSfx() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingLegSymbolSfx());
	}

	public boolean isSet(quickfix.field.UnderlyingLegSymbolSfx field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingLegSymbolSfx() {
		return isSetField(1331);
	}

	public void set(quickfix.field.UnderlyingLegSecurityID value) {
		setField(value);
	}

	public quickfix.field.UnderlyingLegSecurityID get(quickfix.field.UnderlyingLegSecurityID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingLegSecurityID getUnderlyingLegSecurityID() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingLegSecurityID());
	}

	public boolean isSet(quickfix.field.UnderlyingLegSecurityID field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingLegSecurityID() {
		return isSetField(1332);
	}

	public void set(quickfix.field.UnderlyingLegSecurityIDSource value) {
		setField(value);
	}

	public quickfix.field.UnderlyingLegSecurityIDSource get(quickfix.field.UnderlyingLegSecurityIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingLegSecurityIDSource getUnderlyingLegSecurityIDSource() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingLegSecurityIDSource());
	}

	public boolean isSet(quickfix.field.UnderlyingLegSecurityIDSource field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingLegSecurityIDSource() {
		return isSetField(1333);
	}

	public void set(quickfix.fix50sp1.component.UnderlyingLegSecurityAltIDGrp component) {
		setComponent(component);
	}

	public quickfix.fix50sp1.component.UnderlyingLegSecurityAltIDGrp get(quickfix.fix50sp1.component.UnderlyingLegSecurityAltIDGrp component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp1.component.UnderlyingLegSecurityAltIDGrp getUnderlyingLegSecurityAltIDGrp() throws FieldNotFound {
		return get(new quickfix.fix50sp1.component.UnderlyingLegSecurityAltIDGrp());
	}

	public void set(quickfix.field.NoUnderlyingLegSecurityAltID value) {
		setField(value);
	}

	public quickfix.field.NoUnderlyingLegSecurityAltID get(quickfix.field.NoUnderlyingLegSecurityAltID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoUnderlyingLegSecurityAltID getNoUnderlyingLegSecurityAltID() throws FieldNotFound {
		return get(new quickfix.field.NoUnderlyingLegSecurityAltID());
	}

	public boolean isSet(quickfix.field.NoUnderlyingLegSecurityAltID field) {
		return isSetField(field);
	}

	public boolean isSetNoUnderlyingLegSecurityAltID() {
		return isSetField(1334);
	}

	public static class NoUnderlyingLegSecurityAltID extends Group {

		static final long serialVersionUID = 20050617;

		public NoUnderlyingLegSecurityAltID() {
			super(1334, 1335,
				new int[] {1335, 1336,  0 });
		}
		
	public void set(quickfix.field.UnderlyingLegSecurityAltID value) {
		setField(value);
	}

	public quickfix.field.UnderlyingLegSecurityAltID get(quickfix.field.UnderlyingLegSecurityAltID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingLegSecurityAltID getUnderlyingLegSecurityAltID() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingLegSecurityAltID());
	}

	public boolean isSet(quickfix.field.UnderlyingLegSecurityAltID field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingLegSecurityAltID() {
		return isSetField(1335);
	}

	public void set(quickfix.field.UnderlyingLegSecurityAltIDSource value) {
		setField(value);
	}

	public quickfix.field.UnderlyingLegSecurityAltIDSource get(quickfix.field.UnderlyingLegSecurityAltIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingLegSecurityAltIDSource getUnderlyingLegSecurityAltIDSource() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingLegSecurityAltIDSource());
	}

	public boolean isSet(quickfix.field.UnderlyingLegSecurityAltIDSource field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingLegSecurityAltIDSource() {
		return isSetField(1336);
	}

	}

	public void set(quickfix.field.UnderlyingLegCFICode value) {
		setField(value);
	}

	public quickfix.field.UnderlyingLegCFICode get(quickfix.field.UnderlyingLegCFICode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingLegCFICode getUnderlyingLegCFICode() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingLegCFICode());
	}

	public boolean isSet(quickfix.field.UnderlyingLegCFICode field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingLegCFICode() {
		return isSetField(1344);
	}

	public void set(quickfix.field.UnderlyingLegSecurityType value) {
		setField(value);
	}

	public quickfix.field.UnderlyingLegSecurityType get(quickfix.field.UnderlyingLegSecurityType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingLegSecurityType getUnderlyingLegSecurityType() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingLegSecurityType());
	}

	public boolean isSet(quickfix.field.UnderlyingLegSecurityType field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingLegSecurityType() {
		return isSetField(1337);
	}

	public void set(quickfix.field.UnderlyingLegSecuritySubType value) {
		setField(value);
	}

	public quickfix.field.UnderlyingLegSecuritySubType get(quickfix.field.UnderlyingLegSecuritySubType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingLegSecuritySubType getUnderlyingLegSecuritySubType() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingLegSecuritySubType());
	}

	public boolean isSet(quickfix.field.UnderlyingLegSecuritySubType field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingLegSecuritySubType() {
		return isSetField(1338);
	}

	public void set(quickfix.field.UnderlyingLegMaturityMonthYear value) {
		setField(value);
	}

	public quickfix.field.UnderlyingLegMaturityMonthYear get(quickfix.field.UnderlyingLegMaturityMonthYear value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingLegMaturityMonthYear getUnderlyingLegMaturityMonthYear() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingLegMaturityMonthYear());
	}

	public boolean isSet(quickfix.field.UnderlyingLegMaturityMonthYear field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingLegMaturityMonthYear() {
		return isSetField(1339);
	}

	public void set(quickfix.field.UnderlyingLegMaturityDate value) {
		setField(value);
	}

	public quickfix.field.UnderlyingLegMaturityDate get(quickfix.field.UnderlyingLegMaturityDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingLegMaturityDate getUnderlyingLegMaturityDate() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingLegMaturityDate());
	}

	public boolean isSet(quickfix.field.UnderlyingLegMaturityDate field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingLegMaturityDate() {
		return isSetField(1345);
	}

	public void set(quickfix.field.UnderlyingLegMaturityTime value) {
		setField(value);
	}

	public quickfix.field.UnderlyingLegMaturityTime get(quickfix.field.UnderlyingLegMaturityTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingLegMaturityTime getUnderlyingLegMaturityTime() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingLegMaturityTime());
	}

	public boolean isSet(quickfix.field.UnderlyingLegMaturityTime field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingLegMaturityTime() {
		return isSetField(1405);
	}

	public void set(quickfix.field.UnderlyingLegStrikePrice value) {
		setField(value);
	}

	public quickfix.field.UnderlyingLegStrikePrice get(quickfix.field.UnderlyingLegStrikePrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingLegStrikePrice getUnderlyingLegStrikePrice() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingLegStrikePrice());
	}

	public boolean isSet(quickfix.field.UnderlyingLegStrikePrice field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingLegStrikePrice() {
		return isSetField(1340);
	}

	public void set(quickfix.field.UnderlyingLegOptAttribute value) {
		setField(value);
	}

	public quickfix.field.UnderlyingLegOptAttribute get(quickfix.field.UnderlyingLegOptAttribute value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingLegOptAttribute getUnderlyingLegOptAttribute() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingLegOptAttribute());
	}

	public boolean isSet(quickfix.field.UnderlyingLegOptAttribute field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingLegOptAttribute() {
		return isSetField(1391);
	}

	public void set(quickfix.field.UnderlyingLegPutOrCall value) {
		setField(value);
	}

	public quickfix.field.UnderlyingLegPutOrCall get(quickfix.field.UnderlyingLegPutOrCall value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingLegPutOrCall getUnderlyingLegPutOrCall() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingLegPutOrCall());
	}

	public boolean isSet(quickfix.field.UnderlyingLegPutOrCall field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingLegPutOrCall() {
		return isSetField(1343);
	}

	public void set(quickfix.field.UnderlyingLegSecurityExchange value) {
		setField(value);
	}

	public quickfix.field.UnderlyingLegSecurityExchange get(quickfix.field.UnderlyingLegSecurityExchange value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingLegSecurityExchange getUnderlyingLegSecurityExchange() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingLegSecurityExchange());
	}

	public boolean isSet(quickfix.field.UnderlyingLegSecurityExchange field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingLegSecurityExchange() {
		return isSetField(1341);
	}

	public void set(quickfix.field.UnderlyingLegSecurityDesc value) {
		setField(value);
	}

	public quickfix.field.UnderlyingLegSecurityDesc get(quickfix.field.UnderlyingLegSecurityDesc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnderlyingLegSecurityDesc getUnderlyingLegSecurityDesc() throws FieldNotFound {
		return get(new quickfix.field.UnderlyingLegSecurityDesc());
	}

	public boolean isSet(quickfix.field.UnderlyingLegSecurityDesc field) {
		return isSetField(field);
	}

	public boolean isSetUnderlyingLegSecurityDesc() {
		return isSetField(1392);
	}

	}

	}

}
