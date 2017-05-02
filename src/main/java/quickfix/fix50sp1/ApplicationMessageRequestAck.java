
package quickfix.fix50sp1;

import quickfix.FieldNotFound;

import quickfix.Group;

public class ApplicationMessageRequestAck extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "BX";
	

	public ApplicationMessageRequestAck() {
		super();
		getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
	}
	
	public ApplicationMessageRequestAck(quickfix.field.ApplResponseID applResponseID) {
		this();
		setField(applResponseID);
	}
	
	public void set(quickfix.field.ApplResponseID value) {
		setField(value);
	}

	public quickfix.field.ApplResponseID get(quickfix.field.ApplResponseID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ApplResponseID getApplResponseID() throws FieldNotFound {
		return get(new quickfix.field.ApplResponseID());
	}

	public boolean isSet(quickfix.field.ApplResponseID field) {
		return isSetField(field);
	}

	public boolean isSetApplResponseID() {
		return isSetField(1353);
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

	public void set(quickfix.field.ApplResponseType value) {
		setField(value);
	}

	public quickfix.field.ApplResponseType get(quickfix.field.ApplResponseType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ApplResponseType getApplResponseType() throws FieldNotFound {
		return get(new quickfix.field.ApplResponseType());
	}

	public boolean isSet(quickfix.field.ApplResponseType field) {
		return isSetField(field);
	}

	public boolean isSetApplResponseType() {
		return isSetField(1348);
	}

	public void set(quickfix.field.ApplTotalMessageCount value) {
		setField(value);
	}

	public quickfix.field.ApplTotalMessageCount get(quickfix.field.ApplTotalMessageCount value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ApplTotalMessageCount getApplTotalMessageCount() throws FieldNotFound {
		return get(new quickfix.field.ApplTotalMessageCount());
	}

	public boolean isSet(quickfix.field.ApplTotalMessageCount field) {
		return isSetField(field);
	}

	public boolean isSetApplTotalMessageCount() {
		return isSetField(1349);
	}

	public void set(quickfix.fix50sp1.component.ApplIDRequestAckGrp component) {
		setComponent(component);
	}

	public quickfix.fix50sp1.component.ApplIDRequestAckGrp get(quickfix.fix50sp1.component.ApplIDRequestAckGrp component) throws FieldNotFound {
		getComponent(component);
		return component;
	}

	public quickfix.fix50sp1.component.ApplIDRequestAckGrp getApplIDRequestAckGrp() throws FieldNotFound {
		return get(new quickfix.fix50sp1.component.ApplIDRequestAckGrp());
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
				new int[] {1355, 1182, 1183, 1357, 1354,  0 });
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

	public void set(quickfix.field.RefApplLastSeqNum value) {
		setField(value);
	}

	public quickfix.field.RefApplLastSeqNum get(quickfix.field.RefApplLastSeqNum value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.RefApplLastSeqNum getRefApplLastSeqNum() throws FieldNotFound {
		return get(new quickfix.field.RefApplLastSeqNum());
	}

	public boolean isSet(quickfix.field.RefApplLastSeqNum field) {
		return isSetField(field);
	}

	public boolean isSetRefApplLastSeqNum() {
		return isSetField(1357);
	}

	public void set(quickfix.field.ApplResponseError value) {
		setField(value);
	}

	public quickfix.field.ApplResponseError get(quickfix.field.ApplResponseError value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.field.ApplResponseError getApplResponseError() throws FieldNotFound {
		return get(new quickfix.field.ApplResponseError());
	}

	public boolean isSet(quickfix.field.ApplResponseError field) {
		return isSetField(field);
	}

	public boolean isSetApplResponseError() {
		return isSetField(1354);
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
