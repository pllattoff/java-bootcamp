package javaecosystem.chapter05.lombok;

import lombok.Builder;

import java.util.List;

@Builder
public record University(Integer id, String name, List<Course> courses) {
}
