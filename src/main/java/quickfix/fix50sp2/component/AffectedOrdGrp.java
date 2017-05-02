
package quickfix.fix50sp2.component;

import quickfix.FieldNotFound;

import quickfix.Group;

public class AffectedOrdGrp extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = {  };
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = { 534,  };
	protected int[] getGroupFields() { return componentGroups; }
	

	public AffectedOrdGrp() {
		super();
	}
	
	public void set(quickfix.field.NoAffectedOrders value) {
		setField(value);
	}

	public quickfix.field.NoAffectedOrders get(quickfix.field.NoAffectedOrders value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoAffectedOrders getNoAffectedOrders() throws FieldNotFound {
		return get(new quickfix.field.NoAffectedOrders());
	}

	public boolean isSet(quickfix.field.NoAffectedOrders field) {
		return isSetField(field);
	}

	public boolean isSetNoAffectedOrders() {
		return isSetField(534);
	}

	public static class NoAffectedOrders extends Group {

		static final long serialVersionUID = 20050617;

		public NoAffectedOrders() {
			super(534, 41,
				new int[] {41, 535, 536,  0 });
		}
		
	public void set(quickfix.field.OrigClOrdID value) {
		setField(value);
	}

	public quickfix.field.OrigClOrdID get(quickfix.field.OrigClOrdID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.OrigClOrdID getOrigClOrdID() throws FieldNotFound {
		return get(new quickfix.field.OrigClOrdID());
	}

	public boolean isSet(quickfix.field.OrigClOrdID field) {
		return isSetField(field);
	}

	public boolean isSetOrigClOrdID() {
		return isSetField(41);
	}

	public void set(quickfix.field.AffectedOrderID value) {
		setField(value);
	}

	public quickfix.field.AffectedOrderID get(quickfix.field.AffectedOrderID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AffectedOrderID getAffectedOrderID() throws FieldNotFound {
		return get(new quickfix.field.AffectedOrderID());
	}

	public boolean isSet(quickfix.field.AffectedOrderID field) {
		return isSetField(field);
	}

	public boolean isSetAffectedOrderID() {
		return isSetField(535);
	}

	public void set(quickfix.field.AffectedSecondaryOrderID value) {
		setField(value);
	}

	public quickfix.field.AffectedSecondaryOrderID get(quickfix.field.AffectedSecondaryOrderID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.AffectedSecondaryOrderID getAffectedSecondaryOrderID() throws FieldNotFound {
		return get(new quickfix.field.AffectedSecondaryOrderID());
	}

	public boolean isSet(quickfix.field.AffectedSecondaryOrderID field) {
		return isSetField(field);
	}

	public boolean isSetAffectedSecondaryOrderID() {
		return isSetField(536);
	}

	}

}
