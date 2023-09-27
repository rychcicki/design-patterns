package org.example.facade;

interface Order<T> {
    T order(Menu menu);
}
