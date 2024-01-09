package com.pinxow.design.pattern.behavioral.state;

public class CapeMario implements IMario{
    private MarioStateMachine stateMachine;

    public CapeMario(MarioStateMachine stateMachine) {
        this.stateMachine = stateMachine;
    }

    public State getName() {
        return State.CAPE;
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
