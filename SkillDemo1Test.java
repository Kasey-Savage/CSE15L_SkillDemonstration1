import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemo1Test {
    
    @Test 
    public void additionTest(){
        assertEquals(3, SkillDemo1.add(1,1));
    }
}
