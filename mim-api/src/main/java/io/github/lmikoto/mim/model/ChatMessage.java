package io.github.lmikoto.mim.model;

import lombok.Data;

/**
 * @author liuyang
 * 2020-05-24 12:41
 */
@Data
public class ChatMessage {

    private MessageType messageType;

    private String content;

    private String sender;

    public enum MessageType {
        CHAT,
        JOIN,
        LEAVE
    }
}
