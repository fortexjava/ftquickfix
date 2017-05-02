
package quickfix.fix50sp1.component;

import quickfix.FieldNotFound;

import quickfix.Group;

public class MDFullGrp extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = {  };
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = { 268,  };
	protected int[] getGroupFields() { return componentGroups; }
	

	public MDFullGrp() {
		super();
	}
	
	public void set(quickfix.field.NoMDEntries value) {
		setField(value);
	}

	public quickfix.field.NoMDEntries get(quickfix.field.NoMDEntries value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoMDEntries getNoMDEntries() throws FieldNotFound {
		return get(new quickfix.field.NoMDEntries());
	}

	public boolean isSet(quickfix.field.NoMDEntries field) {
		return isSetField(field);
	}

	public boolean isSetNoMDEntries() {
		return isSetField(268);
	}

	public static class NoMDEntries extends Group {

		static final long serialVersionUID = 20050617;

		public NoMDEntries() {
			super(268, 269,
				new int[] {269, 278, 270, 423, 235, 236, 701, 696, 697, 698, 218, 220, 221, 222, 662, 663, 699, 761, 40, 15, 271, 1177, 1093, 272, 273, 274, 275, 336, 625, 326, 327, 276, 277, 282, 283, 284, 286, 59, 432, 126, 110, 18, 287, 37, 198, 299, 288, 289, 346, 290, 546, 811, 58, 354, 355, 1023, 528, 1024, 332, 333, 1020, 63, 64, 1070, 83, 1048, 1026, 1027, 453,  0 });
		}
		
	public void set(quickfix.field.MDEntryType value) {
		setField(value);
	}

	public quickfix.field.MDEntryType get(quickfix.field.MDEntryType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MDEntryType getMDEntryType() throws FieldNotFound {
		return get(new quickfix.field.MDEntryType());
	}

	public boolean isSet(quickfix.field.MDEntryType field) {
		return isSetField(field);
	}

	public boolean isSetMDEntryType() {
		return isSetField(269);
	}

	public void set(quickfix.field.MDEntryID value) {
		setField(value);
	}

	public quickfix.field.MDEntryID get(quickfix.field.MDEntryID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MDEntryID getMDEntryID() throws FieldNotFound {
		return get(new quickfix.field.MDEntryID());
	}

	public boolean isSet(quickfix.field.MDEntryID field) {
		return isSetField(field);
	}

	public boolean isSetMDEntryID() {
		return isSetField(278);
	}

	public void set(quickfix.field.MDEntryPx value) {
		setField(value);
	}

	public quickfix.field.MDEntryPx get(quickfix.field.MDEntryPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MDEntryPx getMDEntryPx() throws FieldNotFound {
		return get(new quickfix.field.MDEntryPx());
	}

	public boolean isSet(quickfix.field.MDEntryPx field) {
		return isSetField(field);
	}

	public boolean isSetMDEntryPx() {
		return isSetField(270);
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

	public void set(quickfix.fix50sp1.component.YieldData component) {
		setComponent(component);
	}

	public quickfix.fix50sp1.component.YieldData get(quickfix.fix50sp1.component.YieldData component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp1.component.YieldData getYieldData() throws FieldNotFound {
		return get(new quickfix.fix50sp1.component.YieldData());
	}

	public void set(quickfix.field.YieldType value) {
		setField(value);
	}

	public quickfix.field.YieldType get(quickfix.field.YieldType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.YieldType getYieldType() throws FieldNotFound {
		return get(new quickfix.field.YieldType());
	}

	public boolean isSet(quickfix.field.YieldType field) {
		return isSetField(field);
	}

	public boolean isSetYieldType() {
		return isSetField(235);
	}

	public void set(quickfix.field.Yield value) {
		setField(value);
	}

	public quickfix.field.Yield get(quickfix.field.Yield value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Yield getYield() throws FieldNotFound {
		return get(new quickfix.field.Yield());
	}

	public boolean isSet(quickfix.field.Yield field) {
		return isSetField(field);
	}

	public boolean isSetYield() {
		return isSetField(236);
	}

	public void set(quickfix.field.YieldCalcDate value) {
		setField(value);
	}

	public quickfix.field.YieldCalcDate get(quickfix.field.YieldCalcDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.YieldCalcDate getYieldCalcDate() throws FieldNotFound {
		return get(new quickfix.field.YieldCalcDate());
	}

	public boolean isSet(quickfix.field.YieldCalcDate field) {
		return isSetField(field);
	}

	public boolean isSetYieldCalcDate() {
		return isSetField(701);
	}

	public void set(quickfix.field.YieldRedemptionDate value) {
		setField(value);
	}

	public quickfix.field.YieldRedemptionDate get(quickfix.field.YieldRedemptionDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.YieldRedemptionDate getYieldRedemptionDate() throws FieldNotFound {
		return get(new quickfix.field.YieldRedemptionDate());
	}

	public boolean isSet(quickfix.field.YieldRedemptionDate field) {
		return isSetField(field);
	}

	public boolean isSetYieldRedemptionDate() {
		return isSetField(696);
	}

	public void set(quickfix.field.YieldRedemptionPrice value) {
		setField(value);
	}

	public quickfix.field.YieldRedemptionPrice get(quickfix.field.YieldRedemptionPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.YieldRedemptionPrice getYieldRedemptionPrice() throws FieldNotFound {
		return get(new quickfix.field.YieldRedemptionPrice());
	}

	public boolean isSet(quickfix.field.YieldRedemptionPrice field) {
		return isSetField(field);
	}

	public boolean isSetYieldRedemptionPrice() {
		return isSetField(697);
	}

	public void set(quickfix.field.YieldRedemptionPriceType value) {
		setField(value);
	}

	public quickfix.field.YieldRedemptionPriceType get(quickfix.field.YieldRedemptionPriceType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.YieldRedemptionPriceType getYieldRedemptionPriceType() throws FieldNotFound {
		return get(new quickfix.field.YieldRedemptionPriceType());
	}

	public boolean isSet(quickfix.field.YieldRedemptionPriceType field) {
		return isSetField(field);
	}

	public boolean isSetYieldRedemptionPriceType() {
		return isSetField(698);
	}

	public void set(quickfix.fix50sp1.component.SpreadOrBenchmarkCurveData component) {
		setComponent(component);
	}

	public quickfix.fix50sp1.component.SpreadOrBenchmarkCurveData get(quickfix.fix50sp1.component.SpreadOrBenchmarkCurveData component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp1.component.SpreadOrBenchmarkCurveData getSpreadOrBenchmarkCurveData() throws FieldNotFound {
		return get(new quickfix.fix50sp1.component.SpreadOrBenchmarkCurveData());
	}

	public void set(quickfix.field.Spread value) {
		setField(value);
	}

	public quickfix.field.Spread get(quickfix.field.Spread value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Spread getSpread() throws FieldNotFound {
		return get(new quickfix.field.Spread());
	}

	public boolean isSet(quickfix.field.Spread field) {
		return isSetField(field);
	}

	public boolean isSetSpread() {
		return isSetField(218);
	}

	public void set(quickfix.field.BenchmarkCurveCurrency value) {
		setField(value);
	}

	public quickfix.field.BenchmarkCurveCurrency get(quickfix.field.BenchmarkCurveCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.BenchmarkCurveCurrency getBenchmarkCurveCurrency() throws FieldNotFound {
		return get(new quickfix.field.BenchmarkCurveCurrency());
	}

	public boolean isSet(quickfix.field.BenchmarkCurveCurrency field) {
		return isSetField(field);
	}

	public boolean isSetBenchmarkCurveCurrency() {
		return isSetField(220);
	}

	public void set(quickfix.field.BenchmarkCurveName value) {
		setField(value);
	}

	public quickfix.field.BenchmarkCurveName get(quickfix.field.BenchmarkCurveName value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.BenchmarkCurveName getBenchmarkCurveName() throws FieldNotFound {
		return get(new quickfix.field.BenchmarkCurveName());
	}

	public boolean isSet(quickfix.field.BenchmarkCurveName field) {
		return isSetField(field);
	}

	public boolean isSetBenchmarkCurveName() {
		return isSetField(221);
	}

	public void set(quickfix.field.BenchmarkCurvePoint value) {
		setField(value);
	}

	public quickfix.field.BenchmarkCurvePoint get(quickfix.field.BenchmarkCurvePoint value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.BenchmarkCurvePoint getBenchmarkCurvePoint() throws FieldNotFound {
		return get(new quickfix.field.BenchmarkCurvePoint());
	}

	public boolean isSet(quickfix.field.BenchmarkCurvePoint field) {
		return isSetField(field);
	}

	public boolean isSetBenchmarkCurvePoint() {
		return isSetField(222);
	}

	public void set(quickfix.field.BenchmarkPrice value) {
		setField(value);
	}

	public quickfix.field.BenchmarkPrice get(quickfix.field.BenchmarkPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.BenchmarkPrice getBenchmarkPrice() throws FieldNotFound {
		return get(new quickfix.field.BenchmarkPrice());
	}

	public boolean isSet(quickfix.field.BenchmarkPrice field) {
		return isSetField(field);
	}

	public boolean isSetBenchmarkPrice() {
		return isSetField(662);
	}

	public void set(quickfix.field.BenchmarkPriceType value) {
		setField(value);
	}

	public quickfix.field.BenchmarkPriceType get(quickfix.field.BenchmarkPriceType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.BenchmarkPriceType getBenchmarkPriceType() throws FieldNotFound {
		return get(new quickfix.field.BenchmarkPriceType());
	}

	public boolean isSet(quickfix.field.BenchmarkPriceType field) {
		return isSetField(field);
	}

	public boolean isSetBenchmarkPriceType() {
		return isSetField(663);
	}

	public void set(quickfix.field.BenchmarkSecurityID value) {
		setField(value);
	}

	public quickfix.field.BenchmarkSecurityID get(quickfix.field.BenchmarkSecurityID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.BenchmarkSecurityID getBenchmarkSecurityID() throws FieldNotFound {
		return get(new quickfix.field.BenchmarkSecurityID());
	}

	public boolean isSet(quickfix.field.BenchmarkSecurityID field) {
		return isSetField(field);
	}

	public boolean isSetBenchmarkSecurityID() {
		return isSetField(699);
	}

	public void set(quickfix.field.BenchmarkSecurityIDSource value) {
		setField(value);
	}

	public quickfix.field.BenchmarkSecurityIDSource get(quickfix.field.BenchmarkSecurityIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.BenchmarkSecurityIDSource getBenchmarkSecurityIDSource() throws FieldNotFound {
		return get(new quickfix.field.BenchmarkSecurityIDSource());
	}

	public boolean isSet(quickfix.field.BenchmarkSecurityIDSource field) {
		return isSetField(field);
	}

	public boolean isSetBenchmarkSecurityIDSource() {
		return isSetField(761);
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

	public void set(quickfix.field.MDEntrySize value) {
		setField(value);
	}

	public quickfix.field.MDEntrySize get(quickfix.field.MDEntrySize value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MDEntrySize getMDEntrySize() throws FieldNotFound {
		return get(new quickfix.field.MDEntrySize());
	}

	public boolean isSet(quickfix.field.MDEntrySize field) {
		return isSetField(field);
	}

	public boolean isSetMDEntrySize() {
		return isSetField(271);
	}

	public void set(quickfix.fix50sp1.component.SecSizesGrp component) {
		setComponent(component);
	}

	public quickfix.fix50sp1.component.SecSizesGrp get(quickfix.fix50sp1.component.SecSizesGrp component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp1.component.SecSizesGrp getSecSizesGrp() throws FieldNotFound {
		return get(new quickfix.fix50sp1.component.SecSizesGrp());
	}

	public void set(quickfix.field.NoOfSecSizes value) {
		setField(value);
	}

	public quickfix.field.NoOfSecSizes get(quickfix.field.NoOfSecSizes value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoOfSecSizes getNoOfSecSizes() throws FieldNotFound {
		return get(new quickfix.field.NoOfSecSizes());
	}

	public boolean isSet(quickfix.field.NoOfSecSizes field) {
		return isSetField(field);
	}

	public boolean isSetNoOfSecSizes() {
		return isSetField(1177);
	}

	public static class NoOfSecSizes extends Group {

		static final long serialVersionUID = 20050617;

		public NoOfSecSizes() {
			super(1177, 1178,
				new int[] {1178, 1179,  0 });
		}
		
	public void set(quickfix.field.MDSecSizeType value) {
		setField(value);
	}

	public quickfix.field.MDSecSizeType get(quickfix.field.MDSecSizeType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MDSecSizeType getMDSecSizeType() throws FieldNotFound {
		return get(new quickfix.field.MDSecSizeType());
	}

	public boolean isSet(quickfix.field.MDSecSizeType field) {
		return isSetField(field);
	}

	public boolean isSetMDSecSizeType() {
		return isSetField(1178);
	}

	public void set(quickfix.field.MDSecSize value) {
		setField(value);
	}

	public quickfix.field.MDSecSize get(quickfix.field.MDSecSize value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MDSecSize getMDSecSize() throws FieldNotFound {
		return get(new quickfix.field.MDSecSize());
	}

	public boolean isSet(quickfix.field.MDSecSize field) {
		return isSetField(field);
	}

	public boolean isSetMDSecSize() {
		return isSetField(1179);
	}

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

	public void set(quickfix.field.MDEntryDate value) {
		setField(value);
	}

	public quickfix.field.MDEntryDate get(quickfix.field.MDEntryDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MDEntryDate getMDEntryDate() throws FieldNotFound {
		return get(new quickfix.field.MDEntryDate());
	}

	public boolean isSet(quickfix.field.MDEntryDate field) {
		return isSetField(field);
	}

	public boolean isSetMDEntryDate() {
		return isSetField(272);
	}

	public void set(quickfix.field.MDEntryTime value) {
		setField(value);
	}

	public quickfix.field.MDEntryTime get(quickfix.field.MDEntryTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MDEntryTime getMDEntryTime() throws FieldNotFound {
		return get(new quickfix.field.MDEntryTime());
	}

	public boolean isSet(quickfix.field.MDEntryTime field) {
		return isSetField(field);
	}

	public boolean isSetMDEntryTime() {
		return isSetField(273);
	}

	public void set(quickfix.field.TickDirection value) {
		setField(value);
	}

	public quickfix.field.TickDirection get(quickfix.field.TickDirection value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TickDirection getTickDirection() throws FieldNotFound {
		return get(new quickfix.field.TickDirection());
	}

	public boolean isSet(quickfix.field.TickDirection field) {
		return isSetField(field);
	}

	public boolean isSetTickDirection() {
		return isSetField(274);
	}

	public void set(quickfix.field.MDMkt value) {
		setField(value);
	}

	public quickfix.field.MDMkt get(quickfix.field.MDMkt value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MDMkt getMDMkt() throws FieldNotFound {
		return get(new quickfix.field.MDMkt());
	}

	public boolean isSet(quickfix.field.MDMkt field) {
		return isSetField(field);
	}

	public boolean isSetMDMkt() {
		return isSetField(275);
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

	public void set(quickfix.field.SecurityTradingStatus value) {
		setField(value);
	}

	public quickfix.field.SecurityTradingStatus get(quickfix.field.SecurityTradingStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecurityTradingStatus getSecurityTradingStatus() throws FieldNotFound {
		return get(new quickfix.field.SecurityTradingStatus());
	}

	public boolean isSet(quickfix.field.SecurityTradingStatus field) {
		return isSetField(field);
	}

	public boolean isSetSecurityTradingStatus() {
		return isSetField(326);
	}

	public void set(quickfix.field.HaltReason value) {
		setField(value);
	}

	public quickfix.field.HaltReason get(quickfix.field.HaltReason value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.HaltReason getHaltReason() throws FieldNotFound {
		return get(new quickfix.field.HaltReason());
	}

	public boolean isSet(quickfix.field.HaltReason field) {
		return isSetField(field);
	}

	public boolean isSetHaltReason() {
		return isSetField(327);
	}

	public void set(quickfix.field.QuoteCondition value) {
		setField(value);
	}

	public quickfix.field.QuoteCondition get(quickfix.field.QuoteCondition value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.QuoteCondition getQuoteCondition() throws FieldNotFound {
		return get(new quickfix.field.QuoteCondition());
	}

	public boolean isSet(quickfix.field.QuoteCondition field) {
		return isSetField(field);
	}

	public boolean isSetQuoteCondition() {
		return isSetField(276);
	}

	public void set(quickfix.field.TradeCondition value) {
		setField(value);
	}

	public quickfix.field.TradeCondition get(quickfix.field.TradeCondition value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TradeCondition getTradeCondition() throws FieldNotFound {
		return get(new quickfix.field.TradeCondition());
	}

	public boolean isSet(quickfix.field.TradeCondition field) {
		return isSetField(field);
	}

	public boolean isSetTradeCondition() {
		return isSetField(277);
	}

	public void set(quickfix.field.MDEntryOriginator value) {
		setField(value);
	}

	public quickfix.field.MDEntryOriginator get(quickfix.field.MDEntryOriginator value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MDEntryOriginator getMDEntryOriginator() throws FieldNotFound {
		return get(new quickfix.field.MDEntryOriginator());
	}

	public boolean isSet(quickfix.field.MDEntryOriginator field) {
		return isSetField(field);
	}

	public boolean isSetMDEntryOriginator() {
		return isSetField(282);
	}

	public void set(quickfix.field.LocationID value) {
		setField(value);
	}

	public quickfix.field.LocationID get(quickfix.field.LocationID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LocationID getLocationID() throws FieldNotFound {
		return get(new quickfix.field.LocationID());
	}

	public boolean isSet(quickfix.field.LocationID field) {
		return isSetField(field);
	}

	public boolean isSetLocationID() {
		return isSetField(283);
	}

	public void set(quickfix.field.DeskID value) {
		setField(value);
	}

	public quickfix.field.DeskID get(quickfix.field.DeskID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DeskID getDeskID() throws FieldNotFound {
		return get(new quickfix.field.DeskID());
	}

	public boolean isSet(quickfix.field.DeskID field) {
		return isSetField(field);
	}

	public boolean isSetDeskID() {
		return isSetField(284);
	}

	public void set(quickfix.field.OpenCloseSettlFlag value) {
		setField(value);
	}

	public quickfix.field.OpenCloseSettlFlag get(quickfix.field.OpenCloseSettlFlag value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OpenCloseSettlFlag getOpenCloseSettlFlag() throws FieldNotFound {
		return get(new quickfix.field.OpenCloseSettlFlag());
	}

	public boolean isSet(quickfix.field.OpenCloseSettlFlag field) {
		return isSetField(field);
	}

	public boolean isSetOpenCloseSettlFlag() {
		return isSetField(286);
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

	public void set(quickfix.field.SellerDays value) {
		setField(value);
	}

	public quickfix.field.SellerDays get(quickfix.field.SellerDays value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SellerDays getSellerDays() throws FieldNotFound {
		return get(new quickfix.field.SellerDays());
	}

	public boolean isSet(quickfix.field.SellerDays field) {
		return isSetField(field);
	}

	public boolean isSetSellerDays() {
		return isSetField(287);
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

	public void set(quickfix.field.QuoteEntryID value) {
		setField(value);
	}

	public quickfix.field.QuoteEntryID get(quickfix.field.QuoteEntryID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.QuoteEntryID getQuoteEntryID() throws FieldNotFound {
		return get(new quickfix.field.QuoteEntryID());
	}

	public boolean isSet(quickfix.field.QuoteEntryID field) {
		return isSetField(field);
	}

	public boolean isSetQuoteEntryID() {
		return isSetField(299);
	}

	public void set(quickfix.field.MDEntryBuyer value) {
		setField(value);
	}

	public quickfix.field.MDEntryBuyer get(quickfix.field.MDEntryBuyer value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MDEntryBuyer getMDEntryBuyer() throws FieldNotFound {
		return get(new quickfix.field.MDEntryBuyer());
	}

	public boolean isSet(quickfix.field.MDEntryBuyer field) {
		return isSetField(field);
	}

	public boolean isSetMDEntryBuyer() {
		return isSetField(288);
	}

	public void set(quickfix.field.MDEntrySeller value) {
		setField(value);
	}

	public quickfix.field.MDEntrySeller get(quickfix.field.MDEntrySeller value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MDEntrySeller getMDEntrySeller() throws FieldNotFound {
		return get(new quickfix.field.MDEntrySeller());
	}

	public boolean isSet(quickfix.field.MDEntrySeller field) {
		return isSetField(field);
	}

	public boolean isSetMDEntrySeller() {
		return isSetField(289);
	}

	public void set(quickfix.field.NumberOfOrders value) {
		setField(value);
	}

	public quickfix.field.NumberOfOrders get(quickfix.field.NumberOfOrders value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NumberOfOrders getNumberOfOrders() throws FieldNotFound {
		return get(new quickfix.field.NumberOfOrders());
	}

	public boolean isSet(quickfix.field.NumberOfOrders field) {
		return isSetField(field);
	}

	public boolean isSetNumberOfOrders() {
		return isSetField(346);
	}

	public void set(quickfix.field.MDEntryPositionNo value) {
		setField(value);
	}

	public quickfix.field.MDEntryPositionNo get(quickfix.field.MDEntryPositionNo value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MDEntryPositionNo getMDEntryPositionNo() throws FieldNotFound {
		return get(new quickfix.field.MDEntryPositionNo());
	}

	public boolean isSet(quickfix.field.MDEntryPositionNo field) {
		return isSetField(field);
	}

	public boolean isSetMDEntryPositionNo() {
		return isSetField(290);
	}

	public void set(quickfix.field.Scope value) {
		setField(value);
	}

	public quickfix.field.Scope get(quickfix.field.Scope value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Scope getScope() throws FieldNotFound {
		return get(new quickfix.field.Scope());
	}

	public boolean isSet(quickfix.field.Scope field) {
		return isSetField(field);
	}

	public boolean isSetScope() {
		return isSetField(546);
	}

	public void set(quickfix.field.PriceDelta value) {
		setField(value);
	}

	public quickfix.field.PriceDelta get(quickfix.field.PriceDelta value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PriceDelta getPriceDelta() throws FieldNotFound {
		return get(new quickfix.field.PriceDelta());
	}

	public boolean isSet(quickfix.field.PriceDelta field) {
		return isSetField(field);
	}

	public boolean isSetPriceDelta() {
		return isSetField(811);
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

	public void set(quickfix.field.MDPriceLevel value) {
		setField(value);
	}

	public quickfix.field.MDPriceLevel get(quickfix.field.MDPriceLevel value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MDPriceLevel getMDPriceLevel() throws FieldNotFound {
		return get(new quickfix.field.MDPriceLevel());
	}

	public boolean isSet(quickfix.field.MDPriceLevel field) {
		return isSetField(field);
	}

	public boolean isSetMDPriceLevel() {
		return isSetField(1023);
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

	public void set(quickfix.field.MDOriginType value) {
		setField(value);
	}

	public quickfix.field.MDOriginType get(quickfix.field.MDOriginType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MDOriginType getMDOriginType() throws FieldNotFound {
		return get(new quickfix.field.MDOriginType());
	}

	public boolean isSet(quickfix.field.MDOriginType field) {
		return isSetField(field);
	}

	public boolean isSetMDOriginType() {
		return isSetField(1024);
	}

	public void set(quickfix.field.HighPx value) {
		setField(value);
	}

	public quickfix.field.HighPx get(quickfix.field.HighPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.HighPx getHighPx() throws FieldNotFound {
		return get(new quickfix.field.HighPx());
	}

	public boolean isSet(quickfix.field.HighPx field) {
		return isSetField(field);
	}

	public boolean isSetHighPx() {
		return isSetField(332);
	}

	public void set(quickfix.field.LowPx value) {
		setField(value);
	}

	public quickfix.field.LowPx get(quickfix.field.LowPx value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LowPx getLowPx() throws FieldNotFound {
		return get(new quickfix.field.LowPx());
	}

	public boolean isSet(quickfix.field.LowPx field) {
		return isSetField(field);
	}

	public boolean isSetLowPx() {
		return isSetField(333);
	}

	public void set(quickfix.field.TradeVolume value) {
		setField(value);
	}

	public quickfix.field.TradeVolume get(quickfix.field.TradeVolume value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TradeVolume getTradeVolume() throws FieldNotFound {
		return get(new quickfix.field.TradeVolume());
	}

	public boolean isSet(quickfix.field.TradeVolume field) {
		return isSetField(field);
	}

	public boolean isSetTradeVolume() {
		return isSetField(1020);
	}

	public void set(quickfix.field.SettlType value) {
		setField(value);
	}

	public quickfix.field.SettlType get(quickfix.field.SettlType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SettlType getSettlType() throws FieldNotFound {
		return get(new quickfix.field.SettlType());
	}

	public boolean isSet(quickfix.field.SettlType field) {
		return isSetField(field);
	}

	public boolean isSetSettlType() {
		return isSetField(63);
	}

	public void set(quickfix.field.SettlDate value) {
		setField(value);
	}

	public quickfix.field.SettlDate get(quickfix.field.SettlDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SettlDate getSettlDate() throws FieldNotFound {
		return get(new quickfix.field.SettlDate());
	}

	public boolean isSet(quickfix.field.SettlDate field) {
		return isSetField(field);
	}

	public boolean isSetSettlDate() {
		return isSetField(64);
	}

	public void set(quickfix.field.MDQuoteType value) {
		setField(value);
	}

	public quickfix.field.MDQuoteType get(quickfix.field.MDQuoteType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MDQuoteType getMDQuoteType() throws FieldNotFound {
		return get(new quickfix.field.MDQuoteType());
	}

	public boolean isSet(quickfix.field.MDQuoteType field) {
		return isSetField(field);
	}

	public boolean isSetMDQuoteType() {
		return isSetField(1070);
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

	public void set(quickfix.field.DealingCapacity value) {
		setField(value);
	}

	public quickfix.field.DealingCapacity get(quickfix.field.DealingCapacity value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DealingCapacity getDealingCapacity() throws FieldNotFound {
		return get(new quickfix.field.DealingCapacity());
	}

	public boolean isSet(quickfix.field.DealingCapacity field) {
		return isSetField(field);
	}

	public boolean isSetDealingCapacity() {
		return isSetField(1048);
	}

	public void set(quickfix.field.MDEntrySpotRate value) {
		setField(value);
	}

	public quickfix.field.MDEntrySpotRate get(quickfix.field.MDEntrySpotRate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MDEntrySpotRate getMDEntrySpotRate() throws FieldNotFound {
		return get(new quickfix.field.MDEntrySpotRate());
	}

	public boolean isSet(quickfix.field.MDEntrySpotRate field) {
		return isSetField(field);
	}

	public boolean isSetMDEntrySpotRate() {
		return isSetField(1026);
	}

	public void set(quickfix.field.MDEntryForwardPoints value) {
		setField(value);
	}

	public quickfix.field.MDEntryForwardPoints get(quickfix.field.MDEntryForwardPoints value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MDEntryForwardPoints getMDEntryForwardPoints() throws FieldNotFound {
		return get(new quickfix.field.MDEntryForwardPoints());
	}

	public boolean isSet(quickfix.field.MDEntryForwardPoints field) {
		return isSetField(field);
	}

	public boolean isSetMDEntryForwardPoints() {
		return isSetField(1027);
	}

	public void set(quickfix.fix50sp1.component.Parties component) {
		setComponent(component);
	}

	public quickfix.fix50sp1.component.Parties get(quickfix.fix50sp1.component.Parties component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp1.component.Parties getParties() throws FieldNotFound {
		return get(new quickfix.fix50sp1.component.Parties());
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

	public void set(quickfix.fix50sp1.component.PtysSubGrp component) {
		setComponent(component);
	}

	public quickfix.fix50sp1.component.PtysSubGrp get(quickfix.fix50sp1.component.PtysSubGrp component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp1.component.PtysSubGrp getPtysSubGrp() throws FieldNotFound {
		return get(new quickfix.fix50sp1.component.PtysSubGrp());
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

	}

}
