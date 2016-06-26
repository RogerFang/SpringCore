package com.roger.spring.core.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Roger on 2016/6/26.
 */
@Aspect
public class TrackCounterAspect {

    private Map<Integer, Integer> trackCounts = new HashMap<>();

    @Pointcut("execution(* com.roger.spring.core.aspect.CompactDisc.playTrack(int)) " +
            "&& args(trackNum)")
    public void trackPlayed(int trackNum){
    }

    @Before("trackPlayed(trackNum)")
    public void countTrack(int trackNum){
        int curCount = getPlayCount(trackNum);
        System.out.println("Before trackNum: " + trackNum + ", count:" +curCount);
        trackCounts.put(trackNum, curCount+1);
    }


    public int getPlayCount(int trackNum){
        return trackCounts.containsKey(trackNum)?trackCounts.get(trackNum):0;
    }
}
