package kr.scalar.api.sec.service;

public interface SecurityService<T> {
    boolean validate();
    T getData();
}
