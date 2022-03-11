package com.example.gotcleanarchitecture.utils.recycler_view.diff_utils;

import java.util.List;

public interface PayloadFunction<T> {

    List<Object> getChangePayload(T oldItem, T newItem);
}
