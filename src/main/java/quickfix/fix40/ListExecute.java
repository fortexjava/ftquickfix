
package quickfix.fix40;

import quickfix.FieldNotFound;


public class ListExecute extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "L";
	

	public ListExecute() {
		super();
		getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
	}
	
	public ListExecute(quickfix.field.ListID listID) {
		this();
		setField(listID);
	}
	
	public void set(quickfix.field.ListID value) {
		setField(value);
	}

	public quickfix.field.ListID get(quickfix.field.ListID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ListID getListID() throws FieldNotFound {
		return get(new quickfix.field.ListID());
	}

	public boolean isSet(quickfix.field.ListID field) {
		return isSetField(field);
	}

	public boolean isSetListID() {
		return isSetField(66);
	}

	public void set(quickfix.field.WaveNo value) {
		setField(value);
	}

	public quickfix.field.WaveNo get(quickfix.field.WaveNo value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.WaveNo getWaveNo() throws FieldNotFound {
		return get(new quickfix.field.WaveNo());
	}

	public boolean isSet(quickfix.field.WaveNo field) {
		return isSetField(field);
	}

	public boolean isSetWaveNo() {
		return isSetField(105);
	}

	public void set(quickfix.field.Text value) {
		setField(value);
	}

	public quickfix.field.Text get(quickfix.field.Text value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Text getText() throws FieldNotFound {
		return get(new quickfix.field.Text());
	}

	public boolean isSet(quickfix.field.Text field) {
		return isSetField(field);
	}

	public boolean isSetText() {
		return isSetField(58);
	}

}
