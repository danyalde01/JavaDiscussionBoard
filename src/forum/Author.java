package forum;

import java.time.LocalDate;

/**
 * Repräsentiert einen Autor mit Name, Benutzername und Geburtsdatum.
 */
public class Author {
    private String name;
    private String username;
    private LocalDate birthday;

    /**
     * Erstellt einen neuen Autor.
     *
     * @param name Anzeigename des Autors
     * @param username Eindeutiger Benutzername
     * @param birthday Geburtsdatum des Autors
     */
    public Author(String name, String username, LocalDate birthday) {
        this.name = name;
        this.username = username;
        this.birthday = birthday;
    }

    /**
     * Liefert den Namen des Autors.
     *
     * @return Name des Autors
     */
    public String getName() {
        return name;
    }

    /**
     * Liefert den Benutzernamen des Autors.
     *
     * @return Benutzername des Autors
     */
    public String getUsername() {
        return username;
    }

    /**
     * Liefert das Geburtsdatum des Autors.
     *
     * @return Geburtsdatum
     */
    public LocalDate getBirthday() {
        return birthday;
    }

    /**
     * Ändert den Namen des Autors.
     *
     * @param name Neuer Name
     */
    public void setName(String name) {
        this.name = name;
    }
}