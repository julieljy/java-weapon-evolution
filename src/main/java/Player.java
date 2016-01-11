import java.io.PrintStream;

/**
 * Created by julie on 1/10/16.
 */
public class Player {

    private String name;
    private int hp;
    private int attack;
    private PrintStream printer;

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getAttack() {
        return attack;
    }

    public PrintStream getPrinter() {
        return printer;
    }

    public Player(String name, int hp, int attack, PrintStream printer) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.printer = printer;
    }

//    public void playerKill(Player player){
//        int minhp=player.hp;
//        for (int i=minhp;i>0;i=minhp){
//            player.hp=player.hp-this.attack;
//            if (player.hp<=0){
//                this.printer.println(player.getName()+"被打败了.");
//                break;
//            }
//            this.hp=this.hp-player.attack;
//            if (this.hp<=0){
//                this.printer.println(this.getName()+"被打败了.");
//                break;
//            }
//            minhp=player.hp;
//            if (minhp>this.hp){
//                minhp=this.hp;
//            }
//        }
//
//    }

    public void playerKill(Player player){
        player.hp=player.hp-this.attack;
        this.printer.println(this.getName()+"攻击了"+player.getName()+","+player.getName()+"受到了"+this.getAttack()+"点伤害,"
                +player.getName()+"剩余生命："+player.getHp());
        if (player.hp<=0){
            this.printer.println(player.getName()+"被打败了");
        }
    }

}
