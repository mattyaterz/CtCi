package com.github.yaterz.ctci.ciii;

/**
 * Towers of Hanoi
 * 3 towers and N disks of different sizes which can slide onto any tower
 * Start with the disks sorted in ascending order of size from top to bottom (bottom of tower has largest plate)
 * Move the disks from the first tower to the last with the following constraints
 *
 * 1 disk can be moved at at time
 * A disk is slid (pop()) off the top of one tower onto the top (push()) of the next
 * A disk can only be placed on top of a larger disk
 *
 * @author mattyaterz
 * @since 11/22/14
 */
public class C3E4Solution {

    public static class HanoiTowers<E extends Comparable<E>> {
        public HanoiTowers( LinkedStack<E> tower ) {
            this.first = tower;
        }

        public void execute() {

        }

        LinkedStack<E> first = new LinkedStack<>();
        LinkedStack<E> middle = new LinkedStack<>();
        LinkedStack<E> last = new LinkedStack<>();
    }
}
