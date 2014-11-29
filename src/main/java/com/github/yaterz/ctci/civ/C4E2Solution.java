package com.github.yaterz.ctci.civ;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

import static com.github.yaterz.ctci.civ.VertexState.*;

/**
 * Given a directed graph, design an algorithm to determine whether there is a route between two nodes
 *
 * @author mattyaterz
 * @since 11/28/14
 */
public class C4E2Solution {
    public static <E> boolean hasPath( Set<DirectedVertex<E>> graph, DirectedVertex<E> start, DirectedVertex<E> end ) {
        if ( graph == null || start == null || end == null || !graph.contains( start ) || !graph.contains( end ) ) {
            return false;
        }

        for ( DirectedVertex<E> vertex : graph ) {
            vertex.state = UNVISITED;
        }

        Queue<DirectedVertex<E>> vertexes = new LinkedList<>();
        vertexes.offer( start );
        start.state = VISITED;

        while ( !vertexes.isEmpty() ) {
            DirectedVertex<E> current = vertexes.poll();

            for ( DirectedVertex<E> edge : current.edges ) {
                if ( edge == end ) {
                    return true;
                }

                if ( edge != null && edge.state == UNVISITED ) {
                    edge.state = VISITED;
                    vertexes.offer( edge );
                }
            }
        }

        return false;
    }
}
