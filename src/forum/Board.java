package forum;

/**
 * Repräsentiert das gesamte Diskussionsboard mit einem Slogan und mehreren Themen.
 */
public class Board {
    private String slogan;
    private Topic[] topics = new Topic[0];

    /**
     * Erstellt ein neues Board.
     *
     * @param slogan Slogan des Boards
     */
    public Board(String slogan) {
        this.slogan = slogan;
    }

    /**
     * Liefert den Slogan des Boards.
     *
     * @return Slogan des Boards
     */
    public String getSlogan() {
        return slogan;
    }

    /**
     * Liefert alle Themen des Boards.
     *
     * @return Array mit Themen
     */
    public Topic[] getTopics() {
        return topics;
    }

    /**
     * Ändert den Slogan des Boards.
     *
     * @param slogan Neuer Slogan
     */
    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    /**
     * Fügt dem Board ein neues Thema hinzu.
     *
     * @param title Titel des Themas
     * @return Das erzeugte Thema
     */
    public Topic addTopic(String title) {
        Topic topic = new Topic(title);

        Topic[] newTopics = new Topic[topics.length + 1];
        for (int i = 0; i < topics.length; i++) {
            newTopics[i] = topics[i];
        }
        newTopics[topics.length] = topic;
        topics = newTopics;

        return topic;
    }
}