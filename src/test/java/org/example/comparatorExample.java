package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class comparatorExample {


    public static void main(String[] args) {
        List<demodata> d = new ArrayList<>();
        d.add(new demodata("Soumen",34));
        d.add(new demodata("Sourav",30));
        d.add(new demodata("Gouri",37));
        d.add(new demodata("Vignesh",27));
        //Collections.sort(d);
        Comparator <demodata> cmp = new Comparator<demodata>() {
            @Override
            public int compare(demodata d1, demodata d2) {
                if(d1.getAge()> d2.getAge()){
                    return 1;
                }else{
                    return -1;
                }
            }

            @Override
            public boolean equals(Object obj) {
                return false;
            }
        };
        Collections.sort(d,cmp);
        for(demodata dd:d){
            System.out.println(dd);
        }
    }
}
