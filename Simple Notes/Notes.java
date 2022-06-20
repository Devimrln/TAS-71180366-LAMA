import java.io.Serializable;

public class Notes implements Serializable{
    public String Notes;

    private String notesName;

    abstract void addNotes(String);
    abstract  void showNotes();

    public Notes loadNotes(String){

    }
    public void saveNotes(){

    }
}
