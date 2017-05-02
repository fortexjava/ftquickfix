
package quickfix.fix43;

import quickfix.FieldNotFound;

import quickfix.Group;

public class MultilegOrderCancelReplaceRequest extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "AC";
	

	public MultilegOrderCancelReplaceRequest() {
		super();
		getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
	}
	
	public MultilegOrderCancelReplaceRequest(quickfix.field.OrigClOrdID origClOrdID, quickfix.field.ClOrdID clOrdID, quickfix.field.HandlInst handlInst, quickfix.field.Side side, quickfix.field.TransactTime transactTime, quickfix.field.OrdType ordType) {
		this();
		setField(origClOrdID);
		setField(clOrdID);
		setField(handlInst);
		setField(side);
		setField(transactTime);
		setField(ordType);
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

	public void set(quickfix.field.OrigClOrdID value) {
		setField(value);
	}

	public quickfix.field.OrigClOrdID get(quickfix.field.OrigClOrdID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OrigClOrdID getOrigClOrdID() throws FieldNotFound {
		return get(new quickfix.field.OrigClOrdID());
	}

	public boolean isSet(quickfix.field.OrigClOrdID field) {
		return isSetField(field);
	}

	public boolean isSetOrigClOrdID() {
		return isSetField(41);
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

	public void set(quickfix.field.ClOrdLinkID value) {
		setField(value);
	}

	public quickfix.field.ClOrdLinkID get(quickfix.field.ClOrdLinkID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ClOrdLinkID getClOrdLinkID() throws FieldNotFound {
		return get(new quickfix.field.ClOrdLinkID());
	}

	public boolean isSet(quickfix.field.ClOrdLinkID field) {
		return isSetField(field);
	}

	public boolean isSetClOrdLinkID() {
		return isSetField(583);
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

	public void set(quickfix.field.DayBookingInst value) {
		setField(value);
	}

	public quickfix.field.DayBookingInst get(quickfix.field.DayBookingInst value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DayBookingInst getDayBookingInst() throws FieldNotFound {
		return get(new quickfix.field.DayBookingInst());
	}

	public boolean isSet(quickfix.field.DayBookingInst field) {
		return isSetField(field);
	}

	public boolean isSetDayBookingInst() {
		return isSetField(589);
	}

	public void set(quickfix.field.BookingUnit value) {
		setField(value);
	}

	public quickfix.field.BookingUnit get(quickfix.field.BookingUnit value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.BookingUnit getBookingUnit() throws FieldNotFound {
		return get(new quickfix.field.BookingUnit());
	}

	public boolean isSet(quickfix.field.BookingUnit field) {
		return isSetField(field);
	}

	public boolean isSetBookingUnit() {
		return isSetField(590);
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
				new int[] {79, 467, 80,  0 });
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

	}

	public void set(quickfix.field.SettlmntTyp value) {
		setField(value);
	}

	public quickfix.field.SettlmntTyp get(quickfix.field.SettlmntTyp value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SettlmntTyp getSettlmntTyp() throws FieldNotFound {
		return get(new quickfix.field.SettlmntTyp());
	}

	public boolean isSet(quickfix.field.SettlmntTyp field) {
		return isSetField(field);
	}

	public boolean isSetSettlmntTyp() {
		return isSetField(63);
	}

	public void set(quickfix.field.FutSettDate value) {
		setField(value);
	}

	public quickfix.field.FutSettDate get(quickfix.field.FutSettDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.FutSettDate getFutSettDate() throws FieldNotFound {
		return get(new quickfix.field.FutSettDate());
	}

	public boolean isSet(quickfix.field.FutSettDate field) {
		return isSetField(field);
	}

	public boolean isSetFutSettDate() {
		return isSetField(64);
	}

	public void set(quickfix.field.CashMargin value) {
		setField(value);
	}

	public quickfix.field.CashMargin get(quickfix.field.CashMargin value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CashMargin getCashMargin() throws FieldNotFound {
		return get(new quickfix.field.CashMargin());
	}

	public boolean isSet(quickfix.field.CashMargin field) {
		return isSetField(field);
	}

	public boolean isSetCashMargin() {
		return isSetField(544);
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

	public void set(quickfix.field.HandlInst value) {
		setField(value);
	}

	public quickfix.field.HandlInst get(quickfix.field.HandlInst value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.HandlInst getHandlInst() throws FieldNotFound {
		return get(new quickfix.field.HandlInst());
	}

	public boolean isSet(quickfix.field.HandlInst field) {
		return isSetField(field);
	}

	public boolean isSetHandlInst() {
		return isSetField(21);
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

	public void set(quickfix.field.MinQty value) {
		setField(value);
	}

	public quickfix.field.MinQty get(quickfix.field.MinQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MinQty getMinQty() throws FieldNotFound {
		return get(new quickfix.field.MinQty());
	}

	public boolean isSet(quickfix.field.MinQty field) {
		return isSetField(field);
	}

	public boolean isSetMinQty() {
		return isSetField(110);
	}

	public void set(quickfix.field.MaxFloor value) {
		setField(value);
	}

	public quickfix.field.MaxFloor get(quickfix.field.MaxFloor value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MaxFloor getMaxFloor() throws FieldNotFound {
		return get(new quickfix.field.MaxFloor());
	}

	public boolean isSet(quickfix.field.MaxFloor field) {
		return isSetField(field);
	}

	public boolean isSetMaxFloor() {
		return isSetField(111);
	}

	public void set(quickfix.field.ExDestination value) {
		setField(value);
	}

	public quickfix.field.ExDestination get(quickfix.field.ExDestination value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ExDestination getExDestination() throws FieldNotFound {
		return get(new quickfix.field.ExDestination());
	}

	public boolean isSet(quickfix.field.ExDestination field) {
		return isSetField(field);
	}

	public boolean isSetExDestination() {
		return isSetField(100);
	}

	public void set(quickfix.field.NoTradingSessions value) {
		setField(value);
	}

	public quickfix.field.NoTradingSessions get(quickfix.field.NoTradingSessions value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoTradingSessions getNoTradingSessions() throws FieldNotFound {
		return get(new quickfix.field.NoTradingSessions());
	}

	public boolean isSet(quickfix.field.NoTradingSessions field) {
		return isSetField(field);
	}

	public boolean isSetNoTradingSessions() {
		return isSetField(386);
	}

	public static class NoTradingSessions extends Group {

		static final long serialVersionUID = 20050617;

		public NoTradingSessions() {
			super(386, 336,
				new int[] {336, 625,  0 });
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

	public void set(quickfix.fix43.component.Instrument component) {
		setComponent(component);
	}

	public quickfix.fix43.component.Instrument get(quickfix.fix43.component.Instrument component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix43.component.Instrument getInstrument() throws FieldNotFound {
		return get(new quickfix.fix43.component.Instrument());
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

	public void set(quickfix.field.PrevClosePx value) {
		setField(value);
	}

	public quickfix.field.PrevClosePx get(quickfix.field.PrevClosePx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PrevClosePx getPrevClosePx() throws FieldNotFound {
		return get(new quickfix.field.PrevClosePx());
	}

	public boolean isSet(quickfix.field.PrevClosePx field) {
		return isSetField(field);
	}

	public boolean isSetPrevClosePx() {
		return isSetField(140);
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
				new int[] {600, 601, 602, 603, 604, 607, 608, 609, 610, 611, 248, 249, 250, 251, 252, 253, 257, 599, 596, 597, 598, 254, 612, 613, 614, 615, 616, 617, 618, 619, 620, 621, 622, 623, 624, 564, 565, 539, 654, 566, 587, 588,  0 });
		}
		
	public void set(quickfix.fix43.component.InstrumentLeg component) {
		setComponent(component);
	}

	public quickfix.fix43.component.InstrumentLeg get(quickfix.fix43.component.InstrumentLeg component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix43.component.InstrumentLeg getInstrumentLeg() throws FieldNotFound {
		return get(new quickfix.fix43.component.InstrumentLeg());
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

	public void set(quickfix.fix43.component.NestedParties component) {
		setComponent(component);
	}

	public quickfix.fix43.component.NestedParties get(quickfix.fix43.component.NestedParties component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix43.component.NestedParties getNestedParties() throws FieldNotFound {
		return get(new quickfix.fix43.component.NestedParties());
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
				new int[] {524, 525, 538, 545,  0 });
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

	public void set(quickfix.field.LegSettlmntTyp value) {
		setField(value);
	}

	public quickfix.field.LegSettlmntTyp get(quickfix.field.LegSettlmntTyp value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegSettlmntTyp getLegSettlmntTyp() throws FieldNotFound {
		return get(new quickfix.field.LegSettlmntTyp());
	}

	public boolean isSet(quickfix.field.LegSettlmntTyp field) {
		return isSetField(field);
	}

	public boolean isSetLegSettlmntTyp() {
		return isSetField(587);
	}

	public void set(quickfix.field.LegFutSettDate value) {
		setField(value);
	}

	public quickfix.field.LegFutSettDate get(quickfix.field.LegFutSettDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegFutSettDate getLegFutSettDate() throws FieldNotFound {
		return get(new quickfix.field.LegFutSettDate());
	}

	public boolean isSet(quickfix.field.LegFutSettDate field) {
		return isSetField(field);
	}

	public boolean isSetLegFutSettDate() {
		return isSetField(588);
	}

	}

	public void set(quickfix.field.LocateReqd value) {
		setField(value);
	}

	public quickfix.field.LocateReqd get(quickfix.field.LocateReqd value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LocateReqd getLocateReqd() throws FieldNotFound {
		return get(new quickfix.field.LocateReqd());
	}

	public boolean isSet(quickfix.field.LocateReqd field) {
		return isSetField(field);
	}

	public boolean isSetLocateReqd() {
		return isSetField(114);
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

	public void set(quickfix.field.QuantityType value) {
		setField(value);
	}

	public quickfix.field.QuantityType get(quickfix.field.QuantityType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.QuantityType getQuantityType() throws FieldNotFound {
		return get(new quickfix.field.QuantityType());
	}

	public boolean isSet(quickfix.field.QuantityType field) {
		return isSetField(field);
	}

	public boolean isSetQuantityType() {
		return isSetField(465);
	}

	public void set(quickfix.fix43.component.OrderQtyData component) {
		setComponent(component);
	}

	public quickfix.fix43.component.OrderQtyData get(quickfix.fix43.component.OrderQtyData component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix43.component.OrderQtyData getOrderQtyData() throws FieldNotFound {
		return get(new quickfix.fix43.component.OrderQtyData());
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

	public void set(quickfix.field.IOIID value) {
		setField(value);
	}

	public quickfix.field.IOIID get(quickfix.field.IOIID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.IOIID getIOIID() throws FieldNotFound {
		return get(new quickfix.field.IOIID());
	}

	public boolean isSet(quickfix.field.IOIID field) {
		return isSetField(field);
	}

	public boolean isSetIOIID() {
		return isSetField(23);
	}

	public void set(quickfix.field.QuoteID value) {
		setField(value);
	}

	public quickfix.field.QuoteID get(quickfix.field.QuoteID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.QuoteID getQuoteID() throws FieldNotFound {
		return get(new quickfix.field.QuoteID());
	}

	public boolean isSet(quickfix.field.QuoteID field) {
		return isSetField(field);
	}

	public boolean isSetQuoteID() {
		return isSetField(117);
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

	public void set(quickfix.field.ExpireDate value) {
		setField(value);
	}

	public quickfix.field.ExpireDate get(quickfix.field.ExpireDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ExpireDate getExpireDate() throws FieldNotFound {
		return get(new quickfix.field.ExpireDate());
	}

	public boolean isSet(quickfix.field.ExpireDate field) {
		return isSetField(field);
	}

	public boolean isSetExpireDate() {
		return isSetField(432);
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

	public void set(quickfix.field.GTBookingInst value) {
		setField(value);
	}

	public quickfix.field.GTBookingInst get(quickfix.field.GTBookingInst value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.GTBookingInst getGTBookingInst() throws FieldNotFound {
		return get(new quickfix.field.GTBookingInst());
	}

	public boolean isSet(quickfix.field.GTBookingInst field) {
		return isSetField(field);
	}

	public boolean isSetGTBookingInst() {
		return isSetField(427);
	}

	public void set(quickfix.fix43.component.CommissionData component) {
		setComponent(component);
	}

	public quickfix.fix43.component.CommissionData get(quickfix.fix43.component.CommissionData component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix43.component.CommissionData getCommissionData() throws FieldNotFound {
		return get(new quickfix.fix43.component.CommissionData());
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

	public void set(quickfix.field.ForexReq value) {
		setField(value);
	}

	public quickfix.field.ForexReq get(quickfix.field.ForexReq value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ForexReq getForexReq() throws FieldNotFound {
		return get(new quickfix.field.ForexReq());
	}

	public boolean isSet(quickfix.field.ForexReq field) {
		return isSetField(field);
	}

	public boolean isSetForexReq() {
		return isSetField(121);
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

	public void set(quickfix.field.CoveredOrUncovered value) {
		setField(value);
	}

	public quickfix.field.CoveredOrUncovered get(quickfix.field.CoveredOrUncovered value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CoveredOrUncovered getCoveredOrUncovered() throws FieldNotFound {
		return get(new quickfix.field.CoveredOrUncovered());
	}

	public boolean isSet(quickfix.field.CoveredOrUncovered field) {
		return isSetField(field);
	}

	public boolean isSetCoveredOrUncovered() {
		return isSetField(203);
	}

	public void set(quickfix.field.MaxShow value) {
		setField(value);
	}

	public quickfix.field.MaxShow get(quickfix.field.MaxShow value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MaxShow getMaxShow() throws FieldNotFound {
		return get(new quickfix.field.MaxShow());
	}

	public boolean isSet(quickfix.field.MaxShow field) {
		return isSetField(field);
	}

	public boolean isSetMaxShow() {
		return isSetField(210);
	}

	public void set(quickfix.field.PegDifference value) {
		setField(value);
	}

	public quickfix.field.PegDifference get(quickfix.field.PegDifference value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PegDifference getPegDifference() throws FieldNotFound {
		return get(new quickfix.field.PegDifference());
	}

	public boolean isSet(quickfix.field.PegDifference field) {
		return isSetField(field);
	}

	public boolean isSetPegDifference() {
		return isSetField(211);
	}

	public void set(quickfix.field.DiscretionInst value) {
		setField(value);
	}

	public quickfix.field.DiscretionInst get(quickfix.field.DiscretionInst value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DiscretionInst getDiscretionInst() throws FieldNotFound {
		return get(new quickfix.field.DiscretionInst());
	}

	public boolean isSet(quickfix.field.DiscretionInst field) {
		return isSetField(field);
	}

	public boolean isSetDiscretionInst() {
		return isSetField(388);
	}

	public void set(quickfix.field.DiscretionOffset value) {
		setField(value);
	}

	public quickfix.field.DiscretionOffset get(quickfix.field.DiscretionOffset value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DiscretionOffset getDiscretionOffset() throws FieldNotFound {
		return get(new quickfix.field.DiscretionOffset());
	}

	public boolean isSet(quickfix.field.DiscretionOffset field) {
		return isSetField(field);
	}

	public boolean isSetDiscretionOffset() {
		return isSetField(389);
	}

	public void set(quickfix.field.CancellationRights value) {
		setField(value);
	}

	public quickfix.field.CancellationRights get(quickfix.field.CancellationRights value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CancellationRights getCancellationRights() throws FieldNotFound {
		return get(new quickfix.field.CancellationRights());
	}

	public boolean isSet(quickfix.field.CancellationRights field) {
		return isSetField(field);
	}

	public boolean isSetCancellationRights() {
		return isSetField(480);
	}

	public void set(quickfix.field.MoneyLaunderingStatus value) {
		setField(value);
	}

	public quickfix.field.MoneyLaunderingStatus get(quickfix.field.MoneyLaunderingStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MoneyLaunderingStatus getMoneyLaunderingStatus() throws FieldNotFound {
		return get(new quickfix.field.MoneyLaunderingStatus());
	}

	public boolean isSet(quickfix.field.MoneyLaunderingStatus field) {
		return isSetField(field);
	}

	public boolean isSetMoneyLaunderingStatus() {
		return isSetField(481);
	}

	public void set(quickfix.field.RegistID value) {
		setField(value);
	}

	public quickfix.field.RegistID get(quickfix.field.RegistID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RegistID getRegistID() throws FieldNotFound {
		return get(new quickfix.field.RegistID());
	}

	public boolean isSet(quickfix.field.RegistID field) {
		return isSetField(field);
	}

	public boolean isSetRegistID() {
		return isSetField(513);
	}

	public void set(quickfix.field.Designation value) {
		setField(value);
	}

	public quickfix.field.Designation get(quickfix.field.Designation value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Designation getDesignation() throws FieldNotFound {
		return get(new quickfix.field.Designation());
	}

	public boolean isSet(quickfix.field.Designation field) {
		return isSetField(field);
	}

	public boolean isSetDesignation() {
		return isSetField(494);
	}

	public void set(quickfix.field.MultiLegRptTypeReq value) {
		setField(value);
	}

	public quickfix.field.MultiLegRptTypeReq get(quickfix.field.MultiLegRptTypeReq value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MultiLegRptTypeReq getMultiLegRptTypeReq() throws FieldNotFound {
		return get(new quickfix.field.MultiLegRptTypeReq());
	}

	public boolean isSet(quickfix.field.MultiLegRptTypeReq field) {
		return isSetField(field);
	}

	public boolean isSetMultiLegRptTypeReq() {
		return isSetField(563);
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

}
