package com.mycompany.lab6;

public class landTract {

    float tractLength = 0;
    float tractWidth = 0;

    public landTract(float tractLength, float tractWidth) {
        this.tractLength = tractLength;
        this.tractWidth = tractWidth;

    }

    public float getTractLength() {
        return tractLength;
    }

    public void setTractLength(float tractLength) {
        this.tractLength = tractLength;
    }

    public float getTractWidth() {
        return tractWidth;
    }

    public void setTractWidth(float tractWidth) {
        this.tractWidth = tractWidth;
    }

    public float areaOfTract() {
        float tractArea = tractLength * tractWidth;
        return tractArea;
    }

    public String equalsTract(float areaOne, float areaTwo) {
        String isEquals;
        if (areaOne == areaTwo) {
            isEquals = "the two tracts are of the same size";
        } else {
            isEquals = "the two tracts are not the same size";
        }
        return isEquals;
    }
    public void tractToString(String isEquals){
        System.out.println(isEquals);
    }
}
