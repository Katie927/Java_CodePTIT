package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;
class Student implements Comparable<Student>{
    private String id, name, className, email;
    public Student(String id, String name, String className, String email){
        this.id = id;
        this.name = name;
        this.className = className;
        this.email = email;
    }
    public String getId(){
        return id;
    }
    public String getName(){
        String tmp = "";
        String[] words = name.trim().split("\\s+");
        for(String word : words){
            tmp += word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase() + " ";
        }
        return tmp;
    }
    public int compareTo(Student b){
        return this.getId().compareTo(b.getId());
    }
    public String toString(){
        return id + " " + getName() + className;
    }
}
class Company{
    private String id, name;
    private long amount;
    public Company(String id, String name, long amount){
        this.id = id;
        this.name = name;
        this.amount = amount;
    }
    public String getID(){
        return id;
    }
    public String getName(){
        return name;
    }
    public long getAmount(){
        return amount;
    }
}
class Intern implements Comparable<Intern>{
    private String idStudent, idCompany;
    private long numbers;
    public Intern(String idStudent, String idCompany){
        this.idStudent = idStudent;
        this.idCompany = idCompany;
    }
    public String getIdStudent(){
        return idStudent;
    }
    public String getIdCompany(){
        return idCompany;
    }
    public void setNumbers(long numbers){
        this.numbers = numbers;
    }
    public long getNumbers(){
        return numbers;
    }
    public int compareTo(Intern b){
        return this.getIdStudent().compareTo(b.getIdStudent());
    }
}
public class ttest {

    public static void main(String[] args) throws FileNotFoundException{
        Scanner stScanner = new Scanner(new File("SINHVIEN.in"));
        Scanner cpScanner = new Scanner(new File("DN.in"));
        Scanner inScanner = new Scanner(new File("THUCTAP.in"));
        List<Student> ls = new ArrayList<>();
        List<Company> lc = new ArrayList<>();
        List<Intern> li = new ArrayList<>();
        int t = Integer.parseInt(stScanner.nextLine());
        while(t-- >0){
            String id = stScanner.nextLine();
            String name = stScanner.nextLine();
            String className = stScanner.nextLine();
            String email = stScanner.nextLine();
            ls.add(new Student(id, name, className, email));
        }
        Collections.sort(ls);
        int t1 = Integer.parseInt(cpScanner.nextLine());
        while(t1-- >0){
            String id = cpScanner.nextLine();
            String name = cpScanner.nextLine();
            Long amount = Long.parseLong(cpScanner.nextLine());
            lc.add(new Company(id, name, amount));
        }
        int t2 = Integer.parseInt(inScanner.nextLine());
        while(t2-- >0){
//            String s = inScanner.nextLine();
//            String[] words = s.trim().split("\\s+");
            String idStudent = inScanner.next();
            String idCompany = inScanner.nextLine();
            idCompany = idCompany.trim();
            li.add(new Intern(idStudent, idCompany));
        }
//        for(Intern a : li){
//            System.out.println(a);
//         }
        Collections.sort(li);
        for(Intern a : li){
           for(Company b : lc){
               if(a.getIdCompany().equals(b.getID())) a.setNumbers(b.getAmount());
           }
        }
//        for(Intern a : li){
//            System.out.println(a);
//         }
//        for(Company a : lc){
//            System.out.println(a);
//         }
        int t3 = Integer.parseInt(inScanner.nextLine());
        while(t3-->0){
            String cp = inScanner.nextLine();
            String tmp2 = "";
            for(Company a : lc){
                if(a.getID().equals(cp)){
                    tmp2 = a.getName();
                    break;
                }
            }
            System.out.println("DANH SACH THUC TAP TAI " + tmp2 + ":");
            int numbers = 1;
            for(Intern a : li){
                if(a.getIdCompany().equals(cp)){
                    for (Student b : ls){
                        if(a.getIdStudent().equals(b.getId()) && numbers <= a.getNumbers()){
                            System.out.println(b.toString());
                            numbers++;
                        }
                    }
                }
            }
        }
    }
}