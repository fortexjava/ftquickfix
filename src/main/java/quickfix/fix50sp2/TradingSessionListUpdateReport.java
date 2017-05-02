
package quickfix.fix50sp2;

import quickfix.FieldNotFound;

import quickfix.Group;

public class TradingSessionListUpdateReport extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "BS";
	

	public TradingSessionListUpdateReport() {
		super();
		getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
	}
	
	public void set(quickfix.fix50sp2.component.ApplicationSequenceControl component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.ApplicationSequenceControl get(quickfix.fix50sp2.component.ApplicationSequenceControl component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.ApplicationSequenceControl getApplicationSequenceControl() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.ApplicationSequenceControl());
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

	public void set(quickfix.field.TradSesReqID value) {
		setField(value);
	}

	public quickfix.field.TradSesReqID get(quickfix.field.TradSesReqID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TradSesReqID getTradSesReqID() throws FieldNotFound {
		return get(new quickfix.field.TradSesReqID());
	}

	public boolean isSet(quickfix.field.TradSesReqID field) {
		return isSetField(field);
	}

	public boolean isSetTradSesReqID() {
		return isSetField(335);
	}

	public void set(quickfix.fix50sp2.component.TrdSessLstGrp component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.TrdSessLstGrp get(quickfix.fix50sp2.component.TrdSessLstGrp component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.TrdSessLstGrp getTrdSessLstGrp() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.TrdSessLstGrp());
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
				new int[] {336, 625, 1327, 207, 1301, 1300, 1326, 338, 339, 325, 340, 567, 341, 342, 343, 344, 345, 387, 1237, 1239, 1232, 1235, 1141, 60, 58, 354, 355,  0 });
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

	public void set(quickfix.field.TradSesUpdateAction value) {
		setField(value);
	}

	public quickfix.field.TradSesUpdateAction get(quickfix.field.TradSesUpdateAction value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TradSesUpdateAction getTradSesUpdateAction() throws FieldNotFound {
		return get(new quickfix.field.TradSesUpdateAction());
	}

	public boolean isSet(quickfix.field.TradSesUpdateAction field) {
		return isSetField(field);
	}

	public boolean isSetTradSesUpdateAction() {
		return isSetField(1327);
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

	public void set(quickfix.field.TradingSessionDesc value) {
		setField(value);
	}

	public quickfix.field.TradingSessionDesc get(quickfix.field.TradingSessionDesc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TradingSessionDesc getTradingSessionDesc() throws FieldNotFound {
		return get(new quickfix.field.TradingSessionDesc());
	}

	public boolean isSet(quickfix.field.TradingSessionDesc field) {
		return isSetField(field);
	}

	public boolean isSetTradingSessionDesc() {
		return isSetField(1326);
	}

	public void set(quickfix.field.TradSesMethod value) {
		setField(value);
	}

	public quickfix.field.TradSesMethod get(quickfix.field.TradSesMethod value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TradSesMethod getTradSesMethod() throws FieldNotFound {
		return get(new quickfix.field.TradSesMethod());
	}

	public boolean isSet(quickfix.field.TradSesMethod field) {
		return isSetField(field);
	}

	public boolean isSetTradSesMethod() {
		return isSetField(338);
	}

	public void set(quickfix.field.TradSesMode value) {
		setField(value);
	}

	public quickfix.field.TradSesMode get(quickfix.field.TradSesMode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TradSesMode getTradSesMode() throws FieldNotFound {
		return get(new quickfix.field.TradSesMode());
	}

	public boolean isSet(quickfix.field.TradSesMode field) {
		return isSetField(field);
	}

	public boolean isSetTradSesMode() {
		return isSetField(339);
	}

	public void set(quickfix.field.UnsolicitedIndicator value) {
		setField(value);
	}

	public quickfix.field.UnsolicitedIndicator get(quickfix.field.UnsolicitedIndicator value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UnsolicitedIndicator getUnsolicitedIndicator() throws FieldNotFound {
		return get(new quickfix.field.UnsolicitedIndicator());
	}

	public boolean isSet(quickfix.field.UnsolicitedIndicator field) {
		return isSetField(field);
	}

	public boolean isSetUnsolicitedIndicator() {
		return isSetField(325);
	}

	public void set(quickfix.field.TradSesStatus value) {
		setField(value);
	}

	public quickfix.field.TradSesStatus get(quickfix.field.TradSesStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TradSesStatus getTradSesStatus() throws FieldNotFound {
		return get(new quickfix.field.TradSesStatus());
	}

	public boolean isSet(quickfix.field.TradSesStatus field) {
		return isSetField(field);
	}

	public boolean isSetTradSesStatus() {
		return isSetField(340);
	}

	public void set(quickfix.field.TradSesStatusRejReason value) {
		setField(value);
	}

	public quickfix.field.TradSesStatusRejReason get(quickfix.field.TradSesStatusRejReason value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TradSesStatusRejReason getTradSesStatusRejReason() throws FieldNotFound {
		return get(new quickfix.field.TradSesStatusRejReason());
	}

	public boolean isSet(quickfix.field.TradSesStatusRejReason field) {
		return isSetField(field);
	}

	public boolean isSetTradSesStatusRejReason() {
		return isSetField(567);
	}

	public void set(quickfix.field.TradSesStartTime value) {
		setField(value);
	}

	public quickfix.field.TradSesStartTime get(quickfix.field.TradSesStartTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TradSesStartTime getTradSesStartTime() throws FieldNotFound {
		return get(new quickfix.field.TradSesStartTime());
	}

	public boolean isSet(quickfix.field.TradSesStartTime field) {
		return isSetField(field);
	}

	public boolean isSetTradSesStartTime() {
		return isSetField(341);
	}

	public void set(quickfix.field.TradSesOpenTime value) {
		setField(value);
	}

	public quickfix.field.TradSesOpenTime get(quickfix.field.TradSesOpenTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TradSesOpenTime getTradSesOpenTime() throws FieldNotFound {
		return get(new quickfix.field.TradSesOpenTime());
	}

	public boolean isSet(quickfix.field.TradSesOpenTime field) {
		return isSetField(field);
	}

	public boolean isSetTradSesOpenTime() {
		return isSetField(342);
	}

	public void set(quickfix.field.TradSesPreCloseTime value) {
		setField(value);
	}

	public quickfix.field.TradSesPreCloseTime get(quickfix.field.TradSesPreCloseTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TradSesPreCloseTime getTradSesPreCloseTime() throws FieldNotFound {
		return get(new quickfix.field.TradSesPreCloseTime());
	}

	public boolean isSet(quickfix.field.TradSesPreCloseTime field) {
		return isSetField(field);
	}

	public boolean isSetTradSesPreCloseTime() {
		return isSetField(343);
	}

	public void set(quickfix.field.TradSesCloseTime value) {
		setField(value);
	}

	public quickfix.field.TradSesCloseTime get(quickfix.field.TradSesCloseTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TradSesCloseTime getTradSesCloseTime() throws FieldNotFound {
		return get(new quickfix.field.TradSesCloseTime());
	}

	public boolean isSet(quickfix.field.TradSesCloseTime field) {
		return isSetField(field);
	}

	public boolean isSetTradSesCloseTime() {
		return isSetField(344);
	}

	public void set(quickfix.field.TradSesEndTime value) {
		setField(value);
	}

	public quickfix.field.TradSesEndTime get(quickfix.field.TradSesEndTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TradSesEndTime getTradSesEndTime() throws FieldNotFound {
		return get(new quickfix.field.TradSesEndTime());
	}

	public boolean isSet(quickfix.field.TradSesEndTime field) {
		return isSetField(field);
	}

	public boolean isSetTradSesEndTime() {
		return isSetField(345);
	}

	public void set(quickfix.field.TotalVolumeTraded value) {
		setField(value);
	}

	public quickfix.field.TotalVolumeTraded get(quickfix.field.TotalVolumeTraded value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TotalVolumeTraded getTotalVolumeTraded() throws FieldNotFound {
		return get(new quickfix.field.TotalVolumeTraded());
	}

	public boolean isSet(quickfix.field.TotalVolumeTraded field) {
		return isSetField(field);
	}

	public boolean isSetTotalVolumeTraded() {
		return isSetField(387);
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

}
