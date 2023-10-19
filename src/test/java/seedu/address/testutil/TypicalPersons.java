package seedu.address.testutil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import seedu.address.model.AddressBook;
import seedu.address.model.person.Person;

import static seedu.address.logic.commands.CommandTestUtil.*;

/**
 * A utility class containing a list of {@code Person} objects to be used in tests.
 */
public class TypicalPersons {

    public static final Person ALICE = new PersonBuilder()
            .withStudentNumber("A0343345A")
            .withName("Alice Pauline")
            .withGpa(2.9)
            .withComment("")
            .withEmail("alice@example.com")
            .withPhone("94351253")
            .withTags("friends")
            .withAttachments().build();
    public static final Person BENSON = new PersonBuilder()
            .withStudentNumber("A9473847C")
            .withName("Benson Meier")
            .withGpa(4.9)
            .withComment("")
            .withEmail("johnd@example.com")
            .withPhone("98765432")
            .withTags("owesMoney", "friends")
            .withAttachments().build();
    public static final Person CARL = new PersonBuilder()
            .withStudentNumber("A0437563D")
            .withName("Carl Kurz")
            .withPhone("95352563")
            .withEmail("heinz@example.com")
            .withGpa(4.0)
            .withComment("")
            .withAttachments()
            .build();
    public static final Person DANIEL = new PersonBuilder()
            .withStudentNumber("A0453552G")
            .withName("Daniel Meier")
            .withPhone("87652533")
            .withEmail("cornelia@example.com")
            .withGpa(3.0)
            .withComment("")
            .withTags("friends")
            .withAttachments()
            .build();
    public static final Person ELLE = new PersonBuilder()
            .withStudentNumber("A0348574E")
            .withName("Elle Meyer")
            .withPhone("9482224")
            .withEmail("werner@example.com")
            .withGpa(1.0)
            .withComment("")
            .withAttachments()
            .build();
    public static final Person FIONA = new PersonBuilder()
            .withStudentNumber("A0434534C")
            .withName("Fiona Kunz")
            .withPhone("9482427")
            .withEmail("lydia@example.com")
            .withGpa(2.0)
            .withComment("")
            .withAttachments()
            .build();
    public static final Person GEORGE = new PersonBuilder()
            .withStudentNumber("A0483728F")
            .withName("George Best")
            .withPhone("9482442")
            .withEmail("anna@example.com")
            .withGpa(4.0)
            .withAttachments()
            .build();

    // Manually added
    public static final Person HOON = new PersonBuilder().withStudentNumber("A0348483G").withName("Hoon Meier")
            .withPhone("8482424").withEmail("stefan@example.com").withGpa(0.1).withComment("").withAttachments().build();
    public static final Person IDA = new PersonBuilder().withStudentNumber("A3974743C").withName("Ida Mueller")
            .withPhone("8482131").withEmail("hans@example.com").withGpa(0.5).withComment("").withAttachments().build();

    // Manually added - Person's details found in {@code CommandTestUtil}
    public static final Person AMY = new PersonBuilder().withStudentNumber(VALID_STUDENT_NUMBER_AMY)
            .withName(VALID_NAME_AMY).withPhone(VALID_PHONE_AMY).withHidden(false)
            .withEmail(VALID_EMAIL_AMY).withGpa(VALID_GPA_AMY).withComment(VALID_COMMENT_AMY).withTags(VALID_TAG_FRIEND).withAttachments().build();
    public static final Person BOB = new PersonBuilder().withStudentNumber(VALID_STUDENT_NUMBER_BOB)
            .withName(VALID_NAME_BOB).withPhone(VALID_PHONE_BOB).withHidden(false)
            .withEmail(VALID_EMAIL_BOB).withGpa(VALID_GPA_BOB).withComment(VALID_COMMENT_BOB).withTags(VALID_TAG_HUSBAND, VALID_TAG_FRIEND)
            .withHidden(false).withAttachments().build();

    public static final String KEYWORD_MATCHING_MEIER = "Meier"; // A keyword that matches MEIER

    private TypicalPersons() {} // prevents instantiation

    /**
     * Returns an {@code AddressBook} with all the typical persons.
     */
    public static AddressBook getTypicalAddressBook() {
        AddressBook ab = new AddressBook();
        for (Person person : getTypicalPersons()) {
            ab.addPerson(person);
        }
        return ab;
    }

    public static List<Person> getTypicalPersons() {
        return new ArrayList<>(Arrays.asList(ALICE, BENSON, CARL, DANIEL, ELLE, FIONA, GEORGE));
    }
}
