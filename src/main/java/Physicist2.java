import java.util.Scanner;

public class Physicist2 {
    public static String isEquilibrium(int [][] f)
    {
        int x = 0;
        int y = 0;
        int z = 0;
        for(int i = 0 ; i <f.length; i++)
            x = f[i][0];
        for(int i = 0 ; i <f.length; i++)
            y = f[i][1];
        for(int i = 0 ; i <f.length; i++)
            z = f[i][2];
        if(x==0 && y ==0 && z ==0)
            return "YES";
        return "NO";
    }

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        int [][] forces = new int [n][3];
        for (int i = 0; i< forces.length ;i ++)
        {
            for (int j =0 ; j<3 ;j++)
            {
                forces[i][j]= x.nextInt();
            }
        }
        System.out.print(isEquilibrium(forces));
    }
}
