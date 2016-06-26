package com.roger.spring.core.aspect;

import org.springframework.stereotype.Component;

/**
 * Created by Roger on 2016/6/26.
 */
@Component
public class CompactDisc {
    public void playTrack(int trackNum){
        System.out.println("trackNUm: " + trackNum);
    }
}
