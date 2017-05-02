
package quickfix.fix50sp2.component;

import quickfix.FieldNotFound;

import quickfix.Group;

public class StatsIndGrp extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = {  };
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = { 1175,  };
	protected int[] getGroupFields() { return componentGroups; }
	

	public StatsIndGrp() {
		super();
	}
	
	public void set(quickfix.field.NoStatsIndicators value) {
		setField(value);
	}

	public quickfix.field.NoStatsIndicators get(quickfix.field.NoStatsIndicators value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoStatsIndicators getNoStatsIndicators() throws FieldNotFound {
		return get(new quickfix.field.NoStatsIndicators());
	}

	public boolean isSet(quickfix.field.NoStatsIndicators field) {
		return isSetField(field);
	}

	public boolean isSetNoStatsIndicators() {
		return isSetField(1175);
	}

	public static class NoStatsIndicators extends Group {

		static final long serialVersionUID = 20050617;

		public NoStatsIndicators() {
			super(1175, 1176,
				new int[] {1176,  0 });
		}
		
	public void set(quickfix.field.StatsType value) {
		setField(value);
	}

	public quickfix.field.StatsType get(quickfix.field.StatsType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.StatsType getStatsType() throws FieldNotFound {
		return get(new quickfix.field.StatsType());
	}

	public boolean isSet(quickfix.field.StatsType field) {
		return isSetField(field);
	}

	public boolean isSetStatsType() {
		return isSetField(1176);
	}

	}

}
