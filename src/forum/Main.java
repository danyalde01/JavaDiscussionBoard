package forum;

import java.time.LocalDate;

/**
 * Startklasse zum Testen des Diskussionsboards.
 */
public class Main {

    /**
     * Startet das Programm und erzeugt Beispielobjekte.
     *
     * @param args Programmargumente
     */
    public static void main(String[] args) {
        Board board = new Board("Willkommen im Java-Diskussionsboard");

        Author author = new Author(
                "Max Mustermann",
                "max01",
                LocalDate.of(2000, 1, 15)
        );

        Topic topic = board.addTopic("Java OOP");

        Message message = topic.addMessage(
                author,
                "Was ist Kapselung?",
                "Kann jemand Kapselung einfach erklären?"
        );

        message.addComment(
                author,
                "Kapselung bedeutet, dass interne Daten über Methoden geschützt werden."
        );

        System.out.println("Board-Slogan: " + board.getSlogan());
        System.out.println("Anzahl Themen: " + board.getTopics().length);
        System.out.println("Erstes Thema: " + topic.getTitle());
        System.out.println("Anzahl Nachrichten im Thema: " + topic.getMessages().length);
        System.out.println("Anzahl Kommentare in der Nachricht: " + message.getComments().length);
    }
}