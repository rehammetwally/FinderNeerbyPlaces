package com.rehammetwally.findernearbyplaces.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class NearbySearch {
    @SerializedName("html_attributions")
    public List<HtmlAttributions> html_attributions;
    @SerializedName("next_page_token")
    public String next_page_token;
    @SerializedName("results")
    public List<Results> results;

    public class Results {
        @SerializedName("business_status")
        public String business_status;
        @SerializedName("geometry")
        public Geometry geometry;
        @SerializedName("icon")
        public String icon;
        @SerializedName("id")
        public String id;
        @SerializedName("name")
        public String name;
        @SerializedName("opening_hours")
        public OpeningHours opening_hours;
        @SerializedName("photos")
        public List<Photos> photos;
        @SerializedName("place_id")
        public String place_id;
        @SerializedName("plus_code")
        public PlusCode plus_code;
        @SerializedName("rating")
        public Double rating;
        @SerializedName("reference")
        public String reference;
        @SerializedName("scope")
        public String scope;
        @SerializedName("types")
        public List<String> types;
        @SerializedName("user_ratings_total")
        public int user_ratings_total;
        @SerializedName("vicinity")
        public String vicinity;

        public class Geometry {
            @SerializedName("location")
            public Location location;
            @SerializedName("viewport")
            public Viewport viewport;

            public class Location {
                @SerializedName("lat")
                public Double lat;
                @SerializedName("lng")
                public Double lng;
            }

            public class Viewport {
                @SerializedName("northeast")
                public Northeast northeast;
                @SerializedName("southwest")
                public Southwest southwest;

                public class Northeast {
                    @SerializedName("lat")
                    public Double lat;
                    @SerializedName("lng")
                    public Double lng;
                }

                public class Southwest {
                    @SerializedName("lat")
                    public Double lat;
                    @SerializedName("lng")
                    public Double lng;
                }
            }
        }

        public class OpeningHours {
            @SerializedName("open_now")
            public Boolean open_now;
        }

        public class Photos {
            @SerializedName("height")
            public int height;
            @SerializedName("width")
            public int width;
            @SerializedName("html_attributions")
            public List<String> html_attributions;
            @SerializedName("photo_reference")
            public String photo_reference;

        }

        public class PlusCode {
            @SerializedName("compound_code")
            public String compound_code;
            @SerializedName("global_code")
            public String global_code;
        }

    }

    public class HtmlAttributions {

    }
}
