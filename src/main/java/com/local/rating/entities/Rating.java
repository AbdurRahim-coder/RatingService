package com.local.rating.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Rating")
public class Rating {

    @Id
    private String ratingId;
    @JsonProperty("user_id")
    private String userId;
    @JsonProperty("hotel_id")
    private String hotelId;
    private String rating;
    private String feedback;
}
