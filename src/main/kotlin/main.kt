package demo

fun main() {
    val contacts = DefaultContacts()
    contacts.add(Contact("Bob", 42))
    contacts.add(Contact("Daisy", 31))

    for (contact in contacts) {
        println(contact)
    }
}
