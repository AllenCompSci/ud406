package com.udacity.gamedev.gigagal.util;


public class Enums {


    public enum Direction {
        LEFT, RIGHT
    }

    public enum JumpState {
        JUMPING,
        FALLING,
        GROUNDED
        // TODO: Add RECOILING jump state

    }

    public enum WalkState {
        NOT_WALKING,
        WALKING
    }
}
