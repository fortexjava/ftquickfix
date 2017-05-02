
package quickfix.fix40;

import quickfix.FieldNotFound;


public class DontKnowTrade extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "Q";
	

	public DontKnowTrade() {
		super();
		getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
	}
	
	public DontKnowTrade(quickfix.field.DKReason dKReason, quickfix.field.Symbol symbol, quickfix.field.Side side, quickfix.field.OrderQty orderQty, quickfix.field.LastShares lastShares, quickfix.field.LastPx lastPx) {
		this();
		setField(dKReason);
		setField(symbol);
		setField(side);
		setField(orderQty);
		setField(lastShares);
		setField(lastPx);
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

	public void set(quickfix.field.DKReason value) {
		setField(value);
	}

	public quickfix.field.DKReason get(quickfix.field.DKReason value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DKReason getDKReason() throws FieldNotFound {
		return get(new quickfix.field.DKReason());
	}

	public boolean isSet(quickfix.field.DKReason field) {
		return isSetField(field);
	}

	public boolean isSetDKReason() {
		return isSetField(127);
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

}