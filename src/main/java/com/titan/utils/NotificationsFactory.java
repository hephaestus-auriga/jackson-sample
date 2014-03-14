/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.titan.utils;

import com.titan.model.Notifications;
import com.titan.model.NotificationsInfo;


/**
 *
 * @author jeygokul
 */
public class NotificationsFactory {
    
    public NotificationsFactory(){
        
    }
    
    public Notifications getNotifications(){
        Notifications notifications = new Notifications();
        NotificationsInfo notificationsInfo = new NotificationsInfo();
        
        notifications.setType("Type");
        notifications.setCreated("Created");
        
        notificationsInfo.setBuyerName("Buyer Name");
        notificationsInfo.setBuyerTicker("Buyer Ticker");
        notificationsInfo.setCommunityId(0);
        notificationsInfo.setCommunityName("Community Name");
        notificationsInfo.setCommunityNotificationType("Community Notification Type");
        notificationsInfo.setCommunityThreadId(0);
        notificationsInfo.setCommunityTitle("Community Title");
        notificationsInfo.setCommunityTopic("Community Topic");
        notificationsInfo.setCommunityTopicId(0);
        notificationsInfo.setDividends(1.00);
        notificationsInfo.setEarnings(1.00);
        notificationsInfo.setExpenses(1.00);
        notificationsInfo.setFromFullName("From Full Name");
        notificationsInfo.setFromTicker("From Ticker");
        notificationsInfo.setFullName("Full Name");
        notificationsInfo.setFromTicker("From Ticker");
        notificationsInfo.setFullName("Full Name");
        notificationsInfo.setGains(1.00);
        notificationsInfo.setHeadlineId(0);
        notificationsInfo.setInviterFullName("Inviter Full Name");
        notificationsInfo.setInviterTicker("Inviter Ticker");
        notificationsInfo.setMentionType("Mention Type");
        notificationsInfo.setMessage("Message");
        notificationsInfo.setMessageType("Message Type");
        notificationsInfo.setMissionId(0);
        notificationsInfo.setMissionTitle("Mission Title");
        notificationsInfo.setPost("Post");
        notificationsInfo.setPrice(1.00);
        notificationsInfo.setReplyType("Reply Type");
        notificationsInfo.setRequestFullName("Request Full Name");
        notificationsInfo.setRequestTicker("Request Ticker");
        notificationsInfo.setSellerName("Seller Name");
        notificationsInfo.setSellerTicker("Seller Ticker");
        notificationsInfo.setShareholderMailIsowner(Boolean.TRUE);
        notificationsInfo.setShareholderMailSubject("Mail Subject");
        notificationsInfo.setShareholderThreadId("Share holder Thread id");
        notificationsInfo.setShares(1);
        notificationsInfo.setSharesBought(1);
        notificationsInfo.setSharesBoughtUserCount(1);
        notificationsInfo.setSharesSold(1);
        notificationsInfo.setSharesSoldUserCount(1);
        notificationsInfo.setStatusId("Status ID");
        notificationsInfo.setStockInfo("Stock Info");
        notificationsInfo.setSubject("Subject");
        notificationsInfo.setThreadId(0);
        notificationsInfo.setToFullName("To Full Name");
        notificationsInfo.setToTicker("To Ticker");
        notificationsInfo.setTopic("Topic");
        
        notifications.setNotificatioInfo(notificationsInfo);
        return notifications;
    }
    
}
