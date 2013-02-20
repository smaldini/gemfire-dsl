package com.pivotal.pso.gemfire.dsl.support

import groovy.transform.CompileStatic

import static groovy.lang.Closure.DELEGATE_FIRST

/**
 * Author: smaldini
 * Date: 2/10/13
 * Project: gemfire-dsl
 */
@CompileStatic
class DSLUtils {

    static public final Closure EMPTY_CLOSURE = {...args->}

    /**
     * Helper for recurrent use-case : Delegating a closure to a builder and resolving it first
     * @param builder
     * @param closure
     * @return possible closure result
     */
    static delegateFirstAndRun(builder, Closure closure){
        closure.delegate = builder
        closure.resolveStrategy = DELEGATE_FIRST
        closure()
    }

}
