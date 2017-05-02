
package quickfix.fix43;

import quickfix.FieldNotFound;

import quickfix.Group;

public class SettlementInstructions extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "T";
	

	public SettlementInstructions() {
		super();
		getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
	}
	
	public SettlementInstructions(quickfix.field.SettlInstID settlInstID, quickfix.field.SettlInstTransType settlInstTransType, quickfix.field.SettlInstRefID settlInstRefID, quickfix.field.SettlInstMode settlInstMode, quickfix.field.SettlInstSource settlInstSource, quickfix.field.AllocAccount allocAccount, quickfix.field.TransactTime transactTime) {
		this();
		setField(settlInstID);
		setField(settlInstTransType);
		setField(settlInstRefID);
		setField(settlInstMode);
		setField(settlInstSource);
		setField(allocAccount);
		setField(transactTime);
	}
	
	public void set(quickfix.field.SettlInstID value) {
		setField(value);
	}

	public quickfix.field.SettlInstID get(quickfix.field.SettlInstID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SettlInstID getSettlInstID() throws FieldNotFound {
		return get(new quickfix.field.SettlInstID());
	}

	public boolean isSet(quickfix.field.SettlInstID field) {
		return isSetField(field);
	}

	public boolean isSetSettlInstID() {
		return isSetField(162);
	}

	public void set(quickfix.field.SettlInstTransType value) {
		setField(value);
	}

	public quickfix.field.SettlInstTransType get(quickfix.field.SettlInstTransType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SettlInstTransType getSettlInstTransType() throws FieldNotFound {
		return get(new quickfix.field.SettlInstTransType());
	}

	public boolean isSet(quickfix.field.SettlInstTransType field) {
		return isSetField(field);
	}

	public boolean isSetSettlInstTransType() {
		return isSetField(163);
	}

	public void set(quickfix.field.SettlInstRefID value) {
		setField(value);
	}

	public quickfix.field.SettlInstRefID get(quickfix.field.SettlInstRefID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SettlInstRefID getSettlInstRefID() throws FieldNotFound {
		return get(new quickfix.field.SettlInstRefID());
	}

	public boolean isSet(quickfix.field.SettlInstRefID field) {
		return isSetField(field);
	}

	public boolean isSetSettlInstRefID() {
		return isSetField(214);
	}

	public void set(quickfix.field.SettlInstMode value) {
		setField(value);
	}

	public quickfix.field.SettlInstMode get(quickfix.field.SettlInstMode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SettlInstMode getSettlInstMode() throws FieldNotFound {
		return get(new quickfix.field.SettlInstMode());
	}

	public boolean isSet(quickfix.field.SettlInstMode field) {
		return isSetField(field);
	}

	public boolean isSetSettlInstMode() {
		return isSetField(160);
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

	public void set(quickfix.field.TradeDate value) {
		setField(value);
	}

	public quickfix.field.TradeDate get(quickfix.field.TradeDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TradeDate getTradeDate() throws FieldNotFound {
		return get(new quickfix.field.TradeDate());
	}

	public boolean isSet(quickfix.field.TradeDate field) {
		return isSetField(field);
	}

	public boolean isSetTradeDate() {
		return isSetField(75);
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

	public void set(quickfix.field.LastMkt value) {
		setField(value);
	}

	public quickfix.field.LastMkt get(quickfix.field.LastMkt value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LastMkt getLastMkt() throws FieldNotFound {
		return get(new quickfix.field.LastMkt());
	}

	public boolean isSet(quickfix.field.LastMkt field) {
		return isSetField(field);
	}

	public boolean isSetLastMkt() {
		return isSetField(30);
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

	public void set(quickfix.field.EffectiveTime value) {
		setField(value);
	}

	public quickfix.field.EffectiveTime get(quickfix.field.EffectiveTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EffectiveTime getEffectiveTime() throws FieldNotFound {
		return get(new quickfix.field.EffectiveTime());
	}

	public boolean isSet(quickfix.field.EffectiveTime field) {
		return isSetField(field);
	}

	public boolean isSetEffectiveTime() {
		return isSetField(168);
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

	public void set(quickfix.fix43.component.Parties component) {
		setComponent(component);
	}

	public quickfix.fix43.component.Parties get(quickfix.fix43.component.Parties component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix43.component.Parties getParties() throws FieldNotFound {
		return get(new quickfix.fix43.component.Parties());
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
				new int[] {448, 447, 452, 523,  0 });
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

	public void set(quickfix.field.SettlDepositoryCode value) {
		setField(value);
	}

	public quickfix.field.SettlDepositoryCode get(quickfix.field.SettlDepositoryCode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SettlDepositoryCode getSettlDepositoryCode() throws FieldNotFound {
		return get(new quickfix.field.SettlDepositoryCode());
	}

	public boolean isSet(quickfix.field.SettlDepositoryCode field) {
		return isSetField(field);
	}

	public boolean isSetSettlDepositoryCode() {
		return isSetField(173);
	}

	public void set(quickfix.field.SettlBrkrCode value) {
		setField(value);
	}

	public quickfix.field.SettlBrkrCode get(quickfix.field.SettlBrkrCode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SettlBrkrCode getSettlBrkrCode() throws FieldNotFound {
		return get(new quickfix.field.SettlBrkrCode());
	}

	public boolean isSet(quickfix.field.SettlBrkrCode field) {
		return isSetField(field);
	}

	public boolean isSetSettlBrkrCode() {
		return isSetField(174);
	}

	public void set(quickfix.field.SettlInstCode value) {
		setField(value);
	}

	public quickfix.field.SettlInstCode get(quickfix.field.SettlInstCode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SettlInstCode getSettlInstCode() throws FieldNotFound {
		return get(new quickfix.field.SettlInstCode());
	}

	public boolean isSet(quickfix.field.SettlInstCode field) {
		return isSetField(field);
	}

	public boolean isSetSettlInstCode() {
		return isSetField(175);
	}

	public void set(quickfix.field.SecuritySettlAgentName value) {
		setField(value);
	}

	public quickfix.field.SecuritySettlAgentName get(quickfix.field.SecuritySettlAgentName value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecuritySettlAgentName getSecuritySettlAgentName() throws FieldNotFound {
		return get(new quickfix.field.SecuritySettlAgentName());
	}

	public boolean isSet(quickfix.field.SecuritySettlAgentName field) {
		return isSetField(field);
	}

	public boolean isSetSecuritySettlAgentName() {
		return isSetField(176);
	}

	public void set(quickfix.field.SecuritySettlAgentCode value) {
		setField(value);
	}

	public quickfix.field.SecuritySettlAgentCode get(quickfix.field.SecuritySettlAgentCode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecuritySettlAgentCode getSecuritySettlAgentCode() throws FieldNotFound {
		return get(new quickfix.field.SecuritySettlAgentCode());
	}

	public boolean isSet(quickfix.field.SecuritySettlAgentCode field) {
		return isSetField(field);
	}

	public boolean isSetSecuritySettlAgentCode() {
		return isSetField(177);
	}

	public void set(quickfix.field.SecuritySettlAgentAcctNum value) {
		setField(value);
	}

	public quickfix.field.SecuritySettlAgentAcctNum get(quickfix.field.SecuritySettlAgentAcctNum value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecuritySettlAgentAcctNum getSecuritySettlAgentAcctNum() throws FieldNotFound {
		return get(new quickfix.field.SecuritySettlAgentAcctNum());
	}

	public boolean isSet(quickfix.field.SecuritySettlAgentAcctNum field) {
		return isSetField(field);
	}

	public boolean isSetSecuritySettlAgentAcctNum() {
		return isSetField(178);
	}

	public void set(quickfix.field.SecuritySettlAgentAcctName value) {
		setField(value);
	}

	public quickfix.field.SecuritySettlAgentAcctName get(quickfix.field.SecuritySettlAgentAcctName value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecuritySettlAgentAcctName getSecuritySettlAgentAcctName() throws FieldNotFound {
		return get(new quickfix.field.SecuritySettlAgentAcctName());
	}

	public boolean isSet(quickfix.field.SecuritySettlAgentAcctName field) {
		return isSetField(field);
	}

	public boolean isSetSecuritySettlAgentAcctName() {
		return isSetField(179);
	}

	public void set(quickfix.field.SecuritySettlAgentContactName value) {
		setField(value);
	}

	public quickfix.field.SecuritySettlAgentContactName get(quickfix.field.SecuritySettlAgentContactName value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecuritySettlAgentContactName getSecuritySettlAgentContactName() throws FieldNotFound {
		return get(new quickfix.field.SecuritySettlAgentContactName());
	}

	public boolean isSet(quickfix.field.SecuritySettlAgentContactName field) {
		return isSetField(field);
	}

	public boolean isSetSecuritySettlAgentContactName() {
		return isSetField(180);
	}

	public void set(quickfix.field.SecuritySettlAgentContactPhone value) {
		setField(value);
	}

	public quickfix.field.SecuritySettlAgentContactPhone get(quickfix.field.SecuritySettlAgentContactPhone value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecuritySettlAgentContactPhone getSecuritySettlAgentContactPhone() throws FieldNotFound {
		return get(new quickfix.field.SecuritySettlAgentContactPhone());
	}

	public boolean isSet(quickfix.field.SecuritySettlAgentContactPhone field) {
		return isSetField(field);
	}

	public boolean isSetSecuritySettlAgentContactPhone() {
		return isSetField(181);
	}

	public void set(quickfix.field.CashSettlAgentName value) {
		setField(value);
	}

	public quickfix.field.CashSettlAgentName get(quickfix.field.CashSettlAgentName value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CashSettlAgentName getCashSettlAgentName() throws FieldNotFound {
		return get(new quickfix.field.CashSettlAgentName());
	}

	public boolean isSet(quickfix.field.CashSettlAgentName field) {
		return isSetField(field);
	}

	public boolean isSetCashSettlAgentName() {
		return isSetField(182);
	}

	public void set(quickfix.field.CashSettlAgentCode value) {
		setField(value);
	}

	public quickfix.field.CashSettlAgentCode get(quickfix.field.CashSettlAgentCode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CashSettlAgentCode getCashSettlAgentCode() throws FieldNotFound {
		return get(new quickfix.field.CashSettlAgentCode());
	}

	public boolean isSet(quickfix.field.CashSettlAgentCode field) {
		return isSetField(field);
	}

	public boolean isSetCashSettlAgentCode() {
		return isSetField(183);
	}

	public void set(quickfix.field.CashSettlAgentAcctNum value) {
		setField(value);
	}

	public quickfix.field.CashSettlAgentAcctNum get(quickfix.field.CashSettlAgentAcctNum value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CashSettlAgentAcctNum getCashSettlAgentAcctNum() throws FieldNotFound {
		return get(new quickfix.field.CashSettlAgentAcctNum());
	}

	public boolean isSet(quickfix.field.CashSettlAgentAcctNum field) {
		return isSetField(field);
	}

	public boolean isSetCashSettlAgentAcctNum() {
		return isSetField(184);
	}

	public void set(quickfix.field.CashSettlAgentAcctName value) {
		setField(value);
	}

	public quickfix.field.CashSettlAgentAcctName get(quickfix.field.CashSettlAgentAcctName value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CashSettlAgentAcctName getCashSettlAgentAcctName() throws FieldNotFound {
		return get(new quickfix.field.CashSettlAgentAcctName());
	}

	public boolean isSet(quickfix.field.CashSettlAgentAcctName field) {
		return isSetField(field);
	}

	public boolean isSetCashSettlAgentAcctName() {
		return isSetField(185);
	}

	public void set(quickfix.field.CashSettlAgentContactName value) {
		setField(value);
	}

	public quickfix.field.CashSettlAgentContactName get(quickfix.field.CashSettlAgentContactName value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CashSettlAgentContactName getCashSettlAgentContactName() throws FieldNotFound {
		return get(new quickfix.field.CashSettlAgentContactName());
	}

	public boolean isSet(quickfix.field.CashSettlAgentContactName field) {
		return isSetField(field);
	}

	public boolean isSetCashSettlAgentContactName() {
		return isSetField(186);
	}

	public void set(quickfix.field.CashSettlAgentContactPhone value) {
		setField(value);
	}

	public quickfix.field.CashSettlAgentContactPhone get(quickfix.field.CashSettlAgentContactPhone value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CashSettlAgentContactPhone getCashSettlAgentContactPhone() throws FieldNotFound {
		return get(new quickfix.field.CashSettlAgentContactPhone());
	}

	public boolean isSet(quickfix.field.CashSettlAgentContactPhone field) {
		return isSetField(field);
	}

	public boolean isSetCashSettlAgentContactPhone() {
		return isSetField(187);
	}

	public void set(quickfix.field.PaymentMethod value) {
		setField(value);
	}

	public quickfix.field.PaymentMethod get(quickfix.field.PaymentMethod value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PaymentMethod getPaymentMethod() throws FieldNotFound {
		return get(new quickfix.field.PaymentMethod());
	}

	public boolean isSet(quickfix.field.PaymentMethod field) {
		return isSetField(field);
	}

	public boolean isSetPaymentMethod() {
		return isSetField(492);
	}

	public void set(quickfix.field.PaymentRef value) {
		setField(value);
	}

	public quickfix.field.PaymentRef get(quickfix.field.PaymentRef value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PaymentRef getPaymentRef() throws FieldNotFound {
		return get(new quickfix.field.PaymentRef());
	}

	public boolean isSet(quickfix.field.PaymentRef field) {
		return isSetField(field);
	}

	public boolean isSetPaymentRef() {
		return isSetField(476);
	}

	public void set(quickfix.field.CardHolderName value) {
		setField(value);
	}

	public quickfix.field.CardHolderName get(quickfix.field.CardHolderName value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CardHolderName getCardHolderName() throws FieldNotFound {
		return get(new quickfix.field.CardHolderName());
	}

	public boolean isSet(quickfix.field.CardHolderName field) {
		return isSetField(field);
	}

	public boolean isSetCardHolderName() {
		return isSetField(488);
	}

	public void set(quickfix.field.CardNumber value) {
		setField(value);
	}

	public quickfix.field.CardNumber get(quickfix.field.CardNumber value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CardNumber getCardNumber() throws FieldNotFound {
		return get(new quickfix.field.CardNumber());
	}

	public boolean isSet(quickfix.field.CardNumber field) {
		return isSetField(field);
	}

	public boolean isSetCardNumber() {
		return isSetField(489);
	}

	public void set(quickfix.field.CardStartDate value) {
		setField(value);
	}

	public quickfix.field.CardStartDate get(quickfix.field.CardStartDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CardStartDate getCardStartDate() throws FieldNotFound {
		return get(new quickfix.field.CardStartDate());
	}

	public boolean isSet(quickfix.field.CardStartDate field) {
		return isSetField(field);
	}

	public boolean isSetCardStartDate() {
		return isSetField(503);
	}

	public void set(quickfix.field.CardExpDate value) {
		setField(value);
	}

	public quickfix.field.CardExpDate get(quickfix.field.CardExpDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CardExpDate getCardExpDate() throws FieldNotFound {
		return get(new quickfix.field.CardExpDate());
	}

	public boolean isSet(quickfix.field.CardExpDate field) {
		return isSetField(field);
	}

	public boolean isSetCardExpDate() {
		return isSetField(490);
	}

	public void set(quickfix.field.CardIssNo value) {
		setField(value);
	}

	public quickfix.field.CardIssNo get(quickfix.field.CardIssNo value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CardIssNo getCardIssNo() throws FieldNotFound {
		return get(new quickfix.field.CardIssNo());
	}

	public boolean isSet(quickfix.field.CardIssNo field) {
		return isSetField(field);
	}

	public boolean isSetCardIssNo() {
		return isSetField(491);
	}

	public void set(quickfix.field.PaymentDate value) {
		setField(value);
	}

	public quickfix.field.PaymentDate get(quickfix.field.PaymentDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PaymentDate getPaymentDate() throws FieldNotFound {
		return get(new quickfix.field.PaymentDate());
	}

	public boolean isSet(quickfix.field.PaymentDate field) {
		return isSetField(field);
	}

	public boolean isSetPaymentDate() {
		return isSetField(504);
	}

	public void set(quickfix.field.PaymentRemitterID value) {
		setField(value);
	}

	public quickfix.field.PaymentRemitterID get(quickfix.field.PaymentRemitterID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PaymentRemitterID getPaymentRemitterID() throws FieldNotFound {
		return get(new quickfix.field.PaymentRemitterID());
	}

	public boolean isSet(quickfix.field.PaymentRemitterID field) {
		return isSetField(field);
	}

	public boolean isSetPaymentRemitterID() {
		return isSetField(505);
	}

}
