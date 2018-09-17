package day08.TrainOne.Train3;

import java.io.File;
import java.io.IOException;

public class Train3 {
    public static void main(String[] args) {
        File f = new File("d:\\bbb");

        if(!f.isDirectory()){
            f.mkdir();
        }
    }
}
