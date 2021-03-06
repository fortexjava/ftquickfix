
package quickfix.fix40;

import quickfix.FieldNotFound;

import quickfix.Group;

public class ListStatus extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "N";
	

	public ListStatus() {
		super();
		getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
	}
	
	public ListStatus(quickfix.field.ListID listID, quickfix.field.NoRpts noRpts, quickfix.field.RptSeq rptSeq) {
		this();
		setField(listID);
		setField(noRpts);
		setField(rptSeq);
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

	public void set(quickfix.field.NoRpts value) {
		setField(value);
	}

	public quickfix.field.NoRpts get(quickfix.field.NoRpts value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoRpts getNoRpts() throws FieldNotFound {
		return get(new quickfix.field.NoRpts());
	}

	public boolean isSet(quickfix.field.NoRpts field) {
		return isSetField(field);
	}

	public boolean isSetNoRpts() {
		return isSetField(82);
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
				new int[] {11, 14, 84, 6,  0 });
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

	public void set(quickfix.field.CxlQty value) {
		setField(value);
	}

	public quickfix.field.CxlQty get(quickfix.field.CxlQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.CxlQty getCxlQty() throws FieldNotFound {
		return get(new quickfix.field.CxlQty());
	}

	public boolean isSet(quickfix.field.CxlQty field) {
		return isSetField(field);
	}

	public boolean isSetCxlQty() {
		return isSetField(84);
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

	}

}
