package com.dlut.agent;

import java.lang.instrument.Instrumentation;

import net.bytebuddy.agent.builder.AgentBuilder;
import net.bytebuddy.implementation.MethodDelegation;
import net.bytebuddy.matcher.ElementMatchers;

public class ProbeAgent {
    public static void premain(String args, Instrumentation instrumentation) {
        System.out.println("[agent]:enter to agent premain function");

        new AgentBuilder.Default()
        .with(AgentBuilder.Listener.StreamWriting.toSystemError())
            .type(ElementMatchers.nameContains("com.dlut.service.ProbeService"))
            .transform((builder, type, x, modult) -> builder
            .method(ElementMatchers.named("doProbe"))
            .intercept(MethodDelegation.to(ProbeInterceptor.class)))
            .installOn(instrumentation);

        System.out.println("[agent]:exit agent premain function");
    }
}
