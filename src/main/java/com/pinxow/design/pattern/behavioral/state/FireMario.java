package com.pinxow.design.pattern.behavioral.state;

public class FireMario implements IMario{

    private MarioStateMachine stateMachine;

    public FireMario(MarioStateMachine stateMachine) {
        this.stateMachine = stateMachine;
    }

    public State getName() {
        return State.FIRE;
    }

    public void obtainMushRoom() {

    }

    public void obtainCape() {

    }

    public void obtainFireFlower() {

    }

    public void meetMonster() {

    }
}
