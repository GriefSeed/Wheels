package day03.TrainThird.Train2;

import java.util.Collections;
import java.util.HashSet;

public class Train2 {
    public static void main(String[] args) {
        HashSet<Student> stu_hs1 = new HashSet<>();
        HashSet<Student> stu_hs2 = new HashSet<>();
        HashSet<Student> stu_hs3 = new HashSet<>();
        HashSet<Student> stu_hs4 = new HashSet<>();

        HashSet<HashSet<Student>> class_hs = new HashSet<>();

        Collections.addAll(stu_hs1, Student.newBuilder().withName("xx").withAge(12).build(),
                Student.newBuilder().withName("yy").withAge(13).build(),
                Student.newBuilder().withName("zz").withAge(11).build());

        Collections.addAll(stu_hs2, Student.newBuilder().withName("aa").withAge(12).build(),
                Student.newBuilder().withName("bb").withAge(13).build(),
                Student.newBuilder().withName("cc").withAge(11).build());

        Collections.addAll(stu_hs3, Student.newBuilder().withName("11").withAge(12).build(),
                Student.newBuilder().withName("22").withAge(13).build(),
                Student.newBuilder().withName("33").withAge(11).build());

        Collections.addAll(stu_hs4, Student.newBuilder().withName("dick").withAge(12).build(),
                Student.newBuilder().withName("ass").withAge(13).build(),
                Student.newBuilder().withName("pussy").withAge(11).build());


        Collections.addAll(class_hs, stu_hs1,stu_hs2, stu_hs3, stu_hs4);

        int i = 0;
        for(HashSet<Student> cs : class_hs){
            System.out.println("============================");
            System.out.println("班级" + ++i);
            for(Student s : cs){
                System.out.println(s.toString());
            }
        }


    }
}
