package immutable;

/**
 * @author Valentin Martens, Jan Nabatian
 */

public class EMail {
	
	
	static String sender = " ";
    static String receiver = " ";
    static String caption = " ";
	static String message = " ";
	
	
	




/**
 * gets the sender
 * @return sender
 */
public static String getSender() {
	return sender;
}






/**
 * sets the sender
 * @param sender
 */
public static void setSender(String sender) {
	EMail.sender = sender;
}






/**
 * gets the receiver
 * @return receiver
 */
public static String getReceiver() {
	return receiver;
}






/**
 * sets the receiver
 * @param receiver
 */
public static void setReceiver(String receiver) {
	EMail.receiver = receiver;
}






/**
 * gets the caption
 * @return caption
 */
public static String getCaption() {
	return caption;
}






/**
 * sets the caption
 * @param caption
 */
public static void setCaption(String caption) {
	EMail.caption = caption;
}






/**
 * gets the message
 * @return message
 */
public static String getMessage() {
	return message;
}






/**
 * sets the message
 * @param message
 */
public static void setMessage(String message) {
	EMail.message = message;
}



}


