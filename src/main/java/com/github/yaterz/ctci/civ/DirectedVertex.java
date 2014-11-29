package com.github.yaterz.ctci.civ;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author mattyaterz
 * @since 11/28/14
 */
public class DirectedVertex<E> {
    public DirectedVertex() {
        this.edges = new LinkedList<>();
    }

    public DirectedVertex( E element, DirectedVertex<E>... edges ) {
        this();
        this.element = element;

        if ( edges != null ) {
            this.edges.addAll( Arrays.asList( edges ) );
        }
    }

    public E element;
    public LinkedList<DirectedVertex<E>> edges;
    public VertexState state = VertexState.UNVISITED;
}
