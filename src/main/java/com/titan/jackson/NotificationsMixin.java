package com.titan.jackson;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.titan.model.NotificationsInfo;

/**
 * @author jeygokul
 * @since 0.1.0
 */

@JsonTypeName("data")
//@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class NotificationsMixin {

    @JsonCreator
    NotificationsMixin() {

    }

    @JsonProperty("type")
    String type;

    @JsonProperty("created")
    String created;

    @JsonProperty("info")
    NotificationsInfo noteInfo;

    @JsonProperty("info")
    abstract NotificationsInfo getNoteInfo();

    @JsonProperty("type")
    abstract String getType() ;

    @JsonProperty("created")
    abstract String getCreated() ;
}
