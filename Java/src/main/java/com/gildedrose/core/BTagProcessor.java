/**
 * @(#)BTagProcesser.java, 2023/8/4
 * <p/>
 * Copyright 2022 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.gildedrose.core;

import com.gildedrose.Item;

/**
 * @author zwb
 */
public class BTagProcessor implements Processor{
    @Override
    public void process(Item curItem) {
        if (curItem.quality < 50) {
            curItem.quality = curItem.quality + 1;

            if (curItem.sellIn < 11) {
                if (curItem.quality < 50) {
                    curItem.quality = curItem.quality + 1;
                }
            }

            if (curItem.sellIn < 6) {
                if (curItem.quality < 50) {
                    curItem.quality = curItem.quality + 1;
                }
            }
        }

        curItem.sellIn = curItem.sellIn - 1;

        if (curItem.sellIn < 0) {
            curItem.quality = curItem.quality - curItem.quality;
        }
    }
}
