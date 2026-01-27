package com.day2.chatlogparser;

public interface MessageFilter<T> {
 boolean shouldKeep(T message);
}