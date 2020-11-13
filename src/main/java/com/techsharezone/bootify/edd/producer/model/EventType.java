package com.techsharezone.bootify.edd.producer.model;

/*
 * @created 13/11/2020 -03:36
 * @project bootify-edd
 * @author  saurabhshcs
 */

public enum EventType {

    NEW_STUDENT_CONFIRMATION("NEW_STUDENT_CONFIRMATION"),
    UPDATE_STUDENT_CONFIRMATION("UPDATE_STUDENT_CONFIRMATION");

    public final String eventType;

    EventType(final String eventType) {
        this.eventType = eventType;
    }
}
