package com.pinxow.design.pattern.behavioral.state2;

import com.pinxow.design.pattern.behavioral.state.State;

public class SmallMario implements IMario {
    private static final SmallMario instance = new SmallMario();
    private SmallMario() {}
    public static SmallMario getInstance() {
        return instance;
    }


    public State getName() {
        return State.SMALL;
    }


    public void obtainMushRoom(MarioStateMachine stateMachine) {
        stateMachine.setCurrentState(SuperMario.getInstance());
        stateMachine.setScore(stateMachine.getScore() + 100);
    }


    public void obtainCape(MarioStateMachine stateMachine) {
        stateMachine.setCurrentState(CapeMario.getInstance());
        stateMachine.setScore(stateMachine.getScore() + 200);
    }


    public void obtainFireFlower(MarioStateMachine stateMachine) {
        stateMachine.setCurrentState(FireMario.getInstance());
        stateMachine.setScore(stateMachine.getScore() + 300);
    }


    public void meetMonster(MarioStateMachine stateMachine) {
        // do nothing...
    }
}

