package fr.univtln.m2dapm.stock;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
//
//
//        EntityManagerFactory emf = Persistence
//                .createEntityManagerFactory("hibernate-h2-stock");
//        EntityManager em = emf.createEntityManager();
//
//
//
//        EntityTransaction transac = em.getTransaction();
//
//        IEquipment computer = new Computer.Builder()
//                .setName("My computer")
//                .setDescription("This one is awsome")
//                .build();
//
//        IEquipment chalkBox = new ChalkBox.Builder()
//                .setName("Chalkbox")
//                .setDescription("White plz")
//                .build();
//
//        IEquipment boardMarker = new BoardMarker.Builder()
//                .setName("BoardMarker")
//                .setDescription("It can be useful.")
//                .build();
//
//        IClassRoom classRoom = new ClassRoom.Builder()
//                .setName("U026")
//                .setDescription("Salle d'informatique")
//                .build();
//
//        ITeacher teacher = new Teacher.Builder()
//                .setFirstName("Bruno")
//                .setLastName("Emannuel")
//                .build();
//
//        ISchool school = new School.Builder()
//                .addClassRoom(classRoom)
//                .addTeacher(teacher)
//                .addEquipments(computer, chalkBox, boardMarker)
//                .setName("Université de Toulon")
//                .setDescription("La Garde")
//                .build();
//
//        transac.begin();
//        em.persist(classRoom);
//        em.persist(school);
//        transac.commit();

    }
}
