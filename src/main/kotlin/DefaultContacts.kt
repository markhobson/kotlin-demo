package demo

class DefaultContacts : Contacts {
    private val contacts: MutableList<Contact> = mutableListOf()

    override fun add(contact: Contact) {
        contacts.add(contact)
    }

    operator fun iterator(): Iterator<Contact> {
        return contacts.iterator()
    }
}
