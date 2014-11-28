package com.github.yaterz.ctci.ciii;

import java.util.Iterator;

/**
* @author mattyaterz
* @since 11/25/14
*/
public class LinkedStack<E> implements Iterable<E> {
    public LinkedStack() {
        limit = Integer.MAX_VALUE;
    }

    public LinkedStack( int limit ) {
        this.limit = limit;
    }

    @Override public Iterator<E> iterator() {
        return new Iterator<E>() {
            LinkedNode<E> position = new LinkedNode<>( null, top );
            LinkedNode<E> previous = position;
            boolean isRemovable = false;

            @Override public boolean hasNext() {
                return position.next != null;
            }

            @Override public E next() {
                previous = position;
                position = position.next;
                isRemovable = true;
                return position.element;
            }

            @Override public void remove() {
                if ( !isRemovable ) {
                    return;
                }

                isRemovable = false;
                previous.next = position.next;

                if ( position == top ) {
                    pop();
                }
                else {
                    size--;
                }
            }
        };
    }

    public boolean push( E element ) {
        if ( size >= limit ) {
            return false;
        }

        top = new LinkedNode<>( element, top );
        size++;
        return true;
    }

    public E peek() {
        return top != null ? top.element : null;
    }

    public E pop() {
        if ( top == null ) {
            return null;
        }

        E element = top.element;
        top = top.next;
        size--;
        return element;
    }

    public boolean clear() {
        top = null;
        size = 0;
        return true;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int limit() {
        return limit;
    }

    final int limit;
    LinkedNode<E> top = null;
    int size = 0;
}
