package forum;

import java.time.LocalDateTime;

/**
 * Repräsentiert eine Nachricht innerhalb eines Themas.
 */
public class Message {
    private String title;
    private String content;
    private LocalDateTime created;
    private Author author;
    private Comment[] comments = new Comment[0];

    /**
     * Erstellt eine neue Nachricht.
     *
     * @param author Autor der Nachricht
     * @param title Titel der Nachricht
     * @param content Inhalt der Nachricht
     * @param created Erstellungszeitpunkt
     */
    public Message(Author author, String title, String content, LocalDateTime created) {
        this.author = author;
        this.title = title;
        this.content = content;
        this.created = created;
    }

    /**
     * Liefert den Autor der Nachricht.
     *
     * @return Autor der Nachricht
     */
    public Author getAuthor() {
        return author;
    }

    /**
     * Liefert den Titel der Nachricht.
     *
     * @return Titel der Nachricht
     */
    public String getTitle() {
        return title;
    }

    /**
     * Liefert den Inhalt der Nachricht.
     *
     * @return Inhalt der Nachricht
     */
    public String getContent() {
        return content;
    }

    /**
     * Liefert den Erstellungszeitpunkt der Nachricht.
     *
     * @return Erstellungszeitpunkt
     */
    public LocalDateTime getCreated() {
        return created;
    }

    /**
     * Liefert alle Kommentare der Nachricht.
     *
     * @return Array mit Kommentaren
     */
    public Comment[] getComments() {
        return comments;
    }

    /**
     * Ändert den Titel der Nachricht.
     *
     * @param title Neuer Titel
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Ändert den Inhalt der Nachricht.
     *
     * @param content Neuer Inhalt
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * Fügt einen neuen Kommentar zur Nachricht hinzu.
     *
     * @param author Autor des Kommentars
     * @param content Inhalt des Kommentars
     * @return Der erzeugte Kommentar
     */
    public Comment addComment(Author author, String content) {
        Comment comment = new Comment(author, content, LocalDateTime.now());

        Comment[] newComments = new Comment[comments.length + 1];
        for (int i = 0; i < comments.length; i++) {
            newComments[i] = comments[i];
        }
        newComments[comments.length] = comment;
        comments = newComments;

        return comment;
    }
}