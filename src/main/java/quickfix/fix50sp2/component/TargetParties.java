
package quickfix.fix50sp2.component;

import quickfix.FieldNotFound;

import quickfix.Group;

public class TargetParties extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = {  };
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = { 1461,  };
	protected int[] getGroupFields() { return componentGroups; }
	

	public TargetParties() {
		super();
	}
	
	public void set(quickfix.field.NoTargetPartyIDs value) {
		setField(value);
	}

	public quickfix.field.NoTargetPartyIDs get(quickfix.field.NoTargetPartyIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoTargetPartyIDs getNoTargetPartyIDs() throws FieldNotFound {
		return get(new quickfix.field.NoTargetPartyIDs());
	}

	public boolean isSet(quickfix.field.NoTargetPartyIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoTargetPartyIDs() {
		return isSetField(1461);
	}

	public static class NoTargetPartyIDs extends Group {

		static final long serialVersionUID = 20050617;

		public NoTargetPartyIDs() {
			super(1461, 1462,
				new int[] {1462, 1463, 1464,  0 });
		}
		
	public void set(quickfix.field.TargetPartyID value) {
		setField(value);
	}

	public quickfix.field.TargetPartyID get(quickfix.field.TargetPartyID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TargetPartyID getTargetPartyID() throws FieldNotFound {
		return get(new quickfix.field.TargetPartyID());
	}

	public boolean isSet(quickfix.field.TargetPartyID field) {
		return isSetField(field);
	}

	public boolean isSetTargetPartyID() {
		return isSetField(1462);
	}

	public void set(quickfix.field.TargetPartyIDSource value) {
		setField(value);
	}

	public quickfix.field.TargetPartyIDSource get(quickfix.field.TargetPartyIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TargetPartyIDSource getTargetPartyIDSource() throws FieldNotFound {
		return get(new quickfix.field.TargetPartyIDSource());
	}

	public boolean isSet(quickfix.field.TargetPartyIDSource field) {
		return isSetField(field);
	}

	public boolean isSetTargetPartyIDSource() {
		return isSetField(1463);
	}

	public void set(quickfix.field.TargetPartyRole value) {
		setField(value);
	}

	public quickfix.field.TargetPartyRole get(quickfix.field.TargetPartyRole value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TargetPartyRole getTargetPartyRole() throws FieldNotFound {
		return get(new quickfix.field.TargetPartyRole());
	}

	public boolean isSet(quickfix.field.TargetPartyRole field) {
		return isSetField(field);
	}

	public boolean isSetTargetPartyRole() {
		return isSetField(1464);
	}

	}

}
