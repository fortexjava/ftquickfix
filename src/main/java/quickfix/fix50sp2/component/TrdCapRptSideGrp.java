
package quickfix.fix50sp2.component;

import quickfix.FieldNotFound;

import quickfix.Group;

public class TrdCapRptSideGrp extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = {  };
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = { 552,  };
	protected int[] getGroupFields() { return componentGroups; }
	

	public TrdCapRptSideGrp() {
		super();
	}
	
	public void set(quickfix.field.NoSides value) {
		setField(value);
	}

	public quickfix.field.NoSides get(quickfix.field.NoSides value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoSides getNoSides() throws FieldNotFound {
		return get(new quickfix.field.NoSides());
	}

	public boolean isSet(quickfix.field.NoSides field) {
		return isSetField(field);
	}

	public boolean isSetNoSides() {
		return isSetField(552);
	}

	public static class NoSides extends Group {

		static final long serialVersionUID = 20050617;

		public NoSides() {
			super(552, 54,
				new int[] {54, 1427, 1428, 1429, 1009, 1005, 1006, 1007, 83, 1008, 430, 1154, 1155, 453, 1, 660, 581, 81, 575, 576, 578, 579, 376, 377, 582, 336, 625, 943, 12, 13, 479, 497, 157, 230, 158, 159, 738, 920, 921, 922, 238, 237, 118, 119, 155, 156, 77, 58, 354, 355, 752, 518, 232, 136, 825, 826, 591, 70, 78, 1016, 1158, 1072, 1057, 1139, 1115, 1444, 37, 198, 11, 526, 66, 1080, 1081, 1431, 40, 44, 99, 18, 39, 38, 152, 516, 468, 469, 151, 14, 59, 126, 1138, 1082, 1083, 1084, 1085, 1086, 1087, 1088, 528, 529, 775, 1432, 821, 1093, 483, 586,  0 });
		}
		
	public void set(quickfix.field.Side value) {
		setField(value);
	}

	public quickfix.field.Side get(quickfix.field.Side value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Side getSide() throws FieldNotFound {
		return get(new quickfix.field.Side());
	}

	public boolean isSet(quickfix.field.Side field) {
		return isSetField(field);
	}

	public boolean isSetSide() {
		return isSetField(54);
	}

	public void set(quickfix.field.SideExecID value) {
		setField(value);
	}

	public quickfix.field.SideExecID get(quickfix.field.SideExecID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SideExecID getSideExecID() throws FieldNotFound {
		return get(new quickfix.field.SideExecID());
	}

	public boolean isSet(quickfix.field.SideExecID field) {
		return isSetField(field);
	}

	public boolean isSetSideExecID() {
		return isSetField(1427);
	}

	public void set(quickfix.field.OrderDelay value) {
		setField(value);
	}

	public quickfix.field.OrderDelay get(quickfix.field.OrderDelay value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OrderDelay getOrderDelay() throws FieldNotFound {
		return get(new quickfix.field.OrderDelay());
	}

	public boolean isSet(quickfix.field.OrderDelay field) {
		return isSetField(field);
	}

	public boolean isSetOrderDelay() {
		return isSetField(1428);
	}

	public void set(quickfix.field.OrderDelayUnit value) {
		setField(value);
	}

	public quickfix.field.OrderDelayUnit get(quickfix.field.OrderDelayUnit value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OrderDelayUnit getOrderDelayUnit() throws FieldNotFound {
		return get(new quickfix.field.OrderDelayUnit());
	}

	public boolean isSet(quickfix.field.OrderDelayUnit field) {
		return isSetField(field);
	}

	public boolean isSetOrderDelayUnit() {
		return isSetField(1429);
	}

	public void set(quickfix.field.SideLastQty value) {
		setField(value);
	}

	public quickfix.field.SideLastQty get(quickfix.field.SideLastQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SideLastQty getSideLastQty() throws FieldNotFound {
		return get(new quickfix.field.SideLastQty());
	}

	public boolean isSet(quickfix.field.SideLastQty field) {
		return isSetField(field);
	}

	public boolean isSetSideLastQty() {
		return isSetField(1009);
	}

	public void set(quickfix.field.SideTradeReportID value) {
		setField(value);
	}

	public quickfix.field.SideTradeReportID get(quickfix.field.SideTradeReportID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SideTradeReportID getSideTradeReportID() throws FieldNotFound {
		return get(new quickfix.field.SideTradeReportID());
	}

	public boolean isSet(quickfix.field.SideTradeReportID field) {
		return isSetField(field);
	}

	public boolean isSetSideTradeReportID() {
		return isSetField(1005);
	}

	public void set(quickfix.field.SideFillStationCd value) {
		setField(value);
	}

	public quickfix.field.SideFillStationCd get(quickfix.field.SideFillStationCd value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SideFillStationCd getSideFillStationCd() throws FieldNotFound {
		return get(new quickfix.field.SideFillStationCd());
	}

	public boolean isSet(quickfix.field.SideFillStationCd field) {
		return isSetField(field);
	}

	public boolean isSetSideFillStationCd() {
		return isSetField(1006);
	}

	public void set(quickfix.field.SideReasonCd value) {
		setField(value);
	}

	public quickfix.field.SideReasonCd get(quickfix.field.SideReasonCd value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SideReasonCd getSideReasonCd() throws FieldNotFound {
		return get(new quickfix.field.SideReasonCd());
	}

	public boolean isSet(quickfix.field.SideReasonCd field) {
		return isSetField(field);
	}

	public boolean isSetSideReasonCd() {
		return isSetField(1007);
	}

	public void set(quickfix.field.RptSeq value) {
		setField(value);
	}

	public quickfix.field.RptSeq get(quickfix.field.RptSeq value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RptSeq getRptSeq() throws FieldNotFound {
		return get(new quickfix.field.RptSeq());
	}

	public boolean isSet(quickfix.field.RptSeq field) {
		return isSetField(field);
	}

	public boolean isSetRptSeq() {
		return isSetField(83);
	}

	public void set(quickfix.field.SideTrdSubTyp value) {
		setField(value);
	}

	public quickfix.field.SideTrdSubTyp get(quickfix.field.SideTrdSubTyp value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SideTrdSubTyp getSideTrdSubTyp() throws FieldNotFound {
		return get(new quickfix.field.SideTrdSubTyp());
	}

	public boolean isSet(quickfix.field.SideTrdSubTyp field) {
		return isSetField(field);
	}

	public boolean isSetSideTrdSubTyp() {
		return isSetField(1008);
	}

	public void set(quickfix.field.NetGrossInd value) {
		setField(value);
	}

	public quickfix.field.NetGrossInd get(quickfix.field.NetGrossInd value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NetGrossInd getNetGrossInd() throws FieldNotFound {
		return get(new quickfix.field.NetGrossInd());
	}

	public boolean isSet(quickfix.field.NetGrossInd field) {
		return isSetField(field);
	}

	public boolean isSetNetGrossInd() {
		return isSetField(430);
	}

	public void set(quickfix.field.SideCurrency value) {
		setField(value);
	}

	public quickfix.field.SideCurrency get(quickfix.field.SideCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SideCurrency getSideCurrency() throws FieldNotFound {
		return get(new quickfix.field.SideCurrency());
	}

	public boolean isSet(quickfix.field.SideCurrency field) {
		return isSetField(field);
	}

	public boolean isSetSideCurrency() {
		return isSetField(1154);
	}

	public void set(quickfix.field.SideSettlCurrency value) {
		setField(value);
	}

	public quickfix.field.SideSettlCurrency get(quickfix.field.SideSettlCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SideSettlCurrency getSideSettlCurrency() throws FieldNotFound {
		return get(new quickfix.field.SideSettlCurrency());
	}

	public boolean isSet(quickfix.field.SideSettlCurrency field) {
		return isSetField(field);
	}

	public boolean isSetSideSettlCurrency() {
		return isSetField(1155);
	}

	public void set(quickfix.fix50sp2.component.Parties component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.Parties get(quickfix.fix50sp2.component.Parties component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.Parties getParties() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.Parties());
	}

	public void set(quickfix.field.NoPartyIDs value) {
		setField(value);
	}

	public quickfix.field.NoPartyIDs get(quickfix.field.NoPartyIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoPartyIDs getNoPartyIDs() throws FieldNotFound {
		return get(new quickfix.field.NoPartyIDs());
	}

	public boolean isSet(quickfix.field.NoPartyIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoPartyIDs() {
		return isSetField(453);
	}

	public static class NoPartyIDs extends Group {

		static final long serialVersionUID = 20050617;

		public NoPartyIDs() {
			super(453, 448,
				new int[] {448, 447, 452, 802,  0 });
		}
		
	public void set(quickfix.field.PartyID value) {
		setField(value);
	}

	public quickfix.field.PartyID get(quickfix.field.PartyID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PartyID getPartyID() throws FieldNotFound {
		return get(new quickfix.field.PartyID());
	}

	public boolean isSet(quickfix.field.PartyID field) {
		return isSetField(field);
	}

	public boolean isSetPartyID() {
		return isSetField(448);
	}

	public void set(quickfix.field.PartyIDSource value) {
		setField(value);
	}

	public quickfix.field.PartyIDSource get(quickfix.field.PartyIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PartyIDSource getPartyIDSource() throws FieldNotFound {
		return get(new quickfix.field.PartyIDSource());
	}

	public boolean isSet(quickfix.field.PartyIDSource field) {
		return isSetField(field);
	}

	public boolean isSetPartyIDSource() {
		return isSetField(447);
	}

	public void set(quickfix.field.PartyRole value) {
		setField(value);
	}

	public quickfix.field.PartyRole get(quickfix.field.PartyRole value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PartyRole getPartyRole() throws FieldNotFound {
		return get(new quickfix.field.PartyRole());
	}

	public boolean isSet(quickfix.field.PartyRole field) {
		return isSetField(field);
	}

	public boolean isSetPartyRole() {
		return isSetField(452);
	}

	public void set(quickfix.fix50sp2.component.PtysSubGrp component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.PtysSubGrp get(quickfix.fix50sp2.component.PtysSubGrp component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.PtysSubGrp getPtysSubGrp() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.PtysSubGrp());
	}

	public void set(quickfix.field.NoPartySubIDs value) {
		setField(value);
	}

	public quickfix.field.NoPartySubIDs get(quickfix.field.NoPartySubIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoPartySubIDs getNoPartySubIDs() throws FieldNotFound {
		return get(new quickfix.field.NoPartySubIDs());
	}

	public boolean isSet(quickfix.field.NoPartySubIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoPartySubIDs() {
		return isSetField(802);
	}

	public static class NoPartySubIDs extends Group {

		static final long serialVersionUID = 20050617;

		public NoPartySubIDs() {
			super(802, 523,
				new int[] {523, 803,  0 });
		}
		
	public void set(quickfix.field.PartySubID value) {
		setField(value);
	}

	public quickfix.field.PartySubID get(quickfix.field.PartySubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PartySubID getPartySubID() throws FieldNotFound {
		return get(new quickfix.field.PartySubID());
	}

	public boolean isSet(quickfix.field.PartySubID field) {
		return isSetField(field);
	}

	public boolean isSetPartySubID() {
		return isSetField(523);
	}

	public void set(quickfix.field.PartySubIDType value) {
		setField(value);
	}

	public quickfix.field.PartySubIDType get(quickfix.field.PartySubIDType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PartySubIDType getPartySubIDType() throws FieldNotFound {
		return get(new quickfix.field.PartySubIDType());
	}

	public boolean isSet(quickfix.field.PartySubIDType field) {
		return isSetField(field);
	}

	public boolean isSetPartySubIDType() {
		return isSetField(803);
	}

	}

	}

	public void set(quickfix.field.Account value) {
		setField(value);
	}

	public quickfix.field.Account get(quickfix.field.Account value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Account getAccount() throws FieldNotFound {
		return get(new quickfix.field.Account());
	}

	public boolean isSet(quickfix.field.Account field) {
		return isSetField(field);
	}

	public boolean isSetAccount() {
		return isSetField(1);
	}

	public void set(quickfix.field.AcctIDSource value) {
		setField(value);
	}

	public quickfix.field.AcctIDSource get(quickfix.field.AcctIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AcctIDSource getAcctIDSource() throws FieldNotFound {
		return get(new quickfix.field.AcctIDSource());
	}

	public boolean isSet(quickfix.field.AcctIDSource field) {
		return isSetField(field);
	}

	public boolean isSetAcctIDSource() {
		return isSetField(660);
	}

	public void set(quickfix.field.AccountType value) {
		setField(value);
	}

	public quickfix.field.AccountType get(quickfix.field.AccountType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AccountType getAccountType() throws FieldNotFound {
		return get(new quickfix.field.AccountType());
	}

	public boolean isSet(quickfix.field.AccountType field) {
		return isSetField(field);
	}

	public boolean isSetAccountType() {
		return isSetField(581);
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

	public void set(quickfix.field.OddLot value) {
		setField(value);
	}

	public quickfix.field.OddLot get(quickfix.field.OddLot value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OddLot getOddLot() throws FieldNotFound {
		return get(new quickfix.field.OddLot());
	}

	public boolean isSet(quickfix.field.OddLot field) {
		return isSetField(field);
	}

	public boolean isSetOddLot() {
		return isSetField(575);
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

	public void set(quickfix.field.TradeInputSource value) {
		setField(value);
	}

	public quickfix.field.TradeInputSource get(quickfix.field.TradeInputSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TradeInputSource getTradeInputSource() throws FieldNotFound {
		return get(new quickfix.field.TradeInputSource());
	}

	public boolean isSet(quickfix.field.TradeInputSource field) {
		return isSetField(field);
	}

	public boolean isSetTradeInputSource() {
		return isSetField(578);
	}

	public void set(quickfix.field.TradeInputDevice value) {
		setField(value);
	}

	public quickfix.field.TradeInputDevice get(quickfix.field.TradeInputDevice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TradeInputDevice getTradeInputDevice() throws FieldNotFound {
		return get(new quickfix.field.TradeInputDevice());
	}

	public boolean isSet(quickfix.field.TradeInputDevice field) {
		return isSetField(field);
	}

	public boolean isSetTradeInputDevice() {
		return isSetField(579);
	}

	public void set(quickfix.field.ComplianceID value) {
		setField(value);
	}

	public quickfix.field.ComplianceID get(quickfix.field.ComplianceID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ComplianceID getComplianceID() throws FieldNotFound {
		return get(new quickfix.field.ComplianceID());
	}

	public boolean isSet(quickfix.field.ComplianceID field) {
		return isSetField(field);
	}

	public boolean isSetComplianceID() {
		return isSetField(376);
	}

	public void set(quickfix.field.SolicitedFlag value) {
		setField(value);
	}

	public quickfix.field.SolicitedFlag get(quickfix.field.SolicitedFlag value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SolicitedFlag getSolicitedFlag() throws FieldNotFound {
		return get(new quickfix.field.SolicitedFlag());
	}

	public boolean isSet(quickfix.field.SolicitedFlag field) {
		return isSetField(field);
	}

	public boolean isSetSolicitedFlag() {
		return isSetField(377);
	}

	public void set(quickfix.field.CustOrderCapacity value) {
		setField(value);
	}

	public quickfix.field.CustOrderCapacity get(quickfix.field.CustOrderCapacity value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CustOrderCapacity getCustOrderCapacity() throws FieldNotFound {
		return get(new quickfix.field.CustOrderCapacity());
	}

	public boolean isSet(quickfix.field.CustOrderCapacity field) {
		return isSetField(field);
	}

	public boolean isSetCustOrderCapacity() {
		return isSetField(582);
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

	public void set(quickfix.field.TimeBracket value) {
		setField(value);
	}

	public quickfix.field.TimeBracket get(quickfix.field.TimeBracket value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TimeBracket getTimeBracket() throws FieldNotFound {
		return get(new quickfix.field.TimeBracket());
	}

	public boolean isSet(quickfix.field.TimeBracket field) {
		return isSetField(field);
	}

	public boolean isSetTimeBracket() {
		return isSetField(943);
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

	public void set(quickfix.field.NumDaysInterest value) {
		setField(value);
	}

	public quickfix.field.NumDaysInterest get(quickfix.field.NumDaysInterest value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NumDaysInterest getNumDaysInterest() throws FieldNotFound {
		return get(new quickfix.field.NumDaysInterest());
	}

	public boolean isSet(quickfix.field.NumDaysInterest field) {
		return isSetField(field);
	}

	public boolean isSetNumDaysInterest() {
		return isSetField(157);
	}

	public void set(quickfix.field.ExDate value) {
		setField(value);
	}

	public quickfix.field.ExDate get(quickfix.field.ExDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ExDate getExDate() throws FieldNotFound {
		return get(new quickfix.field.ExDate());
	}

	public boolean isSet(quickfix.field.ExDate field) {
		return isSetField(field);
	}

	public boolean isSetExDate() {
		return isSetField(230);
	}

	public void set(quickfix.field.AccruedInterestRate value) {
		setField(value);
	}

	public quickfix.field.AccruedInterestRate get(quickfix.field.AccruedInterestRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AccruedInterestRate getAccruedInterestRate() throws FieldNotFound {
		return get(new quickfix.field.AccruedInterestRate());
	}

	public boolean isSet(quickfix.field.AccruedInterestRate field) {
		return isSetField(field);
	}

	public boolean isSetAccruedInterestRate() {
		return isSetField(158);
	}

	public void set(quickfix.field.AccruedInterestAmt value) {
		setField(value);
	}

	public quickfix.field.AccruedInterestAmt get(quickfix.field.AccruedInterestAmt value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AccruedInterestAmt getAccruedInterestAmt() throws FieldNotFound {
		return get(new quickfix.field.AccruedInterestAmt());
	}

	public boolean isSet(quickfix.field.AccruedInterestAmt field) {
		return isSetField(field);
	}

	public boolean isSetAccruedInterestAmt() {
		return isSetField(159);
	}

	public void set(quickfix.field.InterestAtMaturity value) {
		setField(value);
	}

	public quickfix.field.InterestAtMaturity get(quickfix.field.InterestAtMaturity value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.InterestAtMaturity getInterestAtMaturity() throws FieldNotFound {
		return get(new quickfix.field.InterestAtMaturity());
	}

	public boolean isSet(quickfix.field.InterestAtMaturity field) {
		return isSetField(field);
	}

	public boolean isSetInterestAtMaturity() {
		return isSetField(738);
	}

	public void set(quickfix.field.EndAccruedInterestAmt value) {
		setField(value);
	}

	public quickfix.field.EndAccruedInterestAmt get(quickfix.field.EndAccruedInterestAmt value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EndAccruedInterestAmt getEndAccruedInterestAmt() throws FieldNotFound {
		return get(new quickfix.field.EndAccruedInterestAmt());
	}

	public boolean isSet(quickfix.field.EndAccruedInterestAmt field) {
		return isSetField(field);
	}

	public boolean isSetEndAccruedInterestAmt() {
		return isSetField(920);
	}

	public void set(quickfix.field.StartCash value) {
		setField(value);
	}

	public quickfix.field.StartCash get(quickfix.field.StartCash value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.StartCash getStartCash() throws FieldNotFound {
		return get(new quickfix.field.StartCash());
	}

	public boolean isSet(quickfix.field.StartCash field) {
		return isSetField(field);
	}

	public boolean isSetStartCash() {
		return isSetField(921);
	}

	public void set(quickfix.field.EndCash value) {
		setField(value);
	}

	public quickfix.field.EndCash get(quickfix.field.EndCash value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EndCash getEndCash() throws FieldNotFound {
		return get(new quickfix.field.EndCash());
	}

	public boolean isSet(quickfix.field.EndCash field) {
		return isSetField(field);
	}

	public boolean isSetEndCash() {
		return isSetField(922);
	}

	public void set(quickfix.field.Concession value) {
		setField(value);
	}

	public quickfix.field.Concession get(quickfix.field.Concession value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Concession getConcession() throws FieldNotFound {
		return get(new quickfix.field.Concession());
	}

	public boolean isSet(quickfix.field.Concession field) {
		return isSetField(field);
	}

	public boolean isSetConcession() {
		return isSetField(238);
	}

	public void set(quickfix.field.TotalTakedown value) {
		setField(value);
	}

	public quickfix.field.TotalTakedown get(quickfix.field.TotalTakedown value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TotalTakedown getTotalTakedown() throws FieldNotFound {
		return get(new quickfix.field.TotalTakedown());
	}

	public boolean isSet(quickfix.field.TotalTakedown field) {
		return isSetField(field);
	}

	public boolean isSetTotalTakedown() {
		return isSetField(237);
	}

	public void set(quickfix.field.NetMoney value) {
		setField(value);
	}

	public quickfix.field.NetMoney get(quickfix.field.NetMoney value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NetMoney getNetMoney() throws FieldNotFound {
		return get(new quickfix.field.NetMoney());
	}

	public boolean isSet(quickfix.field.NetMoney field) {
		return isSetField(field);
	}

	public boolean isSetNetMoney() {
		return isSetField(118);
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

	public void set(quickfix.field.PositionEffect value) {
		setField(value);
	}

	public quickfix.field.PositionEffect get(quickfix.field.PositionEffect value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PositionEffect getPositionEffect() throws FieldNotFound {
		return get(new quickfix.field.PositionEffect());
	}

	public boolean isSet(quickfix.field.PositionEffect field) {
		return isSetField(field);
	}

	public boolean isSetPositionEffect() {
		return isSetField(77);
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

	public void set(quickfix.field.SideMultiLegReportingType value) {
		setField(value);
	}

	public quickfix.field.SideMultiLegReportingType get(quickfix.field.SideMultiLegReportingType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SideMultiLegReportingType getSideMultiLegReportingType() throws FieldNotFound {
		return get(new quickfix.field.SideMultiLegReportingType());
	}

	public boolean isSet(quickfix.field.SideMultiLegReportingType field) {
		return isSetField(field);
	}

	public boolean isSetSideMultiLegReportingType() {
		return isSetField(752);
	}

	public void set(quickfix.fix50sp2.component.ContAmtGrp component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.ContAmtGrp get(quickfix.fix50sp2.component.ContAmtGrp component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.ContAmtGrp getContAmtGrp() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.ContAmtGrp());
	}

	public void set(quickfix.field.NoContAmts value) {
		setField(value);
	}

	public quickfix.field.NoContAmts get(quickfix.field.NoContAmts value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoContAmts getNoContAmts() throws FieldNotFound {
		return get(new quickfix.field.NoContAmts());
	}

	public boolean isSet(quickfix.field.NoContAmts field) {
		return isSetField(field);
	}

	public boolean isSetNoContAmts() {
		return isSetField(518);
	}

	public static class NoContAmts extends Group {

		static final long serialVersionUID = 20050617;

		public NoContAmts() {
			super(518, 519,
				new int[] {519, 520, 521,  0 });
		}
		
	public void set(quickfix.field.ContAmtType value) {
		setField(value);
	}

	public quickfix.field.ContAmtType get(quickfix.field.ContAmtType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ContAmtType getContAmtType() throws FieldNotFound {
		return get(new quickfix.field.ContAmtType());
	}

	public boolean isSet(quickfix.field.ContAmtType field) {
		return isSetField(field);
	}

	public boolean isSetContAmtType() {
		return isSetField(519);
	}

	public void set(quickfix.field.ContAmtValue value) {
		setField(value);
	}

	public quickfix.field.ContAmtValue get(quickfix.field.ContAmtValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ContAmtValue getContAmtValue() throws FieldNotFound {
		return get(new quickfix.field.ContAmtValue());
	}

	public boolean isSet(quickfix.field.ContAmtValue field) {
		return isSetField(field);
	}

	public boolean isSetContAmtValue() {
		return isSetField(520);
	}

	public void set(quickfix.field.ContAmtCurr value) {
		setField(value);
	}

	public quickfix.field.ContAmtCurr get(quickfix.field.ContAmtCurr value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ContAmtCurr getContAmtCurr() throws FieldNotFound {
		return get(new quickfix.field.ContAmtCurr());
	}

	public boolean isSet(quickfix.field.ContAmtCurr field) {
		return isSetField(field);
	}

	public boolean isSetContAmtCurr() {
		return isSetField(521);
	}

	}

	public void set(quickfix.fix50sp2.component.Stipulations component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.Stipulations get(quickfix.fix50sp2.component.Stipulations component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.Stipulations getStipulations() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.Stipulations());
	}

	public void set(quickfix.field.NoStipulations value) {
		setField(value);
	}

	public quickfix.field.NoStipulations get(quickfix.field.NoStipulations value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoStipulations getNoStipulations() throws FieldNotFound {
		return get(new quickfix.field.NoStipulations());
	}

	public boolean isSet(quickfix.field.NoStipulations field) {
		return isSetField(field);
	}

	public boolean isSetNoStipulations() {
		return isSetField(232);
	}

	public static class NoStipulations extends Group {

		static final long serialVersionUID = 20050617;

		public NoStipulations() {
			super(232, 233,
				new int[] {233, 234,  0 });
		}
		
	public void set(quickfix.field.StipulationType value) {
		setField(value);
	}

	public quickfix.field.StipulationType get(quickfix.field.StipulationType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.StipulationType getStipulationType() throws FieldNotFound {
		return get(new quickfix.field.StipulationType());
	}

	public boolean isSet(quickfix.field.StipulationType field) {
		return isSetField(field);
	}

	public boolean isSetStipulationType() {
		return isSetField(233);
	}

	public void set(quickfix.field.StipulationValue value) {
		setField(value);
	}

	public quickfix.field.StipulationValue get(quickfix.field.StipulationValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.StipulationValue getStipulationValue() throws FieldNotFound {
		return get(new quickfix.field.StipulationValue());
	}

	public boolean isSet(quickfix.field.StipulationValue field) {
		return isSetField(field);
	}

	public boolean isSetStipulationValue() {
		return isSetField(234);
	}

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

	public void set(quickfix.field.ExchangeRule value) {
		setField(value);
	}

	public quickfix.field.ExchangeRule get(quickfix.field.ExchangeRule value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ExchangeRule getExchangeRule() throws FieldNotFound {
		return get(new quickfix.field.ExchangeRule());
	}

	public boolean isSet(quickfix.field.ExchangeRule field) {
		return isSetField(field);
	}

	public boolean isSetExchangeRule() {
		return isSetField(825);
	}

	public void set(quickfix.field.TradeAllocIndicator value) {
		setField(value);
	}

	public quickfix.field.TradeAllocIndicator get(quickfix.field.TradeAllocIndicator value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TradeAllocIndicator getTradeAllocIndicator() throws FieldNotFound {
		return get(new quickfix.field.TradeAllocIndicator());
	}

	public boolean isSet(quickfix.field.TradeAllocIndicator field) {
		return isSetField(field);
	}

	public boolean isSetTradeAllocIndicator() {
		return isSetField(826);
	}

	public void set(quickfix.field.PreallocMethod value) {
		setField(value);
	}

	public quickfix.field.PreallocMethod get(quickfix.field.PreallocMethod value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PreallocMethod getPreallocMethod() throws FieldNotFound {
		return get(new quickfix.field.PreallocMethod());
	}

	public boolean isSet(quickfix.field.PreallocMethod field) {
		return isSetField(field);
	}

	public boolean isSetPreallocMethod() {
		return isSetField(591);
	}

	public void set(quickfix.field.AllocID value) {
		setField(value);
	}

	public quickfix.field.AllocID get(quickfix.field.AllocID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AllocID getAllocID() throws FieldNotFound {
		return get(new quickfix.field.AllocID());
	}

	public boolean isSet(quickfix.field.AllocID field) {
		return isSetField(field);
	}

	public boolean isSetAllocID() {
		return isSetField(70);
	}

	public void set(quickfix.fix50sp2.component.TrdAllocGrp component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.TrdAllocGrp get(quickfix.fix50sp2.component.TrdAllocGrp component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.TrdAllocGrp getTrdAllocGrp() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.TrdAllocGrp());
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
				new int[] {79, 661, 736, 467, 756, 80, 993, 1002, 989, 1136,  0 });
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

	public void set(quickfix.fix50sp2.component.NestedParties2 component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.NestedParties2 get(quickfix.fix50sp2.component.NestedParties2 component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.NestedParties2 getNestedParties2() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.NestedParties2());
	}

	public void set(quickfix.field.NoNested2PartyIDs value) {
		setField(value);
	}

	public quickfix.field.NoNested2PartyIDs get(quickfix.field.NoNested2PartyIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoNested2PartyIDs getNoNested2PartyIDs() throws FieldNotFound {
		return get(new quickfix.field.NoNested2PartyIDs());
	}

	public boolean isSet(quickfix.field.NoNested2PartyIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoNested2PartyIDs() {
		return isSetField(756);
	}

	public static class NoNested2PartyIDs extends Group {

		static final long serialVersionUID = 20050617;

		public NoNested2PartyIDs() {
			super(756, 757,
				new int[] {757, 758, 759, 806,  0 });
		}
		
	public void set(quickfix.field.Nested2PartyID value) {
		setField(value);
	}

	public quickfix.field.Nested2PartyID get(quickfix.field.Nested2PartyID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Nested2PartyID getNested2PartyID() throws FieldNotFound {
		return get(new quickfix.field.Nested2PartyID());
	}

	public boolean isSet(quickfix.field.Nested2PartyID field) {
		return isSetField(field);
	}

	public boolean isSetNested2PartyID() {
		return isSetField(757);
	}

	public void set(quickfix.field.Nested2PartyIDSource value) {
		setField(value);
	}

	public quickfix.field.Nested2PartyIDSource get(quickfix.field.Nested2PartyIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Nested2PartyIDSource getNested2PartyIDSource() throws FieldNotFound {
		return get(new quickfix.field.Nested2PartyIDSource());
	}

	public boolean isSet(quickfix.field.Nested2PartyIDSource field) {
		return isSetField(field);
	}

	public boolean isSetNested2PartyIDSource() {
		return isSetField(758);
	}

	public void set(quickfix.field.Nested2PartyRole value) {
		setField(value);
	}

	public quickfix.field.Nested2PartyRole get(quickfix.field.Nested2PartyRole value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Nested2PartyRole getNested2PartyRole() throws FieldNotFound {
		return get(new quickfix.field.Nested2PartyRole());
	}

	public boolean isSet(quickfix.field.Nested2PartyRole field) {
		return isSetField(field);
	}

	public boolean isSetNested2PartyRole() {
		return isSetField(759);
	}

	public void set(quickfix.fix50sp2.component.NstdPtys2SubGrp component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.NstdPtys2SubGrp get(quickfix.fix50sp2.component.NstdPtys2SubGrp component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.NstdPtys2SubGrp getNstdPtys2SubGrp() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.NstdPtys2SubGrp());
	}

	public void set(quickfix.field.NoNested2PartySubIDs value) {
		setField(value);
	}

	public quickfix.field.NoNested2PartySubIDs get(quickfix.field.NoNested2PartySubIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoNested2PartySubIDs getNoNested2PartySubIDs() throws FieldNotFound {
		return get(new quickfix.field.NoNested2PartySubIDs());
	}

	public boolean isSet(quickfix.field.NoNested2PartySubIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoNested2PartySubIDs() {
		return isSetField(806);
	}

	public static class NoNested2PartySubIDs extends Group {

		static final long serialVersionUID = 20050617;

		public NoNested2PartySubIDs() {
			super(806, 760,
				new int[] {760, 807,  0 });
		}
		
	public void set(quickfix.field.Nested2PartySubID value) {
		setField(value);
	}

	public quickfix.field.Nested2PartySubID get(quickfix.field.Nested2PartySubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Nested2PartySubID getNested2PartySubID() throws FieldNotFound {
		return get(new quickfix.field.Nested2PartySubID());
	}

	public boolean isSet(quickfix.field.Nested2PartySubID field) {
		return isSetField(field);
	}

	public boolean isSetNested2PartySubID() {
		return isSetField(760);
	}

	public void set(quickfix.field.Nested2PartySubIDType value) {
		setField(value);
	}

	public quickfix.field.Nested2PartySubIDType get(quickfix.field.Nested2PartySubIDType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Nested2PartySubIDType getNested2PartySubIDType() throws FieldNotFound {
		return get(new quickfix.field.Nested2PartySubIDType());
	}

	public boolean isSet(quickfix.field.Nested2PartySubIDType field) {
		return isSetField(field);
	}

	public boolean isSetNested2PartySubIDType() {
		return isSetField(807);
	}

	}

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

	public void set(quickfix.field.AllocClearingFeeIndicator value) {
		setField(value);
	}

	public quickfix.field.AllocClearingFeeIndicator get(quickfix.field.AllocClearingFeeIndicator value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AllocClearingFeeIndicator getAllocClearingFeeIndicator() throws FieldNotFound {
		return get(new quickfix.field.AllocClearingFeeIndicator());
	}

	public boolean isSet(quickfix.field.AllocClearingFeeIndicator field) {
		return isSetField(field);
	}

	public boolean isSetAllocClearingFeeIndicator() {
		return isSetField(1136);
	}

	}

	public void set(quickfix.fix50sp2.component.SideTrdRegTS component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.SideTrdRegTS get(quickfix.fix50sp2.component.SideTrdRegTS component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.SideTrdRegTS getSideTrdRegTS() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.SideTrdRegTS());
	}

	public void set(quickfix.field.NoSideTrdRegTS value) {
		setField(value);
	}

	public quickfix.field.NoSideTrdRegTS get(quickfix.field.NoSideTrdRegTS value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoSideTrdRegTS getNoSideTrdRegTS() throws FieldNotFound {
		return get(new quickfix.field.NoSideTrdRegTS());
	}

	public boolean isSet(quickfix.field.NoSideTrdRegTS field) {
		return isSetField(field);
	}

	public boolean isSetNoSideTrdRegTS() {
		return isSetField(1016);
	}

	public static class NoSideTrdRegTS extends Group {

		static final long serialVersionUID = 20050617;

		public NoSideTrdRegTS() {
			super(1016, 1012,
				new int[] {1012, 1013, 1014,  0 });
		}
		
	public void set(quickfix.field.SideTrdRegTimestamp value) {
		setField(value);
	}

	public quickfix.field.SideTrdRegTimestamp get(quickfix.field.SideTrdRegTimestamp value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SideTrdRegTimestamp getSideTrdRegTimestamp() throws FieldNotFound {
		return get(new quickfix.field.SideTrdRegTimestamp());
	}

	public boolean isSet(quickfix.field.SideTrdRegTimestamp field) {
		return isSetField(field);
	}

	public boolean isSetSideTrdRegTimestamp() {
		return isSetField(1012);
	}

	public void set(quickfix.field.SideTrdRegTimestampType value) {
		setField(value);
	}

	public quickfix.field.SideTrdRegTimestampType get(quickfix.field.SideTrdRegTimestampType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SideTrdRegTimestampType getSideTrdRegTimestampType() throws FieldNotFound {
		return get(new quickfix.field.SideTrdRegTimestampType());
	}

	public boolean isSet(quickfix.field.SideTrdRegTimestampType field) {
		return isSetField(field);
	}

	public boolean isSetSideTrdRegTimestampType() {
		return isSetField(1013);
	}

	public void set(quickfix.field.SideTrdRegTimestampSrc value) {
		setField(value);
	}

	public quickfix.field.SideTrdRegTimestampSrc get(quickfix.field.SideTrdRegTimestampSrc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SideTrdRegTimestampSrc getSideTrdRegTimestampSrc() throws FieldNotFound {
		return get(new quickfix.field.SideTrdRegTimestampSrc());
	}

	public boolean isSet(quickfix.field.SideTrdRegTimestampSrc field) {
		return isSetField(field);
	}

	public boolean isSetSideTrdRegTimestampSrc() {
		return isSetField(1014);
	}

	}

	public void set(quickfix.fix50sp2.component.SettlDetails component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.SettlDetails get(quickfix.fix50sp2.component.SettlDetails component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.SettlDetails getSettlDetails() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.SettlDetails());
	}

	public void set(quickfix.field.NoSettlDetails value) {
		setField(value);
	}

	public quickfix.field.NoSettlDetails get(quickfix.field.NoSettlDetails value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoSettlDetails getNoSettlDetails() throws FieldNotFound {
		return get(new quickfix.field.NoSettlDetails());
	}

	public boolean isSet(quickfix.field.NoSettlDetails field) {
		return isSetField(field);
	}

	public boolean isSetNoSettlDetails() {
		return isSetField(1158);
	}

	public static class NoSettlDetails extends Group {

		static final long serialVersionUID = 20050617;

		public NoSettlDetails() {
			super(1158, 1164,
				new int[] {1164, 781,  0 });
		}
		
	public void set(quickfix.field.SettlObligSource value) {
		setField(value);
	}

	public quickfix.field.SettlObligSource get(quickfix.field.SettlObligSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SettlObligSource getSettlObligSource() throws FieldNotFound {
		return get(new quickfix.field.SettlObligSource());
	}

	public boolean isSet(quickfix.field.SettlObligSource field) {
		return isSetField(field);
	}

	public boolean isSetSettlObligSource() {
		return isSetField(1164);
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

	public void set(quickfix.field.SideGrossTradeAmt value) {
		setField(value);
	}

	public quickfix.field.SideGrossTradeAmt get(quickfix.field.SideGrossTradeAmt value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SideGrossTradeAmt getSideGrossTradeAmt() throws FieldNotFound {
		return get(new quickfix.field.SideGrossTradeAmt());
	}

	public boolean isSet(quickfix.field.SideGrossTradeAmt field) {
		return isSetField(field);
	}

	public boolean isSetSideGrossTradeAmt() {
		return isSetField(1072);
	}

	public void set(quickfix.field.AggressorIndicator value) {
		setField(value);
	}

	public quickfix.field.AggressorIndicator get(quickfix.field.AggressorIndicator value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AggressorIndicator getAggressorIndicator() throws FieldNotFound {
		return get(new quickfix.field.AggressorIndicator());
	}

	public boolean isSet(quickfix.field.AggressorIndicator field) {
		return isSetField(field);
	}

	public boolean isSetAggressorIndicator() {
		return isSetField(1057);
	}

	public void set(quickfix.field.ExchangeSpecialInstructions value) {
		setField(value);
	}

	public quickfix.field.ExchangeSpecialInstructions get(quickfix.field.ExchangeSpecialInstructions value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ExchangeSpecialInstructions getExchangeSpecialInstructions() throws FieldNotFound {
		return get(new quickfix.field.ExchangeSpecialInstructions());
	}

	public boolean isSet(quickfix.field.ExchangeSpecialInstructions field) {
		return isSetField(field);
	}

	public boolean isSetExchangeSpecialInstructions() {
		return isSetField(1139);
	}

	public void set(quickfix.field.OrderCategory value) {
		setField(value);
	}

	public quickfix.field.OrderCategory get(quickfix.field.OrderCategory value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OrderCategory getOrderCategory() throws FieldNotFound {
		return get(new quickfix.field.OrderCategory());
	}

	public boolean isSet(quickfix.field.OrderCategory field) {
		return isSetField(field);
	}

	public boolean isSetOrderCategory() {
		return isSetField(1115);
	}

	public void set(quickfix.field.SideLiquidityInd value) {
		setField(value);
	}

	public quickfix.field.SideLiquidityInd get(quickfix.field.SideLiquidityInd value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SideLiquidityInd getSideLiquidityInd() throws FieldNotFound {
		return get(new quickfix.field.SideLiquidityInd());
	}

	public boolean isSet(quickfix.field.SideLiquidityInd field) {
		return isSetField(field);
	}

	public boolean isSetSideLiquidityInd() {
		return isSetField(1444);
	}

	public void set(quickfix.fix50sp2.component.TradeReportOrderDetail component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.TradeReportOrderDetail get(quickfix.fix50sp2.component.TradeReportOrderDetail component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.TradeReportOrderDetail getTradeReportOrderDetail() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.TradeReportOrderDetail());
	}

	public void set(quickfix.field.OrderID value) {
		setField(value);
	}

	public quickfix.field.OrderID get(quickfix.field.OrderID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OrderID getOrderID() throws FieldNotFound {
		return get(new quickfix.field.OrderID());
	}

	public boolean isSet(quickfix.field.OrderID field) {
		return isSetField(field);
	}

	public boolean isSetOrderID() {
		return isSetField(37);
	}

	public void set(quickfix.field.SecondaryOrderID value) {
		setField(value);
	}

	public quickfix.field.SecondaryOrderID get(quickfix.field.SecondaryOrderID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecondaryOrderID getSecondaryOrderID() throws FieldNotFound {
		return get(new quickfix.field.SecondaryOrderID());
	}

	public boolean isSet(quickfix.field.SecondaryOrderID field) {
		return isSetField(field);
	}

	public boolean isSetSecondaryOrderID() {
		return isSetField(198);
	}

	public void set(quickfix.field.ClOrdID value) {
		setField(value);
	}

	public quickfix.field.ClOrdID get(quickfix.field.ClOrdID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ClOrdID getClOrdID() throws FieldNotFound {
		return get(new quickfix.field.ClOrdID());
	}

	public boolean isSet(quickfix.field.ClOrdID field) {
		return isSetField(field);
	}

	public boolean isSetClOrdID() {
		return isSetField(11);
	}

	public void set(quickfix.field.SecondaryClOrdID value) {
		setField(value);
	}

	public quickfix.field.SecondaryClOrdID get(quickfix.field.SecondaryClOrdID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecondaryClOrdID getSecondaryClOrdID() throws FieldNotFound {
		return get(new quickfix.field.SecondaryClOrdID());
	}

	public boolean isSet(quickfix.field.SecondaryClOrdID field) {
		return isSetField(field);
	}

	public boolean isSetSecondaryClOrdID() {
		return isSetField(526);
	}

	public void set(quickfix.field.ListID value) {
		setField(value);
	}

	public quickfix.field.ListID get(quickfix.field.ListID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ListID getListID() throws FieldNotFound {
		return get(new quickfix.field.ListID());
	}

	public boolean isSet(quickfix.field.ListID field) {
		return isSetField(field);
	}

	public boolean isSetListID() {
		return isSetField(66);
	}

	public void set(quickfix.field.RefOrderID value) {
		setField(value);
	}

	public quickfix.field.RefOrderID get(quickfix.field.RefOrderID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RefOrderID getRefOrderID() throws FieldNotFound {
		return get(new quickfix.field.RefOrderID());
	}

	public boolean isSet(quickfix.field.RefOrderID field) {
		return isSetField(field);
	}

	public boolean isSetRefOrderID() {
		return isSetField(1080);
	}

	public void set(quickfix.field.RefOrderIDSource value) {
		setField(value);
	}

	public quickfix.field.RefOrderIDSource get(quickfix.field.RefOrderIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RefOrderIDSource getRefOrderIDSource() throws FieldNotFound {
		return get(new quickfix.field.RefOrderIDSource());
	}

	public boolean isSet(quickfix.field.RefOrderIDSource field) {
		return isSetField(field);
	}

	public boolean isSetRefOrderIDSource() {
		return isSetField(1081);
	}

	public void set(quickfix.field.RefOrdIDReason value) {
		setField(value);
	}

	public quickfix.field.RefOrdIDReason get(quickfix.field.RefOrdIDReason value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RefOrdIDReason getRefOrdIDReason() throws FieldNotFound {
		return get(new quickfix.field.RefOrdIDReason());
	}

	public boolean isSet(quickfix.field.RefOrdIDReason field) {
		return isSetField(field);
	}

	public boolean isSetRefOrdIDReason() {
		return isSetField(1431);
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

	public void set(quickfix.field.Price value) {
		setField(value);
	}

	public quickfix.field.Price get(quickfix.field.Price value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Price getPrice() throws FieldNotFound {
		return get(new quickfix.field.Price());
	}

	public boolean isSet(quickfix.field.Price field) {
		return isSetField(field);
	}

	public boolean isSetPrice() {
		return isSetField(44);
	}

	public void set(quickfix.field.StopPx value) {
		setField(value);
	}

	public quickfix.field.StopPx get(quickfix.field.StopPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.StopPx getStopPx() throws FieldNotFound {
		return get(new quickfix.field.StopPx());
	}

	public boolean isSet(quickfix.field.StopPx field) {
		return isSetField(field);
	}

	public boolean isSetStopPx() {
		return isSetField(99);
	}

	public void set(quickfix.field.ExecInst value) {
		setField(value);
	}

	public quickfix.field.ExecInst get(quickfix.field.ExecInst value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ExecInst getExecInst() throws FieldNotFound {
		return get(new quickfix.field.ExecInst());
	}

	public boolean isSet(quickfix.field.ExecInst field) {
		return isSetField(field);
	}

	public boolean isSetExecInst() {
		return isSetField(18);
	}

	public void set(quickfix.field.OrdStatus value) {
		setField(value);
	}

	public quickfix.field.OrdStatus get(quickfix.field.OrdStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OrdStatus getOrdStatus() throws FieldNotFound {
		return get(new quickfix.field.OrdStatus());
	}

	public boolean isSet(quickfix.field.OrdStatus field) {
		return isSetField(field);
	}

	public boolean isSetOrdStatus() {
		return isSetField(39);
	}

	public void set(quickfix.fix50sp2.component.OrderQtyData component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.OrderQtyData get(quickfix.fix50sp2.component.OrderQtyData component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.OrderQtyData getOrderQtyData() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.OrderQtyData());
	}

	public void set(quickfix.field.OrderQty value) {
		setField(value);
	}

	public quickfix.field.OrderQty get(quickfix.field.OrderQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OrderQty getOrderQty() throws FieldNotFound {
		return get(new quickfix.field.OrderQty());
	}

	public boolean isSet(quickfix.field.OrderQty field) {
		return isSetField(field);
	}

	public boolean isSetOrderQty() {
		return isSetField(38);
	}

	public void set(quickfix.field.CashOrderQty value) {
		setField(value);
	}

	public quickfix.field.CashOrderQty get(quickfix.field.CashOrderQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CashOrderQty getCashOrderQty() throws FieldNotFound {
		return get(new quickfix.field.CashOrderQty());
	}

	public boolean isSet(quickfix.field.CashOrderQty field) {
		return isSetField(field);
	}

	public boolean isSetCashOrderQty() {
		return isSetField(152);
	}

	public void set(quickfix.field.OrderPercent value) {
		setField(value);
	}

	public quickfix.field.OrderPercent get(quickfix.field.OrderPercent value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OrderPercent getOrderPercent() throws FieldNotFound {
		return get(new quickfix.field.OrderPercent());
	}

	public boolean isSet(quickfix.field.OrderPercent field) {
		return isSetField(field);
	}

	public boolean isSetOrderPercent() {
		return isSetField(516);
	}

	public void set(quickfix.field.RoundingDirection value) {
		setField(value);
	}

	public quickfix.field.RoundingDirection get(quickfix.field.RoundingDirection value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RoundingDirection getRoundingDirection() throws FieldNotFound {
		return get(new quickfix.field.RoundingDirection());
	}

	public boolean isSet(quickfix.field.RoundingDirection field) {
		return isSetField(field);
	}

	public boolean isSetRoundingDirection() {
		return isSetField(468);
	}

	public void set(quickfix.field.RoundingModulus value) {
		setField(value);
	}

	public quickfix.field.RoundingModulus get(quickfix.field.RoundingModulus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RoundingModulus getRoundingModulus() throws FieldNotFound {
		return get(new quickfix.field.RoundingModulus());
	}

	public boolean isSet(quickfix.field.RoundingModulus field) {
		return isSetField(field);
	}

	public boolean isSetRoundingModulus() {
		return isSetField(469);
	}

	public void set(quickfix.field.LeavesQty value) {
		setField(value);
	}

	public quickfix.field.LeavesQty get(quickfix.field.LeavesQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LeavesQty getLeavesQty() throws FieldNotFound {
		return get(new quickfix.field.LeavesQty());
	}

	public boolean isSet(quickfix.field.LeavesQty field) {
		return isSetField(field);
	}

	public boolean isSetLeavesQty() {
		return isSetField(151);
	}

	public void set(quickfix.field.CumQty value) {
		setField(value);
	}

	public quickfix.field.CumQty get(quickfix.field.CumQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CumQty getCumQty() throws FieldNotFound {
		return get(new quickfix.field.CumQty());
	}

	public boolean isSet(quickfix.field.CumQty field) {
		return isSetField(field);
	}

	public boolean isSetCumQty() {
		return isSetField(14);
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

	public void set(quickfix.field.ExpireTime value) {
		setField(value);
	}

	public quickfix.field.ExpireTime get(quickfix.field.ExpireTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ExpireTime getExpireTime() throws FieldNotFound {
		return get(new quickfix.field.ExpireTime());
	}

	public boolean isSet(quickfix.field.ExpireTime field) {
		return isSetField(field);
	}

	public boolean isSetExpireTime() {
		return isSetField(126);
	}

	public void set(quickfix.fix50sp2.component.DisplayInstruction component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.DisplayInstruction get(quickfix.fix50sp2.component.DisplayInstruction component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.DisplayInstruction getDisplayInstruction() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.DisplayInstruction());
	}

	public void set(quickfix.field.DisplayQty value) {
		setField(value);
	}

	public quickfix.field.DisplayQty get(quickfix.field.DisplayQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DisplayQty getDisplayQty() throws FieldNotFound {
		return get(new quickfix.field.DisplayQty());
	}

	public boolean isSet(quickfix.field.DisplayQty field) {
		return isSetField(field);
	}

	public boolean isSetDisplayQty() {
		return isSetField(1138);
	}

	public void set(quickfix.field.SecondaryDisplayQty value) {
		setField(value);
	}

	public quickfix.field.SecondaryDisplayQty get(quickfix.field.SecondaryDisplayQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecondaryDisplayQty getSecondaryDisplayQty() throws FieldNotFound {
		return get(new quickfix.field.SecondaryDisplayQty());
	}

	public boolean isSet(quickfix.field.SecondaryDisplayQty field) {
		return isSetField(field);
	}

	public boolean isSetSecondaryDisplayQty() {
		return isSetField(1082);
	}

	public void set(quickfix.field.DisplayWhen value) {
		setField(value);
	}

	public quickfix.field.DisplayWhen get(quickfix.field.DisplayWhen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DisplayWhen getDisplayWhen() throws FieldNotFound {
		return get(new quickfix.field.DisplayWhen());
	}

	public boolean isSet(quickfix.field.DisplayWhen field) {
		return isSetField(field);
	}

	public boolean isSetDisplayWhen() {
		return isSetField(1083);
	}

	public void set(quickfix.field.DisplayMethod value) {
		setField(value);
	}

	public quickfix.field.DisplayMethod get(quickfix.field.DisplayMethod value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DisplayMethod getDisplayMethod() throws FieldNotFound {
		return get(new quickfix.field.DisplayMethod());
	}

	public boolean isSet(quickfix.field.DisplayMethod field) {
		return isSetField(field);
	}

	public boolean isSetDisplayMethod() {
		return isSetField(1084);
	}

	public void set(quickfix.field.DisplayLowQty value) {
		setField(value);
	}

	public quickfix.field.DisplayLowQty get(quickfix.field.DisplayLowQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DisplayLowQty getDisplayLowQty() throws FieldNotFound {
		return get(new quickfix.field.DisplayLowQty());
	}

	public boolean isSet(quickfix.field.DisplayLowQty field) {
		return isSetField(field);
	}

	public boolean isSetDisplayLowQty() {
		return isSetField(1085);
	}

	public void set(quickfix.field.DisplayHighQty value) {
		setField(value);
	}

	public quickfix.field.DisplayHighQty get(quickfix.field.DisplayHighQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DisplayHighQty getDisplayHighQty() throws FieldNotFound {
		return get(new quickfix.field.DisplayHighQty());
	}

	public boolean isSet(quickfix.field.DisplayHighQty field) {
		return isSetField(field);
	}

	public boolean isSetDisplayHighQty() {
		return isSetField(1086);
	}

	public void set(quickfix.field.DisplayMinIncr value) {
		setField(value);
	}

	public quickfix.field.DisplayMinIncr get(quickfix.field.DisplayMinIncr value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DisplayMinIncr getDisplayMinIncr() throws FieldNotFound {
		return get(new quickfix.field.DisplayMinIncr());
	}

	public boolean isSet(quickfix.field.DisplayMinIncr field) {
		return isSetField(field);
	}

	public boolean isSetDisplayMinIncr() {
		return isSetField(1087);
	}

	public void set(quickfix.field.RefreshQty value) {
		setField(value);
	}

	public quickfix.field.RefreshQty get(quickfix.field.RefreshQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RefreshQty getRefreshQty() throws FieldNotFound {
		return get(new quickfix.field.RefreshQty());
	}

	public boolean isSet(quickfix.field.RefreshQty field) {
		return isSetField(field);
	}

	public boolean isSetRefreshQty() {
		return isSetField(1088);
	}

	public void set(quickfix.field.OrderCapacity value) {
		setField(value);
	}

	public quickfix.field.OrderCapacity get(quickfix.field.OrderCapacity value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OrderCapacity getOrderCapacity() throws FieldNotFound {
		return get(new quickfix.field.OrderCapacity());
	}

	public boolean isSet(quickfix.field.OrderCapacity field) {
		return isSetField(field);
	}

	public boolean isSetOrderCapacity() {
		return isSetField(528);
	}

	public void set(quickfix.field.OrderRestrictions value) {
		setField(value);
	}

	public quickfix.field.OrderRestrictions get(quickfix.field.OrderRestrictions value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OrderRestrictions getOrderRestrictions() throws FieldNotFound {
		return get(new quickfix.field.OrderRestrictions());
	}

	public boolean isSet(quickfix.field.OrderRestrictions field) {
		return isSetField(field);
	}

	public boolean isSetOrderRestrictions() {
		return isSetField(529);
	}

	public void set(quickfix.field.BookingType value) {
		setField(value);
	}

	public quickfix.field.BookingType get(quickfix.field.BookingType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.BookingType getBookingType() throws FieldNotFound {
		return get(new quickfix.field.BookingType());
	}

	public boolean isSet(quickfix.field.BookingType field) {
		return isSetField(field);
	}

	public boolean isSetBookingType() {
		return isSetField(775);
	}

	public void set(quickfix.field.OrigCustOrderCapacity value) {
		setField(value);
	}

	public quickfix.field.OrigCustOrderCapacity get(quickfix.field.OrigCustOrderCapacity value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OrigCustOrderCapacity getOrigCustOrderCapacity() throws FieldNotFound {
		return get(new quickfix.field.OrigCustOrderCapacity());
	}

	public boolean isSet(quickfix.field.OrigCustOrderCapacity field) {
		return isSetField(field);
	}

	public boolean isSetOrigCustOrderCapacity() {
		return isSetField(1432);
	}

	public void set(quickfix.field.OrderInputDevice value) {
		setField(value);
	}

	public quickfix.field.OrderInputDevice get(quickfix.field.OrderInputDevice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OrderInputDevice getOrderInputDevice() throws FieldNotFound {
		return get(new quickfix.field.OrderInputDevice());
	}

	public boolean isSet(quickfix.field.OrderInputDevice field) {
		return isSetField(field);
	}

	public boolean isSetOrderInputDevice() {
		return isSetField(821);
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

	public void set(quickfix.field.TransBkdTime value) {
		setField(value);
	}

	public quickfix.field.TransBkdTime get(quickfix.field.TransBkdTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TransBkdTime getTransBkdTime() throws FieldNotFound {
		return get(new quickfix.field.TransBkdTime());
	}

	public boolean isSet(quickfix.field.TransBkdTime field) {
		return isSetField(field);
	}

	public boolean isSetTransBkdTime() {
		return isSetField(483);
	}

	public void set(quickfix.field.OrigOrdModTime value) {
		setField(value);
	}

	public quickfix.field.OrigOrdModTime get(quickfix.field.OrigOrdModTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OrigOrdModTime getOrigOrdModTime() throws FieldNotFound {
		return get(new quickfix.field.OrigOrdModTime());
	}

	public boolean isSet(quickfix.field.OrigOrdModTime field) {
		return isSetField(field);
	}

	public boolean isSetOrigOrdModTime() {
		return isSetField(586);
	}

	}

}
