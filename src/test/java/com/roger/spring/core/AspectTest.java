package com.roger.spring.core;

import com.roger.spring.core.aspect.CompactDisc;
import com.roger.spring.core.aspect.Encoreable;
import com.roger.spring.core.aspect.Performance;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Roger on 2016/6/26.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationConfig.class)
public class AspectTest {

    @Autowired
    private Performance performance;

    @Autowired
    private CompactDisc compactDisc;

    @Autowired
    private Encoreable encoreable;

    @Test
    public void performance(){
        performance.perform();
    }

    /**
     * 处理通知中的参数
     */
    @Test
    public void trackCount(){
        compactDisc.playTrack(1);
        compactDisc.playTrack(2);
        compactDisc.playTrack(3);
        compactDisc.playTrack(1);
        compactDisc.playTrack(3);
        compactDisc.playTrack(1);
    }

    @Test
    public void encore(){
        encoreable.performEncore();
    }
}
