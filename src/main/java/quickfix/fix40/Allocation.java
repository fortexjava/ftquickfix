
package quickfix.fix40;

import quickfix.FieldNotFound;

import quickfix.Group;

public class Allocation extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "J";
	

	public Allocation() {
		super();
		getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
	}
	
	public Allocation(quickfix.field.AllocID allocID, quickfix.field.AllocTransType allocTransType, quickfix.field.Side side, quickfix.field.Symbol symbol, quickfix.field.Shares shares, quickfix.field.AvgPx avgPx, quickfix.field.TradeDate tradeDate) {
		this();
		setField(allocID);
		setField(allocTransType);
		setField(side);
		setField(symbol);
		setField(shares);
		setField(avgPx);
		setField(tradeDate);
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

	public void set(quickfix.field.AllocTransType value) {
		setField(value);
	}

	public quickfix.field.AllocTransType get(quickfix.field.AllocTransType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AllocTransType getAllocTransType() throws FieldNotFound {
		return get(new quickfix.field.AllocTransType());
	}

	public boolean isSet(quickfix.field.AllocTransType field) {
		return isSetField(field);
	}

	public boolean isSetAllocTransType() {
		return isSetField(71);
	}

	public void set(quickfix.field.RefAllocID value) {
		setField(value);
	}

	public quickfix.field.RefAllocID get(quickfix.field.RefAllocID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RefAllocID getRefAllocID() throws FieldNotFound {
		return get(new quickfix.field.RefAllocID());
	}

	public boolean isSet(quickfix.field.RefAllocID field) {
		return isSetField(field);
	}

	public boolean isSetRefAllocID() {
		return isSetField(72);
	}

	public void set(quickfix.field.NoOrders value) {
		setField(value);
	}

	public quickfix.field.NoOrders get(quickfix.field.NoOrders value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoOrders getNoOrders() throws FieldNotFound {
		return get(new quickfix.field.NoOrders());
	}

	public boolean isSet(quickfix.field.NoOrders field) {
		return isSetField(field);
	}

	public boolean isSetNoOrders() {
		return isSetField(73);
	}

	public static class NoOrders extends Group {

		static final long serialVersionUID = 20050617;

		public NoOrders() {
			super(73, 11,
				new int[] {11, 37, 66, 105,  0 });
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

	public void set(quickfix.field.WaveNo value) {
		setField(value);
	}

	public quickfix.field.WaveNo get(quickfix.field.WaveNo value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.WaveNo getWaveNo() throws FieldNotFound {
		return get(new quickfix.field.WaveNo());
	}

	public boolean isSet(quickfix.field.WaveNo field) {
		return isSetField(field);
	}

	public boolean isSetWaveNo() {
		return isSetField(105);
	}

	}

	public void set(quickfix.field.NoExecs value) {
		setField(value);
	}

	public quickfix.field.NoExecs get(quickfix.field.NoExecs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoExecs getNoExecs() throws FieldNotFound {
		return get(new quickfix.field.NoExecs());
	}

	public boolean isSet(quickfix.field.NoExecs field) {
		return isSetField(field);
	}

	public boolean isSetNoExecs() {
		return isSetField(124);
	}

	public static class NoExecs extends Group {

		static final long serialVersionUID = 20050617;

		public NoExecs() {
			super(124, 17,
				new int[] {17, 32, 31, 30,  0 });
		}
		
	public void set(quickfix.field.ExecID value) {
		setField(value);
	}

	public quickfix.field.ExecID get(quickfix.field.ExecID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ExecID getExecID() throws FieldNotFound {
		return get(new quickfix.field.ExecID());
	}

	public boolean isSet(quickfix.field.ExecID field) {
		return isSetField(field);
	}

	public boolean isSetExecID() {
		return isSetField(17);
	}

	public void set(quickfix.field.LastShares value) {
		setField(value);
	}

	public quickfix.field.LastShares get(quickfix.field.LastShares value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LastShares getLastShares() throws FieldNotFound {
		return get(new quickfix.field.LastShares());
	}

	public boolean isSet(quickfix.field.LastShares field) {
		return isSetField(field);
	}

	public boolean isSetLastShares() {
		return isSetField(32);
	}

	public void set(quickfix.field.LastPx value) {
		setField(value);
	}

	public quickfix.field.LastPx get(quickfix.field.LastPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LastPx getLastPx() throws FieldNotFound {
		return get(new quickfix.field.LastPx());
	}

	public boolean isSet(quickfix.field.LastPx field) {
		return isSetField(field);
	}

	public boolean isSetLastPx() {
		return isSetField(31);
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

	public void set(quickfix.field.IDSource value) {
		setField(value);
	}

	public quickfix.field.IDSource get(quickfix.field.IDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.IDSource getIDSource() throws FieldNotFound {
		return get(new quickfix.field.IDSource());
	}

	public boolean isSet(quickfix.field.IDSource field) {
		return isSetField(field);
	}

	public boolean isSetIDSource() {
		return isSetField(22);
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

	public void set(quickfix.field.Shares value) {
		setField(value);
	}

	public quickfix.field.Shares get(quickfix.field.Shares value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Shares getShares() throws FieldNotFound {
		return get(new quickfix.field.Shares());
	}

	public boolean isSet(quickfix.field.Shares field) {
		return isSetField(field);
	}

	public boolean isSetShares() {
		return isSetField(53);
	}

	public void set(quickfix.field.AvgPx value) {
		setField(value);
	}

	public quickfix.field.AvgPx get(quickfix.field.AvgPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AvgPx getAvgPx() throws FieldNotFound {
		return get(new quickfix.field.AvgPx());
	}

	public boolean isSet(quickfix.field.AvgPx field) {
		return isSetField(field);
	}

	public boolean isSetAvgPx() {
		return isSetField(6);
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

	public void set(quickfix.field.AvgPrxPrecision value) {
		setField(value);
	}

	public quickfix.field.AvgPrxPrecision get(quickfix.field.AvgPrxPrecision value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AvgPrxPrecision getAvgPrxPrecision() throws FieldNotFound {
		return get(new quickfix.field.AvgPrxPrecision());
	}

	public boolean isSet(quickfix.field.AvgPrxPrecision field) {
		return isSetField(field);
	}

	public boolean isSetAvgPrxPrecision() {
		return isSetField(74);
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
				new int[] {137, 138, 139,  0 });
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

	public void set(quickfix.field.OpenClose value) {
		setField(value);
	}

	public quickfix.field.OpenClose get(quickfix.field.OpenClose value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OpenClose getOpenClose() throws FieldNotFound {
		return get(new quickfix.field.OpenClose());
	}

	public boolean isSet(quickfix.field.OpenClose field) {
		return isSetField(field);
	}

	public boolean isSetOpenClose() {
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
				new int[] {79, 80, 81, 76, 109, 12, 13, 85,  0 });
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

	public void set(quickfix.field.AllocShares value) {
		setField(value);
	}

	public quickfix.field.AllocShares get(quickfix.field.AllocShares value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AllocShares getAllocShares() throws FieldNotFound {
		return get(new quickfix.field.AllocShares());
	}

	public boolean isSet(quickfix.field.AllocShares field) {
		return isSetField(field);
	}

	public boolean isSetAllocShares() {
		return isSetField(80);
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

	public void set(quickfix.field.ExecBroker value) {
		setField(value);
	}

	public quickfix.field.ExecBroker get(quickfix.field.ExecBroker value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ExecBroker getExecBroker() throws FieldNotFound {
		return get(new quickfix.field.ExecBroker());
	}

	public boolean isSet(quickfix.field.ExecBroker field) {
		return isSetField(field);
	}

	public boolean isSetExecBroker() {
		return isSetField(76);
	}

	public void set(quickfix.field.ClientID value) {
		setField(value);
	}

	public quickfix.field.ClientID get(quickfix.field.ClientID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ClientID getClientID() throws FieldNotFound {
		return get(new quickfix.field.ClientID());
	}

	public boolean isSet(quickfix.field.ClientID field) {
		return isSetField(field);
	}

	public boolean isSetClientID() {
		return isSetField(109);
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
			super(85, 92,
				new int[] {92, 86,  0 });
		}
		
	public void set(quickfix.field.BrokerOfCredit value) {
		setField(value);
	}

	public quickfix.field.BrokerOfCredit get(quickfix.field.BrokerOfCredit value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.BrokerOfCredit getBrokerOfCredit() throws FieldNotFound {
		return get(new quickfix.field.BrokerOfCredit());
	}

	public boolean isSet(quickfix.field.BrokerOfCredit field) {
		return isSetField(field);
	}

	public boolean isSetBrokerOfCredit() {
		return isSetField(92);
	}

	public void set(quickfix.field.DlvyInst value) {
		setField(value);
	}

	public quickfix.field.DlvyInst get(quickfix.field.DlvyInst value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DlvyInst getDlvyInst() throws FieldNotFound {
		return get(new quickfix.field.DlvyInst());
	}

	public boolean isSet(quickfix.field.DlvyInst field) {
		return isSetField(field);
	}

	public boolean isSetDlvyInst() {
		return isSetField(86);
	}

	}

	}

}
