

public abstract class Notes {
    public String Notes;

    public String getNotes() {
        return Notes;
    }

    public void setNotes(String notes) {
        Notes = notes;
    }

    private String notesName;

    public String getNotesName() {
        return notesName;
    }

    public void setNotesName(String notesName) {
        this.notesName = notesName;
    }

    public abstract void addNotes(String);
    public abstract void showNotes();


    static public Notes loadNotes(String){

    }
    public void saveNotes(){

    }
}