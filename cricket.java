import java.util.*;
class cricket 
{
    static Scanner sc = new Scanner(System.in);int g=0;int h=0;
    int sumplayer=0,sumcomputer =0;String name="";

    int computerRandom()
    {
        int n=0;
        double d= Math.random();
        d=d*10;
        n=(int)d;

        return(n);
    }

    void batting(int k)
    {
        System.out.println("its your batting ");g=0;h=0;
        for(int i=0;i<k;i++)
            h=h+computerRandom();

        int comp = 0;int n=-1;
        while(n!=comp)
        {
            System.out.println("Enter your number");             
            do{
                n = sc.nextInt();
                if(n>9)
                {
                    System.out.println("enter number again and it should be less than 10 otherwise u will be disqualified");
                }
            }while(n>9);
            if(g<=h)
                comp= computerRandom();
            else
                comp=n;
            System.out.println("My number is "+comp);
            if(n!=comp)
            {
                sumplayer = sumplayer+n;
                System.out.println("Your score is "+sumplayer);  
            }
            g++;
        }
        System.out.println("You are out and your finalscore is "+sumplayer);
        System.out.println("and I have to make "+(sumplayer+1)+" for winning this match");        
    }

    void  bowling()
    {
        sumplayer++;;
        int comp =0;
        System.out.println("Now its my batting, you bowl");
        int n=-1;
        while(n!=comp && sumcomputer<sumplayer)
        {
            System.out.println("Enter your number");
            do{
                n = sc.nextInt();
                if(n>9)
                    System.out.println("enter number less than 10 otherwise u will be disqualified "+name); 
            }while(n>9);
            comp = computerRandom();

            System.out.println("My number is "+comp);
            if(n!=comp)
            {
                sumcomputer = sumcomputer+comp;
                System.out.println("My score is "+sumcomputer);
            }
            if(sumcomputer>=sumplayer)
            {
                System.out.println("i win ");
                System.out.println("My final score is "+sumcomputer);
            }
            if(n==comp && sumcomputer<sumplayer)
                System.out.println("oh! i lose you win. I lost by "+(sumplayer-sumcomputer)+"runs");
        }
    }

    void compBatting()
    {
        System.out.println("its my batting");
        int comp=0;int n=0;
        do
        {
            System.out.println("Enter your number "+name);
            do{
                n=sc.nextInt();  
                if(n>9)
                {
                    System.out.println("enter number less than 10 otherwise u will be disqualified "+name); 
                }
            }while(n>9);
            comp= computerRandom();

            System.out.println("my number is "+comp);
            if(comp!=n)
            {
                sumcomputer=sumcomputer+comp;
                System.out.println("My score is "+sumcomputer);
            }
            if(comp==n)
            {
                System.out.println("Oh! i am out");
                System.out.println("And my score is "+sumcomputer);
            }
        }while(comp!=n);

    }

    void computerBowling(int k)
    {
        System.out.println("now its your batting "+name);g=0;h=0;
        for(int i=0;i<k;i++)
            h=h+computerRandom();

        int n=0,comp=0;
        do
        {
            System.out.println("enter your number "+ name);
            do{
                n=sc.nextInt();
                if(n>9)
                    System.out.println("enter number less than 10 otherwise u("+name+") will be disqualified");
            }while(n>9);
            if(g<h)
                comp = computerRandom();
            else
                comp=n;
            System.out.println("my number is "+comp);
            if(comp!=n)
            {
                sumplayer+=n;
                System.out.println("your score is "+sumplayer);
                if(sumplayer<sumcomputer)
                    System.out.println("you have to make "+(sumcomputer-sumplayer+1)+" to win this game "+ name);
            }
            if(sumplayer>sumcomputer)
            {
                break;
            }
            g++;
        }while(comp!=n);
        if(sumplayer>sumcomputer)
        {
            System.out.println("oh you win and i lose");
        }
        else
        {
            System.out.println("i win you lose! U are a big looser "+name);
        }
    }

    void toss()
    {
        System.out.print("\f");
        int g=3;name="";int z=0;
        System.out.println("Enter your name");
        name = sc.next();
        System.out.print("\f");
        while(g==1||g==3)
        {
            sumplayer=0;
            sumcomputer=0;
            if(g==3)
            {
                System.out.println("Enter difficulty level 5 mean most difficult and 1 means most easy");
                do
                {
                    z = sc.nextInt();
                    if(z>5)
                    {
                        System.out.println("enter difficulty level below 5");
                    }
                }while(z>5);

                z=6-z;
            }
            System.out.println("\f");

            System.out.println();
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println();
            System.out.println("\t\t\t\t\t"+"╭━┳━╭━╭━╮╮ ");
            System.out.println("\t\t\t\t\t"+"┃┈┈┈┣▅╋▅┫┃ ");
            System.out.println("\t\t\t\t\t"+"┃┈┃┈╰━╰━━━━━━╮ ");
            System.out.println("\t\t\t\t\t"+"╰┳╯┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈◢▉◣ ");
            System.out.println("\t\t\t\t\t"+"╲┃┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈▉▉▉ ");
            System.out.println("\t\t\t\t\t"+"╲┃┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈◥▉◤ "+"                       █▀▄▀█ █▀▀█ █▀▀▄ █▀▀ 　 █▀▀▄ █──█ ── 　 ─█▀▀█ █──█ █──█ █▀▀ █──█ █▀▄▀█ █▀▀█ █▀▀▄");
            System.out.println("\t\t\t\t\t"+"╲┃┈┈┈┈╭━┳━━━━╯    "+"                                █─▀─█ █▄▄█ █──█ █▀▀ 　 █▀▀▄ █▄▄█ ▀▀ 　 ░█▄▄█ █▄▄█ █──█ ▀▀█ █▀▀█ █─▀─█ █▄▄█ █──█");
            System.out.println("\t\t\t\t\t"+"╲┣━━━━━━┫ "+"                                        ▀───▀ ▀──▀ ▀▀▀─ ▀▀▀ 　 ▀▀▀─ ▄▄▄█ ── 　 ░█─░█ ▄▄▄█ ─▀▀▀ ▀▀▀ ▀──▀ ▀───▀ ▀──▀ ▀──▀");
            System.out.println();
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println();
            System.out.println();
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t"+"               ██╗░░██╗░█████╗░███╗░░██╗██████╗░  ░█████╗░██████╗░██╗░█████╗░██╗░░██╗███████╗████████╗");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t"+"               ██║░░██║██╔══██╗████╗░██║██╔══██╗  ██╔══██╗██╔══██╗██║██╔══██╗██║░██╔╝██╔════╝╚══██╔══╝");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t"+"               ███████║███████║██╔██╗██║██║░░██║  ██║░░╚═╝██████╔╝██║██║░░╚═╝█████═╝░█████╗░░░░░██║░░░");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t"+"               ██╔══██║██╔══██║██║╚████║██║░░██║  ██║░░██╗██╔══██╗██║██║░░██╗██╔═██╗░██╔══╝░░░░░██║░░░");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t"+"               ██║░░██║██║░░██║██║░╚███║██████╔╝  ╚█████╔╝██║░░██║██║╚█████╔╝██║░╚██╗███████╗░░░██║░░░");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t"+"               ╚═╝░░╚═╝╚═╝░░╚═╝╚═╝░░╚══╝╚═════╝░  ░╚════╝░╚═╝░░╚═╝╚═╝░╚════╝░╚═╝░░╚═╝╚══════╝░░░╚═╝░░░");
            System.out.println();
            System.out.println();
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("difficulty level - "+(6-z));
            System.out.println();
            System.out.println();
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t                                          "+"\t"+name+"  vs   computer");     
            System.out.println("Now its time for toss");
            System.out.println(name+" enter 1 for heads and 2 for tales");
            int choice = sc.nextInt();
            int coin=computerRandom();cricket ob = new cricket();
            if(coin>-1&&coin<6)
            {
                coin = 1;
            }
            else
                coin = 2;
            if(coin==choice)
            {
                System.out.println("you win the toss what do you choose "+name+" ? 1 for batting and 2 for bowling");
                int x = sc.nextInt();
                if(x==1)
                {
                    ob.batting(z);
                    ob.bowling();
                }
                else
                {
                    ob.compBatting();
                    ob.computerBowling(z);
                }
            }
            else
            {
                System.out.println("i won the toss and i choose to");
                int y = computerRandom();
                if( y>-1&&y<6)
                {
                    System.out.println(" batting");
                    ob.compBatting();
                    ob.computerBowling(z);
                }
                else
                {
                    System.out.println(" bowling");
                    ob.batting(z);
                    ob.bowling();
                }
            }
            System.out.println("Want to play one more time? if yes press 1 and press 2 to exit. press 3 to change difficulty level");
            g=sc.nextInt();
            System.out.println("\f");
        }
        System.out.println("hope to see you again, bbye "+name);
    }
    public static void main(String[] args) {
        cricket ob =new cricket();
        ob.toss();
    }
}

