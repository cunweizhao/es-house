package com.zcw.eshouse.service.search;

/**
 * @ClassName : HouseSuggest
 * @Description :
 * @Author : Zhaocunwei
 * @Date: 2020-08-17 18:52
 */
public class HouseSuggest {
    private String input;
    private int weight = 10; // 默认权重

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
