package forum;

import java.time.LocalDateTime;

/**
 * Repräsentiert ein Thema innerhalb des Boards.
 */
public class Topic {
    private String title;
    private Message[] messages = new Message[0];

    /**
     * Erstellt ein neues Thema.
     *
     * @param title Titel des Themas
     */
    public Topic(String title) {
        this.title = title;
    }

    /**
     * Liefert den Titel des Themas.
     *
     * @return Titel des Themas
     */
    public String getTitle() {
        return title;
    }

    /**
     * Ändert den Titel des Themas.
     *
     * @param title Neuer Titel
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Liefert alle Nachrichten des Themas.
     *
     * @return Array mit Nachrichten
     */
    public Message[] getMessages() {
        return messages;
    }

    /**
     * Fügt dem Thema eine neue Nachricht hinzu.
     *
     * @param author Autor der Nachricht
     * @param title Titel der Nachricht
     * @param content Inhalt der Nachricht
     * @return Die erzeugte Nachricht
     */
    public Message addMessage(Author author, String title, String content) {
        Message message = new Message(author, title, content, LocalDateTime.now());

        Message[] newMessages = new Message[messages.length + 1];
        for (int i = 0; i < messages.length; i++) {
            newMessages[i] = messages[i];
        }
        newMessages[messages.length] = message;
        messages = newMessages;

        return message;
    }

    /**
     * Fügt dem Thema eine neue Nachricht mit vorgegebenem Zeitpunkt hinzu.
     *
     * @param author Autor der Nachricht
     * @param title Titel der Nachricht
     * @param content Inhalt der Nachricht
     * @param localDateTime Erstellungszeitpunkt der Nachricht
     * @return Die erzeugte Nachricht
     */
    public Message addMessage(Author author, String title, String content, LocalDateTime localDateTime) {
        Message message = new Message(author, title, content, localDateTime);

        Message[] newMessages = new Message[messages.length + 1];
        for (int i = 0; i < messages.length; i++) {
            newMessages[i] = messages[i];
        }
        newMessages[messages.length] = message;
        messages = newMessages;

        return message;
    }
}