package com.techsharezone.bootify.edd.producer.model;

/*
 * @created 13/11/2020 -03:38
 * @project bootify-edd
 * @author  saurabhshcs
 */

public class StudentEventDto {

    private EventType eventType;
    private String email;

    public StudentEventDto(EventType eventType, String email) {
        this.eventType = eventType;
        this.email = email;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public static StudentEventDto create(final EventType eventType, final String email) {
        return new StudentEventDto(eventType, email);
    }

    @Override
    public String toString() {
        return "StudentEventDto{" +
                "eventType=" + eventType +
                ", email='" + email + '\'' +
                '}';
    }
}
