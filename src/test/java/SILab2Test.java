import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    private SILab2 siLab2 = new SILab2();
    private User userNull = null;
    private User user1 = new User(null, null, null);
    private User user2 = new User("ErLin", null, null);
    private User user3 = new User("ErLin", null, "erlinalii@outlookcom");
    private User user4 = new User("ErLin", null, "erlinalii.outlookcom");
    private User user5 = new User("ErLin", null, "erlinlii@outlook.com");
    public List<String> allUsers = new ArrayList<>();


    @Test
    public void PathTesting() {

        RuntimeException e;

//        PATH 1 : 1,2,3,18

//     Scenario 1: user = null, allUsers = new List()

        e = assertThrows(RuntimeException.class, () -> siLab2.function(userNull, allUsers));
        assertTrue(e.getMessage().contains("The user argument is not initialized!"));


//   PATH 2 : 1,2,4,5,18

//  Scenario 2: user = (null, null, null), allUsers = new List()


        e = assertThrows(RuntimeException.class, () -> siLab2.function(user1, allUsers));
        assertTrue(e.getMessage().contains("User already exists!"));

//        PATH 3 : 1,2,4,6,7,18

//        Scenario 3: user = (ErLin, null, null), allUsers = new List()

        assertFalse(siLab2.function(user2, allUsers));


//        PATH 4 : 1,2,4,6,8,9.1,9.2,[10,12,9.3,9.2],14,15,16,18

//        Scenario 4: user = (ErLin, null, erlinalii@outlookcom), allUsers = new List()

        assertFalse(siLab2.function(user3, allUsers));

//       PATH 5 : 1,2,4,6,8,9.1,9.2,[10,11,12,9.3,9.2],14,15,16,18

//     Scenario 5: user = (ErLin, null, erlinalii.outlookcom), allUsers = new List()

        assertFalse(siLab2.function(user4, allUsers));

//        PATH 6 : 1,2,4,6,8,9.1,9.2,[10,11,12,13,9.3,9.2],14,16,17,18

//        Scenario 6: user = (ErLin, null, erlinalii@outlook.com), allUsers = new List()

        assertTrue(siLab2.function(user5, allUsers));
    }

    @Test
    public void BranchTesting() {

        RuntimeException e;

        e = assertThrows(RuntimeException.class, () -> siLab2.function(userNull, allUsers));
        assertTrue(e.getMessage().contains("The user argument is not initialized!"));

        e = assertThrows(RuntimeException.class, () -> siLab2.function(user1, allUsers));
        assertTrue(e.getMessage().contains("User already exists!"));

        assertFalse(siLab2.function(user2, allUsers));

        assertFalse(siLab2.function(user3, allUsers));

        assertFalse(siLab2.function(user4, allUsers));

        assertTrue(siLab2.function(user5, allUsers));

    }
}
