package com.rickie.repository;

import com.rickie.routing.VoyageDO;
import com.rickie.routing.VoyageMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VoyageMapperTest {
    @Resource
    private VoyageMapper voyageMapper;

    @Test
    public void testFindAll() {
        System.out.println("Write your test here");
        List<VoyageDO> voyageDOs = voyageMapper.findAll();
        for(VoyageDO voyageDO:voyageDOs) {
            System.out.println(voyageDO.toString());
        }
    }
}
