package com.example.maps;

public interface MapType {
    void displayMap();
    String getMapType();
    void zoomIn();
    void zoomOut();
    int getZoomLevel();
}
