package com.aborgatin.hh.vacancy.loader.model;

import java.util.List;

public class Response<T> {
    private List<T> items;
    private Long found;
    private Long pages;
    private Long per_page;
    private Long page;

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }

    public Long getFound() {
        return found;
    }

    public void setFound(Long found) {
        this.found = found;
    }

    public Long getPages() {
        return pages;
    }

    public void setPages(Long pages) {
        this.pages = pages;
    }

    public Long getPer_page() {
        return per_page;
    }

    public void setPer_page(Long per_page) {
        this.per_page = per_page;
    }

    public Long getPage() {
        return page;
    }

    public void setPage(Long page) {
        this.page = page;
    }
}
