package change1;
import java.util.Scanner;

class Axc
{
    static int x=1;
    int mx,nx;
    int ai[][] = new int [mx][nx];
    void luoxu() {
        int quan, i = 0, j = 0, m;
        quan = nx / 2 + nx % 2;
        for (m = 0; m < quan; m++) {
            for (i = m, j = m; j < (nx - m); j++)
            {
                ai[i][j] = x++;
            }
            for (j--, i++; i < (nx - m); i++)
            {
                ai[i][j] = x++;
            }
            for (j--, i--; j >= m; j--)
            {
                ai[i][j] = x++;
            }
            for (i--, j++; i > m; i--)
            {
                ai[i][j] = x++;
            }
        }
    }
    void cin(){
        Scanner in= new Scanner(System.in);
        nx=in.nextInt();
        mx=in.nextInt();
    }
    void coutl() {
        int i, j;
        for (i = 0; i < mx; i++) {
            for (j = 0; j < nx; j++) {
                if (ai[i][j] < 10) System.out.print(' ');
                System.out.print(ai[i][j]+" ");
            }
            System.out.println();
        }
    }
    void ccxz() {
        int h, y;
        Scanner in= new Scanner(System.in);
        h=in.nextInt();
        y=in.nextInt();
        System.out.println(ai[h-1][y-1]);
    }
}
public class Luoxuan {
    public static void main(String[] args) {
        args=new String[3];
        Axc a = new Axc();
        a.cin();
        a.luoxu();
        a.coutl();
        a.ccxz();

    }
}
