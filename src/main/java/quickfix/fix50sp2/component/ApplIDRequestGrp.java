
package quickfix.fix50sp2.component;

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
				new int[] {1355, 1433, 1182, 1183, 539,  0 });
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

	public void set(quickfix.field.RefApplReqID value) {
		setField(value);
	}

	public quickfix.field.RefApplReqID get(quickfix.field.RefApplReqID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RefApplReqID getRefApplReqID() throws FieldNotFound {
		return get(new quickfix.field.RefApplReqID());
	}

	public boolean isSet(quickfix.field.RefApplReqID field) {
		return isSetField(field);
	}

	public boolean isSetRefApplReqID() {
		return isSetField(1433);
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

	public void set(quickfix.fix50sp2.component.NestedParties component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.NestedParties get(quickfix.fix50sp2.component.NestedParties component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.NestedParties getNestedParties() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.NestedParties());
	}

	public void set(quickfix.field.NoNestedPartyIDs value) {
		setField(value);
	}

	public quickfix.field.NoNestedPartyIDs get(quickfix.field.NoNestedPartyIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoNestedPartyIDs getNoNestedPartyIDs() throws FieldNotFound {
		return get(new quickfix.field.NoNestedPartyIDs());
	}

	public boolean isSet(quickfix.field.NoNestedPartyIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoNestedPartyIDs() {
		return isSetField(539);
	}

	public static class NoNestedPartyIDs extends Group {

		static final long serialVersionUID = 20050617;

		public NoNestedPartyIDs() {
			super(539, 524,
				new int[] {524, 525, 538, 804,  0 });
		}
		
	public void set(quickfix.field.NestedPartyID value) {
		setField(value);
	}

	public quickfix.field.NestedPartyID get(quickfix.field.NestedPartyID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NestedPartyID getNestedPartyID() throws FieldNotFound {
		return get(new quickfix.field.NestedPartyID());
	}

	public boolean isSet(quickfix.field.NestedPartyID field) {
		return isSetField(field);
	}

	public boolean isSetNestedPartyID() {
		return isSetField(524);
	}

	public void set(quickfix.field.NestedPartyIDSource value) {
		setField(value);
	}

	public quickfix.field.NestedPartyIDSource get(quickfix.field.NestedPartyIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NestedPartyIDSource getNestedPartyIDSource() throws FieldNotFound {
		return get(new quickfix.field.NestedPartyIDSource());
	}

	public boolean isSet(quickfix.field.NestedPartyIDSource field) {
		return isSetField(field);
	}

	public boolean isSetNestedPartyIDSource() {
		return isSetField(525);
	}

	public void set(quickfix.field.NestedPartyRole value) {
		setField(value);
	}

	public quickfix.field.NestedPartyRole get(quickfix.field.NestedPartyRole value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NestedPartyRole getNestedPartyRole() throws FieldNotFound {
		return get(new quickfix.field.NestedPartyRole());
	}

	public boolean isSet(quickfix.field.NestedPartyRole field) {
		return isSetField(field);
	}

	public boolean isSetNestedPartyRole() {
		return isSetField(538);
	}

	public void set(quickfix.fix50sp2.component.NstdPtysSubGrp component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.NstdPtysSubGrp get(quickfix.fix50sp2.component.NstdPtysSubGrp component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.NstdPtysSubGrp getNstdPtysSubGrp() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.NstdPtysSubGrp());
	}

	public void set(quickfix.field.NoNestedPartySubIDs value) {
		setField(value);
	}

	public quickfix.field.NoNestedPartySubIDs get(quickfix.field.NoNestedPartySubIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoNestedPartySubIDs getNoNestedPartySubIDs() throws FieldNotFound {
		return get(new quickfix.field.NoNestedPartySubIDs());
	}

	public boolean isSet(quickfix.field.NoNestedPartySubIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoNestedPartySubIDs() {
		return isSetField(804);
	}

	public static class NoNestedPartySubIDs extends Group {

		static final long serialVersionUID = 20050617;

		public NoNestedPartySubIDs() {
			super(804, 545,
				new int[] {545, 805,  0 });
		}
		
	public void set(quickfix.field.NestedPartySubID value) {
		setField(value);
	}

	public quickfix.field.NestedPartySubID get(quickfix.field.NestedPartySubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NestedPartySubID getNestedPartySubID() throws FieldNotFound {
		return get(new quickfix.field.NestedPartySubID());
	}

	public boolean isSet(quickfix.field.NestedPartySubID field) {
		return isSetField(field);
	}

	public boolean isSetNestedPartySubID() {
		return isSetField(545);
	}

	public void set(quickfix.field.NestedPartySubIDType value) {
		setField(value);
	}

	public quickfix.field.NestedPartySubIDType get(quickfix.field.NestedPartySubIDType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NestedPartySubIDType getNestedPartySubIDType() throws FieldNotFound {
		return get(new quickfix.field.NestedPartySubIDType());
	}

	public boolean isSet(quickfix.field.NestedPartySubIDType field) {
		return isSetField(field);
	}

	public boolean isSetNestedPartySubIDType() {
		return isSetField(805);
	}

	}

	}

	}

}
