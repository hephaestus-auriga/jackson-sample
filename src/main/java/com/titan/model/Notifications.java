package com.titan.model;


/**
 * @author jeygokul
 * @since 0.1.0
 */
public class Notifications {

    public Notifications()
    {

    }

    private String type;
    private String created;
    private NotificationsInfo notificationsInfo;

    public String getType() {
        return type;
    }

    public String getCreated() {
        return created;
    }

    public NotificationsInfo getNotificationsInfo() {
        return notificationsInfo;
    }
    
    public void setType(String type){
        this.type = type;
    }
    
    public void setCreated(String created){
        this.created = created;
    }
    
    public void setNotificatioInfo(NotificationsInfo notificationInfo){
        this.notificationsInfo = notificationInfo;
    }

    @Override
    public String toString() {

        return new StringBuffer()
                .append("Notifications [ ")
                .append("Type : " + this.type)
                .append(", created :" + this.created)
                        // .append("info :"+this.getNotificationsInfo().toString()+"")
                .append("]")
                .toString();
    }
}
