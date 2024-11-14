package array.pensionato;

import java.util.Scanner;

public class Pensionato {
   private String name;
   private String email;
   private int room;

    public Pensionato() {

    }

    public Pensionato(int room, String name, String email ) {
        this.email = email;
        this.room = room;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }
}
