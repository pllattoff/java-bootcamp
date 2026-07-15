package oop.chapter06.bigdecimal;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

public record Transaction(BigInteger id, BigDecimal amount, BigDecimal balance, String description, Date date) {
}
