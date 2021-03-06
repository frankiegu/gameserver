package com.game.module.sct;

import com.game.params.Int2Param;
import com.game.params.TrainVo;
import com.google.common.collect.Lists;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by lucky on 2017/11/28.
 */
public class Train {
    /**
     * 已挑战次数
     */
    private Map<Integer, Integer> groupTimes = new HashMap<>();
    /**
     * 已经挑战完的ID
     */
    private Set<Integer> challengeIds = new HashSet<>();

    public Map<Integer, Integer> getGroupTimes() {
        return groupTimes;
    }

    public void setGroupTimes(Map<Integer, Integer> groupTimes) {
        this.groupTimes = groupTimes;
    }

    public Set<Integer> getChallengeIds() {
        return challengeIds;
    }

    public void setChallengeIds(Set<Integer> challengeIds) {
        this.challengeIds = challengeIds;
    }

    public void dailyRest() {
        for (int id : groupTimes.keySet()) {
            groupTimes.put(id, 0);
        }
    }
}
