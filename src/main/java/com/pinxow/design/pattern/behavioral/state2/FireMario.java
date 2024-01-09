package com.pinxow.design.pattern.behavioral.state2;

import com.pinxow.design.pattern.behavioral.state.State;

public class FireMario implements IMario{
    private static final FireMario instance = new FireMario();

    public FireMario() {
    }

    public static FireMario getInstance() {
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
