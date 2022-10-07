import java.util.ArrayList;

public class ContactList {
    private ArrayList<String> contactlist = new ArrayList<String>();

    public void addContact(String contact){
        contactlist.add(contact);
    }

    public void printContactList() {
        System.out.println("You have " + contactlist.size() + " items in your contact list");
        for (int i = 0; i < contactlist.size(); i++) {
            System.out.println((i + 1) + ". " + contactlist.get(i));
        }
    }

    public void modifyContact(String currentContact, String newContact){
        int position = findItem(currentContact);
        if(position >=0){
            modifyContact(position, newContact);
        }
    }

    private void modifyContact(int position, String newItem){
        contactlist.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified to " + newItem);
    }

    public void removeContactItem(String item){
        int position = findItem(item);
        if(position >=0) {
            removeContactItem(position);
        }
    }

    private void removeContactItem(int position){
        contactlist.remove(position);
    }

    private int findItem(String searchContact){
        return contactlist.indexOf(searchContact);
    }

    public boolean onFile(String searchItem){
        int position = findItem(searchItem);
        if(position >=0){
            return true;
        }
        return false;
    }
}
