
package quickfix.fix50sp1.component;

import quickfix.FieldNotFound;

import quickfix.Group;

public class TrdCollGrp extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = {  };
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = { 897,  };
	protected int[] getGroupFields() { return componentGroups; }
	

	public TrdCollGrp() {
		super();
	}
	
	public void set(quickfix.field.NoTrades value) {
		setField(value);
	}

	public quickfix.field.NoTrades get(quickfix.field.NoTrades value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoTrades getNoTrades() throws FieldNotFound {
		return get(new quickfix.field.NoTrades());
	}

	public boolean isSet(quickfix.field.NoTrades field) {
		return isSetField(field);
	}

	public boolean isSetNoTrades() {
		return isSetField(897);
	}

	public static class NoTrades extends Group {

		static final long serialVersionUID = 20050617;

		public NoTrades() {
			super(897, 571,
				new int[] {571, 818,  0 });
		}
		
	public void set(quickfix.field.TradeReportID value) {
		setField(value);
	}

	public quickfix.field.TradeReportID get(quickfix.field.TradeReportID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.TradeReportID getTradeReportID() throws FieldNotFound {
		return get(new quickfix.field.TradeReportID());
	}

	public boolean isSet(quickfix.field.TradeReportID field) {
		return isSetField(field);
	}

	public boolean isSetTradeReportID() {
		return isSetField(571);
	}

	public void set(quickfix.field.SecondaryTradeReportID value) {
		setField(value);
	}

	public quickfix.field.SecondaryTradeReportID get(quickfix.field.SecondaryTradeReportID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecondaryTradeReportID getSecondaryTradeReportID() throws FieldNotFound {
		return get(new quickfix.field.SecondaryTradeReportID());
	}

	public boolean isSet(quickfix.field.SecondaryTradeReportID field) {
		return isSetField(field);
	}

	public boolean isSetSecondaryTradeReportID() {
		return isSetField(818);
	}

	}

}
