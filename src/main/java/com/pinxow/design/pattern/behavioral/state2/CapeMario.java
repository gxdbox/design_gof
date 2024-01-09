package com.pinxow.design.pattern.behavioral.state2;


import com.pinxow.design.pattern.behavioral.state.State;

public class CapeMario implements IMario{
    private static final CapeMario instance = new CapeMario();

    public CapeMario() {
    }

    public static CapeMario getInstance() {
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
