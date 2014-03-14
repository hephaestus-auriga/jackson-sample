/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.titan.main;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.titan.jackson.NotificationsInfoMixin;
import com.titan.jackson.NotificationsMixin;
import com.titan.model.Notifications;
import com.titan.model.NotificationsInfo;
import com.titan.utils.NotificationsFactory;
import java.io.File;


/**
 *
 * @author jeygokul
 */
public class Invoker {

    public static void main(String... args) {
        try {
            NotificationsFactory factory = new NotificationsFactory();
            
            ObjectMapper mapper = new ObjectMapper();
            mapper.addMixInAnnotations(Notifications.class,NotificationsMixin.class);
            mapper.addMixInAnnotations(NotificationsInfo.class, NotificationsInfoMixin.class);
           
            Notifications notifications = factory.getNotifications();
            
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File("D:/workspace/nbworkspace/jackson-sample/notifications.json"), notifications);
            
            System.out.println("Done!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
