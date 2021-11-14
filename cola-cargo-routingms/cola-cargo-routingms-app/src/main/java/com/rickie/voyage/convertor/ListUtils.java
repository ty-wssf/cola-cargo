package com.rickie.voyage.convertor;

import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName ListUtils.java
 * @Description TODO
 * @createTime 2021年07月10日 18:31:00
 */
public class ListUtils<T> {
    public void copyList(List sourceList, List<T> targetList, Class<T> classObj) {
        if(!Objects.isNull(sourceList)) {
            targetList = new ArrayList<T>();
            for (Object item:sourceList){
                try {
                    T data = classObj.newInstance();
                    BeanUtils.copyProperties(item, data);
                    targetList.add(data);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
