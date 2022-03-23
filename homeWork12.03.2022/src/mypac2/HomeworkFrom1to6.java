package mypac2;

public class HomeworkFrom1to6 {
    public static void main(String[] args) {
    String myName;
    myName = "Simeon";
    System.out.println(myName);  //1. Извежда името ви в конзолата.
    String myWifeName;
    myWifeName = "Denitsa";
    System.out.println(myName.equals(myWifeName)); //2. Сравнява го с име на приятел/ка, като използвате equals(), equalsIgnoreCase(), compareTo(), резултатите да излизат на отделни редове.
    System.out.println(myName.equalsIgnoreCase(myWifeName));// част от 2ра точка
    System.out.println(myName.compareTo(myWifeName));// част от 2ра точка
    String myFamilyName = "Simeonov"; // 3.Долепя до името ви вашата фамилия, на нов ред.
    System.out.println(myName + "\n" + myFamilyName );
    System.out.println("\n"); // 4. Извежда вана нов ред.
    byte myAge = 32;
    System.out.println(myName +" " + myFamilyName +" " + myAge); // 5. Извежда името фамилията и годините ви на един ред.
    String myWifeFamilyName;
    myWifeFamilyName = "Simeonova";
    byte myWifeAge;
    myWifeAge = 32;
    System.out.println(myWifeName+"\n" +myWifeFamilyName+"\n" +myWifeAge); //6. Извежда името фамилията и годините на приятелят/ката ви на нов ред.
    }
}
