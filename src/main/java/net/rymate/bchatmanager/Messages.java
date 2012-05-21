/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.rymate.bchatmanager;

import java.util.logging.Logger;
import org.bukkit.command.CommandSender;

/**
 *
 * @author rymate
 */
public enum Messages {

    PASSWORD_WRONG("Password incorrect."),
    NO_PERMISSIONS("Thou shalt not use that command."),
    ENABLED("bChatManager enabled! Have a nice day :)"), 
    CHANNEL_REMOVED("You were removed from a channel you were in!"),
    JOINED("You joined %channel!");
    private String format;

    Messages(String format) {
        this.format = format;
    }

    /**
     * Sends a message.
     *
     * @param sender receiver
     */
    void send(CommandSender sender) {
        sender.sendMessage(format);
    }
    
    /**
     * Sends a formatted message. 
     * I wish I could be bothered to make a formatter object :3
     * 
     * @param sender person who will receive the message
     * @param toReplace string to replace in the message
     * @param toReplaceWith what to replace the above string with
     * 
     */
    
    void sendFormatted(CommandSender sender, String toReplace, String toReplaceWith) {
        sender.sendMessage(format);
    }

    /**
     * Prints a message prefixed with [bChatManager] to the console.
     */
    void print() {
        Logger logger = Logger.getLogger("Minecraft");
        logger.info("[bChatManager] " + format);
    }
}
