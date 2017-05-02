
package quickfix.fix50sp1.component;

import quickfix.FieldNotFound;

import quickfix.Group;

public class ApplIDRequestGrp extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = {  };
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = { 1351,  };
	protected int[] getGroupFields() { return componentGroups; }
	

	public ApplIDRequestGrp() {
		super();
	}
	
	public void set(quickfix.field.NoApplIDs value) {
		setField(value);
	}

	public quickfix.field.NoApplIDs get(quickfix.field.NoApplIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoApplIDs getNoApplIDs() throws FieldNotFound {
		return get(new quickfix.field.NoApplIDs());
	}

	public boolean isSet(quickfix.field.NoApplIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoApplIDs() {
		return isSetField(1351);
	}

	public static class NoApplIDs extends Group {

		static final long serialVersionUID = 20050617;

		public NoApplIDs() {
			super(1351, 1355,
				new int[] {1355, 1182, 1183,  0 });
		}
		
	public void set(quickfix.field.RefApplID value) {
		setField(value);
	}

	public quickfix.field.RefApplID get(quickfix.field.RefApplID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RefApplID getRefApplID() throws FieldNotFound {
		return get(new quickfix.field.RefApplID());
	}

	public boolean isSet(quickfix.field.RefApplID field) {
		return isSetField(field);
	}

	public boolean isSetRefApplID() {
		return isSetField(1355);
	}

	public void set(quickfix.field.ApplBegSeqNum value) {
		setField(value);
	}

	public quickfix.field.ApplBegSeqNum get(quickfix.field.ApplBegSeqNum value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ApplBegSeqNum getApplBegSeqNum() throws FieldNotFound {
		return get(new quickfix.field.ApplBegSeqNum());
	}

	public boolean isSet(quickfix.field.ApplBegSeqNum field) {
		return isSetField(field);
	}

	public boolean isSetApplBegSeqNum() {
		return isSetField(1182);
	}

	public void set(quickfix.field.ApplEndSeqNum value) {
		setField(value);
	}

	public quickfix.field.ApplEndSeqNum get(quickfix.field.ApplEndSeqNum value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ApplEndSeqNum getApplEndSeqNum() throws FieldNotFound {
		return get(new quickfix.field.ApplEndSeqNum());
	}

	public boolean isSet(quickfix.field.ApplEndSeqNum field) {
		return isSetField(field);
	}

	public boolean isSetApplEndSeqNum() {
		return isSetField(1183);
	}

	}

}
