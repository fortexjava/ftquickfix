
package quickfix.fix50sp1.component;

import quickfix.FieldNotFound;

import quickfix.Group;

public class LegPreAllocGrp extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = {  };
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = { 670,  };
	protected int[] getGroupFields() { return componentGroups; }
	

	public LegPreAllocGrp() {
		super();
	}
	
	public void set(quickfix.field.NoLegAllocs value) {
		setField(value);
	}

	public quickfix.field.NoLegAllocs get(quickfix.field.NoLegAllocs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoLegAllocs getNoLegAllocs() throws FieldNotFound {
		return get(new quickfix.field.NoLegAllocs());
	}

	public boolean isSet(quickfix.field.NoLegAllocs field) {
		return isSetField(field);
	}

	public boolean isSetNoLegAllocs() {
		return isSetField(670);
	}

	public static class NoLegAllocs extends Group {

		static final long serialVersionUID = 20050617;

		public NoLegAllocs() {
			super(670, 671,
				new int[] {671, 672, 756, 673, 674, 1367,  0 });
		}
		
	public void set(quickfix.field.LegAllocAccount value) {
		setField(value);
	}

	public quickfix.field.LegAllocAccount get(quickfix.field.LegAllocAccount value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegAllocAccount getLegAllocAccount() throws FieldNotFound {
		return get(new quickfix.field.LegAllocAccount());
	}

	public boolean isSet(quickfix.field.LegAllocAccount field) {
		return isSetField(field);
	}

	public boolean isSetLegAllocAccount() {
		return isSetField(671);
	}

	public void set(quickfix.field.LegIndividualAllocID value) {
		setField(value);
	}

	public quickfix.field.LegIndividualAllocID get(quickfix.field.LegIndividualAllocID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegIndividualAllocID getLegIndividualAllocID() throws FieldNotFound {
		return get(new quickfix.field.LegIndividualAllocID());
	}

	public boolean isSet(quickfix.field.LegIndividualAllocID field) {
		return isSetField(field);
	}

	public boolean isSetLegIndividualAllocID() {
		return isSetField(672);
	}

	public void set(quickfix.fix50sp1.component.NestedParties2 component) {
		setComponent(component);
	}

	public quickfix.fix50sp1.component.NestedParties2 get(quickfix.fix50sp1.component.NestedParties2 component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp1.component.NestedParties2 getNestedParties2() throws FieldNotFound {
		return get(new quickfix.fix50sp1.component.NestedParties2());
	}

	public void set(quickfix.field.NoNested2PartyIDs value) {
		setField(value);
	}

	public quickfix.field.NoNested2PartyIDs get(quickfix.field.NoNested2PartyIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoNested2PartyIDs getNoNested2PartyIDs() throws FieldNotFound {
		return get(new quickfix.field.NoNested2PartyIDs());
	}

	public boolean isSet(quickfix.field.NoNested2PartyIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoNested2PartyIDs() {
		return isSetField(756);
	}

	public static class NoNested2PartyIDs extends Group {

		static final long serialVersionUID = 20050617;

		public NoNested2PartyIDs() {
			super(756, 757,
				new int[] {757, 758, 759, 806,  0 });
		}
		
	public void set(quickfix.field.Nested2PartyID value) {
		setField(value);
	}

	public quickfix.field.Nested2PartyID get(quickfix.field.Nested2PartyID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Nested2PartyID getNested2PartyID() throws FieldNotFound {
		return get(new quickfix.field.Nested2PartyID());
	}

	public boolean isSet(quickfix.field.Nested2PartyID field) {
		return isSetField(field);
	}

	public boolean isSetNested2PartyID() {
		return isSetField(757);
	}

	public void set(quickfix.field.Nested2PartyIDSource value) {
		setField(value);
	}

	public quickfix.field.Nested2PartyIDSource get(quickfix.field.Nested2PartyIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Nested2PartyIDSource getNested2PartyIDSource() throws FieldNotFound {
		return get(new quickfix.field.Nested2PartyIDSource());
	}

	public boolean isSet(quickfix.field.Nested2PartyIDSource field) {
		return isSetField(field);
	}

	public boolean isSetNested2PartyIDSource() {
		return isSetField(758);
	}

	public void set(quickfix.field.Nested2PartyRole value) {
		setField(value);
	}

	public quickfix.field.Nested2PartyRole get(quickfix.field.Nested2PartyRole value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Nested2PartyRole getNested2PartyRole() throws FieldNotFound {
		return get(new quickfix.field.Nested2PartyRole());
	}

	public boolean isSet(quickfix.field.Nested2PartyRole field) {
		return isSetField(field);
	}

	public boolean isSetNested2PartyRole() {
		return isSetField(759);
	}

	public void set(quickfix.fix50sp1.component.NstdPtys2SubGrp component) {
		setComponent(component);
	}

	public quickfix.fix50sp1.component.NstdPtys2SubGrp get(quickfix.fix50sp1.component.NstdPtys2SubGrp component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp1.component.NstdPtys2SubGrp getNstdPtys2SubGrp() throws FieldNotFound {
		return get(new quickfix.fix50sp1.component.NstdPtys2SubGrp());
	}

	public void set(quickfix.field.NoNested2PartySubIDs value) {
		setField(value);
	}

	public quickfix.field.NoNested2PartySubIDs get(quickfix.field.NoNested2PartySubIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoNested2PartySubIDs getNoNested2PartySubIDs() throws FieldNotFound {
		return get(new quickfix.field.NoNested2PartySubIDs());
	}

	public boolean isSet(quickfix.field.NoNested2PartySubIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoNested2PartySubIDs() {
		return isSetField(806);
	}

	public static class NoNested2PartySubIDs extends Group {

		static final long serialVersionUID = 20050617;

		public NoNested2PartySubIDs() {
			super(806, 760,
				new int[] {760, 807,  0 });
		}
		
	public void set(quickfix.field.Nested2PartySubID value) {
		setField(value);
	}

	public quickfix.field.Nested2PartySubID get(quickfix.field.Nested2PartySubID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Nested2PartySubID getNested2PartySubID() throws FieldNotFound {
		return get(new quickfix.field.Nested2PartySubID());
	}

	public boolean isSet(quickfix.field.Nested2PartySubID field) {
		return isSetField(field);
	}

	public boolean isSetNested2PartySubID() {
		return isSetField(760);
	}

	public void set(quickfix.field.Nested2PartySubIDType value) {
		setField(value);
	}

	public quickfix.field.Nested2PartySubIDType get(quickfix.field.Nested2PartySubIDType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Nested2PartySubIDType getNested2PartySubIDType() throws FieldNotFound {
		return get(new quickfix.field.Nested2PartySubIDType());
	}

	public boolean isSet(quickfix.field.Nested2PartySubIDType field) {
		return isSetField(field);
	}

	public boolean isSetNested2PartySubIDType() {
		return isSetField(807);
	}

	}

	}

	public void set(quickfix.field.LegAllocQty value) {
		setField(value);
	}

	public quickfix.field.LegAllocQty get(quickfix.field.LegAllocQty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegAllocQty getLegAllocQty() throws FieldNotFound {
		return get(new quickfix.field.LegAllocQty());
	}

	public boolean isSet(quickfix.field.LegAllocQty field) {
		return isSetField(field);
	}

	public boolean isSetLegAllocQty() {
		return isSetField(673);
	}

	public void set(quickfix.field.LegAllocAcctIDSource value) {
		setField(value);
	}

	public quickfix.field.LegAllocAcctIDSource get(quickfix.field.LegAllocAcctIDSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegAllocAcctIDSource getLegAllocAcctIDSource() throws FieldNotFound {
		return get(new quickfix.field.LegAllocAcctIDSource());
	}

	public boolean isSet(quickfix.field.LegAllocAcctIDSource field) {
		return isSetField(field);
	}

	public boolean isSetLegAllocAcctIDSource() {
		return isSetField(674);
	}

	public void set(quickfix.field.LegAllocSettlCurrency value) {
		setField(value);
	}

	public quickfix.field.LegAllocSettlCurrency get(quickfix.field.LegAllocSettlCurrency value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.LegAllocSettlCurrency getLegAllocSettlCurrency() throws FieldNotFound {
		return get(new quickfix.field.LegAllocSettlCurrency());
	}

	public boolean isSet(quickfix.field.LegAllocSettlCurrency field) {
		return isSetField(field);
	}

	public boolean isSetLegAllocSettlCurrency() {
		return isSetField(1367);
	}

	}

}
