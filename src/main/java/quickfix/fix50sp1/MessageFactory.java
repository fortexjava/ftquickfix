/* Generated Java Source File */
/*******************************************************************************
 * Copyright (c) quickfixengine.org  All rights reserved. 
 * 
 * This file is part of the QuickFIX FIX Engine 
 * 
 * This file may be distributed under the terms of the quickfixengine.org 
 * license as defined by quickfixengine.org and appearing in the file 
 * LICENSE included in the packaging of this file. 
 * 
 * This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING 
 * THE WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A 
 * PARTICULAR PURPOSE. 
 * 
 * See http://www.quickfixengine.org/LICENSE for licensing information. 
 * 
 * Contact ask@quickfixengine.org if any conditions of this licensing 
 * are not clear to you.
 ******************************************************************************/

package quickfix.fix50sp1;

import quickfix.Message;
import quickfix.Group;

public class MessageFactory implements quickfix.MessageFactory {

	public Message create(String beginString, String msgType) {
		
		if (quickfix.fix50sp1.IOI.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.IOI();
		}
	
		if (quickfix.fix50sp1.Advertisement.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.Advertisement();
		}
	
		if (quickfix.fix50sp1.ExecutionReport.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.ExecutionReport();
		}
	
		if (quickfix.fix50sp1.OrderCancelReject.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.OrderCancelReject();
		}
	
		if (quickfix.fix50sp1.DerivativeSecurityList.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.DerivativeSecurityList();
		}
	
		if (quickfix.fix50sp1.NewOrderMultileg.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.NewOrderMultileg();
		}
	
		if (quickfix.fix50sp1.MultilegOrderCancelReplace.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.MultilegOrderCancelReplace();
		}
	
		if (quickfix.fix50sp1.TradeCaptureReportRequest.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.TradeCaptureReportRequest();
		}
	
		if (quickfix.fix50sp1.TradeCaptureReport.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.TradeCaptureReport();
		}
	
		if (quickfix.fix50sp1.OrderMassStatusRequest.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.OrderMassStatusRequest();
		}
	
		if (quickfix.fix50sp1.QuoteRequestReject.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.QuoteRequestReject();
		}
	
		if (quickfix.fix50sp1.RFQRequest.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.RFQRequest();
		}
	
		if (quickfix.fix50sp1.QuoteStatusReport.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.QuoteStatusReport();
		}
	
		if (quickfix.fix50sp1.QuoteResponse.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.QuoteResponse();
		}
	
		if (quickfix.fix50sp1.Confirmation.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.Confirmation();
		}
	
		if (quickfix.fix50sp1.PositionMaintenanceRequest.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.PositionMaintenanceRequest();
		}
	
		if (quickfix.fix50sp1.PositionMaintenanceReport.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.PositionMaintenanceReport();
		}
	
		if (quickfix.fix50sp1.RequestForPositions.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.RequestForPositions();
		}
	
		if (quickfix.fix50sp1.RequestForPositionsAck.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.RequestForPositionsAck();
		}
	
		if (quickfix.fix50sp1.PositionReport.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.PositionReport();
		}
	
		if (quickfix.fix50sp1.TradeCaptureReportRequestAck.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.TradeCaptureReportRequestAck();
		}
	
		if (quickfix.fix50sp1.TradeCaptureReportAck.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.TradeCaptureReportAck();
		}
	
		if (quickfix.fix50sp1.AllocationReport.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.AllocationReport();
		}
	
		if (quickfix.fix50sp1.AllocationReportAck.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.AllocationReportAck();
		}
	
		if (quickfix.fix50sp1.ConfirmationAck.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.ConfirmationAck();
		}
	
		if (quickfix.fix50sp1.SettlementInstructionRequest.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.SettlementInstructionRequest();
		}
	
		if (quickfix.fix50sp1.AssignmentReport.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.AssignmentReport();
		}
	
		if (quickfix.fix50sp1.CollateralRequest.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.CollateralRequest();
		}
	
		if (quickfix.fix50sp1.CollateralAssignment.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.CollateralAssignment();
		}
	
		if (quickfix.fix50sp1.CollateralResponse.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.CollateralResponse();
		}
	
		if (quickfix.fix50sp1.News.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.News();
		}
	
		if (quickfix.fix50sp1.CollateralReport.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.CollateralReport();
		}
	
		if (quickfix.fix50sp1.CollateralInquiry.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.CollateralInquiry();
		}
	
		if (quickfix.fix50sp1.NetworkCounterpartySystemStatusRequest.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.NetworkCounterpartySystemStatusRequest();
		}
	
		if (quickfix.fix50sp1.NetworkCounterpartySystemStatusResponse.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.NetworkCounterpartySystemStatusResponse();
		}
	
		if (quickfix.fix50sp1.UserRequest.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.UserRequest();
		}
	
		if (quickfix.fix50sp1.UserResponse.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.UserResponse();
		}
	
		if (quickfix.fix50sp1.CollateralInquiryAck.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.CollateralInquiryAck();
		}
	
		if (quickfix.fix50sp1.ConfirmationRequest.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.ConfirmationRequest();
		}
	
		if (quickfix.fix50sp1.TradingSessionListRequest.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.TradingSessionListRequest();
		}
	
		if (quickfix.fix50sp1.TradingSessionList.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.TradingSessionList();
		}
	
		if (quickfix.fix50sp1.SecurityListUpdateReport.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.SecurityListUpdateReport();
		}
	
		if (quickfix.fix50sp1.AdjustedPositionReport.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.AdjustedPositionReport();
		}
	
		if (quickfix.fix50sp1.AllocationInstructionAlert.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.AllocationInstructionAlert();
		}
	
		if (quickfix.fix50sp1.ExecutionAcknowledgement.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.ExecutionAcknowledgement();
		}
	
		if (quickfix.fix50sp1.ContraryIntentionReport.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.ContraryIntentionReport();
		}
	
		if (quickfix.fix50sp1.SecurityDefinitionUpdateReport.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.SecurityDefinitionUpdateReport();
		}
	
		if (quickfix.fix50sp1.SettlementObligationReport.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.SettlementObligationReport();
		}
	
		if (quickfix.fix50sp1.DerivativeSecurityListUpdateReport.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.DerivativeSecurityListUpdateReport();
		}
	
		if (quickfix.fix50sp1.TradingSessionListUpdateReport.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.TradingSessionListUpdateReport();
		}
	
		if (quickfix.fix50sp1.MarketDefinitionRequest.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.MarketDefinitionRequest();
		}
	
		if (quickfix.fix50sp1.MarketDefinition.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.MarketDefinition();
		}
	
		if (quickfix.fix50sp1.MarketDefinitionUpdateReport.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.MarketDefinitionUpdateReport();
		}
	
		if (quickfix.fix50sp1.ApplicationMessageRequest.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.ApplicationMessageRequest();
		}
	
		if (quickfix.fix50sp1.ApplicationMessageRequestAck.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.ApplicationMessageRequestAck();
		}
	
		if (quickfix.fix50sp1.ApplicationMessageReport.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.ApplicationMessageReport();
		}
	
		if (quickfix.fix50sp1.OrderMassActionReport.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.OrderMassActionReport();
		}
	
		if (quickfix.fix50sp1.Email.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.Email();
		}
	
		if (quickfix.fix50sp1.OrderMassActionRequest.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.OrderMassActionRequest();
		}
	
		if (quickfix.fix50sp1.UserNotification.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.UserNotification();
		}
	
		if (quickfix.fix50sp1.NewOrderSingle.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.NewOrderSingle();
		}
	
		if (quickfix.fix50sp1.NewOrderList.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.NewOrderList();
		}
	
		if (quickfix.fix50sp1.OrderCancelRequest.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.OrderCancelRequest();
		}
	
		if (quickfix.fix50sp1.OrderCancelReplaceRequest.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.OrderCancelReplaceRequest();
		}
	
		if (quickfix.fix50sp1.OrderStatusRequest.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.OrderStatusRequest();
		}
	
		if (quickfix.fix50sp1.AllocationInstruction.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.AllocationInstruction();
		}
	
		if (quickfix.fix50sp1.ListCancelRequest.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.ListCancelRequest();
		}
	
		if (quickfix.fix50sp1.ListExecute.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.ListExecute();
		}
	
		if (quickfix.fix50sp1.ListStatusRequest.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.ListStatusRequest();
		}
	
		if (quickfix.fix50sp1.ListStatus.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.ListStatus();
		}
	
		if (quickfix.fix50sp1.AllocationInstructionAck.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.AllocationInstructionAck();
		}
	
		if (quickfix.fix50sp1.DontKnowTrade.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.DontKnowTrade();
		}
	
		if (quickfix.fix50sp1.QuoteRequest.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.QuoteRequest();
		}
	
		if (quickfix.fix50sp1.Quote.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.Quote();
		}
	
		if (quickfix.fix50sp1.SettlementInstructions.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.SettlementInstructions();
		}
	
		if (quickfix.fix50sp1.MarketDataRequest.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.MarketDataRequest();
		}
	
		if (quickfix.fix50sp1.MarketDataSnapshotFullRefresh.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.MarketDataSnapshotFullRefresh();
		}
	
		if (quickfix.fix50sp1.MarketDataIncrementalRefresh.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.MarketDataIncrementalRefresh();
		}
	
		if (quickfix.fix50sp1.MarketDataRequestReject.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.MarketDataRequestReject();
		}
	
		if (quickfix.fix50sp1.QuoteCancel.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.QuoteCancel();
		}
	
		if (quickfix.fix50sp1.QuoteStatusRequest.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.QuoteStatusRequest();
		}
	
		if (quickfix.fix50sp1.MassQuoteAcknowledgement.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.MassQuoteAcknowledgement();
		}
	
		if (quickfix.fix50sp1.SecurityDefinitionRequest.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.SecurityDefinitionRequest();
		}
	
		if (quickfix.fix50sp1.SecurityDefinition.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.SecurityDefinition();
		}
	
		if (quickfix.fix50sp1.SecurityStatusRequest.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.SecurityStatusRequest();
		}
	
		if (quickfix.fix50sp1.SecurityStatus.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.SecurityStatus();
		}
	
		if (quickfix.fix50sp1.TradingSessionStatusRequest.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.TradingSessionStatusRequest();
		}
	
		if (quickfix.fix50sp1.TradingSessionStatus.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.TradingSessionStatus();
		}
	
		if (quickfix.fix50sp1.MassQuote.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.MassQuote();
		}
	
		if (quickfix.fix50sp1.BusinessMessageReject.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.BusinessMessageReject();
		}
	
		if (quickfix.fix50sp1.BidRequest.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.BidRequest();
		}
	
		if (quickfix.fix50sp1.BidResponse.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.BidResponse();
		}
	
		if (quickfix.fix50sp1.ListStrikePrice.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.ListStrikePrice();
		}
	
		if (quickfix.fix50sp1.RegistrationInstructions.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.RegistrationInstructions();
		}
	
		if (quickfix.fix50sp1.RegistrationInstructionsResponse.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.RegistrationInstructionsResponse();
		}
	
		if (quickfix.fix50sp1.OrderMassCancelRequest.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.OrderMassCancelRequest();
		}
	
		if (quickfix.fix50sp1.OrderMassCancelReport.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.OrderMassCancelReport();
		}
	
		if (quickfix.fix50sp1.NewOrderCross.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.NewOrderCross();
		}
	
		if (quickfix.fix50sp1.CrossOrderCancelReplaceRequest.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.CrossOrderCancelReplaceRequest();
		}
	
		if (quickfix.fix50sp1.CrossOrderCancelRequest.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.CrossOrderCancelRequest();
		}
	
		if (quickfix.fix50sp1.SecurityTypeRequest.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.SecurityTypeRequest();
		}
	
		if (quickfix.fix50sp1.SecurityTypes.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.SecurityTypes();
		}
	
		if (quickfix.fix50sp1.SecurityListRequest.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.SecurityListRequest();
		}
	
		if (quickfix.fix50sp1.SecurityList.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.SecurityList();
		}
	
		if (quickfix.fix50sp1.DerivativeSecurityListRequest.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp1.DerivativeSecurityListRequest();
		}
	
		return new quickfix.fix50sp1.Message();
	}

	public Group create(String beginString, String msgType, int correspondingFieldID) {
		
		if (quickfix.fix50sp1.IOI.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp1.IOI.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp1.IOI.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp1.IOI.NoUnderlyings();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp1.IOI.NoStipulations();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp1.IOI.NoLegs();
	
				case quickfix.field.NoLegStipulations.FIELD:
					return new quickfix.fix50sp1.IOI.NoLegs.NoLegStipulations();
	
				case quickfix.field.NoIOIQualifiers.FIELD:
					return new quickfix.fix50sp1.IOI.NoIOIQualifiers();
	
				case quickfix.field.NoRoutingIDs.FIELD:
					return new quickfix.fix50sp1.IOI.NoRoutingIDs();
	
			}
		}
	
		if (quickfix.fix50sp1.Advertisement.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp1.Advertisement.NoLegs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp1.Advertisement.NoUnderlyings();
	
			}
		}
	
		if (quickfix.fix50sp1.ExecutionReport.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp1.ExecutionReport.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp1.ExecutionReport.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoContraBrokers.FIELD:
					return new quickfix.fix50sp1.ExecutionReport.NoContraBrokers();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix50sp1.ExecutionReport.NoAllocs();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp1.ExecutionReport.NoAllocs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp1.ExecutionReport.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp1.ExecutionReport.NoUnderlyings();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp1.ExecutionReport.NoStipulations();
	
				case quickfix.field.NoStrategyParameters.FIELD:
					return new quickfix.fix50sp1.ExecutionReport.NoStrategyParameters();
	
				case quickfix.field.NoFills.FIELD:
					return new quickfix.fix50sp1.ExecutionReport.NoFills();
	
				case quickfix.field.NoNested4PartyIDs.FIELD:
					return new quickfix.fix50sp1.ExecutionReport.NoFills.NoNested4PartyIDs();
	
				case quickfix.field.NoNested4PartySubIDs.FIELD:
					return new quickfix.fix50sp1.ExecutionReport.NoFills.NoNested4PartyIDs.NoNested4PartySubIDs();
	
				case quickfix.field.NoContAmts.FIELD:
					return new quickfix.fix50sp1.ExecutionReport.NoContAmts();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp1.ExecutionReport.NoLegs();
	
				case quickfix.field.NoLegStipulations.FIELD:
					return new quickfix.fix50sp1.ExecutionReport.NoLegs.NoLegStipulations();
	
				case quickfix.field.NoLegAllocs.FIELD:
					return new quickfix.fix50sp1.ExecutionReport.NoLegs.NoLegAllocs();
	
				case quickfix.field.NoNested2PartyIDs.FIELD:
					return new quickfix.fix50sp1.ExecutionReport.NoLegs.NoLegAllocs.NoNested2PartyIDs();
	
				case quickfix.field.NoNested2PartySubIDs.FIELD:
					return new quickfix.fix50sp1.ExecutionReport.NoLegs.NoLegAllocs.NoNested2PartyIDs.NoNested2PartySubIDs();
	
				case quickfix.field.NoNested3PartyIDs.FIELD:
					return new quickfix.fix50sp1.ExecutionReport.NoLegs.NoNested3PartyIDs();
	
				case quickfix.field.NoNested3PartySubIDs.FIELD:
					return new quickfix.fix50sp1.ExecutionReport.NoLegs.NoNested3PartyIDs.NoNested3PartySubIDs();
	
				case quickfix.field.NoMiscFees.FIELD:
					return new quickfix.fix50sp1.ExecutionReport.NoMiscFees();
	
				case quickfix.field.NoTrdRegTimestamps.FIELD:
					return new quickfix.fix50sp1.ExecutionReport.NoTrdRegTimestamps();
	
			}
		}
	
		if (quickfix.fix50sp1.DerivativeSecurityList.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoRelatedSym.FIELD:
					return new quickfix.fix50sp1.DerivativeSecurityList.NoRelatedSym();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp1.DerivativeSecurityList.NoRelatedSym.NoLegs();
	
			}
		}
	
		if (quickfix.fix50sp1.NewOrderMultileg.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp1.NewOrderMultileg.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp1.NewOrderMultileg.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix50sp1.NewOrderMultileg.NoAllocs();
	
				case quickfix.field.NoNested3PartyIDs.FIELD:
					return new quickfix.fix50sp1.NewOrderMultileg.NoAllocs.NoNested3PartyIDs();
	
				case quickfix.field.NoNested3PartySubIDs.FIELD:
					return new quickfix.fix50sp1.NewOrderMultileg.NoAllocs.NoNested3PartyIDs.NoNested3PartySubIDs();
	
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix50sp1.NewOrderMultileg.NoTradingSessions();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp1.NewOrderMultileg.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp1.NewOrderMultileg.NoLegs();
	
				case quickfix.field.NoLegStipulations.FIELD:
					return new quickfix.fix50sp1.NewOrderMultileg.NoLegs.NoLegStipulations();
	
				case quickfix.field.NoLegAllocs.FIELD:
					return new quickfix.fix50sp1.NewOrderMultileg.NoLegs.NoLegAllocs();
	
				case quickfix.field.NoNested2PartyIDs.FIELD:
					return new quickfix.fix50sp1.NewOrderMultileg.NoLegs.NoLegAllocs.NoNested2PartyIDs();
	
				case quickfix.field.NoNested2PartySubIDs.FIELD:
					return new quickfix.fix50sp1.NewOrderMultileg.NoLegs.NoLegAllocs.NoNested2PartyIDs.NoNested2PartySubIDs();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp1.NewOrderMultileg.NoLegs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp1.NewOrderMultileg.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoStrategyParameters.FIELD:
					return new quickfix.fix50sp1.NewOrderMultileg.NoStrategyParameters();
	
			}
		}
	
		if (quickfix.fix50sp1.MultilegOrderCancelReplace.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp1.MultilegOrderCancelReplace.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp1.MultilegOrderCancelReplace.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix50sp1.MultilegOrderCancelReplace.NoAllocs();
	
				case quickfix.field.NoNested3PartyIDs.FIELD:
					return new quickfix.fix50sp1.MultilegOrderCancelReplace.NoAllocs.NoNested3PartyIDs();
	
				case quickfix.field.NoNested3PartySubIDs.FIELD:
					return new quickfix.fix50sp1.MultilegOrderCancelReplace.NoAllocs.NoNested3PartyIDs.NoNested3PartySubIDs();
	
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix50sp1.MultilegOrderCancelReplace.NoTradingSessions();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp1.MultilegOrderCancelReplace.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp1.MultilegOrderCancelReplace.NoLegs();
	
				case quickfix.field.NoLegStipulations.FIELD:
					return new quickfix.fix50sp1.MultilegOrderCancelReplace.NoLegs.NoLegStipulations();
	
				case quickfix.field.NoLegAllocs.FIELD:
					return new quickfix.fix50sp1.MultilegOrderCancelReplace.NoLegs.NoLegAllocs();
	
				case quickfix.field.NoNested2PartyIDs.FIELD:
					return new quickfix.fix50sp1.MultilegOrderCancelReplace.NoLegs.NoLegAllocs.NoNested2PartyIDs();
	
				case quickfix.field.NoNested2PartySubIDs.FIELD:
					return new quickfix.fix50sp1.MultilegOrderCancelReplace.NoLegs.NoLegAllocs.NoNested2PartyIDs.NoNested2PartySubIDs();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp1.MultilegOrderCancelReplace.NoLegs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp1.MultilegOrderCancelReplace.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoStrategyParameters.FIELD:
					return new quickfix.fix50sp1.MultilegOrderCancelReplace.NoStrategyParameters();
	
			}
		}
	
		if (quickfix.fix50sp1.TradeCaptureReportRequest.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp1.TradeCaptureReportRequest.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp1.TradeCaptureReportRequest.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp1.TradeCaptureReportRequest.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp1.TradeCaptureReportRequest.NoLegs();
	
				case quickfix.field.NoDates.FIELD:
					return new quickfix.fix50sp1.TradeCaptureReportRequest.NoDates();
	
			}
		}
	
		if (quickfix.fix50sp1.TradeCaptureReport.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoRootPartyIDs.FIELD:
					return new quickfix.fix50sp1.TradeCaptureReport.NoRootPartyIDs();
	
				case quickfix.field.NoRootPartySubIDs.FIELD:
					return new quickfix.fix50sp1.TradeCaptureReport.NoRootPartyIDs.NoRootPartySubIDs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp1.TradeCaptureReport.NoUnderlyings();
	
				case quickfix.field.NoPosAmt.FIELD:
					return new quickfix.fix50sp1.TradeCaptureReport.NoPosAmt();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp1.TradeCaptureReport.NoLegs();
	
				case quickfix.field.NoLegStipulations.FIELD:
					return new quickfix.fix50sp1.TradeCaptureReport.NoLegs.NoLegStipulations();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp1.TradeCaptureReport.NoLegs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp1.TradeCaptureReport.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoOfLegUnderlyings.FIELD:
					return new quickfix.fix50sp1.TradeCaptureReport.NoLegs.NoOfLegUnderlyings();
	
				case quickfix.field.NoTrdRegTimestamps.FIELD:
					return new quickfix.fix50sp1.TradeCaptureReport.NoTrdRegTimestamps();
	
				case quickfix.field.NoSides.FIELD:
					return new quickfix.fix50sp1.TradeCaptureReport.NoSides();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp1.TradeCaptureReport.NoSides.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp1.TradeCaptureReport.NoSides.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoClearingInstructions.FIELD:
					return new quickfix.fix50sp1.TradeCaptureReport.NoSides.NoClearingInstructions();
	
				case quickfix.field.NoContAmts.FIELD:
					return new quickfix.fix50sp1.TradeCaptureReport.NoSides.NoContAmts();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp1.TradeCaptureReport.NoSides.NoStipulations();
	
				case quickfix.field.NoMiscFees.FIELD:
					return new quickfix.fix50sp1.TradeCaptureReport.NoSides.NoMiscFees();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix50sp1.TradeCaptureReport.NoSides.NoAllocs();
	
				case quickfix.field.NoNested2PartyIDs.FIELD:
					return new quickfix.fix50sp1.TradeCaptureReport.NoSides.NoAllocs.NoNested2PartyIDs();
	
				case quickfix.field.NoNested2PartySubIDs.FIELD:
					return new quickfix.fix50sp1.TradeCaptureReport.NoSides.NoAllocs.NoNested2PartyIDs.NoNested2PartySubIDs();
	
				case quickfix.field.NoSideTrdRegTS.FIELD:
					return new quickfix.fix50sp1.TradeCaptureReport.NoSides.NoSideTrdRegTS();
	
				case quickfix.field.NoSettlDetails.FIELD:
					return new quickfix.fix50sp1.TradeCaptureReport.NoSides.NoSettlDetails();
	
				case quickfix.field.NoSettlPartyIDs.FIELD:
					return new quickfix.fix50sp1.TradeCaptureReport.NoSides.NoSettlDetails.NoSettlPartyIDs();
	
				case quickfix.field.NoSettlPartySubIDs.FIELD:
					return new quickfix.fix50sp1.TradeCaptureReport.NoSides.NoSettlDetails.NoSettlPartyIDs.NoSettlPartySubIDs();
	
				case quickfix.field.NoTrdRepIndicators.FIELD:
					return new quickfix.fix50sp1.TradeCaptureReport.NoTrdRepIndicators();
	
			}
		}
	
		if (quickfix.fix50sp1.OrderMassStatusRequest.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp1.OrderMassStatusRequest.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp1.OrderMassStatusRequest.NoPartyIDs.NoPartySubIDs();
	
			}
		}
	
		if (quickfix.fix50sp1.QuoteRequestReject.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoRootPartyIDs.FIELD:
					return new quickfix.fix50sp1.QuoteRequestReject.NoRootPartyIDs();
	
				case quickfix.field.NoRootPartySubIDs.FIELD:
					return new quickfix.fix50sp1.QuoteRequestReject.NoRootPartyIDs.NoRootPartySubIDs();
	
				case quickfix.field.NoRelatedSym.FIELD:
					return new quickfix.fix50sp1.QuoteRequestReject.NoRelatedSym();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp1.QuoteRequestReject.NoRelatedSym.NoUnderlyings();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp1.QuoteRequestReject.NoRelatedSym.NoStipulations();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp1.QuoteRequestReject.NoRelatedSym.NoLegs();
	
				case quickfix.field.NoLegStipulations.FIELD:
					return new quickfix.fix50sp1.QuoteRequestReject.NoRelatedSym.NoLegs.NoLegStipulations();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp1.QuoteRequestReject.NoRelatedSym.NoLegs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp1.QuoteRequestReject.NoRelatedSym.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoQuoteQualifiers.FIELD:
					return new quickfix.fix50sp1.QuoteRequestReject.NoRelatedSym.NoQuoteQualifiers();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp1.QuoteRequestReject.NoRelatedSym.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp1.QuoteRequestReject.NoRelatedSym.NoPartyIDs.NoPartySubIDs();
	
			}
		}
	
		if (quickfix.fix50sp1.RFQRequest.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp1.RFQRequest.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp1.RFQRequest.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoRelatedSym.FIELD:
					return new quickfix.fix50sp1.RFQRequest.NoRelatedSym();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp1.RFQRequest.NoRelatedSym.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp1.RFQRequest.NoRelatedSym.NoLegs();
	
			}
		}
	
		if (quickfix.fix50sp1.QuoteStatusReport.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp1.QuoteStatusReport.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp1.QuoteStatusReport.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp1.QuoteStatusReport.NoUnderlyings();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp1.QuoteStatusReport.NoStipulations();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp1.QuoteStatusReport.NoLegs();
	
				case quickfix.field.NoLegStipulations.FIELD:
					return new quickfix.fix50sp1.QuoteStatusReport.NoLegs.NoLegStipulations();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp1.QuoteStatusReport.NoLegs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp1.QuoteStatusReport.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoQuoteQualifiers.FIELD:
					return new quickfix.fix50sp1.QuoteStatusReport.NoQuoteQualifiers();
	
			}
		}
	
		if (quickfix.fix50sp1.QuoteResponse.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoQuoteQualifiers.FIELD:
					return new quickfix.fix50sp1.QuoteResponse.NoQuoteQualifiers();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp1.QuoteResponse.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp1.QuoteResponse.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp1.QuoteResponse.NoUnderlyings();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp1.QuoteResponse.NoStipulations();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp1.QuoteResponse.NoLegs();
	
				case quickfix.field.NoLegStipulations.FIELD:
					return new quickfix.fix50sp1.QuoteResponse.NoLegs.NoLegStipulations();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp1.QuoteResponse.NoLegs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp1.QuoteResponse.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
			}
		}
	
		if (quickfix.fix50sp1.Confirmation.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp1.Confirmation.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp1.Confirmation.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoOrders.FIELD:
					return new quickfix.fix50sp1.Confirmation.NoOrders();
	
				case quickfix.field.NoNested2PartyIDs.FIELD:
					return new quickfix.fix50sp1.Confirmation.NoOrders.NoNested2PartyIDs();
	
				case quickfix.field.NoNested2PartySubIDs.FIELD:
					return new quickfix.fix50sp1.Confirmation.NoOrders.NoNested2PartyIDs.NoNested2PartySubIDs();
	
				case quickfix.field.NoTrdRegTimestamps.FIELD:
					return new quickfix.fix50sp1.Confirmation.NoTrdRegTimestamps();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp1.Confirmation.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp1.Confirmation.NoLegs();
	
				case quickfix.field.NoCapacities.FIELD:
					return new quickfix.fix50sp1.Confirmation.NoCapacities();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp1.Confirmation.NoStipulations();
	
				case quickfix.field.NoMiscFees.FIELD:
					return new quickfix.fix50sp1.Confirmation.NoMiscFees();
	
			}
		}
	
		if (quickfix.fix50sp1.PositionMaintenanceRequest.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp1.PositionMaintenanceRequest.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp1.PositionMaintenanceRequest.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp1.PositionMaintenanceRequest.NoLegs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp1.PositionMaintenanceRequest.NoUnderlyings();
	
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix50sp1.PositionMaintenanceRequest.NoTradingSessions();
	
				case quickfix.field.NoPositions.FIELD:
					return new quickfix.fix50sp1.PositionMaintenanceRequest.NoPositions();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp1.PositionMaintenanceRequest.NoPositions.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp1.PositionMaintenanceRequest.NoPositions.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoPosAmt.FIELD:
					return new quickfix.fix50sp1.PositionMaintenanceRequest.NoPosAmt();
	
			}
		}
	
		if (quickfix.fix50sp1.PositionMaintenanceReport.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp1.PositionMaintenanceReport.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp1.PositionMaintenanceReport.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp1.PositionMaintenanceReport.NoLegs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp1.PositionMaintenanceReport.NoUnderlyings();
	
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix50sp1.PositionMaintenanceReport.NoTradingSessions();
	
				case quickfix.field.NoPositions.FIELD:
					return new quickfix.fix50sp1.PositionMaintenanceReport.NoPositions();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp1.PositionMaintenanceReport.NoPositions.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp1.PositionMaintenanceReport.NoPositions.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoPosAmt.FIELD:
					return new quickfix.fix50sp1.PositionMaintenanceReport.NoPosAmt();
	
			}
		}
	
		if (quickfix.fix50sp1.RequestForPositions.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp1.RequestForPositions.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp1.RequestForPositions.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp1.RequestForPositions.NoLegs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp1.RequestForPositions.NoUnderlyings();
	
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix50sp1.RequestForPositions.NoTradingSessions();
	
			}
		}
	
		if (quickfix.fix50sp1.RequestForPositionsAck.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp1.RequestForPositionsAck.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp1.RequestForPositionsAck.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp1.RequestForPositionsAck.NoLegs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp1.RequestForPositionsAck.NoUnderlyings();
	
			}
		}
	
		if (quickfix.fix50sp1.PositionReport.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp1.PositionReport.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp1.PositionReport.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp1.PositionReport.NoLegs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp1.PositionReport.NoUnderlyings();
	
				case quickfix.field.NoUnderlyingAmounts.FIELD:
					return new quickfix.fix50sp1.PositionReport.NoUnderlyings.NoUnderlyingAmounts();
	
				case quickfix.field.NoPositions.FIELD:
					return new quickfix.fix50sp1.PositionReport.NoPositions();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp1.PositionReport.NoPositions.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp1.PositionReport.NoPositions.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoPosAmt.FIELD:
					return new quickfix.fix50sp1.PositionReport.NoPosAmt();
	
			}
		}
	
		if (quickfix.fix50sp1.TradeCaptureReportRequestAck.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp1.TradeCaptureReportRequestAck.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp1.TradeCaptureReportRequestAck.NoLegs();
	
			}
		}
	
		if (quickfix.fix50sp1.TradeCaptureReportAck.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoRootPartyIDs.FIELD:
					return new quickfix.fix50sp1.TradeCaptureReportAck.NoRootPartyIDs();
	
				case quickfix.field.NoRootPartySubIDs.FIELD:
					return new quickfix.fix50sp1.TradeCaptureReportAck.NoRootPartyIDs.NoRootPartySubIDs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp1.TradeCaptureReportAck.NoUnderlyings();
	
				case quickfix.field.NoTrdRepIndicators.FIELD:
					return new quickfix.fix50sp1.TradeCaptureReportAck.NoTrdRepIndicators();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp1.TradeCaptureReportAck.NoLegs();
	
				case quickfix.field.NoLegStipulations.FIELD:
					return new quickfix.fix50sp1.TradeCaptureReportAck.NoLegs.NoLegStipulations();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp1.TradeCaptureReportAck.NoLegs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp1.TradeCaptureReportAck.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoOfLegUnderlyings.FIELD:
					return new quickfix.fix50sp1.TradeCaptureReportAck.NoLegs.NoOfLegUnderlyings();
	
				case quickfix.field.NoTrdRegTimestamps.FIELD:
					return new quickfix.fix50sp1.TradeCaptureReportAck.NoTrdRegTimestamps();
	
				case quickfix.field.NoPosAmt.FIELD:
					return new quickfix.fix50sp1.TradeCaptureReportAck.NoPosAmt();
	
				case quickfix.field.NoSides.FIELD:
					return new quickfix.fix50sp1.TradeCaptureReportAck.NoSides();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp1.TradeCaptureReportAck.NoSides.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp1.TradeCaptureReportAck.NoSides.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoClearingInstructions.FIELD:
					return new quickfix.fix50sp1.TradeCaptureReportAck.NoSides.NoClearingInstructions();
	
				case quickfix.field.NoContAmts.FIELD:
					return new quickfix.fix50sp1.TradeCaptureReportAck.NoSides.NoContAmts();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp1.TradeCaptureReportAck.NoSides.NoStipulations();
	
				case quickfix.field.NoMiscFees.FIELD:
					return new quickfix.fix50sp1.TradeCaptureReportAck.NoSides.NoMiscFees();
	
				case quickfix.field.NoSettlDetails.FIELD:
					return new quickfix.fix50sp1.TradeCaptureReportAck.NoSides.NoSettlDetails();
	
				case quickfix.field.NoSettlPartyIDs.FIELD:
					return new quickfix.fix50sp1.TradeCaptureReportAck.NoSides.NoSettlDetails.NoSettlPartyIDs();
	
				case quickfix.field.NoSettlPartySubIDs.FIELD:
					return new quickfix.fix50sp1.TradeCaptureReportAck.NoSides.NoSettlDetails.NoSettlPartyIDs.NoSettlPartySubIDs();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix50sp1.TradeCaptureReportAck.NoSides.NoAllocs();
	
				case quickfix.field.NoNested2PartyIDs.FIELD:
					return new quickfix.fix50sp1.TradeCaptureReportAck.NoSides.NoAllocs.NoNested2PartyIDs();
	
				case quickfix.field.NoNested2PartySubIDs.FIELD:
					return new quickfix.fix50sp1.TradeCaptureReportAck.NoSides.NoAllocs.NoNested2PartyIDs.NoNested2PartySubIDs();
	
				case quickfix.field.NoSideTrdRegTS.FIELD:
					return new quickfix.fix50sp1.TradeCaptureReportAck.NoSides.NoSideTrdRegTS();
	
			}
		}
	
		if (quickfix.fix50sp1.AllocationReport.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoOrders.FIELD:
					return new quickfix.fix50sp1.AllocationReport.NoOrders();
	
				case quickfix.field.NoNested2PartyIDs.FIELD:
					return new quickfix.fix50sp1.AllocationReport.NoOrders.NoNested2PartyIDs();
	
				case quickfix.field.NoNested2PartySubIDs.FIELD:
					return new quickfix.fix50sp1.AllocationReport.NoOrders.NoNested2PartyIDs.NoNested2PartySubIDs();
	
				case quickfix.field.NoExecs.FIELD:
					return new quickfix.fix50sp1.AllocationReport.NoExecs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp1.AllocationReport.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp1.AllocationReport.NoLegs();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp1.AllocationReport.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp1.AllocationReport.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp1.AllocationReport.NoStipulations();
	
				case quickfix.field.NoPosAmt.FIELD:
					return new quickfix.fix50sp1.AllocationReport.NoPosAmt();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix50sp1.AllocationReport.NoAllocs();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp1.AllocationReport.NoAllocs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp1.AllocationReport.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoMiscFees.FIELD:
					return new quickfix.fix50sp1.AllocationReport.NoAllocs.NoMiscFees();
	
				case quickfix.field.NoClearingInstructions.FIELD:
					return new quickfix.fix50sp1.AllocationReport.NoAllocs.NoClearingInstructions();
	
			}
		}
	
		if (quickfix.fix50sp1.AllocationReportAck.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp1.AllocationReportAck.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp1.AllocationReportAck.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix50sp1.AllocationReportAck.NoAllocs();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp1.AllocationReportAck.NoAllocs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp1.AllocationReportAck.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
			}
		}
	
		if (quickfix.fix50sp1.SettlementInstructionRequest.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp1.SettlementInstructionRequest.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp1.SettlementInstructionRequest.NoPartyIDs.NoPartySubIDs();
	
			}
		}
	
		if (quickfix.fix50sp1.AssignmentReport.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp1.AssignmentReport.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp1.AssignmentReport.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp1.AssignmentReport.NoLegs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp1.AssignmentReport.NoUnderlyings();
	
				case quickfix.field.NoPositions.FIELD:
					return new quickfix.fix50sp1.AssignmentReport.NoPositions();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp1.AssignmentReport.NoPositions.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp1.AssignmentReport.NoPositions.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoPosAmt.FIELD:
					return new quickfix.fix50sp1.AssignmentReport.NoPosAmt();
	
			}
		}
	
		if (quickfix.fix50sp1.CollateralRequest.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp1.CollateralRequest.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp1.CollateralRequest.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoExecs.FIELD:
					return new quickfix.fix50sp1.CollateralRequest.NoExecs();
	
				case quickfix.field.NoTrades.FIELD:
					return new quickfix.fix50sp1.CollateralRequest.NoTrades();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp1.CollateralRequest.NoLegs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp1.CollateralRequest.NoUnderlyings();
	
				case quickfix.field.NoTrdRegTimestamps.FIELD:
					return new quickfix.fix50sp1.CollateralRequest.NoTrdRegTimestamps();
	
				case quickfix.field.NoMiscFees.FIELD:
					return new quickfix.fix50sp1.CollateralRequest.NoMiscFees();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp1.CollateralRequest.NoStipulations();
	
			}
		}
	
		if (quickfix.fix50sp1.CollateralAssignment.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp1.CollateralAssignment.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp1.CollateralAssignment.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoExecs.FIELD:
					return new quickfix.fix50sp1.CollateralAssignment.NoExecs();
	
				case quickfix.field.NoTrades.FIELD:
					return new quickfix.fix50sp1.CollateralAssignment.NoTrades();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp1.CollateralAssignment.NoLegs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp1.CollateralAssignment.NoUnderlyings();
	
				case quickfix.field.NoTrdRegTimestamps.FIELD:
					return new quickfix.fix50sp1.CollateralAssignment.NoTrdRegTimestamps();
	
				case quickfix.field.NoMiscFees.FIELD:
					return new quickfix.fix50sp1.CollateralAssignment.NoMiscFees();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp1.CollateralAssignment.NoStipulations();
	
			}
		}
	
		if (quickfix.fix50sp1.CollateralResponse.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp1.CollateralResponse.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp1.CollateralResponse.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoExecs.FIELD:
					return new quickfix.fix50sp1.CollateralResponse.NoExecs();
	
				case quickfix.field.NoTrades.FIELD:
					return new quickfix.fix50sp1.CollateralResponse.NoTrades();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp1.CollateralResponse.NoLegs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp1.CollateralResponse.NoUnderlyings();
	
				case quickfix.field.NoTrdRegTimestamps.FIELD:
					return new quickfix.fix50sp1.CollateralResponse.NoTrdRegTimestamps();
	
				case quickfix.field.NoMiscFees.FIELD:
					return new quickfix.fix50sp1.CollateralResponse.NoMiscFees();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp1.CollateralResponse.NoStipulations();
	
			}
		}
	
		if (quickfix.fix50sp1.News.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoRoutingIDs.FIELD:
					return new quickfix.fix50sp1.News.NoRoutingIDs();
	
				case quickfix.field.NoRelatedSym.FIELD:
					return new quickfix.fix50sp1.News.NoRelatedSym();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp1.News.NoLegs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp1.News.NoUnderlyings();
	
				case quickfix.field.NoLinesOfText.FIELD:
					return new quickfix.fix50sp1.News.NoLinesOfText();
	
			}
		}
	
		if (quickfix.fix50sp1.CollateralReport.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp1.CollateralReport.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp1.CollateralReport.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoExecs.FIELD:
					return new quickfix.fix50sp1.CollateralReport.NoExecs();
	
				case quickfix.field.NoTrades.FIELD:
					return new quickfix.fix50sp1.CollateralReport.NoTrades();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp1.CollateralReport.NoLegs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp1.CollateralReport.NoUnderlyings();
	
				case quickfix.field.NoTrdRegTimestamps.FIELD:
					return new quickfix.fix50sp1.CollateralReport.NoTrdRegTimestamps();
	
				case quickfix.field.NoMiscFees.FIELD:
					return new quickfix.fix50sp1.CollateralReport.NoMiscFees();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp1.CollateralReport.NoStipulations();
	
			}
		}
	
		if (quickfix.fix50sp1.CollateralInquiry.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoCollInquiryQualifier.FIELD:
					return new quickfix.fix50sp1.CollateralInquiry.NoCollInquiryQualifier();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp1.CollateralInquiry.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp1.CollateralInquiry.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoExecs.FIELD:
					return new quickfix.fix50sp1.CollateralInquiry.NoExecs();
	
				case quickfix.field.NoTrades.FIELD:
					return new quickfix.fix50sp1.CollateralInquiry.NoTrades();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp1.CollateralInquiry.NoLegs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp1.CollateralInquiry.NoUnderlyings();
	
				case quickfix.field.NoTrdRegTimestamps.FIELD:
					return new quickfix.fix50sp1.CollateralInquiry.NoTrdRegTimestamps();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp1.CollateralInquiry.NoStipulations();
	
			}
		}
	
		if (quickfix.fix50sp1.NetworkCounterpartySystemStatusRequest.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoCompIDs.FIELD:
					return new quickfix.fix50sp1.NetworkCounterpartySystemStatusRequest.NoCompIDs();
	
			}
		}
	
		if (quickfix.fix50sp1.NetworkCounterpartySystemStatusResponse.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoCompIDs.FIELD:
					return new quickfix.fix50sp1.NetworkCounterpartySystemStatusResponse.NoCompIDs();
	
			}
		}
	
		if (quickfix.fix50sp1.CollateralInquiryAck.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoCollInquiryQualifier.FIELD:
					return new quickfix.fix50sp1.CollateralInquiryAck.NoCollInquiryQualifier();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp1.CollateralInquiryAck.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp1.CollateralInquiryAck.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoExecs.FIELD:
					return new quickfix.fix50sp1.CollateralInquiryAck.NoExecs();
	
				case quickfix.field.NoTrades.FIELD:
					return new quickfix.fix50sp1.CollateralInquiryAck.NoTrades();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp1.CollateralInquiryAck.NoLegs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp1.CollateralInquiryAck.NoUnderlyings();
	
			}
		}
	
		if (quickfix.fix50sp1.ConfirmationRequest.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoOrders.FIELD:
					return new quickfix.fix50sp1.ConfirmationRequest.NoOrders();
	
				case quickfix.field.NoNested2PartyIDs.FIELD:
					return new quickfix.fix50sp1.ConfirmationRequest.NoOrders.NoNested2PartyIDs();
	
				case quickfix.field.NoNested2PartySubIDs.FIELD:
					return new quickfix.fix50sp1.ConfirmationRequest.NoOrders.NoNested2PartyIDs.NoNested2PartySubIDs();
	
			}
		}
	
		if (quickfix.fix50sp1.TradingSessionList.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix50sp1.TradingSessionList.NoTradingSessions();
	
			}
		}
	
		if (quickfix.fix50sp1.SecurityListUpdateReport.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoRelatedSym.FIELD:
					return new quickfix.fix50sp1.SecurityListUpdateReport.NoRelatedSym();
	
				case quickfix.field.NoStrikeRules.FIELD:
					return new quickfix.fix50sp1.SecurityListUpdateReport.NoRelatedSym.NoStrikeRules();
	
				case quickfix.field.NoMaturityRules.FIELD:
					return new quickfix.fix50sp1.SecurityListUpdateReport.NoRelatedSym.NoStrikeRules.NoMaturityRules();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp1.SecurityListUpdateReport.NoRelatedSym.NoUnderlyings();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp1.SecurityListUpdateReport.NoRelatedSym.NoStipulations();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp1.SecurityListUpdateReport.NoRelatedSym.NoLegs();
	
				case quickfix.field.NoLegStipulations.FIELD:
					return new quickfix.fix50sp1.SecurityListUpdateReport.NoRelatedSym.NoLegs.NoLegStipulations();
	
			}
		}
	
		if (quickfix.fix50sp1.AdjustedPositionReport.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp1.AdjustedPositionReport.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp1.AdjustedPositionReport.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoPositions.FIELD:
					return new quickfix.fix50sp1.AdjustedPositionReport.NoPositions();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp1.AdjustedPositionReport.NoPositions.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp1.AdjustedPositionReport.NoPositions.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoRelatedSym.FIELD:
					return new quickfix.fix50sp1.AdjustedPositionReport.NoRelatedSym();
	
			}
		}
	
		if (quickfix.fix50sp1.AllocationInstructionAlert.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoOrders.FIELD:
					return new quickfix.fix50sp1.AllocationInstructionAlert.NoOrders();
	
				case quickfix.field.NoNested2PartyIDs.FIELD:
					return new quickfix.fix50sp1.AllocationInstructionAlert.NoOrders.NoNested2PartyIDs();
	
				case quickfix.field.NoNested2PartySubIDs.FIELD:
					return new quickfix.fix50sp1.AllocationInstructionAlert.NoOrders.NoNested2PartyIDs.NoNested2PartySubIDs();
	
				case quickfix.field.NoExecs.FIELD:
					return new quickfix.fix50sp1.AllocationInstructionAlert.NoExecs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp1.AllocationInstructionAlert.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp1.AllocationInstructionAlert.NoLegs();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp1.AllocationInstructionAlert.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp1.AllocationInstructionAlert.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp1.AllocationInstructionAlert.NoStipulations();
	
				case quickfix.field.NoPosAmt.FIELD:
					return new quickfix.fix50sp1.AllocationInstructionAlert.NoPosAmt();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix50sp1.AllocationInstructionAlert.NoAllocs();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp1.AllocationInstructionAlert.NoAllocs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp1.AllocationInstructionAlert.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoMiscFees.FIELD:
					return new quickfix.fix50sp1.AllocationInstructionAlert.NoAllocs.NoMiscFees();
	
				case quickfix.field.NoClearingInstructions.FIELD:
					return new quickfix.fix50sp1.AllocationInstructionAlert.NoAllocs.NoClearingInstructions();
	
			}
		}
	
		if (quickfix.fix50sp1.ExecutionAcknowledgement.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp1.ExecutionAcknowledgement.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp1.ExecutionAcknowledgement.NoLegs();
	
			}
		}
	
		if (quickfix.fix50sp1.ContraryIntentionReport.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp1.ContraryIntentionReport.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp1.ContraryIntentionReport.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoExpiration.FIELD:
					return new quickfix.fix50sp1.ContraryIntentionReport.NoExpiration();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp1.ContraryIntentionReport.NoUnderlyings();
	
			}
		}
	
		if (quickfix.fix50sp1.SecurityDefinitionUpdateReport.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp1.SecurityDefinitionUpdateReport.NoUnderlyings();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp1.SecurityDefinitionUpdateReport.NoStipulations();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp1.SecurityDefinitionUpdateReport.NoLegs();
	
				case quickfix.field.NoMarketSegments.FIELD:
					return new quickfix.fix50sp1.SecurityDefinitionUpdateReport.NoMarketSegments();
	
				case quickfix.field.NoStrikeRules.FIELD:
					return new quickfix.fix50sp1.SecurityDefinitionUpdateReport.NoMarketSegments.NoStrikeRules();
	
				case quickfix.field.NoMaturityRules.FIELD:
					return new quickfix.fix50sp1.SecurityDefinitionUpdateReport.NoMarketSegments.NoStrikeRules.NoMaturityRules();
	
			}
		}
	
		if (quickfix.fix50sp1.SettlementObligationReport.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoSettlOblig.FIELD:
					return new quickfix.fix50sp1.SettlementObligationReport.NoSettlOblig();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp1.SettlementObligationReport.NoSettlOblig.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp1.SettlementObligationReport.NoSettlOblig.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoSettlDetails.FIELD:
					return new quickfix.fix50sp1.SettlementObligationReport.NoSettlOblig.NoSettlDetails();
	
				case quickfix.field.NoSettlPartyIDs.FIELD:
					return new quickfix.fix50sp1.SettlementObligationReport.NoSettlOblig.NoSettlDetails.NoSettlPartyIDs();
	
				case quickfix.field.NoSettlPartySubIDs.FIELD:
					return new quickfix.fix50sp1.SettlementObligationReport.NoSettlOblig.NoSettlDetails.NoSettlPartyIDs.NoSettlPartySubIDs();
	
			}
		}
	
		if (quickfix.fix50sp1.DerivativeSecurityListUpdateReport.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoRelatedSym.FIELD:
					return new quickfix.fix50sp1.DerivativeSecurityListUpdateReport.NoRelatedSym();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp1.DerivativeSecurityListUpdateReport.NoRelatedSym.NoLegs();
	
			}
		}
	
		if (quickfix.fix50sp1.TradingSessionListUpdateReport.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix50sp1.TradingSessionListUpdateReport.NoTradingSessions();
	
			}
		}
	
		if (quickfix.fix50sp1.MarketDefinition.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoOrdTypeRules.FIELD:
					return new quickfix.fix50sp1.MarketDefinition.NoOrdTypeRules();
	
				case quickfix.field.NoTimeInForceRules.FIELD:
					return new quickfix.fix50sp1.MarketDefinition.NoTimeInForceRules();
	
				case quickfix.field.NoExecInstRules.FIELD:
					return new quickfix.fix50sp1.MarketDefinition.NoExecInstRules();
	
			}
		}
	
		if (quickfix.fix50sp1.MarketDefinitionUpdateReport.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoOrdTypeRules.FIELD:
					return new quickfix.fix50sp1.MarketDefinitionUpdateReport.NoOrdTypeRules();
	
				case quickfix.field.NoTimeInForceRules.FIELD:
					return new quickfix.fix50sp1.MarketDefinitionUpdateReport.NoTimeInForceRules();
	
				case quickfix.field.NoExecInstRules.FIELD:
					return new quickfix.fix50sp1.MarketDefinitionUpdateReport.NoExecInstRules();
	
			}
		}
	
		if (quickfix.fix50sp1.ApplicationMessageRequest.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoApplIDs.FIELD:
					return new quickfix.fix50sp1.ApplicationMessageRequest.NoApplIDs();
	
			}
		}
	
		if (quickfix.fix50sp1.ApplicationMessageRequestAck.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoApplIDs.FIELD:
					return new quickfix.fix50sp1.ApplicationMessageRequestAck.NoApplIDs();
	
			}
		}
	
		if (quickfix.fix50sp1.ApplicationMessageReport.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoApplIDs.FIELD:
					return new quickfix.fix50sp1.ApplicationMessageReport.NoApplIDs();
	
			}
		}
	
		if (quickfix.fix50sp1.OrderMassActionReport.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoAffectedOrders.FIELD:
					return new quickfix.fix50sp1.OrderMassActionReport.NoAffectedOrders();
	
				case quickfix.field.NoNotAffectedOrders.FIELD:
					return new quickfix.fix50sp1.OrderMassActionReport.NoNotAffectedOrders();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp1.OrderMassActionReport.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp1.OrderMassActionReport.NoPartyIDs.NoPartySubIDs();
	
			}
		}
	
		if (quickfix.fix50sp1.Email.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoRoutingIDs.FIELD:
					return new quickfix.fix50sp1.Email.NoRoutingIDs();
	
				case quickfix.field.NoRelatedSym.FIELD:
					return new quickfix.fix50sp1.Email.NoRelatedSym();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp1.Email.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp1.Email.NoLegs();
	
				case quickfix.field.NoLinesOfText.FIELD:
					return new quickfix.fix50sp1.Email.NoLinesOfText();
	
			}
		}
	
		if (quickfix.fix50sp1.OrderMassActionRequest.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp1.OrderMassActionRequest.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp1.OrderMassActionRequest.NoPartyIDs.NoPartySubIDs();
	
			}
		}
	
		if (quickfix.fix50sp1.UserNotification.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoUsernames.FIELD:
					return new quickfix.fix50sp1.UserNotification.NoUsernames();
	
			}
		}
	
		if (quickfix.fix50sp1.NewOrderSingle.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp1.NewOrderSingle.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp1.NewOrderSingle.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix50sp1.NewOrderSingle.NoAllocs();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp1.NewOrderSingle.NoAllocs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp1.NewOrderSingle.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix50sp1.NewOrderSingle.NoTradingSessions();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp1.NewOrderSingle.NoUnderlyings();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp1.NewOrderSingle.NoStipulations();
	
				case quickfix.field.NoStrategyParameters.FIELD:
					return new quickfix.fix50sp1.NewOrderSingle.NoStrategyParameters();
	
				case quickfix.field.NoTrdRegTimestamps.FIELD:
					return new quickfix.fix50sp1.NewOrderSingle.NoTrdRegTimestamps();
	
			}
		}
	
		if (quickfix.fix50sp1.NewOrderList.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoRootPartyIDs.FIELD:
					return new quickfix.fix50sp1.NewOrderList.NoRootPartyIDs();
	
				case quickfix.field.NoRootPartySubIDs.FIELD:
					return new quickfix.fix50sp1.NewOrderList.NoRootPartyIDs.NoRootPartySubIDs();
	
				case quickfix.field.NoOrders.FIELD:
					return new quickfix.fix50sp1.NewOrderList.NoOrders();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp1.NewOrderList.NoOrders.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp1.NewOrderList.NoOrders.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix50sp1.NewOrderList.NoOrders.NoAllocs();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp1.NewOrderList.NoOrders.NoAllocs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp1.NewOrderList.NoOrders.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix50sp1.NewOrderList.NoOrders.NoTradingSessions();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp1.NewOrderList.NoOrders.NoUnderlyings();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp1.NewOrderList.NoOrders.NoStipulations();
	
				case quickfix.field.NoStrategyParameters.FIELD:
					return new quickfix.fix50sp1.NewOrderList.NoOrders.NoStrategyParameters();
	
			}
		}
	
		if (quickfix.fix50sp1.OrderCancelRequest.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp1.OrderCancelRequest.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp1.OrderCancelRequest.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp1.OrderCancelRequest.NoUnderlyings();
	
			}
		}
	
		if (quickfix.fix50sp1.OrderCancelReplaceRequest.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp1.OrderCancelReplaceRequest.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp1.OrderCancelReplaceRequest.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix50sp1.OrderCancelReplaceRequest.NoAllocs();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp1.OrderCancelReplaceRequest.NoAllocs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp1.OrderCancelReplaceRequest.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix50sp1.OrderCancelReplaceRequest.NoTradingSessions();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp1.OrderCancelReplaceRequest.NoUnderlyings();
	
				case quickfix.field.NoStrategyParameters.FIELD:
					return new quickfix.fix50sp1.OrderCancelReplaceRequest.NoStrategyParameters();
	
				case quickfix.field.NoTrdRegTimestamps.FIELD:
					return new quickfix.fix50sp1.OrderCancelReplaceRequest.NoTrdRegTimestamps();
	
			}
		}
	
		if (quickfix.fix50sp1.OrderStatusRequest.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp1.OrderStatusRequest.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp1.OrderStatusRequest.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp1.OrderStatusRequest.NoUnderlyings();
	
			}
		}
	
		if (quickfix.fix50sp1.AllocationInstruction.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoOrders.FIELD:
					return new quickfix.fix50sp1.AllocationInstruction.NoOrders();
	
				case quickfix.field.NoNested2PartyIDs.FIELD:
					return new quickfix.fix50sp1.AllocationInstruction.NoOrders.NoNested2PartyIDs();
	
				case quickfix.field.NoNested2PartySubIDs.FIELD:
					return new quickfix.fix50sp1.AllocationInstruction.NoOrders.NoNested2PartyIDs.NoNested2PartySubIDs();
	
				case quickfix.field.NoExecs.FIELD:
					return new quickfix.fix50sp1.AllocationInstruction.NoExecs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp1.AllocationInstruction.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp1.AllocationInstruction.NoLegs();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp1.AllocationInstruction.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp1.AllocationInstruction.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp1.AllocationInstruction.NoStipulations();
	
				case quickfix.field.NoPosAmt.FIELD:
					return new quickfix.fix50sp1.AllocationInstruction.NoPosAmt();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix50sp1.AllocationInstruction.NoAllocs();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp1.AllocationInstruction.NoAllocs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp1.AllocationInstruction.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoMiscFees.FIELD:
					return new quickfix.fix50sp1.AllocationInstruction.NoAllocs.NoMiscFees();
	
				case quickfix.field.NoClearingInstructions.FIELD:
					return new quickfix.fix50sp1.AllocationInstruction.NoAllocs.NoClearingInstructions();
	
			}
		}
	
		if (quickfix.fix50sp1.ListCancelRequest.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp1.ListCancelRequest.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp1.ListCancelRequest.NoPartyIDs.NoPartySubIDs();
	
			}
		}
	
		if (quickfix.fix50sp1.ListStatus.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoOrders.FIELD:
					return new quickfix.fix50sp1.ListStatus.NoOrders();
	
			}
		}
	
		if (quickfix.fix50sp1.AllocationInstructionAck.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp1.AllocationInstructionAck.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp1.AllocationInstructionAck.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix50sp1.AllocationInstructionAck.NoAllocs();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp1.AllocationInstructionAck.NoAllocs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp1.AllocationInstructionAck.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
			}
		}
	
		if (quickfix.fix50sp1.DontKnowTrade.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp1.DontKnowTrade.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp1.DontKnowTrade.NoLegs();
	
			}
		}
	
		if (quickfix.fix50sp1.QuoteRequest.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoRootPartyIDs.FIELD:
					return new quickfix.fix50sp1.QuoteRequest.NoRootPartyIDs();
	
				case quickfix.field.NoRootPartySubIDs.FIELD:
					return new quickfix.fix50sp1.QuoteRequest.NoRootPartyIDs.NoRootPartySubIDs();
	
				case quickfix.field.NoRelatedSym.FIELD:
					return new quickfix.fix50sp1.QuoteRequest.NoRelatedSym();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp1.QuoteRequest.NoRelatedSym.NoUnderlyings();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp1.QuoteRequest.NoRelatedSym.NoStipulations();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp1.QuoteRequest.NoRelatedSym.NoLegs();
	
				case quickfix.field.NoLegStipulations.FIELD:
					return new quickfix.fix50sp1.QuoteRequest.NoRelatedSym.NoLegs.NoLegStipulations();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp1.QuoteRequest.NoRelatedSym.NoLegs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp1.QuoteRequest.NoRelatedSym.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoQuoteQualifiers.FIELD:
					return new quickfix.fix50sp1.QuoteRequest.NoRelatedSym.NoQuoteQualifiers();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp1.QuoteRequest.NoRelatedSym.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp1.QuoteRequest.NoRelatedSym.NoPartyIDs.NoPartySubIDs();
	
			}
		}
	
		if (quickfix.fix50sp1.Quote.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoQuoteQualifiers.FIELD:
					return new quickfix.fix50sp1.Quote.NoQuoteQualifiers();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp1.Quote.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp1.Quote.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp1.Quote.NoUnderlyings();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp1.Quote.NoStipulations();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp1.Quote.NoLegs();
	
				case quickfix.field.NoLegStipulations.FIELD:
					return new quickfix.fix50sp1.Quote.NoLegs.NoLegStipulations();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp1.Quote.NoLegs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp1.Quote.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
			}
		}
	
		if (quickfix.fix50sp1.SettlementInstructions.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoSettlInst.FIELD:
					return new quickfix.fix50sp1.SettlementInstructions.NoSettlInst();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp1.SettlementInstructions.NoSettlInst.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp1.SettlementInstructions.NoSettlInst.NoPartyIDs.NoPartySubIDs();
	
			}
		}
	
		if (quickfix.fix50sp1.MarketDataRequest.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp1.MarketDataRequest.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp1.MarketDataRequest.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoMDEntryTypes.FIELD:
					return new quickfix.fix50sp1.MarketDataRequest.NoMDEntryTypes();
	
				case quickfix.field.NoRelatedSym.FIELD:
					return new quickfix.fix50sp1.MarketDataRequest.NoRelatedSym();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp1.MarketDataRequest.NoRelatedSym.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp1.MarketDataRequest.NoRelatedSym.NoLegs();
	
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix50sp1.MarketDataRequest.NoTradingSessions();
	
			}
		}
	
		if (quickfix.fix50sp1.MarketDataSnapshotFullRefresh.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp1.MarketDataSnapshotFullRefresh.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp1.MarketDataSnapshotFullRefresh.NoLegs();
	
				case quickfix.field.NoMDEntries.FIELD:
					return new quickfix.fix50sp1.MarketDataSnapshotFullRefresh.NoMDEntries();
	
				case quickfix.field.NoOfSecSizes.FIELD:
					return new quickfix.fix50sp1.MarketDataSnapshotFullRefresh.NoMDEntries.NoOfSecSizes();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp1.MarketDataSnapshotFullRefresh.NoMDEntries.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp1.MarketDataSnapshotFullRefresh.NoMDEntries.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoRoutingIDs.FIELD:
					return new quickfix.fix50sp1.MarketDataSnapshotFullRefresh.NoRoutingIDs();
	
			}
		}
	
		if (quickfix.fix50sp1.MarketDataIncrementalRefresh.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoMDEntries.FIELD:
					return new quickfix.fix50sp1.MarketDataIncrementalRefresh.NoMDEntries();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp1.MarketDataIncrementalRefresh.NoMDEntries.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp1.MarketDataIncrementalRefresh.NoMDEntries.NoLegs();
	
				case quickfix.field.NoOfSecSizes.FIELD:
					return new quickfix.fix50sp1.MarketDataIncrementalRefresh.NoMDEntries.NoOfSecSizes();
	
				case quickfix.field.NoStatsIndicators.FIELD:
					return new quickfix.fix50sp1.MarketDataIncrementalRefresh.NoMDEntries.NoStatsIndicators();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp1.MarketDataIncrementalRefresh.NoMDEntries.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp1.MarketDataIncrementalRefresh.NoMDEntries.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoRoutingIDs.FIELD:
					return new quickfix.fix50sp1.MarketDataIncrementalRefresh.NoRoutingIDs();
	
			}
		}
	
		if (quickfix.fix50sp1.MarketDataRequestReject.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp1.MarketDataRequestReject.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp1.MarketDataRequestReject.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoAltMDSource.FIELD:
					return new quickfix.fix50sp1.MarketDataRequestReject.NoAltMDSource();
	
			}
		}
	
		if (quickfix.fix50sp1.QuoteCancel.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp1.QuoteCancel.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp1.QuoteCancel.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoQuoteEntries.FIELD:
					return new quickfix.fix50sp1.QuoteCancel.NoQuoteEntries();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp1.QuoteCancel.NoQuoteEntries.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp1.QuoteCancel.NoQuoteEntries.NoLegs();
	
			}
		}
	
		if (quickfix.fix50sp1.QuoteStatusRequest.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp1.QuoteStatusRequest.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp1.QuoteStatusRequest.NoLegs();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp1.QuoteStatusRequest.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp1.QuoteStatusRequest.NoPartyIDs.NoPartySubIDs();
	
			}
		}
	
		if (quickfix.fix50sp1.MassQuoteAcknowledgement.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp1.MassQuoteAcknowledgement.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp1.MassQuoteAcknowledgement.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoQuoteSets.FIELD:
					return new quickfix.fix50sp1.MassQuoteAcknowledgement.NoQuoteSets();
	
				case quickfix.field.NoQuoteEntries.FIELD:
					return new quickfix.fix50sp1.MassQuoteAcknowledgement.NoQuoteSets.NoQuoteEntries();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp1.MassQuoteAcknowledgement.NoQuoteSets.NoQuoteEntries.NoLegs();
	
			}
		}
	
		if (quickfix.fix50sp1.SecurityDefinitionRequest.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp1.SecurityDefinitionRequest.NoUnderlyings();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp1.SecurityDefinitionRequest.NoStipulations();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp1.SecurityDefinitionRequest.NoLegs();
	
			}
		}
	
		if (quickfix.fix50sp1.SecurityDefinition.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp1.SecurityDefinition.NoUnderlyings();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp1.SecurityDefinition.NoStipulations();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp1.SecurityDefinition.NoLegs();
	
				case quickfix.field.NoMarketSegments.FIELD:
					return new quickfix.fix50sp1.SecurityDefinition.NoMarketSegments();
	
				case quickfix.field.NoStrikeRules.FIELD:
					return new quickfix.fix50sp1.SecurityDefinition.NoMarketSegments.NoStrikeRules();
	
				case quickfix.field.NoMaturityRules.FIELD:
					return new quickfix.fix50sp1.SecurityDefinition.NoMarketSegments.NoStrikeRules.NoMaturityRules();
	
			}
		}
	
		if (quickfix.fix50sp1.SecurityStatusRequest.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp1.SecurityStatusRequest.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp1.SecurityStatusRequest.NoLegs();
	
			}
		}
	
		if (quickfix.fix50sp1.SecurityStatus.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp1.SecurityStatus.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp1.SecurityStatus.NoLegs();
	
			}
		}
	
		if (quickfix.fix50sp1.TradingSessionStatus.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
			}
		}
	
		if (quickfix.fix50sp1.MassQuote.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp1.MassQuote.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp1.MassQuote.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoQuoteSets.FIELD:
					return new quickfix.fix50sp1.MassQuote.NoQuoteSets();
	
				case quickfix.field.NoQuoteEntries.FIELD:
					return new quickfix.fix50sp1.MassQuote.NoQuoteSets.NoQuoteEntries();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp1.MassQuote.NoQuoteSets.NoQuoteEntries.NoLegs();
	
			}
		}
	
		if (quickfix.fix50sp1.BidRequest.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoBidDescriptors.FIELD:
					return new quickfix.fix50sp1.BidRequest.NoBidDescriptors();
	
				case quickfix.field.NoBidComponents.FIELD:
					return new quickfix.fix50sp1.BidRequest.NoBidComponents();
	
			}
		}
	
		if (quickfix.fix50sp1.BidResponse.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoBidComponents.FIELD:
					return new quickfix.fix50sp1.BidResponse.NoBidComponents();
	
			}
		}
	
		if (quickfix.fix50sp1.ListStrikePrice.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoStrikes.FIELD:
					return new quickfix.fix50sp1.ListStrikePrice.NoStrikes();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp1.ListStrikePrice.NoStrikes.NoUnderlyings();
	
			}
		}
	
		if (quickfix.fix50sp1.RegistrationInstructions.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp1.RegistrationInstructions.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp1.RegistrationInstructions.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoRegistDtls.FIELD:
					return new quickfix.fix50sp1.RegistrationInstructions.NoRegistDtls();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp1.RegistrationInstructions.NoRegistDtls.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp1.RegistrationInstructions.NoRegistDtls.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoDistribInsts.FIELD:
					return new quickfix.fix50sp1.RegistrationInstructions.NoDistribInsts();
	
			}
		}
	
		if (quickfix.fix50sp1.RegistrationInstructionsResponse.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp1.RegistrationInstructionsResponse.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp1.RegistrationInstructionsResponse.NoPartyIDs.NoPartySubIDs();
	
			}
		}
	
		if (quickfix.fix50sp1.OrderMassCancelRequest.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp1.OrderMassCancelRequest.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp1.OrderMassCancelRequest.NoPartyIDs.NoPartySubIDs();
	
			}
		}
	
		if (quickfix.fix50sp1.OrderMassCancelReport.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoAffectedOrders.FIELD:
					return new quickfix.fix50sp1.OrderMassCancelReport.NoAffectedOrders();
	
				case quickfix.field.NoNotAffectedOrders.FIELD:
					return new quickfix.fix50sp1.OrderMassCancelReport.NoNotAffectedOrders();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp1.OrderMassCancelReport.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp1.OrderMassCancelReport.NoPartyIDs.NoPartySubIDs();
	
			}
		}
	
		if (quickfix.fix50sp1.NewOrderCross.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoRootPartyIDs.FIELD:
					return new quickfix.fix50sp1.NewOrderCross.NoRootPartyIDs();
	
				case quickfix.field.NoRootPartySubIDs.FIELD:
					return new quickfix.fix50sp1.NewOrderCross.NoRootPartyIDs.NoRootPartySubIDs();
	
				case quickfix.field.NoSides.FIELD:
					return new quickfix.fix50sp1.NewOrderCross.NoSides();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp1.NewOrderCross.NoSides.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp1.NewOrderCross.NoSides.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix50sp1.NewOrderCross.NoSides.NoAllocs();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp1.NewOrderCross.NoSides.NoAllocs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp1.NewOrderCross.NoSides.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp1.NewOrderCross.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp1.NewOrderCross.NoLegs();
	
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix50sp1.NewOrderCross.NoTradingSessions();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp1.NewOrderCross.NoStipulations();
	
				case quickfix.field.NoStrategyParameters.FIELD:
					return new quickfix.fix50sp1.NewOrderCross.NoStrategyParameters();
	
			}
		}
	
		if (quickfix.fix50sp1.CrossOrderCancelReplaceRequest.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoRootPartyIDs.FIELD:
					return new quickfix.fix50sp1.CrossOrderCancelReplaceRequest.NoRootPartyIDs();
	
				case quickfix.field.NoRootPartySubIDs.FIELD:
					return new quickfix.fix50sp1.CrossOrderCancelReplaceRequest.NoRootPartyIDs.NoRootPartySubIDs();
	
				case quickfix.field.NoSides.FIELD:
					return new quickfix.fix50sp1.CrossOrderCancelReplaceRequest.NoSides();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp1.CrossOrderCancelReplaceRequest.NoSides.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp1.CrossOrderCancelReplaceRequest.NoSides.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix50sp1.CrossOrderCancelReplaceRequest.NoSides.NoAllocs();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp1.CrossOrderCancelReplaceRequest.NoSides.NoAllocs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp1.CrossOrderCancelReplaceRequest.NoSides.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp1.CrossOrderCancelReplaceRequest.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp1.CrossOrderCancelReplaceRequest.NoLegs();
	
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix50sp1.CrossOrderCancelReplaceRequest.NoTradingSessions();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp1.CrossOrderCancelReplaceRequest.NoStipulations();
	
				case quickfix.field.NoStrategyParameters.FIELD:
					return new quickfix.fix50sp1.CrossOrderCancelReplaceRequest.NoStrategyParameters();
	
			}
		}
	
		if (quickfix.fix50sp1.CrossOrderCancelRequest.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoRootPartyIDs.FIELD:
					return new quickfix.fix50sp1.CrossOrderCancelRequest.NoRootPartyIDs();
	
				case quickfix.field.NoRootPartySubIDs.FIELD:
					return new quickfix.fix50sp1.CrossOrderCancelRequest.NoRootPartyIDs.NoRootPartySubIDs();
	
				case quickfix.field.NoSides.FIELD:
					return new quickfix.fix50sp1.CrossOrderCancelRequest.NoSides();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp1.CrossOrderCancelRequest.NoSides.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp1.CrossOrderCancelRequest.NoSides.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp1.CrossOrderCancelRequest.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp1.CrossOrderCancelRequest.NoLegs();
	
			}
		}
	
		if (quickfix.fix50sp1.SecurityTypes.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoSecurityTypes.FIELD:
					return new quickfix.fix50sp1.SecurityTypes.NoSecurityTypes();
	
			}
		}
	
		if (quickfix.fix50sp1.SecurityListRequest.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp1.SecurityListRequest.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp1.SecurityListRequest.NoLegs();
	
			}
		}
	
		if (quickfix.fix50sp1.SecurityList.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoRelatedSym.FIELD:
					return new quickfix.fix50sp1.SecurityList.NoRelatedSym();
	
				case quickfix.field.NoStrikeRules.FIELD:
					return new quickfix.fix50sp1.SecurityList.NoRelatedSym.NoStrikeRules();
	
				case quickfix.field.NoMaturityRules.FIELD:
					return new quickfix.fix50sp1.SecurityList.NoRelatedSym.NoStrikeRules.NoMaturityRules();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp1.SecurityList.NoRelatedSym.NoUnderlyings();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp1.SecurityList.NoRelatedSym.NoStipulations();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp1.SecurityList.NoRelatedSym.NoLegs();
	
				case quickfix.field.NoLegStipulations.FIELD:
					return new quickfix.fix50sp1.SecurityList.NoRelatedSym.NoLegs.NoLegStipulations();
	
			}
		}
	
		if (quickfix.fix50sp1.DerivativeSecurityListRequest.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
			}
		}
	
		return null;
	}
}
