import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;

import java.io.PrintStream;

import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by julie on 1/10/16.
 */
public class PlayerTest {
    private PrintStream fakedOut;
    @Before
    public void getFakedOut(){
        fakedOut = mock(PrintStream.class);
    }
    @Test
    public void should_print_player2_attacked_player1(){
        PrintStream fakedOut = mock(PrintStream.class);
        InOrder inOrder = inOrder(fakedOut);
        Player player1 = new Player("李四",20,9,fakedOut);
        Player player2 = new Player("张三",10,8,fakedOut);
        player2.playerKill(player1);
        player1.playerKill(player2);
        player2.playerKill(player1);
        player1.playerKill(player2);

        //这个测试检测的是fakedOut的println方法传进去的参数是否相等，因此调用几次就要检测几次
//        verify(fakedOut).println("张三攻击了李四,李四受到了8点伤害,李四剩余生命：12\n" +
//                "    李四攻击了张三,张三受到了9点伤害,张三剩余生命：1\n" +
//                "    张三攻击了李四,李四受到了8点伤害,李四剩余生命：4\n" +
//                "    李四攻击了张三,张三受到了9点伤害,张三剩余生命：-8\n" +
//                "    张三被打败了");

        inOrder.verify(fakedOut).println("张三攻击了李四,李四受到了8点伤害,李四剩余生命：12");
        inOrder.verify(fakedOut).println("李四攻击了张三,张三受到了9点伤害,张三剩余生命：1");
        inOrder.verify(fakedOut).println("张三攻击了李四,李四受到了8点伤害,李四剩余生命：4");
        inOrder.verify(fakedOut).println("李四攻击了张三,张三受到了9点伤害,张三剩余生命：-8");
        inOrder.verify(fakedOut).println("张三被打败了");
    }
}
