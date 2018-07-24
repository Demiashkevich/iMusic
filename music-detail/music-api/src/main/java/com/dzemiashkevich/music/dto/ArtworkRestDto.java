package com.dzemiashkevich.music.dto;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class ArtworkRestDto extends KeyRestDto<Long> {

    private Integer width;

    private Integer height;

    private String url;

    private String bgColor;

    private String textColor1;

    private String textColor2;

    private String textColor3;

    private String textColor4;

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getBgColor() {
        return bgColor;
    }

    public void setBgColor(String bgColor) {
        this.bgColor = bgColor;
    }

    public String getTextColor1() {
        return textColor1;
    }

    public void setTextColor1(String textColor1) {
        this.textColor1 = textColor1;
    }

    public String getTextColor2() {
        return textColor2;
    }

    public void setTextColor2(String textColor2) {
        this.textColor2 = textColor2;
    }

    public String getTextColor3() {
        return textColor3;
    }

    public void setTextColor3(String textColor3) {
        this.textColor3 = textColor3;
    }

    public String getTextColor4() {
        return textColor4;
    }

    public void setTextColor4(String textColor4) {
        this.textColor4 = textColor4;
    }

    @Override
    public boolean equals(Object o) {
        return EqualsBuilder.reflectionEquals(this, o);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

}
