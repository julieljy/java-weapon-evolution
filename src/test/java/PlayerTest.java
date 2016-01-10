import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by julie on 1/10/16.
 */
public class PlayerTest {
    @Test
    public void should_print_loser(){
        PrintStream fakedOut = mock(PrintStream.class);
        Player player1 = new Player("李四",3,1,fakedOut);
        Player player2 = new Player("张三",4,3,fakedOut);
        player1.playerKill(player2);
        verify(fakedOut).println("李四被打败了.");
    }
}
