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

package quickfix.fix50sp2;

import quickfix.Message;
import quickfix.Group;

public class MessageFactory implements quickfix.MessageFactory {

	public Message create(String beginString, String msgType) {
		
		if (quickfix.fix50sp2.IOI.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.IOI();
		}
	
		if (quickfix.fix50sp2.Advertisement.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.Advertisement();
		}
	
		if (quickfix.fix50sp2.ExecutionReport.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.ExecutionReport();
		}
	
		if (quickfix.fix50sp2.OrderCancelReject.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.OrderCancelReject();
		}
	
		if (quickfix.fix50sp2.DerivativeSecurityList.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.DerivativeSecurityList();
		}
	
		if (quickfix.fix50sp2.NewOrderMultileg.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.NewOrderMultileg();
		}
	
		if (quickfix.fix50sp2.MultilegOrderCancelReplace.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.MultilegOrderCancelReplace();
		}
	
		if (quickfix.fix50sp2.TradeCaptureReportRequest.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.TradeCaptureReportRequest();
		}
	
		if (quickfix.fix50sp2.TradeCaptureReport.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.TradeCaptureReport();
		}
	
		if (quickfix.fix50sp2.OrderMassStatusRequest.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.OrderMassStatusRequest();
		}
	
		if (quickfix.fix50sp2.QuoteRequestReject.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.QuoteRequestReject();
		}
	
		if (quickfix.fix50sp2.RFQRequest.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.RFQRequest();
		}
	
		if (quickfix.fix50sp2.QuoteStatusReport.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.QuoteStatusReport();
		}
	
		if (quickfix.fix50sp2.QuoteResponse.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.QuoteResponse();
		}
	
		if (quickfix.fix50sp2.Confirmation.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.Confirmation();
		}
	
		if (quickfix.fix50sp2.PositionMaintenanceRequest.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.PositionMaintenanceRequest();
		}
	
		if (quickfix.fix50sp2.PositionMaintenanceReport.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.PositionMaintenanceReport();
		}
	
		if (quickfix.fix50sp2.RequestForPositions.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.RequestForPositions();
		}
	
		if (quickfix.fix50sp2.RequestForPositionsAck.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.RequestForPositionsAck();
		}
	
		if (quickfix.fix50sp2.PositionReport.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.PositionReport();
		}
	
		if (quickfix.fix50sp2.TradeCaptureReportRequestAck.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.TradeCaptureReportRequestAck();
		}
	
		if (quickfix.fix50sp2.TradeCaptureReportAck.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.TradeCaptureReportAck();
		}
	
		if (quickfix.fix50sp2.AllocationReport.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.AllocationReport();
		}
	
		if (quickfix.fix50sp2.AllocationReportAck.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.AllocationReportAck();
		}
	
		if (quickfix.fix50sp2.ConfirmationAck.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.ConfirmationAck();
		}
	
		if (quickfix.fix50sp2.SettlementInstructionRequest.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.SettlementInstructionRequest();
		}
	
		if (quickfix.fix50sp2.AssignmentReport.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.AssignmentReport();
		}
	
		if (quickfix.fix50sp2.CollateralRequest.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.CollateralRequest();
		}
	
		if (quickfix.fix50sp2.CollateralAssignment.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.CollateralAssignment();
		}
	
		if (quickfix.fix50sp2.CollateralResponse.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.CollateralResponse();
		}
	
		if (quickfix.fix50sp2.News.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.News();
		}
	
		if (quickfix.fix50sp2.CollateralReport.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.CollateralReport();
		}
	
		if (quickfix.fix50sp2.CollateralInquiry.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.CollateralInquiry();
		}
	
		if (quickfix.fix50sp2.NetworkCounterpartySystemStatusRequest.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.NetworkCounterpartySystemStatusRequest();
		}
	
		if (quickfix.fix50sp2.NetworkCounterpartySystemStatusResponse.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.NetworkCounterpartySystemStatusResponse();
		}
	
		if (quickfix.fix50sp2.UserRequest.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.UserRequest();
		}
	
		if (quickfix.fix50sp2.UserResponse.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.UserResponse();
		}
	
		if (quickfix.fix50sp2.CollateralInquiryAck.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.CollateralInquiryAck();
		}
	
		if (quickfix.fix50sp2.ConfirmationRequest.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.ConfirmationRequest();
		}
	
		if (quickfix.fix50sp2.TradingSessionListRequest.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.TradingSessionListRequest();
		}
	
		if (quickfix.fix50sp2.TradingSessionList.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.TradingSessionList();
		}
	
		if (quickfix.fix50sp2.SecurityListUpdateReport.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.SecurityListUpdateReport();
		}
	
		if (quickfix.fix50sp2.AdjustedPositionReport.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.AdjustedPositionReport();
		}
	
		if (quickfix.fix50sp2.AllocationInstructionAlert.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.AllocationInstructionAlert();
		}
	
		if (quickfix.fix50sp2.ExecutionAcknowledgement.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.ExecutionAcknowledgement();
		}
	
		if (quickfix.fix50sp2.ContraryIntentionReport.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.ContraryIntentionReport();
		}
	
		if (quickfix.fix50sp2.SecurityDefinitionUpdateReport.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.SecurityDefinitionUpdateReport();
		}
	
		if (quickfix.fix50sp2.SettlementObligationReport.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.SettlementObligationReport();
		}
	
		if (quickfix.fix50sp2.DerivativeSecurityListUpdateReport.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.DerivativeSecurityListUpdateReport();
		}
	
		if (quickfix.fix50sp2.TradingSessionListUpdateReport.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.TradingSessionListUpdateReport();
		}
	
		if (quickfix.fix50sp2.MarketDefinitionRequest.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.MarketDefinitionRequest();
		}
	
		if (quickfix.fix50sp2.MarketDefinition.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.MarketDefinition();
		}
	
		if (quickfix.fix50sp2.MarketDefinitionUpdateReport.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.MarketDefinitionUpdateReport();
		}
	
		if (quickfix.fix50sp2.ApplicationMessageRequest.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.ApplicationMessageRequest();
		}
	
		if (quickfix.fix50sp2.ApplicationMessageRequestAck.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.ApplicationMessageRequestAck();
		}
	
		if (quickfix.fix50sp2.ApplicationMessageReport.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.ApplicationMessageReport();
		}
	
		if (quickfix.fix50sp2.OrderMassActionReport.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.OrderMassActionReport();
		}
	
		if (quickfix.fix50sp2.Email.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.Email();
		}
	
		if (quickfix.fix50sp2.OrderMassActionRequest.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.OrderMassActionRequest();
		}
	
		if (quickfix.fix50sp2.UserNotification.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.UserNotification();
		}
	
		if (quickfix.fix50sp2.StreamAssignmentRequest.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.StreamAssignmentRequest();
		}
	
		if (quickfix.fix50sp2.StreamAssignmentReport.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.StreamAssignmentReport();
		}
	
		if (quickfix.fix50sp2.StreamAssignmentReportACK.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.StreamAssignmentReportACK();
		}
	
		if (quickfix.fix50sp2.NewOrderSingle.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.NewOrderSingle();
		}
	
		if (quickfix.fix50sp2.NewOrderList.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.NewOrderList();
		}
	
		if (quickfix.fix50sp2.OrderCancelRequest.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.OrderCancelRequest();
		}
	
		if (quickfix.fix50sp2.OrderCancelReplaceRequest.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.OrderCancelReplaceRequest();
		}
	
		if (quickfix.fix50sp2.OrderStatusRequest.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.OrderStatusRequest();
		}
	
		if (quickfix.fix50sp2.AllocationInstruction.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.AllocationInstruction();
		}
	
		if (quickfix.fix50sp2.ListCancelRequest.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.ListCancelRequest();
		}
	
		if (quickfix.fix50sp2.ListExecute.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.ListExecute();
		}
	
		if (quickfix.fix50sp2.ListStatusRequest.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.ListStatusRequest();
		}
	
		if (quickfix.fix50sp2.ListStatus.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.ListStatus();
		}
	
		if (quickfix.fix50sp2.AllocationInstructionAck.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.AllocationInstructionAck();
		}
	
		if (quickfix.fix50sp2.DontKnowTrade.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.DontKnowTrade();
		}
	
		if (quickfix.fix50sp2.QuoteRequest.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.QuoteRequest();
		}
	
		if (quickfix.fix50sp2.Quote.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.Quote();
		}
	
		if (quickfix.fix50sp2.SettlementInstructions.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.SettlementInstructions();
		}
	
		if (quickfix.fix50sp2.MarketDataRequest.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.MarketDataRequest();
		}
	
		if (quickfix.fix50sp2.MarketDataSnapshotFullRefresh.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.MarketDataSnapshotFullRefresh();
		}
	
		if (quickfix.fix50sp2.MarketDataIncrementalRefresh.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.MarketDataIncrementalRefresh();
		}
	
		if (quickfix.fix50sp2.MarketDataRequestReject.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.MarketDataRequestReject();
		}
	
		if (quickfix.fix50sp2.QuoteCancel.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.QuoteCancel();
		}
	
		if (quickfix.fix50sp2.QuoteStatusRequest.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.QuoteStatusRequest();
		}
	
		if (quickfix.fix50sp2.MassQuoteAcknowledgement.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.MassQuoteAcknowledgement();
		}
	
		if (quickfix.fix50sp2.SecurityDefinitionRequest.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.SecurityDefinitionRequest();
		}
	
		if (quickfix.fix50sp2.SecurityDefinition.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.SecurityDefinition();
		}
	
		if (quickfix.fix50sp2.SecurityStatusRequest.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.SecurityStatusRequest();
		}
	
		if (quickfix.fix50sp2.SecurityStatus.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.SecurityStatus();
		}
	
		if (quickfix.fix50sp2.TradingSessionStatusRequest.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.TradingSessionStatusRequest();
		}
	
		if (quickfix.fix50sp2.TradingSessionStatus.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.TradingSessionStatus();
		}
	
		if (quickfix.fix50sp2.MassQuote.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.MassQuote();
		}
	
		if (quickfix.fix50sp2.BusinessMessageReject.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.BusinessMessageReject();
		}
	
		if (quickfix.fix50sp2.BidRequest.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.BidRequest();
		}
	
		if (quickfix.fix50sp2.BidResponse.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.BidResponse();
		}
	
		if (quickfix.fix50sp2.ListStrikePrice.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.ListStrikePrice();
		}
	
		if (quickfix.fix50sp2.RegistrationInstructions.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.RegistrationInstructions();
		}
	
		if (quickfix.fix50sp2.RegistrationInstructionsResponse.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.RegistrationInstructionsResponse();
		}
	
		if (quickfix.fix50sp2.OrderMassCancelRequest.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.OrderMassCancelRequest();
		}
	
		if (quickfix.fix50sp2.OrderMassCancelReport.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.OrderMassCancelReport();
		}
	
		if (quickfix.fix50sp2.NewOrderCross.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.NewOrderCross();
		}
	
		if (quickfix.fix50sp2.CrossOrderCancelReplaceRequest.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.CrossOrderCancelReplaceRequest();
		}
	
		if (quickfix.fix50sp2.CrossOrderCancelRequest.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.CrossOrderCancelRequest();
		}
	
		if (quickfix.fix50sp2.SecurityTypeRequest.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.SecurityTypeRequest();
		}
	
		if (quickfix.fix50sp2.SecurityTypes.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.SecurityTypes();
		}
	
		if (quickfix.fix50sp2.SecurityListRequest.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.SecurityListRequest();
		}
	
		if (quickfix.fix50sp2.SecurityList.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.SecurityList();
		}
	
		if (quickfix.fix50sp2.DerivativeSecurityListRequest.MSGTYPE.equals(msgType)) {
			return new quickfix.fix50sp2.DerivativeSecurityListRequest();
		}
	
		return new quickfix.fix50sp2.Message();
	}

	public Group create(String beginString, String msgType, int correspondingFieldID) {
		
		if (quickfix.fix50sp2.IOI.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.IOI.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.IOI.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.IOI.NoUnderlyings();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp2.IOI.NoStipulations();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.IOI.NoLegs();
	
				case quickfix.field.NoLegStipulations.FIELD:
					return new quickfix.fix50sp2.IOI.NoLegs.NoLegStipulations();
	
				case quickfix.field.NoIOIQualifiers.FIELD:
					return new quickfix.fix50sp2.IOI.NoIOIQualifiers();
	
				case quickfix.field.NoRoutingIDs.FIELD:
					return new quickfix.fix50sp2.IOI.NoRoutingIDs();
	
			}
		}
	
		if (quickfix.fix50sp2.Advertisement.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.Advertisement.NoLegs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.Advertisement.NoUnderlyings();
	
			}
		}
	
		if (quickfix.fix50sp2.ExecutionReport.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.ExecutionReport.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.ExecutionReport.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoContraBrokers.FIELD:
					return new quickfix.fix50sp2.ExecutionReport.NoContraBrokers();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix50sp2.ExecutionReport.NoAllocs();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp2.ExecutionReport.NoAllocs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp2.ExecutionReport.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.ExecutionReport.NoUnderlyings();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp2.ExecutionReport.NoStipulations();
	
				case quickfix.field.NoStrategyParameters.FIELD:
					return new quickfix.fix50sp2.ExecutionReport.NoStrategyParameters();
	
				case quickfix.field.NoFills.FIELD:
					return new quickfix.fix50sp2.ExecutionReport.NoFills();
	
				case quickfix.field.NoNested4PartyIDs.FIELD:
					return new quickfix.fix50sp2.ExecutionReport.NoFills.NoNested4PartyIDs();
	
				case quickfix.field.NoNested4PartySubIDs.FIELD:
					return new quickfix.fix50sp2.ExecutionReport.NoFills.NoNested4PartyIDs.NoNested4PartySubIDs();
	
				case quickfix.field.NoRateSources.FIELD:
					return new quickfix.fix50sp2.ExecutionReport.NoRateSources();
	
				case quickfix.field.NoContAmts.FIELD:
					return new quickfix.fix50sp2.ExecutionReport.NoContAmts();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.ExecutionReport.NoLegs();
	
				case quickfix.field.NoLegStipulations.FIELD:
					return new quickfix.fix50sp2.ExecutionReport.NoLegs.NoLegStipulations();
	
				case quickfix.field.NoLegAllocs.FIELD:
					return new quickfix.fix50sp2.ExecutionReport.NoLegs.NoLegAllocs();
	
				case quickfix.field.NoNested2PartyIDs.FIELD:
					return new quickfix.fix50sp2.ExecutionReport.NoLegs.NoLegAllocs.NoNested2PartyIDs();
	
				case quickfix.field.NoNested2PartySubIDs.FIELD:
					return new quickfix.fix50sp2.ExecutionReport.NoLegs.NoLegAllocs.NoNested2PartyIDs.NoNested2PartySubIDs();
	
				case quickfix.field.NoNested3PartyIDs.FIELD:
					return new quickfix.fix50sp2.ExecutionReport.NoLegs.NoNested3PartyIDs();
	
				case quickfix.field.NoNested3PartySubIDs.FIELD:
					return new quickfix.fix50sp2.ExecutionReport.NoLegs.NoNested3PartyIDs.NoNested3PartySubIDs();
	
				case quickfix.field.NoMiscFees.FIELD:
					return new quickfix.fix50sp2.ExecutionReport.NoMiscFees();
	
				case quickfix.field.NoTrdRegTimestamps.FIELD:
					return new quickfix.fix50sp2.ExecutionReport.NoTrdRegTimestamps();
	
			}
		}
	
		if (quickfix.fix50sp2.DerivativeSecurityList.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoRelatedSym.FIELD:
					return new quickfix.fix50sp2.DerivativeSecurityList.NoRelatedSym();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.DerivativeSecurityList.NoRelatedSym.NoLegs();
	
			}
		}
	
		if (quickfix.fix50sp2.NewOrderMultileg.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.NewOrderMultileg.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.NewOrderMultileg.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix50sp2.NewOrderMultileg.NoAllocs();
	
				case quickfix.field.NoNested3PartyIDs.FIELD:
					return new quickfix.fix50sp2.NewOrderMultileg.NoAllocs.NoNested3PartyIDs();
	
				case quickfix.field.NoNested3PartySubIDs.FIELD:
					return new quickfix.fix50sp2.NewOrderMultileg.NoAllocs.NoNested3PartyIDs.NoNested3PartySubIDs();
	
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix50sp2.NewOrderMultileg.NoTradingSessions();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.NewOrderMultileg.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.NewOrderMultileg.NoLegs();
	
				case quickfix.field.NoLegStipulations.FIELD:
					return new quickfix.fix50sp2.NewOrderMultileg.NoLegs.NoLegStipulations();
	
				case quickfix.field.NoLegAllocs.FIELD:
					return new quickfix.fix50sp2.NewOrderMultileg.NoLegs.NoLegAllocs();
	
				case quickfix.field.NoNested2PartyIDs.FIELD:
					return new quickfix.fix50sp2.NewOrderMultileg.NoLegs.NoLegAllocs.NoNested2PartyIDs();
	
				case quickfix.field.NoNested2PartySubIDs.FIELD:
					return new quickfix.fix50sp2.NewOrderMultileg.NoLegs.NoLegAllocs.NoNested2PartyIDs.NoNested2PartySubIDs();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp2.NewOrderMultileg.NoLegs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp2.NewOrderMultileg.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoStrategyParameters.FIELD:
					return new quickfix.fix50sp2.NewOrderMultileg.NoStrategyParameters();
	
			}
		}
	
		if (quickfix.fix50sp2.MultilegOrderCancelReplace.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.MultilegOrderCancelReplace.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.MultilegOrderCancelReplace.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix50sp2.MultilegOrderCancelReplace.NoAllocs();
	
				case quickfix.field.NoNested3PartyIDs.FIELD:
					return new quickfix.fix50sp2.MultilegOrderCancelReplace.NoAllocs.NoNested3PartyIDs();
	
				case quickfix.field.NoNested3PartySubIDs.FIELD:
					return new quickfix.fix50sp2.MultilegOrderCancelReplace.NoAllocs.NoNested3PartyIDs.NoNested3PartySubIDs();
	
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix50sp2.MultilegOrderCancelReplace.NoTradingSessions();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.MultilegOrderCancelReplace.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.MultilegOrderCancelReplace.NoLegs();
	
				case quickfix.field.NoLegStipulations.FIELD:
					return new quickfix.fix50sp2.MultilegOrderCancelReplace.NoLegs.NoLegStipulations();
	
				case quickfix.field.NoLegAllocs.FIELD:
					return new quickfix.fix50sp2.MultilegOrderCancelReplace.NoLegs.NoLegAllocs();
	
				case quickfix.field.NoNested2PartyIDs.FIELD:
					return new quickfix.fix50sp2.MultilegOrderCancelReplace.NoLegs.NoLegAllocs.NoNested2PartyIDs();
	
				case quickfix.field.NoNested2PartySubIDs.FIELD:
					return new quickfix.fix50sp2.MultilegOrderCancelReplace.NoLegs.NoLegAllocs.NoNested2PartyIDs.NoNested2PartySubIDs();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp2.MultilegOrderCancelReplace.NoLegs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp2.MultilegOrderCancelReplace.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoStrategyParameters.FIELD:
					return new quickfix.fix50sp2.MultilegOrderCancelReplace.NoStrategyParameters();
	
			}
		}
	
		if (quickfix.fix50sp2.TradeCaptureReportRequest.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReportRequest.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReportRequest.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReportRequest.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReportRequest.NoLegs();
	
				case quickfix.field.NoDates.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReportRequest.NoDates();
	
			}
		}
	
		if (quickfix.fix50sp2.TradeCaptureReport.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoRootPartyIDs.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReport.NoRootPartyIDs();
	
				case quickfix.field.NoRootPartySubIDs.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReport.NoRootPartyIDs.NoRootPartySubIDs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReport.NoUnderlyings();
	
				case quickfix.field.NoPosAmt.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReport.NoPosAmt();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReport.NoLegs();
	
				case quickfix.field.NoLegStipulations.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReport.NoLegs.NoLegStipulations();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReport.NoLegs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReport.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoOfLegUnderlyings.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReport.NoLegs.NoOfLegUnderlyings();
	
				case quickfix.field.NoTrdRegTimestamps.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReport.NoTrdRegTimestamps();
	
				case quickfix.field.NoSides.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReport.NoSides();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReport.NoSides.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReport.NoSides.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoClearingInstructions.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReport.NoSides.NoClearingInstructions();
	
				case quickfix.field.NoContAmts.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReport.NoSides.NoContAmts();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReport.NoSides.NoStipulations();
	
				case quickfix.field.NoMiscFees.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReport.NoSides.NoMiscFees();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReport.NoSides.NoAllocs();
	
				case quickfix.field.NoNested2PartyIDs.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReport.NoSides.NoAllocs.NoNested2PartyIDs();
	
				case quickfix.field.NoNested2PartySubIDs.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReport.NoSides.NoAllocs.NoNested2PartyIDs.NoNested2PartySubIDs();
	
				case quickfix.field.NoSideTrdRegTS.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReport.NoSides.NoSideTrdRegTS();
	
				case quickfix.field.NoSettlDetails.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReport.NoSides.NoSettlDetails();
	
				case quickfix.field.NoSettlPartyIDs.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReport.NoSides.NoSettlDetails.NoSettlPartyIDs();
	
				case quickfix.field.NoSettlPartySubIDs.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReport.NoSides.NoSettlDetails.NoSettlPartyIDs.NoSettlPartySubIDs();
	
				case quickfix.field.NoTrdRepIndicators.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReport.NoTrdRepIndicators();
	
			}
		}
	
		if (quickfix.fix50sp2.OrderMassStatusRequest.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.OrderMassStatusRequest.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.OrderMassStatusRequest.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoTargetPartyIDs.FIELD:
					return new quickfix.fix50sp2.OrderMassStatusRequest.NoTargetPartyIDs();
	
			}
		}
	
		if (quickfix.fix50sp2.QuoteRequestReject.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoRootPartyIDs.FIELD:
					return new quickfix.fix50sp2.QuoteRequestReject.NoRootPartyIDs();
	
				case quickfix.field.NoRootPartySubIDs.FIELD:
					return new quickfix.fix50sp2.QuoteRequestReject.NoRootPartyIDs.NoRootPartySubIDs();
	
				case quickfix.field.NoRelatedSym.FIELD:
					return new quickfix.fix50sp2.QuoteRequestReject.NoRelatedSym();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.QuoteRequestReject.NoRelatedSym.NoUnderlyings();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp2.QuoteRequestReject.NoRelatedSym.NoStipulations();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.QuoteRequestReject.NoRelatedSym.NoLegs();
	
				case quickfix.field.NoLegStipulations.FIELD:
					return new quickfix.fix50sp2.QuoteRequestReject.NoRelatedSym.NoLegs.NoLegStipulations();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp2.QuoteRequestReject.NoRelatedSym.NoLegs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp2.QuoteRequestReject.NoRelatedSym.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoQuoteQualifiers.FIELD:
					return new quickfix.fix50sp2.QuoteRequestReject.NoRelatedSym.NoQuoteQualifiers();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.QuoteRequestReject.NoRelatedSym.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.QuoteRequestReject.NoRelatedSym.NoPartyIDs.NoPartySubIDs();
	
			}
		}
	
		if (quickfix.fix50sp2.RFQRequest.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.RFQRequest.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.RFQRequest.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoRelatedSym.FIELD:
					return new quickfix.fix50sp2.RFQRequest.NoRelatedSym();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.RFQRequest.NoRelatedSym.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.RFQRequest.NoRelatedSym.NoLegs();
	
			}
		}
	
		if (quickfix.fix50sp2.QuoteStatusReport.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.QuoteStatusReport.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.QuoteStatusReport.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoTargetPartyIDs.FIELD:
					return new quickfix.fix50sp2.QuoteStatusReport.NoTargetPartyIDs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.QuoteStatusReport.NoUnderlyings();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp2.QuoteStatusReport.NoStipulations();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.QuoteStatusReport.NoLegs();
	
				case quickfix.field.NoLegStipulations.FIELD:
					return new quickfix.fix50sp2.QuoteStatusReport.NoLegs.NoLegStipulations();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp2.QuoteStatusReport.NoLegs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp2.QuoteStatusReport.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoQuoteQualifiers.FIELD:
					return new quickfix.fix50sp2.QuoteStatusReport.NoQuoteQualifiers();
	
			}
		}
	
		if (quickfix.fix50sp2.QuoteResponse.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoQuoteQualifiers.FIELD:
					return new quickfix.fix50sp2.QuoteResponse.NoQuoteQualifiers();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.QuoteResponse.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.QuoteResponse.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.QuoteResponse.NoUnderlyings();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp2.QuoteResponse.NoStipulations();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.QuoteResponse.NoLegs();
	
				case quickfix.field.NoLegStipulations.FIELD:
					return new quickfix.fix50sp2.QuoteResponse.NoLegs.NoLegStipulations();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp2.QuoteResponse.NoLegs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp2.QuoteResponse.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
			}
		}
	
		if (quickfix.fix50sp2.Confirmation.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.Confirmation.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.Confirmation.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoOrders.FIELD:
					return new quickfix.fix50sp2.Confirmation.NoOrders();
	
				case quickfix.field.NoNested2PartyIDs.FIELD:
					return new quickfix.fix50sp2.Confirmation.NoOrders.NoNested2PartyIDs();
	
				case quickfix.field.NoNested2PartySubIDs.FIELD:
					return new quickfix.fix50sp2.Confirmation.NoOrders.NoNested2PartyIDs.NoNested2PartySubIDs();
	
				case quickfix.field.NoTrdRegTimestamps.FIELD:
					return new quickfix.fix50sp2.Confirmation.NoTrdRegTimestamps();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.Confirmation.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.Confirmation.NoLegs();
	
				case quickfix.field.NoCapacities.FIELD:
					return new quickfix.fix50sp2.Confirmation.NoCapacities();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp2.Confirmation.NoStipulations();
	
				case quickfix.field.NoMiscFees.FIELD:
					return new quickfix.fix50sp2.Confirmation.NoMiscFees();
	
			}
		}
	
		if (quickfix.fix50sp2.PositionMaintenanceRequest.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.PositionMaintenanceRequest.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.PositionMaintenanceRequest.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.PositionMaintenanceRequest.NoLegs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.PositionMaintenanceRequest.NoUnderlyings();
	
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix50sp2.PositionMaintenanceRequest.NoTradingSessions();
	
				case quickfix.field.NoPositions.FIELD:
					return new quickfix.fix50sp2.PositionMaintenanceRequest.NoPositions();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp2.PositionMaintenanceRequest.NoPositions.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp2.PositionMaintenanceRequest.NoPositions.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoPosAmt.FIELD:
					return new quickfix.fix50sp2.PositionMaintenanceRequest.NoPosAmt();
	
			}
		}
	
		if (quickfix.fix50sp2.PositionMaintenanceReport.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.PositionMaintenanceReport.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.PositionMaintenanceReport.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.PositionMaintenanceReport.NoLegs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.PositionMaintenanceReport.NoUnderlyings();
	
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix50sp2.PositionMaintenanceReport.NoTradingSessions();
	
				case quickfix.field.NoPositions.FIELD:
					return new quickfix.fix50sp2.PositionMaintenanceReport.NoPositions();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp2.PositionMaintenanceReport.NoPositions.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp2.PositionMaintenanceReport.NoPositions.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoPosAmt.FIELD:
					return new quickfix.fix50sp2.PositionMaintenanceReport.NoPosAmt();
	
			}
		}
	
		if (quickfix.fix50sp2.RequestForPositions.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.RequestForPositions.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.RequestForPositions.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.RequestForPositions.NoLegs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.RequestForPositions.NoUnderlyings();
	
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix50sp2.RequestForPositions.NoTradingSessions();
	
			}
		}
	
		if (quickfix.fix50sp2.RequestForPositionsAck.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.RequestForPositionsAck.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.RequestForPositionsAck.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.RequestForPositionsAck.NoLegs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.RequestForPositionsAck.NoUnderlyings();
	
			}
		}
	
		if (quickfix.fix50sp2.PositionReport.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.PositionReport.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.PositionReport.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.PositionReport.NoLegs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.PositionReport.NoUnderlyings();
	
				case quickfix.field.NoUnderlyingAmounts.FIELD:
					return new quickfix.fix50sp2.PositionReport.NoUnderlyings.NoUnderlyingAmounts();
	
				case quickfix.field.NoPositions.FIELD:
					return new quickfix.fix50sp2.PositionReport.NoPositions();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp2.PositionReport.NoPositions.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp2.PositionReport.NoPositions.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoPosAmt.FIELD:
					return new quickfix.fix50sp2.PositionReport.NoPosAmt();
	
			}
		}
	
		if (quickfix.fix50sp2.TradeCaptureReportRequestAck.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReportRequestAck.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReportRequestAck.NoLegs();
	
			}
		}
	
		if (quickfix.fix50sp2.TradeCaptureReportAck.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoRootPartyIDs.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReportAck.NoRootPartyIDs();
	
				case quickfix.field.NoRootPartySubIDs.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReportAck.NoRootPartyIDs.NoRootPartySubIDs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReportAck.NoUnderlyings();
	
				case quickfix.field.NoTrdRepIndicators.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReportAck.NoTrdRepIndicators();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReportAck.NoLegs();
	
				case quickfix.field.NoLegStipulations.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReportAck.NoLegs.NoLegStipulations();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReportAck.NoLegs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReportAck.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoOfLegUnderlyings.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReportAck.NoLegs.NoOfLegUnderlyings();
	
				case quickfix.field.NoTrdRegTimestamps.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReportAck.NoTrdRegTimestamps();
	
				case quickfix.field.NoPosAmt.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReportAck.NoPosAmt();
	
				case quickfix.field.NoSides.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReportAck.NoSides();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReportAck.NoSides.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReportAck.NoSides.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoClearingInstructions.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReportAck.NoSides.NoClearingInstructions();
	
				case quickfix.field.NoContAmts.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReportAck.NoSides.NoContAmts();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReportAck.NoSides.NoStipulations();
	
				case quickfix.field.NoMiscFees.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReportAck.NoSides.NoMiscFees();
	
				case quickfix.field.NoSettlDetails.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReportAck.NoSides.NoSettlDetails();
	
				case quickfix.field.NoSettlPartyIDs.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReportAck.NoSides.NoSettlDetails.NoSettlPartyIDs();
	
				case quickfix.field.NoSettlPartySubIDs.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReportAck.NoSides.NoSettlDetails.NoSettlPartyIDs.NoSettlPartySubIDs();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReportAck.NoSides.NoAllocs();
	
				case quickfix.field.NoNested2PartyIDs.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReportAck.NoSides.NoAllocs.NoNested2PartyIDs();
	
				case quickfix.field.NoNested2PartySubIDs.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReportAck.NoSides.NoAllocs.NoNested2PartyIDs.NoNested2PartySubIDs();
	
				case quickfix.field.NoSideTrdRegTS.FIELD:
					return new quickfix.fix50sp2.TradeCaptureReportAck.NoSides.NoSideTrdRegTS();
	
			}
		}
	
		if (quickfix.fix50sp2.AllocationReport.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoOrders.FIELD:
					return new quickfix.fix50sp2.AllocationReport.NoOrders();
	
				case quickfix.field.NoNested2PartyIDs.FIELD:
					return new quickfix.fix50sp2.AllocationReport.NoOrders.NoNested2PartyIDs();
	
				case quickfix.field.NoNested2PartySubIDs.FIELD:
					return new quickfix.fix50sp2.AllocationReport.NoOrders.NoNested2PartyIDs.NoNested2PartySubIDs();
	
				case quickfix.field.NoExecs.FIELD:
					return new quickfix.fix50sp2.AllocationReport.NoExecs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.AllocationReport.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.AllocationReport.NoLegs();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.AllocationReport.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.AllocationReport.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp2.AllocationReport.NoStipulations();
	
				case quickfix.field.NoPosAmt.FIELD:
					return new quickfix.fix50sp2.AllocationReport.NoPosAmt();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix50sp2.AllocationReport.NoAllocs();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp2.AllocationReport.NoAllocs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp2.AllocationReport.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoMiscFees.FIELD:
					return new quickfix.fix50sp2.AllocationReport.NoAllocs.NoMiscFees();
	
				case quickfix.field.NoClearingInstructions.FIELD:
					return new quickfix.fix50sp2.AllocationReport.NoAllocs.NoClearingInstructions();
	
				case quickfix.field.NoRateSources.FIELD:
					return new quickfix.fix50sp2.AllocationReport.NoRateSources();
	
			}
		}
	
		if (quickfix.fix50sp2.AllocationReportAck.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.AllocationReportAck.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.AllocationReportAck.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix50sp2.AllocationReportAck.NoAllocs();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp2.AllocationReportAck.NoAllocs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp2.AllocationReportAck.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
			}
		}
	
		if (quickfix.fix50sp2.SettlementInstructionRequest.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.SettlementInstructionRequest.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.SettlementInstructionRequest.NoPartyIDs.NoPartySubIDs();
	
			}
		}
	
		if (quickfix.fix50sp2.AssignmentReport.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.AssignmentReport.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.AssignmentReport.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.AssignmentReport.NoLegs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.AssignmentReport.NoUnderlyings();
	
				case quickfix.field.NoPositions.FIELD:
					return new quickfix.fix50sp2.AssignmentReport.NoPositions();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp2.AssignmentReport.NoPositions.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp2.AssignmentReport.NoPositions.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoPosAmt.FIELD:
					return new quickfix.fix50sp2.AssignmentReport.NoPosAmt();
	
			}
		}
	
		if (quickfix.fix50sp2.CollateralRequest.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.CollateralRequest.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.CollateralRequest.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoExecs.FIELD:
					return new quickfix.fix50sp2.CollateralRequest.NoExecs();
	
				case quickfix.field.NoTrades.FIELD:
					return new quickfix.fix50sp2.CollateralRequest.NoTrades();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.CollateralRequest.NoLegs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.CollateralRequest.NoUnderlyings();
	
				case quickfix.field.NoTrdRegTimestamps.FIELD:
					return new quickfix.fix50sp2.CollateralRequest.NoTrdRegTimestamps();
	
				case quickfix.field.NoMiscFees.FIELD:
					return new quickfix.fix50sp2.CollateralRequest.NoMiscFees();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp2.CollateralRequest.NoStipulations();
	
			}
		}
	
		if (quickfix.fix50sp2.CollateralAssignment.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.CollateralAssignment.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.CollateralAssignment.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoExecs.FIELD:
					return new quickfix.fix50sp2.CollateralAssignment.NoExecs();
	
				case quickfix.field.NoTrades.FIELD:
					return new quickfix.fix50sp2.CollateralAssignment.NoTrades();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.CollateralAssignment.NoLegs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.CollateralAssignment.NoUnderlyings();
	
				case quickfix.field.NoTrdRegTimestamps.FIELD:
					return new quickfix.fix50sp2.CollateralAssignment.NoTrdRegTimestamps();
	
				case quickfix.field.NoMiscFees.FIELD:
					return new quickfix.fix50sp2.CollateralAssignment.NoMiscFees();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp2.CollateralAssignment.NoStipulations();
	
			}
		}
	
		if (quickfix.fix50sp2.CollateralResponse.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.CollateralResponse.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.CollateralResponse.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoExecs.FIELD:
					return new quickfix.fix50sp2.CollateralResponse.NoExecs();
	
				case quickfix.field.NoTrades.FIELD:
					return new quickfix.fix50sp2.CollateralResponse.NoTrades();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.CollateralResponse.NoLegs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.CollateralResponse.NoUnderlyings();
	
				case quickfix.field.NoTrdRegTimestamps.FIELD:
					return new quickfix.fix50sp2.CollateralResponse.NoTrdRegTimestamps();
	
				case quickfix.field.NoMiscFees.FIELD:
					return new quickfix.fix50sp2.CollateralResponse.NoMiscFees();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp2.CollateralResponse.NoStipulations();
	
			}
		}
	
		if (quickfix.fix50sp2.News.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoNewsRefIDs.FIELD:
					return new quickfix.fix50sp2.News.NoNewsRefIDs();
	
				case quickfix.field.NoRoutingIDs.FIELD:
					return new quickfix.fix50sp2.News.NoRoutingIDs();
	
				case quickfix.field.NoRelatedSym.FIELD:
					return new quickfix.fix50sp2.News.NoRelatedSym();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.News.NoLegs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.News.NoUnderlyings();
	
				case quickfix.field.NoLinesOfText.FIELD:
					return new quickfix.fix50sp2.News.NoLinesOfText();
	
			}
		}
	
		if (quickfix.fix50sp2.CollateralReport.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.CollateralReport.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.CollateralReport.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoExecs.FIELD:
					return new quickfix.fix50sp2.CollateralReport.NoExecs();
	
				case quickfix.field.NoTrades.FIELD:
					return new quickfix.fix50sp2.CollateralReport.NoTrades();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.CollateralReport.NoLegs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.CollateralReport.NoUnderlyings();
	
				case quickfix.field.NoTrdRegTimestamps.FIELD:
					return new quickfix.fix50sp2.CollateralReport.NoTrdRegTimestamps();
	
				case quickfix.field.NoMiscFees.FIELD:
					return new quickfix.fix50sp2.CollateralReport.NoMiscFees();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp2.CollateralReport.NoStipulations();
	
			}
		}
	
		if (quickfix.fix50sp2.CollateralInquiry.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoCollInquiryQualifier.FIELD:
					return new quickfix.fix50sp2.CollateralInquiry.NoCollInquiryQualifier();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.CollateralInquiry.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.CollateralInquiry.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoExecs.FIELD:
					return new quickfix.fix50sp2.CollateralInquiry.NoExecs();
	
				case quickfix.field.NoTrades.FIELD:
					return new quickfix.fix50sp2.CollateralInquiry.NoTrades();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.CollateralInquiry.NoLegs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.CollateralInquiry.NoUnderlyings();
	
				case quickfix.field.NoTrdRegTimestamps.FIELD:
					return new quickfix.fix50sp2.CollateralInquiry.NoTrdRegTimestamps();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp2.CollateralInquiry.NoStipulations();
	
			}
		}
	
		if (quickfix.fix50sp2.NetworkCounterpartySystemStatusRequest.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoCompIDs.FIELD:
					return new quickfix.fix50sp2.NetworkCounterpartySystemStatusRequest.NoCompIDs();
	
			}
		}
	
		if (quickfix.fix50sp2.NetworkCounterpartySystemStatusResponse.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoCompIDs.FIELD:
					return new quickfix.fix50sp2.NetworkCounterpartySystemStatusResponse.NoCompIDs();
	
			}
		}
	
		if (quickfix.fix50sp2.CollateralInquiryAck.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoCollInquiryQualifier.FIELD:
					return new quickfix.fix50sp2.CollateralInquiryAck.NoCollInquiryQualifier();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.CollateralInquiryAck.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.CollateralInquiryAck.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoExecs.FIELD:
					return new quickfix.fix50sp2.CollateralInquiryAck.NoExecs();
	
				case quickfix.field.NoTrades.FIELD:
					return new quickfix.fix50sp2.CollateralInquiryAck.NoTrades();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.CollateralInquiryAck.NoLegs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.CollateralInquiryAck.NoUnderlyings();
	
			}
		}
	
		if (quickfix.fix50sp2.ConfirmationRequest.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoOrders.FIELD:
					return new quickfix.fix50sp2.ConfirmationRequest.NoOrders();
	
				case quickfix.field.NoNested2PartyIDs.FIELD:
					return new quickfix.fix50sp2.ConfirmationRequest.NoOrders.NoNested2PartyIDs();
	
				case quickfix.field.NoNested2PartySubIDs.FIELD:
					return new quickfix.fix50sp2.ConfirmationRequest.NoOrders.NoNested2PartyIDs.NoNested2PartySubIDs();
	
			}
		}
	
		if (quickfix.fix50sp2.TradingSessionList.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix50sp2.TradingSessionList.NoTradingSessions();
	
			}
		}
	
		if (quickfix.fix50sp2.SecurityListUpdateReport.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoRelatedSym.FIELD:
					return new quickfix.fix50sp2.SecurityListUpdateReport.NoRelatedSym();
	
				case quickfix.field.NoStrikeRules.FIELD:
					return new quickfix.fix50sp2.SecurityListUpdateReport.NoRelatedSym.NoStrikeRules();
	
				case quickfix.field.NoMaturityRules.FIELD:
					return new quickfix.fix50sp2.SecurityListUpdateReport.NoRelatedSym.NoStrikeRules.NoMaturityRules();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.SecurityListUpdateReport.NoRelatedSym.NoUnderlyings();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp2.SecurityListUpdateReport.NoRelatedSym.NoStipulations();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.SecurityListUpdateReport.NoRelatedSym.NoLegs();
	
				case quickfix.field.NoLegStipulations.FIELD:
					return new quickfix.fix50sp2.SecurityListUpdateReport.NoRelatedSym.NoLegs.NoLegStipulations();
	
			}
		}
	
		if (quickfix.fix50sp2.AdjustedPositionReport.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.AdjustedPositionReport.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.AdjustedPositionReport.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoPositions.FIELD:
					return new quickfix.fix50sp2.AdjustedPositionReport.NoPositions();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp2.AdjustedPositionReport.NoPositions.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp2.AdjustedPositionReport.NoPositions.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoRelatedSym.FIELD:
					return new quickfix.fix50sp2.AdjustedPositionReport.NoRelatedSym();
	
			}
		}
	
		if (quickfix.fix50sp2.AllocationInstructionAlert.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoOrders.FIELD:
					return new quickfix.fix50sp2.AllocationInstructionAlert.NoOrders();
	
				case quickfix.field.NoNested2PartyIDs.FIELD:
					return new quickfix.fix50sp2.AllocationInstructionAlert.NoOrders.NoNested2PartyIDs();
	
				case quickfix.field.NoNested2PartySubIDs.FIELD:
					return new quickfix.fix50sp2.AllocationInstructionAlert.NoOrders.NoNested2PartyIDs.NoNested2PartySubIDs();
	
				case quickfix.field.NoExecs.FIELD:
					return new quickfix.fix50sp2.AllocationInstructionAlert.NoExecs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.AllocationInstructionAlert.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.AllocationInstructionAlert.NoLegs();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.AllocationInstructionAlert.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.AllocationInstructionAlert.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp2.AllocationInstructionAlert.NoStipulations();
	
				case quickfix.field.NoPosAmt.FIELD:
					return new quickfix.fix50sp2.AllocationInstructionAlert.NoPosAmt();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix50sp2.AllocationInstructionAlert.NoAllocs();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp2.AllocationInstructionAlert.NoAllocs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp2.AllocationInstructionAlert.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoMiscFees.FIELD:
					return new quickfix.fix50sp2.AllocationInstructionAlert.NoAllocs.NoMiscFees();
	
				case quickfix.field.NoClearingInstructions.FIELD:
					return new quickfix.fix50sp2.AllocationInstructionAlert.NoAllocs.NoClearingInstructions();
	
			}
		}
	
		if (quickfix.fix50sp2.ExecutionAcknowledgement.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.ExecutionAcknowledgement.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.ExecutionAcknowledgement.NoLegs();
	
			}
		}
	
		if (quickfix.fix50sp2.ContraryIntentionReport.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.ContraryIntentionReport.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.ContraryIntentionReport.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoExpiration.FIELD:
					return new quickfix.fix50sp2.ContraryIntentionReport.NoExpiration();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.ContraryIntentionReport.NoUnderlyings();
	
			}
		}
	
		if (quickfix.fix50sp2.SecurityDefinitionUpdateReport.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.SecurityDefinitionUpdateReport.NoUnderlyings();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp2.SecurityDefinitionUpdateReport.NoStipulations();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.SecurityDefinitionUpdateReport.NoLegs();
	
				case quickfix.field.NoMarketSegments.FIELD:
					return new quickfix.fix50sp2.SecurityDefinitionUpdateReport.NoMarketSegments();
	
				case quickfix.field.NoStrikeRules.FIELD:
					return new quickfix.fix50sp2.SecurityDefinitionUpdateReport.NoMarketSegments.NoStrikeRules();
	
				case quickfix.field.NoMaturityRules.FIELD:
					return new quickfix.fix50sp2.SecurityDefinitionUpdateReport.NoMarketSegments.NoStrikeRules.NoMaturityRules();
	
			}
		}
	
		if (quickfix.fix50sp2.SettlementObligationReport.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoSettlOblig.FIELD:
					return new quickfix.fix50sp2.SettlementObligationReport.NoSettlOblig();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.SettlementObligationReport.NoSettlOblig.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.SettlementObligationReport.NoSettlOblig.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoSettlDetails.FIELD:
					return new quickfix.fix50sp2.SettlementObligationReport.NoSettlOblig.NoSettlDetails();
	
				case quickfix.field.NoSettlPartyIDs.FIELD:
					return new quickfix.fix50sp2.SettlementObligationReport.NoSettlOblig.NoSettlDetails.NoSettlPartyIDs();
	
				case quickfix.field.NoSettlPartySubIDs.FIELD:
					return new quickfix.fix50sp2.SettlementObligationReport.NoSettlOblig.NoSettlDetails.NoSettlPartyIDs.NoSettlPartySubIDs();
	
			}
		}
	
		if (quickfix.fix50sp2.DerivativeSecurityListUpdateReport.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoRelatedSym.FIELD:
					return new quickfix.fix50sp2.DerivativeSecurityListUpdateReport.NoRelatedSym();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.DerivativeSecurityListUpdateReport.NoRelatedSym.NoLegs();
	
			}
		}
	
		if (quickfix.fix50sp2.TradingSessionListUpdateReport.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix50sp2.TradingSessionListUpdateReport.NoTradingSessions();
	
			}
		}
	
		if (quickfix.fix50sp2.MarketDefinition.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoOrdTypeRules.FIELD:
					return new quickfix.fix50sp2.MarketDefinition.NoOrdTypeRules();
	
				case quickfix.field.NoTimeInForceRules.FIELD:
					return new quickfix.fix50sp2.MarketDefinition.NoTimeInForceRules();
	
				case quickfix.field.NoExecInstRules.FIELD:
					return new quickfix.fix50sp2.MarketDefinition.NoExecInstRules();
	
			}
		}
	
		if (quickfix.fix50sp2.MarketDefinitionUpdateReport.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoOrdTypeRules.FIELD:
					return new quickfix.fix50sp2.MarketDefinitionUpdateReport.NoOrdTypeRules();
	
				case quickfix.field.NoTimeInForceRules.FIELD:
					return new quickfix.fix50sp2.MarketDefinitionUpdateReport.NoTimeInForceRules();
	
				case quickfix.field.NoExecInstRules.FIELD:
					return new quickfix.fix50sp2.MarketDefinitionUpdateReport.NoExecInstRules();
	
			}
		}
	
		if (quickfix.fix50sp2.ApplicationMessageRequest.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoApplIDs.FIELD:
					return new quickfix.fix50sp2.ApplicationMessageRequest.NoApplIDs();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp2.ApplicationMessageRequest.NoApplIDs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp2.ApplicationMessageRequest.NoApplIDs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.ApplicationMessageRequest.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.ApplicationMessageRequest.NoPartyIDs.NoPartySubIDs();
	
			}
		}
	
		if (quickfix.fix50sp2.ApplicationMessageRequestAck.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoApplIDs.FIELD:
					return new quickfix.fix50sp2.ApplicationMessageRequestAck.NoApplIDs();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp2.ApplicationMessageRequestAck.NoApplIDs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp2.ApplicationMessageRequestAck.NoApplIDs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.ApplicationMessageRequestAck.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.ApplicationMessageRequestAck.NoPartyIDs.NoPartySubIDs();
	
			}
		}
	
		if (quickfix.fix50sp2.ApplicationMessageReport.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoApplIDs.FIELD:
					return new quickfix.fix50sp2.ApplicationMessageReport.NoApplIDs();
	
			}
		}
	
		if (quickfix.fix50sp2.OrderMassActionReport.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoAffectedOrders.FIELD:
					return new quickfix.fix50sp2.OrderMassActionReport.NoAffectedOrders();
	
				case quickfix.field.NoNotAffectedOrders.FIELD:
					return new quickfix.fix50sp2.OrderMassActionReport.NoNotAffectedOrders();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.OrderMassActionReport.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.OrderMassActionReport.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoTargetPartyIDs.FIELD:
					return new quickfix.fix50sp2.OrderMassActionReport.NoTargetPartyIDs();
	
			}
		}
	
		if (quickfix.fix50sp2.Email.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoRoutingIDs.FIELD:
					return new quickfix.fix50sp2.Email.NoRoutingIDs();
	
				case quickfix.field.NoRelatedSym.FIELD:
					return new quickfix.fix50sp2.Email.NoRelatedSym();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.Email.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.Email.NoLegs();
	
				case quickfix.field.NoLinesOfText.FIELD:
					return new quickfix.fix50sp2.Email.NoLinesOfText();
	
			}
		}
	
		if (quickfix.fix50sp2.OrderMassActionRequest.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.OrderMassActionRequest.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.OrderMassActionRequest.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoTargetPartyIDs.FIELD:
					return new quickfix.fix50sp2.OrderMassActionRequest.NoTargetPartyIDs();
	
			}
		}
	
		if (quickfix.fix50sp2.UserNotification.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoUsernames.FIELD:
					return new quickfix.fix50sp2.UserNotification.NoUsernames();
	
			}
		}
	
		if (quickfix.fix50sp2.StreamAssignmentRequest.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoAsgnReqs.FIELD:
					return new quickfix.fix50sp2.StreamAssignmentRequest.NoAsgnReqs();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.StreamAssignmentRequest.NoAsgnReqs.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.StreamAssignmentRequest.NoAsgnReqs.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoRelatedSym.FIELD:
					return new quickfix.fix50sp2.StreamAssignmentRequest.NoAsgnReqs.NoRelatedSym();
	
			}
		}
	
		if (quickfix.fix50sp2.StreamAssignmentReport.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoAsgnReqs.FIELD:
					return new quickfix.fix50sp2.StreamAssignmentReport.NoAsgnReqs();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.StreamAssignmentReport.NoAsgnReqs.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.StreamAssignmentReport.NoAsgnReqs.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoRelatedSym.FIELD:
					return new quickfix.fix50sp2.StreamAssignmentReport.NoAsgnReqs.NoRelatedSym();
	
			}
		}
	
		if (quickfix.fix50sp2.NewOrderSingle.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.NewOrderSingle.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.NewOrderSingle.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix50sp2.NewOrderSingle.NoAllocs();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp2.NewOrderSingle.NoAllocs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp2.NewOrderSingle.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix50sp2.NewOrderSingle.NoTradingSessions();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.NewOrderSingle.NoUnderlyings();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp2.NewOrderSingle.NoStipulations();
	
				case quickfix.field.NoStrategyParameters.FIELD:
					return new quickfix.fix50sp2.NewOrderSingle.NoStrategyParameters();
	
				case quickfix.field.NoTrdRegTimestamps.FIELD:
					return new quickfix.fix50sp2.NewOrderSingle.NoTrdRegTimestamps();
	
			}
		}
	
		if (quickfix.fix50sp2.NewOrderList.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoRootPartyIDs.FIELD:
					return new quickfix.fix50sp2.NewOrderList.NoRootPartyIDs();
	
				case quickfix.field.NoRootPartySubIDs.FIELD:
					return new quickfix.fix50sp2.NewOrderList.NoRootPartyIDs.NoRootPartySubIDs();
	
				case quickfix.field.NoOrders.FIELD:
					return new quickfix.fix50sp2.NewOrderList.NoOrders();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.NewOrderList.NoOrders.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.NewOrderList.NoOrders.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix50sp2.NewOrderList.NoOrders.NoAllocs();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp2.NewOrderList.NoOrders.NoAllocs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp2.NewOrderList.NoOrders.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix50sp2.NewOrderList.NoOrders.NoTradingSessions();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.NewOrderList.NoOrders.NoUnderlyings();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp2.NewOrderList.NoOrders.NoStipulations();
	
				case quickfix.field.NoStrategyParameters.FIELD:
					return new quickfix.fix50sp2.NewOrderList.NoOrders.NoStrategyParameters();
	
			}
		}
	
		if (quickfix.fix50sp2.OrderCancelRequest.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.OrderCancelRequest.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.OrderCancelRequest.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.OrderCancelRequest.NoUnderlyings();
	
			}
		}
	
		if (quickfix.fix50sp2.OrderCancelReplaceRequest.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.OrderCancelReplaceRequest.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.OrderCancelReplaceRequest.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix50sp2.OrderCancelReplaceRequest.NoAllocs();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp2.OrderCancelReplaceRequest.NoAllocs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp2.OrderCancelReplaceRequest.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix50sp2.OrderCancelReplaceRequest.NoTradingSessions();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.OrderCancelReplaceRequest.NoUnderlyings();
	
				case quickfix.field.NoStrategyParameters.FIELD:
					return new quickfix.fix50sp2.OrderCancelReplaceRequest.NoStrategyParameters();
	
				case quickfix.field.NoTrdRegTimestamps.FIELD:
					return new quickfix.fix50sp2.OrderCancelReplaceRequest.NoTrdRegTimestamps();
	
			}
		}
	
		if (quickfix.fix50sp2.OrderStatusRequest.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.OrderStatusRequest.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.OrderStatusRequest.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.OrderStatusRequest.NoUnderlyings();
	
			}
		}
	
		if (quickfix.fix50sp2.AllocationInstruction.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoOrders.FIELD:
					return new quickfix.fix50sp2.AllocationInstruction.NoOrders();
	
				case quickfix.field.NoNested2PartyIDs.FIELD:
					return new quickfix.fix50sp2.AllocationInstruction.NoOrders.NoNested2PartyIDs();
	
				case quickfix.field.NoNested2PartySubIDs.FIELD:
					return new quickfix.fix50sp2.AllocationInstruction.NoOrders.NoNested2PartyIDs.NoNested2PartySubIDs();
	
				case quickfix.field.NoExecs.FIELD:
					return new quickfix.fix50sp2.AllocationInstruction.NoExecs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.AllocationInstruction.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.AllocationInstruction.NoLegs();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.AllocationInstruction.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.AllocationInstruction.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp2.AllocationInstruction.NoStipulations();
	
				case quickfix.field.NoPosAmt.FIELD:
					return new quickfix.fix50sp2.AllocationInstruction.NoPosAmt();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix50sp2.AllocationInstruction.NoAllocs();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp2.AllocationInstruction.NoAllocs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp2.AllocationInstruction.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoMiscFees.FIELD:
					return new quickfix.fix50sp2.AllocationInstruction.NoAllocs.NoMiscFees();
	
				case quickfix.field.NoClearingInstructions.FIELD:
					return new quickfix.fix50sp2.AllocationInstruction.NoAllocs.NoClearingInstructions();
	
				case quickfix.field.NoRateSources.FIELD:
					return new quickfix.fix50sp2.AllocationInstruction.NoRateSources();
	
			}
		}
	
		if (quickfix.fix50sp2.ListCancelRequest.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.ListCancelRequest.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.ListCancelRequest.NoPartyIDs.NoPartySubIDs();
	
			}
		}
	
		if (quickfix.fix50sp2.ListStatus.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoOrders.FIELD:
					return new quickfix.fix50sp2.ListStatus.NoOrders();
	
			}
		}
	
		if (quickfix.fix50sp2.AllocationInstructionAck.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.AllocationInstructionAck.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.AllocationInstructionAck.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix50sp2.AllocationInstructionAck.NoAllocs();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp2.AllocationInstructionAck.NoAllocs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp2.AllocationInstructionAck.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
			}
		}
	
		if (quickfix.fix50sp2.DontKnowTrade.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.DontKnowTrade.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.DontKnowTrade.NoLegs();
	
			}
		}
	
		if (quickfix.fix50sp2.QuoteRequest.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoRootPartyIDs.FIELD:
					return new quickfix.fix50sp2.QuoteRequest.NoRootPartyIDs();
	
				case quickfix.field.NoRootPartySubIDs.FIELD:
					return new quickfix.fix50sp2.QuoteRequest.NoRootPartyIDs.NoRootPartySubIDs();
	
				case quickfix.field.NoRelatedSym.FIELD:
					return new quickfix.fix50sp2.QuoteRequest.NoRelatedSym();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.QuoteRequest.NoRelatedSym.NoUnderlyings();
	
				case quickfix.field.NoRateSources.FIELD:
					return new quickfix.fix50sp2.QuoteRequest.NoRelatedSym.NoRateSources();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp2.QuoteRequest.NoRelatedSym.NoStipulations();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.QuoteRequest.NoRelatedSym.NoLegs();
	
				case quickfix.field.NoLegStipulations.FIELD:
					return new quickfix.fix50sp2.QuoteRequest.NoRelatedSym.NoLegs.NoLegStipulations();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp2.QuoteRequest.NoRelatedSym.NoLegs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp2.QuoteRequest.NoRelatedSym.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoQuoteQualifiers.FIELD:
					return new quickfix.fix50sp2.QuoteRequest.NoRelatedSym.NoQuoteQualifiers();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.QuoteRequest.NoRelatedSym.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.QuoteRequest.NoRelatedSym.NoPartyIDs.NoPartySubIDs();
	
			}
		}
	
		if (quickfix.fix50sp2.Quote.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoQuoteQualifiers.FIELD:
					return new quickfix.fix50sp2.Quote.NoQuoteQualifiers();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.Quote.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.Quote.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.Quote.NoUnderlyings();
	
				case quickfix.field.NoRateSources.FIELD:
					return new quickfix.fix50sp2.Quote.NoRateSources();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp2.Quote.NoStipulations();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.Quote.NoLegs();
	
				case quickfix.field.NoLegStipulations.FIELD:
					return new quickfix.fix50sp2.Quote.NoLegs.NoLegStipulations();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp2.Quote.NoLegs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp2.Quote.NoLegs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
			}
		}
	
		if (quickfix.fix50sp2.SettlementInstructions.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoSettlInst.FIELD:
					return new quickfix.fix50sp2.SettlementInstructions.NoSettlInst();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.SettlementInstructions.NoSettlInst.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.SettlementInstructions.NoSettlInst.NoPartyIDs.NoPartySubIDs();
	
			}
		}
	
		if (quickfix.fix50sp2.MarketDataRequest.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.MarketDataRequest.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.MarketDataRequest.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoMDEntryTypes.FIELD:
					return new quickfix.fix50sp2.MarketDataRequest.NoMDEntryTypes();
	
				case quickfix.field.NoRelatedSym.FIELD:
					return new quickfix.fix50sp2.MarketDataRequest.NoRelatedSym();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.MarketDataRequest.NoRelatedSym.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.MarketDataRequest.NoRelatedSym.NoLegs();
	
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix50sp2.MarketDataRequest.NoTradingSessions();
	
			}
		}
	
		if (quickfix.fix50sp2.MarketDataSnapshotFullRefresh.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.MarketDataSnapshotFullRefresh.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.MarketDataSnapshotFullRefresh.NoLegs();
	
				case quickfix.field.NoMDEntries.FIELD:
					return new quickfix.fix50sp2.MarketDataSnapshotFullRefresh.NoMDEntries();
	
				case quickfix.field.NoRateSources.FIELD:
					return new quickfix.fix50sp2.MarketDataSnapshotFullRefresh.NoMDEntries.NoRateSources();
	
				case quickfix.field.NoOfSecSizes.FIELD:
					return new quickfix.fix50sp2.MarketDataSnapshotFullRefresh.NoMDEntries.NoOfSecSizes();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.MarketDataSnapshotFullRefresh.NoMDEntries.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.MarketDataSnapshotFullRefresh.NoMDEntries.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoRoutingIDs.FIELD:
					return new quickfix.fix50sp2.MarketDataSnapshotFullRefresh.NoRoutingIDs();
	
			}
		}
	
		if (quickfix.fix50sp2.MarketDataIncrementalRefresh.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoMDEntries.FIELD:
					return new quickfix.fix50sp2.MarketDataIncrementalRefresh.NoMDEntries();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.MarketDataIncrementalRefresh.NoMDEntries.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.MarketDataIncrementalRefresh.NoMDEntries.NoLegs();
	
				case quickfix.field.NoRateSources.FIELD:
					return new quickfix.fix50sp2.MarketDataIncrementalRefresh.NoMDEntries.NoRateSources();
	
				case quickfix.field.NoOfSecSizes.FIELD:
					return new quickfix.fix50sp2.MarketDataIncrementalRefresh.NoMDEntries.NoOfSecSizes();
	
				case quickfix.field.NoStatsIndicators.FIELD:
					return new quickfix.fix50sp2.MarketDataIncrementalRefresh.NoMDEntries.NoStatsIndicators();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.MarketDataIncrementalRefresh.NoMDEntries.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.MarketDataIncrementalRefresh.NoMDEntries.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoRoutingIDs.FIELD:
					return new quickfix.fix50sp2.MarketDataIncrementalRefresh.NoRoutingIDs();
	
			}
		}
	
		if (quickfix.fix50sp2.MarketDataRequestReject.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.MarketDataRequestReject.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.MarketDataRequestReject.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoAltMDSource.FIELD:
					return new quickfix.fix50sp2.MarketDataRequestReject.NoAltMDSource();
	
			}
		}
	
		if (quickfix.fix50sp2.QuoteCancel.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.QuoteCancel.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.QuoteCancel.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoTargetPartyIDs.FIELD:
					return new quickfix.fix50sp2.QuoteCancel.NoTargetPartyIDs();
	
				case quickfix.field.NoQuoteEntries.FIELD:
					return new quickfix.fix50sp2.QuoteCancel.NoQuoteEntries();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.QuoteCancel.NoQuoteEntries.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.QuoteCancel.NoQuoteEntries.NoLegs();
	
			}
		}
	
		if (quickfix.fix50sp2.QuoteStatusRequest.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.QuoteStatusRequest.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.QuoteStatusRequest.NoLegs();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.QuoteStatusRequest.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.QuoteStatusRequest.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoTargetPartyIDs.FIELD:
					return new quickfix.fix50sp2.QuoteStatusRequest.NoTargetPartyIDs();
	
			}
		}
	
		if (quickfix.fix50sp2.MassQuoteAcknowledgement.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.MassQuoteAcknowledgement.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.MassQuoteAcknowledgement.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoTargetPartyIDs.FIELD:
					return new quickfix.fix50sp2.MassQuoteAcknowledgement.NoTargetPartyIDs();
	
				case quickfix.field.NoQuoteSets.FIELD:
					return new quickfix.fix50sp2.MassQuoteAcknowledgement.NoQuoteSets();
	
				case quickfix.field.NoQuoteEntries.FIELD:
					return new quickfix.fix50sp2.MassQuoteAcknowledgement.NoQuoteSets.NoQuoteEntries();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.MassQuoteAcknowledgement.NoQuoteSets.NoQuoteEntries.NoLegs();
	
			}
		}
	
		if (quickfix.fix50sp2.SecurityDefinitionRequest.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.SecurityDefinitionRequest.NoUnderlyings();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp2.SecurityDefinitionRequest.NoStipulations();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.SecurityDefinitionRequest.NoLegs();
	
			}
		}
	
		if (quickfix.fix50sp2.SecurityDefinition.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.SecurityDefinition.NoUnderlyings();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp2.SecurityDefinition.NoStipulations();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.SecurityDefinition.NoLegs();
	
				case quickfix.field.NoMarketSegments.FIELD:
					return new quickfix.fix50sp2.SecurityDefinition.NoMarketSegments();
	
				case quickfix.field.NoStrikeRules.FIELD:
					return new quickfix.fix50sp2.SecurityDefinition.NoMarketSegments.NoStrikeRules();
	
				case quickfix.field.NoMaturityRules.FIELD:
					return new quickfix.fix50sp2.SecurityDefinition.NoMarketSegments.NoStrikeRules.NoMaturityRules();
	
			}
		}
	
		if (quickfix.fix50sp2.SecurityStatusRequest.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.SecurityStatusRequest.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.SecurityStatusRequest.NoLegs();
	
			}
		}
	
		if (quickfix.fix50sp2.SecurityStatus.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.SecurityStatus.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.SecurityStatus.NoLegs();
	
			}
		}
	
		if (quickfix.fix50sp2.TradingSessionStatus.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
			}
		}
	
		if (quickfix.fix50sp2.MassQuote.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.MassQuote.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.MassQuote.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoQuoteSets.FIELD:
					return new quickfix.fix50sp2.MassQuote.NoQuoteSets();
	
				case quickfix.field.NoQuoteEntries.FIELD:
					return new quickfix.fix50sp2.MassQuote.NoQuoteSets.NoQuoteEntries();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.MassQuote.NoQuoteSets.NoQuoteEntries.NoLegs();
	
			}
		}
	
		if (quickfix.fix50sp2.BidRequest.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoBidDescriptors.FIELD:
					return new quickfix.fix50sp2.BidRequest.NoBidDescriptors();
	
				case quickfix.field.NoBidComponents.FIELD:
					return new quickfix.fix50sp2.BidRequest.NoBidComponents();
	
			}
		}
	
		if (quickfix.fix50sp2.BidResponse.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoBidComponents.FIELD:
					return new quickfix.fix50sp2.BidResponse.NoBidComponents();
	
			}
		}
	
		if (quickfix.fix50sp2.ListStrikePrice.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoStrikes.FIELD:
					return new quickfix.fix50sp2.ListStrikePrice.NoStrikes();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.ListStrikePrice.NoStrikes.NoUnderlyings();
	
			}
		}
	
		if (quickfix.fix50sp2.RegistrationInstructions.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.RegistrationInstructions.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.RegistrationInstructions.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoRegistDtls.FIELD:
					return new quickfix.fix50sp2.RegistrationInstructions.NoRegistDtls();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp2.RegistrationInstructions.NoRegistDtls.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp2.RegistrationInstructions.NoRegistDtls.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoDistribInsts.FIELD:
					return new quickfix.fix50sp2.RegistrationInstructions.NoDistribInsts();
	
			}
		}
	
		if (quickfix.fix50sp2.RegistrationInstructionsResponse.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.RegistrationInstructionsResponse.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.RegistrationInstructionsResponse.NoPartyIDs.NoPartySubIDs();
	
			}
		}
	
		if (quickfix.fix50sp2.OrderMassCancelRequest.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.OrderMassCancelRequest.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.OrderMassCancelRequest.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoTargetPartyIDs.FIELD:
					return new quickfix.fix50sp2.OrderMassCancelRequest.NoTargetPartyIDs();
	
			}
		}
	
		if (quickfix.fix50sp2.OrderMassCancelReport.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoAffectedOrders.FIELD:
					return new quickfix.fix50sp2.OrderMassCancelReport.NoAffectedOrders();
	
				case quickfix.field.NoNotAffectedOrders.FIELD:
					return new quickfix.fix50sp2.OrderMassCancelReport.NoNotAffectedOrders();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.OrderMassCancelReport.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.OrderMassCancelReport.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoTargetPartyIDs.FIELD:
					return new quickfix.fix50sp2.OrderMassCancelReport.NoTargetPartyIDs();
	
			}
		}
	
		if (quickfix.fix50sp2.NewOrderCross.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoRootPartyIDs.FIELD:
					return new quickfix.fix50sp2.NewOrderCross.NoRootPartyIDs();
	
				case quickfix.field.NoRootPartySubIDs.FIELD:
					return new quickfix.fix50sp2.NewOrderCross.NoRootPartyIDs.NoRootPartySubIDs();
	
				case quickfix.field.NoSides.FIELD:
					return new quickfix.fix50sp2.NewOrderCross.NoSides();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.NewOrderCross.NoSides.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.NewOrderCross.NoSides.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix50sp2.NewOrderCross.NoSides.NoAllocs();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp2.NewOrderCross.NoSides.NoAllocs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp2.NewOrderCross.NoSides.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.NewOrderCross.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.NewOrderCross.NoLegs();
	
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix50sp2.NewOrderCross.NoTradingSessions();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp2.NewOrderCross.NoStipulations();
	
				case quickfix.field.NoStrategyParameters.FIELD:
					return new quickfix.fix50sp2.NewOrderCross.NoStrategyParameters();
	
			}
		}
	
		if (quickfix.fix50sp2.CrossOrderCancelReplaceRequest.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoRootPartyIDs.FIELD:
					return new quickfix.fix50sp2.CrossOrderCancelReplaceRequest.NoRootPartyIDs();
	
				case quickfix.field.NoRootPartySubIDs.FIELD:
					return new quickfix.fix50sp2.CrossOrderCancelReplaceRequest.NoRootPartyIDs.NoRootPartySubIDs();
	
				case quickfix.field.NoSides.FIELD:
					return new quickfix.fix50sp2.CrossOrderCancelReplaceRequest.NoSides();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.CrossOrderCancelReplaceRequest.NoSides.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.CrossOrderCancelReplaceRequest.NoSides.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoAllocs.FIELD:
					return new quickfix.fix50sp2.CrossOrderCancelReplaceRequest.NoSides.NoAllocs();
	
				case quickfix.field.NoNestedPartyIDs.FIELD:
					return new quickfix.fix50sp2.CrossOrderCancelReplaceRequest.NoSides.NoAllocs.NoNestedPartyIDs();
	
				case quickfix.field.NoNestedPartySubIDs.FIELD:
					return new quickfix.fix50sp2.CrossOrderCancelReplaceRequest.NoSides.NoAllocs.NoNestedPartyIDs.NoNestedPartySubIDs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.CrossOrderCancelReplaceRequest.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.CrossOrderCancelReplaceRequest.NoLegs();
	
				case quickfix.field.NoTradingSessions.FIELD:
					return new quickfix.fix50sp2.CrossOrderCancelReplaceRequest.NoTradingSessions();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp2.CrossOrderCancelReplaceRequest.NoStipulations();
	
				case quickfix.field.NoStrategyParameters.FIELD:
					return new quickfix.fix50sp2.CrossOrderCancelReplaceRequest.NoStrategyParameters();
	
			}
		}
	
		if (quickfix.fix50sp2.CrossOrderCancelRequest.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoRootPartyIDs.FIELD:
					return new quickfix.fix50sp2.CrossOrderCancelRequest.NoRootPartyIDs();
	
				case quickfix.field.NoRootPartySubIDs.FIELD:
					return new quickfix.fix50sp2.CrossOrderCancelRequest.NoRootPartyIDs.NoRootPartySubIDs();
	
				case quickfix.field.NoSides.FIELD:
					return new quickfix.fix50sp2.CrossOrderCancelRequest.NoSides();
	
				case quickfix.field.NoPartyIDs.FIELD:
					return new quickfix.fix50sp2.CrossOrderCancelRequest.NoSides.NoPartyIDs();
	
				case quickfix.field.NoPartySubIDs.FIELD:
					return new quickfix.fix50sp2.CrossOrderCancelRequest.NoSides.NoPartyIDs.NoPartySubIDs();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.CrossOrderCancelRequest.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.CrossOrderCancelRequest.NoLegs();
	
			}
		}
	
		if (quickfix.fix50sp2.SecurityTypes.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoSecurityTypes.FIELD:
					return new quickfix.fix50sp2.SecurityTypes.NoSecurityTypes();
	
			}
		}
	
		if (quickfix.fix50sp2.SecurityListRequest.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.SecurityListRequest.NoUnderlyings();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.SecurityListRequest.NoLegs();
	
			}
		}
	
		if (quickfix.fix50sp2.SecurityList.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
				case quickfix.field.NoRelatedSym.FIELD:
					return new quickfix.fix50sp2.SecurityList.NoRelatedSym();
	
				case quickfix.field.NoStrikeRules.FIELD:
					return new quickfix.fix50sp2.SecurityList.NoRelatedSym.NoStrikeRules();
	
				case quickfix.field.NoMaturityRules.FIELD:
					return new quickfix.fix50sp2.SecurityList.NoRelatedSym.NoStrikeRules.NoMaturityRules();
	
				case quickfix.field.NoUnderlyings.FIELD:
					return new quickfix.fix50sp2.SecurityList.NoRelatedSym.NoUnderlyings();
	
				case quickfix.field.NoStipulations.FIELD:
					return new quickfix.fix50sp2.SecurityList.NoRelatedSym.NoStipulations();
	
				case quickfix.field.NoLegs.FIELD:
					return new quickfix.fix50sp2.SecurityList.NoRelatedSym.NoLegs();
	
				case quickfix.field.NoLegStipulations.FIELD:
					return new quickfix.fix50sp2.SecurityList.NoRelatedSym.NoLegs.NoLegStipulations();
	
			}
		}
	
		if (quickfix.fix50sp2.DerivativeSecurityListRequest.MSGTYPE.equals(msgType)) {
			switch (correspondingFieldID) {
			
			}
		}
	
		return null;
	}
}
