import java.util.Scanner;
import java.lang.Math;
import java.lang.Integer;

public class mainCalculatorExecute {
    public static void main (String[] args){

        String n1;
        int n3;
        int n4;
        int sqrtn;
        int cbrtn;
        int tenxn;
        int sinn;
        int cosn;
        int tann;
        int lnn;
        int asinn;
        int acosn;
        int atann;
        int logn;
        int varA;
        int varB;
        int varC;
        int varD;
        int varE;
        int varF;
        int varX;
        int varY;
        int varM;
        int sum;
        int dif;
        int times;
        double shiftSinSinn;
        double shiftCosCosn;
        double shiftTanTann;
        double notShiftSinRes;
        double notShiftCosRes;
        double notShiftTanRes;
        double notShiftAsinRes;
        double notShiftAcosRes;
        double notShiftAtanRes;
        double logRes;
        double lnRes;
        double sqrtRes;
        double cbrtRes;
        double tenxRes;
        double div;
        double n5;
        double n6;
        String shiftValueOfn1;
        String equalsign;
        String userCharVarChoose;
        String chooseEnd;
        String plus = new String("+");
        String minus = new String("-");
        String time = new String("*");
        String divide = new String("/");
        String oprChoose;

        System.out.println("Scientific calculator");

        System.out.println("Please note: the notation is strictly shrewd");

            Scanner  var1 = new Scanner(System.in);

            n1 = var1.nextLine();

            n1 = n1.toLowerCase();

            if(n1.equals("shift")){
                Scanner shiftn1 = new Scanner(System.in);
                shiftValueOfn1 = shiftn1.nextLine();
                if(shiftValueOfn1.equals("sin")){
                    Scanner sinFactor = new Scanner(System.in);
                    sinn = sinFactor.nextInt();
                    shiftSinSinn = Math.asin(sinn);
                    System.out.println(shiftSinSinn);
                    String latestOutputSystemLog = String.valueOf(shiftSinSinn);
                }
                else if(shiftValueOfn1.equals("cos")){
                    Scanner cosFactor = new Scanner(System.in);
                    cosn = cosFactor.nextInt();
                    shiftCosCosn = Math.acos(cosn);
                    System.out.println(shiftCosCosn);
                    String latestOutputSystemLog = String.valueOf(shiftCosCosn);
                }
                else if(shiftValueOfn1.equals("tan")){
                    Scanner tanFactor = new Scanner(System.in);
                    tann = tanFactor.nextInt();
                    shiftTanTann = Math.atan(tann);
                    System.out.println(shiftTanTann);
                    String latestOutputSystemLog = String.valueOf(shiftTanTann);
                }
            }
            if(n1.equals("sqrt") || n1.equals("root")){
                Scanner sqrtFactor = new Scanner(System.in);
                sqrtn = sqrtFactor.nextInt();
                sqrtRes = Math.sqrt(sqrtn);
                System.out.println(sqrtRes);
                String latestOutputSystemLog = String.valueOf(sqrtRes);
            }
            else if(n1.equals("cbrt") || n1.equals("throot")){
                Scanner cbrtFactor = new Scanner(System.in);
                cbrtn = cbrtFactor.nextInt();
                cbrtRes = Math.cbrt(cbrtn);
                System.out.println(cbrtRes);
                String latestOutputSystemLog = String.valueOf(cbrtRes);
            }
            else if(n1.equals("variable") || n1.equals("variables") || n1.equals("save") || n1.equals("store") || n1.equals("storevariables")){
                System.out.println("Allowed chars: A, B, C, D, E, F, X, Y, M");
                System.out.print("Char: ");
                Scanner userCharVar = new Scanner(System.in);
                userCharVarChoose = userCharVar.nextLine();
                userCharVarChoose = userCharVarChoose.toLowerCase();
                if(userCharVarChoose.equals("a")) {
                    System.out.print("Value: ");
                    Scanner userValueVarcasea = new Scanner(System.in);
                    varA = userValueVarcasea.nextInt();
                }
                else if(userCharVarChoose.equals("b")) {
                    System.out.print("Value: ");
                    Scanner userValueVarcaseb = new Scanner(System.in);
                    varB = userValueVarcaseb.nextInt();
                }
                else if(userCharVarChoose.equals("c")) {
                    System.out.print("Value: ");
                    Scanner userValueVarcasec = new Scanner(System.in);
                    varC = userValueVarcasec.nextInt();
                }
                else if(userCharVarChoose.equals("d")) {
                    System.out.print("Value: ");
                    Scanner userValueVarcased = new Scanner(System.in);
                    varD = userValueVarcased.nextInt();
                }
                else if(userCharVarChoose.equals("e")) {
                    System.out.print("Value: ");
                    Scanner userValueVarcasee = new Scanner(System.in);
                    varE = userValueVarcasee.nextInt();
                }
                else if(userCharVarChoose.equals("f")) {
                    System.out.print("Value: ");
                    Scanner userValueVarcasef = new Scanner(System.in);
                    varF = userValueVarcasef.nextInt();
                }
                else if(userCharVarChoose.equals("x")) {
                    System.out.print("Value: ");
                    Scanner userValueVarcasex = new Scanner(System.in);
                    varX = userValueVarcasex.nextInt();
                }
                else if(userCharVarChoose.equals("y")) {
                    System.out.print("Value: ");
                    Scanner userValueVarcasey = new Scanner(System.in);
                    varY = userValueVarcasey.nextInt();
                }
                else if(userCharVarChoose.equals("m")) {
                    System.out.print("Value: ");
                    Scanner userValueVarcasem = new Scanner(System.in);
                    varM = userValueVarcasem.nextInt();
                }
            }
            else if(n1.equals("show 2pows") || n1.equals("show 2pow") || n1.equals("2pows") || n1.equals("2pow") || n1.equals("pows of 2") || n1.equals("im an informatic student") || n1.equals("binary pows")){
                System.out.println("2∧0 = 1");
                System.out.println("2∧1 = 2");
                System.out.println("2∧2 = 4");
                System.out.println("2∧3 = 8");
                System.out.println("2∧4 = 16");
                System.out.println("2∧5 = 32");
                System.out.println("2∧6 = 64");
                System.out.println("2∧7 = 128");
                System.out.println("2∧8 = 256");
                System.out.println("2∧9 = 512");
                System.out.println("2∧10 = 1024");
                System.out.println(";)");
            }
            else if(n1.equals("10x")){
                Scanner tenxFactor = new Scanner(System.in);
                tenxn = tenxFactor.nextInt();
                tenxRes = Math.pow(10, tenxn);
                System.out.println(tenxRes);
                String latestOutputSystemLog = String.valueOf(tenxRes);
            }
            else if(n1.equals("pi") || n1.equals("p")){
                System.out.println(Math.PI);
                String latestOutputSystemLog = String.valueOf(Math.PI);
            }
            else if(n1.equals("sin")){
                Scanner sinFactor = new Scanner(System.in);
                sinn = sinFactor.nextInt();
                notShiftSinRes = Math.sin(sinn);
                System.out.println(notShiftSinRes);
                String latestOutputSystemLog = String.valueOf(notShiftSinRes);
            }
            else if(n1.equals("cos")){
                Scanner cosFactor = new Scanner(System.in);
                cosn = cosFactor.nextInt();
                notShiftCosRes = Math.cos(cosn);
                System.out.println(notShiftCosRes);
                String latestOutputSystemLog = String.valueOf(notShiftCosRes);
            }
            else if(n1.equals("tan")){
                Scanner tanFactor = new Scanner(System.in);
                tann = tanFactor.nextInt();
                notShiftTanRes = Math.tan(tann);
                System.out.println(notShiftTanRes);
                String latestOutputSystemLog = String.valueOf(notShiftTanRes);
            }
            else if(n1.equals("asin") || n1.equals("sin-1")){
                Scanner asinFactor = new Scanner(System.in);
                asinn = asinFactor.nextInt();
                notShiftAsinRes = Math.asin(asinn);
                System.out.println(notShiftAsinRes);
                String latestOutputSystemLog = String.valueOf(notShiftAsinRes);
            }
            else if(n1.equals("acos") || n1.equals("cos-1")){
                Scanner acosFactor = new Scanner(System.in);
                acosn = acosFactor.nextInt();
                notShiftAcosRes = Math.acos(acosn);
                System.out.println(notShiftAcosRes);
                String latestOutputSystemLog = String.valueOf(notShiftAcosRes);
            }
            else if(n1.equals("atan") || n1.equals("tan-1")){
                Scanner atanFactor = new Scanner(System.in);
                atann = atanFactor.nextInt();
                notShiftAtanRes = Math.atan(atann);
                System.out.println(notShiftAtanRes);
                String latestOutputSystemLog = String.valueOf(notShiftAtanRes);
            }
            else if(n1.equals("log")) {
                Scanner logFactor = new Scanner(System.in);
                logn = logFactor.nextInt();
                logRes = Math.log10(logn);
                System.out.println(logRes);
                String latestOutputSystemLog = String.valueOf(logRes);
            }
            else if(n1.equals("ln")){
                Scanner lnFactor = new Scanner(System.in);
                lnn = lnFactor.nextInt();
                lnRes = Math.log(lnn);
                System.out.println(lnRes);
                String latestOutputSystemLog = String.valueOf(lnRes);
            }
            else if(n1.equals("help") || n1.equals("commands")){
                System.out.println("These are all the commands the calculator can do:");
                System.out.println("'sqrt' - Square root");
                System.out.println("'cbrt' - Cubic root");
                System.out.println("'store', 'variable', or 'save' - Stores values into variables (allowed chars A, B, C, D, E, F, X, Y, M)");
                System.out.println("'show 2pow' or 'pow of 2' - Shows pows of 2");
                System.out.println("'10x' - Exponential notation of 10");
                System.out.println("'pi' - Value of pi (π)");
                System.out.println("'sin' - Sine of an angle");
                System.out.println("'cos' - Cosine of an angle");
                System.out.println("'tan' - Tangent of an angle");
                System.out.println("'asin' - Asine of an angle (sin-1)");
                System.out.println("'acos' - Acosine of an angle (cos-1)");
                System.out.println("'atan' - Atangent of an angle (tan-1)");
                System.out.println("'log' - Logarithm of a number");
                System.out.println("'ln' - Natural logarithm of a number");
                System.out.println("'shift' - Like a 'ctrl', does asin, acos, atan writing sin, cos, tan");
                System.out.println("'help' - Calculator commands list");
            }
            else if(n1.equals("credits")){
                System.out.println("Scientific calculator by Amuchina - Project made with IntelliJ Idea™ Community IDE");
                System.out.println("Amuchina packet phoenix association thanks you ;)");
            }
            else {
                n3 = Integer.parseInt(n1);

                Scanner opr = new Scanner(System.in);

                oprChoose = opr.nextLine();

                Scanner var4 = new Scanner(System.in);

                n4 = var4.nextInt();

                Scanner var3 = new Scanner(System.in);

                equalsign = var3.nextLine();

                if (equalsign.equals("=")) {
                    if (oprChoose.equals(plus)) {
                        sum = n3 + n4;
                        System.out.println(sum);
                        String latestOutputSystemLog = String.valueOf(sum);
                    } else if (oprChoose.equals(minus)) {
                        dif = n3 - n4;
                        System.out.println(dif);
                        String latestOutputSystemLog = String.valueOf(dif);
                    } else if (oprChoose.equals(time)) {
                        times = n3 * n4;
                        System.out.println(times);
                        String latestOutputSystemLog = String.valueOf(times);
                    } else if (oprChoose.equals(divide)) {
                        n5 = (double) n3;
                        n6 = (double) n4;
                        if (n4 == 0) {
                            System.out.println("Sorry, you can't divide by zero");
                        } else {
                            div = n5 / n6;
                            System.out.println(div);
                            String latestOutputSystemLog = String.valueOf(div);
                        }
                    }
                }
        }
    }
}
