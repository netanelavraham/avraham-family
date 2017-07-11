
import java.util.Scanner;
public class siglist
{
    public static void main(String[] args)
    {
        try (Scanner in = new Scanner(System.in)){


            int katan;
            int gadol;
            int ashray;
            int saac;
            int wdyw;

            System.out.println("מה אתה צריך");
            System.out.println("סגירת קופה=1");
            System.out.println("סיגריות=2");
            System.out.println("מלאי כללי=3");
            wdyw = in.nextInt();
            switch (wdyw)
            {
                case 1:
                    System.out.println("כמה יש בסך הכל");
                    saac = in.nextInt();
                    System.out.println("כמה כסף קטן יש");
                    katan = in.nextInt() ;
                    System.out.println("כמה כסף גדול יש");
                    gadol = in.nextInt();
                    ashray = saac - gadol - katan;

                    System.out.println("אשראי צריך לצאת:" + ashray);
                    in.close();
                    break;
                case 2:
                    int na,nlk,nla,nfk,nfa,nli,mt,mm,ml,ma,pmk,pma,pmf,pms,wl,wc,
                        wca,ld,lds,kk,ka,lm,lms,pkr,par,pkl,pal,ps,time,vog,camel,camelsoft;

                    System.out.println("נקסט אדום");
                    na = in.nextInt();
                    System.out.println("נקסט לייט קצר");
                    nlk = in.nextInt();
                    System.out.println("נקסט לייט ארוך");
                    nla = in.nextInt();
                    System.out.println("נקסט פילטר קצר");
                    nfk = in.nextInt();
                    System.out.println("נקסט פילטר ארוך");
                    nfa = in.nextInt();
                    System.out.println("נקסט לילך");
                    nli = in.nextInt();
                    System.out.println("מלבורו טאץ");
                    mt = in.nextInt();
                    System.out.println("מלבורו מיקס");
                    mm = in.nextInt();
                    System.out.println("מלבורו לייט");
                    ml = in.nextInt();
                    System.out.println("מלבורו אדום");
                    ma = in.nextInt();
                    System.out.println("פלמל קצר");
                    pmk = in.nextInt();
                    System.out.println("פלמל ארוך");
                    pma = in.nextInt();
                    System.out.println("פלמל פילטר");
                    pmf = in.nextInt();
                    System.out.println("פלמל סלימס");
                    pms = in.nextInt();
                    System.out.println("ווינסטון לייט");
                    wl = in.nextInt();
                    System.out.println("ווינסטון קוד");
                    wc = in.nextInt();
                    System.out.println("ווינסטון קוד אקווה");
                    wca = in.nextInt();
                    System.out.println("אלדי");
                    ld = in.nextInt();
                    System.out.println("אלדי סלימס");
                    lds = in.nextInt();
                    System.out.println("קנט קצר");
                    kk = in.nextInt();
                    System.out.println("קנט ארוך");
                    ka = in.nextInt();
                    System.out.println("אלם");
                    lm = in.nextInt();
                    System.out.println("אלם סלימס");
                    lms = in.nextInt();
                    System.out.println("פרלמנט קצר רגיל");
                    pkr = in.nextInt();
                    System.out.println("פרלמנט ארוך רגיל");
                    par = in.nextInt();
                    System.out.println("פרלמנט קצר לייט");
                    pkl = in.nextInt();
                    System.out.println("פרלמנט ארוך לייט");
                    pal = in.nextInt();
                    System.out.println("פרלמנט סלימס");
                    ps = in.nextInt();
                    System.out.println("טיים");
                    time = in.nextInt();
                    System.out.println("ווג");
                    vog = in.nextInt();
                    System.out.println("כאמל");
                    camel = in.nextInt();
                    System.out.println("כאמל סופט");
                    camelsoft = in.nextInt();
                    int listscreen;
                    System.out.println("איך ברצונך להוציא את הרשימה");
                    System.out.println("1=העתק הדבק");
                    System.out.println("2=צילומסך");
                    
                    listscreen=in.nextInt();
                    switch (listscreen){
                        case 1:
                            
                    
                    System.out.println("נקסט אדום:" + na);
                    System.out.println( "נקסט לייט קצר:" + nlk );
                    System.out.println( "נקסט לייט ארוך:" + nla );
                    System.out.println( "נקסט פילטר קצר:" + nfk);
                    System.out.println("נקסט פילטר ארוך:" + nfa );
                    System.out.println("נקסט לילך:" + nli);
                    System.out.println("מלבורו טאץ:" + mt);
                    System.out.println( "מלבורו מיקס:" + mm);
                    System.out.println( "מלבורו לייט:" + ml );
                    System.out.println( "מלבורו אדום:" + ma);
                    System.out.println( "כאמל:" + camel);
                    System.out.println( "כאמל סופט:" + camelsoft);
                    System.out.println("פלמל קצר:" + pmk);
                    System.out.println("פלמל ארוך:" + pma );
                    System.out.println("פלמל פילטר ארוך:" + pmf );
                    System.out.println("פלמל סלימס:" + pms);
                    System.out.println("ווינסטון לייט:" + wl );
                    System.out.println("ווינסטון קוד:" + wc );
                    System.out.println("ווינסטון קוד אקווה:" + wca );
                    System.out.println("אלדי:" + ld);
                    System.out.println("אלדי סלימס:" + lds);
                    System.out.println("קנט קצר:" + kk );
                    System.out.println( "קנט ארוך:" + ka);
                    System.out.println( "אלם:" + lm );
                    System.out.println( "אלם סלימס:" + lms );
                    System.out.println( "טיים:" + time );
                    System.out.println( "ווג:" + vog);
                    System.out.println("פרלמנט קצר רגיל:" + pkr );
                    System.out.println("פרלמנט רגיל ארוך:" + par );
                    System.out.println("פרלמנט לייט קצר:" + pkl );
                    System.out.println("פרלמנט לייט ארוך:" + pal );
                    System.out.println("פרלמנט סלימס:" + ps);
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    int sa = na + nlk + nla + nfk + nfa + nli + mt + mm + ml + ma + pmk + pma + pmf + pms + wl + wc +
                        wca + ld + lds + kk + ka + lm + lms + pkr + par + pkl + pal + ps + time + vog;
                    System.out.println(sa);
                    break;
                    case 2:
                            System.out.println("נקסט אדום:" + na + " " + "נקסט לייט קצר:" + nlk + " " + "נקסט לייט ארוך:" + nla + " " + "נקסט פילטר קצר:" + nfk
                                               + " " + "נקסט פילטר ארוך:" + nfa + " " + "נקסט לילך:" + nli);
                            System.out.println("מלבורו טאץ:" + mt + " " + "מלבורו מיקס:" + mm + " " + "מלבורו לייט:" + ml + " " + "מלבורו אדום:" + ma + " " + "כאמל:" + camel + " " + "כאמל סופט:" + camelsoft);
                            System.out.println("פלמל קצר:" + pmk + " " + "פלמל ארוך:" + pma + " " + "פלמל פילטר ארוך:" + pmf + " " + "פלמל סלימס:" + pms);
                            System.out.println("ווינסטון לייט:" + wl + " " + "ווינסטון קוד:" + wc + " " + "ווינסטון קוד אקווה:" + wca + " " + "אלדי:" + ld + " " + "אלדי סלימס:" + lds);
                            System.out.println("קנט קצר:" + kk + " " + "קנט ארוך:" + ka + " " + "אלם:" + lm + " " + "אלם סלימס:" + lms + " " + "טיים:" + time + " " + "ווג:" + vog);
                            System.out.println("פרלמנט קצר רגיל:" + pkr + " " + "פרלמנט רגיל ארוך:" + par + " " + "פרלמנט לייט קצר:" + pkl + " " + "פרלמנט לייט ארוך:" + pal + " " + "פרלמנט סלימס:" + ps);
                            System.out.println(" ");
                            System.out.println(" ");
                            System.out.println(" ");
                            int sak = na + nlk + nla + nfk + nfa + nli + mt + mm + ml + ma + pmk + pma + pmf + pms + wl + wc +
                                wca + ld + lds + kk + ka + lm + lms + pkr + par + pkl + pal + ps + time + vog;
                            System.out.println(sak);
                    }
                    
                    break;

                case 3:
                    int sakit,sariza,tropit,kemah,sugar,melach,zevel,shemen,aka,sabon
                        ,rizla,filter,tavlin,coska,cosga,zerogadol,kolagadol,kolapahit,kolazchuchit,
                        fta,ftma,ftpy,aylendgu,aylendman,tiras,rotev,resek,pitria,soda,water,zerozchuchit,gvina;
                    System.out.println("שקיות גופיה");
                    sakit = in.nextInt();
                    System.out.println("שקית אריזה");
                    sariza = in.nextInt();
                    System.out.println("טרופית");
                    tropit = in.nextInt();
                    System.out.println("קמח");
                    kemah = in.nextInt();
                    System.out.println("סוכר");
                    sugar = in.nextInt();
                    System.out.println("מלח");
                    melach = in.nextInt();
                    System.out.println("שקיות זבל");
                    zevel = in.nextInt();
                    System.out.println("שמן");
                    shemen = in.nextInt();
                    System.out.println("אקונומיקה");
                    aka = in.nextInt();
                    System.out.println("נוזל רצפות");
                    sabon = in.nextInt();
                    System.out.println("ריזלות");
                    rizla = in.nextInt();
                    System.out.println("פילטרים");
                    filter = in.nextInt();
                    System.out.println("תבלין פיצה מנות");
                    tavlin = in.nextInt();
                    System.out.println("כוסות קטן");
                    coska = in.nextInt();
                    System.out.println("כוס גדול");
                    cosga = in.nextInt();
                    System.out.println("קולה גדול");
                    kolagadol = in.nextInt();
                    System.out.println("זירו גדול");
                    zerogadol = in.nextInt();
                    System.out.println("קולה פחית");
                    kolapahit = in.nextInt();
                    System.out.println("קולה זכוכית");
                    kolazchuchit = in.nextInt();
                    System.out.println("זירו זכוכית");
                    zerozchuchit = in.nextInt();
                    System.out.println("פיוז טי אפרסק");
                    fta = in.nextInt();
                    System.out.println("פיוז טי מנגו אננס");
                    ftma = in.nextInt();
                    System.out.println("פיוז טי פירות יער");
                    ftpy = in.nextInt();
                    System.out.println("איילנד גויאבה");
                    aylendgu = in.nextInt();
                    System.out.println("איילנד מנגו");
                    aylendman = in.nextInt();
                    System.out.println("תירס");
                    tiras = in.nextInt();
                    System.out.println("רוטב");
                    rotev = in.nextInt();
                    System.out.println("רסק");
                    resek = in.nextInt();
                    System.out.println("פטריות");
                    pitria = in.nextInt();
                    System.out.println("סודה");
                    soda = in.nextInt();
                    System.out.println("מים");
                    water = in.nextInt();
                    System.out.println("גבינה");
                    gvina=in.nextInt();
                    System.out.println(" ");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("שקיות גופיה:" + sakit);
                    System.out.print("שקית אריזה:" + sariza);
                    System.out.print(" ");
                    System.out.println("טרופית:" + tropit);
                    System.out.print("קמח:" + kemah);
                    System.out.print(" ");
                    System.out.println("סוכר:" + sugar);
                    System.out.print("מלח:" + melach);
                    System.out.print(" ");
                    System.out.println("שקיות זבל:" + zevel);
                    System.out.print("שמן:" + shemen);
                    System.out.print(" ");
                    System.out.println("אקונומיקה:" + aka);
                    System.out.print("נוזל רצפות:" + sabon);
                    System.out.print(" ");
                    System.out.println("ריזלות:" + rizla);
                    System.out.print("פילטרים:" + filter);
                    System.out.print(" ");
                    System.out.println("תיבול פיצה מנות:" + tavlin);
                    System.out.print("כוסות קטן:" + coska);
                    System.out.print(" ");
                    System.out.println("כוסות גדול:" + cosga);
                    System.out.print("קולה גדול:" + kolagadol);
                    System.out.print(" ");
                    System.out.println("זירו גדול:" + zerogadol);
                    System.out.print("קולה פחית:" + kolapahit);
                    System.out.print(" ");
                    System.out.println("קולה זכוכית:" + kolazchuchit);
                    System.out.print("זירו זכוכית:" + zerozchuchit);
                    System.out.print(" ");
                    System.out.println("פיוז טי אפרסק:" + fta);
                    System.out.print("פיוז טי מנגו אננס:" + ftma);
                    System.out.print(" ");
                    System.out.println("פיוז טי פירות יער:" + ftpy);
                    System.out.print("איילנד גויאבה:" + aylendgu);
                    System.out.print(" ");
                    System.out.println("איילנד מנגו:" + aylendman);
                    System.out.print("תירס:" + tiras);
                    System.out.print(" ");
                    System.out.println("רוטב:" + rotev);
                    System.out.print("רסק:" + resek);
                    System.out.print(" ");
                    System.out.println("פטריות:" + pitria);
                    System.out.print("סודה:" + soda);
                    System.out.print(" ");
                    System.out.println("מים:" + water);

                    System.out.println("גבינה:"+gvina);


                    in.close();
                    break;

            }
        }
    }


}
