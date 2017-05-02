
package quickfix.fix50sp1;

import quickfix.FieldNotFound;

import quickfix.Group;

public class UserNotification extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "CB";
	

	public UserNotification() {
		super();
		getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
	}
	
	public UserNotification(quickfix.field.UserStatus userStatus) {
		this();
		setField(userStatus);
	}
	
	public void set(quickfix.fix50sp1.component.UsernameGrp component) {
		setComponent(component);
	}

	public quickfix.fix50sp1.component.UsernameGrp get(quickfix.fix50sp1.component.UsernameGrp component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp1.component.UsernameGrp getUsernameGrp() throws FieldNotFound {
		return get(new quickfix.fix50sp1.component.UsernameGrp());
	}

	public void set(quickfix.field.NoUsernames value) {
		setField(value);
	}

	public quickfix.field.NoUsernames get(quickfix.field.NoUsernames value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoUsernames getNoUsernames() throws FieldNotFound {
		return get(new quickfix.field.NoUsernames());
	}

	public boolean isSet(quickfix.field.NoUsernames field) {
		return isSetField(field);
	}

	public boolean isSetNoUsernames() {
		return isSetField(809);
	}

	public static class NoUsernames extends Group {

		static final long serialVersionUID = 20050617;

		public NoUsernames() {
			super(809, 553,
				new int[] {553,  0 });
		}
		
	public void set(quickfix.field.Username value) {
		setField(value);
	}

	public quickfix.field.Username get(quickfix.field.Username value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.Username getUsername() throws FieldNotFound {
		return get(new quickfix.field.Username());
	}

	public boolean isSet(quickfix.field.Username field) {
		return isSetField(field);
	}

	public boolean isSetUsername() {
		return isSetField(553);
	}

	}

	public void set(quickfix.field.UserStatus value) {
		setField(value);
	}

	public quickfix.field.UserStatus get(quickfix.field.UserStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.UserStatus getUserStatus() throws FieldNotFound {
		return get(new quickfix.field.UserStatus());
	}

	public boolean isSet(quickfix.field.UserStatus field) {
		return isSetField(field);
	}

	public boolean isSetUserStatus() {
		return isSetField(926);
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

	public void set(quickfix.field.EncodedTextLen value) {
		setField(value);
	}

	public quickfix.field.EncodedTextLen get(quickfix.field.EncodedTextLen value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EncodedTextLen getEncodedTextLen() throws FieldNotFound {
		return get(new quickfix.field.EncodedTextLen());
	}

	public boolean isSet(quickfix.field.EncodedTextLen field) {
		return isSetField(field);
	}

	public boolean isSetEncodedTextLen() {
		return isSetField(354);
	}

	public void set(quickfix.field.EncodedText value) {
		setField(value);
	}

	public quickfix.field.EncodedText get(quickfix.field.EncodedText value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.EncodedText getEncodedText() throws FieldNotFound {
		return get(new quickfix.field.EncodedText());
	}

	public boolean isSet(quickfix.field.EncodedText field) {
		return isSetField(field);
	}

	public boolean isSetEncodedText() {
		return isSetField(355);
	}

}
