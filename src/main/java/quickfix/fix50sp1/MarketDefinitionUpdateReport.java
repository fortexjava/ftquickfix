
package quickfix.fix50sp1;

import quickfix.FieldNotFound;

import quickfix.Group;

public class MarketDefinitionUpdateReport extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "BV";
	

	public MarketDefinitionUpdateReport() {
		super();
		getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
	}
	
	public MarketDefinitionUpdateReport(quickfix.field.MarketReportID marketReportID, quickfix.field.MarketID marketID) {
		this();
		setField(marketReportID);
		setField(marketID);
	}
	
	public void set(quickfix.fix50sp1.component.ApplicationSequenceControl component) {
		setComponent(component);
	}

	public quickfix.fix50sp1.component.ApplicationSequenceControl get(quickfix.fix50sp1.component.ApplicationSequenceControl component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp1.component.ApplicationSequenceControl getApplicationSequenceControl() throws FieldNotFound {
		return get(new quickfix.fix50sp1.component.ApplicationSequenceControl());
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

	public void set(quickfix.field.MarketReportID value) {
		setField(value);
	}

	public quickfix.field.MarketReportID get(quickfix.field.MarketReportID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MarketReportID getMarketReportID() throws FieldNotFound {
		return get(new quickfix.field.MarketReportID());
	}

	public boolean isSet(quickfix.field.MarketReportID field) {
		return isSetField(field);
	}

	public boolean isSetMarketReportID() {
		return isSetField(1394);
	}

	public void set(quickfix.field.MarketReqID value) {
		setField(value);
	}

	public quickfix.field.MarketReqID get(quickfix.field.MarketReqID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MarketReqID getMarketReqID() throws FieldNotFound {
		return get(new quickfix.field.MarketReqID());
	}

	public boolean isSet(quickfix.field.MarketReqID field) {
		return isSetField(field);
	}

	public boolean isSetMarketReqID() {
		return isSetField(1393);
	}

	public void set(quickfix.field.MarketUpdateAction value) {
		setField(value);
	}

	public quickfix.field.MarketUpdateAction get(quickfix.field.MarketUpdateAction value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MarketUpdateAction getMarketUpdateAction() throws FieldNotFound {
		return get(new quickfix.field.MarketUpdateAction());
	}

	public boolean isSet(quickfix.field.MarketUpdateAction field) {
		return isSetField(field);
	}

	public boolean isSetMarketUpdateAction() {
		return isSetField(1395);
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

	public void set(quickfix.field.MarketSegmentDesc value) {
		setField(value);
	}

	public quickfix.field.MarketSegmentDesc get(quickfix.field.MarketSegmentDesc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MarketSegmentDesc getMarketSegmentDesc() throws FieldNotFound {
		return get(new quickfix.field.MarketSegmentDesc());
	}

	public boolean isSet(quickfix.field.MarketSegmentDesc field) {
		return isSetField(field);
	}

	public boolean isSetMarketSegmentDesc() {
		return isSetField(1396);
	}

	public void set(quickfix.field.EncodedMktSegmDescLen value) {
		setField(value);
	}

	public quickfix.field.EncodedMktSegmDescLen get(quickfix.field.EncodedMktSegmDescLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EncodedMktSegmDescLen getEncodedMktSegmDescLen() throws FieldNotFound {
		return get(new quickfix.field.EncodedMktSegmDescLen());
	}

	public boolean isSet(quickfix.field.EncodedMktSegmDescLen field) {
		return isSetField(field);
	}

	public boolean isSetEncodedMktSegmDescLen() {
		return isSetField(1397);
	}

	public void set(quickfix.field.EncodedMktSegmDesc value) {
		setField(value);
	}

	public quickfix.field.EncodedMktSegmDesc get(quickfix.field.EncodedMktSegmDesc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EncodedMktSegmDesc getEncodedMktSegmDesc() throws FieldNotFound {
		return get(new quickfix.field.EncodedMktSegmDesc());
	}

	public boolean isSet(quickfix.field.EncodedMktSegmDesc field) {
		return isSetField(field);
	}

	public boolean isSetEncodedMktSegmDesc() {
		return isSetField(1398);
	}

	public void set(quickfix.field.ParentMktSegmID value) {
		setField(value);
	}

	public quickfix.field.ParentMktSegmID get(quickfix.field.ParentMktSegmID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ParentMktSegmID getParentMktSegmID() throws FieldNotFound {
		return get(new quickfix.field.ParentMktSegmID());
	}

	public boolean isSet(quickfix.field.ParentMktSegmID field) {
		return isSetField(field);
	}

	public boolean isSetParentMktSegmID() {
		return isSetField(1325);
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

	public void set(quickfix.fix50sp1.component.BaseTradingRules component) {
		setComponent(component);
	}

	public quickfix.fix50sp1.component.BaseTradingRules get(quickfix.fix50sp1.component.BaseTradingRules component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp1.component.BaseTradingRules getBaseTradingRules() throws FieldNotFound {
		return get(new quickfix.fix50sp1.component.BaseTradingRules());
	}

	public void set(quickfix.fix50sp1.component.TickRules component) {
		setComponent(component);
	}

	public quickfix.fix50sp1.component.TickRules get(quickfix.fix50sp1.component.TickRules component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp1.component.TickRules getTickRules() throws FieldNotFound {
		return get(new quickfix.fix50sp1.component.TickRules());
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

	public void set(quickfix.fix50sp1.component.LotTypeRules component) {
		setComponent(component);
	}

	public quickfix.fix50sp1.component.LotTypeRules get(quickfix.fix50sp1.component.LotTypeRules component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp1.component.LotTypeRules getLotTypeRules() throws FieldNotFound {
		return get(new quickfix.fix50sp1.component.LotTypeRules());
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

	public void set(quickfix.fix50sp1.component.PriceLimits component) {
		setComponent(component);
	}

	public quickfix.fix50sp1.component.PriceLimits get(quickfix.fix50sp1.component.PriceLimits component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp1.component.PriceLimits getPriceLimits() throws FieldNotFound {
		return get(new quickfix.fix50sp1.component.PriceLimits());
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

	public void set(quickfix.fix50sp1.component.OrdTypeRules component) {
		setComponent(component);
	}

	public quickfix.fix50sp1.component.OrdTypeRules get(quickfix.fix50sp1.component.OrdTypeRules component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp1.component.OrdTypeRules getOrdTypeRules() throws FieldNotFound {
		return get(new quickfix.fix50sp1.component.OrdTypeRules());
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

	public void set(quickfix.fix50sp1.component.TimeInForceRules component) {
		setComponent(component);
	}

	public quickfix.fix50sp1.component.TimeInForceRules get(quickfix.fix50sp1.component.TimeInForceRules component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp1.component.TimeInForceRules getTimeInForceRules() throws FieldNotFound {
		return get(new quickfix.fix50sp1.component.TimeInForceRules());
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

	public void set(quickfix.fix50sp1.component.ExecInstRules component) {
		setComponent(component);
	}

	public quickfix.fix50sp1.component.ExecInstRules get(quickfix.fix50sp1.component.ExecInstRules component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp1.component.ExecInstRules getExecInstRules() throws FieldNotFound {
		return get(new quickfix.fix50sp1.component.ExecInstRules());
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
