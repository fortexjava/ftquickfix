
package quickfix.fix50sp1.component;

import quickfix.FieldNotFound;

import quickfix.Group;

public class SettlDetails extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = {  };
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = { 1158,  };
	protected int[] getGroupFields() { return componentGroups; }
	

	public SettlDetails() {
		super();
	}
	
	public void set(quickfix.field.NoSettlDetails value) {
		setField(value);
	}

	public quickfix.field.NoSettlDetails get(quickfix.field.NoSettlDetails value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoSettlDetails getNoSettlDetails() throws FieldNotFound {
		return get(new quickfix.field.NoSettlDetails());
	}

	public boolean isSet(quickfix.field.NoSettlDetails field) {
		return isSetField(field);
	}

	public boolean isSetNoSettlDetails() {
		return isSetField(1158);
	}

	public static class NoSettlDetails extends Group {

		static final long serialVersionUID = 20050617;

		public NoSettlDetails() {
			super(1158, 1164,
				new int[] {1164, 781,  0 });
		}
		
	public void set(quickfix.field.SettlObligSource value) {
		setField(value);
	}

	public quickfix.field.SettlObligSource get(quickfix.field.SettlObligSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SettlObligSource getSettlObligSource() throws FieldNotFound {
		return get(new quickfix.field.SettlObligSource());
	}

	public boolean isSet(quickfix.field.SettlObligSource field) {
		return isSetField(field);
	}

	public boolean isSetSettlObligSource() {
		return isSetField(1164);
	}

	public void set(quickfix.fix50sp1.component.SettlParties component) {
		setComponent(component);
	}

	public quickfix.fix50sp1.component.SettlParties get(quickfix.fix50sp1.component.SettlParties component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp1.component.SettlParties getSettlParties() throws FieldNotFound {
		return get(new quickfix.fix50sp1.component.SettlParties());
	}

	public void set(quickfix.field.NoSettlPartyIDs value) {
		setField(value);
	}

	public quickfix.field.NoSettlPartyIDs get(quickfix.field.NoSettlPartyIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoSettlPartyIDs getNoSettlPartyIDs() throws FieldNotFound {
		return get(new quickfix.field.NoSettlPartyIDs());
	}

	public boolean isSet(quickfix.field.NoSettlPartyIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoSettlPartyIDs() {
		return isSetField(781);
	}

	public static class NoSettlPartyIDs extends Group {

		static final long serialVersionUID = 20050617;

		public NoSettlPartyIDs() {
			super(781, 782,
				new int[] {782, 783, 784, 801,  0 });
		}
		
	public void set(quickfix.field.SettlPartyID value) {
		setField(value);
	}

	public quickfix.field.SettlPartyID get(quickfix.field.SettlPartyID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SettlPartyID getSettlPartyID() throws FieldNotFound {
		return get(new quickfix.field.SettlPartyID());
	}

	public boolean isSet(quickfix.field.SettlPartyID field) {
		return isSetField(field);
	}

	public boolean isSetSettlPartyID() {
		return isSetField(782);
	}

	public void set(quickfix.field.SettlPartyIDSource value) {
		setField(value);
	}

	public quickfix.field.SettlPartyIDSource get(quickfix.field.SettlPartyIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SettlPartyIDSource getSettlPartyIDSource() throws FieldNotFound {
		return get(new quickfix.field.SettlPartyIDSource());
	}

	public boolean isSet(quickfix.field.SettlPartyIDSource field) {
		return isSetField(field);
	}

	public boolean isSetSettlPartyIDSource() {
		return isSetField(783);
	}

	public void set(quickfix.field.SettlPartyRole value) {
		setField(value);
	}

	public quickfix.field.SettlPartyRole get(quickfix.field.SettlPartyRole value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SettlPartyRole getSettlPartyRole() throws FieldNotFound {
		return get(new quickfix.field.SettlPartyRole());
	}

	public boolean isSet(quickfix.field.SettlPartyRole field) {
		return isSetField(field);
	}

	public boolean isSetSettlPartyRole() {
		return isSetField(784);
	}

	public void set(quickfix.fix50sp1.component.SettlPtysSubGrp component) {
		setComponent(component);
	}

	public quickfix.fix50sp1.component.SettlPtysSubGrp get(quickfix.fix50sp1.component.SettlPtysSubGrp component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp1.component.SettlPtysSubGrp getSettlPtysSubGrp() throws FieldNotFound {
		return get(new quickfix.fix50sp1.component.SettlPtysSubGrp());
	}

	public void set(quickfix.field.NoSettlPartySubIDs value) {
		setField(value);
	}

	public quickfix.field.NoSettlPartySubIDs get(quickfix.field.NoSettlPartySubIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoSettlPartySubIDs getNoSettlPartySubIDs() throws FieldNotFound {
		return get(new quickfix.field.NoSettlPartySubIDs());
	}

	public boolean isSet(quickfix.field.NoSettlPartySubIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoSettlPartySubIDs() {
		return isSetField(801);
	}

	public static class NoSettlPartySubIDs extends Group {

		static final long serialVersionUID = 20050617;

		public NoSettlPartySubIDs() {
			super(801, 785,
				new int[] {785, 786,  0 });
		}
		
	public void set(quickfix.field.SettlPartySubID value) {
		setField(value);
	}

	public quickfix.field.SettlPartySubID get(quickfix.field.SettlPartySubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SettlPartySubID getSettlPartySubID() throws FieldNotFound {
		return get(new quickfix.field.SettlPartySubID());
	}

	public boolean isSet(quickfix.field.SettlPartySubID field) {
		return isSetField(field);
	}

	public boolean isSetSettlPartySubID() {
		return isSetField(785);
	}

	public void set(quickfix.field.SettlPartySubIDType value) {
		setField(value);
	}

	public quickfix.field.SettlPartySubIDType get(quickfix.field.SettlPartySubIDType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SettlPartySubIDType getSettlPartySubIDType() throws FieldNotFound {
		return get(new quickfix.field.SettlPartySubIDType());
	}

	public boolean isSet(quickfix.field.SettlPartySubIDType field) {
		return isSetField(field);
	}

	public boolean isSetSettlPartySubIDType() {
		return isSetField(786);
	}

	}

	}

	}

}
