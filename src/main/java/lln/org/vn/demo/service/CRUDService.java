package lln.org.vn.demo.service;

import java.util.List;

public interface CRUDService {
    <T> List<T> creates(List<T> datas);
    <T> List<T> gets(List<T> datas);
    <T> List<T> updates(List<T> datas);
    <T> void deletes(List<T> datas);
}
