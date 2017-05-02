
package quickfix.fix50sp1.component;

import quickfix.FieldNotFound;

import quickfix.Group;

public class ApplIDRequestAckGrp extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = {  };
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = { 1351,  };
	protected int[] getGroupFields() { return componentGroups; }
	

	public ApplIDRequestAckGrp() {
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
				new int[] {1355, 1182, 1183, 1357, 1354,  0 });
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

	public void set(quickfix.field.RefApplLastSeqNum value) {
		setField(value);
	}

	public quickfix.field.RefApplLastSeqNum get(quickfix.field.RefApplLastSeqNum value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RefApplLastSeqNum getRefApplLastSeqNum() throws FieldNotFound {
		return get(new quickfix.field.RefApplLastSeqNum());
	}

	public boolean isSet(quickfix.field.RefApplLastSeqNum field) {
		return isSetField(field);
	}

	public boolean isSetRefApplLastSeqNum() {
		return isSetField(1357);
	}

	public void set(quickfix.field.ApplResponseError value) {
		setField(value);
	}

	public quickfix.field.ApplResponseError get(quickfix.field.ApplResponseError value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ApplResponseError getApplResponseError() throws FieldNotFound {
		return get(new quickfix.field.ApplResponseError());
	}

	public boolean isSet(quickfix.field.ApplResponseError field) {
		return isSetField(field);
	}

	public boolean isSetApplResponseError() {
		return isSetField(1354);
	}

	}

}
