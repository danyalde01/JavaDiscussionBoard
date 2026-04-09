package forum;

import java.time.LocalDateTime;

/**
 * Repräsentiert einen Kommentar zu einer Nachricht.
 */
public class Comment {
    private String content;
    private LocalDateTime created;
    private Author author;

    /**
     * Erstellt einen neuen Kommentar.
     *
     * @param author Autor des Kommentars
     * @param content Inhalt des Kommentars
     * @param created Erstellungszeitpunkt
     */
    public Comment(Author author, String content, LocalDateTime created) {
        this.author = author;
        this.content = content;
        this.created = created;
    }

    /**
     * Liefert den Autor des Kommentars.
     *
     * @return Autor des Kommentars
     */
    public Author getAuthor() {
        return author;
    }

    /**
     * Liefert den Inhalt des Kommentars.
     *
     * @return Inhalt des Kommentars
     */
    public String getContent() {
        return content;
    }

    /**
     * Liefert den Erstellungszeitpunkt des Kommentars.
     *
     * @return Erstellungszeitpunkt
     */
    public LocalDateTime getCreated() {
        return created;
    }

    /**
     * Ändert den Inhalt des Kommentars.
     *
     * @param content Neuer Inhalt
     */
    public void setContent(String content) {
        this.content = content;
    }
}