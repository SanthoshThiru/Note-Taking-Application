import java.util.*;
public class MyNotesApp {

    Scanner sc = new Scanner(System.in);

    List<Note> Notes;
    
    MyNotesApp(){
        this.Notes = new ArrayList<>();

    }
    MyNotesApp(List<Note> Notes){
        this.Notes = Notes;
    }

    public Note createNote(){
        Note note = new Note();
        
        System.out.print("Please Enter Your Note's Title: ");
        String title = sc.nextLine();
        note.setTitle(title);

        System.out.println("\nPlease Enter Your Note's Content:");
        String content = sc.nextLine();
        note.setContent = content;

        System.out.println("\nPlease Enter Your Note's tags, and give Done");
        String tag;

        while(!tag.equalsIgnoreCase("Done")){
            tag = sc.nextLine();
            note.addTag(tag);
        }


        this.Notes.add(note);
        System.out.println("Your new note is created");
        return note;
    }

    public void viewNote(Note note){
        System.out.println(note);
    }

    public Note updateNote(Note note){
        
        System.out.print("Please Enter Note's Edit Title: ");
        String title = sc.nextLine();
        note.setTitle(title);

        System.out.print("Please Enter Note's Edit Content: ");
        String content = sc.nextLine();
        note.setContent = content;

        System.out.println("\nPlease Enter Note's edited tags, and give Done");
        List<String> tags ;
        String tag;

        while(true){
            tag = sc.nextLine();
            if(tag.equalsIgnoreCase("Done")) break;
            tags.add(tag);
        }
        note.setTag(tags);

        System.out.println("Your note is updated");
        return note;
    }

    public void deleteNote(Note note){
        note = new Note();
        
        System.out.println("Your last selected note is deleted");
    }

    public static void displayOptions(){

            System.out.println("...Welcome To MyNotesApp...");
            System.out.println("----Enter Option Number----");
            System.out.println("1. Create Note");
            System.out.println("2. View Note");
            System.out.println("3. Update Note");
            System.out.println("4. Delete Note");
            System.out.println("5. View All Notes");
            System.out.println("Enter -1 to exit");
    }
    public static void main(String[] args) {
        // Your Code goes here!

        int choice;
        MyNotesApp obj;

        loop:
        while(true){

            displayOptions();

            obj = new MyNotesApp();
            choice = sc.nextInt();
            switch(choice){
                case -1:
                break loop;

                case 1:
                obj.createNote();
                break;

                case 2:
                obj.viewNote();
                break;

                case 3:
                obj.updateNote();
                break;

                case 4:
                obj.deleteNote();
                break;

                default:
                System.out.println("Invalid option. Try again");
                break;
            }
            //break;// Stopping this application
        }

        sc.close();

    }
}