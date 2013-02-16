package com.popsugar.shopping.bo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Color-variant as given by the retailer. The normalized colors are available via
 * {@link #getCanonicalColors()}. There can be more than one normalized colors. For instance
 * the retailer may have a color variant named "Red/Blue". This would be normalized to the
 * color Red and the color Blue.
 */
public class ProductColor
{
    private final String name;
    private final Image[] images;
    private final String swatchUrl;
    private final Color[] canonicalColors;

    @JsonCreator
    public ProductColor(@JsonProperty("name") String name, @JsonProperty("images") Image[] images, 
        @JsonProperty("swatchUrl") String swatch, @JsonProperty("canonicalColors") Color[] canonicalColors)
    {
        this.name = name;
        this.images = images;
        this.swatchUrl = swatch;
        this.canonicalColors = canonicalColors;
    }
    
    /**
     * Returns the retailer's name for this color
     */
    public String getName()
    {
        return name;
    }

    /**
     * Returns the set of images for this particular color
     */
    public Image[] getImages()
    {
        return images;
    }

    public String getSwatchUrl()
    {
        return swatchUrl;
    }

    /**
     * Returns the normalized colors for this color. 
     */
    public Color[] getCanonicalColors()
    {
        return canonicalColors;
    }
}