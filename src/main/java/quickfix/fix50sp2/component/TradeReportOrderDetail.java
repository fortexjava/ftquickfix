
package quickfix.fix50sp2.component;

import quickfix.FieldNotFound;


public class TradeReportOrderDetail extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = { 37, 198, 11, 526, 66, 1080, 1081, 1431, 40, 44, 99, 18, 39, 38, 152, 516, 468, 469, 151, 14, 59, 126, 1138, 1082, 1083, 1084, 1085, 1086, 1087, 1088, 528, 529, 775, 1432, 821, 1093, 483, 586,  };
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = {  };
	protected int[] getGroupFields() { return componentGroups; }
	

	public TradeReportOrderDetail() {
		super();
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

	public void set(quickfix.field.RefOrderID value) {
		setField(value);
	}

	public quickfix.field.RefOrderID get(quickfix.field.RefOrderID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RefOrderID getRefOrderID() throws FieldNotFound {
		return get(new quickfix.field.RefOrderID());
	}

	public boolean isSet(quickfix.field.RefOrderID field) {
		return isSetField(field);
	}

	public boolean isSetRefOrderID() {
		return isSetField(1080);
	}

	public void set(quickfix.field.RefOrderIDSource value) {
		setField(value);
	}

	public quickfix.field.RefOrderIDSource get(quickfix.field.RefOrderIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RefOrderIDSource getRefOrderIDSource() throws FieldNotFound {
		return get(new quickfix.field.RefOrderIDSource());
	}

	public boolean isSet(quickfix.field.RefOrderIDSource field) {
		return isSetField(field);
	}

	public boolean isSetRefOrderIDSource() {
		return isSetField(1081);
	}

	public void set(quickfix.field.RefOrdIDReason value) {
		setField(value);
	}

	public quickfix.field.RefOrdIDReason get(quickfix.field.RefOrdIDReason value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RefOrdIDReason getRefOrdIDReason() throws FieldNotFound {
		return get(new quickfix.field.RefOrdIDReason());
	}

	public boolean isSet(quickfix.field.RefOrdIDReason field) {
		return isSetField(field);
	}

	public boolean isSetRefOrdIDReason() {
		return isSetField(1431);
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

	public void set(quickfix.field.OrdStatus value) {
		setField(value);
	}

	public quickfix.field.OrdStatus get(quickfix.field.OrdStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OrdStatus getOrdStatus() throws FieldNotFound {
		return get(new quickfix.field.OrdStatus());
	}

	public boolean isSet(quickfix.field.OrdStatus field) {
		return isSetField(field);
	}

	public boolean isSetOrdStatus() {
		return isSetField(39);
	}

	public void set(quickfix.fix50sp2.component.OrderQtyData component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.OrderQtyData get(quickfix.fix50sp2.component.OrderQtyData component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.OrderQtyData getOrderQtyData() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.OrderQtyData());
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

	public void set(quickfix.field.LeavesQty value) {
		setField(value);
	}

	public quickfix.field.LeavesQty get(quickfix.field.LeavesQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LeavesQty getLeavesQty() throws FieldNotFound {
		return get(new quickfix.field.LeavesQty());
	}

	public boolean isSet(quickfix.field.LeavesQty field) {
		return isSetField(field);
	}

	public boolean isSetLeavesQty() {
		return isSetField(151);
	}

	public void set(quickfix.field.CumQty value) {
		setField(value);
	}

	public quickfix.field.CumQty get(quickfix.field.CumQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CumQty getCumQty() throws FieldNotFound {
		return get(new quickfix.field.CumQty());
	}

	public boolean isSet(quickfix.field.CumQty field) {
		return isSetField(field);
	}

	public boolean isSetCumQty() {
		return isSetField(14);
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

	public void set(quickfix.fix50sp2.component.DisplayInstruction component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.DisplayInstruction get(quickfix.fix50sp2.component.DisplayInstruction component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.DisplayInstruction getDisplayInstruction() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.DisplayInstruction());
	}

	public void set(quickfix.field.DisplayQty value) {
		setField(value);
	}

	public quickfix.field.DisplayQty get(quickfix.field.DisplayQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DisplayQty getDisplayQty() throws FieldNotFound {
		return get(new quickfix.field.DisplayQty());
	}

	public boolean isSet(quickfix.field.DisplayQty field) {
		return isSetField(field);
	}

	public boolean isSetDisplayQty() {
		return isSetField(1138);
	}

	public void set(quickfix.field.SecondaryDisplayQty value) {
		setField(value);
	}

	public quickfix.field.SecondaryDisplayQty get(quickfix.field.SecondaryDisplayQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecondaryDisplayQty getSecondaryDisplayQty() throws FieldNotFound {
		return get(new quickfix.field.SecondaryDisplayQty());
	}

	public boolean isSet(quickfix.field.SecondaryDisplayQty field) {
		return isSetField(field);
	}

	public boolean isSetSecondaryDisplayQty() {
		return isSetField(1082);
	}

	public void set(quickfix.field.DisplayWhen value) {
		setField(value);
	}

	public quickfix.field.DisplayWhen get(quickfix.field.DisplayWhen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DisplayWhen getDisplayWhen() throws FieldNotFound {
		return get(new quickfix.field.DisplayWhen());
	}

	public boolean isSet(quickfix.field.DisplayWhen field) {
		return isSetField(field);
	}

	public boolean isSetDisplayWhen() {
		return isSetField(1083);
	}

	public void set(quickfix.field.DisplayMethod value) {
		setField(value);
	}

	public quickfix.field.DisplayMethod get(quickfix.field.DisplayMethod value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DisplayMethod getDisplayMethod() throws FieldNotFound {
		return get(new quickfix.field.DisplayMethod());
	}

	public boolean isSet(quickfix.field.DisplayMethod field) {
		return isSetField(field);
	}

	public boolean isSetDisplayMethod() {
		return isSetField(1084);
	}

	public void set(quickfix.field.DisplayLowQty value) {
		setField(value);
	}

	public quickfix.field.DisplayLowQty get(quickfix.field.DisplayLowQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DisplayLowQty getDisplayLowQty() throws FieldNotFound {
		return get(new quickfix.field.DisplayLowQty());
	}

	public boolean isSet(quickfix.field.DisplayLowQty field) {
		return isSetField(field);
	}

	public boolean isSetDisplayLowQty() {
		return isSetField(1085);
	}

	public void set(quickfix.field.DisplayHighQty value) {
		setField(value);
	}

	public quickfix.field.DisplayHighQty get(quickfix.field.DisplayHighQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DisplayHighQty getDisplayHighQty() throws FieldNotFound {
		return get(new quickfix.field.DisplayHighQty());
	}

	public boolean isSet(quickfix.field.DisplayHighQty field) {
		return isSetField(field);
	}

	public boolean isSetDisplayHighQty() {
		return isSetField(1086);
	}

	public void set(quickfix.field.DisplayMinIncr value) {
		setField(value);
	}

	public quickfix.field.DisplayMinIncr get(quickfix.field.DisplayMinIncr value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.DisplayMinIncr getDisplayMinIncr() throws FieldNotFound {
		return get(new quickfix.field.DisplayMinIncr());
	}

	public boolean isSet(quickfix.field.DisplayMinIncr field) {
		return isSetField(field);
	}

	public boolean isSetDisplayMinIncr() {
		return isSetField(1087);
	}

	public void set(quickfix.field.RefreshQty value) {
		setField(value);
	}

	public quickfix.field.RefreshQty get(quickfix.field.RefreshQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RefreshQty getRefreshQty() throws FieldNotFound {
		return get(new quickfix.field.RefreshQty());
	}

	public boolean isSet(quickfix.field.RefreshQty field) {
		return isSetField(field);
	}

	public boolean isSetRefreshQty() {
		return isSetField(1088);
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

	public void set(quickfix.field.BookingType value) {
		setField(value);
	}

	public quickfix.field.BookingType get(quickfix.field.BookingType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.BookingType getBookingType() throws FieldNotFound {
		return get(new quickfix.field.BookingType());
	}

	public boolean isSet(quickfix.field.BookingType field) {
		return isSetField(field);
	}

	public boolean isSetBookingType() {
		return isSetField(775);
	}

	public void set(quickfix.field.OrigCustOrderCapacity value) {
		setField(value);
	}

	public quickfix.field.OrigCustOrderCapacity get(quickfix.field.OrigCustOrderCapacity value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OrigCustOrderCapacity getOrigCustOrderCapacity() throws FieldNotFound {
		return get(new quickfix.field.OrigCustOrderCapacity());
	}

	public boolean isSet(quickfix.field.OrigCustOrderCapacity field) {
		return isSetField(field);
	}

	public boolean isSetOrigCustOrderCapacity() {
		return isSetField(1432);
	}

	public void set(quickfix.field.OrderInputDevice value) {
		setField(value);
	}

	public quickfix.field.OrderInputDevice get(quickfix.field.OrderInputDevice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OrderInputDevice getOrderInputDevice() throws FieldNotFound {
		return get(new quickfix.field.OrderInputDevice());
	}

	public boolean isSet(quickfix.field.OrderInputDevice field) {
		return isSetField(field);
	}

	public boolean isSetOrderInputDevice() {
		return isSetField(821);
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

	public void set(quickfix.field.TransBkdTime value) {
		setField(value);
	}

	public quickfix.field.TransBkdTime get(quickfix.field.TransBkdTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TransBkdTime getTransBkdTime() throws FieldNotFound {
		return get(new quickfix.field.TransBkdTime());
	}

	public boolean isSet(quickfix.field.TransBkdTime field) {
		return isSetField(field);
	}

	public boolean isSetTransBkdTime() {
		return isSetField(483);
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

}
