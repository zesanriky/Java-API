package com.rahman.app.model;

import java.io.Serializable;
/**
 *If any API just need to send a message as reponse or error message then
 * this class can be used.
 * @author Rahman
 */
public class MessageResponse implements Serializable {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
