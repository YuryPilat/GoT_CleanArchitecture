package com.example.gotcleanarchitecture.utils.recycler_view.diff_utils;

public interface ContentCheckFunction<T> {

    boolean areContentsTheSame(T oldItem, T newItem);
}
