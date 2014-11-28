package com.github.yaterz.ctci.ciii;

/**
 * FIFO animal shelter with only dogs and cats
 * Implement enqueue(Animal), Animal dequeueAny(), Cat dequeueCat(), Dog dequeueDog()
 * You can use java.util.LinkedList
 *
 * @author mattyaterz
 * @since 11/23/14
 */
public class C3E7Solution {
    public static class Shelter {
        LinkedNode<Animal> first = null;
        LinkedNode<Animal> last = null;
        int size;

        public boolean queue( Animal animal ) {
            if ( first == null ) {
                last = new LinkedNode<>( animal );
                first = last;
            }
            else {
                last.next = new LinkedNode<>( animal );
                last = last.next;
            }

            size++;
            return true;
        }

        public Animal dequeue() {
            if ( first == null ) {
                return null;
            }

            Animal oldest = first.element;
            first = first.next;
            size--;
            return oldest;
        }

        public Animal peek() {
            return first != null ? first.element : null;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public int size() {
            return size;
        }

        public Animal dequeueCat() {
            return dequeueType( AnimalType.CAT );
        }

        public Animal dequeueDog() {
            return dequeueType( AnimalType.DOG );
        }

        private Animal dequeueType( AnimalType type ) {
            LinkedNode<Animal> runner = first;
            LinkedNode<Animal> previous = first;

            while ( runner != null && runner.element.type != type ) {
                previous = runner;
                runner = runner.next;
            }

            if ( runner == null ) {
                return null;
            }

            Animal oldest = runner.element;

            if ( runner == first ) {
                first = first.next;
            }
            else {
                previous.next = runner.next;
            }

            size--;
            return oldest;
        }
    }

    public static class Animal {
        public Animal( AnimalType type, int shelterId ) {
            this.type = type;
            this.shelterId = shelterId;
        }

        public AnimalType type;
        public int shelterId;
    }

    public static enum AnimalType {
        CAT,
        DOG
    }
}
