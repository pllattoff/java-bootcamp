package javaecosystem.chapter05.lombok;

import lombok.Builder;
import lombok.With;

@Builder
@With
public record Teacher(Integer id, String name, String subject) {
}
