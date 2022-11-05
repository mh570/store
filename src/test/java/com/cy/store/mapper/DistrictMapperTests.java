package com.cy.store.mapper;

import com.cy.store.entity.District;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DistrictMapperTests {
    @Autowired
    private DistrictMapper districtMapper;

    @Test
    public void findByParent() {
        String parent = "110100";
        List<District> list = districtMapper.findByParent(parent);
        System.out.println("count=" + list.size());
        for (District district : list) {
            System.out.println(district);
        }
    }

    @Test
    public void findNameByCode() {
        String code = "540000";
        String name = districtMapper.findNameByCode(code);
        System.out.println(name);
    }

    @Test
    public void if101() {
        List<Integer> list = new ArrayList();
        list.add(57);
        list.add(96);
        for (Integer ignored :list) {
            if (ignored > 60) {
                System.out.println("及格");
            }
        }

        String date = "你没女朋友";
        if (date.equals("情人节")) {
            System.out.println("呵呵");
        }else if (date.equals("圣诞节")){
            System.out.println("呵呵");
        }else if (date.equals("生日")){
            System.out.println("呵呵");
        }else {
            System.out.println("单身狗快乐");
        }

        SimpleDateFormat sdf =new SimpleDateFormat("dd" );
        Date d= new Date();
        String str = sdf.format(d);
        System.out.println(str);

        Integer i = 1;
        Integer k = 1;
        while (i <= 9){
            k = 1;
            while ( k <= i){
                Integer answer = i * k;
                System.out.println(i +"*"+ k +"="+ answer);
                k++;
            }
            i++;
        }

        for(int ia = 100; ia < 1000; ia++){
            int m = ia / 100;
            int n = (ia % 100) / 10;
            int z = ia % 10;
            if(ia == Math.pow(m, 3)+Math.pow(n, 3)+Math.pow(z, 3)){
                System.out.println("水仙数是"+ia);
            }

        }
        System.out.println(UUID.randomUUID().toString());
    }


}
