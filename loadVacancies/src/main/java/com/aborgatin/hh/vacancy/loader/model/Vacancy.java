package com.aborgatin.hh.vacancy.loader.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;


public class Vacancy {
    private Long id;
    private boolean premium;
    private String name;
    private String department;

    @JsonProperty("has_test")
    private boolean hasTest;

    @JsonProperty("response_letter_required")
    private boolean responseLetterRequired;
    private Area area;
    private Salary salary;
    private Type type;
    private Address address;
    @JsonProperty("response_url")
    private String responseUrl;
    @JsonProperty("sort_point_distance")
    private String sortPointDistance;
    private Employer employer;
    @JsonProperty("vacancies_url")
    private String vacanciesUrl;
    private boolean trusted;
    @JsonProperty("published_at")
    private Date publishedAt;
    @JsonProperty("created_at")
    private Date createdAt;
    private boolean archived;
    @JsonProperty("apply_alternate_url")
    private String applyAlternateUrl;
    @JsonProperty("insider_interview")
    private String insiderInterview;
    private String url;
    @JsonProperty("alternate_url")
    private String alternateUrl;
    private Snippet snippet;
    private Сontacts сontacts;
    private Schedule schedule;

    static class Schedule {
        private String id;
        private String name;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
    static class Сontacts {
        private String name;
        private String email;
        private List<Phone> phones;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public List<Phone> getPhones() {
            return phones;
        }

        public void setPhones(List<Phone> phones) {
            this.phones = phones;
        }
    }
    static class Phone {
        private String comment;
        private String city;
        private String number;
        private String country;

        public String getComment() {
            return comment;
        }

        public void setComment(String comment) {
            this.comment = comment;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }
    }
    static class Snippet {
        private String requirement;
        private String responsibility;

        public String getRequirement() {
            return requirement;
        }

        public void setRequirement(String requirement) {
            this.requirement = requirement;
        }

        public String getResponsibility() {
            return responsibility;
        }

        public void setResponsibility(String responsibility) {
            this.responsibility = responsibility;
        }
    }
    static class Employer {
        private String id;
        private String name;
        private String url;
        @JsonProperty("alternate_url")
        private String alternateUrl;
        private LogoUrls logoUrls;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getAlternateUrl() {
            return alternateUrl;
        }

        public void setAlternateUrl(String alternateUrl) {
            this.alternateUrl = alternateUrl;
        }

        public LogoUrls getLogoUrls() {
            return logoUrls;
        }

        public void setLogoUrls(LogoUrls logoUrls) {
            this.logoUrls = logoUrls;
        }

        static class LogoUrls {
            private String logo240;
            private String logo90;
            private String logoOriginal;

            public String getLogo240() {
                return logo240;
            }

            public void setLogo240(String logo240) {
                this.logo240 = logo240;
            }

            public String getLogo90() {
                return logo90;
            }

            public void setLogo90(String logo90) {
                this.logo90 = logo90;
            }

            public String getLogoOriginal() {
                return logoOriginal;
            }

            public void setLogoOriginal(String logoOriginal) {
                this.logoOriginal = logoOriginal;
            }
        }
    }
    static class Address {
        private String id;
        private String city;
        private String street;
        private String building;
        private String description;
        private String lat;
        private String lng;
        private String raw;
        private Metro metro;
        @JsonProperty("metro_stations")
        private List<Metro> metroStations;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getBuilding() {
            return building;
        }

        public void setBuilding(String building) {
            this.building = building;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getLat() {
            return lat;
        }

        public void setLat(String lat) {
            this.lat = lat;
        }

        public String getLng() {
            return lng;
        }

        public void setLng(String lng) {
            this.lng = lng;
        }

        public String getRaw() {
            return raw;
        }

        public void setRaw(String raw) {
            this.raw = raw;
        }

        public Metro getMetro() {
            return metro;
        }

        public void setMetro(Metro metro) {
            this.metro = metro;
        }

        public List<Metro> getMetroStations() {
            return metroStations;
        }

        public void setMetroStations(List<Metro> metroStations) {
            this.metroStations = metroStations;
        }
    }
    static class Metro {
        @JsonProperty("station_name")
        private String stationName;
        @JsonProperty("line_name")
        private String lineName;
        @JsonProperty("station_id")
        private String stationId;
        @JsonProperty("line_id")
        private String lineId;
        private String lat;
        private String lng;

        public String getStationName() {
            return stationName;
        }

        public void setStationName(String stationName) {
            this.stationName = stationName;
        }

        public String getLineName() {
            return lineName;
        }

        public void setLineName(String lineName) {
            this.lineName = lineName;
        }

        public String getStationId() {
            return stationId;
        }

        public void setStationId(String stationId) {
            this.stationId = stationId;
        }

        public String getLineId() {
            return lineId;
        }

        public void setLineId(String lineId) {
            this.lineId = lineId;
        }

        public String getLat() {
            return lat;
        }

        public void setLat(String lat) {
            this.lat = lat;
        }

        public String getLng() {
            return lng;
        }

        public void setLng(String lng) {
            this.lng = lng;
        }
    }
    static class Type {
        private String id;
        private String name;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
    static class Salary {
        private Long from;
        private Long to;
        private String currency;
        private boolean gross;

        public Long getFrom() {
            return from;
        }

        public void setFrom(Long from) {
            this.from = from;
        }

        public Long getTo() {
            return to;
        }

        public void setTo(Long to) {
            this.to = to;
        }

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public boolean isGross() {
            return gross;
        }

        public void setGross(boolean gross) {
            this.gross = gross;
        }
    }
    static class Area {
        private Long id;
        private String name;
        private String url;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }


}
