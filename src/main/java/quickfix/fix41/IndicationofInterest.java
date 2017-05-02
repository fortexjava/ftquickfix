
package quickfix.fix41;

import quickfix.FieldNotFound;

import quickfix.Group;

public class IndicationofInterest extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "6";
	

	public IndicationofInterest() {
		super();
		getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
	}
	
	public IndicationofInterest(quickfix.field.IOIID iOIID, quickfix.field.IOITransType iOITransType, quickfix.field.Symbol symbol, quickfix.field.Side side, quickfix.field.IOIShares iOIShares) {
		this();
		setField(iOIID);
		setField(iOITransType);
		setField(symbol);
		setField(side);
		setField(iOIShares);
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

	public void set(quickfix.field.IOITransType value) {
		setField(value);
	}

	public quickfix.field.IOITransType get(quickfix.field.IOITransType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.IOITransType getIOITransType() throws FieldNotFound {
		return get(new quickfix.field.IOITransType());
	}

	public boolean isSet(quickfix.field.IOITransType field) {
		return isSetField(field);
	}

	public boolean isSetIOITransType() {
		return isSetField(28);
	}

	public void set(quickfix.field.IOIRefID value) {
		setField(value);
	}

	public quickfix.field.IOIRefID get(quickfix.field.IOIRefID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.IOIRefID getIOIRefID() throws FieldNotFound {
		return get(new quickfix.field.IOIRefID());
	}

	public boolean isSet(quickfix.field.IOIRefID field) {
		return isSetField(field);
	}

	public boolean isSetIOIRefID() {
		return isSetField(26);
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

	public void set(quickfix.field.MaturityDay value) {
		setField(value);
	}

	public quickfix.field.MaturityDay get(quickfix.field.MaturityDay value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.MaturityDay getMaturityDay() throws FieldNotFound {
		return get(new quickfix.field.MaturityDay());
	}

	public boolean isSet(quickfix.field.MaturityDay field) {
		return isSetField(field);
	}

	public boolean isSetMaturityDay() {
		return isSetField(205);
	}

	public void set(quickfix.field.PutOrCall value) {
		setField(value);
	}

	public quickfix.field.PutOrCall get(quickfix.field.PutOrCall value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.PutOrCall getPutOrCall() throws FieldNotFound {
		return get(new quickfix.field.PutOrCall());
	}

	public boolean isSet(quickfix.field.PutOrCall field) {
		return isSetField(field);
	}

	public boolean isSetPutOrCall() {
		return isSetField(201);
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

	public void set(quickfix.field.IOIShares value) {
		setField(value);
	}

	public quickfix.field.IOIShares get(quickfix.field.IOIShares value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.IOIShares getIOIShares() throws FieldNotFound {
		return get(new quickfix.field.IOIShares());
	}

	public boolean isSet(quickfix.field.IOIShares field) {
		return isSetField(field);
	}

	public boolean isSetIOIShares() {
		return isSetField(27);
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

	public void set(quickfix.field.ValidUntilTime value) {
		setField(value);
	}

	public quickfix.field.ValidUntilTime get(quickfix.field.ValidUntilTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ValidUntilTime getValidUntilTime() throws FieldNotFound {
		return get(new quickfix.field.ValidUntilTime());
	}

	public boolean isSet(quickfix.field.ValidUntilTime field) {
		return isSetField(field);
	}

	public boolean isSetValidUntilTime() {
		return isSetField(62);
	}

	public void set(quickfix.field.IOIQltyInd value) {
		setField(value);
	}

	public quickfix.field.IOIQltyInd get(quickfix.field.IOIQltyInd value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.IOIQltyInd getIOIQltyInd() throws FieldNotFound {
		return get(new quickfix.field.IOIQltyInd());
	}

	public boolean isSet(quickfix.field.IOIQltyInd field) {
		return isSetField(field);
	}

	public boolean isSetIOIQltyInd() {
		return isSetField(25);
	}

	public void set(quickfix.field.IOIOthSvc value) {
		setField(value);
	}

	public quickfix.field.IOIOthSvc get(quickfix.field.IOIOthSvc value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.IOIOthSvc getIOIOthSvc() throws FieldNotFound {
		return get(new quickfix.field.IOIOthSvc());
	}

	public boolean isSet(quickfix.field.IOIOthSvc field) {
		return isSetField(field);
	}

	public boolean isSetIOIOthSvc() {
		return isSetField(24);
	}

	public void set(quickfix.field.IOINaturalFlag value) {
		setField(value);
	}

	public quickfix.field.IOINaturalFlag get(quickfix.field.IOINaturalFlag value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.IOINaturalFlag getIOINaturalFlag() throws FieldNotFound {
		return get(new quickfix.field.IOINaturalFlag());
	}

	public boolean isSet(quickfix.field.IOINaturalFlag field) {
		return isSetField(field);
	}

	public boolean isSetIOINaturalFlag() {
		return isSetField(130);
	}

	public void set(quickfix.field.NoIOIQualifiers value) {
		setField(value);
	}

	public quickfix.field.NoIOIQualifiers get(quickfix.field.NoIOIQualifiers value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoIOIQualifiers getNoIOIQualifiers() throws FieldNotFound {
		return get(new quickfix.field.NoIOIQualifiers());
	}

	public boolean isSet(quickfix.field.NoIOIQualifiers field) {
		return isSetField(field);
	}

	public boolean isSetNoIOIQualifiers() {
		return isSetField(199);
	}

	public static class NoIOIQualifiers extends Group {

		static final long serialVersionUID = 20050617;

		public NoIOIQualifiers() {
			super(199, 104,
				new int[] {104,  0 });
		}
		
	public void set(quickfix.field.IOIQualifier value) {
		setField(value);
	}

	public quickfix.field.IOIQualifier get(quickfix.field.IOIQualifier value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.IOIQualifier getIOIQualifier() throws FieldNotFound {
		return get(new quickfix.field.IOIQualifier());
	}

	public boolean isSet(quickfix.field.IOIQualifier field) {
		return isSetField(field);
	}

	public boolean isSetIOIQualifier() {
		return isSetField(104);
	}

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

	public void set(quickfix.field.URLLink value) {
		setField(value);
	}

	public quickfix.field.URLLink get(quickfix.field.URLLink value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.URLLink getURLLink() throws FieldNotFound {
		return get(new quickfix.field.URLLink());
	}

	public boolean isSet(quickfix.field.URLLink field) {
		return isSetField(field);
	}

	public boolean isSetURLLink() {
		return isSetField(149);
	}

}
