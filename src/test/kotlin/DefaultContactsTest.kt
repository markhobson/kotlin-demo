package demo

import org.junit.jupiter.api.Assertions.assertIterableEquals
import org.junit.jupiter.api.Test

class DefaultContactsTest {
    @Test
    fun `can add contact`() {
        val contacts = DefaultContacts()

        contacts.add(Contact("Dave", 42))

        assertIterableEquals(contacts.iterator().asSequence().asIterable(), listOf(Contact("Dave", 42)))
    }
}
