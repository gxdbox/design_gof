package com.pinxow.design.pattern.behavioral.state2;

import com.pinxow.design.pattern.behavioral.state.State;

public class SuperMario implements IMario{
    private final static SuperMario instance = new SuperMario();

    public SuperMario() {
    }

    public static SuperMario getInstance() {
        return instance;
    }

    public State getName() {
        return null;
    }

    public void obtainMushRoom(MarioStateMachine stateMachine) {

    }

    public void obtainCape(MarioStateMachine stateMachine) {

    }

    public void obtainFireFlower(MarioStateMachine stateMachine) {

    }

    public void meetMonster(MarioStateMachine stateMachine) {

    }
}
