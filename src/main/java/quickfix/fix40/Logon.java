
package quickfix.fix40;

import quickfix.FieldNotFound;


public class Logon extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "A";
	

	public Logon() {
		super();
		getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
	}
	
	public Logon(quickfix.field.EncryptMethod encryptMethod, quickfix.field.HeartBtInt heartBtInt) {
		this();
		setField(encryptMethod);
		setField(heartBtInt);
	}
	
	public void set(quickfix.field.EncryptMethod value) {
		setField(value);
	}

	public quickfix.field.EncryptMethod get(quickfix.field.EncryptMethod value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EncryptMethod getEncryptMethod() throws FieldNotFound {
		return get(new quickfix.field.EncryptMethod());
	}

	public boolean isSet(quickfix.field.EncryptMethod field) {
		return isSetField(field);
	}

	public boolean isSetEncryptMethod() {
		return isSetField(98);
	}

	public void set(quickfix.field.HeartBtInt value) {
		setField(value);
	}

	public quickfix.field.HeartBtInt get(quickfix.field.HeartBtInt value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.HeartBtInt getHeartBtInt() throws FieldNotFound {
		return get(new quickfix.field.HeartBtInt());
	}

	public boolean isSet(quickfix.field.HeartBtInt field) {
		return isSetField(field);
	}

	public boolean isSetHeartBtInt() {
		return isSetField(108);
	}

	public void set(quickfix.field.RawDataLength value) {
		setField(value);
	}

	public quickfix.field.RawDataLength get(quickfix.field.RawDataLength value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RawDataLength getRawDataLength() throws FieldNotFound {
		return get(new quickfix.field.RawDataLength());
	}

	public boolean isSet(quickfix.field.RawDataLength field) {
		return isSetField(field);
	}

	public boolean isSetRawDataLength() {
		return isSetField(95);
	}

	public void set(quickfix.field.RawData value) {
		setField(value);
	}

	public quickfix.field.RawData get(quickfix.field.RawData value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RawData getRawData() throws FieldNotFound {
		return get(new quickfix.field.RawData());
	}

	public boolean isSet(quickfix.field.RawData field) {
		return isSetField(field);
	}

	public boolean isSetRawData() {
		return isSetField(96);
	}

}
