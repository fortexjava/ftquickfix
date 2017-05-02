
package quickfix.fix50sp1.component;

import quickfix.FieldNotFound;


public class SecurityXML extends quickfix.MessageComponent {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "";
	
	private int[] componentFields = { 1184, 1185, 1186,  };
	protected int[] getFields() { return componentFields; }
	private int[] componentGroups = {  };
	protected int[] getGroupFields() { return componentGroups; }
	

	public SecurityXML() {
		super();
	}
	
	public void set(quickfix.field.SecurityXMLLen value) {
		setField(value);
	}

	public quickfix.field.SecurityXMLLen get(quickfix.field.SecurityXMLLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecurityXMLLen getSecurityXMLLen() throws FieldNotFound {
		return get(new quickfix.field.SecurityXMLLen());
	}

	public boolean isSet(quickfix.field.SecurityXMLLen field) {
		return isSetField(field);
	}

	public boolean isSetSecurityXMLLen() {
		return isSetField(1184);
	}

	public void set(quickfix.field.SecurityXMLData value) {
		setField(value);
	}

	public quickfix.field.SecurityXMLData get(quickfix.field.SecurityXMLData value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecurityXMLData getSecurityXMLData() throws FieldNotFound {
		return get(new quickfix.field.SecurityXMLData());
	}

	public boolean isSet(quickfix.field.SecurityXMLData field) {
		return isSetField(field);
	}

	public boolean isSetSecurityXMLData() {
		return isSetField(1185);
	}

	public void set(quickfix.field.SecurityXMLSchema value) {
		setField(value);
	}

	public quickfix.field.SecurityXMLSchema get(quickfix.field.SecurityXMLSchema value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.SecurityXMLSchema getSecurityXMLSchema() throws FieldNotFound {
		return get(new quickfix.field.SecurityXMLSchema());
	}

	public boolean isSet(quickfix.field.SecurityXMLSchema field) {
		return isSetField(field);
	}

	public boolean isSetSecurityXMLSchema() {
		return isSetField(1186);
	}

}
