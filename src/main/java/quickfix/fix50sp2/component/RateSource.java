
package quickfix.fix50sp2.component;

import quickfix.FieldNotFound;

import quickfix.Group;

public class RateSource extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = {  };
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = { 1445,  };
	protected int[] getGroupFields() { return componentGroups; }
	

	public RateSource() {
		super();
	}
	
	public void set(quickfix.field.NoRateSources value) {
		setField(value);
	}

	public quickfix.field.NoRateSources get(quickfix.field.NoRateSources value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoRateSources getNoRateSources() throws FieldNotFound {
		return get(new quickfix.field.NoRateSources());
	}

	public boolean isSet(quickfix.field.NoRateSources field) {
		return isSetField(field);
	}

	public boolean isSetNoRateSources() {
		return isSetField(1445);
	}

	public static class NoRateSources extends Group {

		static final long serialVersionUID = 20050617;

		public NoRateSources() {
			super(1445, 1446,
				new int[] {1446, 1447, 1448,  0 });
		}
		
	public void set(quickfix.field.RateSource value) {
		setField(value);
	}

	public quickfix.field.RateSource get(quickfix.field.RateSource value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RateSource getRateSource() throws FieldNotFound {
		return get(new quickfix.field.RateSource());
	}

	public boolean isSet(quickfix.field.RateSource field) {
		return isSetField(field);
	}

	public boolean isSetRateSource() {
		return isSetField(1446);
	}

	public void set(quickfix.field.RateSourceType value) {
		setField(value);
	}

	public quickfix.field.RateSourceType get(quickfix.field.RateSourceType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RateSourceType getRateSourceType() throws FieldNotFound {
		return get(new quickfix.field.RateSourceType());
	}

	public boolean isSet(quickfix.field.RateSourceType field) {
		return isSetField(field);
	}

	public boolean isSetRateSourceType() {
		return isSetField(1447);
	}

	public void set(quickfix.field.ReferencePage value) {
		setField(value);
	}

	public quickfix.field.ReferencePage get(quickfix.field.ReferencePage value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ReferencePage getReferencePage() throws FieldNotFound {
		return get(new quickfix.field.ReferencePage());
	}

	public boolean isSet(quickfix.field.ReferencePage field) {
		return isSetField(field);
	}

	public boolean isSetReferencePage() {
		return isSetField(1448);
	}

	}

}
