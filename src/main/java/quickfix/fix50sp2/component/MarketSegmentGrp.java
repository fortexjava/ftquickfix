
package quickfix.fix50sp2.component;

import quickfix.FieldNotFound;

import quickfix.Group;

public class MarketSegmentGrp extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = {  };
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = { 1310,  };
	protected int[] getGroupFields() { return componentGroups; }
	

	public MarketSegmentGrp() {
		super();
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
