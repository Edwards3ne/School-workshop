package com.example.basicwebshop.models;

import java.util.*;
import java.util.stream.Collectors;

public class ListOfItems {
    private List<Item> items = new ArrayList<>();

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void addItem(Item item){
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }

    public List<String> getNames(){
        return items.stream()
                .map(Item::getName)
                .distinct()
                .collect(Collectors.toList());
    }
    public List<String> getDescriptions(){
        return items.stream()
                .map(Item::getDescription)
                .distinct()
                .collect(Collectors.toList());
    }
    public List<Double> getPrices(){
        return items.stream()
                .map(Item::getPrice)
                .distinct()
                .collect(Collectors.toList());
    }
    public List<Item> getCheapest(){
        return items.stream()
                .filter(item -> item.getQuantity()>0)
                .sorted((i1,i2)->i1.getPrice().compareTo(i2.getPrice()))
                .collect(Collectors.toList());
    }
    public Item getMostExpensive(){
        return items.stream()
                .max(Comparator.comparing(Item::getPrice))
                .orElseThrow(NoSuchElementException::new);
    }
    public Double getAverageQuants(){
        return items.stream()
                .mapToDouble(Item::getQuantity)
                .average()
                .orElse(Double.NaN);
    }
    public List<Item> searchInDescription(String search){
        return items.stream()
                .filter(item->item.getDescription().toLowerCase(Locale.ROOT).contains(search.toLowerCase(Locale.ROOT)))
                .collect(Collectors.toList());
    }
    public List<Item> searchNotEmpty(){
        return items.stream()
                .filter(item -> item.getQuantity()>0)
                .collect(Collectors.toList());
    }
}
