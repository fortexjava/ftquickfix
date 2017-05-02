
package quickfix.fix50sp1.component;

import quickfix.FieldNotFound;

import quickfix.Group;

public class BaseTradingRules extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = { 1205, 1234, 1306, 1148, 1149, 1150, 827, 562, 1140, 1143, 1144, 1245, 561, 1377, 1378, 423,  };
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = {  };
	protected int[] getGroupFields() { return componentGroups; }
	

	public BaseTradingRules() {
		super();
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

}
