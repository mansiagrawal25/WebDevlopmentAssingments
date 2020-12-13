/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

/**
 *
 * @author mansiagrawal
 */
public class Items {
    private String item_name;
    private int item_id;
    private float item_cost;
    private String item_type;
    private static int count;
    public Items() {
        item_id = count++;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public int getItem_id() {
        return item_id;
    }

    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }

    public float getItem_cost() {
        return item_cost;
    }

    public void setItem_cost(float item_cost) {
        this.item_cost = item_cost;
    }

    public String getItem_type() {
        return item_type;
    }

    public void setItem_type(String item_type) {
        this.item_type = item_type;
    }
     
}
