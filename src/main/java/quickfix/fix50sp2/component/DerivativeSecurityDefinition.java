
package quickfix.fix50sp2.component;

import quickfix.FieldNotFound;

import quickfix.Group;

public class DerivativeSecurityDefinition extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = { 1214, 1215, 1216, 1217, 1218, 1246, 1228, 1243, 1247, 1248, 1249, 1250, 1251, 1252, 1253, 1254, 1255, 1256, 1276, 1257, 1258, 1259, 1260, 1261, 1262, 1263, 1264, 1265, 1266, 1438, 1442, 1267, 1268, 1269, 1270, 1315, 1316, 1317, 1318, 1319, 1320, 1321, 1322, 1323, 1299, 1225, 1271, 1272, 1273, 1274, 1275, 1277, 1278, 1279, 1280, 1281, 1282, 1283, 1284, 1285, 1286, 1292, 1311, 1310,  };
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = {  };
	protected int[] getGroupFields() { return componentGroups; }
	

	public DerivativeSecurityDefinition() {
		super();
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

}
