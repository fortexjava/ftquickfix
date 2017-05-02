
package quickfix.fix50sp2.component;

import quickfix.FieldNotFound;

import quickfix.Group;

public class ComplexEvents extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = {  };
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = { 1483,  };
	protected int[] getGroupFields() { return componentGroups; }
	

	public ComplexEvents() {
		super();
	}
	
	public void set(quickfix.field.NoComplexEvents value) {
		setField(value);
	}

	public quickfix.field.NoComplexEvents get(quickfix.field.NoComplexEvents value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoComplexEvents getNoComplexEvents() throws FieldNotFound {
		return get(new quickfix.field.NoComplexEvents());
	}

	public boolean isSet(quickfix.field.NoComplexEvents field) {
		return isSetField(field);
	}

	public boolean isSetNoComplexEvents() {
		return isSetField(1483);
	}

	public static class NoComplexEvents extends Group {

		static final long serialVersionUID = 20050617;

		public NoComplexEvents() {
			super(1483, 1484,
				new int[] {1484, 1485, 1486, 1487, 1488, 1489, 1490, 1491,  0 });
		}
		
	public void set(quickfix.field.ComplexEventType value) {
		setField(value);
	}

	public quickfix.field.ComplexEventType get(quickfix.field.ComplexEventType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ComplexEventType getComplexEventType() throws FieldNotFound {
		return get(new quickfix.field.ComplexEventType());
	}

	public boolean isSet(quickfix.field.ComplexEventType field) {
		return isSetField(field);
	}

	public boolean isSetComplexEventType() {
		return isSetField(1484);
	}

	public void set(quickfix.field.ComplexOptPayoutAmount value) {
		setField(value);
	}

	public quickfix.field.ComplexOptPayoutAmount get(quickfix.field.ComplexOptPayoutAmount value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ComplexOptPayoutAmount getComplexOptPayoutAmount() throws FieldNotFound {
		return get(new quickfix.field.ComplexOptPayoutAmount());
	}

	public boolean isSet(quickfix.field.ComplexOptPayoutAmount field) {
		return isSetField(field);
	}

	public boolean isSetComplexOptPayoutAmount() {
		return isSetField(1485);
	}

	public void set(quickfix.field.ComplexEventPrice value) {
		setField(value);
	}

	public quickfix.field.ComplexEventPrice get(quickfix.field.ComplexEventPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ComplexEventPrice getComplexEventPrice() throws FieldNotFound {
		return get(new quickfix.field.ComplexEventPrice());
	}

	public boolean isSet(quickfix.field.ComplexEventPrice field) {
		return isSetField(field);
	}

	public boolean isSetComplexEventPrice() {
		return isSetField(1486);
	}

	public void set(quickfix.field.ComplexEventPriceBoundaryMethod value) {
		setField(value);
	}

	public quickfix.field.ComplexEventPriceBoundaryMethod get(quickfix.field.ComplexEventPriceBoundaryMethod value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ComplexEventPriceBoundaryMethod getComplexEventPriceBoundaryMethod() throws FieldNotFound {
		return get(new quickfix.field.ComplexEventPriceBoundaryMethod());
	}

	public boolean isSet(quickfix.field.ComplexEventPriceBoundaryMethod field) {
		return isSetField(field);
	}

	public boolean isSetComplexEventPriceBoundaryMethod() {
		return isSetField(1487);
	}

	public void set(quickfix.field.ComplexEventPriceBoundaryPrecision value) {
		setField(value);
	}

	public quickfix.field.ComplexEventPriceBoundaryPrecision get(quickfix.field.ComplexEventPriceBoundaryPrecision value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ComplexEventPriceBoundaryPrecision getComplexEventPriceBoundaryPrecision() throws FieldNotFound {
		return get(new quickfix.field.ComplexEventPriceBoundaryPrecision());
	}

	public boolean isSet(quickfix.field.ComplexEventPriceBoundaryPrecision field) {
		return isSetField(field);
	}

	public boolean isSetComplexEventPriceBoundaryPrecision() {
		return isSetField(1488);
	}

	public void set(quickfix.field.ComplexEventPriceTimeType value) {
		setField(value);
	}

	public quickfix.field.ComplexEventPriceTimeType get(quickfix.field.ComplexEventPriceTimeType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ComplexEventPriceTimeType getComplexEventPriceTimeType() throws FieldNotFound {
		return get(new quickfix.field.ComplexEventPriceTimeType());
	}

	public boolean isSet(quickfix.field.ComplexEventPriceTimeType field) {
		return isSetField(field);
	}

	public boolean isSetComplexEventPriceTimeType() {
		return isSetField(1489);
	}

	public void set(quickfix.field.ComplexEventCondition value) {
		setField(value);
	}

	public quickfix.field.ComplexEventCondition get(quickfix.field.ComplexEventCondition value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ComplexEventCondition getComplexEventCondition() throws FieldNotFound {
		return get(new quickfix.field.ComplexEventCondition());
	}

	public boolean isSet(quickfix.field.ComplexEventCondition field) {
		return isSetField(field);
	}

	public boolean isSetComplexEventCondition() {
		return isSetField(1490);
	}

	public void set(quickfix.fix50sp2.component.ComplexEventDates component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.ComplexEventDates get(quickfix.fix50sp2.component.ComplexEventDates component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.ComplexEventDates getComplexEventDates() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.ComplexEventDates());
	}

	public void set(quickfix.field.NoComplexEventDates value) {
		setField(value);
	}

	public quickfix.field.NoComplexEventDates get(quickfix.field.NoComplexEventDates value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoComplexEventDates getNoComplexEventDates() throws FieldNotFound {
		return get(new quickfix.field.NoComplexEventDates());
	}

	public boolean isSet(quickfix.field.NoComplexEventDates field) {
		return isSetField(field);
	}

	public boolean isSetNoComplexEventDates() {
		return isSetField(1491);
	}

	public static class NoComplexEventDates extends Group {

		static final long serialVersionUID = 20050617;

		public NoComplexEventDates() {
			super(1491, 1492,
				new int[] {1492, 1493, 1494,  0 });
		}
		
	public void set(quickfix.field.ComplexEventStartDate value) {
		setField(value);
	}

	public quickfix.field.ComplexEventStartDate get(quickfix.field.ComplexEventStartDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ComplexEventStartDate getComplexEventStartDate() throws FieldNotFound {
		return get(new quickfix.field.ComplexEventStartDate());
	}

	public boolean isSet(quickfix.field.ComplexEventStartDate field) {
		return isSetField(field);
	}

	public boolean isSetComplexEventStartDate() {
		return isSetField(1492);
	}

	public void set(quickfix.field.ComplexEventEndDate value) {
		setField(value);
	}

	public quickfix.field.ComplexEventEndDate get(quickfix.field.ComplexEventEndDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ComplexEventEndDate getComplexEventEndDate() throws FieldNotFound {
		return get(new quickfix.field.ComplexEventEndDate());
	}

	public boolean isSet(quickfix.field.ComplexEventEndDate field) {
		return isSetField(field);
	}

	public boolean isSetComplexEventEndDate() {
		return isSetField(1493);
	}

	public void set(quickfix.fix50sp2.component.ComplexEventTimes component) {
		setComponent(component);
	}

	public quickfix.fix50sp2.component.ComplexEventTimes get(quickfix.fix50sp2.component.ComplexEventTimes component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp2.component.ComplexEventTimes getComplexEventTimes() throws FieldNotFound {
		return get(new quickfix.fix50sp2.component.ComplexEventTimes());
	}

	public void set(quickfix.field.NoComplexEventTimes value) {
		setField(value);
	}

	public quickfix.field.NoComplexEventTimes get(quickfix.field.NoComplexEventTimes value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoComplexEventTimes getNoComplexEventTimes() throws FieldNotFound {
		return get(new quickfix.field.NoComplexEventTimes());
	}

	public boolean isSet(quickfix.field.NoComplexEventTimes field) {
		return isSetField(field);
	}

	public boolean isSetNoComplexEventTimes() {
		return isSetField(1494);
	}

	public static class NoComplexEventTimes extends Group {

		static final long serialVersionUID = 20050617;

		public NoComplexEventTimes() {
			super(1494, 1495,
				new int[] {1495, 1496,  0 });
		}
		
	public void set(quickfix.field.ComplexEventStartTime value) {
		setField(value);
	}

	public quickfix.field.ComplexEventStartTime get(quickfix.field.ComplexEventStartTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ComplexEventStartTime getComplexEventStartTime() throws FieldNotFound {
		return get(new quickfix.field.ComplexEventStartTime());
	}

	public boolean isSet(quickfix.field.ComplexEventStartTime field) {
		return isSetField(field);
	}

	public boolean isSetComplexEventStartTime() {
		return isSetField(1495);
	}

	public void set(quickfix.field.ComplexEventEndTime value) {
		setField(value);
	}

	public quickfix.field.ComplexEventEndTime get(quickfix.field.ComplexEventEndTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ComplexEventEndTime getComplexEventEndTime() throws FieldNotFound {
		return get(new quickfix.field.ComplexEventEndTime());
	}

	public boolean isSet(quickfix.field.ComplexEventEndTime field) {
		return isSetField(field);
	}

	public boolean isSetComplexEventEndTime() {
		return isSetField(1496);
	}

	}

	}

	}

}
