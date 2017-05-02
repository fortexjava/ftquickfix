
package quickfix.fix50sp1;

import quickfix.FieldNotFound;

import quickfix.Group;

public class ApplicationMessageRequest extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "BW";
	

	public ApplicationMessageRequest() {
		super();
		getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
	}
	
	public ApplicationMessageRequest(quickfix.field.ApplReqID applReqID, quickfix.field.ApplReqType applReqType) {
		this();
		setField(applReqID);
		setField(applReqType);
	}
	
	public void set(quickfix.field.ApplReqID value) {
		setField(value);
	}

	public quickfix.field.ApplReqID get(quickfix.field.ApplReqID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ApplReqID getApplReqID() throws FieldNotFound {
		return get(new quickfix.field.ApplReqID());
	}

	public boolean isSet(quickfix.field.ApplReqID field) {
		return isSetField(field);
	}

	public boolean isSetApplReqID() {
		return isSetField(1346);
	}

	public void set(quickfix.field.ApplReqType value) {
		setField(value);
	}

	public quickfix.field.ApplReqType get(quickfix.field.ApplReqType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ApplReqType getApplReqType() throws FieldNotFound {
		return get(new quickfix.field.ApplReqType());
	}

	public boolean isSet(quickfix.field.ApplReqType field) {
		return isSetField(field);
	}

	public boolean isSetApplReqType() {
		return isSetField(1347);
	}

	public void set(quickfix.fix50sp1.component.ApplIDRequestGrp component) {
		setComponent(component);
	}

	public quickfix.fix50sp1.component.ApplIDRequestGrp get(quickfix.fix50sp1.component.ApplIDRequestGrp component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp1.component.ApplIDRequestGrp getApplIDRequestGrp() throws FieldNotFound {
		return get(new quickfix.fix50sp1.component.ApplIDRequestGrp());
	}

	public void set(quickfix.field.NoApplIDs value) {
		setField(value);
	}

	public quickfix.field.NoApplIDs get(quickfix.field.NoApplIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.NoApplIDs getNoApplIDs() throws FieldNotFound {
		return get(new quickfix.field.NoApplIDs());
	}

	public boolean isSet(quickfix.field.NoApplIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoApplIDs() {
		return isSetField(1351);
	}

	public static class NoApplIDs extends Group {

		static final long serialVersionUID = 20050617;

		public NoApplIDs() {
			super(1351, 1355,
				new int[] {1355, 1182, 1183,  0 });
		}
		
	public void set(quickfix.field.RefApplID value) {
		setField(value);
	}

	public quickfix.field.RefApplID get(quickfix.field.RefApplID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RefApplID getRefApplID() throws FieldNotFound {
		return get(new quickfix.field.RefApplID());
	}

	public boolean isSet(quickfix.field.RefApplID field) {
		return isSetField(field);
	}

	public boolean isSetRefApplID() {
		return isSetField(1355);
	}

	public void set(quickfix.field.ApplBegSeqNum value) {
		setField(value);
	}

	public quickfix.field.ApplBegSeqNum get(quickfix.field.ApplBegSeqNum value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ApplBegSeqNum getApplBegSeqNum() throws FieldNotFound {
		return get(new quickfix.field.ApplBegSeqNum());
	}

	public boolean isSet(quickfix.field.ApplBegSeqNum field) {
		return isSetField(field);
	}

	public boolean isSetApplBegSeqNum() {
		return isSetField(1182);
	}

	public void set(quickfix.field.ApplEndSeqNum value) {
		setField(value);
	}

	public quickfix.field.ApplEndSeqNum get(quickfix.field.ApplEndSeqNum value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ApplEndSeqNum getApplEndSeqNum() throws FieldNotFound {
		return get(new quickfix.field.ApplEndSeqNum());
	}

	public boolean isSet(quickfix.field.ApplEndSeqNum field) {
		return isSetField(field);
	}

	public boolean isSetApplEndSeqNum() {
		return isSetField(1183);
	}

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
