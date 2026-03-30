import java.util.ArrayList;

public class Mobile {
    private ArrayList<Contact> contacts;

    public Mobile() {
        contacts = new ArrayList<>();
    }

    public int getContactPosition(String name) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public void addContact(Contact contact) throws Exception {
        if (getContactPosition(contact.getName()) >= 0) {
            throw new Exception("Could not add contact. Contact with this name already exists");
        }
        contacts.add(contact);
    }

    public void updateContact(Contact oldContact, Contact newContact) throws Exception {
        int foundPosition = getContactPosition(oldContact.getName());

        if (foundPosition < 0) {
            throw new Exception("Could not modify contact. Contact does not exist");
        }

        int existingPosition = getContactPosition(newContact.getName());

        if (existingPosition >= 0 && !oldContact.getName().equals(newContact.getName())) {
            throw new Exception("Could not modify contact. Contact with this name already exists");
        }

        contacts.set(foundPosition, newContact);
    }

    public void removeContact(Contact contact) throws Exception {
        int foundPosition = getContactPosition(contact.getName());

        if (foundPosition < 0) {
            throw new Exception("Could not remove contact. Contact does not exist");
        }

        contacts.remove(foundPosition);
    }

    public void listContacts() {
        for (Contact contact : contacts) {
            System.out.println(contact.getName() + " -> " +
                    contact.getPhoneNumber() + " (" + contact.getType() + ")");
        }
    }
}
