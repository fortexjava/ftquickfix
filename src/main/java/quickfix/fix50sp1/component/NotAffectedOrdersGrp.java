
package quickfix.fix50sp1.component;

import quickfix.FieldNotFound;

import quickfix.Group;

public class NotAffectedOrdersGrp extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = {  };
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = { 1370,  };
	protected int[] getGroupFields() { return componentGroups; }
	

	public NotAffectedOrdersGrp() {
		super();
	}
	
	public void set(quickfix.field.NoNotAffectedOrders value) {
		setField(value);
	}

	public quickfix.field.NoNotAffectedOrders get(quickfix.field.NoNotAffectedOrders value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoNotAffectedOrders getNoNotAffectedOrders() throws FieldNotFound {
		return get(new quickfix.field.NoNotAffectedOrders());
	}

	public boolean isSet(quickfix.field.NoNotAffectedOrders field) {
		return isSetField(field);
	}

	public boolean isSetNoNotAffectedOrders() {
		return isSetField(1370);
	}

	public static class NoNotAffectedOrders extends Group {

		static final long serialVersionUID = 20050617;

		public NoNotAffectedOrders() {
			super(1370, 1372,
				new int[] {1372, 1371,  0 });
		}
		
	public void set(quickfix.field.NotAffOrigClOrdID value) {
		setField(value);
	}

	public quickfix.field.NotAffOrigClOrdID get(quickfix.field.NotAffOrigClOrdID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NotAffOrigClOrdID getNotAffOrigClOrdID() throws FieldNotFound {
		return get(new quickfix.field.NotAffOrigClOrdID());
	}

	public boolean isSet(quickfix.field.NotAffOrigClOrdID field) {
		return isSetField(field);
	}

	public boolean isSetNotAffOrigClOrdID() {
		return isSetField(1372);
	}

	public void set(quickfix.field.NotAffectedOrderID value) {
		setField(value);
	}

	public quickfix.field.NotAffectedOrderID get(quickfix.field.NotAffectedOrderID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NotAffectedOrderID getNotAffectedOrderID() throws FieldNotFound {
		return get(new quickfix.field.NotAffectedOrderID());
	}

	public boolean isSet(quickfix.field.NotAffectedOrderID field) {
		return isSetField(field);
	}

	public boolean isSetNotAffectedOrderID() {
		return isSetField(1371);
	}

	}

}
